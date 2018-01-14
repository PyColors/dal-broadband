package com.vf.uk.dal.broadband.svc.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.ServiceLines;

@Component("broadbandService")
public class BroadbandServiceImpl implements BroadbandService {
	
	@Autowired
	BroadbandDao broadbandDao;

	@Override
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest) {
		AvailabilityCheckResponse response = new AvailabilityCheckResponse();
		GetServiceAvailibilityResponse getServiceAvailabilityResponse = broadbandDao.getServiceAvailability(availabilityCheckRequest);
		boolean isClassificationCodePresent = false;
		if(getServiceAvailabilityResponse.getServiceAvailabilityLine()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().isEmpty()
				&& getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()!=null
				&& !getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines().isEmpty()){
			for(ServiceLines serviceLines : getServiceAvailabilityResponse.getServiceAvailabilityLine().get(0).getServiceLines()){
				if(availabilityCheckRequest.getClassificationCode()!=null
						&& availabilityCheckRequest.getClassificationCode().contains(serviceLines.getClassificationCode())){
					isClassificationCodePresent = true;
					break;
				}
			}
		}
		if(isClassificationCodePresent
				|| availabilityCheckRequest.getClassificationCode().isEmpty()){
			FLBBJourneyRequest flbbRequestForJourney = ConverterUtils.createFLBBRequestForJourney(availabilityCheckRequest,getServiceAvailabilityResponse);
			if(StringUtils.isNotBlank(availabilityCheckRequest.getJourneyId())){
				broadbandDao.updateJourneyWithFLBBDetails(availabilityCheckRequest.getJourneyId(), flbbRequestForJourney);
				response.setJourneyId(availabilityCheckRequest.getJourneyId());
			}else{
				String	journeyId = broadbandDao.createJourneyWithFLBBDetails(flbbRequestForJourney);
				response.setJourneyId(journeyId);
			}
			response = ConverterUtils.createAvailabilityCheckResponse(response,getServiceAvailabilityResponse,availabilityCheckRequest);
		}else{
			LogHelper.error(this, "Invalid classification code !!!");
			throw new ApplicationException("INVALID_CLASSIFICATION_CODE");
		}
		
		
		return response;
	}

}
