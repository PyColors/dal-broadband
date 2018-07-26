package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AppointmentDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")

public class AppointmentDetails   {
  
  /** The address details. */
  @JsonProperty("addressDetails")
  private AddressDetails addressDetails = null;

  /** The appointment window. */
  @JsonProperty("appointmentWindow")
  private AppointmentWindow appointmentWindow = null;

  /** The service request. */
  @JsonProperty("serviceRequest")
  private ServiceRequest serviceRequest = null;

  /**
   * Address details.
   *
   * @param addressDetails the address details
   * @return the appointment details
   */
  public AppointmentDetails addressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

  /**
   * Get addressDetails.
   *
   * @return addressDetails
   */
  @ApiModelProperty(value = "")

  @Valid

  public AddressDetails getAddressDetails() {
    return addressDetails;
  }

  /**
   * Sets the address details.
   *
   * @param addressDetails the new address details
   */
  public void setAddressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }

  /**
   * Appointment window.
   *
   * @param appointmentWindow the appointment window
   * @return the appointment details
   */
  public AppointmentDetails appointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
    return this;
  }

  /**
   * Get appointmentWindow.
   *
   * @return appointmentWindow
   */
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentWindow getAppointmentWindow() {
    return appointmentWindow;
  }

  /**
   * Sets the appointment window.
   *
   * @param appointmentWindow the new appointment window
   */
  public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
  }

  /**
   * Service request.
   *
   * @param serviceRequest the service request
   * @return the appointment details
   */
  public AppointmentDetails serviceRequest(ServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  /**
   * Get serviceRequest.
   *
   * @return serviceRequest
   */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRequest getServiceRequest() {
    return serviceRequest;
  }

  /**
   * Sets the service request.
   *
   * @param serviceRequest the new service request
   */
  public void setServiceRequest(ServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
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
    AppointmentDetails appointmentDetails = (AppointmentDetails) o;
    return Objects.equals(this.addressDetails, appointmentDetails.addressDetails) &&
        Objects.equals(this.appointmentWindow, appointmentDetails.appointmentWindow) &&
        Objects.equals(this.serviceRequest, appointmentDetails.serviceRequest);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, appointmentWindow, serviceRequest);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentDetails {\n");
    
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
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

