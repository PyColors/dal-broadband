package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PremiseAndServicePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-24T11:14:47.535Z")

public class PremiseAndServicePoint   {
  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  @JsonProperty("linePackageType")
  private String linePackageType = null;

  @JsonProperty("lineTreatmentType")
  private String lineTreatmentType = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("servicePoint")
  private ServicePoint servicePoint = null;

  public PremiseAndServicePoint installationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
    return this;
  }

  /**
   * Get installationAddress
   * @return installationAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
  }

  public PremiseAndServicePoint linePackageType(String linePackageType) {
    this.linePackageType = linePackageType;
    return this;
  }

  /**
   * Get linePackageType
   * @return linePackageType
  **/
  @ApiModelProperty(value = "")


  public String getLinePackageType() {
    return linePackageType;
  }

  public void setLinePackageType(String linePackageType) {
    this.linePackageType = linePackageType;
  }

  public PremiseAndServicePoint lineTreatmentType(String lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
    return this;
  }

  /**
   * Get lineTreatmentType
   * @return lineTreatmentType
  **/
  @ApiModelProperty(value = "")


  public String getLineTreatmentType() {
    return lineTreatmentType;
  }

  public void setLineTreatmentType(String lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
  }

  public PremiseAndServicePoint phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PremiseAndServicePoint servicePoint(ServicePoint servicePoint) {
    this.servicePoint = servicePoint;
    return this;
  }

  /**
   * Get servicePoint
   * @return servicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServicePoint getServicePoint() {
    return servicePoint;
  }

  public void setServicePoint(ServicePoint servicePoint) {
    this.servicePoint = servicePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiseAndServicePoint premiseAndServicePoint = (PremiseAndServicePoint) o;
    return Objects.equals(this.installationAddress, premiseAndServicePoint.installationAddress) &&
        Objects.equals(this.linePackageType, premiseAndServicePoint.linePackageType) &&
        Objects.equals(this.lineTreatmentType, premiseAndServicePoint.lineTreatmentType) &&
        Objects.equals(this.phoneNumber, premiseAndServicePoint.phoneNumber) &&
        Objects.equals(this.servicePoint, premiseAndServicePoint.servicePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationAddress, linePackageType, lineTreatmentType, phoneNumber, servicePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiseAndServicePoint {\n");
    
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
    sb.append("    linePackageType: ").append(toIndentedString(linePackageType)).append("\n");
    sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
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

