package com.vf.uk.dal.broadband.controller.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyResponse;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.common.registry.client.Utility;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
public class BroadbandControllerTest {

	@Autowired
	BroadbandController broadBandController;
	
	@MockBean
	RegistryClient registryClient;
	
	@MockBean
	RestTemplate restTemplate;
	
	@Before
	public void setupMockBehaviour() throws Exception {
		given(registryClient.getRestTemplate()).willReturn(restTemplate);
		String jsonString = new String(Utility.readFile("\\rest-mock\\GSAREQUEST.json"));
		GetServiceAvailibilityRequest request = new ObjectMapper().readValue(jsonString, GetServiceAvailibilityRequest.class);
		
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GSAResponse.json"));
		GetServiceAvailibilityResponse response = new ObjectMapper().readValue(jsonString1, GetServiceAvailibilityResponse.class);
		
		String jsonString2 = new String(Utility.readFile("\\rest-mock\\FLBBREQUEST.json"));
		FLBBJourneyRequest flbbRequestForJourney = new ObjectMapper().readValue(jsonString2, FLBBJourneyRequest.class);
		
		/*String jsonString2 = new String(Utility.readFile("\\rest-mock\\FLBBREQUEST.json"));
		FLBBJourneyRequest requestForFLBB = new ObjectMapper().readValue(jsonString2, FLBBJourneyRequest.class);*/
		
		given(restTemplate.postForEntity("http://UTILITY-V1/utility/broadbandServiceAvailability",request , GetServiceAvailibilityResponse.class)).
		willReturn(new ResponseEntity<GetServiceAvailibilityResponse>(response, HttpStatus.OK));
		
		FLBBJourneyResponse responeForFLBB = new FLBBJourneyResponse();
		responeForFLBB.setJourneyId("123456789");
		
		
	}
	
	@Test
	public void testCheckAvailabilityForBroadband(){
		ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			 String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AvailabilityCheckResponse resonse = broadBandController.checkAvailabilityForBroadband(request);
		assertNotNull(resonse);
	}

	
	
	@Test
	public void testCheckAvailabilityForBroadbandForNonLoggedInCustomer(){
		ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			 String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AvailabilityCheckResponse resonse = broadBandController.checkAvailabilityForBroadband(request);
		assertNotNull(resonse);
	}
	
	
}
