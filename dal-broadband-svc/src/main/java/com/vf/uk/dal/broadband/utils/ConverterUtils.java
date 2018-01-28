package com.vf.uk.dal.broadband.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.vf.uk.dal.broadband.entity.AppointmentAndAvailabilityDetail;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.Price;
import com.vf.uk.dal.broadband.entity.appointment.Address;
import com.vf.uk.dal.broadband.entity.appointment.AddressDetails;
import com.vf.uk.dal.broadband.entity.appointment.AppointmentDetails;
import com.vf.uk.dal.broadband.entity.appointment.AppointmentWindow;
import com.vf.uk.dal.broadband.entity.appointment.Organisation;
import com.vf.uk.dal.broadband.entity.appointment.ServiceRequest;
import com.vf.uk.dal.broadband.entity.journey.AccessLine;
import com.vf.uk.dal.broadband.entity.journey.AvailableServices;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyDetails;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.Identification;
import com.vf.uk.dal.broadband.entity.journey.InstallationAddress;
import com.vf.uk.dal.broadband.entity.journey.ItemReference;
import com.vf.uk.dal.broadband.entity.journey.Journey;
import com.vf.uk.dal.broadband.entity.journey.LineDirectory;
import com.vf.uk.dal.broadband.entity.journey.LineLocator;
import com.vf.uk.dal.broadband.entity.journey.LineReference;
import com.vf.uk.dal.broadband.entity.journey.LineSettings;
import com.vf.uk.dal.broadband.entity.journey.LineSpeeds;
import com.vf.uk.dal.broadband.entity.journey.LineStatus;
import com.vf.uk.dal.broadband.entity.journey.LineTreatment;
import com.vf.uk.dal.broadband.entity.journey.MiscReference;
import com.vf.uk.dal.broadband.entity.journey.PendingOrder;
import com.vf.uk.dal.broadband.entity.journey.SalesOrderAppointmentRequest;
import com.vf.uk.dal.broadband.entity.journey.ServiceLine;
import com.vf.uk.dal.broadband.entity.journey.ServiceLineTreatment;
import com.vf.uk.dal.broadband.entity.journey.ServiceLines;
import com.vf.uk.dal.broadband.entity.journey.ServicePoint;
import com.vf.uk.dal.broadband.entity.journey.ServiceReference;
import com.vf.uk.dal.broadband.entity.journey.SiteNote;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.CustomerTypeEnum;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.MoveTypeCodeEnum;
import com.vodafone.solrmodels.ProductModel;

/**
 * @author Infosys limited
 *
 */
public class ConverterUtils {

	private ConverterUtils() {
	}

	
	/**
	 * 
	 * @param availabilityCheckRequest
	 * @return GetServiceAvailibilityRequest
	 */
	
	public static GetServiceAvailibilityRequest createGetServiceAvailibilityRequest(
			AvailabilityCheckRequest availabilityCheckRequest) {
		GetServiceAvailibilityRequest request = new GetServiceAvailibilityRequest(); 
		request.setLandlineNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber());
		request.setMoveFromPostCode(
				availabilityCheckRequest.getLineRef().getLineIdentification().getMoveFromPostCode());
		request.setCustomerType(CustomerTypeEnum.INDIVIDUAL);
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
		installationAddress.setAddressReferenceNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getIdentification().getId());
		installationAddress.setAddressType(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getIdentification().getContextId());
		request.setInstallationAddress(installationAddress);
		return request;
	}

	/**
	 * 
	 * @param availabilityCheckRequest
	 * @param getServiceAvailabilityResponse
	 * @return FLBBJourneyRequest
	 */
	
	public static FLBBJourneyRequest createFLBBRequestForJourney(AvailabilityCheckRequest availabilityCheckRequest,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse) {
		FLBBJourneyRequest request = new FLBBJourneyRequest();
		FLBBJourneyDetails flbbJourneyDetails = new FLBBJourneyDetails();
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
					lineDirectory.setDirectoryCode(lDirectory.getDirectoryCode());
					lineDirectory.setFeatureCode(lDirectory.getFeatureCode());
					lineDirectory.setLocationCode(lDirectory.getFeatureCode());
					lineDirectoryList.add(lineDirectory);
				}
				lineRefernce.setLineDirectory(lineDirectoryList);
			}
			servicePoint.setLineRefernece(lineRefernce);
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
						if(lineTreatment.getLineTreatmentType()!=null){
							lineTreatmentForJourney.setIdentification(lineTreatment.getLineTreatmentType().toString());
						}
						lineTreatmentForJourney.setAppointmentNeeded(lineTreatment.getAppointmentNeeded());
						if (lineTreatment.getConnectionCharge() != null) {
							lineTreatmentForJourney.setConnectionCharge(lineTreatment.getConnectionCharge().toString());
						}
						lineTreatmentForJourney.setEarliestAvailableDate(lineTreatment.getEarliestAvailabilityDate());
						lineTreatmentList.add(lineTreatmentForJourney);
					}
					serviceLinesRequestForJourney.setLineTreatments(lineTreatmentList);
				}
				List<ServiceLine> serviceLineList = new ArrayList<>();
				if (serviceLinesFromRequest.getServiceLine() != null
						&& !serviceLinesFromRequest.getServiceLine().isEmpty()) {
					for (com.vf.uk.dal.entity.serviceavailability.ServiceLine serviceLineFromRequest : serviceLinesFromRequest
							.getServiceLine()) {
						ServiceLine serviceLine = new ServiceLine();
						ItemReference itemReference = new ItemReference();
						itemReference.setClassificationCode(serviceLineFromRequest.getClassificationCode());
						itemReference.setName(serviceLineFromRequest.getProductName());
						itemReference.setIdentificationId(serviceLineFromRequest.getProductCode());
						serviceLine.setItemReference(itemReference);

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
							miscReferenceForJourney.setAnfp(serviceLineFromRequest.getMiscReference().getAnfp());
							miscReferenceForJourney.setCustomerAgreedDate(
									serviceLineFromRequest.getMiscReference().getCustomerAgreedDate());
							miscReferenceForJourney
									.setLineLength(serviceLineFromRequest.getMiscReference().getLineLength());
							miscReferenceForJourney.setReadyForServiceDate(
									serviceLineFromRequest.getMiscReference().getReadyForServiceDate());
							miscReferenceForJourney.setServiceProviderName(
									serviceLineFromRequest.getMiscReference().getServiceProviderName());
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
								if (serviceLineTreatmentReq.getCanNumberBeRetained() != null) {
									serviceLineTreatment.setCanNumberBeRetained(
											String.valueOf(serviceLineTreatmentReq.getCanNumberBeRetained()));
								}
								serviceLineTreatment.setLineInfo(serviceLineTreatmentReq.getLineInfo());
								serviceLineTreatment.setPortInFlag(serviceLineTreatmentReq.getPortInFlag());
								serviceLineTreatment.setServiceAction(serviceLineTreatmentReq.getServiceAction());
								serviceLineTreatment.setServiceType(serviceLineTreatmentReq.getServiceType());
								serviceLineTreatment.setSimValue(serviceLineTreatmentReq.getSiM2Value());
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
											pendingOrderForJourney.setThirdPartyFlag(
													String.valueOf(pendingOrderFromGSA.getThirdPartyFlag()));
										}
										pendingOrderForJourney.setTypeCode(pendingOrderFromGSA.getTypeCode());
										pendingOrderList.add(pendingOrderForJourney);
									}
									serviceLineTreatment.setPendingOrders(pendingOrderList);
								}
								serviceLineTreatmentList.add(serviceLineTreatment);
								serviceLine.serviceLineTreatments(serviceLineTreatmentList);
							}
						}
						serviceLineList.add(serviceLine);
					}
					serviceLinesRequestForJourney.setServiceLines(serviceLineList);
				}
				serviceLinesList.add(serviceLinesRequestForJourney);
			}
			serviceReference.setServiceLines(serviceLinesList);
			servicePoint.setServiceReference(serviceReference);
		}
		flbbJourneyDetails.setServicePoint(servicePoint);
		request.setFlbbJourneyDetails(flbbJourneyDetails);
		return request;
	}

	/**
	 * 
	 * @param response
	 * @param getServiceAvailabilityResponse
	 * @param availabilityCheckRequest
	 * @param productModel
	 * @return AvailabilityCheckResponse
	 */
	
	public static AvailabilityCheckResponse createAvailabilityCheckResponse(AvailabilityCheckResponse response,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse,
			AvailabilityCheckRequest availabilityCheckRequest, List<ProductModel> productModel) {

		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getLineTreatment()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getLineTreatment().isEmpty()){
			List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityList = new ArrayList<>();
			for(com.vf.uk.dal.entity.serviceavailability.LineTreatment lineTreatment : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getLineTreatment()){
				AppointmentAndAvailabilityDetail appointmentDetails = new AppointmentAndAvailabilityDetail();
				appointmentDetails.setAppointmentNeeded(lineTreatment.getAppointmentNeeded());
				appointmentDetails.setEarliestAvailableDate(lineTreatment.getEarliestAvailabilityDate());
				if(lineTreatment.getLineTreatmentType()!=null){
					appointmentDetails.setLineTreatmentType(lineTreatment.getLineTreatmentType().toString());
				}
				appointmentAndAvailabilityList.add(appointmentDetails);
				
				if(StringUtils.equalsIgnoreCase(lineTreatment.getLineTreatmentType().toString(), Constants.NEW)
						&& !StringUtils.equalsIgnoreCase(lineTreatment.getConnectionCharge().toString(), Constants.No_CHARGE)
						&& productModel!=null && !productModel.isEmpty()){
					Price engineeringVisitCharge = new Price();
					if(productModel.get(0).getPriceGrossOVR()!=null){
						engineeringVisitCharge.setGross(String.valueOf(productModel.get(0).getPriceGrossOVR()));
					}
					if(productModel.get(0).getPriceNetOVR()!=null){
						engineeringVisitCharge.setNet(String.valueOf(productModel.get(0).getPriceNetOVR()));
					}
					if(productModel.get(0).getPriceVatOVR()!=null){
						engineeringVisitCharge.setVat(String.valueOf(productModel.get(0).getPriceVatOVR()));
					}
					response.setEngineeringVisitCharge(engineeringVisitCharge);
				}
			}
			response.setAppointmentAndAvailabilityDetail(appointmentAndAvailabilityList);
		}
		
		
		List<String> classificationCodesList = new ArrayList<>();
		boolean is76FibreAvailable = false;
		boolean is38FibreAvailable = false;
		if (getServiceAvailabilityResponse.getServiceAvailabilityLine() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines() != null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()) {

			
			for(com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLines : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()){
				classificationCodesList.add(serviceLines.getClassificationCode());
			}

			if (classificationCodesList.contains(BroadBandConstant.LINE_WITH_76)) {
				is76FibreAvailable = true;
			}else if(!classificationCodesList.contains(BroadBandConstant.LINE_WITH_76)
					&& classificationCodesList.contains(BroadBandConstant.LINE_WITH_38)){
				is38FibreAvailable = true;
			}
			com.vf.uk.dal.broadband.entity.LineSpeeds lineSpeedForResponse = null;
			for(com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLines : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()){
					if(is76FibreAvailable && StringUtils.equalsIgnoreCase(serviceLines.getClassificationCode(), BroadBandConstant.LINE_WITH_76)){
						lineSpeedForResponse = setLineSpeedForBroadband(serviceLines, "Fibre with Speed 76");
					}else if(is38FibreAvailable && StringUtils.equalsIgnoreCase(serviceLines.getClassificationCode(), BroadBandConstant.LINE_WITH_38)){
						lineSpeedForResponse = setLineSpeedForBroadband(serviceLines,"Fibre with Speed 38");
					}
			}
			response.setLineSpeeds(lineSpeedForResponse);
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
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()){
			List<String> classificationCodeList = new ArrayList<>();
			for(com.vf.uk.dal.entity.serviceavailability.ServiceLines servLines : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()){
				classificationCodeList.add(servLines.getClassificationCode());
			}
			response.setClassificationCode(classificationCodeList);
		}
				
		response.setInstallationAddress(installationAddress);

		return response;
	}

	/**
	 * 
	 * @param serviceLines
	 * @param speed
	 * @return LineSpeeds
	 */
	
	private static com.vf.uk.dal.broadband.entity.LineSpeeds setLineSpeedForBroadband(com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLines,String speed) {
		com.vf.uk.dal.broadband.entity.LineSpeeds lineSpeedForResponse = new com.vf.uk.dal.broadband.entity.LineSpeeds();
		for(com.vf.uk.dal.entity.serviceavailability.ServiceLine serviceLine : serviceLines.getServiceLine()){
			if(StringUtils.equalsIgnoreCase(serviceLine.getClassificationCode(), speed)){
				lineSpeedForResponse.setAvgDownSpeed(serviceLine.getLineSpeeds().getAvgDownSpeed());
				lineSpeedForResponse.setBandwidthMeasure(serviceLine.getLineSpeeds().getBandwidthMeasure());
				lineSpeedForResponse.setMaxDownSpeed(serviceLine.getLineSpeeds().getMaxDownSpeed());
				lineSpeedForResponse.setMaxUpSpeed(serviceLine.getLineSpeeds().getMaxUpSpeed());
				lineSpeedForResponse.setMinDownSpeed(serviceLine.getLineSpeeds().getMinDownSpeed());
				lineSpeedForResponse.setMinGuaranteedDownSpeed(
						serviceLine.getLineSpeeds().getMinGuaranteedDownSpeed());
				lineSpeedForResponse.setMinUpSpeed(serviceLine.getLineSpeeds().getMinUpSpeed());
			}
		}
		return lineSpeedForResponse;
	}

	/**
	 * 
	 * @param createAppointmentRequest
	 * @param journey
	 * @return CreateAppointmentRequest
	 */
	
	public static com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createAppointmentRequest(CreateAppointmentRequest createAppointmentRequest, Journey journey) {
		com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest request = new com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest();
		
		if(journey!=null && journey.getServicePoint()!=null && journey.getServicePoint().getLineRefernece()!=null
				&& journey.getServicePoint().getLineRefernece().getInstallationAddress()!=null){
			AppointmentDetails appointmentDetails = new AppointmentDetails();
			AddressDetails addressDetails = new AddressDetails();
			Address address = new Address();
			address.setCityName(journey.getServicePoint().getLineRefernece().getInstallationAddress().getTown());
			address.setCitySubDivisionName(journey.getServicePoint().getLineRefernece().getInstallationAddress().getCitySubDivisionName());
			address.setCountryCode(journey.getServicePoint().getLineRefernece().getInstallationAddress().getCountry());
			address.setCountyName(journey.getServicePoint().getLineRefernece().getInstallationAddress().getCounty());
			address.setLineFour(journey.getServicePoint().getLineRefernece().getInstallationAddress().getFlatNumber());
			address.setLineOne(journey.getServicePoint().getLineRefernece().getInstallationAddress().getStreetName());
			address.setLineThree(journey.getServicePoint().getLineRefernece().getInstallationAddress().getHouseNumber());
			address.setLineTwo(journey.getServicePoint().getLineRefernece().getInstallationAddress().getLocality());
			address.setBuilding(journey.getServicePoint().getLineRefernece().getInstallationAddress().getHouseName());
			address.setPostalCode(journey.getServicePoint().getLineRefernece().getInstallationAddress().getPostCode());
			if(journey.getServicePoint().getLineRefernece().getInstallationAddress().getIdentification()!=null){
				address.setIdentificationId(journey.getServicePoint().getLineRefernece().getInstallationAddress().getIdentification().getId());
			}
			addressDetails.setAddress(address);
			Organisation organisation = new Organisation();
			organisation.setName("Vodafone");
			addressDetails.setOrganisation(organisation);
			appointmentDetails.setAddressDetails(addressDetails);
			ServiceRequest serviceRequest = new ServiceRequest();
			serviceRequest.setCategoryCode("BASIC");
			serviceRequest.setClassificationCode("LINE");
			serviceRequest.setSubClassificationCode("WLR_SINGLE_LINE");
			serviceRequest.setTypeCode("INSTALL");
			appointmentDetails.setServiceRequest(serviceRequest);
			AppointmentWindow appointmentWindow = new AppointmentWindow();
			appointmentWindow.setStartTimePeriod(createAppointmentRequest.getStartTimePeriod());
			appointmentWindow.setTimeSlot(createAppointmentRequest.getTimeSlot());
			appointmentWindow.setOperationalPreferenceCode("STANDARD");
			appointmentDetails.setAppointmentWindow(appointmentWindow);
			request.setAppointmentDetails(appointmentDetails);
			request.setExisting(false);
		}
		return request;
	}

	/**
	 * 
	 * @param createAppointmentRequest
	 * @param identificationId
	 * @return SalesOrderAppointmentRequest
	 */
	
	public static SalesOrderAppointmentRequest createSalesOrderAppointmentRequest(
			CreateAppointmentRequest createAppointmentRequest, String identificationId) {
		SalesOrderAppointmentRequest request = new SalesOrderAppointmentRequest();
		com.vf.uk.dal.broadband.entity.journey.AppointmentWindow appointmentWindow = new com.vf.uk.dal.broadband.entity.journey.AppointmentWindow();
		appointmentWindow.setStartDateTime(createAppointmentRequest.getStartTimePeriod());
		appointmentWindow.setTimeSlot(createAppointmentRequest.getTimeSlot());
		appointmentWindow.setIdentificationId(identificationId);
		appointmentWindow.setOperationalPreferenceCode("STANDARD");
		request.setAppointmentWindow(appointmentWindow);
		if(createAppointmentRequest.getSiteNote()!=null){
			SiteNote siteNote = new SiteNote();
			siteNote.setNotes(createAppointmentRequest.getSiteNote().getNotes());
			siteNote.setTypeCode("ENGINEER");
			request.setSiteNote(siteNote);
		}
		
		return request;
	}

}
