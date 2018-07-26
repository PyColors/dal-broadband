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

public class BasketServiceLine   {
  @JsonProperty("itemReference")
  private BasketItemReference itemReference = null;

  @JsonProperty("lineSpeeds")
  private BasketLineSpeeds lineSpeeds = null;

  @JsonProperty("miscRefernce")
  private BasketMiscReference miscRefernce = null;

  @JsonProperty("serviceLineTreatments")
  @Valid
  private List<BasketServiceLineTreatment> serviceLineTreatments = null;

  public BasketServiceLine itemReference(BasketItemReference itemReference) {
    this.itemReference = itemReference;
    return this;
  }

  /**
   * Get itemReference
   * @return itemReference
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketItemReference getItemReference() {
    return itemReference;
  }

  public void setItemReference(BasketItemReference itemReference) {
    this.itemReference = itemReference;
  }

  public BasketServiceLine lineSpeeds(BasketLineSpeeds lineSpeeds) {
    this.lineSpeeds = lineSpeeds;
    return this;
  }

  /**
   * Get lineSpeeds
   * @return lineSpeeds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketLineSpeeds getLineSpeeds() {
    return lineSpeeds;
  }

  public void setLineSpeeds(BasketLineSpeeds lineSpeeds) {
    this.lineSpeeds = lineSpeeds;
  }

  public BasketServiceLine miscRefernce(BasketMiscReference miscRefernce) {
    this.miscRefernce = miscRefernce;
    return this;
  }

  /**
   * Get miscRefernce
   * @return miscRefernce
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketMiscReference getMiscRefernce() {
    return miscRefernce;
  }

  public void setMiscRefernce(BasketMiscReference miscRefernce) {
    this.miscRefernce = miscRefernce;
  }

  public BasketServiceLine serviceLineTreatments(List<BasketServiceLineTreatment> serviceLineTreatments) {
    this.serviceLineTreatments = serviceLineTreatments;
    return this;
  }

  public BasketServiceLine addServiceLineTreatmentsItem(BasketServiceLineTreatment serviceLineTreatmentsItem) {
    if (this.serviceLineTreatments == null) {
      this.serviceLineTreatments = new ArrayList<>();
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

  public List<BasketServiceLineTreatment> getServiceLineTreatments() {
    return serviceLineTreatments;
  }

  public void setServiceLineTreatments(List<BasketServiceLineTreatment> serviceLineTreatments) {
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
    BasketServiceLine serviceLine = (BasketServiceLine) o;
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

