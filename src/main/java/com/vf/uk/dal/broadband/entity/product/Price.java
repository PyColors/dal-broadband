package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Price.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
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
