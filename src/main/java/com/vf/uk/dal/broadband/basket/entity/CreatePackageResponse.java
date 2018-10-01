package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CreatePackageResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class CreatePackageResponse {
	@JsonProperty("accountCategory")
	private String accountCategory = null;

	@JsonProperty("bundle")
	private Bundle bundle = null;

	@JsonProperty("dependentOn")
	@Valid
	private List<String> dependentOn = null;

	@JsonProperty("discounts")
	@Valid
	private List<Discount> discounts = null;

	@JsonProperty("hardwares")
	@Valid
	private List<Hardware> hardwares = null;

	@JsonProperty("isChanged")
	private Boolean isChanged = null;

	@JsonProperty("packageId")
	private String packageId = null;

	@JsonProperty("packageType")
	private String packageType = null;

	@JsonProperty("priceDetails")
	private PriceDetails priceDetails = null;

	@JsonProperty("removable")
	private Boolean removable = null;

	@JsonProperty("sequence")
	private Integer sequence = null;

	@JsonProperty("services")
	@Valid
	private List<Service> services = null;

	@JsonProperty("voucherCode")
	private String voucherCode = null;

}
