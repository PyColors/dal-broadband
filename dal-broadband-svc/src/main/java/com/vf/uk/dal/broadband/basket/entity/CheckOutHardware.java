package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CheckOutHardware
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CheckOutHardware   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("boxPrice")
  private Price boxPrice = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packageLineId")
  private String packageLineId = null;

  @JsonProperty("priceDetails")
  private HardwarePrices priceDetails = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("skuId")
  private String skuId = null;

  /**
   * 
   * @param action
   * @return
   */
  public CheckOutHardware action(String action) {
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

  /**
   * 
   * @param attributes
   * @return
   */
  public CheckOutHardware attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * 
   * @param attributesItem
   * @return
   */
  public CheckOutHardware addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
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

  /**
   * 
   * @param boxPrice
   * @return
   */
  public CheckOutHardware boxPrice(Price boxPrice) {
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

  /**
   * 
   * @param description
   * @return
   */
  public CheckOutHardware description(String description) {
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

  /**
   * 
   * @param displayName
   * @return
   */
  public CheckOutHardware displayName(String displayName) {
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

  /**
   * 
   * @param name
   * @return
   */
  public CheckOutHardware name(String name) {
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

  /**
   * 
   * @param packageLineId
   * @return
   */
  public CheckOutHardware packageLineId(String packageLineId) {
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

  /**
   * 
   * @param priceDetails
   * @return
   */
  public CheckOutHardware priceDetails(HardwarePrices priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HardwarePrices getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(HardwarePrices priceDetails) {
    this.priceDetails = priceDetails;
  }

  /**
   * 
   * @param productClass
   * @return
   */
  public CheckOutHardware productClass(String productClass) {
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

  /**
   * 
   * @param skuId
   * @return
   */
  public CheckOutHardware skuId(String skuId) {
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
    CheckOutHardware checkOutHardware = (CheckOutHardware) o;
    return Objects.equals(this.action, checkOutHardware.action) &&
        Objects.equals(this.attributes, checkOutHardware.attributes) &&
        Objects.equals(this.boxPrice, checkOutHardware.boxPrice) &&
        Objects.equals(this.description, checkOutHardware.description) &&
        Objects.equals(this.displayName, checkOutHardware.displayName) &&
        Objects.equals(this.name, checkOutHardware.name) &&
        Objects.equals(this.packageLineId, checkOutHardware.packageLineId) &&
        Objects.equals(this.priceDetails, checkOutHardware.priceDetails) &&
        Objects.equals(this.productClass, checkOutHardware.productClass) &&
        Objects.equals(this.skuId, checkOutHardware.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, attributes, boxPrice, description, displayName, name, packageLineId, priceDetails, productClass, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOutHardware {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    boxPrice: ").append(toIndentedString(boxPrice)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageLineId: ").append(toIndentedString(packageLineId)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
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

