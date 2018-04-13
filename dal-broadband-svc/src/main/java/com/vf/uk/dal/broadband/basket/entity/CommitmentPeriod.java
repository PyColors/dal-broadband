package com.vf.uk.dal.broadband.basket.entity;

/**
 * CommitmentPeriod
 */

public class CommitmentPeriod   {
  private String uom = null;

  private String value = null;



   /**
   * Unit of measurement for the commitment period
   * @return uom
  **/
  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }

  

   /**
   * Value for the commitment period
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}

