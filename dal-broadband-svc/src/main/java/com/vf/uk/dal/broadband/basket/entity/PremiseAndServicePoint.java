package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PremiseAndServicePoint.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-24T11:14:47.535Z")

public class PremiseAndServicePoint   {
  
  /** The installation address. */
  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  /** The line package type. */
  @JsonProperty("linePackageType")
  private String linePackageType = null;

  /** The line treatment type. */
  @JsonProperty("lineTreatmentType")
  private String lineTreatmentType = null;

  /** The phone number. */
  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  /** The service point. */
  @JsonProperty("servicePoint")
  private BasketServicePoint servicePoint = null;

  /**
   * Installation address.
   *
   * @param installationAddress the installation address
   * @return the premise and service point
   */
  public PremiseAndServicePoint installationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
    return this;
  }

  /**
   * Get installationAddress.
   *
   * @return installationAddress
   */
  @ApiModelProperty(value = "")

  @Valid

  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  /**
   * Sets the installation address.
   *
   * @param installationAddress the new installation address
   */
  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
  }

  /**
   * Line package type.
   *
   * @param linePackageType the line package type
   * @return the premise and service point
   */
  public PremiseAndServicePoint linePackageType(String linePackageType) {
    this.linePackageType = linePackageType;
    return this;
  }

  /**
   * Get linePackageType.
   *
   * @return linePackageType
   */
  @ApiModelProperty(value = "")


  public String getLinePackageType() {
    return linePackageType;
  }

  /**
   * Sets the line package type.
   *
   * @param linePackageType the new line package type
   */
  public void setLinePackageType(String linePackageType) {
    this.linePackageType = linePackageType;
  }

  /**
   * Line treatment type.
   *
   * @param lineTreatmentType the line treatment type
   * @return the premise and service point
   */
  public PremiseAndServicePoint lineTreatmentType(String lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
    return this;
  }

  /**
   * Get lineTreatmentType.
   *
   * @return lineTreatmentType
   */
  @ApiModelProperty(value = "")


  public String getLineTreatmentType() {
    return lineTreatmentType;
  }

  /**
   * Sets the line treatment type.
   *
   * @param lineTreatmentType the new line treatment type
   */
  public void setLineTreatmentType(String lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
  }

  /**
   * Phone number.
   *
   * @param phoneNumber the phone number
   * @return the premise and service point
   */
  public PremiseAndServicePoint phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber.
   *
   * @return phoneNumber
   */
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Sets the phone number.
   *
   * @param phoneNumber the new phone number
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Service point.
   *
   * @param servicePoint the service point
   * @return the premise and service point
   */
  public PremiseAndServicePoint servicePoint(BasketServicePoint servicePoint) {
    this.servicePoint = servicePoint;
    return this;
  }

  /**
   * Get servicePoint.
   *
   * @return servicePoint
   */
  @ApiModelProperty(value = "")

  @Valid

  public BasketServicePoint getServicePoint() {
    return servicePoint;
  }

  /**
   * Sets the service point.
   *
   * @param servicePoint the new service point
   */
  public void setServicePoint(BasketServicePoint servicePoint) {
    this.servicePoint = servicePoint;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(installationAddress, linePackageType, lineTreatmentType, phoneNumber, servicePoint);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

