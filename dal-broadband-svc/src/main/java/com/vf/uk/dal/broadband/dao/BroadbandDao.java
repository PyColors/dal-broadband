package com.vf.uk.dal.broadband.dao;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

public interface BroadbandDao {

	GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest);

	void updateJourneyWithFLBBDetails(String journeyId, FLBBJourneyRequest flbbRequestForJourney);

	String createJourneyWithFLBBDetails(FLBBJourneyRequest flbbRequestForJourney);

}
