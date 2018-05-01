package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductAvailability
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

public class ProductAvailability   {
  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("salesExpired")
  private Boolean salesExpired = null;

  public ProductAvailability start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public ProductAvailability end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public ProductAvailability salesExpired(Boolean salesExpired) {
    this.salesExpired = salesExpired;
    return this;
  }

  /**
   * Get salesExpired
   * @return salesExpired
  **/
  @ApiModelProperty(value = "")


  public Boolean isSalesExpired() {
    return salesExpired;
  }

  public void setSalesExpired(Boolean salesExpired) {
    this.salesExpired = salesExpired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAvailability productAvailability = (ProductAvailability) o;
    return Objects.equals(this.start, productAvailability.start) &&
        Objects.equals(this.end, productAvailability.end) &&
        Objects.equals(this.salesExpired, productAvailability.salesExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, salesExpired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAvailability {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    salesExpired: ").append(toIndentedString(salesExpired)).append("\n");
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

