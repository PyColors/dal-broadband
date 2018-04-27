package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class ProductGroup   {
  @JsonProperty("productGroupName")
  private String productGroupName = null;

  @JsonProperty("productGroupRole")
  private String productGroupRole = null;

  public ProductGroup productGroupName(String productGroupName) {
    this.productGroupName = productGroupName;
    return this;
  }

  /**
   * Get productGroupName
   * @return productGroupName
  **/
  @ApiModelProperty(value = "")


  public String getProductGroupName() {
    return productGroupName;
  }

  public void setProductGroupName(String productGroupName) {
    this.productGroupName = productGroupName;
  }

  public ProductGroup productGroupRole(String productGroupRole) {
    this.productGroupRole = productGroupRole;
    return this;
  }

  /**
   * Get productGroupRole
   * @return productGroupRole
  **/
  @ApiModelProperty(value = "")


  public String getProductGroupRole() {
    return productGroupRole;
  }

  public void setProductGroupRole(String productGroupRole) {
    this.productGroupRole = productGroupRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroup productGroup = (ProductGroup) o;
    return Objects.equals(this.productGroupName, productGroup.productGroupName) &&
        Objects.equals(this.productGroupRole, productGroup.productGroupRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productGroupName, productGroupRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroup {\n");
    
    sb.append("    productGroupName: ").append(toIndentedString(productGroupName)).append("\n");
    sb.append("    productGroupRole: ").append(toIndentedString(productGroupRole)).append("\n");
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

