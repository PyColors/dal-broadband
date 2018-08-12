package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductRequest   {
  
  /** The field list. */
  @JsonProperty("fieldList")
  private String fieldList = null;

  /** The ids. */
  @JsonProperty("ids")
  private String ids = null;

  /**
   * Field list.
   *
   * @param fieldList the field list
   * @return the product request
   */
  public ProductRequest fieldList(String fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  /**
   * comma separated field list.
   *
   * @return fieldList
   */
  @ApiModelProperty(value = "comma separated field list")


  public String getFieldList() {
    return fieldList;
  }

  /**
   * Sets the field list.
   *
   * @param fieldList the new field list
   */
  public void setFieldList(String fieldList) {
    this.fieldList = fieldList;
  }

  /**
   * Ids.
   *
   * @param ids the ids
   * @return the product request
   */
  public ProductRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  /**
   * comma separated product ids.
   *
   * @return ids
   */
  @ApiModelProperty(value = "comma separated product ids")


  public String getIds() {
    return ids;
  }

  /**
   * Sets the ids.
   *
   * @param ids the new ids
   */
  public void setIds(String ids) {
    this.ids = ids;
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
    ProductRequest productRequest = (ProductRequest) o;
    return Objects.equals(this.fieldList, productRequest.fieldList) &&
        Objects.equals(this.ids, productRequest.ids);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(fieldList, ids);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequest {\n");
    
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

