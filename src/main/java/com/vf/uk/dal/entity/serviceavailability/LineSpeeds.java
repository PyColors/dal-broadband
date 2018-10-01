package com.vf.uk.dal.entity.serviceavailability;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineSpeeds.
 */
@Data
public class LineSpeeds {

	/** The max down speed. */
	@JsonProperty("maxDownSpeed")
	private Double maxDownSpeed = null;

	/** The min down speed. */
	@JsonProperty("minDownSpeed")
	private Double minDownSpeed = null;

	/** The min guaranteed down speed. */
	@JsonProperty("minGuaranteedDownSpeed")
	private Double minGuaranteedDownSpeed = null;

	/** The max up speed. */
	@JsonProperty("maxUpSpeed")
	private Double maxUpSpeed = null;

	/** The min up speed. */
	@JsonProperty("minUpSpeed")
	private Double minUpSpeed = null;

	/** The avg down speed. */
	@JsonProperty("avgDownSpeed")
	private Double avgDownSpeed = null;

	/** The bandwidth measure. */
	@JsonProperty("bandwidthMeasure")
	private String bandwidthMeasure = null;

}
