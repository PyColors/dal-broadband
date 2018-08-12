package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PriceDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class PriceDetails   {
  
  /** The monthly discount price. */
  @JsonProperty("monthlyDiscountPrice")
  private Price monthlyDiscountPrice = null;

  /** The monthly price. */
  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  /** The one off discount price. */
  @JsonProperty("oneOffDiscountPrice")
  private Price oneOffDiscountPrice = null;

  /** The one off price. */
  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  /** The step prices. */
  @JsonProperty("stepPrices")
  @Valid
  private List<StepPricingInfo> stepPrices = null;

  /**
   * Monthly discount price.
   *
   * @param monthlyDiscountPrice the monthly discount price
   * @return the price details
   */
  public PriceDetails monthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
    return this;
  }

  /**
   * Get monthlyDiscountPrice.
   *
   * @return monthlyDiscountPrice
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getMonthlyDiscountPrice() {
    return monthlyDiscountPrice;
  }

  /**
   * Sets the monthly discount price.
   *
   * @param monthlyDiscountPrice the new monthly discount price
   */
  public void setMonthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
  }

  /**
   * Monthly price.
   *
   * @param monthlyPrice the monthly price
   * @return the price details
   */
  public PriceDetails monthlyPrice(Price monthlyPrice) {
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
   * One off discount price.
   *
   * @param oneOffDiscountPrice the one off discount price
   * @return the price details
   */
  public PriceDetails oneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
    return this;
  }

  /**
   * Get oneOffDiscountPrice.
   *
   * @return oneOffDiscountPrice
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getOneOffDiscountPrice() {
    return oneOffDiscountPrice;
  }

  /**
   * Sets the one off discount price.
   *
   * @param oneOffDiscountPrice the new one off discount price
   */
  public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
  }

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the price details
   */
  public PriceDetails oneOffPrice(Price oneOffPrice) {
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
   * Step prices.
   *
   * @param stepPrices the step prices
   * @return the price details
   */
  public PriceDetails stepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
    return this;
  }

  /**
   * Adds the step prices item.
   *
   * @param stepPricesItem the step prices item
   * @return the price details
   */
  public PriceDetails addStepPricesItem(StepPricingInfo stepPricesItem) {
    if (this.stepPrices == null) {
      this.stepPrices = new ArrayList<>();
    }
    this.stepPrices.add(stepPricesItem);
    return this;
  }

  /**
   * Get stepPrices.
   *
   * @return stepPrices
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<StepPricingInfo> getStepPrices() {
    return stepPrices;
  }

  /**
   * Sets the step prices.
   *
   * @param stepPrices the new step prices
   */
  public void setStepPrices(List<StepPricingInfo> stepPrices) {
    this.stepPrices = stepPrices;
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
    PriceDetails priceDetails = (PriceDetails) o;
    return Objects.equals(this.monthlyDiscountPrice, priceDetails.monthlyDiscountPrice) &&
        Objects.equals(this.monthlyPrice, priceDetails.monthlyPrice) &&
        Objects.equals(this.oneOffDiscountPrice, priceDetails.oneOffDiscountPrice) &&
        Objects.equals(this.oneOffPrice, priceDetails.oneOffPrice) &&
        Objects.equals(this.stepPrices, priceDetails.stepPrices);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(monthlyDiscountPrice, monthlyPrice, oneOffDiscountPrice, oneOffPrice, stepPrices);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDetails {\n");
    
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    stepPrices: ").append(toIndentedString(stepPrices)).append("\n");
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

