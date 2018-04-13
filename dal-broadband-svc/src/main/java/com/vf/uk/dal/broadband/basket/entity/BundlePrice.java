package com.vf.uk.dal.broadband.basket.entity;

/**
 * BundlePrice
 */

public class BundlePrice   {
  private Price monthlyPrice = null;

  private Price monthlyDiscountPrice = null;

  private MerchandisingPromotion merchandisingPromotions = null;



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

