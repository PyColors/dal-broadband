package com.vf.uk.dal.broadband.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MerchandisingPromotionsWrapper.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")
@Data
public class MerchandisingPromotionsWrapper {

	/** The conditional sash banner promotion. */
	@JsonProperty("conditionalSashBannerPromotion")
	private MerchandisingPromotion conditionalSashBannerPromotion = null;

	/** The data promotion. */
	@JsonProperty("dataPromotion")
	private MerchandisingPromotion dataPromotion = null;

	/** The entertainment pack promotion. */
	@JsonProperty("entertainmentPackPromotion")
	private MerchandisingPromotion entertainmentPackPromotion = null;

	/** The free accessory promotion. */
	@JsonProperty("freeAccessoryPromotion")
	private MerchandisingPromotion freeAccessoryPromotion = null;

	/** The free extra promotion. */
	@JsonProperty("freeExtraPromotion")
	private MerchandisingPromotion freeExtraPromotion = null;

	/** The price promotion. */
	@JsonProperty("pricePromotion")
	private MerchandisingPromotion pricePromotion = null;

	/** The sash banner promotion. */
	@JsonProperty("sashBannerPromotion")
	private MerchandisingPromotion sashBannerPromotion = null;

	/** The secure net promotion. */
	@JsonProperty("secureNetPromotion")
	private MerchandisingPromotion secureNetPromotion = null;

	/** The talk time promotion. */
	@JsonProperty("talkTimePromotion")
	private MerchandisingPromotion talkTimePromotion = null;

	/** The text promotion. */
	@JsonProperty("textPromotion")
	private MerchandisingPromotion textPromotion = null;

}
