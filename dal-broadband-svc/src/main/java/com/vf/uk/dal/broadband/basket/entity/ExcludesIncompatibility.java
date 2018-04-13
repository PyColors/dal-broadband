package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Populated only when excludes rules are not met.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T16:44:04.709Z")

public class ExcludesIncompatibility   {
  @JsonProperty("productIds")
  private List<String> productIds = null;
/**
 * 
 * @param productIds
 * @return
 */
  public ExcludesIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }
/**
 * 
 * @param productIdsItem
 * @return
 */
  public ExcludesIncompatibility addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * List of productIds which need to be exluded against this product.
   * @return productIds
  **/


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludesIncompatibility excludesIncompatibility = (ExcludesIncompatibility) o;
    return Objects.equals(this.productIds, excludesIncompatibility.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludesIncompatibility {\n");
    
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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

