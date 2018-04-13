package com.vf.uk.dal.broadband.basket.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeliveryInfo
 */

public class DeliveryInfo   {
  private String skuId = null;

  private String displayName = null;

  private String deliveryType = null;

  private String stockStatus = null;

  private String availableFrom = null;

  private StoreInfo storeInfo = null;

  private Price price = null;



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
   * Get storeInfo
   * @return storeInfo
  **/
  @ApiModelProperty(value = "retirn Store Info")
  public StoreInfo getStoreInfo() {
    return storeInfo;
  }

  public void setStoreInfo(StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
  }



   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "Get Price Information")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  
}

