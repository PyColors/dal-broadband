package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

/**
 * BundleAllowance.
 */

public class BundleAllowance   {
  
  /** The type. */
  private String type = null;

  /** The value. */
  private String value = null;

  /** The uom. */
  private String uom = null;

  /** The display uom. */
  private String displayUom = null;

  /**
   * Type.
   *
   * @param type the type
   * @return the bundle allowance
   */
  public BundleAllowance type(String type) {
    this.type = type;
    return this;
  }

   /**
    * Allowance type - \"DATA\",\"TEXT\",\"CALL\".
    *
    * @return type
    */
  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Value.
   *
   * @param value the value
   * @return the bundle allowance
   */
  public BundleAllowance value(String value) {
    this.value = value;
    return this;
  }

   /**
    * Value of the allowance.
    *
    * @return value
    */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Uom.
   *
   * @param uom the uom
   * @return the bundle allowance
   */
  public BundleAllowance uom(String uom) {
    this.uom = uom;
    return this;
  }

   /**
   * Unit of measurement to be used for the allowance - \"MB\" for DATA. \"COUNT\" fpr TEXT amd \"MIN\" for CALL
   * @return uom
  **/
  public String getUom() {
    return uom;
  }

  /**
   * Sets the uom.
   *
   * @param uom the new uom
   */
  public void setUom(String uom) {
    this.uom = uom;
  }

  /**
   * Display uom.
   *
   * @param displayUom the display uom
   * @return the bundle allowance
   */
  public BundleAllowance displayUom(String displayUom) {
    this.displayUom = displayUom;
    return this;
  }

   /**
   * Unit of measurement to be used for the allowance - \"MB\" for DATA. \"COUNT\" fpr TEXT amd \"MIN\" for CALL
   * @return displayUom
  **/
  public String getDisplayUom() {
    return displayUom;
  }

  /**
   * Sets the display uom.
   *
   * @param displayUom the new display uom
   */
  public void setDisplayUom(String displayUom) {
    this.displayUom = displayUom;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleAllowance bundleAllowance = (BundleAllowance) o;
    return Objects.equals(this.type, bundleAllowance.type) &&
        Objects.equals(this.value, bundleAllowance.value) &&
        Objects.equals(this.uom, bundleAllowance.uom) &&
        Objects.equals(this.displayUom, bundleAllowance.displayUom);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(type, value, uom, displayUom);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleAllowance {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    displayUom: ").append(toIndentedString(displayUom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

