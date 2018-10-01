package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineSettings.
 */
@Data
public class LineSettings {

	/** The service code. */
	@JsonProperty("serviceCode")
	private String serviceCode = null;

	/** The installation code. */
	@JsonProperty("installationCode")
	private String installationCode = null;

	/** The termination code. */
	@JsonProperty("terminationCode")
	private String terminationCode = null;

}
