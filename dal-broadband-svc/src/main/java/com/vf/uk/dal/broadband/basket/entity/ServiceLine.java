package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceLine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class ServiceLine   {
  @JsonProperty("itemReference")
  private ItemReference itemReference = null;

  @JsonProperty("lineSpeeds")
  private LineSpeeds lineSpeeds = null;

  @JsonProperty("miscRefernce")
  private MiscReference miscRefernce = null;

  @JsonProperty("serviceLineTreatments")
  @Valid
  private List<ServiceLineTreatment> serviceLineTreatments = null;

  public ServiceLine itemReference(ItemReference itemReference) {
    this.itemReference = itemReference;
    return this;
  }

  /**
   * Get itemReference
   * @return itemReference
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ItemReference getItemReference() {
    return itemReference;
  }

  public void setItemReference(ItemReference itemReference) {
    this.itemReference = itemReference;
  }

  public ServiceLine lineSpeeds(LineSpeeds lineSpeeds) {
    this.lineSpeeds = lineSpeeds;
    return this;
  }

  /**
   * Get lineSpeeds
   * @return lineSpeeds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LineSpeeds getLineSpeeds() {
    return lineSpeeds;
  }

  public void setLineSpeeds(LineSpeeds lineSpeeds) {
    this.lineSpeeds = lineSpeeds;
  }

  public ServiceLine miscRefernce(MiscReference miscRefernce) {
    this.miscRefernce = miscRefernce;
    return this;
  }

  /**
   * Get miscRefernce
   * @return miscRefernce
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MiscReference getMiscRefernce() {
    return miscRefernce;
  }

  public void setMiscRefernce(MiscReference miscRefernce) {
    this.miscRefernce = miscRefernce;
  }

  public ServiceLine serviceLineTreatments(List<ServiceLineTreatment> serviceLineTreatments) {
    this.serviceLineTreatments = serviceLineTreatments;
    return this;
  }

  public ServiceLine addServiceLineTreatmentsItem(ServiceLineTreatment serviceLineTreatmentsItem) {
    if (this.serviceLineTreatments == null) {
      this.serviceLineTreatments = new ArrayList<ServiceLineTreatment>();
    }
    this.serviceLineTreatments.add(serviceLineTreatmentsItem);
    return this;
  }

  /**
   * Get serviceLineTreatments
   * @return serviceLineTreatments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceLineTreatment> getServiceLineTreatments() {
    return serviceLineTreatments;
  }

  public void setServiceLineTreatments(List<ServiceLineTreatment> serviceLineTreatments) {
    this.serviceLineTreatments = serviceLineTreatments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLine serviceLine = (ServiceLine) o;
    return Objects.equals(this.itemReference, serviceLine.itemReference) &&
        Objects.equals(this.lineSpeeds, serviceLine.lineSpeeds) &&
        Objects.equals(this.miscRefernce, serviceLine.miscRefernce) &&
        Objects.equals(this.serviceLineTreatments, serviceLine.serviceLineTreatments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReference, lineSpeeds, miscRefernce, serviceLineTreatments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLine {\n");
    
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
    sb.append("    lineSpeeds: ").append(toIndentedString(lineSpeeds)).append("\n");
    sb.append("    miscRefernce: ").append(toIndentedString(miscRefernce)).append("\n");
    sb.append("    serviceLineTreatments: ").append(toIndentedString(serviceLineTreatments)).append("\n");
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

