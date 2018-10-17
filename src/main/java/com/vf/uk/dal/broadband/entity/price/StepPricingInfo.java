package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * StepPricingInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class StepPricingInfo {
	@JsonProperty("discountsApplicable")
	@Valid
	private List<Discount> discountsApplicable = null;

	@JsonProperty("duration")
	private Duration duration = null;

	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	@JsonProperty("sequence")
	private String sequence = null;

}
