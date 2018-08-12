package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StepPricingInfo.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class StepPricingInfo   {
  
  /** The discount sku ids. */
  @JsonProperty("discountSkuIds")
  @Valid
  private List<String> discountSkuIds = null;

  /** The duration. */
  @JsonProperty("duration")
  private String duration = null;

  /** The monthly price. */
  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  /** The one off price. */
  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  /** The sequence. */
  @JsonProperty("sequence")
  private String sequence = null;

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
    if (this.discountSkuIds == null) {
      this.discountSkuIds = new ArrayList<>();
    }
    this.discountSkuIds.add(discountSkuIdsItem);
    return this;
  }

  /**
   * Get discountSkuIds.
   *
   * @return discountSkuIds
   */
  @ApiModelProperty(value = "")


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

  /**
   * Duration.
   *
   * @param duration the duration
   * @return the step pricing info
   */
  public StepPricingInfo duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration.
   *
   * @return duration
   */
  @ApiModelProperty(value = "")


  public String getDuration() {
    return duration;
  }

  /**
   * Sets the duration.
   *
   * @param duration the new duration
   */
  public void setDuration(String duration) {
    this.duration = duration;
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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
   * Get sequence.
   *
   * @return sequence
   */
  @ApiModelProperty(value = "")


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
    return Objects.equals(this.discountSkuIds, stepPricingInfo.discountSkuIds) &&
        Objects.equals(this.duration, stepPricingInfo.duration) &&
        Objects.equals(this.monthlyPrice, stepPricingInfo.monthlyPrice) &&
        Objects.equals(this.oneOffPrice, stepPricingInfo.oneOffPrice) &&
        Objects.equals(this.sequence, stepPricingInfo.sequence);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(discountSkuIds, duration, monthlyPrice, oneOffPrice, sequence);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepPricingInfo {\n");
    
    sb.append("    discountSkuIds: ").append(toIndentedString(discountSkuIds)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

