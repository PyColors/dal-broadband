package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketLineSettings {
	@JsonProperty("installationCode")
	private String installationCode = null;

	@JsonProperty("serviceCode")
	private String serviceCode = null;

	@JsonProperty("terminationCode")
	private String terminationCode = null;

}
