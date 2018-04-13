package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;
/**
 * Product is added scussfully to package
 */

public class AddProductResponse   {
  private String productLineId = null;
/**
 * 
 * @param productLineId
 * @return
 */
  public AddProductResponse productLineId(String productLineId) {
    this.productLineId = productLineId;
    return this;
  }

   /**
   * Get productLineId
   * @return productLineId
  **/
  public String getProductLineId() {
    return productLineId;
  }

  public void setProductLineId(String productLineId) {
    this.productLineId = productLineId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddProductResponse addProductResponse = (AddProductResponse) o;
    return Objects.equals(this.productLineId, addProductResponse.productLineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddProductResponse {\n");
    
    sb.append("    productLineId: ").append(toIndentedString(productLineId)).append("\n");
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

