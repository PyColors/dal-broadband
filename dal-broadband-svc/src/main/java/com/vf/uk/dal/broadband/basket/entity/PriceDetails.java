package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vf.uk.dal.broadband.basket.price.entity.AccessoryDiscount;
/**
 * PriceDetails
 */

public class PriceDetails   {
  private Price oneOffPrice = null;

  private Price oneOffDiscountPrice = null;

  private Price monthlyPrice = null;

  private Price monthlyDiscountPrice = null;

  private List<StepPricingInfo> stepPrices = new ArrayList<>();
  
  @JsonIgnore
  private List<AccessoryDiscount> accessoryDiscounts = new ArrayList<>();
  public List<AccessoryDiscount> getAccessoryDiscounts() {
	return accessoryDiscounts;
}

public void setAccessoryDiscounts(List<AccessoryDiscount> accessoryDiscounts) {
	this.accessoryDiscounts = accessoryDiscounts;
}

/**
   * 
   * @param oneOffPrice
   * @return
   */
  public PriceDetails oneOffPrice(Price oneOffPrice) {
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
  public PriceDetails oneOffDiscountPrice(Price oneOffDiscountPrice) {
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
  public PriceDetails monthlyPrice(Price monthlyPrice) {
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
  public PriceDetails monthlyDiscountPrice(Price monthlyDiscountPrice) {
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
  public PriceDetails stepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
    return this;
  }
  /**
   * 
   * @param stepPricesItem
   * @return
   */
  public PriceDetails addStepPricesItem(StepPricingInfo stepPricesItem) {
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

}

