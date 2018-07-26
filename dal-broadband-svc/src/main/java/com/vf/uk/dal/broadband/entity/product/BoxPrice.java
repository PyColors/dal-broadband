package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BoxPrice.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class BoxPrice   {
  
  /** The price gross. */
  @JsonProperty("priceGross")
  private String priceGross = null;

  /** The price net. */
  @JsonProperty("priceNet")
  private String priceNet = null;

  /** The price VAT. */
  @JsonProperty("priceVAT")
  private String priceVAT = null;

  /**
   * Price gross.
   *
   * @param priceGross the price gross
   * @return the box price
   */
  public BoxPrice priceGross(String priceGross) {
    this.priceGross = priceGross;
    return this;
  }

  /**
   * Get priceGross.
   *
   * @return priceGross
   */
  @ApiModelProperty(value = "")


  public String getPriceGross() {
    return priceGross;
  }

  /**
   * Sets the price gross.
   *
   * @param priceGross the new price gross
   */
  public void setPriceGross(String priceGross) {
    this.priceGross = priceGross;
  }

  /**
   * Price net.
   *
   * @param priceNet the price net
   * @return the box price
   */
  public BoxPrice priceNet(String priceNet) {
    this.priceNet = priceNet;
    return this;
  }

  /**
   * Get priceNet.
   *
   * @return priceNet
   */
  @ApiModelProperty(value = "")


  public String getPriceNet() {
    return priceNet;
  }

  /**
   * Sets the price net.
   *
   * @param priceNet the new price net
   */
  public void setPriceNet(String priceNet) {
    this.priceNet = priceNet;
  }

  /**
   * Price VAT.
   *
   * @param priceVAT the price VAT
   * @return the box price
   */
  public BoxPrice priceVAT(String priceVAT) {
    this.priceVAT = priceVAT;
    return this;
  }

  /**
   * Get priceVAT.
   *
   * @return priceVAT
   */
  @ApiModelProperty(value = "")


  public String getPriceVAT() {
    return priceVAT;
  }

  /**
   * Sets the price VAT.
   *
   * @param priceVAT the new price VAT
   */
  public void setPriceVAT(String priceVAT) {
    this.priceVAT = priceVAT;
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
    BoxPrice boxPrice = (BoxPrice) o;
    return Objects.equals(this.priceGross, boxPrice.priceGross) &&
        Objects.equals(this.priceNet, boxPrice.priceNet) &&
        Objects.equals(this.priceVAT, boxPrice.priceVAT);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(priceGross, priceNet, priceVAT);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxPrice {\n");
    
    sb.append("    priceGross: ").append(toIndentedString(priceGross)).append("\n");
    sb.append("    priceNet: ").append(toIndentedString(priceNet)).append("\n");
    sb.append("    priceVAT: ").append(toIndentedString(priceVAT)).append("\n");
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

