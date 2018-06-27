package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceStartDateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class ServiceStartDateRequest   {
  @JsonProperty("serviceStartDate")
  private String serviceStartDate = null;

  public ServiceStartDateRequest serviceStartDate(String serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
    return this;
  }

  /**
   * Get serviceStartDate
   * @return serviceStartDate
  **/

  public String getServiceStartDate() {
    return serviceStartDate;
  }

  public void setServiceStartDate(String serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStartDateRequest serviceStartDateRequest = (ServiceStartDateRequest) o;
    return Objects.equals(this.serviceStartDate, serviceStartDateRequest.serviceStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStartDateRequest {\n");
    
    sb.append("    serviceStartDate: ").append(toIndentedString(serviceStartDate)).append("\n");
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

