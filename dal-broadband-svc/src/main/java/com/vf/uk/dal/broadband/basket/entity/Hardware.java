package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Hardware
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Hardware   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("boxPrice")
  private Price boxPrice = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("deviceBriefDescription")
  @Valid
  private List<DeviceBriefDescription> deviceBriefDescription = null;

  @JsonProperty("deviceColor")
  private String deviceColor = null;

  @JsonProperty("displayDescription")
  private String displayDescription = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("displayOrder")
  private Integer displayOrder = null;

  @JsonProperty("freeGift")
  private Boolean freeGift = null;

  @JsonProperty("groupType")
  private String groupType = null;

  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  @JsonProperty("make")
  private String make = null;

  @JsonProperty("memorySize")
  private String memorySize = null;

  @JsonProperty("merchandisingMedia")
  @Valid
  private List<MediaLink> merchandisingMedia = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packageLineId")
  private String packageLineId = null;

  @JsonProperty("priceDetails")
  private HardwarePrice priceDetails = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("showInSummary")
  private Boolean showInSummary = null;

  @JsonProperty("skuId")
  private String skuId = null;

  public Hardware action(String action) {
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

  public Hardware attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Hardware addAttributesItem(Attribute attributesItem) {
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

  public Hardware boxPrice(Price boxPrice) {
    this.boxPrice = boxPrice;
    return this;
  }

  /**
   * Get boxPrice
   * @return boxPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getBoxPrice() {
    return boxPrice;
  }

  public void setBoxPrice(Price boxPrice) {
    this.boxPrice = boxPrice;
  }

  public Hardware description(String description) {
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

  public Hardware deviceBriefDescription(List<DeviceBriefDescription> deviceBriefDescription) {
    this.deviceBriefDescription = deviceBriefDescription;
    return this;
  }

  public Hardware addDeviceBriefDescriptionItem(DeviceBriefDescription deviceBriefDescriptionItem) {
    if (this.deviceBriefDescription == null) {
      this.deviceBriefDescription = new ArrayList<DeviceBriefDescription>();
    }
    this.deviceBriefDescription.add(deviceBriefDescriptionItem);
    return this;
  }

  /**
   * Get deviceBriefDescription
   * @return deviceBriefDescription
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceBriefDescription> getDeviceBriefDescription() {
    return deviceBriefDescription;
  }

  public void setDeviceBriefDescription(List<DeviceBriefDescription> deviceBriefDescription) {
    this.deviceBriefDescription = deviceBriefDescription;
  }

  public Hardware deviceColor(String deviceColor) {
    this.deviceColor = deviceColor;
    return this;
  }

  /**
   * Get deviceColor
   * @return deviceColor
  **/
  @ApiModelProperty(value = "")


  public String getDeviceColor() {
    return deviceColor;
  }

  public void setDeviceColor(String deviceColor) {
    this.deviceColor = deviceColor;
  }

  public Hardware displayDescription(String displayDescription) {
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

  public Hardware displayName(String displayName) {
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

  public Hardware displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * Get displayOrder
   * @return displayOrder
  **/
  @ApiModelProperty(value = "")


  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public Hardware freeGift(Boolean freeGift) {
    this.freeGift = freeGift;
    return this;
  }

  /**
   * Get freeGift
   * @return freeGift
  **/
  @ApiModelProperty(value = "")


  public Boolean isFreeGift() {
    return freeGift;
  }

  public void setFreeGift(Boolean freeGift) {
    this.freeGift = freeGift;
  }

  public Hardware groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Get groupType
   * @return groupType
  **/
  @ApiModelProperty(value = "")


  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public Hardware isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged
   * @return isChanged
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsChanged() {
    return isChanged;
  }

  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  public Hardware make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")


  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Hardware memorySize(String memorySize) {
    this.memorySize = memorySize;
    return this;
  }

  /**
   * Get memorySize
   * @return memorySize
  **/
  @ApiModelProperty(value = "")


  public String getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(String memorySize) {
    this.memorySize = memorySize;
  }

  public Hardware merchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  public Hardware addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
    if (this.merchandisingMedia == null) {
      this.merchandisingMedia = new ArrayList<MediaLink>();
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

  public List<MediaLink> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  public Hardware model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Hardware name(String name) {
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

  public Hardware packageLineId(String packageLineId) {
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

  public Hardware priceDetails(HardwarePrice priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HardwarePrice getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(HardwarePrice priceDetails) {
    this.priceDetails = priceDetails;
  }

  public Hardware productClass(String productClass) {
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

  public Hardware showInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
    return this;
  }

  /**
   * Get showInSummary
   * @return showInSummary
  **/
  @ApiModelProperty(value = "")


  public Boolean isShowInSummary() {
    return showInSummary;
  }

  public void setShowInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
  }

  public Hardware skuId(String skuId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hardware hardware = (Hardware) o;
    return Objects.equals(this.action, hardware.action) &&
        Objects.equals(this.attributes, hardware.attributes) &&
        Objects.equals(this.boxPrice, hardware.boxPrice) &&
        Objects.equals(this.description, hardware.description) &&
        Objects.equals(this.deviceBriefDescription, hardware.deviceBriefDescription) &&
        Objects.equals(this.deviceColor, hardware.deviceColor) &&
        Objects.equals(this.displayDescription, hardware.displayDescription) &&
        Objects.equals(this.displayName, hardware.displayName) &&
        Objects.equals(this.displayOrder, hardware.displayOrder) &&
        Objects.equals(this.freeGift, hardware.freeGift) &&
        Objects.equals(this.groupType, hardware.groupType) &&
        Objects.equals(this.isChanged, hardware.isChanged) &&
        Objects.equals(this.make, hardware.make) &&
        Objects.equals(this.memorySize, hardware.memorySize) &&
        Objects.equals(this.merchandisingMedia, hardware.merchandisingMedia) &&
        Objects.equals(this.model, hardware.model) &&
        Objects.equals(this.name, hardware.name) &&
        Objects.equals(this.packageLineId, hardware.packageLineId) &&
        Objects.equals(this.priceDetails, hardware.priceDetails) &&
        Objects.equals(this.productClass, hardware.productClass) &&
        Objects.equals(this.showInSummary, hardware.showInSummary) &&
        Objects.equals(this.skuId, hardware.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, attributes, boxPrice, description, deviceBriefDescription, deviceColor, displayDescription, displayName, displayOrder, freeGift, groupType, isChanged, make, memorySize, merchandisingMedia, model, name, packageLineId, priceDetails, productClass, showInSummary, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hardware {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    boxPrice: ").append(toIndentedString(boxPrice)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceBriefDescription: ").append(toIndentedString(deviceBriefDescription)).append("\n");
    sb.append("    deviceColor: ").append(toIndentedString(deviceColor)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    freeGift: ").append(toIndentedString(freeGift)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageLineId: ").append(toIndentedString(packageLineId)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    showInSummary: ").append(toIndentedString(showInSummary)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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

