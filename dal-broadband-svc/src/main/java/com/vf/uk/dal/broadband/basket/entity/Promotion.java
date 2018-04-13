package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

/**
 * Promotion
 */

public class Promotion   {
  private String promotionId = null;

  private List<ServiceProduct> serviceProducts = null;
/**
 * 
 * @param promotionId
 * @return
 */
  public Promotion promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * promotion Id for the promotion.
   * @return promotionId
  **/


  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }
/**
 * 
 * @param serviceProducts
 * @return
 */
  public Promotion serviceProducts(List<ServiceProduct> serviceProducts) {
    this.serviceProducts = serviceProducts;
    return this;
  }
/**
 * 
 * @param serviceProductsItem
 * @return
 */
  public Promotion addServiceProductsItem(ServiceProduct serviceProductsItem) {
    if (this.serviceProducts == null) {
      this.serviceProducts = new ArrayList<>();
    }
    this.serviceProducts.add(serviceProductsItem);
    return this;
  }

   /**
   * Get serviceProducts
   * @return serviceProducts
  **/

  @Valid

  public List<ServiceProduct> getServiceProducts() {
    return serviceProducts;
  }

  public void setServiceProducts(List<ServiceProduct> serviceProducts) {
    this.serviceProducts = serviceProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.promotionId, promotion.promotionId) &&
        Objects.equals(this.serviceProducts, promotion.serviceProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionId, serviceProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    serviceProducts: ").append(toIndentedString(serviceProducts)).append("\n");
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

