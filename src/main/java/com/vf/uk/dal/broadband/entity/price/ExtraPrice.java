package com.vf.uk.dal.broadband.entity.price;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ExtraPrice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class ExtraPrice {
	@JsonProperty("extraId")
	private String extraId = null;

	@JsonProperty("merchandisingPromotions")
	private MerchandisingPromotion merchandisingPromotions = null;

	@JsonProperty("monthlyDiscountPrice")
	private Price monthlyDiscountPrice = null;

	@JsonProperty("monthlyPrice")
	private Price monthlyPrice = null;

	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

}
