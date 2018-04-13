package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;


/**
 * ItemReference
 */

public class ItemReference   {
  private String identificationId = null;

  private String name = null;

  private String classificationCode = null;

  public ItemReference identificationId(String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

   /**
   * Get identificationId
   * @return identificationId
  **/


  public String getIdentificationId() {
    return identificationId;
  }

  public void setIdentificationId(String identificationId) {
    this.identificationId = identificationId;
  }

  public ItemReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemReference classificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

   /**
   * Get classificationCode
   * @return classificationCode
  **/


  public String getClassificationCode() {
    return classificationCode;
  }

  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemReference itemReference = (ItemReference) o;
    return Objects.equals(this.identificationId, itemReference.identificationId) &&
        Objects.equals(this.name, itemReference.name) &&
        Objects.equals(this.classificationCode, itemReference.classificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationId, name, classificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReference {\n");
    
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

