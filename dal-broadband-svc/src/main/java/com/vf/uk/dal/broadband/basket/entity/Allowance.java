package com.vf.uk.dal.broadband.basket.entity;

/**
 * Allowance
 */

public class Allowance   {
  private String type = null;

  private String value = null;

  private String uom = null;

  private String displayUom = null;

  private String tilUom = null;

  

   /**
   * Allowance type - \"DATA\",\"TEXT\",\"CALL. Roaming\"
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
   /**
   * Value of the allowance
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

 

   /**
   * Unit of measurement to be used for the allowance - \"MB\" for DATA. \"COUNT\" fpr TEXT amd \"MIN\" for CALL
   * @return uom
  **/
  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }


   /**
   * Unit of measurement to be used for the allowance - \"MB\" for DATA. \"COUNT\" fpr TEXT amd \"MIN\" for CALL
   * @return displayUom
  **/
  public String getDisplayUom() {
    return displayUom;
  }

  public void setDisplayUom(String displayUom) {
    this.displayUom = displayUom;
  }

  

   /**
   * Unit of measurement to be used for the allowance - \"MB\" for DATA. \"COUNT\" fpr TEXT amd \"MIN\" for CALL
   * @return tilUom
  **/
  public String getTilUom() {
    return tilUom;
  }

  public void setTilUom(String tilUom) {
    this.tilUom = tilUom;
  }

}

