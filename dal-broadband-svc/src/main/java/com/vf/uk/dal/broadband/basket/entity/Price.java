package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Price.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Price {

	/** The gross. */
	@JsonProperty("gross")
	private String gross = null;

	/** The net. */
	@JsonProperty("net")
	private String net = null;

	/** The vat. */
	@JsonProperty("vat")
	private String vat = null;

}
