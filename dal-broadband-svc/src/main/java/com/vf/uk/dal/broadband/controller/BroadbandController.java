package com.vf.uk.dal.broadband.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vf.uk.dal.braodband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.braodband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.svc.BroadbandService;



@RestController
@RequestMapping("/")
public class BroadbandController {

@Autowired
BroadbandService broadbandService;
	
	
	@RequestMapping(value = "/availability/check", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public AvailabilityCheckResponse checkAvailabilityForBroadband(@RequestBody AvailabilityCheckRequest availabilityCheckRequest) {
		AvailabilityCheckResponse availabilityCheckRes = broadbandService.checkAvailabilityForBroadband(availabilityCheckRequest);
	return null;
	}	
	
	
}
