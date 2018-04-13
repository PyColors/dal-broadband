package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * PriceForBundle
 */

public class PriceForBundle   {
  private BundlePrice bundlePrice = null;

  private Price monthlyPrice = null;

  private Price monthlyDiscountPrice = null;

  private List<StepPricingInfo> stepPrices = new ArrayList<>();

 

   /**
   * Get bundlePrice
   * @return bundlePrice
  **/
  public BundlePrice getBundlePrice() {
    return bundlePrice;
  }

  public void setBundlePrice(BundlePrice bundlePrice) {
    this.bundlePrice = bundlePrice;
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
   * Get stepPrices
   * @return stepPrices
  **/
  public List<StepPricingInfo> getStepPrices() {
    return stepPrices;
  }

  public void setStepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
  }

 
}

