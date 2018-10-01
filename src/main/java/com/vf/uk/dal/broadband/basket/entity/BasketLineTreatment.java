package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineTreatment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T09:39:43.102Z")
@Data
public class BasketLineTreatment {
	@JsonProperty("appointmentNeeded")
	private Boolean appointmentNeeded = null;

	@JsonProperty("connectionCharge")
	private String connectionCharge = null;

	@JsonProperty("earliestAvailableDate")
	private String earliestAvailableDate = null;

	@JsonProperty("identification")
	private String identification = null;

	@JsonProperty("preOrder")
	private Boolean preOrder = null;

	@JsonProperty("registerOfInterest")
	private Boolean registerOfInterest = null;

}
