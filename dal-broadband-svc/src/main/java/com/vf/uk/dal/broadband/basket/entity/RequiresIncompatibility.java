package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RequiresIncompatibility.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class RequiresIncompatibility   {
  
  /** The product classes. */
  @JsonProperty("productClasses")
  @Valid
  private List<String> productClasses = null;

  /** The product ids. */
  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = null;

  /** The product lines. */
  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  /**
   * Product classes.
   *
   * @param productClasses the product classes
   * @return the requires incompatibility
   */
  public RequiresIncompatibility productClasses(List<String> productClasses) {
    this.productClasses = productClasses;
    return this;
  }

  /**
   * Adds the product classes item.
   *
   * @param productClassesItem the product classes item
   * @return the requires incompatibility
   */
  public RequiresIncompatibility addProductClassesItem(String productClassesItem) {
    if (this.productClasses == null) {
      this.productClasses = new ArrayList<>();
    }
    this.productClasses.add(productClassesItem);
    return this;
  }

  /**
   * Get productClasses.
   *
   * @return productClasses
   */
  @ApiModelProperty(value = "")


  public List<String> getProductClasses() {
    return productClasses;
  }

  /**
   * Sets the product classes.
   *
   * @param productClasses the new product classes
   */
  public void setProductClasses(List<String> productClasses) {
    this.productClasses = productClasses;
  }

  /**
   * Product ids.
   *
   * @param productIds the product ids
   * @return the requires incompatibility
   */
  public RequiresIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  /**
   * Adds the product ids item.
   *
   * @param productIdsItem the product ids item
   * @return the requires incompatibility
   */
  public RequiresIncompatibility addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

  /**
   * Get productIds.
   *
   * @return productIds
   */
  @ApiModelProperty(value = "")


  public List<String> getProductIds() {
    return productIds;
  }

  /**
   * Sets the product ids.
   *
   * @param productIds the new product ids
   */
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  /**
   * Product lines.
   *
   * @param productLines the product lines
   * @return the requires incompatibility
   */
  public RequiresIncompatibility productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  /**
   * Adds the product lines item.
   *
   * @param productLinesItem the product lines item
   * @return the requires incompatibility
   */
  public RequiresIncompatibility addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * Get productLines.
   *
   * @return productLines
   */
  @ApiModelProperty(value = "")


  public List<String> getProductLines() {
    return productLines;
  }

  /**
   * Sets the product lines.
   *
   * @param productLines the new product lines
   */
  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
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
    RequiresIncompatibility requiresIncompatibility = (RequiresIncompatibility) o;
    return Objects.equals(this.productClasses, requiresIncompatibility.productClasses) &&
        Objects.equals(this.productIds, requiresIncompatibility.productIds) &&
        Objects.equals(this.productLines, requiresIncompatibility.productLines);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(productClasses, productIds, productLines);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiresIncompatibility {\n");
    
    sb.append("    productClasses: ").append(toIndentedString(productClasses)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productLines: ").append(toIndentedString(productLines)).append("\n");
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

