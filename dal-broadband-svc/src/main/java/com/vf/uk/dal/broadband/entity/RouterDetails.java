package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class RouterDetails {

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The display name. */
	@JsonProperty("displayName")
	private String displayName = null;

	/** The is default device. */
	@JsonProperty("isDefaultDevice")
	private Boolean isDefaultDevice = null;

	/** The list of image UR ls. */
	@JsonProperty("listOfImageURLs")
	@Valid
	private List<ImageURL> listOfImageURLs = null;

	/** The price info. */
	@JsonProperty("priceInfo")
	private RouterPriceForHardware priceInfo = null;

	/** The product id. */
	@JsonProperty("productId")
	private String productId = null;

	/** The product name. */
	@JsonProperty("productName")
	private String productName = null;

	/** The promotion packages. */
	@JsonProperty("promotionPackages")
	private RouterMerchandisingPromotions promotionPackages = null;

	/**
	 * Description.
	 *
	 * @param description the description
	 * @return the router details
	 */
	public RouterDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * pre desc from commercial product.
	 *
	 * @return description
	 */
	@ApiModelProperty(value = "pre desc from commercial product")

	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Display name.
	 *
	 * @param displayName the display name
	 * @return the router details
	 */
	public RouterDetails displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Type of relation ship.
	 *
	 * @return displayName
	 */
	@ApiModelProperty(value = "Type of relation ship")

	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 *
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Checks if is default device.
	 *
	 * @param isDefaultDevice the is default device
	 * @return the router details
	 */
	public RouterDetails isDefaultDevice(Boolean isDefaultDevice) {
		this.isDefaultDevice = isDefaultDevice;
		return this;
	}

	/**
	 * set to true if device is default.
	 *
	 * @return isDefaultDevice
	 */

	public Boolean isIsDefaultDevice() {
		return isDefaultDevice;
	}

	/**
	 * Sets the checks if is default device.
	 *
	 * @param isDefaultDevice the new checks if is default device
	 */
	public void setIsDefaultDevice(Boolean isDefaultDevice) {
		this.isDefaultDevice = isDefaultDevice;
	}

	/**
	 * List of image UR ls.
	 *
	 * @param listOfImageURLs the list of image UR ls
	 * @return the router details
	 */
	public RouterDetails listOfImageURLs(List<ImageURL> listOfImageURLs) {
		this.listOfImageURLs = listOfImageURLs;
		return this;
	}

	/**
	 * Adds the list of image UR ls item.
	 *
	 * @param listOfImageURLsItem the list of image UR ls item
	 * @return the router details
	 */
	public RouterDetails addListOfImageURLsItem(ImageURL listOfImageURLsItem) {
		if (this.listOfImageURLs == null) {
			this.listOfImageURLs = new ArrayList<>();
		}
		this.listOfImageURLs.add(listOfImageURLsItem);
		return this;
	}

	/**
	 * Get listOfImageURLs.
	 *
	 * @return listOfImageURLs
	 */
	@ApiModelProperty(value = "")

	@Valid

	public List<ImageURL> getListOfImageURLs() {
		return listOfImageURLs;
	}

	/**
	 * Sets the list of image UR ls.
	 *
	 * @param listOfImageURLs the new list of image UR ls
	 */
	public void setListOfImageURLs(List<ImageURL> listOfImageURLs) {
		this.listOfImageURLs = listOfImageURLs;
	}

	/**
	 * Price info.
	 *
	 * @param priceInfo the price info
	 * @return the router details
	 */
	public RouterDetails priceInfo(RouterPriceForHardware priceInfo) {
		this.priceInfo = priceInfo;
		return this;
	}

	/**
	 * Get priceInfo.
	 *
	 * @return priceInfo
	 */
	@ApiModelProperty(value = "")

	@Valid

	public RouterPriceForHardware getPriceInfo() {
		return priceInfo;
	}

	/**
	 * Sets the price info.
	 *
	 * @param priceInfo the new price info
	 */
	public void setPriceInfo(RouterPriceForHardware priceInfo) {
		this.priceInfo = priceInfo;
	}

	/**
	 * Product id.
	 *
	 * @param productId the product id
	 * @return the router details
	 */
	public RouterDetails productId(String productId) {
		this.productId = productId;
		return this;
	}

	/**
	 * Name of the bundle relationship.
	 *
	 * @return productId
	 */
	@ApiModelProperty(value = "Name of the bundle relationship")

	public String getProductId() {
		return productId;
	}

	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	

	/**
	 * Product name.
	 *
	 * @param productName the product name
	 * @return the router details
	 */
	public RouterDetails productName(String productName) {
		this.productName = productName;
		return this;
	}

	/**
	 * Name of the bundle relationship.
	 *
	 * @return productName
	 */
	@ApiModelProperty(value = "Name of the bundle relationship")

	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Promotion packages.
	 *
	 * @param promotionPackages the promotion packages
	 * @return the router details
	 */
	public RouterDetails promotionPackages(RouterMerchandisingPromotions promotionPackages) {
		this.promotionPackages = promotionPackages;
		return this;
	}

	/**
	 * Get promotionPackages.
	 *
	 * @return promotionPackages
	 */
	@ApiModelProperty(value = "")

	@Valid

	public RouterMerchandisingPromotions getPromotionPackages() {
		return promotionPackages;
	}

	/**
	 * Sets the promotion packages.
	 *
	 * @param promotionPackages the new promotion packages
	 */
	public void setPromotionPackages(RouterMerchandisingPromotions promotionPackages) {
		this.promotionPackages = promotionPackages;
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
		RouterDetails productDetails = (RouterDetails) o;
		return Objects.equals(this.description, productDetails.description)
				&& Objects.equals(this.displayName, productDetails.displayName)
				&& Objects.equals(this.isDefaultDevice, productDetails.isDefaultDevice) &&

				Objects.equals(this.listOfImageURLs, productDetails.listOfImageURLs) &&

				Objects.equals(this.priceInfo, productDetails.priceInfo) &&

				Objects.equals(this.productId, productDetails.productId)
				&& Objects.equals(this.productName, productDetails.productName)
				&& Objects.equals(this.promotionPackages, productDetails.promotionPackages);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(description, displayName, isDefaultDevice, listOfImageURLs, priceInfo, productId, productName, promotionPackages);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductDetails {\n");

		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    isDefaultDevice: ").append(toIndentedString(isDefaultDevice)).append("\n");

		sb.append("    listOfImageURLs: ").append(toIndentedString(listOfImageURLs)).append("\n");

		sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");

		sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
		sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
		sb.append("    promotionPackages: ").append(toIndentedString(promotionPackages)).append("\n");
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
