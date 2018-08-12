package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductGroups.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductGroups   {
  
  /** The product group. */
  @JsonProperty("productGroup")
  @Valid
  private List<ProductGroup> productGroup = null;

  /**
   * Product group.
   *
   * @param productGroup the product group
   * @return the product groups
   */
  public ProductGroups productGroup(List<ProductGroup> productGroup) {
    this.productGroup = productGroup;
    return this;
  }

  /**
   * Adds the product group item.
   *
   * @param productGroupItem the product group item
   * @return the product groups
   */
  public ProductGroups addProductGroupItem(ProductGroup productGroupItem) {
    if (this.productGroup == null) {
      this.productGroup = new ArrayList<>();
    }
    this.productGroup.add(productGroupItem);
    return this;
  }

  /**
   * Get productGroup.
   *
   * @return productGroup
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductGroup> getProductGroup() {
    return productGroup;
  }

  /**
   * Sets the product group.
   *
   * @param productGroup the new product group
   */
  public void setProductGroup(List<ProductGroup> productGroup) {
    this.productGroup = productGroup;
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
    ProductGroups productGroups = (ProductGroups) o;
    return Objects.equals(this.productGroup, productGroups.productGroup);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(productGroup);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroups {\n");
    
    sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
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

