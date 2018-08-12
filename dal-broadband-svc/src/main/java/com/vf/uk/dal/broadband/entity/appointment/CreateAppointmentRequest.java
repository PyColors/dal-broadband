package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointmentRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class CreateAppointmentRequest   {
  
  /** The appointment details. */
  @JsonProperty("appointmentDetails")
  private AppointmentDetails appointmentDetails = null;

  /** The existing. */
  @JsonProperty("existing")
  private Boolean existing = null;

  /**
   * Appointment details.
   *
   * @param appointmentDetails the appointment details
   * @return the creates the appointment request
   */
  public CreateAppointmentRequest appointmentDetails(AppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
    return this;
  }

  /**
   * Get appointmentDetails.
   *
   * @return appointmentDetails
   */
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentDetails getAppointmentDetails() {
    return appointmentDetails;
  }

  /**
   * Sets the appointment details.
   *
   * @param appointmentDetails the new appointment details
   */
  public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
  }

  /**
   * Existing.
   *
   * @param existing the existing
   * @return the creates the appointment request
   */
  public CreateAppointmentRequest existing(Boolean existing) {
    this.existing = existing;
    return this;
  }

  /**
   * Get existing.
   *
   * @return existing
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isExisting() {
    return existing;
  }

  /**
   * Sets the existing.
   *
   * @param existing the new existing
   */
  public void setExisting(Boolean existing) {
    this.existing = existing;
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
    CreateAppointmentRequest createAppointmentRequest = (CreateAppointmentRequest) o;
    return Objects.equals(this.appointmentDetails, createAppointmentRequest.appointmentDetails) &&
        Objects.equals(this.existing, createAppointmentRequest.existing);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(appointmentDetails, existing);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

