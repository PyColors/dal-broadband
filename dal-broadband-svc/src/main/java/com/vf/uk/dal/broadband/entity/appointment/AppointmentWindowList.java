package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentWindowList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class AppointmentWindowList   {
  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("startTimePeriod")
  private String startTimePeriod = null;

  @JsonProperty("timeSlot")
  private String timeSlot = null;

  public AppointmentWindowList endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Time on which the appointment should be reserved
   * @return endTime
  **/
  @ApiModelProperty(value = "Time on which the appointment should be reserved")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public AppointmentWindowList startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Time on which the appointment should be reserved
   * @return startTime
  **/
  @ApiModelProperty(value = "Time on which the appointment should be reserved")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public AppointmentWindowList startTimePeriod(String startTimePeriod) {
    this.startTimePeriod = startTimePeriod;
    return this;
  }

  /**
   * Date on which the appointment should be reserved in case of or Earliest required appointment date in case of get appointment request.
   * @return startTimePeriod
  **/
  @ApiModelProperty(value = "Date on which the appointment should be reserved in case of or Earliest required appointment date in case of get appointment request.")


  public String getStartTimePeriod() {
    return startTimePeriod;
  }

  public void setStartTimePeriod(String startTimePeriod) {
    this.startTimePeriod = startTimePeriod;
  }

  public AppointmentWindowList timeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
    return this;
  }

  /**
   * Time slot at which the appointment should be reserved. LOV - AM, PM, EV, EM
   * @return timeSlot
  **/
  @ApiModelProperty(value = "Time slot at which the appointment should be reserved. LOV - AM, PM, EV, EM")


  public String getTimeSlot() {
    return timeSlot;
  }

  public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentWindowList appointmentWindowList = (AppointmentWindowList) o;
    return Objects.equals(this.endTime, appointmentWindowList.endTime) &&
        Objects.equals(this.startTime, appointmentWindowList.startTime) &&
        Objects.equals(this.startTimePeriod, appointmentWindowList.startTimePeriod) &&
        Objects.equals(this.timeSlot, appointmentWindowList.timeSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime, startTimePeriod, timeSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentWindowList {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startTimePeriod: ").append(toIndentedString(startTimePeriod)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
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

