package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentWindow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class AppointmentWindow   {
  @JsonProperty("identificationId")
  private String identificationId = null;

  @JsonProperty("operationalPreferenceCode")
  private String operationalPreferenceCode = null;

  @JsonProperty("siteNotes")
  @Valid
  private List<SiteNote> siteNotes = null;

  @JsonProperty("startDateTime")
  private String startDateTime = null;

  @JsonProperty("timeSlot")
  private String timeSlot = null;

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

  public AppointmentWindow siteNotes(List<SiteNote> siteNotes) {
    this.siteNotes = siteNotes;
    return this;
  }

  public AppointmentWindow addSiteNotesItem(SiteNote siteNotesItem) {
    if (this.siteNotes == null) {
      this.siteNotes = new ArrayList<>();
    }
    this.siteNotes.add(siteNotesItem);
    return this;
  }

  /**
   * Get siteNotes
   * @return siteNotes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SiteNote> getSiteNotes() {
    return siteNotes;
  }

  public void setSiteNotes(List<SiteNote> siteNotes) {
    this.siteNotes = siteNotes;
  }

  public AppointmentWindow startDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Earliest required appointment date. ex: yyyy-MM-dd'T'HH:mm:ss.SSSXXX 
   * @return startDateTime
  **/
  @ApiModelProperty(value = "Earliest required appointment date. ex: yyyy-MM-dd'T'HH:mm:ss.SSSXXX ")


  public String getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentWindow {\n");
    
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    operationalPreferenceCode: ").append(toIndentedString(operationalPreferenceCode)).append("\n");
    sb.append("    siteNotes: ").append(toIndentedString(siteNotes)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

