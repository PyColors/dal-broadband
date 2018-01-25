package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppointmentDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class AppointmentDetails {
	@JsonProperty("appointmentWindow")
	private AppointmentWindow appointmentWindow = null;

	@JsonProperty("serviceRequest")
	private ServiceRequest serviceRequest = null;

	@JsonProperty("addressDetails")
	private AddressDetails addressDetails = null;

	public AppointmentDetails appointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
		return this;
	}

	/**
	 * Get appointmentWindow
	 * 
	 * @return appointmentWindow
	 **/

	@Valid

	public AppointmentWindow getAppointmentWindow() {
		return appointmentWindow;
	}

	public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
	}

	public AppointmentDetails serviceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
		return this;
	}

	/**
	 * Get serviceRequest
	 * 
	 * @return serviceRequest
	 **/

	@Valid

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public AppointmentDetails addressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
		return this;
	}

	/**
	 * Get addressDetails
	 * 
	 * @return addressDetails
	 **/

	@Valid

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppointmentDetails appointmentDetails = (AppointmentDetails) o;
		return Objects.equals(this.appointmentWindow, appointmentDetails.appointmentWindow)
				&& Objects.equals(this.serviceRequest, appointmentDetails.serviceRequest)
				&& Objects.equals(this.addressDetails, appointmentDetails.addressDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentWindow, serviceRequest, addressDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppointmentDetails {\n");

		sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
		sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
		sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
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
