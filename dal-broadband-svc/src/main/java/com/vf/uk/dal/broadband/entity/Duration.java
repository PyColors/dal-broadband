package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

/**
 * Duration.
 */

public class Duration   {
  
  /** The uom. */
  private String uom = null;

  /** The value. */
  private String value = null;

  /**
   * Uom.
   *
   * @param uom the uom
   * @return the duration
   */
  public Duration uom(String uom) {
    this.uom = uom;
    return this;
  }

   /**
    * Unit of measurement for duration value.
    *
    * @return uom
    */
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
   * Value.
   *
   * @param value the value
   * @return the duration
   */
  public Duration value(String value) {
    this.value = value;
    return this;
  }

   /**
    * Duration value.
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
    Duration duration = (Duration) o;
    return Objects.equals(this.uom, duration.uom) &&
        Objects.equals(this.value, duration.value);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(uom, value);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

