package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

/**
 * CompatibilityRequest
 */

public class CompatibilityRequest   {
  private List<NewChildProduct> newProducts = null;

  private Promotion targetPromotion = null;
/**
 * 
 * @param newProducts
 * @return
 */
  public CompatibilityRequest newProducts(List<NewChildProduct> newProducts) {
    this.newProducts = newProducts;
    return this;
  }
/**
 * 
 * @param newProductsItem
 * @return
 */
  public CompatibilityRequest addNewProductsItem(NewChildProduct newProductsItem) {
    if (this.newProducts == null) {
      this.newProducts = new ArrayList<>();
    }
    this.newProducts.add(newProductsItem);
    return this;
  }

   /**
   * Get newProducts
   * @return newProducts
  **/
  @Valid

  public List<NewChildProduct> getNewProducts() {
    return newProducts;
  }
/**
 * 
 * @param newProducts
 */
  public void setNewProducts(List<NewChildProduct> newProducts) {
    this.newProducts = newProducts;
  }
/**
 * 
 * @param targetPromotion
 * @return
 */
  public CompatibilityRequest targetPromotion(Promotion targetPromotion) {
    this.targetPromotion = targetPromotion;
    return this;
  }

   /**
   * Get targetPromotion
   * @return targetPromotion
  **/
  @Valid

  public Promotion getTargetPromotion() {
    return targetPromotion;
  }

  public void setTargetPromotion(Promotion targetPromotion) {
    this.targetPromotion = targetPromotion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilityRequest compatibilityRequest = (CompatibilityRequest) o;
    return Objects.equals(this.newProducts, compatibilityRequest.newProducts) &&
        Objects.equals(this.targetPromotion, compatibilityRequest.targetPromotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newProducts, targetPromotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilityRequest {\n");
    
    sb.append("    newProducts: ").append(toIndentedString(newProducts)).append("\n");
    sb.append("    targetPromotion: ").append(toIndentedString(targetPromotion)).append("\n");
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

