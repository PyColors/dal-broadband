package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PriceForBundleAndHardware.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")
@Data
public class PriceForBundleAndHardware {

	/** The bundle price. */
	@JsonProperty("bundlePrice")
	private BundlePrice bundlePrice = null;

	/** The hardware price. */
	@JsonProperty("hardwarePrice")
	private HardwarePrice hardwarePrice = null;

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	/** The one off discount price. */
	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

	/** The monthly price. */
	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	/** The monthly discount price. */
	@JsonProperty("monthlyDiscountPrice")
	private Price monthlyDiscountPrice = null;

	/** The step prices. */
	@JsonProperty("stepPrices")
	@Valid
	private List<StepPricingInfo> stepPrices = null;

}
