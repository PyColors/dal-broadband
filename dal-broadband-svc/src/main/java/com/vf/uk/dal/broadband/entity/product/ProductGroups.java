package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductGroups
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductGroups   {
  @JsonProperty("productGroup")
  @Valid
  private List<ProductGroup> productGroup = null;

  public ProductGroups productGroup(List<ProductGroup> productGroup) {
    this.productGroup = productGroup;
    return this;
  }

  public ProductGroups addProductGroupItem(ProductGroup productGroupItem) {
    if (this.productGroup == null) {
      this.productGroup = new ArrayList<ProductGroup>();
    }
    this.productGroup.add(productGroupItem);
    return this;
  }

  /**
   * Get productGroup
   * @return productGroup
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductGroup> getProductGroup() {
    return productGroup;
  }

  public void setProductGroup(List<ProductGroup> productGroup) {
    this.productGroup = productGroup;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(productGroup);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

