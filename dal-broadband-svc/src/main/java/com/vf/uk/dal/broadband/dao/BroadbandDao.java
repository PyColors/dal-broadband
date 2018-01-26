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
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vodafone.solrmodels.ProductModel;

public interface BroadbandDao {

	GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest);

	void updateJourneyWithFLBBDetails(String journeyId, FLBBJourneyRequest flbbRequestForJourney);

	String createJourneyWithFLBBDetails(FLBBJourneyRequest flbbRequestForJourney);

	BundleDetails getBundleDetailsFromGetBundleListAPI(String url);

	List<ProductModel> getListOfProductModelsBasedOnProductIdList(List<String> productIdList);

	void getSolrConnection();

	List<LocalDate> getHolidayList(LocalDate startDate, LocalDate endDate) throws ParseException;

	Journey getJourney(String journeyId);

	CreateAppointment createAppointment(
			com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createAppointmentReq);

	void updateJourneyStateForAppointment(String journeyId, SalesOrderAppointmentRequest appointmentRequest);

	List<ProductModel> getEngineeringVisitProduct();
}
