package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineDirectory.
 */
@Data
public class LineDirectory implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1780612777649837824L;

	/** The Constant FEATURECODE. */
	private static final String FEATURE_CODE = "featureCode";

	/** The Constant DIRECTORYCODE. */
	private static final String DIRECTORY_CODE = "directoryCode";

	/** The Constant LOCALTIONCODE. */
	private static final String LOCATION_CODE = "locationCode";

	/** The feature code. */
	@JsonProperty(FEATURE_CODE)
	private String featureCode;

	/** The directory code. */
	@JsonProperty(DIRECTORY_CODE)
	private String directoryCode;

	/** The localtion code. */
	@JsonProperty(LOCATION_CODE)
	private String locationCode;

}
