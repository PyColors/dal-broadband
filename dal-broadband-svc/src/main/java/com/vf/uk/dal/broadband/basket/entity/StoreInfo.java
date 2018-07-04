package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StoreInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class StoreInfo   {
  @JsonProperty("stockStatus")
  private String stockStatus = null;

  @JsonProperty("storeAlias")
  private String storeAlias = null;

  @JsonProperty("storeId")
  private String storeId = null;

  @JsonProperty("storeName")
  private String storeName = null;

  public StoreInfo stockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
    return this;
  }

  /**
   * Store Statusby 
   * @return stockStatus
  **/
  @ApiModelProperty(value = "Store Statusby ")


  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
  }

  public StoreInfo storeAlias(String storeAlias) {
    this.storeAlias = storeAlias;
    return this;
  }

  /**
   * Store Alias selected by the user for click and collect
   * @return storeAlias
  **/
  @ApiModelProperty(value = "Store Alias selected by the user for click and collect")


  public String getStoreAlias() {
    return storeAlias;
  }

  public void setStoreAlias(String storeAlias) {
    this.storeAlias = storeAlias;
  }

  public StoreInfo storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

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

  public StoreInfo storeName(String storeName) {
    this.storeName = storeName;
    return this;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreInfo storeInfo = (StoreInfo) o;
    return Objects.equals(this.stockStatus, storeInfo.stockStatus) &&
        Objects.equals(this.storeAlias, storeInfo.storeAlias) &&
        Objects.equals(this.storeId, storeInfo.storeId) &&
        Objects.equals(this.storeName, storeInfo.storeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockStatus, storeAlias, storeId, storeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreInfo {\n");
    
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    storeAlias: ").append(toIndentedString(storeAlias)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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

