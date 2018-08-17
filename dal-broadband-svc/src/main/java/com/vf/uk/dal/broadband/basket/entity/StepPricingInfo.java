package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * StepPricingInfo.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class StepPricingInfo {

	/** The discount sku ids. */
	@JsonProperty("discountSkuIds")
	@Valid
	private List<String> discountSkuIds = null;

	/** The duration. */
	@JsonProperty("duration")
	private String duration = null;

	/** The monthly price. */
	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	/** The sequence. */
	@JsonProperty("sequence")
	private String sequence = null;

}
