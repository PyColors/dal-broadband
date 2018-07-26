package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PriceForBundleAndHardware.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

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

	/**
	 * Bundle price.
	 *
	 * @param bundlePrice the bundle price
	 * @return the price for bundle and hardware
	 */
	public PriceForBBBundleAndHardware bundlePrice(BundlePrice bundlePrice) {
		this.bundlePrice = bundlePrice;
		return this;
	}

	/**
	 * Get bundlePrice.
	 *
	 * @return bundlePrice
	 */
	@ApiModelProperty(value = "")

	@Valid

	public BundlePrice getBundlePrice() {
		return bundlePrice;
	}

	/**
	 * Sets the bundle price.
	 *
	 * @param bundlePrice the new bundle price
	 */
	public void setBundlePrice(BundlePrice bundlePrice) {
		this.bundlePrice = bundlePrice;
	}

	
	/**
	 * Router price.
	 *
	 * @param routerPrice the router price
	 * @return the price for bundle and hardware
	 */
	public PriceForBBBundleAndHardware routerPrice(HardwarePrice routerPrice) {
		this.routerPrice = routerPrice;
		return this;
	}

	
	/**
	 * Gets the router price.
	 *
	 * @return the router price
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HardwarePrice getRouterPrice() {
		return routerPrice;
	}

	
	/**
	 * Sets the router price.
	 *
	 * @param routerPrice the new router price
	 */
	public void setRouterPrice(HardwarePrice routerPrice) {
		this.routerPrice = routerPrice;
	}

	/**
	 * Delivery price.
	 *
	 * @param deliveryPrice the delivery price
	 * @return the price for bundle and hardware
	 */
	public PriceForBBBundleAndHardware deliveryPrice(HardwarePrice deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
		return this;
	}

	
	/**
	 * Gets the delivery price.
	 *
	 * @return the delivery price
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HardwarePrice getDeliveryPrice() {
		return deliveryPrice;
	}

	/**
	 * Sets the delivery price.
	 *
	 * @param deliveryPrice the new delivery price
	 */
	public void setDeliveryPrice(HardwarePrice deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	/**
	 * Engineer visit fees.
	 *
	 * @param engineerVisitFees the engineer visit fees
	 * @return the price for bundle and hardware
	 */
	public PriceForBBBundleAndHardware engineerVisitFees(HardwarePrice engineerVisitFees) {
		this.engineerVisitFees = engineerVisitFees;
		return this;
	}

	
	/**
	 * Gets the engineer visit fees.
	 *
	 * @return the engineer visit fees
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HardwarePrice getEngineerVisitFees() {
		return engineerVisitFees;
	}

	/**
	 * Sets the engineer visit fees.
	 *
	 * @param engineerVisitFees the new engineer visit fees
	 */
	public void setEngineerVisitFees(HardwarePrice engineerVisitFees) {
		this.engineerVisitFees = engineerVisitFees;
	}

	/**
	 * Total cost.
	 *
	 * @param totalOneOffCost the total one off cost
	 * @return the price for bundle and hardware
	 */
	public PriceForBBBundleAndHardware totalOneOffCost(Price totalOneOffCost) {
		this.totalOneOffCost = totalOneOffCost;
		return this;
	}

	
	/**
	 * Gets the total cost.
	 *
	 * @return the total cost
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Price getTotalOneOffCost() {
		return totalOneOffCost;
	}

	/**
	 * Sets the total cost.
	 *
	 * @param totalOneOffCost the new total one off cost
	 */
	public void setTotalOneOffCost(Price totalOneOffCost) {
		this.totalOneOffCost = totalOneOffCost;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PriceForBBBundleAndHardware priceForBundleAndHardware = (PriceForBBBundleAndHardware) o;
		return Objects.equals(this.bundlePrice, priceForBundleAndHardware.bundlePrice)
				&& Objects.equals(this.routerPrice, priceForBundleAndHardware.routerPrice)
				&& Objects.equals(this.deliveryPrice, priceForBundleAndHardware.deliveryPrice)
				&& Objects.equals(this.engineerVisitFees, priceForBundleAndHardware.engineerVisitFees)
				&& Objects.equals(this.totalOneOffCost, priceForBundleAndHardware.totalOneOffCost);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(bundlePrice, routerPrice, deliveryPrice, engineerVisitFees, totalOneOffCost);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PriceForBundleAndHardware {\n");

		sb.append("    bundlePrice: ").append(toIndentedString(bundlePrice)).append("\n");
		sb.append("    routerPrice: ").append(toIndentedString(routerPrice)).append("\n");
		sb.append("    deliveryPrice: ").append(toIndentedString(deliveryPrice)).append("\n");
		sb.append("    engineerVisitFees: ").append(toIndentedString(engineerVisitFees)).append("\n");
		sb.append("    totalOneOffCost: ").append(toIndentedString(totalOneOffCost)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
