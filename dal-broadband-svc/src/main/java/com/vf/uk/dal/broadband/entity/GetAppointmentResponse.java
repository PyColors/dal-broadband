package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetAppointmentResponse.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-14T14:47:09.485Z")

public class GetAppointmentResponse extends ResourceSupport  {
  
  /** The appointment window list. */
  @JsonProperty("appointmentWindowList")
  @Valid
  private List<AppointmentList> appointmentWindowList = null;

  /**
   * Appointment window list.
   *
   * @param appointmentWindowList the appointment window list
   * @return the gets the appointment response
   */
  public GetAppointmentResponse appointmentWindowList(List<AppointmentList> appointmentWindowList) {
    this.appointmentWindowList = appointmentWindowList;
    return this;
  }

  /**
   * Adds the appointment window list item.
   *
   * @param appointmentWindowListItem the appointment window list item
   * @return the gets the appointment response
   */
  public GetAppointmentResponse addAppointmentWindowListItem(AppointmentList appointmentWindowListItem) {
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

  public List<AppointmentList> getAppointmentWindowList() {
    return appointmentWindowList;
  }

  /**
   * Sets the appointment window list.
   *
   * @param appointmentWindowList the new appointment window list
   */
  public void setAppointmentWindowList(List<AppointmentList> appointmentWindowList) {
    this.appointmentWindowList = appointmentWindowList;
  }


  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#equals(java.lang.Object)
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppointmentResponse getAppointmentResponse = (GetAppointmentResponse) o;
    return Objects.equals(this.appointmentWindowList, getAppointmentResponse.appointmentWindowList);
  }

  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(appointmentWindowList);
  }

  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppointmentResponse {\n");
    
    sb.append("    appointmentWindowList: ").append(toIndentedString(appointmentWindowList)).append("\n");
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

