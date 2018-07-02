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
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.Price;
import com.vf.uk.dal.broadband.entity.PriceForBBBundleAndHardware;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
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
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.CommonUtility;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.broadband.validator.BroadbandValidator;
import com.vf.uk.dal.common.configuration.ConfigHelper;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.ServiceLines;

/**
 * @author Infosys Limited.
 *
 */
@Component("broadbandService")
public class BroadbandServiceImpl implements BroadbandService {

	private static final String CATEGORY_PREFERENCE_FTTH = "FTTH";

	private static final String CATEGORY_PREFERENCE_FTTC = "FTTC";

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
			String broadbandId, Broadband broadband) {
		AvailabilityCheckResponse response = new AvailabilityCheckResponse();
		Broadband broadBand = broadband;
		if (broadBand == null) {
			broadBand = new Broadband();
		}
		broadBand.setCategoryPreference(availabilityCheckRequest.getCategory());
		if (checkIfAddressAndPhoneNumberIsSame(availabilityCheckRequest, broadBand)) {
			response = ConverterUtils.createAvailabilityCheckResponse(response, broadBand);
			if (StringUtils.isNotEmpty(broadBand.getBasketId())) {
				ResponseEntity<HttpStatus> methodLinkBuilderLineType = ControllerLinkBuilder
						.methodOn(BroadbandController.class).updateLineTypeInBasket(null, new UpdateLineRequest());
				Link lineTypeLink = ControllerLinkBuilder.linkTo(methodLinkBuilderLineType).withRel("line-type")
						.withType("PUT");
				response.add(ConverterUtils.formatLink(lineTypeLink));
			}
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

				//
				boolean isFTTHPlan = false;
				boolean isPreOrderable = false;
				String installationType = null;
				String productClass = BroadBandConstant.BROADBAND_ENG_FEE_PRODUCTCLASS;
				// For FTTH the product class mentioned is "Fixed Fee:Standard Installation Fee"
				if (StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTH")) {
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
				List<CommercialProduct> productDetailsList = broadbandDao.getEngineeringVisitFee(
						productClass, isFTTHPlan, installationType, isPreOrderable);
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
					mapper.map(broadBand.getServicePoint(), BasketServicePoint.class), broadBand,
					availabilityCheckRequest, null);
			broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePointRequest,
					broadBand.getBasketInfo().getPackageId(), broadBand.getBasketId());
		}
		ResponseEntity<List<FlbBundle>> methodLinkBuilderPlan = ControllerLinkBuilder
				.methodOn(BroadbandController.class).getFlbbList(null, null, null, null, null, null, null);
		Link planLink = ControllerLinkBuilder.linkTo(methodLinkBuilderPlan).withRel("flbb-plan").withType("GET");
		AddressInfo methodLinkBuilderGetAddressList = ControllerLinkBuilder.methodOn(BroadbandController.class)
				.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH);
		Link getAddressLink = ControllerLinkBuilder.linkTo(methodLinkBuilderGetAddressList).withRel("flbb-gal")
				.withType("GET");
		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.checkAvailabilityForBroadband(availabilityCheckRequest, null)).withSelfRel();
		response.add(ConverterUtils.formatLink(selfLink));
		response.add(ConverterUtils.formatLink(planLink));
		response.add(ConverterUtils.formatLink(getAddressLink));
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
			if (isAddressSame
					&& ((broadBand.getLineDetails() == null && StringUtils.isEmpty(
							availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber()))
							|| (broadBand.getLineDetails() != null
									&& StringUtils.equalsIgnoreCase(broadBand.getLineDetails().getFlbbNumber(),
											availabilityCheckRequest.getLineRef().getLineIdentification()
													.getFllandlineNumber())))
					&& StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(),
							broadBand.getCategoryPreference())) {
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
		BundleDetails bundleDetails = null;
		List<FlbBundle> listOfFlbBundle = new ArrayList<>();
		String userType = getBundleListSearchCriteria.getUserType();
		String journeyType = getBundleListSearchCriteria.getJourneyType();
		String offerCode = getBundleListSearchCriteria.getOfferCode();
		String bundleClass = getBundleListSearchCriteria.getBundleClass();
		String classificationCode = getBundleListSearchCriteria.getClassificationCode();
		String duration = getBundleListSearchCriteria.getDuration();
		Broadband broadBand = broadbandDao.getBroadbandFromCache(getBundleListSearchCriteria.getBroadbandId());
		if (broadBand != null && (StringUtils.isBlank(broadBand.getCategoryPreference())
				|| CATEGORY_PREFERENCE_FTTC.equalsIgnoreCase(broadBand.getCategoryPreference()))) {
			bundleClass = CATEGORY_PREFERENCE_FTTC;
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
								if (lineTreatment.isPreOrder() != null) {
									flbBundle.setPreOrderable(lineTreatment.isPreOrder());
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
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreferences) {
		AddressInfo addressInfo = broadbandDao.getAddressInfoByPostcodeFromPremise(postCode, categoryPreferences);

		ResponseEntity<AvailabilityCheckResponse> methodLinkBuilderLineOptions = ControllerLinkBuilder
				.methodOn(BroadbandController.class)
				.checkAvailabilityForBroadband(new AvailabilityCheckRequest(), null);
		Link lineOptionLink = ControllerLinkBuilder.linkTo(methodLinkBuilderLineOptions)
				.withRel("flbb-availablility-checker").withType("POST");
		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH)).withSelfRel().withType("GET");
		ResponseEntity<List<FlbBundle>> methodLinkBuilderPlan = ControllerLinkBuilder
				.methodOn(BroadbandController.class).getFlbbList(null, null, null, null, null, null, null);
		Link planLink = ControllerLinkBuilder.linkTo(methodLinkBuilderPlan).withRel("flbb-plan").withType("GET");
		addressInfo.add(ConverterUtils.formatLink(planLink));
		addressInfo.add(ConverterUtils.formatLink(selfLink));
		addressInfo.add(ConverterUtils.formatLink(lineOptionLink));
		return addressInfo;
	}

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
				CreateBasketRequest createBasketRequest = ConverterUtils.createBasketRequest(basketRequest,
						broadbandCache, mapper.map(broadbandCache.getServicePoint(), BasketServicePoint.class),
						journey);
				basket = broadbandDao.createBasket(createBasketRequest);
				AddressInfo methodLinkBuilderGetAddressList = ControllerLinkBuilder.methodOn(BroadbandController.class)
						.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH);
				Link getAddressLink = ControllerLinkBuilder.linkTo(methodLinkBuilderGetAddressList).withRel("flbb-gal")
						.withType("GET");
				basket.add(ConverterUtils.formatLink(getAddressLink));
				broadbandCache.setBasketId(basket.getBasketId());
			} else {
				UpdatePackage updatePackageRequest = ConverterUtils.updateBasketRequest(basketRequest, journey,
						broadbandCache, null);
				ResponseEntity<HttpStatus> methodLinkBuilderLineType = ControllerLinkBuilder
						.methodOn(BroadbandController.class).updateLineTypeInBasket(null, new UpdateLineRequest());
				Link lineTypeLink = ControllerLinkBuilder.linkTo(methodLinkBuilderLineType).withRel("line-type")
						.withType("PUT");
				broadbandDao.updatePackage(updatePackageRequest, basketRequest.getPackageId(), basketId);
				basket = broadbandDao.getBasket(basketId);
				basket.add(ConverterUtils.formatLink(lineTypeLink));
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
					.getAddressByPostcode(null, CATEGORY_PREFERENCE_FTTH);
			Link getAddressLink = ControllerLinkBuilder.linkTo(methodLinkBuilderGetAddressList).withRel("flbb-gal")
					.withType("GET");
			basket.add(ConverterUtils.formatLink(getAddressLink));
		}
		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.createOrUpdatePackage(null, new BasketRequest())).withSelfRel();
		basket.add(ConverterUtils.formatLink(selfLink));
		ResponseEntity<List<FlbBundle>> methodLinkBuilderPlan = ControllerLinkBuilder
				.methodOn(BroadbandController.class).getFlbbList(null, null, null, journeyType, null, null, null);
		Link planLink = ControllerLinkBuilder.linkTo(methodLinkBuilderPlan).withRel("flbb-plan").withType("GET");
		if (basketRequest.getAddBundle() != null) {
			ResponseEntity<List<RouterDetails>> methodLinkCompatibleRouters = ControllerLinkBuilder
					.methodOn(BroadbandController.class)
					.getCompatibleDevicesForBundle(null, basketRequest.getAddBundle().getBundleId());
			Link routerLink = ControllerLinkBuilder.linkTo(methodLinkCompatibleRouters).withRel("flbb-router")
					.withType("GET");
			basket.add(ConverterUtils.formatLink(routerLink));
		}
		basket.add(ConverterUtils.formatLink(planLink));
		return basket;
	}

	@Override
	public Broadband getBroadbandFromCache(String broadbandId) {
		LogHelper.info(getClass(), "Retrieveing Data from BB Cache : " + broadbandId);
		return broadbandDao.getBroadbandFromCache(broadbandId);
	}

	@Override
	public void updateBasketWithLineTreatmentType(String broadbandId, UpdateLineRequest updateLineRequest) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		broadband = ConverterUtils.updateBroadbandCache(broadband, updateLineRequest, broadbandId);
		broadbandDao.setBroadBandInCache(broadband);
		PremiseAndServicePoint premiseAndServicePoint = ConverterUtils.setPremiseAndServicePointRequest(
				mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, updateLineRequest);

		broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
				broadband.getBasketInfo().getPackageId(), broadband.getBasketId());

		if ("NEW".equalsIgnoreCase(updateLineRequest.getLineTreatmentType())
				&& broadband.getEngineeringVisitCharge() != null
				&& broadband.getEngineeringVisitCharge().getGross() != null) {
			AddProductRequest addProductRequest = ConverterUtils.addProductRequest(broadband);
			broadbandDao.updateBasketWithServiceId(addProductRequest, broadband.getBasketId(),
					broadband.getBasketInfo().getPackageId());
		}
	}

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

	@Override
	public CreateAppointmentResponse createAppointment(CreateAppointmentRequest createAppointmentRequest,
			String broadbandId) {
		CreateAppointmentResponse response = new CreateAppointmentResponse();
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest apptRequest = ConverterUtils
				.createAppointmentRequest(createAppointmentRequest, broadband);
		CreateAppointment createAppointment = broadbandDao.createAppointment(apptRequest);
		if (createAppointment != null && createAppointment.getAppointmentWindow() != null
				&& StringUtils.isNotEmpty(createAppointment.getAppointmentWindow().getApplicationId())) {
			broadband = ConverterUtils.addAppointmentInfoToBroadbandCache(broadband, createAppointmentRequest,
					createAppointment.getAppointmentWindow().getApplicationId());
			AppointmentWindow appointmentWindowRequest = ConverterUtils.updateBasketWithAppointmentRequest(
					createAppointmentRequest, createAppointment.getAppointmentWindow().getApplicationId());
			broadbandDao.updateBasketWithAppointmentInformation(appointmentWindowRequest,
					broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
			if (BooleanUtils.toBoolean(createAppointmentRequest.getRemoveFromPhoneDirectory())) {
				ServicePoint servicePoint = ConverterUtils.updateBroadbandCacheWithLineDirectoryInfo(broadband);
				broadband.setServicePoint(servicePoint);
				PremiseAndServicePoint premiseAndServicePoint = ConverterUtils.setPremiseAndServicePointRequest(
						mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, null);
				broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
						broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
			}
			broadbandDao.setBroadBandInCache(broadband);
			response.setApplicationId(createAppointment.getAppointmentWindow().getApplicationId());
		} else {
			LogHelper.error(this, "Create Appointment failed!!!");
			throw new ApplicationException(ExceptionMessages.CREATE_APPOINTMENT_FAILED);
		}

		Link selfLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class)
				.createAppointmentForFLBB(broadbandId, new CreateAppointmentRequest())).withSelfRel();

		ResponseEntity<?> methodLinkGetAppointment = ControllerLinkBuilder.methodOn(BroadbandController.class)
				.getAppointmentForFLBB(null);
		Link getAppointmentLink = ControllerLinkBuilder.linkTo(methodLinkGetAppointment).withRel("flbb-get-appointment")
				.withType("GET");
		response.add(ConverterUtils.formatLink(selfLink));
		response.add(ConverterUtils.formatLink(getAppointmentLink));
		return response;
	}

	@Override
	public GetAppointmentResponse getAppointmentForFLBB(String broadbandId) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		GetAppointmentRequest request = ConverterUtils.getAppointmentRequest(broadband);
		GetAppointment getAppointmentResponse = broadbandDao.getAppointmentList(request);
		GetAppointmentResponse getAppointmentRes = ConverterUtils.createGetAppointmentResponse(getAppointmentResponse);
		Link selfLink = ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder.methodOn(BroadbandController.class).getAppointmentForFLBB(broadbandId))
				.withSelfRel();
		ResponseEntity<?> methodLinkCreateAppointment = ControllerLinkBuilder.methodOn(BroadbandController.class)
				.createAppointmentForFLBB(null, new CreateAppointmentRequest());
		Link createAppointmentLink = ControllerLinkBuilder.linkTo(methodLinkCreateAppointment)
				.withRel("flbb-create-appointment").withType("POST");
		getAppointmentRes.add(ConverterUtils.formatLink(selfLink));
		getAppointmentRes.add(ConverterUtils.formatLink(createAppointmentLink));
		return getAppointmentRes;
	}

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
				BundlePromotionRequest bundlePromotionRequest = ConverterUtils
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
			UpdatePackage updatePackageRequest = ConverterUtils.updateBasketRequest(null, journey, broadband, planId);
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

	@Override
	public List<RouterDetails> getCompatibleDevicesForBundle(String broadbandId, String planId) {
		List<RouterDetails> routerDetailList = new ArrayList<>();
		for (RouterProductDetails routerProductDetails : broadbandDao.getCompatibleDevicesForBundle(planId)) {
			RouterDetails routerDetails = new RouterDetails();
			routerDetails = mapper.map(routerProductDetails, RouterDetails.class);
			routerDetails.setIsDefaultDevice(routerProductDetails.isIsDefaultDevice());
			routerDetailList.add(routerDetails);
		}
		return routerDetailList;
	}

	@Override
	public void updateBasketWithServiceDate(String broadbandId, ServiceStartDateRequest serviceStartDateRequest) {
		Broadband broadband = broadbandDao.getBroadbandFromCache(broadbandId);
		if (broadband != null) {
			if (BroadbandValidator.validateStartDate(serviceStartDateRequest)) {
				serviceStartDateRequest.setStartDateTime(
						BroadbandValidator.convertDateToTimeStamp(serviceStartDateRequest.getStartDateTime()));
				com.vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest serviceStartDateBaketRequest = ConverterUtils
						.createServiceStartDateRequest(serviceStartDateRequest);
				broadbandDao.updateBasketWithServiceDate(serviceStartDateBaketRequest, broadband.getBasketId(),
						broadband.getBasketInfo().getPackageId());

				if (BooleanUtils.toBoolean(serviceStartDateRequest.getRemoveFromPhoneDirectory())) {
					ServicePoint servicePoint = ConverterUtils.updateBroadbandCacheWithLineDirectoryInfo(broadband);
					broadband.setServicePoint(servicePoint);
					PremiseAndServicePoint premiseAndServicePoint = ConverterUtils.setPremiseAndServicePointRequest(
							mapper.map(broadband.getServicePoint(), BasketServicePoint.class), broadband, null, null);
					broadbandDao.updateBasketWithPremiseAndServicePoint(premiseAndServicePoint,
							broadband.getBasketInfo().getPackageId(), broadband.getBasketId());
					broadbandDao.setBroadBandInCache(broadband);
				}
			}

		} else {
			LogHelper.error(this, "Invalid Broadband Id !!!");
			throw new ApplicationException(ExceptionMessages.INVALID_BROADBAND_ID);
		}
	}
}
