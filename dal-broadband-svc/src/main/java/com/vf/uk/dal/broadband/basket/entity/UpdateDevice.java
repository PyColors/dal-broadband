package com.vf.uk.dal.broadband.basket.entity;

/**
 * UpdateDevice
 */

public class UpdateDevice   {
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
   * Expected list is ADD/REMOVE/MODIFY
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

 

   /**
   * Id of the device as given in the product catalogue
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


}

