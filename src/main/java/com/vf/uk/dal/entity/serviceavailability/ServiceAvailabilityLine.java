package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceAvailabilityLine.
 */
@Data
public class ServiceAvailabilityLine {

	/** The line reference. */
	@JsonProperty("lineReference")
	private LineReference lineReference = null;

	/** The service lines. */
	@JsonProperty("serviceLines")
	private List<ServiceLines> serviceLines = new ArrayList<>();

}
