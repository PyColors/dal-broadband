package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CheckOutBundle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CheckOutBundle   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packageLineId")
  private String packageLineId = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("priceDetails")
  private BundlePrices priceDetails = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("skuId")
  private String skuId = null;

  /**
   * 
   * @param action
   * @return
   */
  public CheckOutBundle action(String action) {
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
  public CheckOutBundle attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * 
   * @param attributesItem
   * @return
   */
  public CheckOutBundle addAttributesItem(Attribute attributesItem) {
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
   * @param displayName
   * @return
   */
  public CheckOutBundle displayName(String displayName) {
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
  public CheckOutBundle name(String name) {
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
  public CheckOutBundle packageLineId(String packageLineId) {
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
   * @param paymentType
   * @return
   */
  public CheckOutBundle paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * 
   * @param priceDetails
   * @return
   */
  public CheckOutBundle priceDetails(BundlePrices priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BundlePrices getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(BundlePrices priceDetails) {
    this.priceDetails = priceDetails;
  }

  /**
   * 
   * @param productClass
   * @return
   */
  public CheckOutBundle productClass(String productClass) {
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
   * @param serviceId
   * @return
   */
  public CheckOutBundle serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * 
   * @param skuId
   * @return
   */
  public CheckOutBundle skuId(String skuId) {
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
    CheckOutBundle checkOutBundle = (CheckOutBundle) o;
    return Objects.equals(this.action, checkOutBundle.action) &&
        Objects.equals(this.attributes, checkOutBundle.attributes) &&
        Objects.equals(this.displayName, checkOutBundle.displayName) &&
        Objects.equals(this.name, checkOutBundle.name) &&
        Objects.equals(this.packageLineId, checkOutBundle.packageLineId) &&
        Objects.equals(this.paymentType, checkOutBundle.paymentType) &&
        Objects.equals(this.priceDetails, checkOutBundle.priceDetails) &&
        Objects.equals(this.productClass, checkOutBundle.productClass) &&
        Objects.equals(this.serviceId, checkOutBundle.serviceId) &&
        Objects.equals(this.skuId, checkOutBundle.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, attributes, displayName, name, packageLineId, paymentType, priceDetails, productClass, serviceId, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOutBundle {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageLineId: ").append(toIndentedString(packageLineId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

