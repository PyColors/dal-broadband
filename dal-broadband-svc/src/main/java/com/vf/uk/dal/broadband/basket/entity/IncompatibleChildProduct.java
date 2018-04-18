package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * IncompatibleChildProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class IncompatibleChildProduct   {
  @JsonProperty("cardinalityIncompatibility")
  private CardinalityIncompatibility cardinalityIncompatibility = null;

  @JsonProperty("excludesIncompatibility")
  private ExcludesIncompatibility excludesIncompatibility = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("requiresIncompatibility")
  private RequiresIncompatibility requiresIncompatibility = null;

  @JsonProperty("unavailable")
  private Boolean unavailable = null;

  public IncompatibleChildProduct cardinalityIncompatibility(CardinalityIncompatibility cardinalityIncompatibility) {
    this.cardinalityIncompatibility = cardinalityIncompatibility;
    return this;
  }

  /**
   * Get cardinalityIncompatibility
   * @return cardinalityIncompatibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardinalityIncompatibility getCardinalityIncompatibility() {
    return cardinalityIncompatibility;
  }

  public void setCardinalityIncompatibility(CardinalityIncompatibility cardinalityIncompatibility) {
    this.cardinalityIncompatibility = cardinalityIncompatibility;
  }

  public IncompatibleChildProduct excludesIncompatibility(ExcludesIncompatibility excludesIncompatibility) {
    this.excludesIncompatibility = excludesIncompatibility;
    return this;
  }

  /**
   * Get excludesIncompatibility
   * @return excludesIncompatibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ExcludesIncompatibility getExcludesIncompatibility() {
    return excludesIncompatibility;
  }

  public void setExcludesIncompatibility(ExcludesIncompatibility excludesIncompatibility) {
    this.excludesIncompatibility = excludesIncompatibility;
  }

  public IncompatibleChildProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public IncompatibleChildProduct requiresIncompatibility(RequiresIncompatibility requiresIncompatibility) {
    this.requiresIncompatibility = requiresIncompatibility;
    return this;
  }

  /**
   * Get requiresIncompatibility
   * @return requiresIncompatibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequiresIncompatibility getRequiresIncompatibility() {
    return requiresIncompatibility;
  }

  public void setRequiresIncompatibility(RequiresIncompatibility requiresIncompatibility) {
    this.requiresIncompatibility = requiresIncompatibility;
  }

  public IncompatibleChildProduct unavailable(Boolean unavailable) {
    this.unavailable = unavailable;
    return this;
  }

  /**
   * Get unavailable
   * @return unavailable
  **/
  @ApiModelProperty(value = "")


  public Boolean isUnavailable() {
    return unavailable;
  }

  public void setUnavailable(Boolean unavailable) {
    this.unavailable = unavailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncompatibleChildProduct incompatibleChildProduct = (IncompatibleChildProduct) o;
    return Objects.equals(this.cardinalityIncompatibility, incompatibleChildProduct.cardinalityIncompatibility) &&
        Objects.equals(this.excludesIncompatibility, incompatibleChildProduct.excludesIncompatibility) &&
        Objects.equals(this.productId, incompatibleChildProduct.productId) &&
        Objects.equals(this.requiresIncompatibility, incompatibleChildProduct.requiresIncompatibility) &&
        Objects.equals(this.unavailable, incompatibleChildProduct.unavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardinalityIncompatibility, excludesIncompatibility, productId, requiresIncompatibility, unavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncompatibleChildProduct {\n");
    
    sb.append("    cardinalityIncompatibility: ").append(toIndentedString(cardinalityIncompatibility)).append("\n");
    sb.append("    excludesIncompatibility: ").append(toIndentedString(excludesIncompatibility)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    requiresIncompatibility: ").append(toIndentedString(requiresIncompatibility)).append("\n");
    sb.append("    unavailable: ").append(toIndentedString(unavailable)).append("\n");
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

