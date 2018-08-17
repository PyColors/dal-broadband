package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BoxPrice.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class BoxPrice {

	/** The price gross. */
	@JsonProperty("priceGross")
	private String priceGross = null;

	/** The price net. */
	@JsonProperty("priceNet")
	private String priceNet = null;

	/** The price VAT. */
	@JsonProperty("priceVAT")
	private String priceVAT = null;

}
