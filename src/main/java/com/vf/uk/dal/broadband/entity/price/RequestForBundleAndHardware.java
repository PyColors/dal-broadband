package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * RequestForBundleAndHardware
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class RequestForBundleAndHardware {
	@JsonProperty("activePackages")
	@Valid
	private List<ActivePackagesInRequest> activePackages = null;

	@JsonProperty("billingType")
	private String billingType = null;

	@JsonProperty("bundleAndHardwareList")
	@Valid
	private List<BundleAndHardwareTuple> bundleAndHardwareList = null;

	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("offerCode")
	private String offerCode = null;

	@JsonProperty("packageType")
	private String packageType = null;

}
