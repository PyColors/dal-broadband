package com.vf.uk.dal.broadband.basket.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Price
 */

public class Price   {
  private String gross = null;

  private String net = null;

  private String vat = null;

 

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


}

