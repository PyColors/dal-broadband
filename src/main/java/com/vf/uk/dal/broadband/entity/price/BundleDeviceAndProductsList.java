package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundleDeviceAndProductsList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class BundleDeviceAndProductsList {
	@JsonProperty("accessoryList")
	@Valid
	private List<String> accessoryList = null;

	@JsonProperty("bundleId")
	private String bundleId = null;

	@JsonProperty("deviceId")
	private String deviceId = null;

	@JsonProperty("extraList")
	@Valid
	private List<String> extraList = null;

	@JsonProperty("installationType")
	private String installationType = null;

	@JsonProperty("offerCode")
	private String offerCode = null;

	@JsonProperty("packageType")
	private String packageType = null;

	@JsonProperty("preOrderable")
	private Boolean preOrderable = null;

}
