package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetServiceAvailibilityResponse
 */

public class GetServiceAvailibilityResponse {
	@JsonProperty("serviceAvailabilityLine")
	private List<ServiceAvailabilityLine> serviceAvailabilityLine = new ArrayList<ServiceAvailabilityLine>();

	@JsonProperty("warningErrorList")
	private List<ErrorInfo> warningErrorList = null;

	
	public GetServiceAvailibilityResponse serviceAvailabilityLine(
			List<ServiceAvailabilityLine> serviceAvailabilityLine) {
		this.serviceAvailabilityLine = serviceAvailabilityLine;
		return this;
	}

	public GetServiceAvailibilityResponse addServiceAvailabilityLineItem(
			ServiceAvailabilityLine serviceAvailabilityLineItem) {
		this.serviceAvailabilityLine.add(serviceAvailabilityLineItem);
		return this;
	}

	/**
	 * Get serviceAvailabilityLine
	 * 
	 * @return serviceAvailabilityLine
	 **/
	public List<ServiceAvailabilityLine> getServiceAvailabilityLine() {
		return serviceAvailabilityLine;
	}

	public void setServiceAvailabilityLine(List<ServiceAvailabilityLine> serviceAvailabilityLine) {
		this.serviceAvailabilityLine = serviceAvailabilityLine;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(serviceAvailabilityLine);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
	
	public List<ErrorInfo> getWarningErrorList() {
		return warningErrorList;
	}

	public void setWarningErrorList(List<ErrorInfo> warningErrorList) {
		this.warningErrorList = warningErrorList;
	}
}
