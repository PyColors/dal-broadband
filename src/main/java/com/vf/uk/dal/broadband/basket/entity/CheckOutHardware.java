package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CheckOutHardware
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data

public class CheckOutHardware {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = null;

	@JsonProperty("boxPrice")
	private Price boxPrice = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("displayName")
	private String displayName = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("packageLineId")
	private String packageLineId = null;

	@JsonProperty("priceDetails")
	private HardwarePrices priceDetails = null;

	@JsonProperty("productClass")
	private String productClass = null;

	@JsonProperty("skuId")
	private String skuId = null;

}
