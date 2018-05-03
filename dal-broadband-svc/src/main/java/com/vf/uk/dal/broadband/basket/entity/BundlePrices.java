package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundlePrice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BundlePrices   {
  @JsonProperty("merchandisingPromotions")
  private MerchandisingPromotions merchandisingPromotions = null;

  @JsonProperty("monthlyDiscountPrice")
  private Price monthlyDiscountPrice = null;

  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  public BundlePrices merchandisingPromotions(MerchandisingPromotions merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
    return this;
  }

  /**
   * Get merchandisingPromotions
   * @return merchandisingPromotions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotions getMerchandisingPromotions() {
    return merchandisingPromotions;
  }

  public void setMerchandisingPromotions(MerchandisingPromotions merchandisingPromotions) {
    this.merchandisingPromotions = merchandisingPromotions;
  }

  public BundlePrices monthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
    return this;
  }

  /**
   * Get monthlyDiscountPrice
   * @return monthlyDiscountPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getMonthlyDiscountPrice() {
    return monthlyDiscountPrice;
  }

  public void setMonthlyDiscountPrice(Price monthlyDiscountPrice) {
    this.monthlyDiscountPrice = monthlyDiscountPrice;
  }

  public BundlePrices monthlyPrice(Price monthlyPrice) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundlePrices bundlePrice = (BundlePrices) o;
    return Objects.equals(this.merchandisingPromotions, bundlePrice.merchandisingPromotions) &&
        Objects.equals(this.monthlyDiscountPrice, bundlePrice.monthlyDiscountPrice) &&
        Objects.equals(this.monthlyPrice, bundlePrice.monthlyPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchandisingPromotions, monthlyDiscountPrice, monthlyPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundlePrice {\n");
    
    sb.append("    merchandisingPromotions: ").append(toIndentedString(merchandisingPromotions)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
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

