package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * A composite object which holds all the details about the various types of
 * promotions applicable on the selected plan or hardware or the combination of
 * both.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T14:46:40.485Z")
@Data
public class RouterMerchandisingPromotions {

	/** The hardware promotions. */
	@JsonProperty("hardwarePromotions")
	private RouterMerchandisingPromotionsWrapper hardwarePromotions = null;

}
