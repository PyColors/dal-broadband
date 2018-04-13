package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncompatibleChildProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T16:44:04.709Z")

public class IncompatibleChildProduct   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("unavailable")
  private Boolean unavailable = null;

  @JsonProperty("cardinalityIncompatibility")
  private CardinalityIncompatibility cardinalityIncompatibility = null;

  @JsonProperty("requiresIncompatibility")
  private RequiresIncompatibility requiresIncompatibility = null;

  @JsonProperty("excludesIncompatibility")
  private ExcludesIncompatibility excludesIncompatibility = null;
/**
 * 
 * @param productId
 * @return
 */
  public IncompatibleChildProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * product Id for the child product.
   * @return productId
  **/


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }
/**
 * 
 * @param unavailable
 * @return
 */
  public IncompatibleChildProduct unavailable(Boolean unavailable) {
    this.unavailable = unavailable;
    return this;
  }

   /**
   * Boolean flag that marks availability of product under this root product.
   * @return unavailable
  **/

/**
 * 
 * @return
 */
  public Boolean getUnavailable() {
    return unavailable;
  }
/**
 * 
 * @param unavailable
 */
  public void setUnavailable(Boolean unavailable) {
    this.unavailable = unavailable;
  }
/**
 * 
 * @param cardinalityIncompatibility
 * @return
 */
  public IncompatibleChildProduct cardinalityIncompatibility(CardinalityIncompatibility cardinalityIncompatibility) {
    this.cardinalityIncompatibility = cardinalityIncompatibility;
    return this;
  }

   /**
   * Get cardinalityIncompatibility
   * @return cardinalityIncompatibility
  **/

  @Valid
/**
 * 
 * @return
 */
  public CardinalityIncompatibility getCardinalityIncompatibility() {
    return cardinalityIncompatibility;
  }
/**
 * 
 * @param cardinalityIncompatibility
 */
  public void setCardinalityIncompatibility(CardinalityIncompatibility cardinalityIncompatibility) {
    this.cardinalityIncompatibility = cardinalityIncompatibility;
  }
/**
 * 
 * @param requiresIncompatibility
 * @return
 */
  public IncompatibleChildProduct requiresIncompatibility(RequiresIncompatibility requiresIncompatibility) {
    this.requiresIncompatibility = requiresIncompatibility;
    return this;
  }

   /**
   * Get requiresIncompatibility
   * @return requiresIncompatibility
  **/

  @Valid

  public RequiresIncompatibility getRequiresIncompatibility() {
    return requiresIncompatibility;
  }
/**
 * 
 * @param requiresIncompatibility
 */
  public void setRequiresIncompatibility(RequiresIncompatibility requiresIncompatibility) {
    this.requiresIncompatibility = requiresIncompatibility;
  }
/**
 * 
 * @param excludesIncompatibility
 * @return
 */
  public IncompatibleChildProduct excludesIncompatibility(ExcludesIncompatibility excludesIncompatibility) {
    this.excludesIncompatibility = excludesIncompatibility;
    return this;
  }

   /**
   * Get excludesIncompatibility
   * @return excludesIncompatibility
  **/

  @Valid

  public ExcludesIncompatibility getExcludesIncompatibility() {
    return excludesIncompatibility;
  }

  public void setExcludesIncompatibility(ExcludesIncompatibility excludesIncompatibility) {
    this.excludesIncompatibility = excludesIncompatibility;
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
    return Objects.equals(this.productId, incompatibleChildProduct.productId) &&
        Objects.equals(this.unavailable, incompatibleChildProduct.unavailable) &&
        Objects.equals(this.cardinalityIncompatibility, incompatibleChildProduct.cardinalityIncompatibility) &&
        Objects.equals(this.requiresIncompatibility, incompatibleChildProduct.requiresIncompatibility) &&
        Objects.equals(this.excludesIncompatibility, incompatibleChildProduct.excludesIncompatibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, unavailable, cardinalityIncompatibility, requiresIncompatibility, excludesIncompatibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncompatibleChildProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    unavailable: ").append(toIndentedString(unavailable)).append("\n");
    sb.append("    cardinalityIncompatibility: ").append(toIndentedString(cardinalityIncompatibility)).append("\n");
    sb.append("    requiresIncompatibility: ").append(toIndentedString(requiresIncompatibility)).append("\n");
    sb.append("    excludesIncompatibility: ").append(toIndentedString(excludesIncompatibility)).append("\n");
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

