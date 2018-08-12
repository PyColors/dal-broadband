package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceAvailabilityLine.
 */

public class ServiceAvailabilityLine {
	
	/** The line reference. */
	@JsonProperty("lineReference")
	private LineReference lineReference = null;

	/** The service lines. */
	@JsonProperty("serviceLines")
	private List<ServiceLines> serviceLines = new ArrayList<>();

	/**
	 * Line reference.
	 *
	 * @param lineReference the line reference
	 * @return the service availability line
	 */
	public ServiceAvailabilityLine lineReference(LineReference lineReference) {
		this.lineReference = lineReference;
		return this;
	}

	/**
	 * Get lineReference.
	 *
	 * @return lineReference
	 */
	public LineReference getLineReference() {
		return lineReference;
	}

	/**
	 * Sets the line reference.
	 *
	 * @param lineReference the new line reference
	 */
	public void setLineReference(LineReference lineReference) {
		this.lineReference = lineReference;
	}

	/**
	 * Service lines.
	 *
	 * @param serviceLines the service lines
	 * @return the service availability line
	 */
	public ServiceAvailabilityLine serviceLines(List<ServiceLines> serviceLines) {
		this.serviceLines = serviceLines;
		return this;
	}

	/**
	 * Adds the service lines item.
	 *
	 * @param serviceLinesItem the service lines item
	 * @return the service availability line
	 */
	public ServiceAvailabilityLine addServiceLinesItem(ServiceLines serviceLinesItem) {
		this.serviceLines.add(serviceLinesItem);
		return this;
	}

	/**
	 * Get serviceLines.
	 *
	 * @return serviceLines
	 */
	public List<ServiceLines> getServiceLines() {
		return serviceLines;
	}

	/**
	 * Sets the service lines.
	 *
	 * @param serviceLines the new service lines
	 */
	public void setServiceLines(List<ServiceLines> serviceLines) {
		this.serviceLines = serviceLines;
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
		ServiceAvailabilityLine serviceAvailabilityLine = (ServiceAvailabilityLine) o;
		return Objects.equals(this.lineReference, serviceAvailabilityLine.lineReference)
				&& Objects.equals(this.serviceLines, serviceAvailabilityLine.serviceLines);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(lineReference, serviceLines);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
