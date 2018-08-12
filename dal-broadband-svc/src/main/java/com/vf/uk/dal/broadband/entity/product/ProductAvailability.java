package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductAvailability.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class ProductAvailability   {
  
  /** The end. */
  @JsonProperty("end")
  private String end = null;

  /** The sales expired. */
  @JsonProperty("salesExpired")
  private String salesExpired = null;

  /** The start. */
  @JsonProperty("start")
  private String start = null;

  /**
   * End.
   *
   * @param end the end
   * @return the product availability
   */
  public ProductAvailability end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end.
   *
   * @return end
   */
  @ApiModelProperty(value = "")


  public String getEnd() {
    return end;
  }

  /**
   * Sets the end.
   *
   * @param end the new end
   */
  public void setEnd(String end) {
    this.end = end;
  }

  /**
   * Sales expired.
   *
   * @param salesExpired the sales expired
   * @return the product availability
   */
  public ProductAvailability salesExpired(String salesExpired) {
    this.salesExpired = salesExpired;
    return this;
  }

  /**
   * Get salesExpired.
   *
   * @return salesExpired
   */
  @ApiModelProperty(value = "")


  public String getSalesExpired() {
    return salesExpired;
  }

  /**
   * Sets the sales expired.
   *
   * @param salesExpired the new sales expired
   */
  public void setSalesExpired(String salesExpired) {
    this.salesExpired = salesExpired;
  }

  /**
   * Start.
   *
   * @param start the start
   * @return the product availability
   */
  public ProductAvailability start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start.
   *
   * @return start
   */
  @ApiModelProperty(value = "")


  public String getStart() {
    return start;
  }

  /**
   * Sets the start.
   *
   * @param start the new start
   */
  public void setStart(String start) {
    this.start = start;
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
    ProductAvailability productAvailability = (ProductAvailability) o;
    return Objects.equals(this.end, productAvailability.end) &&
        Objects.equals(this.salesExpired, productAvailability.salesExpired) &&
        Objects.equals(this.start, productAvailability.start);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(end, salesExpired, start);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAvailability {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    salesExpired: ").append(toIndentedString(salesExpired)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

