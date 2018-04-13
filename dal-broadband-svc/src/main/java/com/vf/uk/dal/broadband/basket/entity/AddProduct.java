package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * AddProduct
 */

public class AddProduct   {
  private String action = null;

  private String skuId = null;

  private List<Attribute> attributes = new ArrayList<>();

 

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
   * Product id from the product catalogue
   * @return skuId
  **/
  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

 

  

   /**
   * Get attributes
   * @return attributes
  **/
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

}

