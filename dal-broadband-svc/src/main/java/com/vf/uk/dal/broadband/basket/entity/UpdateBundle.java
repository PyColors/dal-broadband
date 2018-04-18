package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateBundle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class UpdateBundle   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("productLineId")
  private String productLineId = null;

  @JsonProperty("skuId")
  private String skuId = null;

  public UpdateBundle action(String action) {
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

  public UpdateBundle productLineId(String productLineId) {
    this.productLineId = productLineId;
    return this;
  }

  /**
   * Get productLineId
   * @return productLineId
  **/
  @ApiModelProperty(value = "")


  public String getProductLineId() {
    return productLineId;
  }

  public void setProductLineId(String productLineId) {
    this.productLineId = productLineId;
  }

  public UpdateBundle skuId(String skuId) {
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
    UpdateBundle updateBundle = (UpdateBundle) o;
    return Objects.equals(this.action, updateBundle.action) &&
        Objects.equals(this.productLineId, updateBundle.productLineId) &&
        Objects.equals(this.skuId, updateBundle.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, productLineId, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBundle {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    productLineId: ").append(toIndentedString(productLineId)).append("\n");
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

