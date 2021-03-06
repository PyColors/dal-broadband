package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Discount.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class Discount {

	/** The amount. */
	@JsonProperty("amount")
	private Double amount = null;

	/** The type. */
	@JsonProperty("type")
	private String type = null;

}
