package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * HardwarePrice.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class HardwarePrice {

	/** The hardware id. */
	@JsonProperty("hardwareId")
	private String hardwareId = null;

	/** The hardware name. */
	@JsonProperty("hardwareName")
	private String hardwareName = null;

	/** The one off price. */
	@JsonProperty("oneOffPrice")
	private Price oneOffPrice = null;

	/** The one off discount price. */
	@JsonProperty("oneOffDiscountPrice")
	private Price oneOffDiscountPrice = null;

	/** The merchandising promotions. */
	@JsonProperty("merchandisingPromotions")
	private MerchandisingPromotion merchandisingPromotions = null;

	/**
	 * Hardware name.
	 *
	 * @param hardwareName the hardware name
	 * @return the hardware price
	 */
	public HardwarePrice hardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
		return this;
	}

	/**
	 * Gets the hardware name.
	 *
	 * @return the hardware name
	 */
	@ApiModelProperty(value = "Name of hardware, whose price to be calculated")
	public String getHardwareName() {
		return hardwareName;
	}

	/**
	 * Sets the hardware name.
	 *
	 * @param hardwareName the new hardware name
	 */
	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	/**
	 * Hardware id.
	 *
	 * @param hardwareId the hardware id
	 * @return the hardware price
	 */
	public HardwarePrice hardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
		return this;
	}

	/**
	 * Hardware id of the price to be calculated.
	 *
	 * @return hardwareId
	 */
	@ApiModelProperty(value = "Hardware id of the price to be calculated")

	public String getHardwareId() {
		return hardwareId;
	}

	/**
	 * Sets the hardware id.
	 *
	 * @param hardwareId the new hardware id
	 */
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	/**
	 * One off price.
	 *
	 * @param oneOffPrice the one off price
	 * @return the hardware price
	 */
	public HardwarePrice oneOffPrice(Price oneOffPrice) {
		this.oneOffPrice = oneOffPrice;
		return this;
	}

	/**
	 * Get oneOffPrice.
	 *
	 * @return oneOffPrice
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Price getOneOffPrice() {
		return oneOffPrice;
	}

	/**
	 * Sets the one off price.
	 *
	 * @param oneOffPrice the new one off price
	 */
	public void setOneOffPrice(Price oneOffPrice) {
		this.oneOffPrice = oneOffPrice;
	}

	/**
	 * One off discount price.
	 *
	 * @param oneOffDiscountPrice the one off discount price
	 * @return the hardware price
	 */
	public HardwarePrice oneOffDiscountPrice(Price oneOffDiscountPrice) {
		this.oneOffDiscountPrice = oneOffDiscountPrice;
		return this;
	}

	/**
	 * Get oneOffDiscountPrice.
	 *
	 * @return oneOffDiscountPrice
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Price getOneOffDiscountPrice() {
		return oneOffDiscountPrice;
	}

	/**
	 * Sets the one off discount price.
	 *
	 * @param oneOffDiscountPrice the new one off discount price
	 */
	public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
		this.oneOffDiscountPrice = oneOffDiscountPrice;
	}

	/**
	 * Merchandising promotions.
	 *
	 * @param merchandisingPromotions the merchandising promotions
	 * @return the hardware price
	 */
	public HardwarePrice merchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
		this.merchandisingPromotions = merchandisingPromotions;
		return this;
	}

	/**
	 * Merchandising promotions applicable for the bundle.
	 *
	 * @return merchandisingPromotions
	 */
	@ApiModelProperty(value = "Merchandising promotions applicable for the bundle")

	@Valid

	public MerchandisingPromotion getMerchandisingPromotions() {
		return merchandisingPromotions;
	}

	/**
	 * Sets the merchandising promotions.
	 *
	 * @param merchandisingPromotions the new merchandising promotions
	 */
	public void setMerchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
		this.merchandisingPromotions = merchandisingPromotions;
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
		HardwarePrice hardwarePrice = (HardwarePrice) o;
		return Objects.equals(this.hardwareId, hardwarePrice.hardwareId)
				&& Objects.equals(this.oneOffPrice, hardwarePrice.oneOffPrice)
				&& Objects.equals(this.oneOffDiscountPrice, hardwarePrice.oneOffDiscountPrice)
				&& Objects.equals(this.merchandisingPromotions, hardwarePrice.merchandisingPromotions);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(hardwareId, oneOffPrice, oneOffDiscountPrice, merchandisingPromotions);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HardwarePrice {\n");

		sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
		sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
		sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
		sb.append("    merchandisingPromotions: ").append(toIndentedString(merchandisingPromotions)).append("\n");
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
