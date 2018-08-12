package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductGroup.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductGroup   {
  
  /** The group role. */
  @JsonProperty("groupRole")
  private String groupRole = null;

  /** The product group name. */
  @JsonProperty("productGroupName")
  private String productGroupName = null;

  /** The product group role. */
  @JsonProperty("productGroupRole")
  private String productGroupRole = null;

  /**
   * Group role.
   *
   * @param groupRole the group role
   * @return the product group
   */
  public ProductGroup groupRole(String groupRole) {
    this.groupRole = groupRole;
    return this;
  }

  /**
   * Get groupRole.
   *
   * @return groupRole
   */
  @ApiModelProperty(value = "")


  public String getGroupRole() {
    return groupRole;
  }

  /**
   * Sets the group role.
   *
   * @param groupRole the new group role
   */
  public void setGroupRole(String groupRole) {
    this.groupRole = groupRole;
  }

  /**
   * Product group name.
   *
   * @param productGroupName the product group name
   * @return the product group
   */
  public ProductGroup productGroupName(String productGroupName) {
    this.productGroupName = productGroupName;
    return this;
  }

  /**
   * Get productGroupName.
   *
   * @return productGroupName
   */
  @ApiModelProperty(value = "")


  public String getProductGroupName() {
    return productGroupName;
  }

  /**
   * Sets the product group name.
   *
   * @param productGroupName the new product group name
   */
  public void setProductGroupName(String productGroupName) {
    this.productGroupName = productGroupName;
  }

  /**
   * Product group role.
   *
   * @param productGroupRole the product group role
   * @return the product group
   */
  public ProductGroup productGroupRole(String productGroupRole) {
    this.productGroupRole = productGroupRole;
    return this;
  }

  /**
   * Get productGroupRole.
   *
   * @return productGroupRole
   */
  @ApiModelProperty(value = "")


  public String getProductGroupRole() {
    return productGroupRole;
  }

  /**
   * Sets the product group role.
   *
   * @param productGroupRole the new product group role
   */
  public void setProductGroupRole(String productGroupRole) {
    this.productGroupRole = productGroupRole;
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
    ProductGroup productGroup = (ProductGroup) o;
    return Objects.equals(this.groupRole, productGroup.groupRole) &&
        Objects.equals(this.productGroupName, productGroup.productGroupName) &&
        Objects.equals(this.productGroupRole, productGroup.productGroupRole);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(groupRole, productGroupName, productGroupRole);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroup {\n");
    
    sb.append("    groupRole: ").append(toIndentedString(groupRole)).append("\n");
    sb.append("    productGroupName: ").append(toIndentedString(productGroupName)).append("\n");
    sb.append("    productGroupRole: ").append(toIndentedString(productGroupRole)).append("\n");
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

