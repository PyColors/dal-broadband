package com.vf.uk.dal.broadband.svc;

import java.math.BigDecimal;
import java.util.List;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.ServiceStartDates;

public interface BroadbandService {

	AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest);

	List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria);

	ServiceStartDates getAvailableServiceStartDates(String earliestAvailableStartDate, BigDecimal range);
}
