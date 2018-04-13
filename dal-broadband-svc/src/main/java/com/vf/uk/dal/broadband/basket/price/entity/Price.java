package com.vf.uk.dal.broadband.basket.price.entity;

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
  public String getVat() {
    return vat;
  }

  public void setVat(String vat) {
    this.vat = vat;
  }


}

