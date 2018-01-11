package com.vf.uk.dal.broadband.utils;

import java.util.ArrayList;
import java.util.List;

import com.vf.uk.dal.braodband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.braodband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.journey.AccessLine;
import com.vf.uk.dal.broadband.entity.journey.AvailableServices;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyDetails;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.Identification;
import com.vf.uk.dal.broadband.entity.journey.InstallationAddress;
import com.vf.uk.dal.broadband.entity.journey.ItemReference;
import com.vf.uk.dal.broadband.entity.journey.LineDirectory;
import com.vf.uk.dal.broadband.entity.journey.LineLocator;
import com.vf.uk.dal.broadband.entity.journey.LineReference;
import com.vf.uk.dal.broadband.entity.journey.LineSettings;
import com.vf.uk.dal.broadband.entity.journey.LineSpeeds;
import com.vf.uk.dal.broadband.entity.journey.LineStatus;
import com.vf.uk.dal.broadband.entity.journey.LineTreatment;
import com.vf.uk.dal.broadband.entity.journey.MiscReference;
import com.vf.uk.dal.broadband.entity.journey.PendingOrder;
import com.vf.uk.dal.broadband.entity.journey.ServiceLine;
import com.vf.uk.dal.broadband.entity.journey.ServiceLineTreatment;
import com.vf.uk.dal.broadband.entity.journey.ServiceLines;
import com.vf.uk.dal.broadband.entity.journey.ServicePoint;
import com.vf.uk.dal.broadband.entity.journey.ServiceReference;
import com.vf.uk.dal.entity.serviceavailability.CustomerTypeEnum;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.MoveTypeCodeEnum;

public class ConverterUtils {

	public static GetServiceAvailibilityRequest createGetServiceAvailibilityRequest(
			AvailabilityCheckRequest availabilityCheckRequest) {
		GetServiceAvailibilityRequest request = new GetServiceAvailibilityRequest();
		request.setLandlineNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getFllandlineNumber());
		request.setMoveFromPostCode(availabilityCheckRequest.getLineRef().getLineIdentification().getMoveFromPostCode());
		request.setCustomerType(CustomerTypeEnum.INDIVIDUAL);
		com.vf.uk.dal.entity.serviceavailability.InstallationAddress installationAddress = new com.vf.uk.dal.entity.serviceavailability.InstallationAddress();
		installationAddress.setCitySubDivisionName(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCitySubDivisionName());
		installationAddress.setCountryCode(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCountry());
		installationAddress.setCounty(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCounty());
		installationAddress.setFlatNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getFlatNumber());
		installationAddress.setHouseName(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseName());
		installationAddress.setHouseNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseNumber());
		installationAddress.setLocality(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getLocality());
		installationAddress.setMoveTypeCode(MoveTypeCodeEnum.fromValue(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getMoveTypeCode()));
		installationAddress.setPostCode(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getPostCode());
		installationAddress.setStreetName(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getStreetName());
		installationAddress.setCity(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getTown());
		request.setInstallationAddress(installationAddress);
		return request;
	}

	public static FLBBJourneyRequest createFLBBRequestForJourney(AvailabilityCheckRequest availabilityCheckRequest,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse) {
		FLBBJourneyRequest request = new FLBBJourneyRequest();
		FLBBJourneyDetails flbbJourneyDetails = new FLBBJourneyDetails();
		ServicePoint servicePoint = new ServicePoint();
		LineReference lineRefernce = new LineReference();
		InstallationAddress installationAddress = new InstallationAddress();
		Identification identification = new Identification();
		identification.setId(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getIdentification().getId());
		identification.setContextId(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getIdentification().getContextId());
		installationAddress.setIdentification(identification);
		installationAddress.setCitySubDivisionName(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCitySubDivisionName());
		installationAddress.setCountry(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCountry());
		installationAddress.setCounty(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getCounty());
		installationAddress.setFlatNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getFlatNumber());
		installationAddress.setHouseName(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseName());
		installationAddress.setHouseNumber(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getHouseNumber());
		installationAddress.setLocality(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getLocality());
		installationAddress.setMoveTypeCode(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getMoveTypeCode());
		installationAddress.setPostCode(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getPostCode());
		installationAddress.setStreetName(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getStreetName());
		installationAddress.setTown(availabilityCheckRequest.getLineRef().getLineIdentification().getInstallationAddress().getTown());
		lineRefernce.setInstallationAddress(installationAddress);
		if(getServiceAvailabilityResponse.getServiceAvailabilityLine()!=null && !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference()!=null){
					if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator()!=null){
						LineLocator lineLocator = new LineLocator();
						lineLocator.setCableLinkID(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator().getCableLinkID());
						lineLocator.setDistributionPoint(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator().getDistributionPoint());
						lineLocator.setDistrictCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator().getDistrictCode());
						lineLocator.setExchangeCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator().getExchangeCode());
						lineLocator.setExchangeName(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator().getExchangeName());
						lineLocator.setL2SID(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineLocator().getL2SID());
						lineRefernce.setLineLocator(lineLocator);
					}
					if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineSettings()!=null){
						LineSettings lineSettings = new LineSettings();
						lineSettings.setInstallationCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineSettings().getInstallationCode());
						lineSettings.setServiceCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineSettings().getServiceCode());
						lineSettings.setTerminationCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineSettings().getTerminationCode());
						lineRefernce.setLineSettings(lineSettings);
					}
					if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus()!=null){
						LineStatus lineStatus = new LineStatus();
						lineStatus.setAccessLineStatus(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getAccessLineStatus());
						lineStatus.setGNPStatus(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getGnPStatus());
						lineStatus.setLineOption(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getLineOption());
						lineStatus.setLineType(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getLineType());
						lineStatus.setNarrowBandServicesAvailable(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getNarrowBandServicesAvailable());
						if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getStandbyPowerRequired()!=null){
							lineStatus.setStandbyPowerRequired(String.valueOf(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getStandbyPowerRequired()));
						}
						lineStatus.setStatusCode(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getStatusCode());
						lineStatus.setTechnology(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getTechnology());
						if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getTempStructure()!=null){
							lineStatus.setTempStructure(String.valueOf(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineStatus().getTempStructure()));
						}
						lineRefernce.setLineStatus(lineStatus);
					}
					if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getAvailableServices()!=null){
						AvailableServices availableService = new AvailableServices();
						availableService.setService(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getAvailableServices().getService());
						lineRefernce.setAvailableServices(availableService);
					}
					List<LineDirectory> lineDirectoryList = new ArrayList<>();
					if(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineDirectory()!=null
							&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineDirectory().isEmpty()){
						for(com.vf.uk.dal.entity.serviceavailability.LineDirectory lDirectory : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getLineReference().getLineDirectory()){
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
		if(getServiceAvailabilityResponse.getServiceAvailabilityLine()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()){
			for(com.vf.uk.dal.entity.serviceavailability.ServiceLines serviceLinesFromRequest : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()){
				ServiceLines serviceLinesRequestForJourney = new ServiceLines();
				serviceLinesRequestForJourney.setClassificationCode(serviceLinesFromRequest.getClassificationCode());
				serviceLinesRequestForJourney.setNetworkType(serviceLinesFromRequest.getNetworkType());
				List<LineTreatment> lineTreatmentList = new ArrayList<>();
				if(serviceLinesFromRequest.getLineTreatment()!=null && !serviceLinesFromRequest.getLineTreatment().isEmpty()){
					for(com.vf.uk.dal.entity.serviceavailability.LineTreatment lineTreatment : serviceLinesFromRequest.getLineTreatment()){
						LineTreatment lineTreatmentForJourney = new LineTreatment();
						lineTreatmentForJourney.setAppointmentNeeded(lineTreatment.getAppointmentNeeded());
						if(lineTreatment.getConnectionCharge()!=null){
							lineTreatmentForJourney.setConnectionCharge(lineTreatment.getConnectionCharge().toString());
						}
						lineTreatmentForJourney.setEarliestAvailableDate(lineTreatment.getEarliestAvailabilityDate());
						lineTreatmentList.add(lineTreatmentForJourney);
					}
					serviceLinesRequestForJourney.setLineTreatments(lineTreatmentList);
				}
				List<ServiceLine> serviceLineList = new ArrayList<>();
				if(serviceLinesFromRequest.getServiceLine()!=null
						&& !serviceLinesFromRequest.getServiceLine().isEmpty()){
					for(com.vf.uk.dal.entity.serviceavailability.ServiceLine serviceLineFromRequest : serviceLinesFromRequest.getServiceLine()){
						ServiceLine serviceLine = new ServiceLine();
						ItemReference itemReference = new ItemReference();
						itemReference.setClassificationCode(serviceLineFromRequest.getClassificationCode());
						itemReference.setName(serviceLineFromRequest.getProductName());
						itemReference.setIdentificationId(serviceLineFromRequest.getProductCode());
						serviceLine.setItemReference(itemReference);
						
						if(serviceLineFromRequest.getLineSpeeds()!=null){
							LineSpeeds lineSpeeds = new LineSpeeds();
							if(serviceLineFromRequest.getLineSpeeds().getAvgDownSpeed()!=null){
								lineSpeeds.setAvgDownSpeed(String.valueOf(serviceLineFromRequest.getLineSpeeds().getAvgDownSpeed()));
							}
							if(serviceLineFromRequest.getLineSpeeds().getMaxDownSpeed()!=null){
								lineSpeeds.setMaxDownSpeed(String.valueOf(serviceLineFromRequest.getLineSpeeds().getMaxDownSpeed()));
							}
							if(serviceLineFromRequest.getLineSpeeds().getMaxUpSpeed()!=null){
								lineSpeeds.setMaxUpSpeed(String.valueOf(serviceLineFromRequest.getLineSpeeds().getMaxUpSpeed()));
							}
							if(serviceLineFromRequest.getLineSpeeds().getMinDownSpeed()!=null){
								lineSpeeds.setMinDownSpeed(String.valueOf(serviceLineFromRequest.getLineSpeeds().getMinDownSpeed()));
							}
							if(serviceLineFromRequest.getLineSpeeds().getMinGuaranteedDownSpeed()!=null){
								lineSpeeds.setMinGuaranteedDownSpeed(String.valueOf(serviceLineFromRequest.getLineSpeeds().getMinGuaranteedDownSpeed()));
							}
							if(serviceLineFromRequest.getLineSpeeds().getMinUpSpeed()!=null){
								lineSpeeds.setMinUpSpeed(String.valueOf(serviceLineFromRequest.getLineSpeeds().getMinUpSpeed()));
							}
							lineSpeeds.setBandwidthMeasure(serviceLineFromRequest.getLineSpeeds().getBandwidthMeasure());
							serviceLine.setLineSpeeds(lineSpeeds);
						}
						if(serviceLineFromRequest.getMiscReference()!=null){
							MiscReference miscReferenceForJourney = new MiscReference();
							miscReferenceForJourney.setAnfp(serviceLineFromRequest.getMiscReference().getAnfp());
							miscReferenceForJourney.setCustomerAgreedDate(serviceLineFromRequest.getMiscReference().getCustomerAgreedDate());
							miscReferenceForJourney.setLineLength(serviceLineFromRequest.getMiscReference().getLineLength());
							miscReferenceForJourney.setReadyForServiceDate(serviceLineFromRequest.getMiscReference().getReadyForServiceDate());
							miscReferenceForJourney.setServiceProviderName(serviceLineFromRequest.getMiscReference().getServiceProviderName());
							serviceLine.setMiscRefernce(miscReferenceForJourney);
						}
						List<ServiceLineTreatment> serviceLineTreatmentList = new ArrayList<>();
						if(serviceLineFromRequest.getLineTreatment()!=null
								&& !serviceLineFromRequest.getLineTreatment().isEmpty()){
							for(com.vf.uk.dal.entity.serviceavailability.ServiceLineTreatment serviceLineTreatmentReq
									: serviceLineFromRequest.getLineTreatment()){
								ServiceLineTreatment serviceLineTreatment = new ServiceLineTreatment();
								serviceLineTreatment.setParentIdentification(serviceLineTreatmentReq.getLineTreatmentType().toString());
								if(serviceLineTreatmentReq.getCanNumberBeRetained()!=null){
									serviceLineTreatment.setCanNumberBeRetained(String.valueOf(serviceLineTreatmentReq.getCanNumberBeRetained()));
								}
								serviceLineTreatment.setLineInfo(serviceLineTreatmentReq.getLineInfo());
								serviceLineTreatment.setPortInFlag(serviceLineTreatmentReq.getPortInFlag());
								serviceLineTreatment.setServiceAction(serviceLineTreatmentReq.getServiceAction());
								serviceLineTreatment.setServiceType(serviceLineTreatmentReq.getServiceAction());
								serviceLineTreatment.setSimValue(serviceLineTreatmentReq.getSiM2Value());
								serviceLineTreatment.setVicCode(serviceLineTreatmentReq.getViCCode());
								AccessLine accessLineForJourney = new AccessLine();
								accessLineForJourney.setId(serviceLineTreatmentReq.getAccessLineID());
								serviceLineTreatment.setAccessLine(accessLineForJourney);
								List<PendingOrder> pendingOrderList = new ArrayList<>();
								if(serviceLineTreatmentReq.getPendingOrder()!=null
										&& !serviceLineTreatmentReq.getPendingOrder().isEmpty()){
									for(com.vf.uk.dal.entity.serviceavailability.PendingOrder pendingOrderFromGSA : serviceLineTreatmentReq.getPendingOrder()){
										PendingOrder pendingOrderForJourney = new PendingOrder();
										pendingOrderForJourney.setCompletionDate(pendingOrderFromGSA.getCompletionDate());
										if(pendingOrderFromGSA.getThirdPartyFlag()!=null){
											pendingOrderForJourney.setThirdPartyFlag(String.valueOf(pendingOrderFromGSA.getThirdPartyFlag()));
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
		}
		
		flbbJourneyDetails.setServicePoint(servicePoint);
		request.setFlbbJourneyDetails(flbbJourneyDetails);
		return request;
	}

	public static AvailabilityCheckResponse createAvailabilityCheckResponse(AvailabilityCheckResponse response,
			GetServiceAvailibilityResponse getServiceAvailabilityResponse) {
		if(getServiceAvailabilityResponse.getServiceAvailabilityLine()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds()!=null){
			
	com.vf.uk.dal.braodband.entity.LineSpeeds lineSpeedForResponse = new com.vf.uk.dal.braodband.entity.LineSpeeds();
	lineSpeedForResponse.setAvgDownSpeed(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getAvgDownSpeed());
	lineSpeedForResponse.setBandwidthMeasure(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getBandwidthMeasure());
	lineSpeedForResponse.setMaxDownSpeed(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getMaxDownSpeed());
	lineSpeedForResponse.setMaxUpSpeed(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getMaxUpSpeed());
	lineSpeedForResponse.setMinDownSpeed(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getMinDownSpeed());	
	lineSpeedForResponse.setMinGuaranteedDownSpeed(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getMinGuaranteedDownSpeed());
	lineSpeedForResponse.setMinUpSpeed(getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().get(0).getServiceLine().get(0).getLineSpeeds().getMinUpSpeed());
	response.setLineSpeeds(lineSpeedForResponse);
			
		}
		return response;
	}

}
