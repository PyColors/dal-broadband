package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Service.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Service   {
  
  /** The action. */
  @JsonProperty("action")
  private String action = null;

  /** The allowances. */
  @JsonProperty("allowances")
  @Valid
  private List<Allowance> allowances = null;

  /** The attributes. */
  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  /** The data rollover. */
  @JsonProperty("dataRollover")
  private String dataRollover = null;

  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The display description. */
  @JsonProperty("displayDescription")
  private String displayDescription = null;

  /** The display name. */
  @JsonProperty("displayName")
  private String displayName = null;

  /** The free gift. */
  @JsonProperty("freeGift")
  private Boolean freeGift = null;

  /** The is changed. */
  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  /** The merchandising media. */
  @JsonProperty("merchandisingMedia")
  @Valid
  private List<MediaLinks> merchandisingMedia = null;

  /** The name. */
  @JsonProperty("name")
  private String name = null;

  /** The package line id. */
  @JsonProperty("packageLineId")
  private String packageLineId = null;

  /** The plan duration. */
  @JsonProperty("planDuration")
  private CommitmentPeriod planDuration = null;

  /** The price details. */
  @JsonProperty("priceDetails")
  private ServicePrice priceDetails = null;

  /** The product class. */
  @JsonProperty("productClass")
  private String productClass = null;

  /** The reward points. */
  @JsonProperty("rewardPoints")
  private String rewardPoints = null;

  /** The sku id. */
  @JsonProperty("skuId")
  private String skuId = null;

  /** The specification group. */
  @JsonProperty("specificationGroup")
  @Valid
  private List<Specifications> specificationGroup = null;

  /**
   * Action.
   *
   * @param action the action
   * @return the service
   */
  public Service action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action.
   *
   * @return action
   */
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  /**
   * Sets the action.
   *
   * @param action the new action
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Allowances.
   *
   * @param allowances the allowances
   * @return the service
   */
  public Service allowances(List<Allowance> allowances) {
    this.allowances = allowances;
    return this;
  }

  /**
   * Adds the allowances item.
   *
   * @param allowancesItem the allowances item
   * @return the service
   */
  public Service addAllowancesItem(Allowance allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

  /**
   * Get allowances.
   *
   * @return allowances
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Allowance> getAllowances() {
    return allowances;
  }

  /**
   * Sets the allowances.
   *
   * @param allowances the new allowances
   */
  public void setAllowances(List<Allowance> allowances) {
    this.allowances = allowances;
  }

  /**
   * Attributes.
   *
   * @param attributes the attributes
   * @return the service
   */
  public Service attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Adds the attributes item.
   *
   * @param attributesItem the attributes item
   * @return the service
   */
  public Service addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes.
   *
   * @return attributes
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Attribute> getAttributes() {
    return attributes;
  }

  /**
   * Sets the attributes.
   *
   * @param attributes the new attributes
   */
  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  /**
   * Data rollover.
   *
   * @param dataRollover the data rollover
   * @return the service
   */
  public Service dataRollover(String dataRollover) {
    this.dataRollover = dataRollover;
    return this;
  }

  /**
   * Get dataRollover.
   *
   * @return dataRollover
   */
  @ApiModelProperty(value = "")


  public String getDataRollover() {
    return dataRollover;
  }

  /**
   * Sets the data rollover.
   *
   * @param dataRollover the new data rollover
   */
  public void setDataRollover(String dataRollover) {
    this.dataRollover = dataRollover;
  }

  /**
   * Description.
   *
   * @param description the description
   * @return the service
   */
  public Service description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description.
   *
   * @return description
   */
  @ApiModelProperty(value = "")


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
   * Display description.
   *
   * @param displayDescription the display description
   * @return the service
   */
  public Service displayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
    return this;
  }

  /**
   * Get displayDescription.
   *
   * @return displayDescription
   */
  @ApiModelProperty(value = "")


  public String getDisplayDescription() {
    return displayDescription;
  }

  /**
   * Sets the display description.
   *
   * @param displayDescription the new display description
   */
  public void setDisplayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
  }

  /**
   * Display name.
   *
   * @param displayName the display name
   * @return the service
   */
  public Service displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName.
   *
   * @return displayName
   */
  @ApiModelProperty(value = "")


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
   * Free gift.
   *
   * @param freeGift the free gift
   * @return the service
   */
  public Service freeGift(Boolean freeGift) {
    this.freeGift = freeGift;
    return this;
  }

  /**
   * Get freeGift.
   *
   * @return freeGift
   */

  public Boolean isFreeGift() {
    return freeGift;
  }

  /**
   * Sets the free gift.
   *
   * @param freeGift the new free gift
   */
  public void setFreeGift(Boolean freeGift) {
    this.freeGift = freeGift;
  }

  /**
   * Checks if is changed.
   *
   * @param isChanged the is changed
   * @return the service
   */
  public Service isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged.
   *
   * @return isChanged
   */

  public Boolean isIsChanged() {
    return isChanged;
  }

  /**
   * Sets the checks if is changed.
   *
   * @param isChanged the new checks if is changed
   */
  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  /**
   * Merchandising media.
   *
   * @param merchandisingMedia the merchandising media
   * @return the service
   */
  public Service merchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  /**
   * Adds the merchandising media item.
   *
   * @param merchandisingMediaItem the merchandising media item
   * @return the service
   */
  public Service addMerchandisingMediaItem(MediaLinks merchandisingMediaItem) {
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

  public List<MediaLinks> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  /**
   * Sets the merchandising media.
   *
   * @param merchandisingMedia the new merchandising media
   */
  public void setMerchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  /**
   * Name.
   *
   * @param name the name
   * @return the service
   */
  public Service name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   *
   * @return name
   */
  @ApiModelProperty(value = "")


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
   * Package line id.
   *
   * @param packageLineId the package line id
   * @return the service
   */
  public Service packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

  /**
   * Get packageLineId.
   *
   * @return packageLineId
   */
  @ApiModelProperty(value = "")


  public String getPackageLineId() {
    return packageLineId;
  }

  /**
   * Sets the package line id.
   *
   * @param packageLineId the new package line id
   */
  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

  /**
   * Plan duration.
   *
   * @param planDuration the plan duration
   * @return the service
   */
  public Service planDuration(CommitmentPeriod planDuration) {
    this.planDuration = planDuration;
    return this;
  }

  /**
   * Get planDuration.
   *
   * @return planDuration
   */
  @ApiModelProperty(value = "")

  @Valid

  public CommitmentPeriod getPlanDuration() {
    return planDuration;
  }

  /**
   * Sets the plan duration.
   *
   * @param planDuration the new plan duration
   */
  public void setPlanDuration(CommitmentPeriod planDuration) {
    this.planDuration = planDuration;
  }

  /**
   * Price details.
   *
   * @param priceDetails the price details
   * @return the service
   */
  public Service priceDetails(ServicePrice priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails.
   *
   * @return priceDetails
   */
  @ApiModelProperty(value = "")

  @Valid

  public ServicePrice getPriceDetails() {
    return priceDetails;
  }

  /**
   * Sets the price details.
   *
   * @param priceDetails the new price details
   */
  public void setPriceDetails(ServicePrice priceDetails) {
    this.priceDetails = priceDetails;
  }

  /**
   * Product class.
   *
   * @param productClass the product class
   * @return the service
   */
  public Service productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Get productClass.
   *
   * @return productClass
   */
  @ApiModelProperty(value = "")


  public String getProductClass() {
    return productClass;
  }

  /**
   * Sets the product class.
   *
   * @param productClass the new product class
   */
  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  /**
   * Reward points.
   *
   * @param rewardPoints the reward points
   * @return the service
   */
  public Service rewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
    return this;
  }

  /**
   * Get rewardPoints.
   *
   * @return rewardPoints
   */
  @ApiModelProperty(value = "")


  public String getRewardPoints() {
    return rewardPoints;
  }

  /**
   * Sets the reward points.
   *
   * @param rewardPoints the new reward points
   */
  public void setRewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
  }

  /**
   * Sku id.
   *
   * @param skuId the sku id
   * @return the service
   */
  public Service skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId.
   *
   * @return skuId
   */
  @ApiModelProperty(value = "")


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
   * Specification group.
   *
   * @param specificationGroup the specification group
   * @return the service
   */
  public Service specificationGroup(List<Specifications> specificationGroup) {
    this.specificationGroup = specificationGroup;
    return this;
  }

  /**
   * Adds the specification group item.
   *
   * @param specificationGroupItem the specification group item
   * @return the service
   */
  public Service addSpecificationGroupItem(Specifications specificationGroupItem) {
    if (this.specificationGroup == null) {
      this.specificationGroup = new ArrayList<>();
    }
    this.specificationGroup.add(specificationGroupItem);
    return this;
  }

  /**
   * Get specificationGroup.
   *
   * @return specificationGroup
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Specifications> getSpecificationGroup() {
    return specificationGroup;
  }

  /**
   * Sets the specification group.
   *
   * @param specificationGroup the new specification group
   */
  public void setSpecificationGroup(List<Specifications> specificationGroup) {
    this.specificationGroup = specificationGroup;
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, allowances, attributes, dataRollover, description, displayDescription, displayName, freeGift, isChanged, merchandisingMedia, name, packageLineId, planDuration, priceDetails, productClass, rewardPoints, skuId, specificationGroup);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

