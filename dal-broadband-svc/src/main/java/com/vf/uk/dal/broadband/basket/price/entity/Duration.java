package com.vf.uk.dal.broadband.basket.price.entity;

/**
 * Duration
 */

public class Duration   {
  private String UOM = null;

  private String value = null;

 

   /**
   * Unit of measurement for duration value
   * @return UOM
  **/
  public String getUOM() {
    return UOM;
  }

  public void setUOM(String UOM) {
    this.UOM = UOM;
  }



   /**
   * Duration value
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


}

