package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * IncompatibleChildProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class IncompatibleChildProduct {
	@JsonProperty("cardinalityIncompatibility")
	private CardinalityIncompatibility cardinalityIncompatibility = null;

	@JsonProperty("excludesIncompatibility")
	private ExcludesIncompatibility excludesIncompatibility = null;

	@JsonProperty("productId")
	private String productId = null;

	@JsonProperty("requiresIncompatibility")
	private RequiresIncompatibility requiresIncompatibility = null;

	@JsonProperty("unavailable")
	private Boolean unavailable = null;

}
