package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class RouterProductDetails   {
  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("delivery")
  private Delivery delivery = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("isDefaultDevice")
  private Boolean isDefaultDevice = null;

  @JsonProperty("isDeviceProduct")
  private Boolean isDeviceProduct = null;

  @JsonProperty("isServicesProduct")
  private Boolean isServicesProduct = null;

  @JsonProperty("listOfImageURLs")
  @Valid
  private List<ImageURL> listOfImageURLs = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("priceInfo")
  private PriceForBundleAndHardware priceInfo = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("promotionPackages")
  private MerchandisingPromotionsPackage promotionPackages = null;

  public RouterProductDetails condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Name of the bundle relationship
   * @return condition
  **/
  @ApiModelProperty(value = "Name of the bundle relationship")


  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public RouterProductDetails delivery(Delivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Delivery getDelivery() {
    return delivery;
  }

  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  public RouterProductDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * pre desc from commercial product
   * @return description
  **/
  @ApiModelProperty(value = "pre desc from commercial product")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RouterProductDetails displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Type of relation ship
   * @return displayName
  **/
  @ApiModelProperty(value = "Type of relation ship")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RouterProductDetails isDefaultDevice(Boolean isDefaultDevice) {
    this.isDefaultDevice = isDefaultDevice;
    return this;
  }

  /**
   * set to true if device is default
   * @return isDefaultDevice
  **/
  @ApiModelProperty(example = "false", value = "set to true if device is default")


  public Boolean isIsDefaultDevice() {
    return isDefaultDevice;
  }

  public void setIsDefaultDevice(Boolean isDefaultDevice) {
    this.isDefaultDevice = isDefaultDevice;
  }

  public RouterProductDetails isDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Name of the bundle relationship
   * @return isDeviceProduct
  **/
  @ApiModelProperty(example = "false", value = "Name of the bundle relationship")


  public Boolean isIsDeviceProduct() {
    return isDeviceProduct;
  }

  public void setIsDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  public RouterProductDetails isServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * Name of the bundle relationship
   * @return isServicesProduct
  **/
  @ApiModelProperty(example = "false", value = "Name of the bundle relationship")


  public Boolean isIsServicesProduct() {
    return isServicesProduct;
  }

  public void setIsServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  public RouterProductDetails listOfImageURLs(List<ImageURL> listOfImageURLs) {
    this.listOfImageURLs = listOfImageURLs;
    return this;
  }

  public RouterProductDetails addListOfImageURLsItem(ImageURL listOfImageURLsItem) {
    if (this.listOfImageURLs == null) {
      this.listOfImageURLs = new ArrayList<ImageURL>();
    }
    this.listOfImageURLs.add(listOfImageURLsItem);
    return this;
  }

  /**
   * Get listOfImageURLs
   * @return listOfImageURLs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ImageURL> getListOfImageURLs() {
    return listOfImageURLs;
  }

  public void setListOfImageURLs(List<ImageURL> listOfImageURLs) {
    this.listOfImageURLs = listOfImageURLs;
  }

  public RouterProductDetails order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Type of relation ship
   * @return order
  **/
  @ApiModelProperty(value = "Type of relation ship")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public RouterProductDetails paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Name of the bundle relationship
   * @return paymentType
  **/
  @ApiModelProperty(value = "Name of the bundle relationship")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public RouterProductDetails priceInfo(PriceForBundleAndHardware priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  /**
   * Get priceInfo
   * @return priceInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PriceForBundleAndHardware getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(PriceForBundleAndHardware priceInfo) {
    this.priceInfo = priceInfo;
  }

  public RouterProductDetails productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Type of relation ship
   * @return productClass
  **/
  @ApiModelProperty(value = "Type of relation ship")


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public RouterProductDetails productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Name of the bundle relationship
   * @return productId
  **/
  @ApiModelProperty(value = "Name of the bundle relationship")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public RouterProductDetails productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  public RouterProductDetails addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<String>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * product lines
   * @return productLines
  **/
  @ApiModelProperty(value = "product lines")


  public List<String> getProductLines() {
    return productLines;
  }

  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
  }

  public RouterProductDetails productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Name of the bundle relationship
   * @return productName
  **/
  @ApiModelProperty(value = "Name of the bundle relationship")


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public RouterProductDetails promotionPackages(MerchandisingPromotionsPackage promotionPackages) {
    this.promotionPackages = promotionPackages;
    return this;
  }

  /**
   * Get promotionPackages
   * @return promotionPackages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotionsPackage getPromotionPackages() {
    return promotionPackages;
  }

  public void setPromotionPackages(MerchandisingPromotionsPackage promotionPackages) {
    this.promotionPackages = promotionPackages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouterProductDetails productDetails = (RouterProductDetails) o;
    return Objects.equals(this.condition, productDetails.condition) &&
        Objects.equals(this.delivery, productDetails.delivery) &&
        Objects.equals(this.description, productDetails.description) &&
        Objects.equals(this.displayName, productDetails.displayName) &&
        Objects.equals(this.isDefaultDevice, productDetails.isDefaultDevice) &&
        Objects.equals(this.isDeviceProduct, productDetails.isDeviceProduct) &&
        Objects.equals(this.isServicesProduct, productDetails.isServicesProduct) &&
        Objects.equals(this.listOfImageURLs, productDetails.listOfImageURLs) &&
        Objects.equals(this.order, productDetails.order) &&
        Objects.equals(this.paymentType, productDetails.paymentType) &&
        Objects.equals(this.priceInfo, productDetails.priceInfo) &&
        Objects.equals(this.productClass, productDetails.productClass) &&
        Objects.equals(this.productId, productDetails.productId) &&
        Objects.equals(this.productLines, productDetails.productLines) &&
        Objects.equals(this.productName, productDetails.productName) &&
        Objects.equals(this.promotionPackages, productDetails.promotionPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, delivery, description, displayName, isDefaultDevice, isDeviceProduct, isServicesProduct, listOfImageURLs, order, paymentType, priceInfo, productClass, productId, productLines, productName, promotionPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isDefaultDevice: ").append(toIndentedString(isDefaultDevice)).append("\n");
    sb.append("    isDeviceProduct: ").append(toIndentedString(isDeviceProduct)).append("\n");
    sb.append("    isServicesProduct: ").append(toIndentedString(isServicesProduct)).append("\n");
    sb.append("    listOfImageURLs: ").append(toIndentedString(listOfImageURLs)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productLines: ").append(toIndentedString(productLines)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    promotionPackages: ").append(toIndentedString(promotionPackages)).append("\n");
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

