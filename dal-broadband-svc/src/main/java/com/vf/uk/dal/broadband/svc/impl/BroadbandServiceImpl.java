package com.vf.uk.dal.broadband.svc.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.braodband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.braodband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@Component("broadbandService")
public class BroadbandServiceImpl implements BroadbandService {
	
	@Autowired
	BroadbandDao broadbandDao;

	@Override
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest) {
		AvailabilityCheckResponse response = new AvailabilityCheckResponse();
		GetServiceAvailibilityResponse getServiceAvailabilityResponse = broadbandDao.getServiceAvailability(availabilityCheckRequest);
		FLBBJourneyRequest flbbRequestForJourney = ConverterUtils.createFLBBRequestForJourney(availabilityCheckRequest,getServiceAvailabilityResponse);
		if(StringUtils.isNotBlank(availabilityCheckRequest.getJourneyId())){
			broadbandDao.updateJourneyWithFLBBDetails(availabilityCheckRequest.getJourneyId(), flbbRequestForJourney);
			response.setJourneyId(availabilityCheckRequest.getJourneyId());
		}else{
			String	journeyId = broadbandDao.createJourneyWithFLBBDetails(flbbRequestForJourney);
			response.setJourneyId(journeyId);
		}
		response = ConverterUtils.createAvailabilityCheckResponse(response,getServiceAvailabilityResponse);
		return response;
	}

}
