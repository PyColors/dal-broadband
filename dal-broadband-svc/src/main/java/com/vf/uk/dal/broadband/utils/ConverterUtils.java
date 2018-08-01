package com.vf.uk.dal.broadband.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.hateoas.Link;

import com.vf.uk.dal.broadband.basket.entity.AddPackage;
import com.vf.uk.dal.broadband.basket.entity.AddProduct;
import com.vf.uk.dal.broadband.basket.entity.AddProductRequest;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.basket.entity.ModelPackage;
import com.vf.uk.dal.broadband.basket.entity.PremiseAndServicePoint;
import com.vf.uk.dal.broadband.basket.entity.Product;
import com.vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.basket.entity.UpdateBundle;
import com.vf.uk.dal.broadband.basket.entity.UpdateDevice;
import com.vf.uk.dal.broadband.basket.entity.UpdatePackage;
import com.vf.uk.dal.broadband.basket.entity.UpdateService;
import com.vf.uk.dal.broadband.cache.repository.entity.AccessLine;
import com.vf.uk.dal.broadband.cache.repository.entity.AvailableServices;
import com.vf.uk.dal.broadband.cache.repository.entity.BasketInfo;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.cache.repository.entity.BroadbandSalesOrderAppointment;
import com.vf.uk.dal.broadband.cache.repository.entity.Identification;
import com.vf.uk.dal.broadband.cache.repository.entity.InstallationAddress;
import com.vf.uk.dal.broadband.cache.repository.entity.ItemReference;
import com.vf.uk.dal.broadband.cache.repository.entity.LineDetails;
import com.vf.uk.dal.broadband.cache.repository.entity.LineDirectory;
import com.vf.uk.dal.broadband.cache.repository.entity.LineLocator;
import com.vf.uk.dal.broadband.cache.repository.entity.LineReference;
import com.vf.uk.dal.broadband.cache.repository.entity.LineSettings;
import com.vf.uk.dal.broadband.cache.repository.entity.LineSpeeds;
import com.vf.uk.dal.broadband.cache.repository.entity.LineStatus;
import com.vf.uk.dal.broadband.cache.repository.entity.LineTreatment;
import com.vf.uk.dal.broadband.cache.repository.entity.MiscReference;
import com.vf.uk.dal.broadband.cache.repository.entity.PendingOrder;
import com.vf.uk.dal.broadband.cache.repository.entity.PriceForHardware;
import com.vf.uk.dal.broadband.cache.repository.entity.ServiceLineTreatment;
import com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines;
import com.vf.uk.dal.broadband.cache.repository.entity.ServicePoint;
import com.vf.uk.dal.broadband.cache.repository.entity.ServiceReference;
import com.vf.uk.dal.broadband.cache.repository.entity.ServieLine;
import com.vf.uk.dal.broadband.cache.repository.entity.SiteNote;
import com.vf.uk.dal.broadband.entity.AppointmentAndAvailabilityDetail;
import com.vf.uk.dal.broadband.entity.AppointmentList;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.ErrorInfo;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.appointment.Address;
import com.vf.uk.dal.broadband.entity.appointment.AddressDetails;
import com.vf.uk.dal.broadband.entity.appointment.AppointmentDetails;
import com.vf.uk.dal.broadband.entity.appointment.AppointmentWindow;
import com.vf.uk.dal.broadband.entity.appointment.AppointmentWindowList;
import com.vf.uk.dal.broadband.entity.appointment.CustomerPartyReference;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest;
import com.vf.uk.dal.broadband.entity.appointment.Organisation;
import com.vf.uk.dal.broadband.entity.appointment.ServiceRequest;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.CustomerTypeEnum;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.MoveTypeCodeEnum;

/**
 * The Class ConverterUtils.
 *
 * @author Infosys limited
 */
public class ConverterUtils {

	/**
	 * Instantiates a new converter utils.
	 */
	private ConverterUtils() {
	}

	/**
	 * Creates the get service availibility request.
	 *
	 * @param availabilityCheckRequest the availability check request
	 * @param userType the user type
	 * @return GetServiceAvailibilityRequest
	 */

	public static GetServiceAvailibilityRequest createGetServiceAvailibilityRequest(
			AvailabilityCheckRequest availabilityCheckRequest, String userType) {
		GetServiceAvailibilityRequest request = new GetServiceAvailibilityRequest();
		request.setCategory(availabilityCheckRequest.getCategory());
		request.setLandlineNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber());
		request.setMoveFromPostCode(
				availabilityCheckRequest.getLineRef().getLineIdentification().getMoveFromPostCode());
		if(StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.BUSINESS.toString())){
				request.setCustomerType(
						com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest.CustomerTypeEnum.BUSINESS);
		}else{
			request.setCustomerType(
					com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest.CustomerTypeEnum.INDIVIDUAL);
		}
		com.vf.uk.dal.entity.serviceavailability.InstallationAddress installationAddress = new com.vf.uk.dal.entity.serviceavailability.InstallationAddress();
		installationAddress.setCitySubDivisionName(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getCitySubDivisionName());
		installationAddress.setCountryCode(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCountry());
		installationAddress.setCounty(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCounty());
		installationAddress.setFlatNumber(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getFlatNumber());
		installationAddress.setHouseName(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseName());
		installationAddress.setHouseNumber(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getHouseNumber());
		installationAddress.setLocality(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getLocality());
		installationAddress.setMoveTypeCode(MoveTypeCodeEnum.fromValue(availabilityCheckRequest.getLineRef()
				.getLineIdentification().getInstallationAddress().getMoveTypeCode()));
		installationAddress.setPostCode(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getPostCode());
		installationAddress.setStreetName(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getStreetName());
		installationAddress.setCity(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getTown());
		installationAddress.setAddressReferenceNumber(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getIdentification().getId());
		installationAddress.setAddressType(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getIdentification().getContextId());
		request.setInstallationAddress(installationAddress);
		return request;
	}

	/**
	 * Creates the broadband in cache.
	 *
	 * @param availabilityCheckRequest the availability check request
	 * @param getServiceAvailabilityResponse the get service availability response
	 * @param broadbandId the broadband id
	 * @param broadBand the broad band
	 * @param productDetailsList the product details list
	 * @param userType the user type
	 * @return FLBBJourneyRequest
	 */

	public static Broadband createBroadbandInCache(AvailabilityCheckRequest availabilityCheckRequest,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse, String broadbandId, Broadband broadBand,
			List<CommercialProduct> productDetailsList, String userType) {
		Broadband broadband = broadBand;
		if (broadband == null) {
			broadband = new Broadband();
		}
		broadband.setBroadBandId(broadbandId);

		if (availabilityCheckRequest.getLineRef() != null
				&& availabilityCheckRequest.getLineRef().getLineIdentification() != null && StringUtils.isNotEmpty(
						availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber())) {
			LineDetails lineDetails = new LineDetails();
			lineDetails
					.setFlbbNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber());
			broadband.setLineDetails(lineDetails);
		}

		ServicePoint servicePoint = new ServicePoint();
		LineReference lineRefernce = new LineReference();
		InstallationAddress installationAddress = new InstallationAddress();
		Identification identification = new Identification();
		identification.setId(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress()
				.getIdentification().getId());
		identification.setContextId(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getIdentification().getContextId());
		installationAddress.setIdentification(identification);
		installationAddress.setCitySubDivisionName(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getCitySubDivisionName());
		installationAddress.setCountry(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCountry());
		installationAddress.setCounty(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCounty());
		installationAddress.setFlatNumber(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getFlatNumber());
		installationAddress.setHouseName(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseName());
		installationAddress.setHouseNumber(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getHouseNumber());
		installationAddress.setLocality(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getLocality());
		installationAddress.setMoveTypeCode(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getMoveTypeCode());
		installationAddress.setPostCode(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getPostCode());
		installationAddress.setStreetName(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getStreetName());
		installationAddress.setTown(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getTown());
		lineRefernce.setInstallationAddress(installationAddress);
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference() != null) {
			if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
					.getLineLocator() != null) {
				LineLocator lineLocator = new LineLocator();
				lineLocator.setCableLinkID(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineLocator().getCableLinkID());
				lineLocator.setDistributionPoint(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineLocator().getDistributionPoint());
				lineLocator.setDistrictCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineLocator().getDistrictCode());
				lineLocator.setExchangeCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineLocator().getExchangeCode());
				lineLocator.setExchangeName(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineLocator().getExchangeName());
				lineLocator.setL2SID(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineLocator().getL2SID());
				lineRefernce.setLineLocator(lineLocator);
			}
			if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
					.getLineSettings() != null) {
				LineSettings lineSettings = new LineSettings();
				lineSettings.setInstallationCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineSettings().getInstallationCode());
				lineSettings.setServiceCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineSettings().getServiceCode());
				lineSettings.setTerminationCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineSettings().getTerminationCode());
				lineRefernce.setLineSettings(lineSettings);
			}
			if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
					.getLineStatus() != null) {
				LineStatus lineStatus = new LineStatus();
				lineStatus.setAccessLineStatus(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineStatus().getAccessLineStatus());
				lineStatus.setGnpStatus(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineStatus().getGnPStatus());
				lineStatus.setLineOption(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineStatus().getLineOption());
				lineStatus.setLineType(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineStatus().getLineType());
				lineStatus.setNarrowBandServicesAvailable(getServiceAvailabilityResponse.getServiceAvailabilityLine()
						.get(0).getLineReference().getLineStatus().getNarrowBandServicesAvailable());
				if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
						.getLineStatus().getStandbyPowerRequired() != null) {
					lineStatus.setStandbyPowerRequired(
							String.valueOf(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
									.getLineReference().getLineStatus().getStandbyPowerRequired()));
				}
				lineStatus.setStatusCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineStatus().getStatusCode());
				lineStatus.setTechnology(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getLineStatus().getTechnology());
				if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
						.getLineStatus().getTempStructure() != null) {
					lineStatus
							.setTempStructure(String.valueOf(getServiceAvailabilityResponse.getServiceAvailabilityLine()
									.get(0).getLineReference().getLineStatus().getTempStructure()));
				}
				lineRefernce.setLineStatus(lineStatus);
			}
			if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
					.getAvailableServices() != null) {
				AvailableServices availableService = new AvailableServices();
				availableService.setService(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0)
						.getLineReference().getAvailableServices().getService());
				lineRefernce.setAvailableServices(availableService);
			}
			List<LineDirectory> lineDirectoryList = new ArrayList<>();
			if (getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
					.getLineDirectory() != null
					&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()
							.getLineDirectory().isEmpty()) {
				for (com.vf.uk.dal.entity.serviceavailability.LineDirectory lDirectory : getServiceAvailabilityResponse
						.getServiceAvailabilityLine().get(0).getLineReference().getLineDirectory()) {
					LineDirectory lineDirectory = new LineDirectory();
					if(StringUtils.isNotEmpty(lDirectory.getDirectoryCode())){
						lineDirectory.setDirectoryCode(lDirectory.getDirectoryCode());
					}else if(StringUtils.equals(availabilityCheckRequest.getCategory(), "FTTH")){
						lineDirectory.setDirectoryCode("Ex Directory No Calls Offered");
					}else{
						lineDirectory.setDirectoryCode("ORDINARY");
					}
					lineDirectory.setFeatureCode(lDirectory.getFeatureCode());
					lineDirectory.setLocationCode(lDirectory.getFeatureCode());
					lineDirectoryList.add(lineDirectory);
				}
				lineRefernce.setLineDirectoryList(lineDirectoryList);
			}
			servicePoint.setLineReference(lineRefernce);
		}
		ServiceReference serviceReference = new ServiceReference();
		List<ServiceLines> serviceLinesList = new ArrayList<>();
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()) {
			for (com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLinesFromRequest : getServiceAvailabilityResponse
					.getServiceAvailabilityLine().get(0).getServiceLines()) {
				ServiceLines serviceLinesRequestForJourney = new ServiceLines();
				serviceLinesRequestForJourney.setClassificationCode(serviceLinesFromRequest.getClassificationCode());
				serviceLinesRequestForJourney.setNetworkType(serviceLinesFromRequest.getNetworkType());
				List<LineTreatment> lineTreatmentList = new ArrayList<>();
				if (serviceLinesFromRequest.getLineTreatment() != null
						&& !serviceLinesFromRequest.getLineTreatment().isEmpty()) {
					for (com.vf.uk.dal.entity.serviceavailability.LineTreatment lineTreatment : serviceLinesFromRequest
							.getLineTreatment()) {
						LineTreatment lineTreatmentForJourney = new LineTreatment();
						if (lineTreatment.getLineTreatmentType() != null) {
							lineTreatmentForJourney.setIdentification(lineTreatment.getLineTreatmentType().toString());
						}
						lineTreatmentForJourney.setAppointmentNeeded(lineTreatment.isAppointmentNeeded());
						if (lineTreatment.getConnectionCharge() != null) {
							lineTreatmentForJourney.setConnectionCharge(lineTreatment.getConnectionCharge().toString());
						}
						if (lineTreatment.getLineTreatmentType() != null) {
							lineTreatmentForJourney
									.setLineTreatmentType(lineTreatment.getLineTreatmentType().toString());
						}
						lineTreatmentForJourney.setEarliestAvailableDate(lineTreatment.getEarliestAvailabilityDate());
						lineTreatmentForJourney.setPreOrder(false);
						if (lineTreatment.isPreOrder() != null) {
							lineTreatmentForJourney.setPreOrder(lineTreatment.isPreOrder());
						}
						lineTreatmentForJourney.setRegisterOfInterest(false);
						if (lineTreatment.isRegisterOfInterest() != null) {
							lineTreatmentForJourney.setRegisterOfInterest(lineTreatment.isRegisterOfInterest());
						}
						lineTreatmentList.add(lineTreatmentForJourney);
					}
					for (LineTreatment lineTreatments : lineTreatmentList) {
						if (!StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTH")
								&& !StringUtils.equalsIgnoreCase(lineTreatments.getConnectionCharge().toString(),
										BroadBandConstant.No_CHARGE)
								&& CollectionUtils.isNotEmpty(productDetailsList)) {
							setEngineerVisitPrice(productDetailsList, broadband);
						} else if (StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTH")

								&& CollectionUtils.isNotEmpty(productDetailsList)) {
							setEngineerVisitPrice(productDetailsList, broadband);
						}
					}
					serviceLinesRequestForJourney.setLineTreatmentList(lineTreatmentList);
				}
				List<ServieLine> serviceLineList = new ArrayList<>();
				if (serviceLinesFromRequest.getServiceLine() != null
						&& !serviceLinesFromRequest.getServiceLine().isEmpty()) {
					for (com.vf.uk.dal.entity.serviceavailability.ServiceLine serviceLineFromRequest : serviceLinesFromRequest
							.getServiceLine()) {
						ServieLine serviceLine = new ServieLine();
						ItemReference itemReference = new ItemReference();
						itemReference.setClassificationCode(serviceLineFromRequest.getClassificationCode());
						itemReference.setName(serviceLineFromRequest.getProductName());
						itemReference.setIdentificationId(serviceLineFromRequest.getProductCode());
						serviceLine.setItemReference(itemReference);
						serviceLine.setClassificationCode(serviceLineFromRequest.getClassificationCode());
						if (serviceLineFromRequest.getLineSpeeds() != null) {
							LineSpeeds lineSpeeds = new LineSpeeds();
							if (serviceLineFromRequest.getLineSpeeds().getAvgDownSpeed() != null) {
								lineSpeeds.setAvgDownSpeed(
										String.valueOf(serviceLineFromRequest.getLineSpeeds().getAvgDownSpeed()));
							}
							if (serviceLineFromRequest.getLineSpeeds().getMaxDownSpeed() != null) {
								lineSpeeds.setMaxDownSpeed(
										String.valueOf(serviceLineFromRequest.getLineSpeeds().getMaxDownSpeed()));
							}
							if (serviceLineFromRequest.getLineSpeeds().getMaxUpSpeed() != null) {
								lineSpeeds.setMaxUpSpeed(
										String.valueOf(serviceLineFromRequest.getLineSpeeds().getMaxUpSpeed()));
							}
							if (serviceLineFromRequest.getLineSpeeds().getMinDownSpeed() != null) {
								lineSpeeds.setMinDownSpeed(
										String.valueOf(serviceLineFromRequest.getLineSpeeds().getMinDownSpeed()));
							}
							if (serviceLineFromRequest.getLineSpeeds().getMinGuaranteedDownSpeed() != null) {
								lineSpeeds.setMinGuaranteedDownSpeed(String
										.valueOf(serviceLineFromRequest.getLineSpeeds().getMinGuaranteedDownSpeed()));
							}
							if (serviceLineFromRequest.getLineSpeeds().getMinUpSpeed() != null) {
								lineSpeeds.setMinUpSpeed(
										String.valueOf(serviceLineFromRequest.getLineSpeeds().getMinUpSpeed()));
							}
							lineSpeeds
									.setBandwidthMeasure(serviceLineFromRequest.getLineSpeeds().getBandwidthMeasure());
							serviceLine.setLineSpeeds(lineSpeeds);
						}
						if (serviceLineFromRequest.getMiscReference() != null) {
							MiscReference miscReferenceForJourney = new MiscReference();
							miscReferenceForJourney.setAnfp(serviceLineFromRequest.getMiscReference().getANFP());
							miscReferenceForJourney.setCustomerAgreedDate(
									serviceLineFromRequest.getMiscReference().getCustomerAgreedDate());
							miscReferenceForJourney
									.setLineLength(serviceLineFromRequest.getMiscReference().getLineLength());
							miscReferenceForJourney.setReadyForServiceDate(
									serviceLineFromRequest.getMiscReference().getReadyForServiceDate());
							miscReferenceForJourney.setServiceProviderName(
									serviceLineFromRequest.getMiscReference().getServiceProviderName());
							miscReferenceForJourney.setInstallationType(
									serviceLineFromRequest.getMiscReference().getInstallationType());
							serviceLine.setMiscRefernce(miscReferenceForJourney);
						}
						List<ServiceLineTreatment> serviceLineTreatmentList = new ArrayList<>();
						if (serviceLineFromRequest.getLineTreatment() != null
								&& !serviceLineFromRequest.getLineTreatment().isEmpty()) {
							for (com.vf.uk.dal.entity.serviceavailability.ServiceLineTreatment serviceLineTreatmentReq : serviceLineFromRequest
									.getLineTreatment()) {
								ServiceLineTreatment serviceLineTreatment = new ServiceLineTreatment();
								serviceLineTreatment.setParentIdentification(
										serviceLineTreatmentReq.getLineTreatmentType().toString());
								serviceLineTreatment
										.setCanNumberBeRetained(serviceLineTreatmentReq.getCanNumberBeRetained());
								serviceLineTreatment.setLineInfo(serviceLineTreatmentReq.getLineInfo());
								serviceLineTreatment.setPortInFlag(serviceLineTreatmentReq.getPortInFlag());
								serviceLineTreatment.setServiceAction(serviceLineTreatmentReq.getServiceAction());
								serviceLineTreatment.setServiceType(serviceLineTreatmentReq.getServiceType());
								serviceLineTreatment.setsIM2Value(serviceLineTreatmentReq.getSIM2Value());
								serviceLineTreatment.setVicCode(serviceLineTreatmentReq.getViCCode());
								AccessLine accessLineForJourney = new AccessLine();
								accessLineForJourney.setId(serviceLineTreatmentReq.getAccessLineID());
								serviceLineTreatment.setAccessLine(accessLineForJourney);
								List<PendingOrder> pendingOrderList = new ArrayList<>();
								if (serviceLineTreatmentReq.getPendingOrder() != null
										&& !serviceLineTreatmentReq.getPendingOrder().isEmpty()) {
									for (com.vf.uk.dal.entity.serviceavailability.PendingOrder pendingOrderFromGSA : serviceLineTreatmentReq
											.getPendingOrder()) {
										PendingOrder pendingOrderForJourney = new PendingOrder();
										pendingOrderForJourney
												.setCompletionDate(pendingOrderFromGSA.getCompletionDate());
										if (pendingOrderFromGSA.getThirdPartyFlag() != null) {
											pendingOrderForJourney
													.setThirdPartyFlag(pendingOrderFromGSA.getThirdPartyFlag());
										}
										pendingOrderForJourney.setTypeCode(pendingOrderFromGSA.getTypeCode());
										pendingOrderList.add(pendingOrderForJourney);
									}
									serviceLineTreatment.setPendingOrders(pendingOrderList);
								}
								serviceLineTreatmentList.add(serviceLineTreatment);
								serviceLine.setServiceLineTreatmentList(serviceLineTreatmentList);
							}
						}
						serviceLineList.add(serviceLine);
					}
					serviceLinesRequestForJourney.setServiceLineList(serviceLineList);
				}
				serviceLinesList.add(serviceLinesRequestForJourney);
			}
			serviceReference.setServiceLinesList(serviceLinesList);
			servicePoint.setServiceReference(serviceReference);
		}

		broadband.setServicePoint(servicePoint);
		BasketInfo basketInfo;
		if(null != broadband.getBasketInfo())
			basketInfo = broadband.getBasketInfo();
		else
			basketInfo = new BasketInfo();
		
		if(!StringUtils.equalsIgnoreCase(basketInfo.getAccountCategory(), userType)){
			
			if(StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.BUSINESS.toString()))
				basketInfo.setAccountCategory(CustomerTypeEnum.BUSINESS.toString());
			else
				basketInfo.setAccountCategory(CustomerTypeEnum.CONSUMER.toString());
			broadband.setBasketInfo(basketInfo);
		}
		return broadband;
	}

	/**
	 * Sets the engineer visit price.
	 *
	 * @param productDetailsList the product details list
	 * @param broadband the broadband
	 */
	private static void setEngineerVisitPrice(List<CommercialProduct> productDetailsList, Broadband broadband) {
		PriceForHardware engineeringVisitCharge = new PriceForHardware();

		if (productDetailsList.get(0).getPriceInfo() != null
				&& productDetailsList.get(0).getPriceInfo().getOneOffPrice() != null) {
			if (StringUtils.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getNet())) {
				engineeringVisitCharge
						.setNet(String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getNet()));
			}
			if (StringUtils.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getGross())) {
				engineeringVisitCharge
						.setGross(String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getGross()));
			}
			if (StringUtils.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getVat())) {
				engineeringVisitCharge
						.setVat(String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getVat()));
			}
		}

		if (StringUtils.isNotEmpty(productDetailsList.get(0).getId())) {
			engineeringVisitCharge.setEngVisitProductId(productDetailsList.get(0).getId());
		}
		broadband.setEngineeringVisitCharge(engineeringVisitCharge);
	}

	/**
	 * Creates the availability check response.
	 *
	 * @param response the response
	 * @param getServiceAvailabilityResponse the get service availability response
	 * @param availabilityCheckRequest the availability check request
	 * @param productDetailsList the product details list
	 * @return AvailabilityCheckResponse
	 */

	public static AvailabilityCheckResponse createAvailabilityCheckResponse(AvailabilityCheckResponse response,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse,
			AvailabilityCheckRequest availabilityCheckRequest, List<CommercialProduct> productDetailsList) {
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0)
						.getLineTreatment() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0)
						.getLineTreatment().isEmpty()) {
			List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityList = new ArrayList<>();
			for (com.vf.uk.dal.entity.serviceavailability.LineTreatment lineTreatment : getServiceAvailabilityResponse
					.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getLineTreatment()) {
				AppointmentAndAvailabilityDetail appointmentDetails = new AppointmentAndAvailabilityDetail();
				appointmentDetails.setAppointmentNeeded(lineTreatment.isAppointmentNeeded());
				appointmentDetails.setEarliestAvailableDate(lineTreatment.getEarliestAvailabilityDate());
				if (lineTreatment.getLineTreatmentType() != null) {
					appointmentDetails.setLineTreatmentType(lineTreatment.getLineTreatmentType().toString());
				}
				appointmentAndAvailabilityList.add(appointmentDetails);

				if (!StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTH")
						&& StringUtils.equalsIgnoreCase(lineTreatment.getLineTreatmentType().toString(),
								BroadBandConstant.NEW)
						&& lineTreatment.getConnectionCharge() != null
						&& !StringUtils.equalsIgnoreCase(lineTreatment.getConnectionCharge().toString(),
								BroadBandConstant.No_CHARGE)
						&& productDetailsList != null && !productDetailsList.isEmpty()) {
					com.vf.uk.dal.broadband.entity.Price engineeringVisitCharge = new com.vf.uk.dal.broadband.entity.Price();
					if (productDetailsList.get(0).getPriceInfo() != null
							&& productDetailsList.get(0).getPriceInfo().getOneOffPrice() != null) {
						if (StringUtils
								.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getNet())) {
							engineeringVisitCharge.setNet(
									String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getNet()));
						}
						if (StringUtils
								.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getGross())) {
							engineeringVisitCharge.setGross(String
									.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getGross()));
						}
						if (StringUtils
								.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getVat())) {
							engineeringVisitCharge.setVat(
									String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getVat()));
						}
					}
					response.setEngineeringVisitCharge(engineeringVisitCharge);
				} else if (StringUtils.equalsIgnoreCase(availabilityCheckRequest.getCategory(), "FTTH") && StringUtils
						.equalsIgnoreCase(lineTreatment.getLineTreatmentType().toString(), BroadBandConstant.NEW)
						&& productDetailsList != null && !productDetailsList.isEmpty()) {
					com.vf.uk.dal.broadband.entity.Price engineeringVisitCharge = new com.vf.uk.dal.broadband.entity.Price();
					if (productDetailsList.get(0).getPriceInfo() != null
							&& productDetailsList.get(0).getPriceInfo().getOneOffPrice() != null) {
						if (StringUtils
								.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getNet())) {
							engineeringVisitCharge.setNet(
									String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getNet()));
						}
						if (StringUtils
								.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getGross())) {
							engineeringVisitCharge.setGross(String
									.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getGross()));
						}
						if (StringUtils
								.isNotEmpty(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getVat())) {
							engineeringVisitCharge.setVat(
									String.valueOf(productDetailsList.get(0).getPriceInfo().getOneOffPrice().getVat()));
						}
					}
					response.setEngineeringVisitCharge(engineeringVisitCharge);
				}

			}
			for (AppointmentAndAvailabilityDetail appointmentDetails : appointmentAndAvailabilityList) {
				for (com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLines : getServiceAvailabilityResponse
						.getServiceAvailabilityLine().get(0).getServiceLines()) {
					List<com.vf.uk.dal.entity.serviceavailability.ServiceLine> serviceLineList = serviceLines
							.getServiceLine();
					for (com.vf.uk.dal.entity.serviceavailability.ServiceLine sLine : serviceLineList) {
						if (!StringUtils.equalsIgnoreCase(sLine.getClassificationCode(), "Line")) {
							List<com.vf.uk.dal.entity.serviceavailability.ServiceLineTreatment> serviceLineTreatmentList = sLine
									.getLineTreatment();
							for (com.vf.uk.dal.entity.serviceavailability.ServiceLineTreatment serviceLineTreatment : serviceLineTreatmentList) {
								if (StringUtils.equalsIgnoreCase(appointmentDetails.getLineTreatmentType(),
										serviceLineTreatment.getLineTreatmentType().toString()))
									appointmentDetails.setCanNumberBeRetained(
											String.valueOf(serviceLineTreatment.getCanNumberBeRetained()));
							}
						}
					}
				}
			}
			response.setAppointmentAndAvailabilityDetail(appointmentAndAvailabilityList);
		}
		List<String> classificationCodesList = new ArrayList<>();
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()) {

			List<com.vf.uk.dal.broadband.entity.LineSpeeds> lineSpeedList = new ArrayList<>();
			for (com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLines : getServiceAvailabilityResponse
					.getServiceAvailabilityLine().get(0).getServiceLines()) {

				com.vf.uk.dal.broadband.entity.LineSpeeds lineSpeedForResponse = setLineSpeedForBroadband(serviceLines,
						serviceLines.getClassificationCode());
				lineSpeedList.add(lineSpeedForResponse);
				classificationCodesList.add(serviceLines.getClassificationCode());
			}
			response.setLineSpeeds(lineSpeedList);
		}
		com.vf.uk.dal.broadband.entity.InstallationAddress installationAddress = new com.vf.uk.dal.broadband.entity.InstallationAddress();
		installationAddress.setCitySubDivisionName(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getCitySubDivisionName());
		installationAddress.setCountry(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCountry());
		installationAddress.setCounty(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCounty());
		installationAddress.setFlatNumber(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getFlatNumber());
		installationAddress.setHouseName(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseName());
		installationAddress.setHouseNumber(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getHouseNumber());
		installationAddress.setLocality(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getLocality());
		installationAddress.setMoveTypeCode(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getMoveTypeCode());
		installationAddress.setPostCode(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getPostCode());
		installationAddress.setStreetName(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getStreetName());
		installationAddress.setTown(
				availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getTown());
		com.vf.uk.dal.broadband.entity.Identification identification = new com.vf.uk.dal.broadband.entity.Identification();
		identification.setId(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress()
				.getIdentification().getId());
		identification.setContextId(availabilityCheckRequest.getLineRef().getLineIdentification()
				.getInstallationAddress().getIdentification().getContextId());
		installationAddress.setIdentification(identification);
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()) {
			List<String> classificationCodeList = new ArrayList<>();
			for (com.vf.uk.dal.entity.serviceavailability.ServiceLines servLines : getServiceAvailabilityResponse
					.getServiceAvailabilityLine().get(0).getServiceLines()) {
				classificationCodeList.add(servLines.getClassificationCode());
			}
			response.setClassificationCode(classificationCodeList);
		}
		
		response.setInstallationAddress(installationAddress);
		if (CollectionUtils.isNotEmpty(getServiceAvailabilityResponse.getWarningErrorList())) {
			DozerBeanMapper beanMapper = new DozerBeanMapper();
			List<ErrorInfo> warningMessagesList = new ArrayList<>();
			beanMapper.map(getServiceAvailabilityResponse.getWarningErrorList(), warningMessagesList);
			response.setWarningErrorList(warningMessagesList);
		}
		
		
		return response;
	}

	/**
	 * Sets the line speed for broadband.
	 *
	 * @param serviceLines the service lines
	 * @param packageName the package name
	 * @return LineSpeeds
	 */

	private static com.vf.uk.dal.broadband.entity.LineSpeeds setLineSpeedForBroadband(
			com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLines, String packageName) {
		com.vf.uk.dal.broadband.entity.LineSpeeds lineSpeedForResponse = new com.vf.uk.dal.broadband.entity.LineSpeeds();
		lineSpeedForResponse.setPackageName(packageName);
		for (com.vf.uk.dal.entity.serviceavailability.ServiceLine serviceLine : serviceLines.getServiceLine()) {
			if (!StringUtils.equalsIgnoreCase(serviceLine.getClassificationCode(), "Line")) {
				lineSpeedForResponse.setAvgDownSpeed(serviceLine.getLineSpeeds().getAvgDownSpeed());
				lineSpeedForResponse.setBandwidthMeasure(serviceLine.getLineSpeeds().getBandwidthMeasure());
				lineSpeedForResponse.setMaxDownSpeed(serviceLine.getLineSpeeds().getMaxDownSpeed());
				lineSpeedForResponse.setMaxUpSpeed(serviceLine.getLineSpeeds().getMaxUpSpeed());
				lineSpeedForResponse.setMinDownSpeed(serviceLine.getLineSpeeds().getMinDownSpeed());
				lineSpeedForResponse.setMinGuaranteedDownSpeed(serviceLine.getLineSpeeds().getMinGuaranteedDownSpeed());
				lineSpeedForResponse.setMinUpSpeed(serviceLine.getLineSpeeds().getMinUpSpeed());
			}
		}
		return lineSpeedForResponse;
	}

	/**
	 * Creates the appointment request.
	 *
	 * @param createAppointmentRequest the create appointment request
	 * @param broadBand the broad band
	 * @param userType the user type
	 * @return CreateAppointmentRequest
	 */

	public static com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createAppointmentRequest(
			com.vf.uk.dal.broadband.entity.CreateAppointmentRequest createAppointmentRequest, Broadband broadBand,String userType) {
		com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest request = new com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest();
		if (broadBand.getServicePoint() != null && broadBand.getServicePoint().getLineReference() != null
				&& broadBand.getServicePoint().getLineReference().getInstallationAddress() != null) {
			AppointmentDetails appointmentDetails = new AppointmentDetails();
			AddressDetails addressDetails = new AddressDetails();
			Address address = new Address();
			address.setCityName(broadBand.getServicePoint().getLineReference().getInstallationAddress().getTown());
			address.setCitySubDivisionName(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getCitySubDivisionName());
			address.setCountryCode(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getCountry());
			address.setCountyName(broadBand.getServicePoint().getLineReference().getInstallationAddress().getCounty());
			address.setLineFour(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getFlatNumber());
			address.setLineOne(broadBand.getServicePoint().getLineReference().getInstallationAddress().getStreetName());
			address.setLineThree(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getHouseNumber());
			address.setLineTwo(broadBand.getServicePoint().getLineReference().getInstallationAddress().getLocality());
			address.setBuilding(broadBand.getServicePoint().getLineReference().getInstallationAddress().getHouseName());
			address.setPostalCode(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getPostCode());

			if (broadBand.getServicePoint().getLineReference().getInstallationAddress().getIdentification() != null) {
				address.setIdentificationId(broadBand.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getId());
			}
			addressDetails.setAddress(address);
			Organisation organisation = new Organisation();
			organisation.setName("Vodafone");
			addressDetails.setOrganisation(organisation);
			appointmentDetails.setAddressDetails(addressDetails);
			ServiceRequest serviceRequest = new ServiceRequest();
			serviceRequest.setCategoryCode("BASIC");
			serviceRequest.setClassificationCode("BROADBAND");
			serviceRequest.setTypeCode("INSTALL");
			if (!StringUtils.equalsIgnoreCase(broadBand.getCategoryPreference(), "FTTH")) {
				serviceRequest.setSubClassificationCode(BroadBandConstant.FTTC_SUB_CLASSIFICATIONCODE);
			}
			com.vf.uk.dal.broadband.entity.appointment.ItemReference itemReference = new com.vf.uk.dal.broadband.entity.appointment.ItemReference();
			if (!StringUtils.equalsIgnoreCase(broadBand.getCategoryPreference(), "FTTH")) {
				itemReference.setTypeCode(BroadBandConstant.FTTC_ITEM_REFERENCE_CODE);
			} else {
				itemReference.setTypeCode(broadBand.getCategoryPreference());
			}
			// Added logic to set classificationCode
			setClassificationCodeInAppointmentRequest(broadBand, itemReference);
			serviceRequest.setItemReference(itemReference);
			CustomerPartyReference customerPartyRef = new CustomerPartyReference();
			
			if(StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.BUSINESS.toString()))
				customerPartyRef.setCustomerPartyAccountTypeCode(CustomerTypeEnum.BUSINESS.toString());
			
			if(StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.CONSUMER.toString()))
				customerPartyRef.setCustomerPartyAccountTypeCode(CustomerTypeEnum.INDIVIDUAL.toString());
			
			serviceRequest.setCustomerPartyReference(customerPartyRef);
			appointmentDetails.setServiceRequest(serviceRequest);
			AppointmentWindow appointmentWindow = new AppointmentWindow();
			String startTimePeriod = createAppointmentRequest.getStartTimePeriod();
			if (StringUtils.isNotBlank(createAppointmentRequest.getStartTimePeriod())) {
				startTimePeriod = getFormattedDate(createAppointmentRequest.getStartTimePeriod(),
						BroadBandConstant.DATE_PATTERN2, BroadBandConstant.DATE_PATTERN1);
			}
			appointmentWindow.setStartTimePeriod(startTimePeriod);
			appointmentWindow.setTimeSlot(createAppointmentRequest.getTimeSlot());
			appointmentWindow.setOperationalPreferenceCode("STANDARD");
			appointmentWindow.setStartTime(createAppointmentRequest.getStartTime());
			appointmentWindow.setEndTime(createAppointmentRequest.getEndTime());
			appointmentDetails.setAppointmentWindow(appointmentWindow);
			request.setAppointmentDetails(appointmentDetails);
			request.setExisting(false);
		}
		return request;
	}

	/**
	 * Sets the classification code in appointment request.
	 *
	 * @param broadBand the broad band
	 * @param itemReference the item reference
	 */
	private static void setClassificationCodeInAppointmentRequest(Broadband broadBand,
			com.vf.uk.dal.broadband.entity.appointment.ItemReference itemReference) {
		if (broadBand.getServicePoint() != null && broadBand.getServicePoint().getServiceReference() != null
				&& CollectionUtils
						.isNotEmpty(broadBand.getServicePoint().getServiceReference().getServiceLinesList())) {
			List<com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines> serviceLinesList = broadBand
					.getServicePoint().getServiceReference().getServiceLinesList();
			for (com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines serviceLines : serviceLinesList) {
				if (StringUtils.equalsIgnoreCase(broadBand.getLineDetails().getClassificationCode(),
						serviceLines.getClassificationCode())) {
					for (com.vf.uk.dal.broadband.cache.repository.entity.ServieLine servLine : serviceLines
							.getServiceLineList()) {
						if (!(StringUtils.equalsIgnoreCase(BroadBandConstant.LINE, servLine.getClassificationCode())
								|| StringUtils.equalsIgnoreCase("ADSL", servLine.getClassificationCode()))) {
							itemReference.setClassificationCode(servLine.getClassificationCode());
							break;
						}
					}
					break;
				}
			}
		}
	}

	/**
	 * Creates the availability check response.
	 *
	 * @param response the response
	 * @param broadBand the broad band
	 * @return the availability check response
	 */
	public static AvailabilityCheckResponse createAvailabilityCheckResponse(AvailabilityCheckResponse response,
			Broadband broadBand) {
		if (broadBand != null && broadBand.getServicePoint() != null) {

			if (broadBand.getEngineeringVisitCharge() != null) {
				com.vf.uk.dal.broadband.entity.Price price = new com.vf.uk.dal.broadband.entity.Price();
				price.setGross(broadBand.getEngineeringVisitCharge().getGross());
				price.setNet(broadBand.getEngineeringVisitCharge().getNet());
				price.setVat(broadBand.getEngineeringVisitCharge().getVat());
				response.setEngineeringVisitCharge(price);
			}

			if (broadBand.getServicePoint().getServiceReference() != null) {
				ServiceReference serviceReference = broadBand.getServicePoint().getServiceReference();
				List<ServiceLines> serviceLinesList = serviceReference.getServiceLinesList();
				List<String> classificationCodeList = new ArrayList<>();
				for (ServiceLines sLines : serviceLinesList) {
					classificationCodeList.add(sLines.getClassificationCode());
				}
				response.setClassificationCode(classificationCodeList);

				if (CollectionUtils.isNotEmpty(serviceLinesList)) {

					List<com.vf.uk.dal.broadband.entity.LineSpeeds> lineSpeedForResponse = new ArrayList<>();
					List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityList = new ArrayList<>();
					ServiceLines serLines = serviceLinesList.get(0);
					List<LineTreatment> lineTreatmentList = serLines.getLineTreatmentList();
					List<ServieLine> serviceLineList = serLines.getServiceLineList();
					for (LineTreatment lineTreatment : lineTreatmentList) {
						AppointmentAndAvailabilityDetail appointmentDetails = new AppointmentAndAvailabilityDetail();
						appointmentDetails.setAppointmentNeeded(lineTreatment.isAppointmentNeeded());
						appointmentDetails.setEarliestAvailableDate(lineTreatment.getEarliestAvailableDate());
						if (lineTreatment.getLineTreatmentType() != null) {
							appointmentDetails.setLineTreatmentType(lineTreatment.getLineTreatmentType());
						}

						appointmentAndAvailabilityList.add(appointmentDetails);
					}

					for (AppointmentAndAvailabilityDetail appointmentDetails : appointmentAndAvailabilityList) {
						for (ServieLine servieLine : serviceLineList) {
							if (!StringUtils.equalsIgnoreCase(servieLine.getClassificationCode(), "Line")) {
								List<ServiceLineTreatment> serviceLineTreatmentList = servieLine
										.getServiceLineTreatmentList();
								for (ServiceLineTreatment serviceLineTreatment : serviceLineTreatmentList) {
									if (StringUtils.equalsIgnoreCase(serviceLineTreatment.getParentIdentification(),
											appointmentDetails.getLineTreatmentType()))
										appointmentDetails.setCanNumberBeRetained(
												String.valueOf(serviceLineTreatment.isCanNumberBeRetained()));
								}
							}
						}
					}

					response.setAppointmentAndAvailabilityDetail(appointmentAndAvailabilityList);
					for (ServiceLines serviceLineListForAll : serviceLinesList) {
						for (ServieLine servieLine : serviceLineListForAll.getServiceLineList()) {

							if (!StringUtils.equalsIgnoreCase(servieLine.getClassificationCode(), "Line")) {
								com.vf.uk.dal.broadband.entity.LineSpeeds lineSpeedsForRes = new com.vf.uk.dal.broadband.entity.LineSpeeds();
								if (StringUtils.isNotEmpty(servieLine.getLineSpeeds().getAvgDownSpeed())) {
									lineSpeedsForRes.setAvgDownSpeed(
											Double.parseDouble(servieLine.getLineSpeeds().getAvgDownSpeed()));
								}
								lineSpeedsForRes.setBandwidthMeasure(servieLine.getLineSpeeds().getBandwidthMeasure());
								if (StringUtils.isNotEmpty(servieLine.getLineSpeeds().getMaxDownSpeed())) {
									lineSpeedsForRes.setMaxDownSpeed(
											Double.parseDouble(servieLine.getLineSpeeds().getMaxDownSpeed()));
								}
								if (StringUtils.isNotEmpty(servieLine.getLineSpeeds().getMaxUpSpeed())) {
									lineSpeedsForRes.setMaxUpSpeed(
											Double.parseDouble(servieLine.getLineSpeeds().getMaxUpSpeed()));
								}
								if (StringUtils.isNotEmpty(servieLine.getLineSpeeds().getMinDownSpeed())) {
									lineSpeedsForRes.setMinDownSpeed(
											Double.parseDouble(servieLine.getLineSpeeds().getMinDownSpeed()));
								}
								if (StringUtils.isNotEmpty(servieLine.getLineSpeeds().getMinGuaranteedDownSpeed())) {
									lineSpeedsForRes.setMinGuaranteedDownSpeed(
											Double.parseDouble(servieLine.getLineSpeeds().getMinGuaranteedDownSpeed()));
								}
								if (StringUtils.isNotEmpty(servieLine.getLineSpeeds().getMinUpSpeed())) {
									lineSpeedsForRes.setMinUpSpeed(
											Double.parseDouble(servieLine.getLineSpeeds().getMinUpSpeed()));
								}
								lineSpeedsForRes.setPackageName(serviceLineListForAll.getClassificationCode());
								lineSpeedForResponse.add(lineSpeedsForRes);
							}
						}
					}
					response.setLineSpeeds(lineSpeedForResponse);

				}
			}
			if (broadBand.getServicePoint().getLineReference() != null
					&& broadBand.getServicePoint().getLineReference().getInstallationAddress() != null) {
				com.vf.uk.dal.broadband.entity.InstallationAddress installationAddress = new com.vf.uk.dal.broadband.entity.InstallationAddress();

				installationAddress.setCitySubDivisionName(broadBand.getServicePoint().getLineReference()
						.getInstallationAddress().getCitySubDivisionName());
				installationAddress.setCountry(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getCountry());
				installationAddress
						.setCounty(broadBand.getServicePoint().getLineReference().getInstallationAddress().getCounty());
				installationAddress.setFlatNumber(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getFlatNumber());
				installationAddress.setHouseName(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getHouseName());
				installationAddress.setHouseNumber(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getHouseNumber());
				installationAddress.setLocality(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getLocality());
				installationAddress.setMoveTypeCode(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getMoveTypeCode());
				installationAddress.setPostCode(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getPostCode());
				installationAddress.setStreetName(
						broadBand.getServicePoint().getLineReference().getInstallationAddress().getStreetName());
				installationAddress
						.setTown(broadBand.getServicePoint().getLineReference().getInstallationAddress().getTown());
				com.vf.uk.dal.broadband.entity.Identification identification = new com.vf.uk.dal.broadband.entity.Identification();
				identification.setId(broadBand.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getId());
				identification.setContextId(broadBand.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getContextId());
				installationAddress.setIdentification(identification);
				response.setInstallationAddress(installationAddress);

			}

		}
		return response;
	}

	/**
	 * Creates the update cache request.
	 *
	 * @param broadband the broadband
	 * @param basketRequest the basket request
	 * @param broadbandId the broadband id
	 * @param basket the basket
	 * @return the broadband
	 */
	public static Broadband createUpdateCacheRequest(Broadband broadband, BasketRequest basketRequest,
			String broadbandId, Basket basket) {

		LineDetails lineDetails = broadband.getLineDetails();

		if (lineDetails == null) {
			lineDetails = new LineDetails();
		}
		lineDetails.setClassificationCode(basketRequest.getSelectedPackageCode());
		
		BasketInfo basketInfo;
		if(broadband.getBasketInfo() != null)
			basketInfo = broadband.getBasketInfo();
		else{
			basketInfo = new BasketInfo();
			basketInfo.setAccountCategory(CustomerTypeEnum.CONSUMER.toString());
		}
		
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
					broadband.setBasketInfo(basketInfo);
				}
			}
		}
		broadband.setBroadBandId(broadbandId);
		broadband.setLineDetails(lineDetails);
		return broadband;
	}

	/**
	 * Creates the basket request.
	 *
	 * @param basketRequest the basket request
	 * @param broadband the broadband
	 * @param servicePoint the service point
	 * @param journey the journey
	 * @return the creates the basket request
	 */
	public static CreateBasketRequest createBasketRequest(BasketRequest basketRequest, Broadband broadband,
			com.vf.uk.dal.broadband.basket.entity.BasketServicePoint servicePoint, CurrentJourney journey) {
		CreateBasketRequest createBasket = new CreateBasketRequest();
		createBasket.setCustomerRequestedDate(basketRequest.getCustomerRequestedDate());
		createBasket.setSource(basketRequest.getSource());
		List<AddPackage> packages = new ArrayList<>();
		AddPackage addPackage = new AddPackage();
		// add bundle in basket
		if (broadband != null && broadband.getLineDetails() != null
				&& StringUtils.isNotEmpty(broadband.getLineDetails().getFlbbNumber())) {
			addPackage.setPhoneNumber(broadband.getLineDetails().getFlbbNumber());
		}

		if (broadband != null && broadband.getBasketInfo() != null
				&& StringUtils.isNotEmpty(broadband.getBasketInfo().getAccountCategory())) {
			addPackage.setAccountCategory(broadband.getBasketInfo().getAccountCategory());
		} else {
			addPackage.setAccountCategory("Consumer");
		}
		if (journey != null && journey.getJourneyData() != null
				&& StringUtils.isNotEmpty(journey.getJourneyData().getName())) {
			addPackage.setPackageType(journey.getJourneyData().getName());
		} else {
			addPackage.setPackageType("Acquisition");
		}

		AddProduct bundle = new AddProduct();
		bundle.setAction("ADD");
		bundle.setSkuId(basketRequest.getAddBundle().getBundleId());
		addPackage.setBundle(bundle);

		// add service point in basket
		addPackage.setServicePoint(servicePoint);

		// add hardware to basket
		List<AddProduct> hardwares = new ArrayList<>();
		AddProduct hardware = new AddProduct();
		hardware.setAction("ADD");
		hardware.setSkuId(basketRequest.getAddHardware().getHardwareId());
		hardwares.add(hardware);
		addPackage.setHardwares(hardwares);

		// add installation address to basket
		if (broadband != null && broadband.getServicePoint().getLineReference().getInstallationAddress() != null) {
			com.vf.uk.dal.broadband.basket.entity.InstallationAddress installationAddress = new com.vf.uk.dal.broadband.basket.entity.InstallationAddress();
			installationAddress.setCitySubDivisionName(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getCitySubDivisionName());
			installationAddress
					.setCountry(broadband.getServicePoint().getLineReference().getInstallationAddress().getCountry());
			installationAddress
					.setCounty(broadband.getServicePoint().getLineReference().getInstallationAddress().getCounty());
			installationAddress.setFlatNumber(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getFlatNumber());
			installationAddress.setHouseName(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getHouseName());
			installationAddress.setHouseNumber(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getHouseNumber());
			installationAddress
					.setLocality(broadband.getServicePoint().getLineReference().getInstallationAddress().getLocality());
			installationAddress.setMoveTypeCode(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getMoveTypeCode());
			installationAddress
					.setPostCode(broadband.getServicePoint().getLineReference().getInstallationAddress().getPostCode());
			installationAddress.setStreetName(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getStreetName());
			installationAddress
					.setTown(broadband.getServicePoint().getLineReference().getInstallationAddress().getTown());
			if (broadband.getServicePoint().getLineReference().getInstallationAddress().getIdentification() != null) {
				com.vf.uk.dal.broadband.basket.entity.Identification identification = new com.vf.uk.dal.broadband.basket.entity.Identification();
				identification.setContextId(broadband.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getContextId());
				identification.setId(broadband.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getId());
				installationAddress.setIdentification(identification);
				addPackage.setInstallationAddress(installationAddress);
			}
		}

		List<AddProduct> services = new ArrayList<>();
		for (String skuId : basketRequest.getServiceIds()) {
			AddProduct addProductForServices = new AddProduct();
			addProductForServices.setAction("ADD");
			addProductForServices.setSkuId(skuId);
			services.add(addProductForServices);
		}
		addPackage.setServices(services);

		packages.add(addPackage);
		createBasket.setPackages(packages);
		return createBasket;
	}

	/**
	 * Creates the update cache request.
	 *
	 * @param broadband the broadband
	 * @param basketId the basket id
	 * @return the broadband
	 */
	public static Broadband createUpdateCacheRequest(Broadband broadband, String basketId) {
		broadband.setBasketId(basketId);
		return broadband;
	}

	/**
	 * Update basket request.
	 *
	 * @param basketRequest the basket request
	 * @param journey the journey
	 * @param broadband the broadband
	 * @param planId the plan id
	 * @return the update package
	 */
	public static UpdatePackage updateBasketRequest(BasketRequest basketRequest, CurrentJourney journey,
			Broadband broadband, String planId) {
		UpdatePackage updatePackage = new UpdatePackage();
		if (broadband.getBasketInfo() != null
				&& StringUtils.isNotEmpty(broadband.getBasketInfo().getAccountCategory())) {
			updatePackage.setAccountCategory(broadband.getBasketInfo().getAccountCategory());
		} else {
			updatePackage.setAccountCategory("Consumer");
		}
		if (journey != null && journey.getJourneyData() != null
				&& StringUtils.isNotEmpty(journey.getJourneyData().getName())) {
			updatePackage.setPackageType(journey.getJourneyData().getName());
		} else {
			updatePackage.setPackageType("Acquisition");
		}

		if (StringUtils.isNotEmpty(planId)) {
			UpdateBundle updateBundle = new UpdateBundle();
			updateBundle.setAction("ADD");
			updateBundle.setSkuId(planId);
			updateBundle.setProductLineId(broadband.getBasketInfo().getPlanProductLineId());
			updatePackage.setBundle(updateBundle);
		}
		if (basketRequest != null && basketRequest.getAddBundle() != null
				&& StringUtils.isNotEmpty(basketRequest.getAddBundle().getBundleId())
				&& StringUtils.isNotEmpty(basketRequest.getAddBundle().getPackageLineId())) {
			UpdateBundle updateBundle = new UpdateBundle();
			updateBundle.setAction("ADD");
			updateBundle.setSkuId(basketRequest.getAddBundle().getBundleId());
			updateBundle.setProductLineId(basketRequest.getAddBundle().getPackageLineId());
			updatePackage.setBundle(updateBundle);
		}
		List<UpdateDevice> hardwares = new ArrayList<>();
		if (basketRequest != null && basketRequest.getAddHardware() != null
				&& StringUtils.isNotEmpty(basketRequest.getAddHardware().getHardwareId())
				&& StringUtils.isNotEmpty(basketRequest.getAddHardware().getPackageLineId())) {
			UpdateDevice updateDevice = new UpdateDevice();
			updateDevice.setAction("ADD");
			updateDevice.setSkuId(basketRequest.getAddHardware().getHardwareId());
			updateDevice.setProductLineId(basketRequest.getAddHardware().getPackageLineId());
			hardwares.add(updateDevice);
			updatePackage.addHardwaresItem(updateDevice);
		}

		if (broadband.getEngineeringVisitCharge() != null
				&& StringUtils.isNotEmpty(broadband.getEngineeringVisitCharge().getEngVisitProductId())
				&& StringUtils.equalsIgnoreCase(broadband.getLineDetails().getLineTreatmentType(), "NEW")) {
			List<UpdateService> services = new ArrayList<>();
			UpdateService updateService = new UpdateService();
			updateService.setProductLineId(broadband.getEngineeringVisitCharge().getEngVisitProductId());
			updateService.setAction("ADD");
			services.add(updateService);
			updatePackage.setServices(services);
		}
		return updatePackage;
	}

	/**
	 * Sets the premise and service point request.
	 *
	 * @param servicePoint the service point
	 * @param broadband the broadband
	 * @param availabilityCheckRequest the availability check request
	 * @param updateLineRequest the update line request
	 * @return the premise and service point
	 */
	public static PremiseAndServicePoint setPremiseAndServicePointRequest(
			com.vf.uk.dal.broadband.basket.entity.BasketServicePoint servicePoint, Broadband broadband,
			AvailabilityCheckRequest availabilityCheckRequest, UpdateLineRequest updateLineRequest) {
		PremiseAndServicePoint premiseAndServicePoint = new PremiseAndServicePoint();
		if (servicePoint != null) {
			premiseAndServicePoint.setServicePoint(servicePoint);
		}

		if (broadband.getLineDetails() != null
				&& StringUtils.isNotEmpty(broadband.getLineDetails().getClassificationCode())) {
			premiseAndServicePoint.setLinePackageType(broadband.getLineDetails().getClassificationCode());
		}
		if (availabilityCheckRequest != null && availabilityCheckRequest.getLineRef() != null
				&& availabilityCheckRequest.getLineRef().getLineIdentification() != null && StringUtils.isNotEmpty(
						availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber())) {
			premiseAndServicePoint.setPhoneNumber(
					availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber());
		}

		if (updateLineRequest != null && StringUtils.isNotEmpty(updateLineRequest.getLineTreatmentType())) {
			premiseAndServicePoint.setLineTreatmentType(updateLineRequest.getLineTreatmentType());
		} else if (StringUtils.isNotEmpty(broadband.getLineDetails().getLineTreatmentType())) {
			premiseAndServicePoint.setLineTreatmentType(broadband.getLineDetails().getLineTreatmentType());
		}

		if (broadband.getServicePoint().getLineReference().getInstallationAddress() != null) {
			com.vf.uk.dal.broadband.basket.entity.InstallationAddress installationAddress = new com.vf.uk.dal.broadband.basket.entity.InstallationAddress();
			installationAddress.setCitySubDivisionName(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getCitySubDivisionName());
			installationAddress
					.setCountry(broadband.getServicePoint().getLineReference().getInstallationAddress().getCountry());
			installationAddress
					.setCounty(broadband.getServicePoint().getLineReference().getInstallationAddress().getCounty());
			installationAddress.setFlatNumber(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getFlatNumber());
			installationAddress.setHouseName(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getHouseName());
			installationAddress.setHouseNumber(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getHouseNumber());
			installationAddress
					.setLocality(broadband.getServicePoint().getLineReference().getInstallationAddress().getLocality());
			installationAddress.setMoveTypeCode(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getMoveTypeCode());
			installationAddress
					.setPostCode(broadband.getServicePoint().getLineReference().getInstallationAddress().getPostCode());
			installationAddress.setStreetName(
					broadband.getServicePoint().getLineReference().getInstallationAddress().getStreetName());
			installationAddress
					.setTown(broadband.getServicePoint().getLineReference().getInstallationAddress().getTown());
			if (broadband.getServicePoint().getLineReference().getInstallationAddress().getIdentification() != null) {
				com.vf.uk.dal.broadband.basket.entity.Identification identification = new com.vf.uk.dal.broadband.basket.entity.Identification();
				identification.setContextId(broadband.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getContextId());
				identification.setId(broadband.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getId());
				installationAddress.setIdentification(identification);
				premiseAndServicePoint.setInstallationAddress(installationAddress);
			}
		}
		return premiseAndServicePoint;
	}

	/**
	 * Update broadband cache.
	 *
	 * @param broadband the broadband
	 * @param updateLineRequest the update line request
	 * @param broadbandId the broadband id
	 * @return the broadband
	 */
	public static Broadband updateBroadbandCache(Broadband broadband, UpdateLineRequest updateLineRequest,
			String broadbandId) {
		Broadband broadBand = broadband;
		broadBand.setBroadBandId(broadbandId);
		LineDetails lineDetails = broadBand.getLineDetails();
		if (lineDetails == null) {
			lineDetails = new LineDetails();
		}
		lineDetails.setLineTreatmentType(updateLineRequest.getLineTreatmentType());
		broadBand.setLineDetails(lineDetails);
		return broadBand;
	}

	/**
	 * Adds the product request.
	 *
	 * @param broadband the broadband
	 * @return the adds the product request
	 */
	public static AddProductRequest addProductRequest(Broadband broadband) {
		AddProductRequest addProductRequest = new AddProductRequest();
		List<Product> products = new ArrayList<>();
		Product product = new Product();
		product.setAction("ADD");
		product.setProductType("SERVICE");
		product.setSkuId(broadband.getEngineeringVisitCharge().getEngVisitProductId());
		products.add(product);
		addProductRequest.setProducts(products);
		return addProductRequest;
	}

	/**
	 * Adds the appointment info to broadband cache.
	 *
	 * @param broadBand the broad band
	 * @param createAppointmentRequest the create appointment request
	 * @param identificationId the identification id
	 * @return the broadband
	 */
	public static Broadband addAppointmentInfoToBroadbandCache(Broadband broadBand,
			CreateAppointmentRequest createAppointmentRequest, String identificationId) {
		BroadbandSalesOrderAppointment salesOrderAppointment = null;
		Broadband broadBandForSalesAppointment = broadBand;
		if (broadBand.getSalesOrderAppointment() != null) {
			salesOrderAppointment = broadBand.getSalesOrderAppointment();
		} else {
			salesOrderAppointment = new BroadbandSalesOrderAppointment();
			com.vf.uk.dal.broadband.cache.repository.entity.AppointmentWindow appointmentWindow = new com.vf.uk.dal.broadband.cache.repository.entity.AppointmentWindow();
			appointmentWindow.setStartDateTime(createAppointmentRequest.getStartTimePeriod());
			appointmentWindow.setTimeSlot(createAppointmentRequest.getTimeSlot());
			appointmentWindow.setIdentificationId(identificationId);
			appointmentWindow.setOperationalPreferenceCode("STANDARD");
			salesOrderAppointment.setAppointmentWindow(appointmentWindow);
			if (createAppointmentRequest.getSiteNote() != null) {
				SiteNote siteNote = new SiteNote();
				siteNote.setNotes(createAppointmentRequest.getSiteNote().getNotes());
				siteNote.setTypeCode("ENGINEER");
				salesOrderAppointment.setSiteNote(siteNote);
			}
		}
		broadBandForSalesAppointment.setSalesOrderAppointment(salesOrderAppointment);
		return broadBandForSalesAppointment;
	}

	/**
	 * Update basket with appointment request.
	 *
	 * @param createAppointmentRequest the create appointment request
	 * @param applicationId the application id
	 * @return the com.vf.uk.dal.broadband.basket.entity. appointment window
	 */
	public static com.vf.uk.dal.broadband.basket.entity.AppointmentWindow updateBasketWithAppointmentRequest(
			CreateAppointmentRequest createAppointmentRequest, String applicationId) {
		com.vf.uk.dal.broadband.basket.entity.AppointmentWindow appointmentWindow = new com.vf.uk.dal.broadband.basket.entity.AppointmentWindow();
		appointmentWindow.setStartDateTime(createAppointmentRequest.getStartTimePeriod());
		appointmentWindow.setTimeSlot(createAppointmentRequest.getTimeSlot());
		appointmentWindow.setOperationalPreferenceCode(applicationId);
		appointmentWindow.setIdentificationId(applicationId);
		if (createAppointmentRequest.getSiteNote() != null
				&& createAppointmentRequest.getSiteNote().getNotes() != null) {
			List<com.vf.uk.dal.broadband.basket.entity.SiteNote> siteNoteList = new ArrayList<>();
			com.vf.uk.dal.broadband.basket.entity.SiteNote siteNote = new com.vf.uk.dal.broadband.basket.entity.SiteNote();
			siteNote.setNotes(createAppointmentRequest.getSiteNote().getNotes());
			siteNote.setTypeCode("ENGINEER");
			siteNoteList.add(siteNote);
			appointmentWindow.setSiteNotes(siteNoteList);
		}
		return appointmentWindow;
	}

	/**
	 * Update broadband cache with line directory info.
	 *
	 * @param broadband the broadband
	 * @return the service point
	 */
	public static ServicePoint updateBroadbandCacheWithLineDirectoryInfo(Broadband broadband) {
		ServicePoint servicePoint = broadband.getServicePoint();
		LineReference lineReference = servicePoint.getLineReference();
		List<LineDirectory> lineDirectoryList = lineReference.getLineDirectoryList();
		if (!CollectionUtils.isNotEmpty(lineDirectoryList)) {
			lineDirectoryList = new ArrayList<>();
		}
		LineDirectory lineDirectory = new LineDirectory();
		lineDirectory.setDirectoryCode("NO_DIRECTORY_ENTRY");
		lineDirectory.setLocationCode("INDIVIDUAL");
		lineDirectory.setFeatureCode("MAINLINE_DIRECTORY");
		lineDirectoryList.add(lineDirectory);
		lineReference.setLineDirectoryList(lineDirectoryList);
		servicePoint.setLineReference(lineReference);
		return servicePoint;
	}

	/**
	 * Gets the appointment request.
	 *
	 * @param broadBand the broad band
	 * @param userType the user type
	 * @return the appointment request
	 */
	public static GetAppointmentRequest getAppointmentRequest(Broadband broadBand,String userType) {

		GetAppointmentRequest request = new GetAppointmentRequest();
		if (broadBand.getServicePoint() != null && broadBand.getServicePoint().getServiceReference() != null
				&& CollectionUtils
						.isNotEmpty(broadBand.getServicePoint().getServiceReference().getServiceLinesList())) {

			AppointmentDetails appointmentDetails = new AppointmentDetails();
			AddressDetails addressDetails = new AddressDetails();
			Address address = new Address();
			address.setCityName(broadBand.getServicePoint().getLineReference().getInstallationAddress().getTown());
			address.setCitySubDivisionName(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getCitySubDivisionName());
			address.setCountryCode(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getCountry());
			address.setCountyName(broadBand.getServicePoint().getLineReference().getInstallationAddress().getCounty());
			address.setLineFour(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getFlatNumber());
			address.setLineOne(broadBand.getServicePoint().getLineReference().getInstallationAddress().getStreetName());
			address.setLineThree(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getHouseNumber());
			address.setLineTwo(broadBand.getServicePoint().getLineReference().getInstallationAddress().getLocality());
			address.setBuilding(broadBand.getServicePoint().getLineReference().getInstallationAddress().getHouseName());
			address.setPostalCode(
					broadBand.getServicePoint().getLineReference().getInstallationAddress().getPostCode());
			if (broadBand.getServicePoint().getLineReference().getInstallationAddress().getIdentification() != null) {
				address.setIdentificationId(broadBand.getServicePoint().getLineReference().getInstallationAddress()
						.getIdentification().getId());
			}
			addressDetails.setAddress(address);
			Organisation organisation = new Organisation();
			organisation.setName("Vodafone");
			addressDetails.setOrganisation(organisation);
			appointmentDetails.setAddressDetails(addressDetails);
			ServiceRequest serviceRequest = new ServiceRequest();
			serviceRequest.setCategoryCode("BASIC");
			serviceRequest.setClassificationCode("BROADBAND");
			serviceRequest.setTypeCode("INSTALL");
			if (!StringUtils.equalsIgnoreCase(broadBand.getCategoryPreference(), "FTTH")) {
				serviceRequest.setSubClassificationCode(BroadBandConstant.FTTC_SUB_CLASSIFICATIONCODE);
			}
			com.vf.uk.dal.broadband.entity.appointment.ItemReference itemReference = new com.vf.uk.dal.broadband.entity.appointment.ItemReference();
			if (!StringUtils.equalsIgnoreCase(broadBand.getCategoryPreference(), "FTTH")) {
				itemReference.setTypeCode(BroadBandConstant.FTTC_ITEM_REFERENCE_CODE);
			} else {
				itemReference.setTypeCode(broadBand.getCategoryPreference());
			}
			// Added logic to set classification code
			setClassificationCodeInAppointmentRequest(broadBand, itemReference);
			serviceRequest.setItemReference(itemReference);
			CustomerPartyReference customerPartyRef = new CustomerPartyReference();
			
			if(StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.BUSINESS.toString()))
				customerPartyRef.setCustomerPartyAccountTypeCode(CustomerTypeEnum.BUSINESS.toString());
			
			if(StringUtils.equalsIgnoreCase(userType, CustomerTypeEnum.CONSUMER.toString()))
				customerPartyRef.setCustomerPartyAccountTypeCode(CustomerTypeEnum.INDIVIDUAL.toString());
			
			serviceRequest.setCustomerPartyReference(customerPartyRef);
			appointmentDetails.setServiceRequest(serviceRequest);
			AppointmentWindow appointmentWindow = new AppointmentWindow();
			appointmentWindow.setOperationalPreferenceCode("STANDARD");
			appointmentWindow.setStartTimePeriod(getStartTimePeriodFromLineTreatment(broadBand));
			appointmentDetails.setAppointmentWindow(appointmentWindow);
			request.setAppointmentDetails(appointmentDetails);
			request.setExisting(false);
		}
		return request;
	}

	/**
	 * Gets the start time period from line treatment.
	 *
	 * @param broadBand the broad band
	 * @return the start time period from line treatment
	 */
	private static String getStartTimePeriodFromLineTreatment(Broadband broadBand) {
		String startTimePeriod = null;
		for (com.vf.uk.dal.broadband.cache.repository.entity.ServiceLines serLines : broadBand.getServicePoint()
				.getServiceReference().getServiceLinesList()) {
			if (StringUtils.equalsIgnoreCase(serLines.getClassificationCode(),
					broadBand.getLineDetails().getClassificationCode())) {
			if (CollectionUtils.isNotEmpty(serLines.getLineTreatmentList())) {
				for (LineTreatment lineTreatment : serLines.getLineTreatmentList()) {
					if (StringUtils.equalsIgnoreCase(lineTreatment.getLineTreatmentType(),
							broadBand.getLineDetails().getLineTreatmentType())) {
						startTimePeriod = getFormattedDate(lineTreatment.getEarliestAvailableDate(),
								BroadBandConstant.DATE_PATTERN4, BroadBandConstant.DATE_PATTERN3);
					}
				}
			}
			}
		}
		return startTimePeriod;
	}

	/**
	 * Creates the get appointment response.
	 *
	 * @param getAppointmentResponse the get appointment response
	 * @return the gets the appointment response
	 */
	public static GetAppointmentResponse createGetAppointmentResponse(GetAppointment getAppointmentResponse) {
		GetAppointmentResponse getAppointmentRes = new GetAppointmentResponse();
		List<AppointmentList> apptWindowList = new ArrayList<>();
		for (AppointmentWindowList apptWindow : getAppointmentResponse.getAppointmentWindowList()) {
			AppointmentList appWindow = new AppointmentList();
			appWindow.setStartDate(apptWindow.getStartTimePeriod());
			List<String> slot = new ArrayList<>();
			slot.add(apptWindow.getTimeSlot());
			appWindow.setTimeSlots(slot);
			appWindow.setStartTime(apptWindow.getStartTime());
			appWindow.setEndTime(apptWindow.getEndTime());
			apptWindowList.add(appWindow);
		}
		getAppointmentRes.setAppointmentWindowList(apptWindowList);
		return getAppointmentRes;
	}

	/**
	 * Creates the promotion request to optimize.
	 *
	 * @param broadband the broadband
	 * @param journeyName the journey name
	 * @return the bundle promotion request
	 */
	public static BundlePromotionRequest createPromotionRequestToOptimize(Broadband broadband, String journeyName) {
		BundlePromotionRequest bundlePromotionRequest = new BundlePromotionRequest();
		List<String> bundleIdList = new ArrayList<>();
		bundleIdList.add(broadband.getBasketInfo().getPlanId());
		bundlePromotionRequest.setBundleIdList(bundleIdList);
		bundlePromotionRequest.setJourneyType(journeyName);
		return bundlePromotionRequest;
	}

	/**
	 * Creates the service start date request.
	 *
	 * @param serviceStartDate the service start date
	 * @return the service start date request
	 */
	public static ServiceStartDateRequest createServiceStartDateRequest(
			com.vf.uk.dal.broadband.entity.ServiceStartDateRequest serviceStartDate) {
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setServiceStartDate(serviceStartDate.getStartDateTime());
		return serviceStartDateRequest;
	}

	/**
	 * Format link.
	 *
	 * @param link the link
	 * @return the link
	 */
	public static Link formatLink(Link link) {
		Link newLink = link;
		if (newLink != null && newLink.getHref().indexOf("/broadband") != -1) {
			newLink = newLink.withHref(
					newLink.getHref().substring(newLink.getHref().indexOf("/broadband"), newLink.getHref().length()));
		}
		return newLink;
	}

	/**
	 * Gets the formatted date.
	 *
	 * @param dateInString the date in string
	 * @param pattern the pattern
	 * @param desiredPattern the desired pattern
	 * @return the formatted date
	 */
	private static String getFormattedDate(String dateInString, String pattern, String desiredPattern) {
		String dateString = null;
		if (dateInString != null) {
			try {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				java.util.Date date = simpleDateFormat.parse(dateInString);
				if (desiredPattern != null) {
					SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(desiredPattern);
					dateString = simpleDateFormat1.format(date);
				}
			} catch (ParseException e) {
				LogHelper.error(ConverterUtils.class,
						dateInString + "is not in pattern " + pattern + " and desired pattern is " + desiredPattern);
			}
		}
		return dateString;
	}

}
