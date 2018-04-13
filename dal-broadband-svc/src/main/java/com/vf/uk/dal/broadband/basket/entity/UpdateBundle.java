package com.vf.uk.dal.broadband.basket.entity;

/**
 * UpdateBundle
 */

public class UpdateBundle   {
  private String productLineId = null;

  private String action = null;

  private String skuId = null;

  

   /**
package com.vf.uk.dal.broadband.basket;
   * @return productLineId
  **/

  public String getProductLineId() {
    return productLineId;
  }

  public void setProductLineId(String productLineId) {
    this.productLineId = productLineId;
  }

 

   /**
   * Action to indicate the operation requested by the use on this particular bundle. Expected values are ADD/REMOVE/MODIFY
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

 

   /**
   * Bundle id from the product catalogue
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

}

