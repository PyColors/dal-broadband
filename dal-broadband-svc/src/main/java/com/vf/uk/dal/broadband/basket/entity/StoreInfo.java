package com.vf.uk.dal.broadband.basket.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * StoreInfo
 */

public class StoreInfo   {
  private String storeId = null;

  private String storeName = null;

  private String storeAlias = null;
  
  private String stockStatus = null;



  

/**
   * Sku ID of the delivery product
   * @return storeId
  **/
  @ApiModelProperty(value = "Sku ID of the delivery product ")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

 

   /**
   * Store ID selected by the user for click and collect
   * @return storeName
  **/
  @ApiModelProperty(value = "Store ID selected by the user for click and collect")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  @ApiModelProperty(value = "Store Statusby ")
  public String getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}
 

   /**
   * Store ID selected by the user for click and collect
   * @return storeAlias
  **/
	@ApiModelProperty(value = "Store Alias selected by the user for click and collect")
  public String getStoreAlias() {
    return storeAlias;
  }

  public void setStoreAlias(String storeAlias) {
    this.storeAlias = storeAlias;
  }

  
}

