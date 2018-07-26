package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceAvailabilityLine
 */

public class ServiceAvailabilityLine {
	@JsonProperty("lineReference")
	private LineReference lineReference = null;

	@JsonProperty("serviceLines")
	private List<ServiceLines> serviceLines = new ArrayList<>();

	public ServiceAvailabilityLine lineReference(LineReference lineReference) {
		this.lineReference = lineReference;
		return this;
	}

	/**
	 * Get lineReference
	 * 
	 * @return lineReference
	 **/
	public LineReference getLineReference() {
		return lineReference;
	}

	public void setLineReference(LineReference lineReference) {
		this.lineReference = lineReference;
	}

	public ServiceAvailabilityLine serviceLines(List<ServiceLines> serviceLines) {
		this.serviceLines = serviceLines;
		return this;
	}

	public ServiceAvailabilityLine addServiceLinesItem(ServiceLines serviceLinesItem) {
		this.serviceLines.add(serviceLinesItem);
		return this;
	}

	/**
	 * Get serviceLines
	 * 
	 * @return serviceLines
	 **/
	public List<ServiceLines> getServiceLines() {
		return serviceLines;
	}

	public void setServiceLines(List<ServiceLines> serviceLines) {
		this.serviceLines = serviceLines;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceAvailabilityLine serviceAvailabilityLine = (ServiceAvailabilityLine) o;
		return Objects.equals(this.lineReference, serviceAvailabilityLine.lineReference)
				&& Objects.equals(this.serviceLines, serviceAvailabilityLine.serviceLines);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineReference, serviceLines);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceAvailabilityLine {\n");

		sb.append("    lineReference: ").append(toIndentedString(lineReference)).append("\n");
		sb.append("    serviceLines: ").append(toIndentedString(serviceLines)).append("\n");
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
