package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StepPricingInfo.
 */

public class StepPricingInfo   {
  
  /** The sequence. */
  private String sequence = null;

  /** The one off price. */
  private Price oneOffPrice = null;

  /** The monthly price. */
  private Price monthlyPrice = null;

  /** The duration. */
  private Duration duration = null;

  /** The discount sku ids. */
  private List<String> discountSkuIds = new ArrayList<>();

  /**
   * Sequence.
   *
   * @param sequence the sequence
   * @return the step pricing info
   */
  public StepPricingInfo sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
    * Sequence no of the line item.
    *
    * @return sequence
    */
  public String getSequence() {
    return sequence;
  }

  /**
   * Sets the sequence.
   *
   * @param sequence the new sequence
   */
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the step pricing info
   */
  public StepPricingInfo oneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
    return this;
  }

   /**
    * Get oneOffPrice.
    *
    * @return oneOffPrice
    */
  public Price getOneOffPrice() {
    return oneOffPrice;
  }

  /**
   * Sets the one off price.
   *
   * @param oneOffPrice the new one off price
   */
  public void setOneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
  }

  /**
   * Monthly price.
   *
   * @param monthlyPrice the monthly price
   * @return the step pricing info
   */
  public StepPricingInfo monthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
    return this;
  }

   /**
    * Get monthlyPrice.
    *
    * @return monthlyPrice
    */
  public Price getMonthlyPrice() {
    return monthlyPrice;
  }

  /**
   * Sets the monthly price.
   *
   * @param monthlyPrice the new monthly price
   */
  public void setMonthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
  }

  /**
   * Duration.
   *
   * @param duration the duration
   * @return the step pricing info
   */
  public StepPricingInfo duration(Duration duration) {
    this.duration = duration;
    return this;
  }

   /**
    * Get duration.
    *
    * @return duration
    */
  public Duration getDuration() {
    return duration;
  }

  /**
   * Sets the duration.
   *
   * @param duration the new duration
   */
  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  /**
   * Discount sku ids.
   *
   * @param discountSkuIds the discount sku ids
   * @return the step pricing info
   */
  public StepPricingInfo discountSkuIds(List<String> discountSkuIds) {
    this.discountSkuIds = discountSkuIds;
    return this;
  }

  /**
   * Adds the discount sku ids item.
   *
   * @param discountSkuIdsItem the discount sku ids item
   * @return the step pricing info
   */
  public StepPricingInfo addDiscountSkuIdsItem(String discountSkuIdsItem) {
    this.discountSkuIds.add(discountSkuIdsItem);
    return this;
  }

   /**
    * List of applicable discount sku Ids for this duration.
    *
    * @return discountSkuIds
    */
  public List<String> getDiscountSkuIds() {
    return discountSkuIds;
  }

  /**
   * Sets the discount sku ids.
   *
   * @param discountSkuIds the new discount sku ids
   */
  public void setDiscountSkuIds(List<String> discountSkuIds) {
    this.discountSkuIds = discountSkuIds;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepPricingInfo stepPricingInfo = (StepPricingInfo) o;
    return Objects.equals(this.sequence, stepPricingInfo.sequence) &&
        Objects.equals(this.oneOffPrice, stepPricingInfo.oneOffPrice) &&
        Objects.equals(this.monthlyPrice, stepPricingInfo.monthlyPrice) &&
        Objects.equals(this.duration, stepPricingInfo.duration) &&
        Objects.equals(this.discountSkuIds, stepPricingInfo.discountSkuIds);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(sequence, oneOffPrice, monthlyPrice, duration, discountSkuIds);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepPricingInfo {\n");
    
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    discountSkuIds: ").append(toIndentedString(discountSkuIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

