package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Delivery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")

public class Delivery   {
  @JsonProperty("classification")
  private String classification = null;

  @JsonProperty("partner")
  private String partner = null;

  @JsonProperty("soaDeliveryMethod")
  private String soaDeliveryMethod = null;

  @JsonProperty("weekend")
  private String weekend = null;

  public Delivery classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
  **/
  @ApiModelProperty(value = "")


  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public Delivery partner(String partner) {
    this.partner = partner;
    return this;
  }

  /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")


  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public Delivery soaDeliveryMethod(String soaDeliveryMethod) {
    this.soaDeliveryMethod = soaDeliveryMethod;
    return this;
  }

  /**
   * Get soaDeliveryMethod
   * @return soaDeliveryMethod
  **/
  @ApiModelProperty(value = "")


  public String getSoaDeliveryMethod() {
    return soaDeliveryMethod;
  }

  public void setSoaDeliveryMethod(String soaDeliveryMethod) {
    this.soaDeliveryMethod = soaDeliveryMethod;
  }

  public Delivery weekend(String weekend) {
    this.weekend = weekend;
    return this;
  }

  /**
   * Get weekend
   * @return weekend
  **/
  @ApiModelProperty(value = "")


  public String getWeekend() {
    return weekend;
  }

  public void setWeekend(String weekend) {
    this.weekend = weekend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Delivery delivery = (Delivery) o;
    return Objects.equals(this.classification, delivery.classification) &&
        Objects.equals(this.partner, delivery.partner) &&
        Objects.equals(this.soaDeliveryMethod, delivery.soaDeliveryMethod) &&
        Objects.equals(this.weekend, delivery.weekend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, partner, soaDeliveryMethod, weekend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delivery {\n");
    
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    soaDeliveryMethod: ").append(toIndentedString(soaDeliveryMethod)).append("\n");
    sb.append("    weekend: ").append(toIndentedString(weekend)).append("\n");
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

