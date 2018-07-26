package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PriceForBundleAndHardware.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")

public class RouterPriceForHardware   {
 

 
  /** The one off price. */
  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  /** The one off discount price. */
  @JsonProperty("oneOffDiscountPrice")
  private Price oneOffDiscountPrice = null;

  

  

  /**
   * One off price.
   *
   * @param oneOffPrice the one off price
   * @return the router price for hardware
   */
  public RouterPriceForHardware oneOffPrice(Price oneOffPrice) {
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
   * One off discount price.
   *
   * @param oneOffDiscountPrice the one off discount price
   * @return the router price for hardware
   */
  public RouterPriceForHardware oneOffDiscountPrice(Price oneOffDiscountPrice) {
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
    RouterPriceForHardware priceForBundleAndHardware = (RouterPriceForHardware) o;
    return
        Objects.equals(this.oneOffPrice, priceForBundleAndHardware.oneOffPrice) &&
        Objects.equals(this.oneOffDiscountPrice, priceForBundleAndHardware.oneOffDiscountPrice);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(oneOffPrice, oneOffDiscountPrice);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceForBundleAndHardware {\n");
    sb.append("    oneOffPrice: ").append(toIndentedString(oneOffPrice)).append("\n");
    sb.append("    oneOffDiscountPrice: ").append(toIndentedString(oneOffDiscountPrice)).append("\n");
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


