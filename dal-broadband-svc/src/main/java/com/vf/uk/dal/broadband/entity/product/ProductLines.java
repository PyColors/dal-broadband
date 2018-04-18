package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductLines
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-17T20:40:09.952Z")

public class ProductLines   {
  @JsonProperty("productLines")
  private String productLines = null;

  public ProductLines productLines(String productLines) {
    this.productLines = productLines;
    return this;
  }

  /**
   * Get productLines
   * @return productLines
  **/
  @ApiModelProperty(value = "")


  public String getProductLines() {
    return productLines;
  }

  public void setProductLines(String productLines) {
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
    ProductLines productLines = (ProductLines) o;
    return Objects.equals(this.productLines, productLines.productLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLines {\n");
    
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

