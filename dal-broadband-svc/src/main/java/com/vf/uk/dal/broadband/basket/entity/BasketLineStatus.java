package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineStatus.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketLineStatus {

	/** The access line status. */
	@JsonProperty("accessLineStatus")
	private String accessLineStatus = null;

	/** The gnp status. */
	@JsonProperty("gnpStatus")
	private String gnpStatus = null;

	/** The line option. */
	@JsonProperty("lineOption")
	private String lineOption = null;

	/** The line type. */
	@JsonProperty("lineType")
	private String lineType = null;

	/** The narrow band services available. */
	@JsonProperty("narrowBandServicesAvailable")
	private String narrowBandServicesAvailable = null;

	/** The standby power required. */
	@JsonProperty("standbyPowerRequired")
	private Boolean standbyPowerRequired = null;

	/** The status code. */
	@JsonProperty("statusCode")
	private String statusCode = null;

	/** The technology. */
	@JsonProperty("technology")
	private String technology = null;

	/** The temp structure. */
	@JsonProperty("tempStructure")
	private Boolean tempStructure = null;

}
