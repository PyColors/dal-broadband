package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineSpeeds.
 */
@Data
public class LineSpeeds implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3990739801444955407L;

	/** The Constant MAXDOWNSPEED. */
	private static final String MAXDOWN_SPEED = "maxDownSpeed";

	/** The Constant MINDOWNSPEED. */
	private static final String MINDOWN_SPEED = "minDownSpeed";

	/** The Constant AVGDOWNSPEED. */
	private static final String AVGDOWN_SPEED = "avgDownSpeed";

	/** The Constant MINGUARANTEEDDOWNSPEED. */
	private static final String MINGUARANTEEDDOWN_SPEED = "minGuaranteedDownSpeed";

	/** The Constant MAXUPSPEED. */
	private static final String MAXUP_SPEED = "maxUpSpeed";

	/** The Constant MINUPSPEED. */
	private static final String MINUP_SPEED = "minUpSpeed";

	/** The Constant BANDWIDTHMEASURE. */
	private static final String BANDWIDTH_MEASURE = "bandwidthMeasure";

	/** The max down speed. */
	@JsonProperty(MAXDOWN_SPEED)
	private String maxDownSpeed;

	/** The min down speed. */
	@JsonProperty(MINDOWN_SPEED)
	private String minDownSpeed;

	/** The avg down speed. */
	@JsonProperty(AVGDOWN_SPEED)
	private String avgDownSpeed;

	/** The min guaranteed down speed. */
	@JsonProperty(MINGUARANTEEDDOWN_SPEED)
	private String minGuaranteedDownSpeed;

	/** The max up speed. */
	@JsonProperty(MAXUP_SPEED)
	private String maxUpSpeed;

	/** The min up speed. */
	@JsonProperty(MINUP_SPEED)
	private String minUpSpeed;

	/** The bandwidth measure. */
	@JsonProperty(BANDWIDTH_MEASURE)
	private String bandwidthMeasure;

}
