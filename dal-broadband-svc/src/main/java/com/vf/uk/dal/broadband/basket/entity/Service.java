package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Service
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Service   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("allowances")
  @Valid
  private List<Allowance> allowances = null;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("dataRollover")
  private String dataRollover = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayDescription")
  private String displayDescription = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("freeGift")
  private Boolean freeGift = null;

  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  @JsonProperty("merchandisingMedia")
  @Valid
  private List<MediaLinks> merchandisingMedia = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packageLineId")
  private String packageLineId = null;

  @JsonProperty("planDuration")
  private CommitmentPeriod planDuration = null;

  @JsonProperty("priceDetails")
  private ServicePrice priceDetails = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("rewardPoints")
  private String rewardPoints = null;

  @JsonProperty("skuId")
  private String skuId = null;

  @JsonProperty("specificationGroup")
  @Valid
  private List<Specifications> specificationGroup = null;

  public Service action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Service allowances(List<Allowance> allowances) {
    this.allowances = allowances;
    return this;
  }

  public Service addAllowancesItem(Allowance allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<Allowance>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

  /**
   * Get allowances
   * @return allowances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Allowance> getAllowances() {
    return allowances;
  }

  public void setAllowances(List<Allowance> allowances) {
    this.allowances = allowances;
  }

  public Service attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Service addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<Attribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public Service dataRollover(String dataRollover) {
    this.dataRollover = dataRollover;
    return this;
  }

  /**
   * Get dataRollover
   * @return dataRollover
  **/
  @ApiModelProperty(value = "")


  public String getDataRollover() {
    return dataRollover;
  }

  public void setDataRollover(String dataRollover) {
    this.dataRollover = dataRollover;
  }

  public Service description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Service displayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
    return this;
  }

  /**
   * Get displayDescription
   * @return displayDescription
  **/
  @ApiModelProperty(value = "")


  public String getDisplayDescription() {
    return displayDescription;
  }

  public void setDisplayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
  }

  public Service displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Service freeGift(Boolean freeGift) {
    this.freeGift = freeGift;
    return this;
  }

  /**
   * Get freeGift
   * @return freeGift
  **/

  public Boolean isFreeGift() {
    return freeGift;
  }

  public void setFreeGift(Boolean freeGift) {
    this.freeGift = freeGift;
  }

  public Service isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged
   * @return isChanged
  **/

  public Boolean isIsChanged() {
    return isChanged;
  }

  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  public Service merchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  public Service addMerchandisingMediaItem(MediaLinks merchandisingMediaItem) {
    if (this.merchandisingMedia == null) {
      this.merchandisingMedia = new ArrayList<MediaLinks>();
    }
    this.merchandisingMedia.add(merchandisingMediaItem);
    return this;
  }

  /**
   * Get merchandisingMedia
   * @return merchandisingMedia
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MediaLinks> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  public Service name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

  /**
   * Get packageLineId
   * @return packageLineId
  **/
  @ApiModelProperty(value = "")


  public String getPackageLineId() {
    return packageLineId;
  }

  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

  public Service planDuration(CommitmentPeriod planDuration) {
    this.planDuration = planDuration;
    return this;
  }

  /**
   * Get planDuration
   * @return planDuration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CommitmentPeriod getPlanDuration() {
    return planDuration;
  }

  public void setPlanDuration(CommitmentPeriod planDuration) {
    this.planDuration = planDuration;
  }

  public Service priceDetails(ServicePrice priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServicePrice getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(ServicePrice priceDetails) {
    this.priceDetails = priceDetails;
  }

  public Service productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Get productClass
   * @return productClass
  **/
  @ApiModelProperty(value = "")


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public Service rewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
    return this;
  }

  /**
   * Get rewardPoints
   * @return rewardPoints
  **/
  @ApiModelProperty(value = "")


  public String getRewardPoints() {
    return rewardPoints;
  }

  public void setRewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
  }

  public Service skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId
   * @return skuId
  **/
  @ApiModelProperty(value = "")


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public Service specificationGroup(List<Specifications> specificationGroup) {
    this.specificationGroup = specificationGroup;
    return this;
  }

  public Service addSpecificationGroupItem(Specifications specificationGroupItem) {
    if (this.specificationGroup == null) {
      this.specificationGroup = new ArrayList<Specifications>();
    }
    this.specificationGroup.add(specificationGroupItem);
    return this;
  }

  /**
   * Get specificationGroup
   * @return specificationGroup
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Specifications> getSpecificationGroup() {
    return specificationGroup;
  }

  public void setSpecificationGroup(List<Specifications> specificationGroup) {
    this.specificationGroup = specificationGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.action, service.action) &&
        Objects.equals(this.allowances, service.allowances) &&
        Objects.equals(this.attributes, service.attributes) &&
        Objects.equals(this.dataRollover, service.dataRollover) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.displayDescription, service.displayDescription) &&
        Objects.equals(this.displayName, service.displayName) &&
        Objects.equals(this.freeGift, service.freeGift) &&
        Objects.equals(this.isChanged, service.isChanged) &&
        Objects.equals(this.merchandisingMedia, service.merchandisingMedia) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.packageLineId, service.packageLineId) &&
        Objects.equals(this.planDuration, service.planDuration) &&
        Objects.equals(this.priceDetails, service.priceDetails) &&
        Objects.equals(this.productClass, service.productClass) &&
        Objects.equals(this.rewardPoints, service.rewardPoints) &&
        Objects.equals(this.skuId, service.skuId) &&
        Objects.equals(this.specificationGroup, service.specificationGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, allowances, attributes, dataRollover, description, displayDescription, displayName, freeGift, isChanged, merchandisingMedia, name, packageLineId, planDuration, priceDetails, productClass, rewardPoints, skuId, specificationGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    allowances: ").append(toIndentedString(allowances)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dataRollover: ").append(toIndentedString(dataRollover)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    freeGift: ").append(toIndentedString(freeGift)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageLineId: ").append(toIndentedString(packageLineId)).append("\n");
    sb.append("    planDuration: ").append(toIndentedString(planDuration)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    rewardPoints: ").append(toIndentedString(rewardPoints)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    specificationGroup: ").append(toIndentedString(specificationGroup)).append("\n");
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

