package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * StepPricingInfo
 */

public class StepPricingInfo   {
  private String sequence = null;

  private Price oneOffPrice = null;

  private Price monthlyPrice = null;

  private String duration = null;

  private List<String> discountSkuIds = new ArrayList<>();
  /**
   * 
   * @param sequence
   * @return
   */
  public StepPricingInfo sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequence no of the line item
   * @return sequence
  **/
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }
  /**
   * 
   * @param oneOffPrice
   * @return
   */
  public StepPricingInfo oneOffPrice(Price oneOffPrice) {
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
   * @param monthlyPrice
   * @return
   */
  public StepPricingInfo monthlyPrice(Price monthlyPrice) {
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
   * @param duration
   * @return
   */
  public StepPricingInfo duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration from the start of the subscription for which this step pricing would be applicable
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }
  /**
   * 
   * @param discountSkuIds
   * @return
   */
  public StepPricingInfo discountSkuIds(List<String> discountSkuIds) {
    this.discountSkuIds = discountSkuIds;
    return this;
  }
/**
 * 
 * @param discountSkuIdsItem
 * @return
 */
  public StepPricingInfo addDiscountSkuIdsItem(String discountSkuIdsItem) {
    this.discountSkuIds.add(discountSkuIdsItem);
    return this;
  }

   /**
   * List of applicable discount sku Ids for this duration
   * @return discountSkuIds
  **/
  public List<String> getDiscountSkuIds() {
    return discountSkuIds;
  }

  public void setDiscountSkuIds(List<String> discountSkuIds) {
    this.discountSkuIds = discountSkuIds;
  }

}

