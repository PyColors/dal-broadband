package com.vf.uk.dal.broadband.svc;

import java.util.List;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;

public interface BroadbandService {

	AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest);
	List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria);

}
