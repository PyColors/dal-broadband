package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * PriceForBasket
 */

public class PriceForBasket   {
  private List<PriceForPackage> packages = new ArrayList<>();

  private Price oneOffPrice = null;

  private Price oneOffDiscountPrice = null;

  private Price monthlyPrice = null;

  private Price monthlyDiscountPrice = null;

  private List<StepPricingInfo> stepPrices = new ArrayList<>();

  private String totalOneoffPriceSaving = null;

  private String totalMonthlyPriceSaving = null;

  

 

   /**
   * Pricing info for the packages
   * @return packages
  **/
  public List<PriceForPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<PriceForPackage> packages) {
    this.packages = packages;
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
  public PriceForBasket oneOffDiscountPrice(Price oneOffDiscountPrice) {
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
  public PriceForBasket monthlyPrice(Price monthlyPrice) {
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
  public PriceForBasket monthlyDiscountPrice(Price monthlyDiscountPrice) {
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
 * @param stepPrices
 * @return
 */
  public PriceForBasket stepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
    return this;
  }
/**
 * 
 * @param stepPricesItem
 * @return
 */
  public PriceForBasket addStepPricesItem(StepPricingInfo stepPricesItem) {
    this.stepPrices.add(stepPricesItem);
    return this;
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
/**
 * 
 * @param totalOneoffPriceSaving
 * @return
 */
  public PriceForBasket totalOneoffPriceSaving(String totalOneoffPriceSaving) {
    this.totalOneoffPriceSaving = totalOneoffPriceSaving;
    return this;
  }

   /**
   * total Oneoff price Saving for basket
   * @return totalOneoffPriceSaving
  **/
  public String getTotalOneoffPriceSaving() {
    return totalOneoffPriceSaving;
  }

  public void setTotalOneoffPriceSaving(String totalOneoffPriceSaving) {
    this.totalOneoffPriceSaving = totalOneoffPriceSaving;
  }
/**
 * 
 * @param totalMonthlyPriceSaving
 * @return
 */
  public PriceForBasket totalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
    this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
    return this;
  }

   /**
   * total Monthly price Saving for basket
   * @return totalMonthlyPriceSaving
  **/
  public String getTotalMonthlyPriceSaving() {
    return totalMonthlyPriceSaving;
  }

  public void setTotalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
    this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
  }

}

