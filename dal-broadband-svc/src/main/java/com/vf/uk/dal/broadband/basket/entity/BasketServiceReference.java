package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketServiceReference   {
  @JsonProperty("serviceLines")
  @Valid
  private List<BasketServiceLines> serviceLines = null;

  /**
   * 
   * @param serviceLines
   * @return
   */
  public BasketServiceReference serviceLines(List<BasketServiceLines> serviceLines) {
    this.serviceLines = serviceLines;
    return this;
  }

  /**
   * 
   * @param serviceLinesItem
   * @return
   */
  public BasketServiceReference addServiceLinesItem(BasketServiceLines serviceLinesItem) {
    if (this.serviceLines == null) {
      this.serviceLines = new ArrayList<>();
    }
    this.serviceLines.add(serviceLinesItem);
    return this;
  }

  /**
   * Get serviceLines
   * @return serviceLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BasketServiceLines> getServiceLines() {
    return serviceLines;
  }

  public void setServiceLines(List<BasketServiceLines> serviceLines) {
    this.serviceLines = serviceLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketServiceReference serviceReference = (BasketServiceReference) o;
    return Objects.equals(this.serviceLines, serviceReference.serviceLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceReference {\n");
    
    sb.append("    serviceLines: ").append(toIndentedString(serviceLines)).append("\n");
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

