package com.vf.uk.dal.broadband.cache.repository.entity;

import java.util.Objects;

/**
 * LineDetailsRequest
 */

public class LineDetailsRequest {
	private String lineTreatmentType = null;

	private String flbbNumber = null;

	private String classificationCode = null;

	private String earliestAvailableDate = null;

	public LineDetailsRequest lineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * Send the selected line treatement type selected by the user. Ideal value
	 * sent by GSA is NEW OR EXISTING, however it sends the same sent by GSA
	 * 
	 * @return lineTreatmentType
	 **/

	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	public LineDetailsRequest flbbNumber(String flbbNumber) {
		this.flbbNumber = flbbNumber;
		return this;
	}

	/**
	 * Update the journey with the FLBB phone number sent by the FE added by the
	 * user
	 * 
	 * @return flbbNumber
	 **/

	public String getFlbbNumber() {
		return flbbNumber;
	}

	public void setFlbbNumber(String flbbNumber) {
		this.flbbNumber = flbbNumber;
	}

	public LineDetailsRequest classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Update the journey with the selected package classification code which is
	 * sent as part of the FLBB package response
	 * 
	 * @return classificationCode
	 **/

	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public LineDetailsRequest earliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
		return this;
	}

	/**
	 * The earliest available date for the selected line type recieved by the
	 * GSA can be updated in journey
	 * 
	 * @return earliestAvailableDate
	 **/

	public String getEarliestAvailableDate() {
		return earliestAvailableDate;
	}

	public void setEarliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineDetailsRequest lineDetailsRequest = (LineDetailsRequest) o;
		return Objects.equals(this.lineTreatmentType, lineDetailsRequest.lineTreatmentType)
				&& Objects.equals(this.flbbNumber, lineDetailsRequest.flbbNumber)
				&& Objects.equals(this.classificationCode, lineDetailsRequest.classificationCode)
				&& Objects.equals(this.earliestAvailableDate, lineDetailsRequest.earliestAvailableDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineTreatmentType, flbbNumber, classificationCode, earliestAvailableDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineDetailsRequest {\n");

		sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
		sb.append("    flbbNumber: ").append(toIndentedString(flbbNumber)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    earliestAvailableDate: ").append(toIndentedString(earliestAvailableDate)).append("\n");
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
