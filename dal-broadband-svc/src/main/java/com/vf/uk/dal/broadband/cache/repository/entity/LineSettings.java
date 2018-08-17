package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineSettings.
 */
@Data
public class LineSettings implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1518759682831766008L;

	/** The Constant SERVICECODE. */
	private static final String SERVICE_CODE = "serviceCode";

	/** The Constant INSTALLATIONCODE. */
	private static final String INSTALLATION_CODE = "installationCode";

	/** The Constant TERMINATIONCODE. */
	private static final String TERMINATION_CODE = "terminationCode";

	/** The service code. */
	@JsonProperty(SERVICE_CODE)
	private String serviceCode;

	/** The installation code. */
	@JsonProperty(INSTALLATION_CODE)
	private String installationCode;

	/** The termination code. */
	@JsonProperty(TERMINATION_CODE)
	private String terminationCode;

}
