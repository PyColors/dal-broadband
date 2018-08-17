package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Hardware
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Hardware {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = null;

	@JsonProperty("boxPrice")
	private Price boxPrice = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("deviceBriefDescription")
	@Valid
	private List<DeviceBriefDescription> deviceBriefDescription = null;

	@JsonProperty("deviceColor")
	private String deviceColor = null;

	@JsonProperty("displayDescription")
	private String displayDescription = null;

	@JsonProperty("displayName")
	private String displayName = null;

	@JsonProperty("displayOrder")
	private Integer displayOrder = null;

	@JsonProperty("freeGift")
	private Boolean freeGift = null;

	@JsonProperty("groupType")
	private String groupType = null;

	@JsonProperty("isChanged")
	private Boolean isChanged = null;

	@JsonProperty("make")
	private String make = null;

	@JsonProperty("memorySize")
	private String memorySize = null;

	@JsonProperty("merchandisingMedia")
	@Valid
	private List<MediaLinks> merchandisingMedia = null;

	@JsonProperty("model")
	private String model = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("packageLineId")
	private String packageLineId = null;

	@JsonProperty("priceDetails")
	private HardwarePrices priceDetails = null;

	@JsonProperty("productClass")
	private String productClass = null;

	@JsonProperty("showInSummary")
	private Boolean showInSummary = null;

	@JsonProperty("skuId")
	private String skuId = null;

}
