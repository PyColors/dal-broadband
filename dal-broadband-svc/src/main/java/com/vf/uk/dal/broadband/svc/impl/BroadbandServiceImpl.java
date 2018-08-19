package com.vf.uk.dal.broadband.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.assembler.BroadbandJourneyServiceAssembler;
import com.vf.uk.dal.broadband.basket.entity.AddProductRequest;
import com.vf.uk.dal.broadband.basket.entity.AppointmentWindow;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.basket.entity.BasketServicePoint;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.basket.entity.ModelPackage;
import com.vf.uk.dal.broadband.basket.entity.PremiseAndServicePoint;
import com.vf.uk.dal.broadband.basket.entity.UpdatePackage;
import com.vf.uk.dal.broadband.cache.repository.entity.BasketInfo;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.cache.repository.entity.InstallationAddress;
import com.vf.uk.dal.broadband.cache.repository.entity.LineDetails;
import com.vf.uk.dal.broadband.cache.repository.entity.LineSpeeds;
import com.vf.uk.dal.broadband.cache.repository.entity.LineTreatment;
import com.vf.uk.dal.broadband.cache.repository.entity.ServicePoint;
import com.vf.uk.dal.broadband.cache.repository.entity.ServieLine;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AppointmentAndAvailabilityDetail;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.Extra;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.Price;
import com.vf.uk.dal.broadband.entity.PriceForBBBundleAndHardware;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.SelectedAvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.Speed;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.exception.BroadbandJourneyCustomException;
import com.vf.uk.dal.broadband.exception.ExceptionMessages;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.CommonUtility;
import com.vf.uk.dal.broadband.validator.BroadbandValidator;
import com.vf.uk.dal.common.configuration.ConfigHelper;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.CustomerTypeEnum;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.ServiceLines;

/**
 * The Class BroadbandServiceImpl.
 *
 * @author Infosys Limited.
 */
@Component("broadbandService")
public class BroadbandServiceImpl implements BroadbandService {

	/** The Constant CATEGORY_PREFERENCE_FTTH. */
	private static final String CATEGORY_PREFERENCE_FTTH = "FTTH";

	/** The Constant CATEGORY_PREFERENCE_FTTC. */
	private static final String CATEGORY_PREFERENCE_FTTC = "FTTC";

	/** The broadband dao. */
	@Autowired
	BroadbandDao broadbandDao;

	/** The mapper. */
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
			String broadbandId, Broadband broadband, String userType) {
		AvailabilityCheckResponse response = new AvailabilityCheckResponse();
		Broadband broadBand = broadband;
		if (broadBand == null) {
			broadBand = new Broadband();
		}
		broadBand.setCategoryPreference(availabilityCheckRequest.getCategory());
		if (StringUtils.isBlank(availabilityCheckRequest.getCategory())) {
			broadBand.setCategoryPreference("FTTC");
			availabilityCheckRequest.setCategory("FTTC");
		}
		if (checkIfAddressAndPhoneNumberAndUserTypeIsSame(availabilityCheckRequest, broadBand, userType)) {
			response = BroadbandJourneyServiceAssembler.createAvailabilityCheckResponse(response, broadBand);
			if (StringUtils.isNotEmpty(broadBand.getBasketId())) {
				ResponseEntity<HttpStatus> methodLinkBuilderLineType = ControllerLinkBuilder
						.methodOn(BroadbandController.class).updateLineTypeInBasket(null, new UpdateLineRequest());
				Link lineTypeLink = ControllerLinkBuilder.linkTo(methodLinkBuilderLineType).withRel("line-type")
						.withType("PUT");
				response.add(CommonUtility.formatLink(lineTypeLink));
			}
		} else {
			GetServiceAvailibilityResponse getServiceAvailabilityResponse = broadbandDao
					.getServiceAvailability(availabilityCheckRequest, userType);
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

				//
				boolean isFTTHPlan = false;
				boolean isPreOrderable = false;
				String installationType = null;
				String productClass = BroadBandConstant.BROADBAND_ENG_FEE_PRODUCTCLASS;
				// For FTTH the product class mentioned is "Fixed Fee:Standard
				// Installation Fee"
				if (StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), CATEGORY_PREFERENCE_FTTH)) {
					isFTTHPlan = true;
					productClass = BroadBandConstant.BROADBAND_STD_INSTALLATION_FEE_PRODUCTCLASS;
				}

				if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
						&& CollectionUtils.isNotEmpty(getServiceAvailabilityResponse.getServiceAvailabilityLine())
						&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
						&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()
								.isEmpty()) {
					for (com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLinesFromRequest : getServiceAvailabilityResponse
							.getServiceAvailabilityLine().get(0).getServiceLines()) {

						if (CollectionUtils.isNotEmpty(serviceLinesFromRequest.getLineTreatment())) {
							for (com.vf.uk.dal.entity.serviceavailability.LineTreatment lineTreatment : serviceLinesFromRequest
									.getLineTreatment()) {
								if (lineTreatment.isPreOrder() != null && lineTreatment.isPreOrder()) {
									isPreOrderable = true;
								}
							}
						}
						if (CollectionUtils.isNotEmpty(serviceLinesFromRequest.getServiceLine())) {
							for (com.vf.uk.dal.entity.serviceavailability.ServiceLine serviceLineFromRequest : serviceLinesFromRequest
									.getServiceLine()) {
								if (serviceLineFromRequest.getMiscReference() != null && StringUtils
										.isNotBlank(serviceLineFromRequest.getMiscReference().getInstallationType())) {
									installationType = serviceLineFromRequest.getMiscReference().getInstallationType();
								}
							}
						}
					}
				}
				List<CommercialProduct> productDetailsList = broadbandDao.getEngineeringVisitFee(productClass,
						isFTTHPlan, installationType, isPreOrderable);
				broadBand = BroadbandJourneyServiceAssembler.createBroadbandInCache(availabilityCheckRequest,
						getServiceAvailabilityResponse, broadbandId, broadBand, productDetailsList, userType);
				broadbandDao.setBroadBandInCache(broadBand);
				response = BroadbandJourneyServiceAssembler.createAvailabilityCheckResponse(response, getServiceAvailabilityResponse,
						availabilityCheckRequest, productDetailsList);
			} else {
				LogHelper.error(this, "Invalid classification code !!!");
				throw new ApplicationException("INVALID_CLASSIFICATION_CODE");
			}
		}
		if (broadBand != null && StringUtils.isNotEmpty(broadBand.getBasketId())) {
			PremiseAndServicePoint premiseAndServicePointRequest = BroadbandJourneyServiceAssembler.setPremiseAndServicePointRequest(
					mapper.map(broadBand.getServicePoint(), BasketServicePoint.class), broadBand,
					availabilityCheckRequest, null);
			broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePointRequest,
					broadBand.getBasketInfo().getPackageId(), broadBand.getBasketId());
		}
		ResponseEntity<List<FlbBundle>> methodLinkBuilderPlan = ControllerLinkBuilder
				.methodOn(BroadbandController.class).getFlbbList(null, null, null, null, null, null, null);
		Link planLink = ControllerLinkBuilder.linkTo(methodLinkBuilderPlan).withRel("flbb-plan").withType("GET");
		AddressInfo methodLinkBuilderGetAddressList = ControllerLinkBuilder.methodOn(BroadbandController.class)
				.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH, BroadBandConstant.BROADBAND_CONSUMER);
		Link getAddressLink = ControllerLinkBuilder.linkTo(methodLinkBuilderGetAddressList).withRel("flbb-gal")
				.withType("GET");
		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.checkAvailabilityForBroadband(availabilityCheckRequest, null, null)).withSelfRel();
		response.add(CommonUtility.formatLink(selfLink));
		response.add(CommonUtility.formatLink(planLink));
		response.add(CommonUtility.formatLink(getAddressLink));
		return response;
	}

	/*
	 * Check if the classification code selected by the user is present by the
	 * GSA or not. If not throws error message.
	 * 
	 */

	/**
	 * Check if address and phone number and user type is same.
	 *
	 * @param availabilityCheckRequest
	 *            the availability check request
	 * @param broadBand
	 *            the broad band
	 * @param userType
	 *            the user type
	 * @return true, if successful
	 */
	private boolean checkIfAddressAndPhoneNumberAndUserTypeIsSame(AvailabilityCheckRequest availabilityCheckRequest,
			Broadband broadBand, String userType) {
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
			if (isAddressSame
					&& ((broadBand.getLineDetails() == null && StringUtils.isEmpty(
							availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber()))
							|| (broadBand.getLineDetails() != null
									&& StringUtils.equalsIgnoreCase(broadBand.getLineDetails().getFlbbNumber(),
											availabilityCheckRequest.getLineRef().getLineIdentification()
													.getFllandlineNumber())))
					&& StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(),
							broadBand.getCategoryPreference())) {
				if (StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTC")) {
					availabilityCheckRequest.setCategory(null);
				}
				if (null != broadBand.getBasketInfo()
						&& !StringUtils.equalsIgnoreCase(userType, broadBand.getBasketInfo().getAccountCategory()))
					return false;
				return true;
			}

		}
		if (StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTC")) {
			availabilityCheckRequest.setCategory(null);
		}
		return false;
	}

	/**
	 * Check if classification code present.
	 *
	 * @param availabilityCheckRequest
	 *            the availability check request
	 * @param getServiceAvailabilityResponse
	 *            the get service availability response
	 * @return true, if successful
	 */
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
		BundleDetails bundleDetails = null;
		List<FlbBundle> listOfFlbBundle = new ArrayList<>();
		String userType = getBundleListSearchCriteria.getUserType();
		String journeyType = getBundleListSearchCriteria.getJourneyType();
		String offerCode = getBundleListSearchCriteria.getOfferCode();
		String bundleClass = getBundleListSearchCriteria.getBundleClass();
		String classificationCode = getBundleListSearchCriteria.getClassificationCode();
		String duration = getBundleListSearchCriteria.getDuration();
		Broadband broadBand = broadbandDao.getBroadbandFromCache(getBundleListSearchCriteria.getBroadbandId());

		if (broadBand == null) {

			Broadband broadband = new com.vf.uk.dal.broadband.cache.repository.entity.Broadband();
			broadband.setBroadBandId(getBundleListSearchCriteria.getBroadbandId());

			BasketInfo basketInfo = new BasketInfo();

			if (StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.BUSINESS.toString()))
				basketInfo.setAccountCategory(CustomerTypeEnum.BUSINESS.toString());
			else
				basketInfo.setAccountCategory(CustomerTypeEnum.CONSUMER.toString());

			broadband.setBasketInfo(basketInfo);
			broadbandDao.setBroadBandInCache(broadband);

		}

		else {
			if (CATEGORY_PREFERENCE_FTTC.equalsIgnoreCase(broadBand.getCategoryPreference())) {
				bundleClass = CATEGORY_PREFERENCE_FTTC;
			}

			BasketInfo basketInfo;
			if (null != broadBand.getBasketInfo())
				basketInfo = broadBand.getBasketInfo();
			else
				basketInfo = new BasketInfo();

			if (!StringUtils.equalsIgnoreCase(basketInfo.getAccountCategory(), userType)) {

				if (StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.BUSINESS.toString()))
					basketInfo.setAccountCategory(CustomerTypeEnum.BUSINESS.toString());
				else
					basketInfo.setAccountCategory(CustomerTypeEnum.CONSUMER.toString());

				broadBand.setBasketInfo(basketInfo);
				broadbandDao.setBroadBandInCache(broadBand);
			}
		}

		String url = CommonUtility.getRequestUrlForFlbb(bundleClass, userType, journeyType, offerCode,
				classificationCode, duration);
		bundleDetails = broadbandDao.getBundleDetailsFromGetBundleListAPI(url);
		// Broadband broadband =
		// broadbandDao.getBroadbandFromCache(broadbandId);
		Set<String> routerProductIds = new HashSet<>();
		DozerBeanMapper beanMapper = new DozerBeanMapper();
		if (bundleDetails != null && CollectionUtils.isNotEmpty(bundleDetails.getPlanList())) {

			bundleDetails.getPlanList().forEach(bundleHeader -> {

				FlbBundle flbBundle = new FlbBundle();
				beanMapper.map(bundleHeader, flbBundle);
				if (bundleHeader.getMiscAttributes() != null
						&& StringUtils.isNotBlank(bundleHeader.getMiscAttributes().getPlanCallOut())) {
					flbBundle.setBundleFeatures(bundleHeader.getMiscAttributes().getPlanCallOut());
				}
				Speed speedForBB = new Speed();
				speedForBB = flbBundle.getSpeed();
				if (StringUtils.equalsIgnoreCase(flbBundle.getClassificationCode(), BroadBandConstant.LINE_WITH_76)) {
					speedForBB.setCommercialSpeed(ConfigHelper.getString(BroadBandConstant.SPEED_76, "55"));
				} else if (StringUtils.equalsIgnoreCase(flbBundle.getClassificationCode(),
						BroadBandConstant.LINE_WITH_38)) {
					speedForBB.setCommercialSpeed(ConfigHelper.getString(BroadBandConstant.SPEED_38, "25"));
				}
				flbBundle.setPreOrderable(false);
				flbBundle.setIsSelected(false);
				if (broadBand != null && broadBand.getLineDetails() != null && StringUtils.equalsIgnoreCase(
						flbBundle.getClassificationCode(), broadBand.getLineDetails().getClassificationCode())) {
					flbBundle.setIsSelected(true);
				}
				flbBundle.setSpeed(speedForBB);
				flbBundle.setIsSpeedLess(false);
				if (broadBand != null && broadBand.getServicePoint() != null
						&& broadBand.getServicePoint().getServiceReference() != null && CollectionUtils
								.isNotEmpty(broadBand.getServicePoint().getServiceReference().getServiceLinesList())) {
					for (com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines serLines : broadBand
							.getServicePoint().getServiceReference().getServiceLinesList()) {
						if (StringUtils.equalsIgnoreCase(serLines.getClassificationCode(),
								flbBundle.getClassificationCode())) {
							List<ServieLine> servieLine = serLines.getServiceLineList();
							for (ServieLine sLine : servieLine) {
								if (!StringUtils.equalsIgnoreCase(sLine.getClassificationCode(), "Line")) {
									LineSpeeds lineSpeeds = sLine.getLineSpeeds();
									if (lineSpeeds != null) {
										if (StringUtils.isNotBlank(lineSpeeds.getMaxDownSpeed())) {
											speedForBB.setMaxSpeed(lineSpeeds.getMaxDownSpeed());
										}
										if (StringUtils.isNotBlank(lineSpeeds.getMinDownSpeed())) {
											speedForBB.setMinSpeed(lineSpeeds.getMinDownSpeed());
										}
										flbBundle.setSpeed(speedForBB);
									}

									if (StringUtils.isNotEmpty(lineSpeeds.getMaxDownSpeed())
											&& StringUtils.isNotEmpty(flbBundle.getSpeed().getCommercialSpeed())
											&& (Double.parseDouble(lineSpeeds.getMaxDownSpeed()) / 1000.0) < Double
													.parseDouble(flbBundle.getSpeed().getCommercialSpeed())) {
										flbBundle.setIsSpeedLess(true);
										break;
									}
								}
							}

							if (CollectionUtils.isNotEmpty(serLines.getLineTreatmentList())) {
								LineTreatment lineTreatment = serLines.getLineTreatmentList().get(0);
								flbBundle.setEarliestAvailableDate(lineTreatment.getEarliestAvailableDate());
								if (lineTreatment.getPreOrder() != null) {
									flbBundle.setPreOrderable(lineTreatment.getPreOrder());
								}
							}
						}
					}
				}

				PriceForBBBundleAndHardware priceBB = new PriceForBBBundleAndHardware();
				priceBB.setBundlePrice(bundleHeader.getPriceInfo().getBundlePrice());
				priceBB.setRouterPrice(bundleHeader.getPriceInfo().getHardwarePrice());
				flbBundle.setPriceInfo(priceBB);
				routerProductIds.add(bundleHeader.getPriceInfo().getHardwarePrice().getHardwareId());
				listOfFlbBundle.add(flbBundle);
				// listOfProducts.add(bundleHeader.getPriceInfo().getHardwarePrice().getHardwareId());
			});
			if (CollectionUtils.isNotEmpty(routerProductIds)) {
				Map<String, List<DeliveryMethods>> deliveryMethodsMap = new HashMap<>();
				routerProductIds.forEach(productId -> {
					deliveryMethodsMap.put(productId, broadbandDao.getDeliveryMethods(productId, true));
				});
				if (CollectionUtils.isNotEmpty(deliveryMethodsMap.keySet())) {
					listOfFlbBundle.forEach(flbBundle -> {
						PriceForBBBundleAndHardware priceBB = flbBundle.getPriceInfo();
						// Setting of Delivery Price
						if (deliveryMethodsMap.containsKey(priceBB.getRouterPrice().getHardwareId())) {
							List<DeliveryMethods> deliveryMeth = deliveryMethodsMap
									.get(priceBB.getRouterPrice().getHardwareId());
							if (CollectionUtils.isNotEmpty(deliveryMeth)) {
								com.vf.uk.dal.broadband.entity.HardwarePrice deliveryPrice = new com.vf.uk.dal.broadband.entity.HardwarePrice();
								if (deliveryMeth.get(0).getPrice() != null) {
									Price dp = new Price();
									beanMapper.map(deliveryMeth.get(0).getPrice(), dp);
									deliveryPrice.setHardwareId(deliveryMeth.get(0).getProductId());
									deliveryPrice.setHardwareName(deliveryMeth.get(0).getDisplayName());
									deliveryPrice.setOneOffPrice(dp);
									priceBB.setDeliveryPrice(deliveryPrice);
								}
							}
						}
						// Setting of EngineerVisitFee Price
						if (broadBand != null && broadBand.getServicePoint() != null
								&& broadBand.getServicePoint().getServiceReference() != null
								&& CollectionUtils.isNotEmpty(
										broadBand.getServicePoint().getServiceReference().getServiceLinesList())) {
							List<LineTreatment> lineTreatmentList = broadBand.getServicePoint().getServiceReference()
									.getServiceLinesList().get(0).getLineTreatmentList();
							if (CollectionUtils.isNotEmpty(lineTreatmentList)) {
								String lineTreatmentType = null;
								if (broadBand.getLineDetails() != null) {
									lineTreatmentType = broadBand.getLineDetails().getLineTreatmentType();
								}
								com.vf.uk.dal.broadband.entity.HardwarePrice engineeringFee = new com.vf.uk.dal.broadband.entity.HardwarePrice();
								if ((lineTreatmentList.size() == 1 && lineTreatmentList.get(0).getIdentification()
										.equalsIgnoreCase(BroadBandConstant.LINE_TREATMENT_TYPE_NEW))
										|| (lineTreatmentList.size() == 2
												&& (StringUtils.isNotBlank(lineTreatmentType) && lineTreatmentType
														.equalsIgnoreCase(BroadBandConstant.LINE_TREATMENT_TYPE_NEW)))
												&& broadBand.getEngineeringVisitCharge() != null) {
									engineeringFee.setHardwareId(
											broadBand.getEngineeringVisitCharge().getEngVisitProductId());
									Price engFee = new Price();
									beanMapper.map(broadBand.getEngineeringVisitCharge(), engFee);
									engineeringFee.setOneOffPrice(engFee);
								} else {
									engineeringFee = null;
								}
								priceBB.setEngineerVisitFees(engineeringFee);
							}
						}
						Price totalPrice = new Price();
						totalPrice.setNet(String.valueOf(getTotalNetPrice(priceBB)));
						totalPrice.setGross(String.valueOf(getTotalGrossPrice(priceBB)));
						totalPrice.setVat(String.valueOf(getTotalVatPrice(priceBB)));
						priceBB.setTotalOneOffCost(totalPrice);
					});
				}
			}

		}
		return listOfFlbBundle;
	}

	@Override
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreferences,
			String userType) {
		AddressInfo addressInfo = broadbandDao.getAddressInfoByPostcodeFromPremise(postCode, categoryPreferences);

		if (StringUtils.equalsIgnoreCase(BroadBandConstant.BROADBAND_BUSINESS, userType)) {
			int noOfAddress = ConfigHelper.getInt(BroadBandConstant.BROADBAND_NO_OF_ADDRESS,
					BroadBandConstant.DEFAULT_BROADBAND_NO_OF_ADDRESS);
			if (addressInfo.getAddresses().size() > noOfAddress) {
				throw new BroadbandJourneyCustomException(ExceptionMessages.BUSINESS_ADDRESS_CODE,
						ExceptionMessages.BUSINESS_ADDRESS, "400");
			}
		}

		ResponseEntity<AvailabilityCheckResponse> methodLinkBuilderLineOptions = ControllerLinkBuilder
				.methodOn(BroadbandController.class)
				.checkAvailabilityForBroadband(new AvailabilityCheckRequest(), null, null);
		Link lineOptionLink = ControllerLinkBuilder.linkTo(methodLinkBuilderLineOptions)
				.withRel("flbb-availablility-checker").withType("POST");
		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH, userType)).withSelfRel().withType("GET");

		ResponseEntity<List<FlbBundle>> methodLinkBuilderPlan = ControllerLinkBuilder
				.methodOn(BroadbandController.class).getFlbbList(null, null, null, null, null, null, null);
		Link planLink = ControllerLinkBuilder.linkTo(methodLinkBuilderPlan).withRel("flbb-plan").withType("GET");
		addressInfo.add(CommonUtility.formatLink(planLink));
		addressInfo.add(CommonUtility.formatLink(selfLink));
		addressInfo.add(CommonUtility.formatLink(lineOptionLink));
		return addressInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#createOrUpdatePackage(com.vf
	 * .uk.dal.broadband.basket.entity.BasketRequest,
	 * com.vf.uk.dal.broadband.cache.repository.entity.Broadband,
	 * java.lang.String)
	 */
	@Override
	public Basket createOrUpdatePackage(BasketRequest basketRequest, Broadband broadband, String broadbandId) {
		Basket basket = null;
		Broadband broadbandCache = broadband;
		String journeyType = "Acquisition";
		if (broadbandCache != null) {
			String basketId = broadbandCache.getBasketId();
			String journeyId = broadbandCache.getJourneyId();
			// broadband = broadbandDao.getBroadbandFromCache(broadbandId);
			CurrentJourney journey = null;
			if (StringUtils.isNotEmpty(journeyId)) {
				journey = broadbandDao.getJourney(journeyId);
				journeyType = journey.getJourneyData().getName();
			}
			if (StringUtils.isBlank(basketId)) {
				CreateBasketRequest createBasketRequest = BroadbandJourneyServiceAssembler.createBasketRequest(basketRequest,
						broadbandCache, mapper.map(broadbandCache.getServicePoint(), BasketServicePoint.class),
						journey);
				basket = broadbandDao.createBasket(createBasketRequest);
				AddressInfo methodLinkBuilderGetAddressList = ControllerLinkBuilder.methodOn(BroadbandController.class)
						.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH, BroadBandConstant.BROADBAND_CONSUMER);
				Link getAddressLink = ControllerLinkBuilder.linkTo(methodLinkBuilderGetAddressList).withRel("flbb-gal")
						.withType("GET");
				basket.add(CommonUtility.formatLink(getAddressLink));
				broadbandCache.setBasketId(basket.getBasketId());
			} else {
				UpdatePackage updatePackageRequest = BroadbandJourneyServiceAssembler.updateBasketRequest(basketRequest, journey,
						broadbandCache, null);
				ResponseEntity<HttpStatus> methodLinkBuilderLineType = ControllerLinkBuilder
						.methodOn(BroadbandController.class).updateLineTypeInBasket(null, new UpdateLineRequest());
				Link lineTypeLink = ControllerLinkBuilder.linkTo(methodLinkBuilderLineType).withRel("line-type")
						.withType("PUT");
				broadbandDao.updatePackage(updatePackageRequest, basketRequest.getPackageId(), basketId);
				basket = broadbandDao.getBasket(basketId);
				basket.add(CommonUtility.formatLink(lineTypeLink));
			}
			broadbandCache = BroadbandJourneyServiceAssembler.createUpdateCacheRequest(broadbandCache, basketRequest, broadbandId,
					basket);
			broadbandDao.setBroadBandInCache(broadbandCache);
		} else {
			CreateBasketRequest createBasketRequest = BroadbandJourneyServiceAssembler.createBasketRequest(basketRequest, broadbandCache,
					null, null);
			basket = broadbandDao.createBasket(createBasketRequest);
			Broadband broadbandToSave = new Broadband();
			broadbandToSave.setBroadBandId(broadbandId);
			broadbandToSave.setBasketId(basket.getBasketId());
			LineDetails lineDetails = new LineDetails();
			lineDetails.setClassificationCode(basketRequest.getSelectedPackageCode());
			broadbandToSave.setLineDetails(lineDetails);
			BasketInfo basketInfo = new BasketInfo();
			if (basketRequest.getAddBundle() != null
					&& StringUtils.isNotEmpty(basketRequest.getAddBundle().getBundleId())) {
				basketInfo.setPlanId(basketRequest.getAddBundle().getBundleId());
			}
			if (CollectionUtils.isNotEmpty(basket.getPackages())) {
				for (ModelPackage modelPackage : basket.getPackages()) {
					basketInfo.setPlanType(modelPackage.getPlanType());
					if (StringUtils.contains(modelPackage.getPlanType(), "BroadBand")) {
						basketInfo.setPackageId(modelPackage.getPackageId());
						if (modelPackage.getBundle() != null) {
							basketInfo.setPlanProductLineId(modelPackage.getBundle().getPackageLineId());
						}
						if (modelPackage.getHardwares() != null
								&& CollectionUtils.isNotEmpty(modelPackage.getHardwares())) {
							basketInfo.setHardwareProductLineId(modelPackage.getHardwares().get(0).getPackageLineId());
						}
						broadbandToSave.setBasketInfo(basketInfo);
					}
				}
			}
			broadbandDao.setBroadBandInCache(broadbandToSave);

			AddressInfo methodLinkBuilderGetAddressList = ControllerLinkBuilder.methodOn(BroadbandController.class)
					.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH, BroadBandConstant.BROADBAND_CONSUMER);
			Link getAddressLink = ControllerLinkBuilder.linkTo(methodLinkBuilderGetAddressList).withRel("flbb-gal")
					.withType("GET");
			basket.add(CommonUtility.formatLink(getAddressLink));
		}
		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.createOrUpdatePackage(null, new BasketRequest())).withSelfRel();
		basket.add(CommonUtility.formatLink(selfLink));
		ResponseEntity<List<FlbBundle>> methodLinkBuilderPlan = ControllerLinkBuilder
				.methodOn(BroadbandController.class).getFlbbList(null, null, null, journeyType, null, null, null);
		Link planLink = ControllerLinkBuilder.linkTo(methodLinkBuilderPlan).withRel("flbb-plan").withType("GET");
		if (basketRequest.getAddBundle() != null) {
			ResponseEntity<List<RouterDetails>> methodLinkCompatibleRouters = ControllerLinkBuilder
					.methodOn(BroadbandController.class)
					.getCompatibleDevicesForBundle(null, basketRequest.getAddBundle().getBundleId());
			Link routerLink = ControllerLinkBuilder.linkTo(methodLinkCompatibleRouters).withRel("flbb-router")
					.withType("GET");
			basket.add(CommonUtility.formatLink(routerLink));
		}
		basket.add(CommonUtility.formatLink(planLink));
		return basket;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#getBroadbandFromCache(java.
	 * lang.String)
	 */
	@Override
	public Broadband getBroadbandFromCache(String broadbandId) {
		LogHelper.info(getClass(), "Retrieveing Data from BB Cache : " + broadbandId);
		return broadbandDao.getBroadbandFromCache(broadbandId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.svc.BroadbandService#
	 * updateBasketWithLineTreatmentType(java.lang.String,
	 * com.vf.uk.dal.broadband.entity.UpdateLineRequest)
	 */
	@Override
	public void updateBasketWithLineTreatmentType(String broadbandId, UpdateLineRequest updateLineRequest) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		broadband = BroadbandJourneyServiceAssembler.updateBroadbandCache(broadband, updateLineRequest, broadbandId);
		broadbandDao.setBroadBandInCache(broadband);
		PremiseAndServicePoint premiseAndServicePoint = BroadbandJourneyServiceAssembler.setPremiseAndServicePointRequest(
				mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, updateLineRequest);

		broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
				broadband.getBasketInfo().getPackageId(), broadband.getBasketId());

		if ("NEW".equalsIgnoreCase(updateLineRequest.getLineTreatmentType())
				&& broadband.getEngineeringVisitCharge() != null
				&& broadband.getEngineeringVisitCharge().getGross() != null) {
			AddProductRequest addProductRequest = BroadbandJourneyServiceAssembler.addProductRequest(broadband);
			broadbandDao.updateBasketWithServiceId(addProductRequest, broadband.getBasketId(),
					broadband.getBasketInfo().getPackageId());
		}
	}

	/**
	 * Gets the total net price.
	 *
	 * @param priceForBBBundleAndHardware
	 *            the price for BB bundle and hardware
	 * @return the total net price
	 */
	private Double getTotalNetPrice(PriceForBBBundleAndHardware priceForBBBundleAndHardware) {

		Double routerNetPrice = 0.00;
		Double deliveryNetPrice = 0.00;
		Double engineerVisitFeesNet = 0.00;
		if (priceForBBBundleAndHardware.getRouterPrice() != null
				&& priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice() != null
				&& StringUtils.isNotBlank(priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice().getNet())) {
			routerNetPrice = Double.valueOf(priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice().getNet());
		}
		if (priceForBBBundleAndHardware.getDeliveryPrice() != null
				&& priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice() != null
				&& StringUtils.isNotBlank(priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice().getNet())) {
			deliveryNetPrice = Double.valueOf(priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice().getNet());
		}
		if (priceForBBBundleAndHardware.getEngineerVisitFees() != null
				&& priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice() != null && StringUtils
						.isNotBlank(priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice().getNet())) {
			engineerVisitFeesNet = Double
					.valueOf(priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice().getNet());
		}
		return routerNetPrice + deliveryNetPrice + engineerVisitFeesNet;
	}

	/**
	 * Gets the total gross price.
	 *
	 * @param priceForBBBundleAndHardware
	 *            the price for BB bundle and hardware
	 * @return the total gross price
	 */
	private Double getTotalGrossPrice(PriceForBBBundleAndHardware priceForBBBundleAndHardware) {

		Double routerGrossPrice = 0.00;
		Double deliveryGrossPrice = 0.00;
		Double engineerVisitFeesGross = 0.00;
		if (priceForBBBundleAndHardware.getRouterPrice() != null
				&& priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice() != null
				&& StringUtils.isNotBlank(priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice().getGross())) {
			routerGrossPrice = Double.valueOf(priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice().getGross());
		}
		if (priceForBBBundleAndHardware.getDeliveryPrice() != null
				&& priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice() != null
				&& StringUtils.isNotBlank(priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice().getGross())) {
			deliveryGrossPrice = Double
					.valueOf(priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice().getGross());
		}
		if (priceForBBBundleAndHardware.getEngineerVisitFees() != null
				&& priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice() != null && StringUtils
						.isNotBlank(priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice().getGross())) {
			engineerVisitFeesGross = Double
					.valueOf(priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice().getGross());
		}
		return routerGrossPrice + deliveryGrossPrice + engineerVisitFeesGross;
	}

	/**
	 * Gets the total vat price.
	 *
	 * @param priceForBBBundleAndHardware
	 *            the price for BB bundle and hardware
	 * @return the total vat price
	 */
	private Double getTotalVatPrice(PriceForBBBundleAndHardware priceForBBBundleAndHardware) {

		Double routerVatPrice = 0.00;
		Double deliveryVatPrice = 0.00;
		Double engineerVisitFeesVat = 0.00;
		if (priceForBBBundleAndHardware.getRouterPrice() != null
				&& priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice() != null
				&& StringUtils.isNotBlank(priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice().getVat())) {
			routerVatPrice = Double.valueOf(priceForBBBundleAndHardware.getRouterPrice().getOneOffPrice().getVat());
		}
		if (priceForBBBundleAndHardware.getDeliveryPrice() != null
				&& priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice() != null
				&& StringUtils.isNotBlank(priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice().getVat())) {
			deliveryVatPrice = Double.valueOf(priceForBBBundleAndHardware.getDeliveryPrice().getOneOffPrice().getVat());
		}
		if (priceForBBBundleAndHardware.getEngineerVisitFees() != null
				&& priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice() != null && StringUtils
						.isNotBlank(priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice().getVat())) {
			engineerVisitFeesVat = Double
					.valueOf(priceForBBBundleAndHardware.getEngineerVisitFees().getOneOffPrice().getVat());
		}
		return routerVatPrice + deliveryVatPrice + engineerVisitFeesVat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#createAppointment(com.vf.uk.
	 * dal.broadband.entity.CreateAppointmentRequest, java.lang.String)
	 */
	@Override
	public CreateAppointmentResponse createAppointment(CreateAppointmentRequest createAppointmentRequest,
			String broadbandId) {
		CreateAppointmentResponse response = new CreateAppointmentResponse();
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest apptRequest = BroadbandJourneyServiceAssembler
				.createAppointmentRequest(createAppointmentRequest, broadband,
						broadband.getBasketInfo().getAccountCategory());
		CreateAppointment createAppointment = broadbandDao.createAppointment(apptRequest);
		if (createAppointment != null && createAppointment.getAppointmentWindow() != null
				&& StringUtils.isNotEmpty(createAppointment.getAppointmentWindow().getApplicationId())) {
			broadband = BroadbandJourneyServiceAssembler.addAppointmentInfoToBroadbandCache(broadband, createAppointmentRequest,
					createAppointment.getAppointmentWindow().getApplicationId());
			AppointmentWindow appointmentWindowRequest = BroadbandJourneyServiceAssembler.updateBasketWithAppointmentRequest(
					createAppointmentRequest, createAppointment.getAppointmentWindow().getApplicationId());
			broadbandDao.updateBasketWithAppointmentInformation(appointmentWindowRequest,
					broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
			if (BooleanUtils.toBoolean(createAppointmentRequest.getRemoveFromPhoneDirectory())) {
				ServicePoint servicePoint = BroadbandJourneyServiceAssembler.updateBroadbandCacheWithLineDirectoryInfo(broadband);
				broadband.setServicePoint(servicePoint);
				PremiseAndServicePoint premiseAndServicePoint = BroadbandJourneyServiceAssembler.setPremiseAndServicePointRequest(
						mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, null);
				broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
						broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
			}
			broadbandDao.setBroadBandInCache(broadband);
			response.setApplicationId(createAppointment.getAppointmentWindow().getApplicationId());
		} else {
			LogHelper.error(this, "Create Appointment failed!!!");
			throw new BroadbandJourneyCustomException(ExceptionMessages.CREATE_APPOINTMENT_FAILED_CODE,
					ExceptionMessages.CREATE_APPOINTMENT_FAILED, "400");
		}

		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.createAppointmentForFLBB(broadbandId, new CreateAppointmentRequest())).withSelfRel();

		ResponseEntity<?> methodLinkGetAppointment = ControllerLinkBuilder.methodOn(BroadbandController.class)
				.getAppointmentForFLBB(null);
		Link getAppointmentLink = ControllerLinkBuilder.linkTo(methodLinkGetAppointment).withRel("flbb-get-appointment")
				.withType("GET");
		response.add(CommonUtility.formatLink(selfLink));
		response.add(CommonUtility.formatLink(getAppointmentLink));
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#getAppointmentForFLBB(java.
	 * lang.String)
	 */
	@Override
	public GetAppointmentResponse getAppointmentForFLBB(String broadbandId) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		if (broadband.getServicePoint() != null && broadband.getServicePoint().getServiceReference() != null
				&& CollectionUtils
						.isNotEmpty(broadband.getServicePoint().getServiceReference().getServiceLinesList())) {
			for (com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines serviceLine : broadband.getServicePoint()
					.getServiceReference().getServiceLinesList()) {
				List<LineTreatment> lineTreatmentList = serviceLine.getLineTreatmentList();
				if (StringUtils.equalsIgnoreCase(serviceLine.getClassificationCode(),
						broadband.getLineDetails().getClassificationCode())
						&& CollectionUtils.isNotEmpty(lineTreatmentList) && lineTreatmentList.size() == 1
						&& "NEW".equalsIgnoreCase(lineTreatmentList.get(0).getLineTreatmentType())) {

					PremiseAndServicePoint premiseAndServicePoint = BroadbandJourneyServiceAssembler.setPremiseAndServicePointRequest(
							mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, null);
					broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
							broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
					if (broadband.getEngineeringVisitCharge() != null
							&& broadband.getEngineeringVisitCharge().getGross() != null) {
						AddProductRequest addProductRequest = BroadbandJourneyServiceAssembler.addProductRequest(broadband);
						broadbandDao.updateBasketWithServiceId(addProductRequest, broadband.getBasketId(),
								broadband.getBasketInfo().getPackageId());
					}
					LineDetails lineDetails = broadband.getLineDetails();
					if (lineDetails == null) {
						lineDetails = new LineDetails();
					}
					lineDetails.setLineTreatmentType("NEW");
					broadband.setLineDetails(lineDetails);
				}
			}
		}
		broadbandDao.setBroadBandInCache(broadband);
		GetAppointmentRequest request = BroadbandJourneyServiceAssembler.getAppointmentRequest(broadband,
				broadband.getBasketInfo().getAccountCategory());
		GetAppointment getAppointmentResponse = broadbandDao.getAppointmentList(request);
		GetAppointmentResponse getAppointmentRes = BroadbandJourneyServiceAssembler.createGetAppointmentResponse(getAppointmentResponse);
		Link selfLink = ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class).getAppointmentForFLBB(broadbandId))
				.withSelfRel();
		ResponseEntity<?> methodLinkCreateAppointment = ControllerLinkBuilder.methodOn(BroadbandController.class)
				.createAppointmentForFLBB(null, new CreateAppointmentRequest());
		Link createAppointmentLink = ControllerLinkBuilder.linkTo(methodLinkCreateAppointment)
				.withRel("flbb-create-appointment").withType("POST");
		getAppointmentRes.add(CommonUtility.formatLink(selfLink));
		getAppointmentRes.add(CommonUtility.formatLink(createAppointmentLink));
		return getAppointmentRes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#optimizePackageForFLBB(com.
	 * vf.uk.dal.broadband.entity.OptimizePackageRequest, java.lang.String)
	 */
	@Override
	public OptimizePackageResponse optimizePackageForFLBB(OptimizePackageRequest optimizePackageRequest,
			String broadbandId) {
		OptimizePackageResponse response = new OptimizePackageResponse();
		response.setHasPackageOptimized(false);
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		if (broadband == null) {
			broadband = new Broadband();
		}
		broadband.setBroadBandId(broadbandId);
		if (StringUtils.isNotEmpty(optimizePackageRequest.getJourneyId())) {
			broadband.setJourneyId(optimizePackageRequest.getJourneyId());
		}
		if (broadband != null && StringUtils.isNotEmpty(broadband.getBasketId())) {
			CurrentJourney journey = null;
			if (StringUtils.isNotEmpty(broadband.getJourneyId())) {
				journey = broadbandDao.getJourney(broadband.getJourneyId());
			}
			String journeyName = null;
			if (journey != null && journey.getJourneyData() != null
					&& StringUtils.isNotEmpty(journey.getJourneyData().getName())) {
				journeyName = journey.getJourneyData().getName();
			}
			String planId = broadband.getBasketInfo().getPlanId();
			if (!StringUtils.containsIgnoreCase(broadband.getBasketInfo().getPlanType(), CATEGORY_PREFERENCE_FTTH)) {
				BundlePromotionRequest bundlePromotionRequest = BroadbandJourneyServiceAssembler
						.createPromotionRequestToOptimize(broadband, journeyName);
				List<BundlePromotion> bundlePromotions = broadbandDao.getPromotionForBundleList(bundlePromotionRequest);

				for (BundlePromotion bundlePromotion : bundlePromotions) {
					if (StringUtils.equalsIgnoreCase(bundlePromotion.getBundleId(), planId)
							&& CollectionUtils.isNotEmpty(bundlePromotion.getPlanCouplingPromotions())) {
						planId = bundlePromotion.getPlanCouplingPromotions().get(0).getPlancoupleId();
						response.setHasPackageOptimized(true);
						break;

					}
				}
			} else if (StringUtils.containsIgnoreCase(broadband.getBasketInfo().getPlanType(),
					CATEGORY_PREFERENCE_FTTH)) {
				if (StringUtils.isNotEmpty(broadband.getJourneyId())) {
					response.setHasPackageOptimized(true);
				}
			}
			UpdatePackage updatePackageRequest = BroadbandJourneyServiceAssembler.updateBasketRequest(null, journey, broadband, planId);
			broadbandDao.updatePackage(updatePackageRequest, broadband.getBasketInfo().getPackageId(),
					broadband.getBasketId());
			BasketInfo basketInfo = broadband.getBasketInfo();
			if (basketInfo == null) {
				basketInfo = new BasketInfo();
			}
			basketInfo.setPlanId(planId);
			broadband.setBasketInfo(basketInfo);

		}
		broadbandDao.setBroadBandInCache(broadband);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.svc.BroadbandService#
	 * getCompatibleDevicesForBundle(java.lang.String, java.lang.String)
	 */
	@Override
	public List<RouterDetails> getCompatibleDevicesForBundle(String broadbandId, String planId) {
		List<RouterDetails> routerDetailList = new ArrayList<>();
		for (RouterProductDetails routerProductDetails : broadbandDao.getCompatibleDevicesForBundle(planId)) {
			RouterDetails routerDetails = mapper.map(routerProductDetails, RouterDetails.class);
			routerDetails.setIsDefaultDevice(routerProductDetails.isIsDefaultDevice());
			routerDetailList.add(routerDetails);
		}
		return routerDetailList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.svc.BroadbandService#updateBasketWithServiceDate(
	 * java.lang.String, com.vf.uk.dal.broadband.entity.ServiceStartDateRequest)
	 */
	@Override
	public void updateBasketWithServiceDate(String broadbandId, ServiceStartDateRequest serviceStartDateRequest) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);

		if (broadband == null) {
			LogHelper.error(this, "Invalid Broadband Id !!!");
			throw new BroadbandJourneyCustomException(ExceptionMessages.INVALID_BROADBAND_ID_CODE,
					ExceptionMessages.INVALID_BROADBAND_ID, "400");
		}
		if (BroadbandValidator.validateStartDate(serviceStartDateRequest)) {
			serviceStartDateRequest.setStartDateTime(
					BroadbandValidator.convertDateToTimeStamp(serviceStartDateRequest.getStartDateTime()));
			com.vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest serviceStartDateBaketRequest = BroadbandJourneyServiceAssembler
					.createServiceStartDateRequest(serviceStartDateRequest);
			broadbandDao.updateBasketWithServiceDate(serviceStartDateBaketRequest, broadband.getBasketId(),
					broadband.getBasketInfo().getPackageId());

			if (BooleanUtils.toBoolean(serviceStartDateRequest.getRemoveFromPhoneDirectory())) {
				ServicePoint servicePoint = BroadbandJourneyServiceAssembler.updateBroadbandCacheWithLineDirectoryInfo(broadband);
				broadband.setServicePoint(servicePoint);
				PremiseAndServicePoint premiseAndServicePoint = BroadbandJourneyServiceAssembler.setPremiseAndServicePointRequest(
						mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, null);
				broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
						broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
				broadbandDao.setBroadBandInCache(broadband);
			}
		}
	}

	@Override
	public SelectedAvailabilityCheckResponse getSelectedLineOptions(String broadbandId) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		SelectedAvailabilityCheckResponse response = new SelectedAvailabilityCheckResponse();
		if (StringUtils.equalsIgnoreCase(broadband.getCategoryPreference(), CATEGORY_PREFERENCE_FTTH)) {
			broadband.getLineDetails().setLineTreatmentType("NEW");
		}
		if (broadband != null && broadband.getServicePoint() != null) {
			if (broadband.getServicePoint().getLineReference() != null
					&& broadband.getServicePoint().getLineReference().getInstallationAddress() != null) {
				com.vf.uk.dal.broadband.entity.InstallationAddress installationAdd = mapper.map(
						broadband.getServicePoint().getLineReference().getInstallationAddress(),
						com.vf.uk.dal.broadband.entity.InstallationAddress.class);
				response.setInstallationAddress(installationAdd);
			}
			if (broadband.getServicePoint().getServiceReference() != null && CollectionUtils
					.isNotEmpty(broadband.getServicePoint().getServiceReference().getServiceLinesList())) {
				List<com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines> serviceLinesList = broadband
						.getServicePoint().getServiceReference().getServiceLinesList();
				for (com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines serviceLine : serviceLinesList) {
					if (StringUtils.equalsIgnoreCase(serviceLine.getClassificationCode(),
							broadband.getLineDetails().getClassificationCode())) {
						List<LineTreatment> lineTreatments = serviceLine.getLineTreatmentList();
						for (LineTreatment lineTreatment : lineTreatments) {
							if (StringUtils.equalsIgnoreCase(lineTreatment.getLineTreatmentType(),
									broadband.getLineDetails().getLineTreatmentType())) {
								AppointmentAndAvailabilityDetail apptDetal = new AppointmentAndAvailabilityDetail();
								apptDetal.setAppointmentNeeded(lineTreatment.isAppointmentNeeded());
								apptDetal.setEarliestAvailableDate(lineTreatment.getEarliestAvailableDate());
								apptDetal.setLineTreatmentType(lineTreatment.getLineTreatmentType());
								response.setAppointmentAndAvailabilityDetail(apptDetal);
							}
						}

						List<ServieLine> serviceLineListfromCache = serviceLine.getServiceLineList();
						if (CollectionUtils.isNotEmpty(serviceLineListfromCache)) {
							for (ServieLine serviceLineFromCache : serviceLineListfromCache) {
								if (!StringUtils.equalsIgnoreCase(serviceLineFromCache.getClassificationCode(),
										"Line")) {
									com.vf.uk.dal.broadband.entity.LineSpeeds lineSpeed = new com.vf.uk.dal.broadband.entity.LineSpeeds();
									if (StringUtils
											.isNotEmpty(serviceLineFromCache.getLineSpeeds().getAvgDownSpeed())) {
										lineSpeed.setAvgDownSpeed(Double
												.parseDouble(serviceLineFromCache.getLineSpeeds().getAvgDownSpeed()));
									}
									lineSpeed.setBandwidthMeasure(
											serviceLineFromCache.getLineSpeeds().getBandwidthMeasure());
									if (StringUtils
											.isNotEmpty(serviceLineFromCache.getLineSpeeds().getMaxDownSpeed())) {
										lineSpeed.setMaxDownSpeed(Double
												.parseDouble(serviceLineFromCache.getLineSpeeds().getMaxDownSpeed()));
									}
									if (StringUtils.isNotEmpty(serviceLineFromCache.getLineSpeeds().getMaxUpSpeed())) {
										lineSpeed.setMaxUpSpeed(Double
												.parseDouble(serviceLineFromCache.getLineSpeeds().getMaxUpSpeed()));
									}
									if (StringUtils
											.isNotEmpty(serviceLineFromCache.getLineSpeeds().getMinDownSpeed())) {
										lineSpeed.setMinDownSpeed(Double
												.parseDouble(serviceLineFromCache.getLineSpeeds().getMinDownSpeed()));
									}
									if (StringUtils.isNotEmpty(serviceLineFromCache.getLineSpeeds().getMinUpSpeed())) {
										lineSpeed.setMinUpSpeed(Double
												.parseDouble(serviceLineFromCache.getLineSpeeds().getMinUpSpeed()));
									}
									if (StringUtils.isNotEmpty(
											serviceLineFromCache.getLineSpeeds().getMinGuaranteedDownSpeed())) {
										lineSpeed.setMinGuaranteedDownSpeed(Double.parseDouble(
												serviceLineFromCache.getLineSpeeds().getMinGuaranteedDownSpeed()));
									}
									response.setLineSpeeds(lineSpeed);

								}
							}
						}
					}

				}

			}
		}

		return response;
	}

	@Override
	public Extra getCompatibleExtras(String planId) {
		return broadbandDao.getCompatibleExtras(planId);
	}
}
