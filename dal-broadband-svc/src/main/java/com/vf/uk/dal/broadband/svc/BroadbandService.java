package com.vf.uk.dal.broadband.svc;

import com.vf.uk.dal.braodband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.braodband.entity.AvailabilityCheckResponse;

public interface BroadbandService {

	AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest);

}
