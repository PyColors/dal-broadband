package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FlbBundle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-27T18:08:29.266Z")

public class FlbBundle {
	@JsonProperty("skuId")
	private String skuId = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("bundleName")
	private String bundleName = null;

	@JsonProperty("bundleDescription")
	private String bundleDescription = null;

	@JsonProperty("speed")
	private String speed = null;

	@JsonProperty("minSpeed")
	private String minSpeed = null;

	@JsonProperty("maxSpeed")
	private String maxSpeed = null;

	@JsonProperty("usage")
	private String usage = null;

	@JsonProperty("commitmentPeriod")
	private String commitmentPeriod = null;

	@JsonProperty("planCoupleId")
	private String planCoupleId = null;

	@JsonProperty("planCoupleFlag")
	private Boolean planCoupleFlag = null;

	@JsonProperty("planCoupleLabel")
	private String planCoupleLabel = null;

	@JsonProperty("productName")
	private String productName = null;

	@JsonProperty("productDescription")
	private String productDescription = null;
	
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("merchandisingMedia")
	private List<MediaLink> merchandisingMedia = null;

	@JsonProperty("priceInfo")
	private PriceForBundleAndHardware priceInfo = null;

	public FlbBundle skuId(String skuId) {
		this.skuId = skuId;
		return this;
	}

	/**
	 * Unique bundle id as available from the product catalogue
	 * 
	 * @return skuId
	 **/

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public FlbBundle name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the bundle as provided in the product catalogue
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FlbBundle description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the bundle as provided in the product catalogue
	 * 
	 * @return description
	 **/

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FlbBundle bundleName(String bundleName) {
		this.bundleName = bundleName;
		return this;
	}

	/**
	 * Name of the bundle as provided in the merchandising file
	 * 
	 * @return bundleName
	 **/

	public String getBundleName() {
		return bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public FlbBundle bundleDescription(String bundleDescription) {
		this.bundleDescription = bundleDescription;
		return this;
	}

	/**
	 * Description of the bundle as provided in the merchandising file
	 * 
	 * @return bundleDescription
	 **/

	public String getBundleDescription() {
		return bundleDescription;
	}

	public void setBundleDescription(String bundleDescription) {
		this.bundleDescription = bundleDescription;
	}

	public FlbBundle speed(String speed) {
		this.speed = speed;
		return this;
	}

	/**
	 * Speed of the bundle as provided in the merchandising file
	 * 
	 * @return speed
	 **/

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public FlbBundle minSpeed(String minSpeed) {
		this.minSpeed = minSpeed;
		return this;
	}

	/**
	 * Min Speed of the bundle as provided in the merchandising file
	 * 
	 * @return minSpeed
	 **/

	public String getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(String minSpeed) {
		this.minSpeed = minSpeed;
	}

	public FlbBundle maxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
		return this;
	}

	/**
	 * Max Speed of the bundle as provided in the merchandising file
	 * 
	 * @return maxSpeed
	 **/

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public FlbBundle usage(String usage) {
		this.usage = usage;
		return this;
	}

	/**
	 * Usage of the bundle as provided in the merchandising file
	 * 
	 * @return usage
	 **/

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public FlbBundle commitmentPeriod(String commitmentPeriod) {
		this.commitmentPeriod = commitmentPeriod;
		return this;
	}

	/**
	 * Commitment period of the bundle
	 * 
	 * @return commitmentPeriod
	 **/

	public String getCommitmentPeriod() {
		return commitmentPeriod;
	}

	public void setCommitmentPeriod(String commitmentPeriod) {
		this.commitmentPeriod = commitmentPeriod;
	}

	public FlbBundle planCoupleId(String planCoupleId) {
		this.planCoupleId = planCoupleId;
		return this;
	}

	/**
	 * PlanID of the Couple Plan
	 * 
	 * @return planCoupleId
	 **/

	public String getPlanCoupleId() {
		return planCoupleId;
	}

	public void setPlanCoupleId(String planCoupleId) {
		this.planCoupleId = planCoupleId;
	}

	public FlbBundle planCoupleFlag(Boolean planCoupleFlag) {
		this.planCoupleFlag = planCoupleFlag;
		return this;
	}

	/**
	 * Indicate whether this plan is to be coupled or not True, False.
	 * 
	 * @return planCoupleFlag
	 **/

	public Boolean getPlanCoupleFlag() {
		return planCoupleFlag;
	}

	public void setPlanCoupleFlag(Boolean planCoupleFlag) {
		this.planCoupleFlag = planCoupleFlag;
	}

	public FlbBundle planCoupleLabel(String planCoupleLabel) {
		this.planCoupleLabel = planCoupleLabel;
		return this;
	}

	/**
	 * Message needs to be build based on data difference and cost logic.
	 * 
	 * @return planCoupleLabel
	 **/

	public String getPlanCoupleLabel() {
		return planCoupleLabel;
	}

	public void setPlanCoupleLabel(String planCoupleLabel) {
		this.planCoupleLabel = planCoupleLabel;
	}

	public FlbBundle productName(String productName) {
		this.productName = productName;
		return this;
	}

	/**
	 * Message needs to be build based on data difference and cost logic.
	 * 
	 * @return productName
	 **/

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public FlbBundle productDescription(String productDescription) {
		this.productDescription = productDescription;
		return this;
	}

	/**
	 * Message needs to be build based on data difference and cost logic.
	 * 
	 * @return productDescription
	 **/

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public FlbBundle classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Message needs to be build based on data difference and cost logic.
	 * 
	 * @return productDescription
	 **/

	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public FlbBundle merchandisingMedia(List<MediaLink> merchandisingMedia) {
		this.merchandisingMedia = merchandisingMedia;
		return this;
	}

	public FlbBundle addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
		if (this.merchandisingMedia == null) {
			this.merchandisingMedia = new ArrayList<MediaLink>();
		}
		this.merchandisingMedia.add(merchandisingMediaItem);
		return this;
	}

	/**
	 * Get merchandisingMedia
	 * 
	 * @return merchandisingMedia
	 **/

	@Valid

	public List<MediaLink> getMerchandisingMedia() {
		return merchandisingMedia;
	}

	public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
		this.merchandisingMedia = merchandisingMedia;
	}

	public FlbBundle priceInfo(PriceForBundleAndHardware priceInfo) {
		this.priceInfo = priceInfo;
		return this;
	}

	/**
	 * Get priceInfo
	 * 
	 * @return priceInfo
	 **/

	@Valid

	public PriceForBundleAndHardware getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(PriceForBundleAndHardware priceInfo) {
		this.priceInfo = priceInfo;
	}

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
				&& Objects.equals(this.bundleDescription, flbBundle.bundleDescription)
				&& Objects.equals(this.speed, flbBundle.speed) && Objects.equals(this.minSpeed, flbBundle.minSpeed)
				&& Objects.equals(this.maxSpeed, flbBundle.maxSpeed) && Objects.equals(this.usage, flbBundle.usage)
				&& Objects.equals(this.commitmentPeriod, flbBundle.commitmentPeriod)
				&& Objects.equals(this.planCoupleId, flbBundle.planCoupleId)
				&& Objects.equals(this.planCoupleFlag, flbBundle.planCoupleFlag)
				&& Objects.equals(this.planCoupleLabel, flbBundle.planCoupleLabel)
				&& Objects.equals(this.productName, flbBundle.productName)
				&& Objects.equals(this.productDescription, flbBundle.productDescription)
				&& Objects.equals(this.classificationCode, flbBundle.classificationCode)
				&& Objects.equals(this.merchandisingMedia, flbBundle.merchandisingMedia)
				&& Objects.equals(this.priceInfo, flbBundle.priceInfo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(skuId, name, description, bundleName, bundleDescription, speed, minSpeed, maxSpeed, usage,
				commitmentPeriod, planCoupleId, planCoupleFlag, planCoupleLabel, productName, productDescription, classificationCode,
				merchandisingMedia, priceInfo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FlbBundle {\n");

		sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
		sb.append("    bundleDescription: ").append(toIndentedString(bundleDescription)).append("\n");
		sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
		sb.append("    minSpeed: ").append(toIndentedString(minSpeed)).append("\n");
		sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
		sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
		sb.append("    commitmentPeriod: ").append(toIndentedString(commitmentPeriod)).append("\n");
		sb.append("    planCoupleId: ").append(toIndentedString(planCoupleId)).append("\n");
		sb.append("    planCoupleFlag: ").append(toIndentedString(planCoupleFlag)).append("\n");
		sb.append("    planCoupleLabel: ").append(toIndentedString(planCoupleLabel)).append("\n");
		sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
		sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
		sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
