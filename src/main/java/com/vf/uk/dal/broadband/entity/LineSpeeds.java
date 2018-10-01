package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineSpeeds.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class LineSpeeds {

	/** The package name. */
	@JsonProperty("packageName")
	private String packageName = null;

	/** The max down speed. */
	@JsonProperty("maxDownSpeed")
	private Double maxDownSpeed = null;

	/** The min down speed. */
	@JsonProperty("minDownSpeed")
	private Double minDownSpeed = null;

	/** The avg down speed. */
	@JsonProperty("avgDownSpeed")
	private Double avgDownSpeed = null;

	/** The min guaranteed down speed. */
	@JsonProperty("minGuaranteedDownSpeed")
	private Double minGuaranteedDownSpeed = null;

	/** The max up speed. */
	@JsonProperty("maxUpSpeed")
	private Double maxUpSpeed = null;

	/** The min up speed. */
	@JsonProperty("minUpSpeed")
	private Double minUpSpeed = null;

	/** The bandwidth measure. */
	@JsonProperty("bandwidthMeasure")
	private String bandwidthMeasure = null;

}
