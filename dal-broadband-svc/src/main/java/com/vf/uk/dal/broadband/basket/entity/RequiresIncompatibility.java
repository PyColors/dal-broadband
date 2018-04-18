package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RequiresIncompatibility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class RequiresIncompatibility   {
  @JsonProperty("productClasses")
  @Valid
  private List<String> productClasses = null;

  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = null;

  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  public RequiresIncompatibility productClasses(List<String> productClasses) {
    this.productClasses = productClasses;
    return this;
  }

  public RequiresIncompatibility addProductClassesItem(String productClassesItem) {
    if (this.productClasses == null) {
      this.productClasses = new ArrayList<String>();
    }
    this.productClasses.add(productClassesItem);
    return this;
  }

  /**
   * Get productClasses
   * @return productClasses
  **/
  @ApiModelProperty(value = "")


  public List<String> getProductClasses() {
    return productClasses;
  }

  public void setProductClasses(List<String> productClasses) {
    this.productClasses = productClasses;
  }

  public RequiresIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public RequiresIncompatibility addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<String>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

  /**
   * Get productIds
   * @return productIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  public RequiresIncompatibility productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  public RequiresIncompatibility addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<String>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * Get productLines
   * @return productLines
  **/
  @ApiModelProperty(value = "")


  public List<String> getProductLines() {
    return productLines;
  }

  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(productClasses, productIds, productLines);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

