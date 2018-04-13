package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.Objects;



/**
 * ServicePrice
 */

public class ServicePrice   {
  private String serviceId = null;

  private Price oneOffPrice = null;

  private Price oneOffDiscountPrice = null;

  private Price monthlyPrice = null;

  private Price monthlyDiscountPrice = null;

  private MerchandisingPromotion merchandisingPromotions = null;
/**
 * 
 * @param serviceId
 * @return
 */
  public ServicePrice serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Service sku id added to the basket
   * @return serviceId
  **/


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }
/**
 * 
 * @param oneOffPrice
 * @return
 */
  public ServicePrice oneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
    return this;
  }

   /**
   * Get oneOffPrice
   * @return oneOffPrice
  **/


  public Price getOneOffPrice() {
    return oneOffPrice;
  }

  public void setOneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
  }
/**
 * 
 * @param oneOffDiscountPrice
 * @return
 */
  public ServicePrice oneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
    return this;
  }

   /**
   * Get oneOffDiscountPrice
   * @return oneOffDiscountPrice
  **/


  public Price getOneOffDiscountPrice() {
    return oneOffDiscountPrice;
  }

  public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
  }
/**
 * 
 * @param monthlyPrice
 * @return
 */
  public ServicePrice monthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
    return this;
  }

   /**
   * Get monthlyPrice
   * @return monthlyPrice
  **/


  public Price getMonthlyPrice() {
    return monthlyPrice;
  }

  public void setMonthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
  }
/**
 * 
 * @param monthlyDiscountPrice
 * @return
 */
  public ServicePrice monthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
    return this;
  }

   /**
   * Get monthlyDiscountPrice
   * @return monthlyDiscountPrice
  **/


  public Price getMonthlyDiscountPrice() {
    return monthlyDiscountPrice;
  }

  public void setMonthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
  }
/**
 * 
 * @param merchandisingPromotions
 * @return
 */
  public ServicePrice merchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
    return this;
  }

   /**
   * Get merchandisingPromotions
   * @return merchandisingPromotions
  **/


  public MerchandisingPromotion getMerchandisingPromotions() {
    return merchandisingPromotions;
  }

  public void setMerchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePrice servicePrice = (ServicePrice) o;
    return Objects.equals(this.serviceId, servicePrice.serviceId) &&
        Objects.equals(this.oneOffPrice, servicePrice.oneOffPrice) &&
        Objects.equals(this.oneOffDiscountPrice, servicePrice.oneOffDiscountPrice) &&
        Objects.equals(this.monthlyPrice, servicePrice.monthlyPrice) &&
        Objects.equals(this.monthlyDiscountPrice, servicePrice.monthlyDiscountPrice) &&
        Objects.equals(this.merchandisingPromotions, servicePrice.merchandisingPromotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, oneOffPrice, oneOffDiscountPrice, monthlyPrice, monthlyDiscountPrice, merchandisingPromotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePrice {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
    sb.append("    merchandisingPromotions: ").append(toIndentedString(merchandisingPromotions)).append("\n");
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

