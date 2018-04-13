package com.vf.uk.dal.broadband.basket.entity;

/**
 * PackageForAdditon
 */
public class PackageForAdditon   {

  private String id = null;

  private String journeyType = null;

  private String deviceId = null;

  private String bundleId = null;

 

   /**
   * Unique ID for the package. ID required only when modifying a package
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



   /**
   * Hardcoded to \"postpay\" for the PoC
   * @return journeyType
  **/
  public String getJourneyType() {
    return journeyType;
  }

  public void setJourneyType(String journeyType) {
    this.journeyType = journeyType;
  }

  

   /**
   * Unique Id of the device as provided in the catalogue
   * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }



   /**
   * Unique Id of the bundle as provided in the catalogue
   * @return bundleId
  **/
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

}

