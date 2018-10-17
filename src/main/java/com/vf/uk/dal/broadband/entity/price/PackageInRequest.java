package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PackageInRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class PackageInRequest {
	@JsonProperty("billingType")
	private String billingType = null;

	@JsonProperty("bundleId")
	private String bundleId = null;

	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("confirmRequired")
	private Boolean confirmRequired = null;

	@JsonProperty("deviceFinancingTuple")
	@Valid
	private List<DeviceFinancingTuple> deviceFinancingTuple = null;

	@JsonProperty("hardwareIds")
	@Valid
	private List<String> hardwareIds = null;

	@JsonProperty("installationType")
	private String installationType = null;

	@JsonProperty("offerCode")
	private String offerCode = null;

	@JsonProperty("packageId")
	private String packageId = null;

	@JsonProperty("packageType")
	private String packageType = null;

	@JsonProperty("preOrderable")
	private Boolean preOrderable = null;

	@JsonProperty("serviceIds")
	@Valid
	private List<String> serviceIds = null;

	@JsonProperty("voucherMPs")
	@Valid
	private List<String> voucherMPs = null;

}
