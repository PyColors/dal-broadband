package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CheckOutBasket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data

public class CheckOutBasket {
	@JsonProperty("affiliateId")
	private String affiliateId = null;

	@JsonProperty("basketId")
	private String basketId = null;

	@JsonProperty("customerRequestedDate")
	private String customerRequestedDate = null;

	@JsonProperty("deliveryInfo")
	private DeliveryInfo deliveryInfo = null;

	@JsonProperty("hashvalue")
	private String hashvalue = null;

	@JsonProperty("journey")
	private Journey journey = null;

	@JsonProperty("packages")
	@Valid
	private List<CheckOutPackage> packages = null;

	@JsonProperty("priceDetails")
	private PriceDetails priceDetails = null;

	@JsonProperty("source")
	private String source = null;

	@JsonProperty("validated")
	private Boolean validated = null;

	@JsonProperty("vetOutcome")
	private VetOutcome vetOutcome = null;

	@JsonProperty("voucherCode")
	private String voucherCode = null;

	@JsonProperty("voucherDescription")
	private String voucherDescription = null;

}
