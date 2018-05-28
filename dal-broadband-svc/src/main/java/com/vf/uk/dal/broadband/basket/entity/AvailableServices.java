package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AvailableServices
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class AvailableServices   {
  @JsonProperty("service")
  @Valid
  private List<String> service = null;

  public AvailableServices service(List<String> service) {
    this.service = service;
    return this;
  }

  public AvailableServices addServiceItem(String serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<String>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")


  public List<String> getService() {
    return service;
  }

  public void setService(List<String> service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableServices availableServices = (AvailableServices) o;
    return Objects.equals(this.service, availableServices.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableServices {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

