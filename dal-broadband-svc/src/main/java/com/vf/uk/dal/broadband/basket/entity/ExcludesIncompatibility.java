package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ExcludesIncompatibility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class ExcludesIncompatibility   {
  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = null;

  public ExcludesIncompatibility productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public ExcludesIncompatibility addProductIdsItem(String productIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludesIncompatibility excludesIncompatibility = (ExcludesIncompatibility) o;
    return Objects.equals(this.productIds, excludesIncompatibility.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludesIncompatibility {\n");
    
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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

