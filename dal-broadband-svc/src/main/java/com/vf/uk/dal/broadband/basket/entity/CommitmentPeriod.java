package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CommitmentPeriod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CommitmentPeriod   {
  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("value")
  private String value = null;

  public CommitmentPeriod uom(String uom) {
    this.uom = uom;
    return this;
  }

  /**
   * Get uom
   * @return uom
  **/
  @ApiModelProperty(value = "")


  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }

  public CommitmentPeriod value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentPeriod commitmentPeriod = (CommitmentPeriod) o;
    return Objects.equals(this.uom, commitmentPeriod.uom) &&
        Objects.equals(this.value, commitmentPeriod.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uom, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentPeriod {\n");
    
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

