package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * StepPricingInfo
 */

public class StepPricingInfo   {
  private String sequence = null;

  private Price oneOffPrice = null;

  private Price monthlyPrice = null;

  private Duration duration = null;

  private List<Discount> discountsApplicable = new ArrayList<>();



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
   * Get duration
   * @return duration
  **/
  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }


   /**
   * List of applicable discount sku for this duration
   * @return discountsApplicable
  **/
  public List<Discount> getDiscountsApplicable() {
    return discountsApplicable;
  }

  public void setDiscountsApplicable(List<Discount> discountsApplicable) {
    this.discountsApplicable = discountsApplicable;
  }


 
}

