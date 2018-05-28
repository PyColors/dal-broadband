package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class ProductRequest   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("fieldList")
  private String fieldList = null;

  public ProductRequest productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * comma separated product ids
   * @return productId
  **/
  @ApiModelProperty(value = "comma separated product ids")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductRequest fieldList(String fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  /**
   * comma separated field list
   * @return fieldList
  **/
  @ApiModelProperty(value = "comma separated field list")


  public String getFieldList() {
    return fieldList;
  }

  public void setFieldList(String fieldList) {
    this.fieldList = fieldList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequest productRequest = (ProductRequest) o;
    return Objects.equals(this.productId, productRequest.productId) &&
        Objects.equals(this.fieldList, productRequest.fieldList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, fieldList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequest {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
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

