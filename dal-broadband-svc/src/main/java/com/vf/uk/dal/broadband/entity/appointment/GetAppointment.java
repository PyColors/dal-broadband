package com.vf.uk.dal.broadband.entity.appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetAppointment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class GetAppointment   {
  @JsonProperty("appointmentWindowList")
  @Valid
  private List<AppointmentWindowList> appointmentWindowList = null;

  @JsonProperty("resultStatus")
  private String resultStatus = null;

  public GetAppointment appointmentWindowList(List<AppointmentWindowList> appointmentWindowList) {
    this.appointmentWindowList = appointmentWindowList;
    return this;
  }

  public GetAppointment addAppointmentWindowListItem(AppointmentWindowList appointmentWindowListItem) {
    if (this.appointmentWindowList == null) {
      this.appointmentWindowList = new ArrayList<AppointmentWindowList>();
    }
    this.appointmentWindowList.add(appointmentWindowListItem);
    return this;
  }

  /**
   * Get appointmentWindowList
   * @return appointmentWindowList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AppointmentWindowList> getAppointmentWindowList() {
    return appointmentWindowList;
  }

  public void setAppointmentWindowList(List<AppointmentWindowList> appointmentWindowList) {
    this.appointmentWindowList = appointmentWindowList;
  }

  public GetAppointment resultStatus(String resultStatus) {
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
    GetAppointment getAppointment = (GetAppointment) o;
    return Objects.equals(this.appointmentWindowList, getAppointment.appointmentWindowList) &&
        Objects.equals(this.resultStatus, getAppointment.resultStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentWindowList, resultStatus);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

