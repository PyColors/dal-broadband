package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * IncompatibleServices.
 */
@Data
public class IncompatibleServices {
	
	/** The service. */
	@JsonProperty("service")
	private List<String> service = new ArrayList<>();

	
}
