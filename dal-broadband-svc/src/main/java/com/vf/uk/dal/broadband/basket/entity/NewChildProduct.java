package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

/**
 * NewChildProduct
 */

public class NewChildProduct   {
  private String productId = null;

  private String targetServiceProductId = null;
/**
 * 
 * @param productId
 * @return
 */
  public NewChildProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * product Id for the child product.
   * @return productId
  **/


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }
/**
 * 
 * @param targetServiceProductId
 * @return
 */
  public NewChildProduct targetServiceProductId(String targetServiceProductId) {
    this.targetServiceProductId = targetServiceProductId;
    return this;
  }

   /**
   * Target Service Product in the .
   * @return targetServiceProductId
  **/


  public String getTargetServiceProductId() {
    return targetServiceProductId;
  }

  public void setTargetServiceProductId(String targetServiceProductId) {
    this.targetServiceProductId = targetServiceProductId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewChildProduct newChildProduct = (NewChildProduct) o;
    return Objects.equals(this.productId, newChildProduct.productId) &&
        Objects.equals(this.targetServiceProductId, newChildProduct.targetServiceProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, targetServiceProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewChildProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    targetServiceProductId: ").append(toIndentedString(targetServiceProductId)).append("\n");
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

