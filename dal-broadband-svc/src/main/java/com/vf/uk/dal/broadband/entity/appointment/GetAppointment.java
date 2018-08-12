package com.vf.uk.dal.broadband.entity.appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetAppointment.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class GetAppointment   {
  
  /** The appointment window list. */
  @JsonProperty("appointmentWindowList")
  @Valid
  private List<AppointmentWindowList> appointmentWindowList = null;

  /** The result status. */
  @JsonProperty("resultStatus")
  private String resultStatus = null;

  /**
   * Appointment window list.
   *
   * @param appointmentWindowList the appointment window list
   * @return the gets the appointment
   */
  public GetAppointment appointmentWindowList(List<AppointmentWindowList> appointmentWindowList) {
    this.appointmentWindowList = appointmentWindowList;
    return this;
  }

  /**
   * Adds the appointment window list item.
   *
   * @param appointmentWindowListItem the appointment window list item
   * @return the gets the appointment
   */
  public GetAppointment addAppointmentWindowListItem(AppointmentWindowList appointmentWindowListItem) {
    if (this.appointmentWindowList == null) {
      this.appointmentWindowList = new ArrayList<>();
    }
    this.appointmentWindowList.add(appointmentWindowListItem);
    return this;
  }

  /**
   * Get appointmentWindowList.
   *
   * @return appointmentWindowList
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<AppointmentWindowList> getAppointmentWindowList() {
    return appointmentWindowList;
  }

  /**
   * Sets the appointment window list.
   *
   * @param appointmentWindowList the new appointment window list
   */
  public void setAppointmentWindowList(List<AppointmentWindowList> appointmentWindowList) {
    this.appointmentWindowList = appointmentWindowList;
  }

  /**
   * Result status.
   *
   * @param resultStatus the result status
   * @return the gets the appointment
   */
  public GetAppointment resultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
    return this;
  }

  /**
   * Get resultStatus.
   *
   * @return resultStatus
   */
  @ApiModelProperty(value = "")


  public String getResultStatus() {
    return resultStatus;
  }

  /**
   * Sets the result status.
   *
   * @param resultStatus the new result status
   */
  public void setResultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
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
    GetAppointment getAppointment = (GetAppointment) o;
    return Objects.equals(this.appointmentWindowList, getAppointment.appointmentWindowList) &&
        Objects.equals(this.resultStatus, getAppointment.resultStatus);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(appointmentWindowList, resultStatus);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppointment {\n");
    
    sb.append("    appointmentWindowList: ").append(toIndentedString(appointmentWindowList)).append("\n");
    sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
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

