package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PriceForBundleAndHardware.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class PriceForBBBundleAndHardware {

	/** The bundle price. */
	@JsonProperty("bundlePrice")
	private BundlePrice bundlePrice = null;

	/** The router price. */
	@JsonProperty("routerPrice")
	private HardwarePrice routerPrice = null;

	/** The delivery price. */
	@JsonProperty("deliveryPrice")
	private HardwarePrice deliveryPrice = null;

	/** The engineer visit fees. */
	@JsonProperty("engineerVisitFees")
	private HardwarePrice engineerVisitFees = null;

	/** The total cost. */
	@JsonProperty("totalCost")
	private Price totalOneOffCost = null;

}
