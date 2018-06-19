package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateAppointment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class CreateAppointment   {
  @JsonProperty("appointmentWindow")
  private AppointmentWindow appointmentWindow = null;

  @JsonProperty("resultStatus")
  private String resultStatus = null;

  public CreateAppointment appointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
    return this;
  }

  /**
   * Get appointmentWindow
   * @return appointmentWindow
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentWindow getAppointmentWindow() {
    return appointmentWindow;
  }

  public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
  }

  public CreateAppointment resultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
    return this;
  }

  /**
   * Get resultStatus
   * @return resultStatus
  **/
  @ApiModelProperty(value = "")


  public String getResultStatus() {
    return resultStatus;
  }

  public void setResultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppointment createAppointment = (CreateAppointment) o;
    return Objects.equals(this.appointmentWindow, createAppointment.appointmentWindow) &&
        Objects.equals(this.resultStatus, createAppointment.resultStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentWindow, resultStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppointment {\n");
    
    sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
    sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
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

