package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceLines
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketServiceLines   {
  @JsonProperty("classificationCode")
  private String classificationCode = null;

  @JsonProperty("lineTreatments")
  @Valid
  private List<BasketLineTreatment> lineTreatments = null;

  @JsonProperty("networkType")
  private String networkType = null;

  @JsonProperty("serviceLines")
  @Valid
  private List<BasketServiceLine> serviceLines = null;

  public BasketServiceLines classificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

  /**
   * Get classificationCode
   * @return classificationCode
  **/
  @ApiModelProperty(value = "")


  public String getClassificationCode() {
    return classificationCode;
  }

  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }

  public BasketServiceLines lineTreatments(List<BasketLineTreatment> lineTreatments) {
    this.lineTreatments = lineTreatments;
    return this;
  }

  public BasketServiceLines addLineTreatmentsItem(BasketLineTreatment lineTreatmentsItem) {
    if (this.lineTreatments == null) {
      this.lineTreatments = new ArrayList<>();
    }
    this.lineTreatments.add(lineTreatmentsItem);
    return this;
  }

  /**
   * Get lineTreatments
   * @return lineTreatments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BasketLineTreatment> getLineTreatments() {
    return lineTreatments;
  }

  public void setLineTreatments(List<BasketLineTreatment> lineTreatments) {
    this.lineTreatments = lineTreatments;
  }

  public BasketServiceLines networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

  /**
   * Get networkType
   * @return networkType
  **/
  @ApiModelProperty(value = "")


  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public BasketServiceLines serviceLines(List<BasketServiceLine> serviceLines) {
    this.serviceLines = serviceLines;
    return this;
  }

  public BasketServiceLines addServiceLinesItem(BasketServiceLine serviceLinesItem) {
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

  public List<BasketServiceLine> getServiceLines() {
    return serviceLines;
  }

  public void setServiceLines(List<BasketServiceLine> serviceLines) {
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
    BasketServiceLines serviceLines = (BasketServiceLines) o;
    return Objects.equals(this.classificationCode, serviceLines.classificationCode) &&
        Objects.equals(this.lineTreatments, serviceLines.lineTreatments) &&
        Objects.equals(this.networkType, serviceLines.networkType) &&
        Objects.equals(this.serviceLines, serviceLines.serviceLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationCode, lineTreatments, networkType, serviceLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLines {\n");
    
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
    sb.append("    lineTreatments: ").append(toIndentedString(lineTreatments)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
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

