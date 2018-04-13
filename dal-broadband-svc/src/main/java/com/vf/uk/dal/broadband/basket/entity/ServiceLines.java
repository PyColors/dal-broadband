package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



/**
 * ServiceLines
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class ServiceLines   {
  private String classificationCode = null;

  private String networkType = null;

  private List<LineTreatment> lineTreatments = null;

  private List<ServiceLine> serviceLines = null;

  public ServiceLines classificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

   /**
   * The category the technical product falls into
   * @return classificationCode
  **/


  public String getClassificationCode() {
    return classificationCode;
  }

  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }

  public ServiceLines networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Denotes which network the offered service/ service bundle would be available
   * @return networkType
  **/


  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public ServiceLines lineTreatments(List<LineTreatment> lineTreatments) {
    this.lineTreatments = lineTreatments;
    return this;
  }

  public ServiceLines addLineTreatmentsItem(LineTreatment lineTreatmentsItem) {
    if (this.lineTreatments == null) {
      this.lineTreatments = new ArrayList<LineTreatment>();
    }
    this.lineTreatments.add(lineTreatmentsItem);
    return this;
  }

   /**
   * Get lineTreatments
   * @return lineTreatments
  **/


  public List<LineTreatment> getLineTreatments() {
    return lineTreatments;
  }

  public void setLineTreatments(List<LineTreatment> lineTreatments) {
    this.lineTreatments = lineTreatments;
  }

  public ServiceLines serviceLines(List<ServiceLine> serviceLines) {
    this.serviceLines = serviceLines;
    return this;
  }

  public ServiceLines addServiceLinesItem(ServiceLine serviceLinesItem) {
    if (this.serviceLines == null) {
      this.serviceLines = new ArrayList<ServiceLine>();
    }
    this.serviceLines.add(serviceLinesItem);
    return this;
  }

   /**
   * Get serviceLines
   * @return serviceLines
  **/

  public List<ServiceLine> getServiceLines() {
    return serviceLines;
  }

  public void setServiceLines(List<ServiceLine> serviceLines) {
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
    ServiceLines serviceLines = (ServiceLines) o;
    return Objects.equals(this.classificationCode, serviceLines.classificationCode) &&
        Objects.equals(this.networkType, serviceLines.networkType) &&
        Objects.equals(this.lineTreatments, serviceLines.lineTreatments) &&
        Objects.equals(this.serviceLines, serviceLines.serviceLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationCode, networkType, lineTreatments, serviceLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLines {\n");
    
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    lineTreatments: ").append(toIndentedString(lineTreatments)).append("\n");
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

