package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineRef
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class LineRef   {
  @JsonProperty("lineIdentification")
  private LineIdentification lineIdentification = null;

  /**
   * 
   * @param lineIdentification
   * @return
   */
  public LineRef lineIdentification(LineIdentification lineIdentification) {
    this.lineIdentification = lineIdentification;
    return this;
  }

   /**
   * Get lineIdentification
   * @return lineIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LineIdentification getLineIdentification() {
    return lineIdentification;
  }

  public void setLineIdentification(LineIdentification lineIdentification) {
    this.lineIdentification = lineIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineRef lineRef = (LineRef) o;
    return Objects.equals(this.lineIdentification, lineRef.lineIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineRef {\n");
    
    sb.append("    lineIdentification: ").append(toIndentedString(lineIdentification)).append("\n");
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

