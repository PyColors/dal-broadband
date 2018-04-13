package com.vf.uk.dal.broadband.basket.price.entity;

/**
 * Discount
 */

public class Discount   {
  private String skuId = null;

  private String tag = null;

 

   /**
   * Sku ID  of the discount product - when available
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }



   /**
   * Tag name of the associated merchandising promotion
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


}

