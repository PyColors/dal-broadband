package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * HardwarePrice.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class HardwarePrice {

	/** The hardware id. */
	@JsonProperty("hardwareId")
	private String hardwareId = null;

	/** The hardware name. */
	@JsonProperty("hardwareName")
	private String hardwareName = null;

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	/** The one off discount price. */
	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

	/** The merchandising promotions. */
	@JsonProperty("merchandisingPromotions")
	private MerchandisingPromotion merchandisingPromotions = null;

}
