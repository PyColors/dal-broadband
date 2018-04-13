package com.vf.uk.dal.broadband.basket.entity;

/**
 * DiscountValue
 */

public class DiscountValue   {
  private String type = null;

  private String value = null;

 

   /**
   * Discount type - \"PERCENTAGE\" or \"GBP\"
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

 

   /**
   * Discount value
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}

