package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Product.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Product   {
  
  /** The action. */
  @JsonProperty("action")
  private String action = null;

  /** The product type. */
  @JsonProperty("productType")
  private String productType = null;

  /** The sku id. */
  @JsonProperty("skuId")
  private String skuId = null;

  /**
   * Action.
   *
   * @param action the action
   * @return the product
   */
  public Product action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action.
   *
   * @return action
   */
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  /**
   * Sets the action.
   *
   * @param action the new action
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Product type.
   *
   * @param productType the product type
   * @return the product
   */
  public Product productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType.
   *
   * @return productType
   */
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  /**
   * Sets the product type.
   *
   * @param productType the new product type
   */
  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * Sku id.
   *
   * @param skuId the sku id
   * @return the product
   */
  public Product skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId.
   *
   * @return skuId
   */
  @ApiModelProperty(value = "")


  public String getSkuId() {
    return skuId;
  }

  /**
   * Sets the sku id.
   *
   * @param skuId the new sku id
   */
  public void setSkuId(String skuId) {
    this.skuId = skuId;
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
    Product product = (Product) o;
    return Objects.equals(this.action, product.action) &&
        Objects.equals(this.productType, product.productType) &&
        Objects.equals(this.skuId, product.skuId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, productType, skuId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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

