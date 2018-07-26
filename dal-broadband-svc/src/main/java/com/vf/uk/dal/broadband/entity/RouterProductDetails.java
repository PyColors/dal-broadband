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

public class RouterProductDetails   {
  
  /** The condition. */
  @JsonProperty("condition")
  private String condition = null;

  /** The delivery. */
  @JsonProperty("delivery")
  private Delivery delivery = null;

  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The display name. */
  @JsonProperty("displayName")
  private String displayName = null;

  /** The is default device. */
  @JsonProperty("isDefaultDevice")
  private Boolean isDefaultDevice = null;

  /** The is device product. */
  @JsonProperty("isDeviceProduct")
  private Boolean isDeviceProduct = null;

  /** The is services product. */
  @JsonProperty("isServicesProduct")
  private Boolean isServicesProduct = null;

  /** The list of image UR ls. */
  @JsonProperty("listOfImageURLs")
  @Valid
  private List<ImageURL> listOfImageURLs = null;

  /** The order. */
  @JsonProperty("order")
  private String order = null;

  /** The payment type. */
  @JsonProperty("paymentType")
  private String paymentType = null;

  /** The price info. */
  @JsonProperty("priceInfo")
  private PriceForBundleAndHardware priceInfo = null;

  /** The product class. */
  @JsonProperty("productClass")
  private String productClass = null;

  /** The product id. */
  @JsonProperty("productId")
  private String productId = null;

  /** The product lines. */
  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  /** The product name. */
  @JsonProperty("productName")
  private String productName = null;

  /** The promotion packages. */
  @JsonProperty("promotionPackages")
  private MerchandisingPromotionsPackage promotionPackages = null;

  /**
   * Condition.
   *
   * @param condition the condition
   * @return the router product details
   */
  public RouterProductDetails condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Name of the bundle relationship.
   *
   * @return condition
   */
  @ApiModelProperty(value = "Name of the bundle relationship")


  public String getCondition() {
    return condition;
  }

  /**
   * Sets the condition.
   *
   * @param condition the new condition
   */
  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   * Delivery.
   *
   * @param delivery the delivery
   * @return the router product details
   */
  public RouterProductDetails delivery(Delivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery.
   *
   * @return delivery
   */
  @ApiModelProperty(value = "")

  @Valid

  public Delivery getDelivery() {
    return delivery;
  }

  /**
   * Sets the delivery.
   *
   * @param delivery the new delivery
   */
  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  /**
   * Description.
   *
   * @param description the description
   * @return the router product details
   */
  public RouterProductDetails description(String description) {
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
   * @return the router product details
   */
  public RouterProductDetails displayName(String displayName) {
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
   * @return the router product details
   */
  public RouterProductDetails isDefaultDevice(Boolean isDefaultDevice) {
    this.isDefaultDevice = isDefaultDevice;
    return this;
  }

  /**
   * set to true if device is default.
   *
   * @return isDefaultDevice
   */
  @ApiModelProperty(example = "false", value = "set to true if device is default")


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
   * Checks if is device product.
   *
   * @param isDeviceProduct the is device product
   * @return the router product details
   */
  public RouterProductDetails isDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Name of the bundle relationship.
   *
   * @return isDeviceProduct
   */
  @ApiModelProperty(example = "false", value = "Name of the bundle relationship")


  public Boolean isIsDeviceProduct() {
    return isDeviceProduct;
  }

  /**
   * Sets the checks if is device product.
   *
   * @param isDeviceProduct the new checks if is device product
   */
  public void setIsDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  /**
   * Checks if is services product.
   *
   * @param isServicesProduct the is services product
   * @return the router product details
   */
  public RouterProductDetails isServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * Name of the bundle relationship.
   *
   * @return isServicesProduct
   */
  @ApiModelProperty(example = "false", value = "Name of the bundle relationship")


  public Boolean isIsServicesProduct() {
    return isServicesProduct;
  }

  /**
   * Sets the checks if is services product.
   *
   * @param isServicesProduct the new checks if is services product
   */
  public void setIsServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  /**
   * List of image UR ls.
   *
   * @param listOfImageURLs the list of image UR ls
   * @return the router product details
   */
  public RouterProductDetails listOfImageURLs(List<ImageURL> listOfImageURLs) {
    this.listOfImageURLs = listOfImageURLs;
    return this;
  }

  /**
   * Adds the list of image UR ls item.
   *
   * @param listOfImageURLsItem the list of image UR ls item
   * @return the router product details
   */
  public RouterProductDetails addListOfImageURLsItem(ImageURL listOfImageURLsItem) {
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
   * Order.
   *
   * @param order the order
   * @return the router product details
   */
  public RouterProductDetails order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Type of relation ship.
   *
   * @return order
   */
  @ApiModelProperty(value = "Type of relation ship")


  public String getOrder() {
    return order;
  }

  /**
   * Sets the order.
   *
   * @param order the new order
   */
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * Payment type.
   *
   * @param paymentType the payment type
   * @return the router product details
   */
  public RouterProductDetails paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Name of the bundle relationship.
   *
   * @return paymentType
   */
  @ApiModelProperty(value = "Name of the bundle relationship")


  public String getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the payment type.
   *
   * @param paymentType the new payment type
   */
  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * Price info.
   *
   * @param priceInfo the price info
   * @return the router product details
   */
  public RouterProductDetails priceInfo(PriceForBundleAndHardware priceInfo) {
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

  public PriceForBundleAndHardware getPriceInfo() {
    return priceInfo;
  }

  /**
   * Sets the price info.
   *
   * @param priceInfo the new price info
   */
  public void setPriceInfo(PriceForBundleAndHardware priceInfo) {
    this.priceInfo = priceInfo;
  }

  /**
   * Product class.
   *
   * @param productClass the product class
   * @return the router product details
   */
  public RouterProductDetails productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Type of relation ship.
   *
   * @return productClass
   */
  @ApiModelProperty(value = "Type of relation ship")


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
   * Product id.
   *
   * @param productId the product id
   * @return the router product details
   */
  public RouterProductDetails productId(String productId) {
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
   * Product lines.
   *
   * @param productLines the product lines
   * @return the router product details
   */
  public RouterProductDetails productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  /**
   * Adds the product lines item.
   *
   * @param productLinesItem the product lines item
   * @return the router product details
   */
  public RouterProductDetails addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * product lines.
   *
   * @return productLines
   */
  @ApiModelProperty(value = "product lines")


  public List<String> getProductLines() {
    return productLines;
  }

  /**
   * Sets the product lines.
   *
   * @param productLines the new product lines
   */
  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
  }

  /**
   * Product name.
   *
   * @param productName the product name
   * @return the router product details
   */
  public RouterProductDetails productName(String productName) {
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
   * @return the router product details
   */
  public RouterProductDetails promotionPackages(MerchandisingPromotionsPackage promotionPackages) {
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

  public MerchandisingPromotionsPackage getPromotionPackages() {
    return promotionPackages;
  }

  /**
   * Sets the promotion packages.
   *
   * @param promotionPackages the new promotion packages
   */
  public void setPromotionPackages(MerchandisingPromotionsPackage promotionPackages) {
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(condition, delivery, description, displayName, isDefaultDevice, isDeviceProduct, isServicesProduct, listOfImageURLs, order, paymentType, priceInfo, productClass, productId, productLines, productName, promotionPackages);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

