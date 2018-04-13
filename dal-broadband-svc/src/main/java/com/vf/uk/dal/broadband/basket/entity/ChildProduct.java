package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;


/**
 * ChildProduct
 */

public class ChildProduct   {
  private String productId = null;
/**
 * 
 * @param productId
 * @return
 */
  public ChildProduct productId(String productId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildProduct childProduct = (ChildProduct) o;
    return Objects.equals(this.productId, childProduct.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

