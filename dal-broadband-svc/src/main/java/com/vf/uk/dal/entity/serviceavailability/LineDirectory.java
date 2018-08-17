package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineDirectory.
 */
@Data
public class LineDirectory {

	/** The feature code. */
	@JsonProperty("featureCode")
	private String featureCode = null;

	/** The directory code. */
	@JsonProperty("directoryCode")
	private String directoryCode = null;

	/** The location code. */
	@JsonProperty("locationCode")
	private String locationCode = null;

}
