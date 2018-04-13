package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentWindow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T10:34:26.484Z")
public class AppointmentWindow {
  private String identificationId = null;

  private String startDateTime = null;

  private String operationalPreferenceCode = null;

  private String timeSlot = null;

  private List<SiteNote> siteNotes = null;

  public AppointmentWindow serviceLines(List<SiteNote> siteNotes) {
    this.siteNotes = siteNotes;
    return this;
  }

  public AppointmentWindow addServiceLinesItem(SiteNote siteNotesItem) {
    if (this.siteNotes == null) {
      this.siteNotes = new ArrayList<SiteNote>();
    }
    this.siteNotes.add(siteNotesItem);
    return this;
  }

   /**
   * Get siteNotes
   * @return siteNotes
  **/


  public List<SiteNote> getSiteNotes() {
    return siteNotes;
  }

  public void setSiteNotes(List<SiteNote> siteNotes) {
    this.siteNotes = siteNotes;
  }



  public AppointmentWindow identificationId(String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

   /**
   * Get identificationId
   * @return identificationId
  **/
  @ApiModelProperty(value = "")
  public String getIdentificationId() {
    return identificationId;
  }

  public void setIdentificationId(String identificationId) {
    this.identificationId = identificationId;
  }

  public AppointmentWindow startDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Earliest required appointment date.
   * @return startDateTime
  **/
  @ApiModelProperty(value = "Earliest required appointment date. ex: yyyy-MM-dd'T'HH:mm:ss.SSSXXX ",example="2017-10-01T09:45:00.000+02:00")
  public String getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
  }

  public AppointmentWindow operationalPreferenceCode(String operationalPreferenceCode) {
    this.operationalPreferenceCode = operationalPreferenceCode;
    return this;
  }

   /**
   * The type of.window retrieved which determines whether the appointment is made during or outside of working hours
   * @return operationalPreferenceCode
  **/
  @ApiModelProperty(value = "The type of.window retrieved which determines whether the appointment is made during or outside of working hours")
  public String getOperationalPreferenceCode() {
    return operationalPreferenceCode;
  }

  public void setOperationalPreferenceCode(String operationalPreferenceCode) {
    this.operationalPreferenceCode = operationalPreferenceCode;
  }

  public AppointmentWindow timeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
    return this;
  }

   /**
   * Time slot at which the appointment should be reserved.
   * @return timeSlot
  **/
  @ApiModelProperty(value = "Time slot at which the appointment should be reserved.")
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
    AppointmentWindow appointmentWindow = (AppointmentWindow) o;
    return Objects.equals(this.identificationId, appointmentWindow.identificationId) &&
        Objects.equals(this.startDateTime, appointmentWindow.startDateTime) &&
        Objects.equals(this.operationalPreferenceCode, appointmentWindow.operationalPreferenceCode) &&
        Objects.equals(this.timeSlot, appointmentWindow.timeSlot) &&
        Objects.equals(this.siteNotes, appointmentWindow.siteNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationId, startDateTime, operationalPreferenceCode, timeSlot, siteNotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentWindow {\n");
    
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    operationalPreferenceCode: ").append(toIndentedString(operationalPreferenceCode)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
    sb.append("    siteNote: ").append(toIndentedString(siteNotes)).append("\n");
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