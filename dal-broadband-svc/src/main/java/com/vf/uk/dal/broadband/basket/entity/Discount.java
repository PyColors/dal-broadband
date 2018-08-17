package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Discount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Discount {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("confirmedRequired")
	private String confirmedRequired = null;

	@JsonProperty("discountValue")
	private DiscountValue discountValue = null;

	@JsonProperty("duration")
	private String duration = null;

	@JsonProperty("label")
	private String label = null;

	@JsonProperty("merchandisingMedia")
	@Valid
	private List<MediaLinks> merchandisingMedia = null;

	@JsonProperty("productLineId")
	private String productLineId = null;

	@JsonProperty("skuId")
	private String skuId = null;

	@JsonProperty("tag")
	private String tag = null;

	@JsonProperty("tenure")
	private String tenure = null;

}
