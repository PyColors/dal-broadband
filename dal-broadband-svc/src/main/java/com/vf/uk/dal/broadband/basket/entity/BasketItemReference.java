package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ItemReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketItemReference   {
  @JsonProperty("classificationCode")
  private String classificationCode = null;

  @JsonProperty("identificationId")
  private String identificationId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * 
   * @param classificationCode
   * @return
   */
  public BasketItemReference classificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

  /**
   * Get classificationCode
   * @return classificationCode
  **/
  @ApiModelProperty(value = "")


  public String getClassificationCode() {
    return classificationCode;
  }

  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }

  /**
   * 
   * @param identificationId
   * @return
   */
  public BasketItemReference identificationId(String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

  /**
   * Get identificationId
   * @return identificationId
  **/
  @ApiModelProperty(value = "")


  public String getIdentificationId() {
    return identificationId;
  }

  public void setIdentificationId(String identificationId) {
    this.identificationId = identificationId;
  }

  /**
   * 
   * @param name
   * @return
   */
  public BasketItemReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketItemReference itemReference = (BasketItemReference) o;
    return Objects.equals(this.classificationCode, itemReference.classificationCode) &&
        Objects.equals(this.identificationId, itemReference.identificationId) &&
        Objects.equals(this.name, itemReference.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationCode, identificationId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReference {\n");
    
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

