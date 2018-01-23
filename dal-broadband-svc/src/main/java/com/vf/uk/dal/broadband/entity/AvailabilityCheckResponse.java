package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AvailabilityCheckResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class AvailabilityCheckResponse   {
  @JsonProperty("journeyId")
  private String journeyId = null;

  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  @JsonProperty("appointmentAndAvailabilityDetail")
  private List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail = null;

  @JsonProperty("engineeringVisitCharge")
  private Float engineeringVisitCharge = null;

  @JsonProperty("lineSpeeds")
  private LineSpeeds lineSpeeds = null;

  @JsonProperty("classificationCode")
  private List<String> classificationCode = null;

  public AvailabilityCheckResponse journeyId(String journeyId) {
    this.journeyId = journeyId;
    return this;
  }

   /**
   * Journey id of the broadband - Unique
   * @return journeyId
  **/
  @ApiModelProperty(value = "Journey id of the broadband - Unique")


  public String getJourneyId() {
    return journeyId;
  }

  public void setJourneyId(String journeyId) {
    this.journeyId = journeyId;
  }

  public AvailabilityCheckResponse installationAddress(InstallationAddress installationAddress) {
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

  public AvailabilityCheckResponse appointmentAndAvailabilityDetail(List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail) {
    this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
    return this;
  }

  public AvailabilityCheckResponse addAppointmentAndAvailabilityDetailItem(AppointmentAndAvailabilityDetail appointmentAndAvailabilityDetailItem) {
    if (this.appointmentAndAvailabilityDetail == null) {
      this.appointmentAndAvailabilityDetail = new ArrayList<AppointmentAndAvailabilityDetail>();
    }
    this.appointmentAndAvailabilityDetail.add(appointmentAndAvailabilityDetailItem);
    return this;
  }

   /**
   * Get appointmentAndAvailabilityDetail
   * @return appointmentAndAvailabilityDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AppointmentAndAvailabilityDetail> getAppointmentAndAvailabilityDetail() {
    return appointmentAndAvailabilityDetail;
  }

  public void setAppointmentAndAvailabilityDetail(List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail) {
    this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
  }

  public AvailabilityCheckResponse engineeringVisitCharge(Float engineeringVisitCharge) {
    this.engineeringVisitCharge = engineeringVisitCharge;
    return this;
  }

   /**
   * Get engineeringVisitCharge
   * @return engineeringVisitCharge
  **/
  @ApiModelProperty(value = "")


  public Float getEngineeringVisitCharge() {
    return engineeringVisitCharge;
  }

  public void setEngineeringVisitCharge(Float engineeringVisitCharge) {
    this.engineeringVisitCharge = engineeringVisitCharge;
  }

  public AvailabilityCheckResponse lineSpeeds(LineSpeeds lineSpeeds) {
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

  public AvailabilityCheckResponse classificationCode(List<String> classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

  public AvailabilityCheckResponse addClassificationCodeItem(String classificationCodeItem) {
    if (this.classificationCode == null) {
      this.classificationCode = new ArrayList<String>();
    }
    this.classificationCode.add(classificationCodeItem);
    return this;
  }

   /**
   * Get classificationCode
   * @return classificationCode
  **/
  @ApiModelProperty(value = "")


  public List<String> getClassificationCode() {
    return classificationCode;
  }

  public void setClassificationCode(List<String> classificationCode) {
    this.classificationCode = classificationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityCheckResponse availabilityCheckResponse = (AvailabilityCheckResponse) o;
    return Objects.equals(this.journeyId, availabilityCheckResponse.journeyId) &&
        Objects.equals(this.installationAddress, availabilityCheckResponse.installationAddress) &&
        Objects.equals(this.appointmentAndAvailabilityDetail, availabilityCheckResponse.appointmentAndAvailabilityDetail) &&
        Objects.equals(this.engineeringVisitCharge, availabilityCheckResponse.engineeringVisitCharge) &&
        Objects.equals(this.lineSpeeds, availabilityCheckResponse.lineSpeeds) &&
        Objects.equals(this.classificationCode, availabilityCheckResponse.classificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journeyId, installationAddress, appointmentAndAvailabilityDetail, engineeringVisitCharge, lineSpeeds, classificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityCheckResponse {\n");
    
    sb.append("    journeyId: ").append(toIndentedString(journeyId)).append("\n");
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
    sb.append("    appointmentAndAvailabilityDetail: ").append(toIndentedString(appointmentAndAvailabilityDetail)).append("\n");
    sb.append("    engineeringVisitCharge: ").append(toIndentedString(engineeringVisitCharge)).append("\n");
    sb.append("    lineSpeeds: ").append(toIndentedString(lineSpeeds)).append("\n");
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
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

