package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointmentRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class CreateAppointmentRequest   {
  @JsonProperty("appointmentDetails")
  private AppointmentDetails appointmentDetails = null;

  @JsonProperty("existing")
  private Boolean existing = null;

  public CreateAppointmentRequest appointmentDetails(AppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
    return this;
  }

  /**
   * Get appointmentDetails
   * @return appointmentDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentDetails getAppointmentDetails() {
    return appointmentDetails;
  }

  public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
  }

  public CreateAppointmentRequest existing(Boolean existing) {
    this.existing = existing;
    return this;
  }

  /**
   * Get existing
   * @return existing
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isExisting() {
    return existing;
  }

  public void setExisting(Boolean existing) {
    this.existing = existing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppointmentRequest createAppointmentRequest = (CreateAppointmentRequest) o;
    return Objects.equals(this.appointmentDetails, createAppointmentRequest.appointmentDetails) &&
        Objects.equals(this.existing, createAppointmentRequest.existing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDetails, existing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppointmentRequest {\n");
    
    sb.append("    appointmentDetails: ").append(toIndentedString(appointmentDetails)).append("\n");
    sb.append("    existing: ").append(toIndentedString(existing)).append("\n");
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

