package com.vf.uk.dal.broadband.basket.entity;

/**
 * EmptyBasketResponse
 */

public class EmptyBasketResponse {
 
  private String basketId = null;

 

   /**
   * Unique Id of the basket that was emptied
   * @return basketId
  **/
 
  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  
}

