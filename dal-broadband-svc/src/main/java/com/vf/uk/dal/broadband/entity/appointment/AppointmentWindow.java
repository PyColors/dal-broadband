package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentWindow.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class AppointmentWindow   {
  
  /** The application id. */
  @JsonProperty("applicationId")
  private String applicationId = null;

  /** The end time. */
  @JsonProperty("endTime")
  private String endTime = null;

  /** The operational preference code. */
  @JsonProperty("operationalPreferenceCode")
  private String operationalPreferenceCode = null;

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
   * Application id.
   *
   * @param applicationId the application id
   * @return the appointment window
   */
  public AppointmentWindow applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId.
   *
   * @return applicationId
   */
  @ApiModelProperty(value = "")


  public String getApplicationId() {
    return applicationId;
  }

  /**
   * Sets the application id.
   *
   * @param applicationId the new application id
   */
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  /**
   * End time.
   *
   * @param endTime the end time
   * @return the appointment window
   */
  public AppointmentWindow endTime(String endTime) {
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
   * Operational preference code.
   *
   * @param operationalPreferenceCode the operational preference code
   * @return the appointment window
   */
  public AppointmentWindow operationalPreferenceCode(String operationalPreferenceCode) {
    this.operationalPreferenceCode = operationalPreferenceCode;
    return this;
  }

  /**
   * The type of.window retrieved which determines whether the appointment is made during or outside of working hours LOV - STANDARD OR FLEXIBLE.
   * @return operationalPreferenceCode
  **/
  @ApiModelProperty(value = "The type of.window retrieved which determines whether the appointment is made during or outside of working hours LOV - STANDARD OR FLEXIBLE.")


  public String getOperationalPreferenceCode() {
    return operationalPreferenceCode;
  }

  /**
   * Sets the operational preference code.
   *
   * @param operationalPreferenceCode the new operational preference code
   */
  public void setOperationalPreferenceCode(String operationalPreferenceCode) {
    this.operationalPreferenceCode = operationalPreferenceCode;
  }

  /**
   * Start time.
   *
   * @param startTime the start time
   * @return the appointment window
   */
  public AppointmentWindow startTime(String startTime) {
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
   * @return the appointment window
   */
  public AppointmentWindow startTimePeriod(String startTimePeriod) {
    this.startTimePeriod = startTimePeriod;
    return this;
  }

  /**
   * Earliest required appointment date. The format should be dd/mm/yyyy or Date at which appointment needs ot be booked.
   * @return startTimePeriod
  **/
  @ApiModelProperty(value = "Earliest required appointment date. The format should be dd/mm/yyyy or Date at which appointment needs ot be booked.")


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
   * @return the appointment window
   */
  public AppointmentWindow timeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
    return this;
  }

  /**
   * Time slot by which appointment needs to be booked  LOV - AM, PM,             EV, EM.
   * @return timeSlot
  **/
  @ApiModelProperty(value = "Time slot by which appointment needs to be booked  LOV - AM, PM,             EV, EM.")


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
    AppointmentWindow appointmentWindow = (AppointmentWindow) o;
    return Objects.equals(this.applicationId, appointmentWindow.applicationId) &&
        Objects.equals(this.endTime, appointmentWindow.endTime) &&
        Objects.equals(this.operationalPreferenceCode, appointmentWindow.operationalPreferenceCode) &&
        Objects.equals(this.startTime, appointmentWindow.startTime) &&
        Objects.equals(this.startTimePeriod, appointmentWindow.startTimePeriod) &&
        Objects.equals(this.timeSlot, appointmentWindow.timeSlot);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(applicationId, endTime, operationalPreferenceCode, startTime, startTimePeriod, timeSlot);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentWindow {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    operationalPreferenceCode: ").append(toIndentedString(operationalPreferenceCode)).append("\n");
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

