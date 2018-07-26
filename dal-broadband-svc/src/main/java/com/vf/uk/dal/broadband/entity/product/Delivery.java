package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Delivery.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Delivery   {
  
  /** The classification. */
  @JsonProperty("classification")
  private String classification = null;

  /** The partner. */
  @JsonProperty("partner")
  private String partner = null;

  /** The soa delivery method. */
  @JsonProperty("soaDeliveryMethod")
  private String soaDeliveryMethod = null;

  /** The weekend. */
  @JsonProperty("weekend")
  private String weekend = null;

  /**
   * Classification.
   *
   * @param classification the classification
   * @return the delivery
   */
  public Delivery classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification.
   *
   * @return classification
   */
  @ApiModelProperty(value = "")


  public String getClassification() {
    return classification;
  }

  /**
   * Sets the classification.
   *
   * @param classification the new classification
   */
  public void setClassification(String classification) {
    this.classification = classification;
  }

  /**
   * Partner.
   *
   * @param partner the partner
   * @return the delivery
   */
  public Delivery partner(String partner) {
    this.partner = partner;
    return this;
  }

  /**
   * Get partner.
   *
   * @return partner
   */
  @ApiModelProperty(value = "")


  public String getPartner() {
    return partner;
  }

  /**
   * Sets the partner.
   *
   * @param partner the new partner
   */
  public void setPartner(String partner) {
    this.partner = partner;
  }

  /**
   * Soa delivery method.
   *
   * @param soaDeliveryMethod the soa delivery method
   * @return the delivery
   */
  public Delivery soaDeliveryMethod(String soaDeliveryMethod) {
    this.soaDeliveryMethod = soaDeliveryMethod;
    return this;
  }

  /**
   * Get soaDeliveryMethod.
   *
   * @return soaDeliveryMethod
   */
  @ApiModelProperty(value = "")


  public String getSoaDeliveryMethod() {
    return soaDeliveryMethod;
  }

  /**
   * Sets the soa delivery method.
   *
   * @param soaDeliveryMethod the new soa delivery method
   */
  public void setSoaDeliveryMethod(String soaDeliveryMethod) {
    this.soaDeliveryMethod = soaDeliveryMethod;
  }

  /**
   * Weekend.
   *
   * @param weekend the weekend
   * @return the delivery
   */
  public Delivery weekend(String weekend) {
    this.weekend = weekend;
    return this;
  }

  /**
   * Get weekend.
   *
   * @return weekend
   */
  @ApiModelProperty(value = "")


  public String getWeekend() {
    return weekend;
  }

  /**
   * Sets the weekend.
   *
   * @param weekend the new weekend
   */
  public void setWeekend(String weekend) {
    this.weekend = weekend;
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
    Delivery delivery = (Delivery) o;
    return Objects.equals(this.classification, delivery.classification) &&
        Objects.equals(this.partner, delivery.partner) &&
        Objects.equals(this.soaDeliveryMethod, delivery.soaDeliveryMethod) &&
        Objects.equals(this.weekend, delivery.weekend);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(classification, partner, soaDeliveryMethod, weekend);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

