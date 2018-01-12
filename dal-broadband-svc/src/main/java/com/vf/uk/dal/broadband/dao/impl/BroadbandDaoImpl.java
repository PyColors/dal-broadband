package com.vf.uk.dal.broadband.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyResponse;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@Component("broadbandDao")
public class BroadbandDaoImpl implements BroadbandDao {
	 
	@Autowired
	private RegistryClient registryClient;

	@Override
	public GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest) {
		
		RestTemplate restTemplate = registryClient.getRestTemplate();
		GetServiceAvailibilityResponse availabilityCheckResponse = null;
		GetServiceAvailibilityRequest request = ConverterUtils.createGetServiceAvailibilityRequest(availabilityCheckRequest);
		ResponseEntity<GetServiceAvailibilityResponse> client = restTemplate
				.postForEntity("http://UTILITY-V1/utility/broadbandServiceAvailability", request, GetServiceAvailibilityResponse.class);
		if (client != null)
			availabilityCheckResponse = client.getBody();

		return availabilityCheckResponse;
	}

	@Override
	public void updateJourneyWithFLBBDetails(String journeyId, FLBBJourneyRequest flbbRequestForJourney) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		restTemplate.put("http://JOURNEY-V1/journey/"+journeyId+"/flbb", flbbRequestForJourney);
		
	}

	@Override
	public String createJourneyWithFLBBDetails(FLBBJourneyRequest flbbRequestForJourney) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		ResponseEntity<FLBBJourneyResponse> client = restTemplate.postForEntity("http://JOURNEY-V1/journey/flbb", flbbRequestForJourney, FLBBJourneyResponse.class);
		
		if(client!=null){
			FLBBJourneyResponse flbbResponse = client.getBody();
			if(flbbResponse!=null){
				return flbbResponse.getJourneyId();
			}
			return null;
		}
		return null;
	}

}
