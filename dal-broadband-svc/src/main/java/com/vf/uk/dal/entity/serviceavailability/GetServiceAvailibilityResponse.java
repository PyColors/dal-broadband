package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetServiceAvailibilityResponse.
 */

public class GetServiceAvailibilityResponse {
	
	/** The service availability line. */
	@JsonProperty("serviceAvailabilityLine")
	private List<ServiceAvailabilityLine> serviceAvailabilityLine = new ArrayList<>();

	/** The warning error list. */
	@JsonProperty("warningErrorList")
	private List<ErrorInfo> warningErrorList = null;

	
	/**
	 * Service availability line.
	 *
	 * @param serviceAvailabilityLine the service availability line
	 * @return the gets the service availibility response
	 */
	public GetServiceAvailibilityResponse serviceAvailabilityLine(
			List<ServiceAvailabilityLine> serviceAvailabilityLine) {
		this.serviceAvailabilityLine = serviceAvailabilityLine;
		return this;
	}

	/**
	 * Adds the service availability line item.
	 *
	 * @param serviceAvailabilityLineItem the service availability line item
	 * @return the gets the service availibility response
	 */
	public GetServiceAvailibilityResponse addServiceAvailabilityLineItem(
			ServiceAvailabilityLine serviceAvailabilityLineItem) {
		this.serviceAvailabilityLine.add(serviceAvailabilityLineItem);
		return this;
	}

	/**
	 * Get serviceAvailabilityLine.
	 *
	 * @return serviceAvailabilityLine
	 */
	public List<ServiceAvailabilityLine> getServiceAvailabilityLine() {
		return serviceAvailabilityLine;
	}

	/**
	 * Sets the service availability line.
	 *
	 * @param serviceAvailabilityLine the new service availability line
	 */
	public void setServiceAvailabilityLine(List<ServiceAvailabilityLine> serviceAvailabilityLine) {
		this.serviceAvailabilityLine = serviceAvailabilityLine;
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
		GetServiceAvailibilityResponse getServiceAvailibilityResponse = (GetServiceAvailibilityResponse) o;
		return Objects.equals(this.serviceAvailabilityLine, getServiceAvailibilityResponse.serviceAvailabilityLine);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(serviceAvailabilityLine);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetServiceAvailibilityResponse {\n");

		sb.append("    serviceAvailabilityLine: ").append(toIndentedString(serviceAvailabilityLine)).append("\n");
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
	
	/**
	 * Gets the warning error list.
	 *
	 * @return the warning error list
	 */
	public List<ErrorInfo> getWarningErrorList() {
		return warningErrorList;
	}

	/**
	 * Sets the warning error list.
	 *
	 * @param warningErrorList the new warning error list
	 */
	public void setWarningErrorList(List<ErrorInfo> warningErrorList) {
		this.warningErrorList = warningErrorList;
	}
}
