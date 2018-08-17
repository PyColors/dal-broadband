package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * VetOutcome.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class VetOutcome {

	/** The available number of connections. */
	@JsonProperty("availableNumberOfConnections")
	private String availableNumberOfConnections = null;

	/** The available recurring charge limit. */
	@JsonProperty("availableRecurringChargeLimit")
	private String availableRecurringChargeLimit = null;

	/** The credit vet id. */
	@JsonProperty("creditVetId")
	private String creditVetId = null;

	/** The outcome code. */
	@JsonProperty("outcomeCode")
	private String outcomeCode = null;

}
