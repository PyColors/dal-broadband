package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceLines
 */

public class ServiceLines {
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("networkType")
	private String networkType = null;

	@JsonProperty("lineTreatment")
	private List<LineTreatment> lineTreatment = new ArrayList<>();

	@JsonProperty("serviceLine")
	private List<ServiceLine> serviceLine = new ArrayList<>();

	public ServiceLines classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Technical Product Category: The category the technical product falls into
	 * 
	 * @return classificationCode
	 **/
	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public ServiceLines networkType(String networkType) {
		this.networkType = networkType;
		return this;
	}

	/**
	 * Denotes which network the offered service/ service bundle would be
	 * available
	 * 
	 * @return networkType
	 **/
	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public ServiceLines lineTreatment(List<LineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
		return this;
	}

	public ServiceLines addLineTreatmentItem(LineTreatment lineTreatmentItem) {
		this.lineTreatment.add(lineTreatmentItem);
		return this;
	}

	/**
	 * Get lineTreatment
	 * 
	 * @return lineTreatment
	 **/
	public List<LineTreatment> getLineTreatment() {
		return lineTreatment;
	}

	public void setLineTreatment(List<LineTreatment> lineTreatment) {
		this.lineTreatment = lineTreatment;
	}

	public ServiceLines serviceLine(List<ServiceLine> serviceLine) {
		this.serviceLine = serviceLine;
		return this;
	}

	public ServiceLines addServiceLineItem(ServiceLine serviceLineItem) {
		this.serviceLine.add(serviceLineItem);
		return this;
	}

	/**
	 * Get serviceLine
	 * 
	 * @return serviceLine
	 **/
	public List<ServiceLine> getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(List<ServiceLine> serviceLine) {
		this.serviceLine = serviceLine;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(classificationCode, networkType, lineTreatment, serviceLine);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
