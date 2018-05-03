package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServicePrice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class ServicePrice   {
  @JsonProperty("merchandisingPromotions")
  private MerchandisingPromotions merchandisingPromotions = null;

  @JsonProperty("monthlyDiscountPrice")
  private Price monthlyDiscountPrice = null;

  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  @JsonProperty("oneOffDiscountPrice")
  private Price oneOffDiscountPrice = null;

  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  public ServicePrice merchandisingPromotions(MerchandisingPromotions merchandisingPromotions) {
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

  public ServicePrice monthlyDiscountPrice(Price monthlyDiscountPrice) {
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

  public ServicePrice monthlyPrice(Price monthlyPrice) {
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

  public ServicePrice oneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
    return this;
  }

  /**
   * Get oneOffDiscountPrice
   * @return oneOffDiscountPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getOneOffDiscountPrice() {
    return oneOffDiscountPrice;
  }

  public void setOneOffDiscountPrice(Price oneOffDiscountPrice) {
    this.oneOffDiscountPrice = oneOffDiscountPrice;
  }

  public ServicePrice oneOffPrice(Price oneOffPrice) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePrice servicePrice = (ServicePrice) o;
    return Objects.equals(this.merchandisingPromotions, servicePrice.merchandisingPromotions) &&
        Objects.equals(this.monthlyDiscountPrice, servicePrice.monthlyDiscountPrice) &&
        Objects.equals(this.monthlyPrice, servicePrice.monthlyPrice) &&
        Objects.equals(this.oneOffDiscountPrice, servicePrice.oneOffDiscountPrice) &&
        Objects.equals(this.oneOffPrice, servicePrice.oneOffPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchandisingPromotions, monthlyDiscountPrice, monthlyPrice, oneOffDiscountPrice, oneOffPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePrice {\n");
    
    sb.append("    merchandisingPromotions: ").append(toIndentedString(merchandisingPromotions)).append("\n");
    sb.append("    monthlyDiscountPrice: ").append(toIndentedString(monthlyDiscountPrice)).append("\n");
    sb.append("    monthlyPrice: ").append(toIndentedString(monthlyPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
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

