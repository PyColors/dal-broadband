package com.vf.uk.dal.broadband.svc.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.basket.entity.ModelPackage;
import com.vf.uk.dal.broadband.basket.entity.PremiseAndServicePoint;
import com.vf.uk.dal.broadband.basket.entity.ServicePoint;
import com.vf.uk.dal.broadband.basket.entity.UpdatePackage;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.cache.repository.entity.InstallationAddress;
import com.vf.uk.dal.broadband.cache.repository.entity.LineDetails;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.ProductDetails;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.ServiceLines;

/**
 * @author Infosys Limited.
 *
 */
@Component("broadbandService")
public class BroadbandServiceImpl implements BroadbandService {

	@Autowired
	BroadbandDao broadbandDao;

	@Autowired
	DozerBeanMapper mapper;

	/*
	 * This methods calls Get Service Availability MS, if the response and
	 * successful, then creates or update the journey with the service point
	 * information for anonymous or logged in customer respectively, post which
	 * creates a very sleek response and present to FE. (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.svc.BroadbandService#
	 * checkAvailabilityForBroadband(com.vf.uk.dal.broadband.entity.
	 * AvailabilityCheckRequest)
	 */
	@Override
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest,
			String broadbandId, String acceptVersion) {
		AvailabilityCheckResponse response = new AvailabilityCheckResponse();
		Broadband broadBand = broadbandDao.getBroadbandFromCache(broadbandId);
		if (broadBand != null && checkIfAddressAndPhoneNumberIsSame(availabilityCheckRequest, broadBand)) {
			response = ConverterUtils.createAvailabilityCheckResponse(response, broadBand);
		} else {
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
			boolean isClassificationCodePresent = checkIfClassificationCodePresent(availabilityCheckRequest,
					getServiceAvailabilityResponse);
			if (isClassificationCodePresent || availabilityCheckRequest.getClassificationCode() == null
					|| availabilityCheckRequest.getClassificationCode().isEmpty()) {

				List<ProductDetails> productDetailsList = broadbandDao.getEngineeringVisitFee(acceptVersion);

				broadBand = ConverterUtils.createBroadbandInCache(availabilityCheckRequest,
						getServiceAvailabilityResponse, broadbandId, broadBand, productDetailsList);
				broadbandDao.setBroadBandInCache(broadBand);
				response = ConverterUtils.createAvailabilityCheckResponse(response, getServiceAvailabilityResponse,
						availabilityCheckRequest, productDetailsList);
			} else {
				LogHelper.error(this, "Invalid classification code !!!");
				throw new ApplicationException("INVALID_CLASSIFICATION_CODE");
			}
		}
		if (broadBand != null && StringUtils.isNotEmpty(broadBand.getBasketId())) {
			PremiseAndServicePoint premiseAndServicePointRequest = ConverterUtils.setPremiseAndServicePointRequest(
					mapper.map(broadBand.getServicePoint(), ServicePoint.class), broadBand, availabilityCheckRequest);
			broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePointRequest, broadBand.getPackageId(),
					broadBand.getBasketId());
		}

		return response;
	}

	/*
	 * Check if the classification code selected by the user is present by the
	 * GSA or not. If not throws error message.
	 * 
	 */

	private boolean checkIfAddressAndPhoneNumberIsSame(AvailabilityCheckRequest availabilityCheckRequest,
			Broadband broadBand) {
		if (broadBand.getServicePoint() != null && broadBand.getServicePoint().getLineReference() != null) {
			InstallationAddress installationAddress = broadBand.getServicePoint().getLineReference()
					.getInstallationAddress();
			boolean isAddressSame = false;
			if ((StringUtils.equalsIgnoreCase(installationAddress.getPostCode().replaceAll("\\s", ""),
					availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getPostCode()
							.replaceAll("\\s", "")))
					&& ((StringUtils
							.isNotEmpty(availabilityCheckRequest.getLineRef().getLineIdentification()
									.getInstallationAddress().getFlatNumber())
							&& StringUtils.equalsIgnoreCase(installationAddress.getFlatNumber(),
									availabilityCheckRequest.getLineRef().getLineIdentification()
											.getInstallationAddress().getFlatNumber())
							|| (StringUtils
									.isNotEmpty(availabilityCheckRequest.getLineRef().getLineIdentification()
											.getInstallationAddress().getHouseNumber())
									&& StringUtils.equalsIgnoreCase(installationAddress.getHouseNumber(),
											availabilityCheckRequest.getLineRef().getLineIdentification()
													.getInstallationAddress().getHouseNumber()))
							|| (StringUtils
									.isNotEmpty(availabilityCheckRequest.getLineRef().getLineIdentification()
											.getInstallationAddress().getHouseName())
									&& StringUtils.equalsIgnoreCase(installationAddress.getHouseName(),
											availabilityCheckRequest.getLineRef().getLineIdentification()
													.getInstallationAddress().getHouseName()))))) {

				isAddressSame = true;
			}
			if (isAddressSame && ((broadBand.getLineDetails() == null && StringUtils
					.isEmpty(availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber()))
					|| (broadBand.getLineDetails() != null && StringUtils.equalsIgnoreCase(
							broadBand.getLineDetails().getFlbbNumber(),
							availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber())))) {
				return true;
			}

		}
		return false;
	}

	private boolean checkIfClassificationCodePresent(AvailabilityCheckRequest availabilityCheckRequest,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse) {
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
		return isClassificationCodePresent;
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
		BundleDetails bundleDetails = new BundleDetails();
		List<FlbBundle> listOfFlbBundle = new ArrayList<>();
		String userType = getBundleListSearchCriteria.getUserType();
		String journeyType = getBundleListSearchCriteria.getJourneyType();
		String offerCode = getBundleListSearchCriteria.getOfferCode();
		String bundleClass = getBundleListSearchCriteria.getBundleClass();
		String classificationCode = getBundleListSearchCriteria.getClassificationCode();
		String duration = getBundleListSearchCriteria.getDuration();
		String url = "";
//		String url = CommonUtility.getRequestUrlForFlbb(bundleClass, userType, journeyType, offerCode,
//				classificationCode, duration);
		//bundleDetails = broadbandDao.getBundleDetailsFromGetBundleListAPI(url);
		List<String> listOfProducts = new ArrayList<>();

		//if (bundleDetails != null) {
			bundleDetails.getPlanList().forEach(bundleHeader -> {
				DozerBeanMapper beanMapper = new DozerBeanMapper();
				FlbBundle flbBundle = new FlbBundle();
				beanMapper.map(bundleHeader, flbBundle);
				listOfFlbBundle.add(flbBundle);
				//listOfProducts.add(bundleHeader.getPriceInfo().getHardwarePrice().getHardwareId());
			});

			/*List<ProductModel> listOfProductModel = broadbandDao
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
			}*/

		//}
		return listOfFlbBundle;
	}

	/*
	 * 
	 * Logic to get the x working days from the date the service is available
	 * for the customer. (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.svc.BroadbandService#
	 * getAvailableServiceStartDates(java.lang.String, java.math.BigDecimal)
	 */

	/*
	 * @Override public ServiceStartDates getAvailableServiceStartDates(String
	 * earliestAvailableStartDate, BigDecimal range) throws
	 * DateTimeParseException, ParseException { LogHelper.info(getClass(),
	 * "Enter getAvailableServiceStartDates for startDate: " +
	 * earliestAvailableStartDate + "range: " + range); List<String>
	 * datesStringArray = new ArrayList<>(); DateTimeFormatter formatter =
	 * DateTimeFormatter.ofPattern("dd-MMM-yyyy").withZone(ZoneId.of(
	 * "Europe/London")) .withLocale(Locale.UK); LocalDate starDate =
	 * LocalDate.parse(earliestAvailableStartDate, formatter); List<LocalDate>
	 * dates = Stream.iterate(starDate, date ->
	 * date.plusDays(1)).filter((LocalDate a) -> { if
	 * ((a.getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0) ||
	 * (a.getDayOfWeek().compareTo(DayOfWeek.SATURDAY) == 0)) { return false; }
	 * return true; }).limit(range.longValue()).collect(Collectors.toList()); if
	 * (CollectionUtils.isNotEmpty(dates)) { dates.sort(new
	 * Comparator<LocalDate>() {
	 * 
	 * @Override public int compare(LocalDate d1, LocalDate d2) { return
	 * d1.compareTo(d2); } }); dates.forEach(a -> {
	 * datesStringArray.add(a.format(formatter)); }); }
	 * 
	 * ServiceStartDates serv = new ServiceStartDates();
	 * serv.setDates(datesStringArray); return serv; }
	 * 
	 * 
	 * This method calls create appointment MS. Upon succesful response update
	 * the journey and basket with the appointment information.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#createAppointmentForFLBB(com
	 * .vf.uk.dal.broadband.entity.CreateAppointmentRequest)
	 * 
	 * 
	 * @Override public CreateAppointmentResponse
	 * createAppointmentForFLBB(CreateAppointmentRequest
	 * createAppointmentRequest,String journeyId) { CreateAppointmentResponse
	 * response = new CreateAppointmentResponse(); Broadband broadBand =
	 * broadbandDao.getBroadbandFromCache(journeyId);
	 * com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest
	 * createAppointmentReq = ConverterUtils
	 * .createAppointmentRequest(createAppointmentRequest, broadBand);
	 * CreateAppointment createAppointment =
	 * broadbandDao.createAppointment(createAppointmentReq); if
	 * (createAppointment != null && createAppointment.getAppointmentWindow() !=
	 * null && StringUtils.isNotEmpty(createAppointment.getAppointmentWindow().
	 * getApplicationId())) { broadBand =
	 * ConverterUtils.addAppointmentInfoToBroadbandCache(broadBand,
	 * createAppointmentRequest,createAppointment.getAppointmentWindow().
	 * getApplicationId()); broadbandDao.setBroadBandInCache(broadBand);
	 * AppointmentWindow appointmentWindowRequest =
	 * ConverterUtils.updateBasketWithAppointmentRequest(
	 * createAppointmentRequest);
	 * broadbandDao.updateBasketWithAppointmentInformation(
	 * appointmentWindowRequest);
	 * response.setApplicationId(createAppointment.getAppointmentWindow().
	 * getApplicationId()); } else { LogHelper.error(this,
	 * "Create Appointment failed!!!"); throw new
	 * ApplicationException(ExceptionMessages.CREATE_APPOINTMENT_FAILED); }
	 * return response; }
	 */

	@Override
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode) {
		return broadbandDao.getAddressInfoByPostcodeFromPremise(postCode);
	}

	@Override
	public Basket createOrUpdatePackage(BasketRequest basketRequest, Broadband broadband, String broadbandId) {
		Basket basket = null;
		Broadband broadbandCache = broadband;
		if (broadbandCache != null) {
			String basketId = broadbandCache.getBasketId();
			String journeyId = broadbandCache.getJourneyId();
			// broadband = broadbandDao.getBroadbandFromCache(broadbandId);
			CurrentJourney journey = null;
			if (StringUtils.isNotEmpty(journeyId)) {
				journey = broadbandDao.getJourney(journeyId);
			}
			if (StringUtils.isBlank(basketId)) {
				CreateBasketRequest createBasketRequest = ConverterUtils.createBasketRequest(basketRequest,
						broadbandCache, mapper.map(broadbandCache.getServicePoint(), ServicePoint.class), journey);
				basket = broadbandDao.createBasket(createBasketRequest);
				broadbandCache.setBasketId(basket.getBasketId());
			} else {
				UpdatePackage updatePackageRequest = ConverterUtils.updateBasketRequest(basketRequest, journey,
						broadbandCache);
				broadbandDao.updatePackage(updatePackageRequest, basketRequest.getPackageId(), basketId);
				basket = broadbandDao.getBasket(basketId);
			}
			broadbandCache = ConverterUtils.createUpdateCacheRequest(broadbandCache, basketRequest, broadbandId,
					basket);

			broadbandDao.setBroadBandInCache(broadbandCache);
		} else {
			CreateBasketRequest createBasketRequest = ConverterUtils.createBasketRequest(basketRequest, broadbandCache,
					null, null);
			basket = broadbandDao.createBasket(createBasketRequest);
			Broadband broadbandToSave = new Broadband();
			broadbandToSave.setBroadBandId(broadbandId);
			broadbandToSave.setBasketId(basket.getBasketId());
			LineDetails lineDetails = new LineDetails();
			lineDetails.setClassificationCode(basketRequest.getSelectedPackageCode());
			broadbandToSave.setLineDetails(lineDetails);
			if (CollectionUtils.isNotEmpty(basket.getPackages())) {
				for (ModelPackage modelPackage : basket.getPackages()) {
					if (StringUtils.equalsIgnoreCase(modelPackage.getPlanType(), "Broadband")) {
						broadbandToSave.setPackageId(modelPackage.getPackageId());
					}
				}
			}
			broadbandDao.setBroadBandInCache(broadbandToSave);
		}
		return basket;
	}

	@Override
	public Broadband getBroadbandFromCache(String broadbandId) {
		LogHelper.info(getClass(), "Retrieveing Data from BB Cache : " + broadbandId);
		return broadbandDao.getBroadbandFromCache(broadbandId);
	}
}
