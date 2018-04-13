package com.vf.uk.dal.broadband.basket.entity;

/**
 * BasketDataDelivery
 */
public class BasketDataDelivery   {
  private String id = null;

  private Price price = null;

 
   /**
   * Unique Id for the delivery mode
   * @return id
  **/
 public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



   /**
   * Get price
   * @return price
  **/
 public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

 
}

