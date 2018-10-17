package com.vf.uk.dal.broadband.entity.price;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ExistingDiscount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class ExistingDiscount {
	@JsonProperty("discountId")
	private String discountId = null;

	@JsonProperty("offerId")
	private String offerId = null;

	@JsonProperty("qualifier")
	private Identifier qualifier = null;

}
