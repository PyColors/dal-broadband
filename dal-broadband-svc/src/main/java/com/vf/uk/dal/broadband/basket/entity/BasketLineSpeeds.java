package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineSpeeds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketLineSpeeds {
	@JsonProperty("avgDownSpeed")
	private String avgDownSpeed = null;

	@JsonProperty("bandwidthMeasure")
	private String bandwidthMeasure = null;

	@JsonProperty("maxDownSpeed")
	private String maxDownSpeed = null;

	@JsonProperty("maxUpSpeed")
	private String maxUpSpeed = null;

	@JsonProperty("minDownSpeed")
	private String minDownSpeed = null;

	@JsonProperty("minGuaranteedDownSpeed")
	private String minGuaranteedDownSpeed = null;

	@JsonProperty("minUpSpeed")
	private String minUpSpeed = null;

}
