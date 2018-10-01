package com.vf.uk.dal.broadband.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PriceForBundleAndHardware.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")
@Data
public class RouterPriceForHardware {

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	/** The one off discount price. */
	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

}
