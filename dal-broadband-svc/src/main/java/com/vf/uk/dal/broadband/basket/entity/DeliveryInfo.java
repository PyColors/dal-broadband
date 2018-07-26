package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeliveryInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class DeliveryInfo   {
  @JsonProperty("availableFrom")
  private String availableFrom = null;

  @JsonProperty("deliveryType")
  private String deliveryType = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("skuId")
  private String skuId = null;

  @JsonProperty("stockStatus")
  private String stockStatus = null;

  @JsonProperty("storeInfo")
  private StoreInfo storeInfo = null;

  /**
   * 
   * @param availableFrom
   * @return
   */
  public DeliveryInfo availableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

  /**
   * Availability of the stock as per the selected delivery method
   * @return availableFrom
  **/
  @ApiModelProperty(value = "Availability of the stock as per the selected delivery method")


  public String getAvailableFrom() {
    return availableFrom;
  }

  public void setAvailableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
  }

  /**
   * 
   * @param deliveryType
   * @return
   */
  public DeliveryInfo deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  /**
   * Standard, Click & Collect, Deliver to Store or Premium
   * @return deliveryType
  **/
  @ApiModelProperty(value = "Standard, Click & Collect, Deliver to Store or Premium")


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  /**
   * 
   * @param displayName
   * @return
   */
  public DeliveryInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the delivery sku
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the delivery sku")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * 
   * @param price
   * @return
   */
  public DeliveryInfo price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get Price Information
   * @return price
  **/
  @ApiModelProperty(value = "Get Price Information")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  /**
   * 
   * @param skuId
   * @return
   */
  public DeliveryInfo skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Sku ID of the delivery product
   * @return skuId
  **/
  @ApiModelProperty(value = "Sku ID of the delivery product")


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  /**
   * 
   * @param stockStatus
   * @return
   */
  public DeliveryInfo stockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
    return this;
  }

  /**
   * Represents the stock status. possible values instock,outofstock,preorder,backorder
   * @return stockStatus
  **/
  @ApiModelProperty(value = "Represents the stock status. possible values instock,outofstock,preorder,backorder")


  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
  }

  /**
   * 
   * @param storeInfo
   * @return
   */
  public DeliveryInfo storeInfo(StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    return this;
  }

  /**
   * retirn Store Info
   * @return storeInfo
  **/
  @ApiModelProperty(value = "retirn Store Info")

  @Valid

  public StoreInfo getStoreInfo() {
    return storeInfo;
  }

  public void setStoreInfo(StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfo deliveryInfo = (DeliveryInfo) o;
    return Objects.equals(this.availableFrom, deliveryInfo.availableFrom) &&
        Objects.equals(this.deliveryType, deliveryInfo.deliveryType) &&
        Objects.equals(this.displayName, deliveryInfo.displayName) &&
        Objects.equals(this.price, deliveryInfo.price) &&
        Objects.equals(this.skuId, deliveryInfo.skuId) &&
        Objects.equals(this.stockStatus, deliveryInfo.stockStatus) &&
        Objects.equals(this.storeInfo, deliveryInfo.storeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableFrom, deliveryType, displayName, price, skuId, stockStatus, storeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfo {\n");
    
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
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

