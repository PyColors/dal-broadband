package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;


/**
 * CompatibilityPackage
 */

public class CompatibilityPackage   {
  private List<IncompatibleChildProduct> incompatibleProducts = null;
/**
 * 
 * @param incompatibleProducts
 * @return
 */
  public CompatibilityPackage incompatibleProducts(List<IncompatibleChildProduct> incompatibleProducts) {
    this.incompatibleProducts = incompatibleProducts;
    return this;
  }
/**
 * 
 * @param incompatibleProductsItem
 * @return
 */
  public CompatibilityPackage addIncompatibleProductsItem(IncompatibleChildProduct incompatibleProductsItem) {
    if (this.incompatibleProducts == null) {
      this.incompatibleProducts = new ArrayList<>();
    }
    this.incompatibleProducts.add(incompatibleProductsItem);
    return this;
  }

   /**
   * Get incompatibleProducts
   * @return incompatibleProducts
  **/
 

  @Valid
/**
 * 
 * @return
 */
  public List<IncompatibleChildProduct> getIncompatibleProducts() {
    return incompatibleProducts;
  }
/**
 * 
 * @param incompatibleProducts
 */
  public void setIncompatibleProducts(List<IncompatibleChildProduct> incompatibleProducts) {
    this.incompatibleProducts = incompatibleProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilityPackage compatibilityPackage = (CompatibilityPackage) o;
    return Objects.equals(this.incompatibleProducts, compatibilityPackage.incompatibleProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incompatibleProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilityPackage {\n");
    
    sb.append("    incompatibleProducts: ").append(toIndentedString(incompatibleProducts)).append("\n");
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

