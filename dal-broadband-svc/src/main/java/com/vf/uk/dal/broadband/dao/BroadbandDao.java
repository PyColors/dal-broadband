package com.vf.uk.dal.broadband.dao;

import java.util.List;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vodafone.solrmodels.ProductModel;

public interface BroadbandDao {

	GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest);

	void updateJourneyWithFLBBDetails(String journeyId, FLBBJourneyRequest flbbRequestForJourney);

	String createJourneyWithFLBBDetails(FLBBJourneyRequest flbbRequestForJourney);
	
	BundleDetails getBundleDetailsFromGetBundleListAPI(String url);

	List<ProductModel> getListOfProductModelsBasedOnProductIdList(List<String> productIdList);

	void getSolrConnection();

}
