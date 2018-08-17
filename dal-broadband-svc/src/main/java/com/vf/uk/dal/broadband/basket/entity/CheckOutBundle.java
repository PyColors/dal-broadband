package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CheckOutBundle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data

public class CheckOutBundle {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = null;

	@JsonProperty("displayName")
	private String displayName = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("packageLineId")
	private String packageLineId = null;

	@JsonProperty("paymentType")
	private String paymentType = null;

	@JsonProperty("priceDetails")
	private BundlePrices priceDetails = null;

	@JsonProperty("productClass")
	private String productClass = null;

	@JsonProperty("serviceId")
	private String serviceId = null;

	@JsonProperty("skuId")
	private String skuId = null;

}
