package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * FlbBundle.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class FlbBundle {
	
	/** The sku id. */
	@JsonProperty("skuId")
	private String skuId = null;

	/** The name. */
	@JsonProperty("name")
	private String name = null;

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The bundle name. */
	@JsonProperty("bundleName")
	private String bundleName = null;

	/** The bundle description. */
	@JsonProperty("bundleDescription")
	private String bundleDescription = null;

	/** The bundle features. */
	@JsonProperty("bundleFeatures")
	private String bundleFeatures = null;

	/** The speed. */
	@JsonProperty("speed")
	private Speed speed = null;

	/** The usage. */
	@JsonProperty("usage")
	private String usage = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The commitment period. */
	@JsonProperty("commitmentPeriod")
	private String commitmentPeriod = null;

	/** The product name. */
	@JsonProperty("productName")
	private String productName = null;

	/** The product description. */
	@JsonProperty("productDescription")
	private String productDescription = null;

	/** The merchandising media. */
	@JsonProperty("merchandisingMedia")
	private List<MediaLink> merchandisingMedia = null;

	/** The price info. */
	@JsonProperty("priceInfo")
	private PriceForBBBundleAndHardware priceInfo = null;

	/** The is speed less. */
	@JsonProperty("isSpeedLess")
	private Boolean isSpeedLess = null;

	/** The is selected. */
	@JsonProperty("isSelected")
	private Boolean isSelected = null;

	/** The pre orderable. */
	@JsonProperty("preOrderable")
	private Boolean preOrderable = null;

	/** The earliest available date. */
	@JsonProperty("earliestAvailableDate")
	private String earliestAvailableDate = null;
	
	/** The line rental price. */
	@JsonProperty("lineRentalPrice")
	private Price lineRentalPrice = null;

	/**
	 * Earliest available date.
	 *
	 * @param earliestAvailableDate the earliest available date
	 * @return the flb bundle
	 */

	public FlbBundle earliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
		return this;
	}

	/**
	 * The earliest available date when the service will be available.
	 *
	 * @return earliestAvailableDate
	 */
	@ApiModelProperty(value = "The earliest available date when the service will be available")

	public String getEarliestAvailableDate() {
		return earliestAvailableDate;
	}

	/**
	 * Sets the earliest available date.
	 *
	 * @param earliestAvailableDate the new earliest available date
	 */
	public void setEarliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
	}

	/**
	 * Pre orderable.
	 *
	 * @param preOrderable the pre orderable
	 * @return the flb bundle
	 */
	public FlbBundle preOrderable(Boolean preOrderable) {
		this.preOrderable = preOrderable;
		return this;
	}

	/**
	 * Unique bundle id as available from the product catalogue.
	 *
	 * @return skuId
	 */

	public Boolean isPreOrderable() {
		return preOrderable;
	}

	/**
	 * Sets the pre orderable.
	 *
	 * @param preOrderable the new pre orderable
	 */
	public void setPreOrderable(Boolean preOrderable) {
		this.preOrderable = preOrderable;
	}

	/**
	 * Sku id.
	 *
	 * @param skuId the sku id
	 * @return the flb bundle
	 */
	public FlbBundle skuId(String skuId) {
		this.skuId = skuId;
		return this;
	}

	/**
	 * Unique bundle id as available from the product catalogue.
	 *
	 * @return skuId
	 */
	@ApiModelProperty(value = "Unique bundle id as available from the product catalogue")

	public String getSkuId() {
		return skuId;
	}

	/**
	 * Sets the sku id.
	 *
	 * @param skuId the new sku id
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 * Name.
	 *
	 * @param name the name
	 * @return the flb bundle
	 */
	public FlbBundle name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the bundle as provided in the product catalogue.
	 *
	 * @return name
	 */
	@ApiModelProperty(value = "Name of the bundle as provided in the product catalogue")

	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Description.
	 *
	 * @param description the description
	 * @return the flb bundle
	 */
	public FlbBundle description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the bundle as provided in the product catalogue.
	 *
	 * @return description
	 */
	@ApiModelProperty(value = "Description of the bundle as provided in the product catalogue")

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
	 * Bundle features.
	 *
	 * @param bundleFeatures the bundle features
	 * @return the flb bundle
	 */
	public FlbBundle bundleFeatures(String bundleFeatures) {
		this.bundleFeatures = bundleFeatures;
		return this;
	}

	/**
	 * Gets the bundle features.
	 *
	 * @return the bundle features
	 */
	public String getBundleFeatures() {
		return bundleFeatures;
	}

	/**
	 * Sets the bundle features.
	 *
	 * @param bundleFeatures the new bundle features
	 */
	public void setBundleFeatures(String bundleFeatures) {
		this.bundleFeatures = bundleFeatures;
	}

	/**
	 * Bundle name.
	 *
	 * @param bundleName the bundle name
	 * @return the flb bundle
	 */
	public FlbBundle bundleName(String bundleName) {
		this.bundleName = bundleName;
		return this;
	}

	/**
	 * Name of the bundle as provided in the merchandising file.
	 *
	 * @return bundleName
	 */
	@ApiModelProperty(value = "Name of the bundle as provided in the merchandising file")

	public String getBundleName() {
		return bundleName;
	}

	/**
	 * Sets the bundle name.
	 *
	 * @param bundleName the new bundle name
	 */
	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	/**
	 * Bundle description.
	 *
	 * @param bundleDescription the bundle description
	 * @return the flb bundle
	 */
	public FlbBundle bundleDescription(String bundleDescription) {
		this.bundleDescription = bundleDescription;
		return this;
	}

	/**
	 * Description of the bundle as provided in the merchandising file.
	 *
	 * @return bundleDescription
	 */
	@ApiModelProperty(value = "Description of the bundle as provided in the merchandising file")

	public String getBundleDescription() {
		return bundleDescription;
	}

	/**
	 * Sets the bundle description.
	 *
	 * @param bundleDescription the new bundle description
	 */
	public void setBundleDescription(String bundleDescription) {
		this.bundleDescription = bundleDescription;
	}

	/**
	 * Speed.
	 *
	 * @param speed the speed
	 * @return the flb bundle
	 */
	public FlbBundle speed(Speed speed) {
		this.speed = speed;
		return this;
	}

	/**
	 * Speed of the bundle as provided in the merchandising file.
	 *
	 * @return speed
	 */
	@ApiModelProperty(value = "Speed of the bundle as provided in the merchandising file")

	public Speed getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed.
	 *
	 * @param speed the new speed
	 */
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	/**
	 * Usage.
	 *
	 * @param usage the usage
	 * @return the flb bundle
	 */
	public FlbBundle usage(String usage) {
		this.usage = usage;
		return this;
	}

	/**
	 * Usage of the bundle as provided in the merchandising file.
	 *
	 * @return usage
	 */
	@ApiModelProperty(value = "Usage of the bundle as provided in the merchandising file")

	public String getUsage() {
		return usage;
	}

	/**
	 * Sets the usage.
	 *
	 * @param usage the new usage
	 */
	public void setUsage(String usage) {
		this.usage = usage;
	}

	/**
	 * Classification code.
	 *
	 * @param classificationCode the classification code
	 * @return the flb bundle
	 */
	public FlbBundle classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * ClassificationCode of the Flb bundle as provided in the Product catalogue.
	 *
	 * @return classificationCode
	 */
	@ApiModelProperty(value = "ClassificationCode of the Flb bundle as provided in the Product catalogue")

	public String getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Commitment period.
	 *
	 * @param commitmentPeriod the commitment period
	 * @return the flb bundle
	 */
	public FlbBundle commitmentPeriod(String commitmentPeriod) {
		this.commitmentPeriod = commitmentPeriod;
		return this;
	}

	/**
	 * Commitment period of the bundle.
	 *
	 * @return commitmentPeriod
	 */
	@ApiModelProperty(value = "Commitment period of the bundle")

	public String getCommitmentPeriod() {
		return commitmentPeriod;
	}

	/**
	 * Sets the commitment period.
	 *
	 * @param commitmentPeriod the new commitment period
	 */
	public void setCommitmentPeriod(String commitmentPeriod) {
		this.commitmentPeriod = commitmentPeriod;
	}

	/**
	 * Product name.
	 *
	 * @param productName the product name
	 * @return the flb bundle
	 */
	public FlbBundle productName(String productName) {
		this.productName = productName;
		return this;
	}

	/**
	 * Name of the Product(Router) as provided in the product catalogue.
	 *
	 * @return productName
	 */
	@ApiModelProperty(value = "Name of the Product(Router) as provided in the product catalogue")

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
	 * Product description.
	 *
	 * @param productDescription the product description
	 * @return the flb bundle
	 */
	public FlbBundle productDescription(String productDescription) {
		this.productDescription = productDescription;
		return this;
	}

	/**
	 * Description of the Product(Router) as provided in the product catalogue.
	 *
	 * @return productDescription
	 */
	@ApiModelProperty(value = "Description of the Product(Router) as provided in the product catalogue")

	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * Sets the product description.
	 *
	 * @param productDescription the new product description
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * Merchandising media.
	 *
	 * @param merchandisingMedia the merchandising media
	 * @return the flb bundle
	 */
	public FlbBundle merchandisingMedia(List<MediaLink> merchandisingMedia) {
		this.merchandisingMedia = merchandisingMedia;
		return this;
	}

	/**
	 * Adds the merchandising media item.
	 *
	 * @param merchandisingMediaItem the merchandising media item
	 * @return the flb bundle
	 */
	public FlbBundle addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
		if (this.merchandisingMedia == null) {
			this.merchandisingMedia = new ArrayList<>();
		}
		this.merchandisingMedia.add(merchandisingMediaItem);
		return this;
	}

	/**
	 * Get merchandisingMedia.
	 *
	 * @return merchandisingMedia
	 */
	@ApiModelProperty(value = "")

	@Valid

	public List<MediaLink> getMerchandisingMedia() {
		return merchandisingMedia;
	}

	/**
	 * Sets the merchandising media.
	 *
	 * @param merchandisingMedia the new merchandising media
	 */
	public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
		this.merchandisingMedia = merchandisingMedia;
	}

	/**
	 * Price info.
	 *
	 * @param priceInfo the price info
	 * @return the flb bundle
	 */
	public FlbBundle priceInfo(PriceForBBBundleAndHardware priceInfo) {
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

	public PriceForBBBundleAndHardware getPriceInfo() {
		return priceInfo;
	}

	/**
	 * Sets the price info.
	 *
	 * @param priceInfo the new price info
	 */
	public void setPriceInfo(PriceForBBBundleAndHardware priceInfo) {
		this.priceInfo = priceInfo;
	}

	/**
	 * Gets the checks if is speed less.
	 *
	 * @return the checks if is speed less
	 */
	public Boolean getIsSpeedLess() {
		return isSpeedLess;
	}

	/**
	 * Sets the checks if is speed less.
	 *
	 * @param isSpeedLess the new checks if is speed less
	 */
	public void setIsSpeedLess(Boolean isSpeedLess) {
		this.isSpeedLess = isSpeedLess;
	}

	/**
	 * Gets the checks if is selected.
	 *
	 * @return the checks if is selected
	 */
	public Boolean getIsSelected() {
		return isSelected;
	}

	/**
	 * Sets the checks if is selected.
	 *
	 * @param isSelected the new checks if is selected
	 */
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	/**
	 * Gets the line rental price.
	 *
	 * @return the line rental price
	 */
	public Price getLineRentalPrice() {
		return lineRentalPrice;
	}

	/**
	 * Sets the line rental price.
	 *
	 * @param lineRentalPrice the new line rental price
	 */
	public void setLineRentalPrice(Price lineRentalPrice) {
		this.lineRentalPrice = lineRentalPrice;
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
		FlbBundle flbBundle = (FlbBundle) o;
		return Objects.equals(this.skuId, flbBundle.skuId) && Objects.equals(this.name, flbBundle.name)
				&& Objects.equals(this.description, flbBundle.description)
				&& Objects.equals(this.bundleName, flbBundle.bundleName)
				&& Objects.equals(this.bundleFeatures, flbBundle.bundleFeatures)
				&& Objects.equals(this.bundleDescription, flbBundle.bundleDescription)
				&& Objects.equals(this.speed, flbBundle.speed) && Objects.equals(this.usage, flbBundle.usage)
				&& Objects.equals(this.classificationCode, flbBundle.classificationCode)
				&& Objects.equals(this.commitmentPeriod, flbBundle.commitmentPeriod)
				&& Objects.equals(this.productName, flbBundle.productName)
				&& Objects.equals(this.productDescription, flbBundle.productDescription)
				&& Objects.equals(this.merchandisingMedia, flbBundle.merchandisingMedia)
				&& Objects.equals(this.priceInfo, flbBundle.priceInfo)
				&& Objects.equals(this.isSelected, flbBundle.isSelected)
				&& Objects.equals(this.isSpeedLess, flbBundle.isSpeedLess)
				&& Objects.equals(this.preOrderable, flbBundle.preOrderable)
				&& Objects.equals(this.earliestAvailableDate, flbBundle.earliestAvailableDate);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(skuId, name, description, bundleName, bundleFeatures, bundleDescription, speed, usage,
				classificationCode, commitmentPeriod, productName, productDescription, merchandisingMedia, priceInfo,
				isSelected, isSpeedLess, preOrderable, earliestAvailableDate);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FlbBundle {\n");

		sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
		sb.append("    bundleFeatures: ").append(toIndentedString(bundleFeatures)).append("\n");
		sb.append("    bundleDescription: ").append(toIndentedString(bundleDescription)).append("\n");
		sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
		sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    commitmentPeriod: ").append(toIndentedString(commitmentPeriod)).append("\n");
		sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
		sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
		sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
		sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
		sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
		sb.append("    isSpeedLess: ").append(toIndentedString(isSpeedLess)).append("\n");
		sb.append("    preOrderable: ").append(toIndentedString(preOrderable)).append("\n");
		sb.append("    earliestAvailableDate: ").append(toIndentedString(earliestAvailableDate)).append("\n");
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
