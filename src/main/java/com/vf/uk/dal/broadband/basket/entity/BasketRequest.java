package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Basket
 */

@Data
public class BasketRequest {

	@JsonProperty("packageId")
	private String packageId;

	@JsonProperty("addBundle")
	private AddBundle addBundle;

	@JsonProperty("addHardware")
	private AddHardware addHardware;

	@JsonProperty("serviceIds")
	private List<String> serviceIds = new ArrayList<>();

	@JsonProperty("selectedPackageCode")
	private String selectedPackageCode = null;

	@JsonProperty("source")
	private String source = null;

	@JsonProperty("customerRequestedDate")
	private String customerRequestedDate = null;

}
