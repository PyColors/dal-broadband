package com.vf.uk.dal.broadband.svc.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.MediaLink;
import com.vf.uk.dal.broadband.entity.ServiceStartDates;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.CommonUtility;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.broadband.utils.MediaConstants;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.ServiceLines;
import com.vodafone.solrmodels.ProductModel;

@Component("broadbandService")
public class BroadbandServiceImpl implements BroadbandService {

	@Autowired
	BroadbandDao broadbandDao;

	@Override
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest) {
		AvailabilityCheckResponse response = new AvailabilityCheckResponse();
		GetServiceAvailibilityResponse getServiceAvailabilityResponse = broadbandDao
				.getServiceAvailability(availabilityCheckRequest);

		if (getServiceAvailabilityResponse == null) {
			LogHelper.error(this, "Invalid classification code !!!");
			throw new ApplicationException(ExceptionMessages.EMPTY_GSA_RESPONSE);
		} else if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() == null) {
			LogHelper.error(this, "No Service Lines Recieved From TIL !!!");
			throw new ApplicationException(ExceptionMessages.INVALID_SERVICE_LINE);

		}

		boolean isClassificationCodePresent = false;
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()) {
			for (ServiceLines serviceLines : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
					.getServiceLines()) {
				if (availabilityCheckRequest.getClassificationCode() != null && availabilityCheckRequest
						.getClassificationCode().contains(serviceLines.getClassificationCode())) {
					isClassificationCodePresent = true;
					break;
				}
			}
		}
		if (isClassificationCodePresent || availabilityCheckRequest.getClassificationCode() == null
				|| availabilityCheckRequest.getClassificationCode().isEmpty()) {
			FLBBJourneyRequest flbbRequestForJourney = ConverterUtils
					.createFLBBRequestForJourney(availabilityCheckRequest, getServiceAvailabilityResponse);
			if (StringUtils.isNotBlank(availabilityCheckRequest.getJourneyId())) {
				broadbandDao.updateJourneyWithFLBBDetails(availabilityCheckRequest.getJourneyId(),
						flbbRequestForJourney);
				response.setJourneyId(availabilityCheckRequest.getJourneyId());
			} else {
				String journeyId = broadbandDao.createJourneyWithFLBBDetails(flbbRequestForJourney);
				response.setJourneyId(journeyId);
			}
			response = ConverterUtils.createAvailabilityCheckResponse(response, getServiceAvailabilityResponse,
					availabilityCheckRequest);
		} else {
			LogHelper.error(this, "Invalid classification code !!!");
			throw new ApplicationException("INVALID_CLASSIFICATION_CODE");
		}
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.bundle.svc.BundleService#getFlbList(com.vf.uk.dal.bundle.
	 * entity.GetBundleListSearchCriteria)
	 */
	@Override
	public List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria) {
		LogHelper.debug(getClass(), "Enter getBundleListBySearchCriteria");
		BundleDetails bundleDetails;
		List<FlbBundle> listOfFlbBundle = new ArrayList<>();
		String userType = getBundleListSearchCriteria.getUserType();
		String journeyType = getBundleListSearchCriteria.getJourneyType();
		String offerCode = getBundleListSearchCriteria.getOfferCode();
		String bundleClass = getBundleListSearchCriteria.getBundleClass();
		String classificationCode = getBundleListSearchCriteria.getClassificationCode();
		String duration = getBundleListSearchCriteria.getDuration();
		String url = CommonUtility.getRequestUrlForFlbb(bundleClass, userType, journeyType, offerCode,
				classificationCode, duration);
		bundleDetails = broadbandDao.getBundleDetailsFromGetBundleListAPI(url);
		List<String> listOfProducts = new ArrayList<>();

		if (bundleDetails != null) {
			bundleDetails.getPlanList().forEach(bundleHeader -> {
				DozerBeanMapper beanMapper = new DozerBeanMapper();
				FlbBundle flbBundle = new FlbBundle();
				beanMapper.map(bundleHeader, flbBundle);
				listOfFlbBundle.add(flbBundle);
				listOfProducts.add(bundleHeader.getPriceInfo().getHardwarePrice().getHardwareId());
			});

			List<ProductModel> listOfProductModel = broadbandDao
					.getListOfProductModelsBasedOnProductIdList(listOfProducts);
			if (listOfProductModel != null && !listOfProductModel.isEmpty()) {
				listOfProductModel.forEach(productModel -> {
					listOfFlbBundle.forEach(flbBundle -> {
						if (productModel.getProductId()
								.equalsIgnoreCase(flbBundle.getPriceInfo().getHardwarePrice().getHardwareId())) {
							flbBundle.setProductName(productModel.getProductName());
							flbBundle.setProductDescription(productModel.getPreDesc());
							// Merchadising Media
							List<MediaLink> mediaList = new ArrayList<>();
							if (StringUtils.isNotBlank(productModel.getImageURLsThumbsFront())) {
								MediaLink mediaThumbsFrontLink = new MediaLink();
								mediaThumbsFrontLink.setId(MediaConstants.STRING_FOR_IMAGE_THUMBS_FRONT);
								mediaThumbsFrontLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaThumbsFrontLink.setValue(productModel.getImageURLsThumbsFront());
								mediaList.add(mediaThumbsFrontLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsThumbsLeft())) {
								MediaLink mediaThumbsLeftLink = new MediaLink();
								mediaThumbsLeftLink.setId(MediaConstants.STRING_FOR_IMAGE_THUMBS_LEFT);
								mediaThumbsLeftLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaThumbsLeftLink.setValue(productModel.getImageURLsThumbsLeft());
								mediaList.add(mediaThumbsLeftLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsThumbsRight())) {
								MediaLink mediaThumbsRightLink = new MediaLink();
								mediaThumbsRightLink.setId(MediaConstants.STRING_FOR_IMAGE_THUMBS_RIGHT);
								mediaThumbsRightLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaThumbsRightLink.setValue(productModel.getImageURLsThumbsRight());
								mediaList.add(mediaThumbsRightLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsThumbsSide())) {
								MediaLink mediaThumbsSideLink = new MediaLink();
								mediaThumbsSideLink.setId(MediaConstants.STRING_FOR_IMAGE_THUMBS_SIDE);
								mediaThumbsSideLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaThumbsSideLink.setValue(productModel.getImageURLsThumbsSide());
								mediaList.add(mediaThumbsSideLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsFullLeft())) {
								MediaLink mediaFullLeftLink = new MediaLink();
								mediaFullLeftLink.setId(MediaConstants.STRING_FOR_IMAGE_FULL_LEFT);
								mediaFullLeftLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaFullLeftLink.setValue(productModel.getImageURLsFullLeft());
								mediaList.add(mediaFullLeftLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsFullRight())) {
								MediaLink mediaFullRightLink = new MediaLink();
								mediaFullRightLink.setId(MediaConstants.STRING_FOR_IMAGE_FULL_RIGHT);
								mediaFullRightLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaFullRightLink.setValue(productModel.getImageURLsFullRight());
								mediaList.add(mediaFullRightLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsFullSide())) {
								MediaLink mediaFullSideLink = new MediaLink();
								mediaFullSideLink.setId(MediaConstants.STRING_FOR_IMAGE_FULL_SIDE);
								mediaFullSideLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaFullSideLink.setValue(productModel.getImageURLsFullSide());
								mediaList.add(mediaFullSideLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsFullBack())) {
								MediaLink mediaFullBackLink = new MediaLink();
								mediaFullBackLink.setId(MediaConstants.STRING_FOR_IMAGE_FULL_BACK);
								mediaFullBackLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaFullBackLink.setValue(productModel.getImageURLsFullBack());
								mediaList.add(mediaFullBackLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsGrid())) {
								MediaLink mediaGridLink = new MediaLink();
								mediaGridLink.setId(MediaConstants.STRING_FOR_IMAGE_GRID);
								mediaGridLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaGridLink.setValue(productModel.getImageURLsGrid());
								mediaList.add(mediaGridLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsSmall())) {
								MediaLink mediaSmallLink = new MediaLink();
								mediaSmallLink.setId(MediaConstants.STRING_FOR_IMAGE_SMALL);
								mediaSmallLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaSmallLink.setValue(productModel.getImageURLsSmall());
								mediaList.add(mediaSmallLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsSticker())) {
								MediaLink mediaStickerLink = new MediaLink();
								mediaStickerLink.setId(MediaConstants.STRING_FOR_IMAGE_STICKER);
								mediaStickerLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaStickerLink.setValue(productModel.getImageURLsSticker());
								mediaList.add(mediaStickerLink);
							}

							if (StringUtils.isNotBlank(productModel.getImageURLsIcon())) {
								MediaLink mediaIconLink = new MediaLink();
								mediaIconLink.setId(MediaConstants.STRING_FOR_IMAGE_ICON);
								mediaIconLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaIconLink.setValue(productModel.getImageURLsIcon());
								mediaList.add(mediaIconLink);
							}
							if (StringUtils.isNotBlank(productModel.getThreeDSpin())) {
								MediaLink media3DSpinLink = new MediaLink();
								media3DSpinLink.setId(MediaConstants.STRING_FOR_IMAGE_3DSPIN);
								media3DSpinLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								media3DSpinLink.setValue(productModel.getThreeDSpin());
								mediaList.add(media3DSpinLink);
							}

							if (StringUtils.isNotBlank(productModel.getSupport())) {
								MediaLink mediaSupportLink = new MediaLink();
								mediaSupportLink.setId(MediaConstants.STRING_FOR_IMAGE_SUPPORT);
								mediaSupportLink.setType(MediaConstants.STRING_FOR_MEDIA_TYPE);
								mediaSupportLink.setValue(productModel.getSupport());
								mediaList.add(mediaSupportLink);
							}
							flbBundle.setMerchandisingMedia(mediaList);
						}
					});
				});
			}

		}
		return listOfFlbBundle;
	}

	@Override
	public ServiceStartDates getAvailableServiceStartDates(String earliestAvailableStartDate, BigDecimal range)
			throws DateTimeParseException, ParseException {
		LogHelper.info(getClass(),
				"Enter getAvailableServiceStartDates for startDate: " + earliestAvailableStartDate + "range: " + range);
		List<String> datesStringArray = new ArrayList<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy").withZone(ZoneId.of("Europe/London"))
				.withLocale(Locale.UK);
		LocalDate starDate = LocalDate.parse(earliestAvailableStartDate, formatter);
		LocalDate endDate = starDate.plusDays(range.intValue());
		List<LocalDate> holidayList = broadbandDao.getHolidayList(starDate, endDate);
		List<LocalDate> dates = Stream.iterate(starDate, date -> date.plusDays(1))
				.limit(ChronoUnit.DAYS.between(starDate, endDate)).filter((LocalDate a) -> {
					if ((a.getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0)
							|| (a.getDayOfWeek().compareTo(DayOfWeek.SATURDAY) == 0) || (holidayList.contains(a))) {
						return false;
					}
					return true;
				}).collect(Collectors.toList());
		if (CollectionUtils.isNotEmpty(dates)) {
			dates.sort(new Comparator<LocalDate>() {
				@Override
				public int compare(LocalDate d1, LocalDate d2) {
					return d1.compareTo(d2);
				}
			});
			dates.forEach(a -> {
				datesStringArray.add(a.format(formatter));
			});
		}

		ServiceStartDates serv = new ServiceStartDates();
		serv.setDates(datesStringArray);
		return serv;
	}

}
