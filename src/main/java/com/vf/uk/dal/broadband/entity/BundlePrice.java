package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundlePrice.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class BundlePrice {

	/** The bundle id. */
	@JsonProperty("bundleId")
	private String bundleId = null;

	/** The monthly price. */
	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	/** The monthly discount price. */
	@JsonProperty("monthlyDiscountPrice")
	private Price monthlyDiscountPrice = null;

	/** The merchandising promotions. */
	@JsonProperty("merchandisingPromotions")
	private MerchandisingPromotion merchandisingPromotions = null;

}
