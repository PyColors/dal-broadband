package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentWindowList.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class AppointmentWindowList   {
  
  /** The end time. */
  @JsonProperty("endTime")
  private String endTime = null;

  /** The start time. */
  @JsonProperty("startTime")
  private String startTime = null;

  /** The start time period. */
  @JsonProperty("startTimePeriod")
  private String startTimePeriod = null;

  /** The time slot. */
  @JsonProperty("timeSlot")
  private String timeSlot = null;

  /**
   * End time.
   *
   * @param endTime the end time
   * @return the appointment window list
   */
  public AppointmentWindowList endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Time on which the appointment should be reserved.
   *
   * @return endTime
   */
  @ApiModelProperty(value = "Time on which the appointment should be reserved")


  public String getEndTime() {
    return endTime;
  }

  /**
   * Sets the end time.
   *
   * @param endTime the new end time
   */
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Start time.
   *
   * @param startTime the start time
   * @return the appointment window list
   */
  public AppointmentWindowList startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Time on which the appointment should be reserved.
   *
   * @return startTime
   */
  @ApiModelProperty(value = "Time on which the appointment should be reserved")


  public String getStartTime() {
    return startTime;
  }

  /**
   * Sets the start time.
   *
   * @param startTime the new start time
   */
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Start time period.
   *
   * @param startTimePeriod the start time period
   * @return the appointment window list
   */
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

  /**
   * Sets the start time period.
   *
   * @param startTimePeriod the new start time period
   */
  public void setStartTimePeriod(String startTimePeriod) {
    this.startTimePeriod = startTimePeriod;
  }

  /**
   * Time slot.
   *
   * @param timeSlot the time slot
   * @return the appointment window list
   */
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

  /**
   * Sets the time slot.
   *
   * @param timeSlot the new time slot
   */
  public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
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
    AppointmentWindowList appointmentWindowList = (AppointmentWindowList) o;
    return Objects.equals(this.endTime, appointmentWindowList.endTime) &&
        Objects.equals(this.startTime, appointmentWindowList.startTime) &&
        Objects.equals(this.startTimePeriod, appointmentWindowList.startTimePeriod) &&
        Objects.equals(this.timeSlot, appointmentWindowList.timeSlot);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime, startTimePeriod, timeSlot);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

