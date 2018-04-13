package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Populated only when requires rules are not met.
 */

public class RequiresIncompatibility   {
  private List<String> productClasses = null;

  private List<String> productIds = null;

  private List<String> productLines = null;
/**
 * 
 * @param productClasses
 * @return
 */
  public RequiresIncompatibility productClasses(List<String> productClasses) {
    this.productClasses = productClasses;
    return this;
  }
/**
 * 
 * @param productClassesItem
 * @return
 */
  public RequiresIncompatibility addProductClassesItem(String productClassesItem) {
    if (this.productClasses == null) {
      this.productClasses = new ArrayList<>();
    }
    this.productClasses.add(productClassesItem);
    return this;
  }

   /**
   * List of productClasses which are required. Populated only when Rex rules on subject Product classes are not met.
   * @return productClasses
  **/


  public List<String> getProductClasses() {
    return productClasses;
  }

  public void setProductClasses(List<String> productClasses) {
    this.productClasses = productClasses;
  }
/**
 * 
 * @param productIds
 * @return
 */
  public RequiresIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }
/**
 * 
 * @param productIdsItem
 * @return
 */
  public RequiresIncompatibility addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * List of productIds which are required.Populated only when Rex rules on subject Product Ids are not met.
   * @return productIds
  **/


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }
/**
 * 
 * @param productLines
 * @return
 */
  public RequiresIncompatibility productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }
/**
 * 
 * @param productLinesItem
 * @return
 */
  public RequiresIncompatibility addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

   /**
   * List of Product Lines which are required.Populated only when Rex rules on subject Product Lines are not met.
   * @return productLines
  **/


  public List<String> getProductLines() {
    return productLines;
  }

  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiresIncompatibility requiresIncompatibility = (RequiresIncompatibility) o;
    return Objects.equals(this.productClasses, requiresIncompatibility.productClasses) &&
        Objects.equals(this.productIds, requiresIncompatibility.productIds) &&
        Objects.equals(this.productLines, requiresIncompatibility.productLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productClasses, productIds, productLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiresIncompatibility {\n");
    
    sb.append("    productClasses: ").append(toIndentedString(productClasses)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productLines: ").append(toIndentedString(productLines)).append("\n");
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

