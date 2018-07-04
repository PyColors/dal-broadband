package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CompatibilityPackage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CompatibilityPackage   {
  @JsonProperty("incompatibleProducts")
  @Valid
  private List<IncompatibleChildProduct> incompatibleProducts = null;

  public CompatibilityPackage incompatibleProducts(List<IncompatibleChildProduct> incompatibleProducts) {
    this.incompatibleProducts = incompatibleProducts;
    return this;
  }

  public CompatibilityPackage addIncompatibleProductsItem(IncompatibleChildProduct incompatibleProductsItem) {
    if (this.incompatibleProducts == null) {
      this.incompatibleProducts = new ArrayList<IncompatibleChildProduct>();
    }
    this.incompatibleProducts.add(incompatibleProductsItem);
    return this;
  }

  /**
   * Get incompatibleProducts
   * @return incompatibleProducts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<IncompatibleChildProduct> getIncompatibleProducts() {
    return incompatibleProducts;
  }

  public void setIncompatibleProducts(List<IncompatibleChildProduct> incompatibleProducts) {
    this.incompatibleProducts = incompatibleProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilityPackage compatibilityPackage = (CompatibilityPackage) o;
    return Objects.equals(this.incompatibleProducts, compatibilityPackage.incompatibleProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incompatibleProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilityPackage {\n");
    
    sb.append("    incompatibleProducts: ").append(toIndentedString(incompatibleProducts)).append("\n");
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

