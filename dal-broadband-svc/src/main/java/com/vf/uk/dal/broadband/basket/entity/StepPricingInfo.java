package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StepPricingInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class StepPricingInfo   {
  @JsonProperty("discountSkuIds")
  @Valid
  private List<String> discountSkuIds = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  @JsonProperty("sequence")
  private String sequence = null;

  public StepPricingInfo discountSkuIds(List<String> discountSkuIds) {
    this.discountSkuIds = discountSkuIds;
    return this;
  }

  public StepPricingInfo addDiscountSkuIdsItem(String discountSkuIdsItem) {
    if (this.discountSkuIds == null) {
      this.discountSkuIds = new ArrayList<String>();
    }
    this.discountSkuIds.add(discountSkuIdsItem);
    return this;
  }

  /**
   * Get discountSkuIds
   * @return discountSkuIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getDiscountSkuIds() {
    return discountSkuIds;
  }

  public void setDiscountSkuIds(List<String> discountSkuIds) {
    this.discountSkuIds = discountSkuIds;
  }

  public StepPricingInfo duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public StepPricingInfo monthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
    return this;
  }

  /**
   * Get monthlyPrice
   * @return monthlyPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getMonthlyPrice() {
    return monthlyPrice;
  }

  public void setMonthlyPrice(Price monthlyPrice) {
    this.monthlyPrice = monthlyPrice;
  }

  public StepPricingInfo oneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
    return this;
  }

  /**
   * Get oneOffPrice
   * @return oneOffPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getOneOffPrice() {
    return oneOffPrice;
  }

  public void setOneOffPrice(Price oneOffPrice) {
    this.oneOffPrice = oneOffPrice;
  }

  public StepPricingInfo sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")


  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(discountSkuIds, duration, monthlyPrice, oneOffPrice, sequence);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

