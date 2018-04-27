package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Price
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Price   {
  @JsonProperty("gross")
  private String gross = null;

  @JsonProperty("net")
  private String net = null;

  @JsonProperty("vat")
  private String vat = null;

  public Price gross(String gross) {
    this.gross = gross;
    return this;
  }

  /**
   * Gross value of the item 
   * @return gross
  **/
  @ApiModelProperty(value = "Gross value of the item ")


  public String getGross() {
    return gross;
  }

  public void setGross(String gross) {
    this.gross = gross;
  }

  public Price net(String net) {
    this.net = net;
    return this;
  }

  /**
   * Net value of the item
   * @return net
  **/
  @ApiModelProperty(value = "Net value of the item")


  public String getNet() {
    return net;
  }

  public void setNet(String net) {
    this.net = net;
  }

  public Price vat(String vat) {
    this.vat = vat;
    return this;
  }

  /**
   * VAT component of the item price
   * @return vat
  **/
  @ApiModelProperty(value = "VAT component of the item price")


  public String getVat() {
    return vat;
  }

  public void setVat(String vat) {
    this.vat = vat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.gross, price.gross) &&
        Objects.equals(this.net, price.net) &&
        Objects.equals(this.vat, price.vat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gross, net, vat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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

