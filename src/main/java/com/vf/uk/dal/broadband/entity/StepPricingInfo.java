package com.vf.uk.dal.broadband.entity;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * StepPricingInfo.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class StepPricingInfo {

	/** The sequence. */
	@JsonProperty("sequence")
	private String sequence = null;

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	/** The monthly price. */
	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	/** The duration. */
	@JsonProperty("duration")
	private Duration duration = null;

	/** The discount sku ids. */
	@JsonProperty("discountSkuIds")
	private List<UUID> discountSkuIds = null;

}
