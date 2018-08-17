package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * DeliveryInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class DeliveryInfo {
	@JsonProperty("availableFrom")
	private String availableFrom = null;

	@JsonProperty("deliveryType")
	private String deliveryType = null;

	@JsonProperty("displayName")
	private String displayName = null;

	@JsonProperty("price")
	private Price price = null;

	@JsonProperty("skuId")
	private String skuId = null;

	@JsonProperty("stockStatus")
	private String stockStatus = null;

	@JsonProperty("storeInfo")
	private StoreInfo storeInfo = null;

}
