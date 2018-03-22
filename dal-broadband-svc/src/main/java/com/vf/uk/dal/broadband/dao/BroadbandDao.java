package com.vf.uk.dal.broadband.dao;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.Journey;
import com.vf.uk.dal.broadband.entity.journey.SalesOrderAppointmentRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vodafone.solrmodels.ProductModel;

/**
 * @author Infosys limited
 *
 */
public interface BroadbandDao {

	
	/**
	 * get the service availablity of the bb.
	 * @param availabilityCheckRequest
	 * @return GetServiceAvailibilityResponse
	 */
	
	GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest);

	/**
	 *  Update FLBB Journey
	 * @param journeyId
	 * @param flbbRequestForJourney
	 */
	
	void updateJourneyWithFLBBDetails(String journeyId, FLBBJourneyRequest flbbRequestForJourney);

	/**
	 *  create FLBB Journey
	 * @param flbbRequestForJourney
	 * @return createJourneyWithFLBBDetails
	 */
	
	String createJourneyWithFLBBDetails(FLBBJourneyRequest flbbRequestForJourney);

	/**
	 * Get the bundle details from Bundle List
	 * @param url
	 * @return BundleDetails
	 */
	BundleDetails getBundleDetailsFromGetBundleListAPI(String url);

	/**
	 *  Get the list of Product
	 * @param productIdList
	 * @return List<ProductModel>
	 */
	
	List<ProductModel> getListOfProductModelsBasedOnProductIdList(List<String> productIdList);

	/**
	 * Solr Connection
	 */
	
	void getSolrConnection();

	/**
	 * get the holiday list
	 * @param startDate
	 * @param endDate
	 * @return List<LocalDate>
	 * @throws ParseException
	 */
	
	List<LocalDate> getHolidayList(LocalDate startDate, LocalDate endDate) throws ParseException;

	/**
	 * Get the journey
	 * @param journeyId
	 * @return Journey
	 */
	
	Journey getJourney(String journeyId);

	/**
	 * Creates the appointment
	 * @param createAppointmentReq
	 * @return CreateAppointment
	 */
	
	CreateAppointment createAppointment(
			com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createAppointmentReq);

	/**
	 * Update the journey
	 * @param journeyId
	 * @param appointmentRequest
	 */
	
	void updateJourneyStateForAppointment(String journeyId, SalesOrderAppointmentRequest appointmentRequest);

	/**
	 * 
	 * @return List<ProductModel>
	 */
	
	List<ProductModel> getEngineeringVisitProduct();

	AddressInfo getAddressInfoByPostcodeFromPremise(String postCode);
}
