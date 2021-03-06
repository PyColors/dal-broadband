package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PriceForBasket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class PriceForBasket {
	@JsonProperty("activePackages")
	@Valid
	private List<ActivePackagesInResponse> activePackages = null;

	@JsonProperty("monthlyDiscountPrice")
	private Price monthlyDiscountPrice = null;

	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	@JsonProperty("packages")
	@Valid
	private List<PriceForPackage> packages = null;

	@JsonProperty("stepPrices")
	@Valid
	private List<StepPricingInfo> stepPrices = null;

	@JsonProperty("totalMonthlyPriceSaving")
	private String totalMonthlyPriceSaving = null;

	@JsonProperty("totalOneoffPriceSaving")
	private String totalOneoffPriceSaving = null;

}
