package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * BundlePrice
 */

public class BundlePrice   {
  private String bundleId = null;

  private Price monthlyPrice = null;

  private Price monthlyDiscountPrice = null;

  private MerchandisingPromotion merchandisingPromotions = null;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ServicePrice> bundledServicePrices = null;

  public List<ServicePrice> getBundledServicePrices() {
    return bundledServicePrices;
  }

  public void setBundledServicePrices(List<ServicePrice> servicePrices) {
    this.bundledServicePrices = servicePrices;
  }

  public void addServicePriceItem(ServicePrice servicePrice) {
    if (this.bundledServicePrices == null) {
      this.bundledServicePrices = new ArrayList<ServicePrice>();
    }
    this.bundledServicePrices.add(servicePrice);
  }

   /**
   * Bundle sku id added to the basket
   * @return bundleId
  **/
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
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
   * Get merchandisingPromotions
   * @return merchandisingPromotions
  **/
  public MerchandisingPromotion getMerchandisingPromotions() {
    return merchandisingPromotions;
  }

  public void setMerchandisingPromotions(MerchandisingPromotion merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
  }

}

