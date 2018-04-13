package com.vf.uk.dal.broadband.basket.price.entity;

/**
 * BundleAndHardwareTuple
 */

public class BundleAndHardwareTuple   {
  private String hardwareId = null;

  private String bundleId = null;

 

   /**
   * Unique hardware id as available from the product catalogue
   * @return hardwareId
  **/
  public String getHardwareId() {
    return hardwareId;
  }

  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }

  

   /**
   * Unique bundle id as available from the product catalogue
   * @return bundleId
  **/
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

}

