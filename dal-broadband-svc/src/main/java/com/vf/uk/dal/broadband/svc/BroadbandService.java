package com.vf.uk.dal.broadband.svc;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.ServiceStartDates;

public interface BroadbandService {

	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest);

	public List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria);

	public ServiceStartDates getAvailableServiceStartDates(String earliestAvailableStartDate, BigDecimal range)
			throws DateTimeParseException, ParseException;
}
