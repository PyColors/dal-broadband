package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * GetServiceAvailibilityResponse.
 */
@Data
public class GetServiceAvailibilityResponse {
	
	/** The service availability line. */
	@JsonProperty("serviceAvailabilityLine")
	private List<ServiceAvailabilityLine> serviceAvailabilityLine = new ArrayList<>();

	/** The warning error list. */
	@JsonProperty("warningErrorList")
	private List<ErrorInfo> warningErrorList = null;

	
}
