package com.vf.uk.dal.broadband.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.Constants;



@RestController
@RequestMapping("/")
public class BroadbandController {

@Autowired
BroadbandService broadbandService;
	
	
	@RequestMapping(value = "/availability/check", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public AvailabilityCheckResponse checkAvailabilityForBroadband(@RequestBody AvailabilityCheckRequest availabilityCheckRequest) {
	return	 broadbandService.checkAvailabilityForBroadband(availabilityCheckRequest);
	
	}	
	
	/**
	 * Handles requests for GetFlbbList Service
	 * 
	 * @param queryParams
	 * 
	 * @return List<FlbBundle>
	 **/
	@RequestMapping(value = "/bundle/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FlbBundle> getFlbList(@RequestParam Map<String, String> queryParams) {
		String userType = queryParams.containsKey(Constants.USER_TYPE) ? queryParams.get(Constants.USER_TYPE) : null;
		List<FlbBundle> listOfFlbBundle;
		GetBundleListSearchCriteria getBundleListSearchCriteria = new GetBundleListSearchCriteria();
		getBundleListSearchCriteria.setUserType(userType);
		String journeyType = queryParams.containsKey(Constants.JOURNEY_TYPE) ? queryParams.get(Constants.JOURNEY_TYPE)
				: null;
		String offerCode = queryParams.containsKey(Constants.OFFER_CODE) ? queryParams.get(Constants.OFFER_CODE) : null;
		String duration = queryParams.containsKey(Constants.DURATION) ? queryParams.get(Constants.DURATION) : null;
		String classificationCode = queryParams.containsKey(Constants.CLASSIFICATION_CODE)
				? queryParams.get(Constants.CLASSIFICATION_CODE) : null;
		getBundleListSearchCriteria.setJourneyType(journeyType);
		getBundleListSearchCriteria.setOfferCode(offerCode);
		getBundleListSearchCriteria.setClassificationCode(classificationCode);
		getBundleListSearchCriteria.setDuration(duration);
		getBundleListSearchCriteria.setBundleClass("FLBALL");
		listOfFlbBundle = broadbandService.getFlbList(getBundleListSearchCriteria);
		return listOfFlbBundle;
	}
	
	
	
}
