package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * DeviceBriefDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class DeviceBriefDescription {
	@JsonProperty("key")
	private String key = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("valueUOM")
	private String valueUOM = null;

}
