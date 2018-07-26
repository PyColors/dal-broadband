package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceLines.
 */

public class ServiceLines {
	
	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The network type. */
	@JsonProperty("networkType")
	private String networkType = null;

	/** The line treatment. */
	@JsonProperty("lineTreatment")
	private List<LineTreatment> lineTreatment = new ArrayList<>();

	/** The service line. */
	@JsonProperty("serviceLine")
	private List<ServiceLine> serviceLine = new ArrayList<>();

	/**
	 * Classification code.
	 *
	 * @param classificationCode the classification code
	 * @return the service lines
	 */
	public ServiceLines classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Technical Product Category: The category the technical product falls into.
	 *
	 * @return classificationCode
	 */
	public String getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Network type.
	 *
	 * @param networkType the network type
	 * @return the service lines
	 */
	public ServiceLines networkType(String networkType) {
		this.networkType = networkType;
		return this;
	}

	/**
	 * Denotes which network the offered service/ service bundle would be
	 * available.
	 *
	 * @return networkType
	 */
	public String getNetworkType() {
		return networkType;
	}

	/**
	 * Sets the network type.
	 *
	 * @param networkType the new network type
	 */
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	/**
	 * Line treatment.
	 *
	 * @param lineTreatment the line treatment
	 * @return the service lines
	 */
	public ServiceLines lineTreatment(List<LineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
		return this;
	}

	/**
	 * Adds the line treatment item.
	 *
	 * @param lineTreatmentItem the line treatment item
	 * @return the service lines
	 */
	public ServiceLines addLineTreatmentItem(LineTreatment lineTreatmentItem) {
		this.lineTreatment.add(lineTreatmentItem);
		return this;
	}

	/**
	 * Get lineTreatment.
	 *
	 * @return lineTreatment
	 */
	public List<LineTreatment> getLineTreatment() {
		return lineTreatment;
	}

	/**
	 * Sets the line treatment.
	 *
	 * @param lineTreatment the new line treatment
	 */
	public void setLineTreatment(List<LineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
	}

	/**
	 * Service line.
	 *
	 * @param serviceLine the service line
	 * @return the service lines
	 */
	public ServiceLines serviceLine(List<ServiceLine> serviceLine) {
		this.serviceLine = serviceLine;
		return this;
	}

	/**
	 * Adds the service line item.
	 *
	 * @param serviceLineItem the service line item
	 * @return the service lines
	 */
	public ServiceLines addServiceLineItem(ServiceLine serviceLineItem) {
		this.serviceLine.add(serviceLineItem);
		return this;
	}

	/**
	 * Get serviceLine.
	 *
	 * @return serviceLine
	 */
	public List<ServiceLine> getServiceLine() {
		return serviceLine;
	}

	/**
	 * Sets the service line.
	 *
	 * @param serviceLine the new service line
	 */
	public void setServiceLine(List<ServiceLine> serviceLine) {
		this.serviceLine = serviceLine;
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
		ServiceLines serviceLines = (ServiceLines) o;
		return Objects.equals(this.classificationCode, serviceLines.classificationCode)
				&& Objects.equals(this.networkType, serviceLines.networkType)
				&& Objects.equals(this.lineTreatment, serviceLines.lineTreatment)
				&& Objects.equals(this.serviceLine, serviceLines.serviceLine);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(classificationCode, networkType, lineTreatment, serviceLine);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceLines {\n");

		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
		sb.append("    lineTreatment: ").append(toIndentedString(lineTreatment)).append("\n");
		sb.append("    serviceLine: ").append(toIndentedString(serviceLine)).append("\n");
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
