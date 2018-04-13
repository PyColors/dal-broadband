package com.vf.uk.dal.broadband.basket.entity;

/**
 * DeviceBriefDescription
 */

public class DeviceBriefDescription   {
  private String key = null;

  private String value = null;

  private String type = null;

  private String valueUOM = null;



   /**
   *  - \"UPS1\",\"\"UPS2\",\"UPS3\",\"UPS4\",
   * @return key
  **/
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


   /**
   * Value of the Descriptions - \"4G ready\",\"Seamless performance\",\"Premium design\",\"Ultra power saving mode\"
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



   /**
   * Device Description types\"
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



   /**
   * Unit of measurement for value
   * @return valueUOM
  **/
  public String getValueUOM() {
    return valueUOM;
  }

  public void setValueUOM(String valueUOM) {
    this.valueUOM = valueUOM;
  }

}

