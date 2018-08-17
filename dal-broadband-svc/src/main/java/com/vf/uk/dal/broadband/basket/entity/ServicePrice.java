package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServicePrice.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class ServicePrice {

	/** The merchandising promotions. */
	@JsonProperty("merchandisingPromotions")
	private MerchandisingPromotions merchandisingPromotions = null;

	/** The monthly discount price. */
	@JsonProperty("monthlyDiscountPrice")
	private Price monthlyDiscountPrice = null;

	/** The monthly price. */
	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	/** The one off discount price. */
	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

}
