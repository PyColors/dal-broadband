/*
 * Journey APIs
 * Journey APIs for Authenticated Journeys
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

/**
 * LineStatus.
 */
public class LineStatus {
	
	/** The status code. */
	private String statusCode = null;

	/** The access line status. */
	private String accessLineStatus = null;

	/** The gnp status. */
	private String gnpStatus = null;

	/** The line option. */
	private String lineOption = null;

	/** The technology. */
	private String technology = null;

	/** The line type. */
	private String lineType = null;

	/** The temp structure. */
	private String tempStructure = null;

	/** The standby power required. */
	private String standbyPowerRequired = null;

	/** The narrow band services available. */
	private String narrowBandServicesAvailable = null;

	/**
	 * Status code.
	 *
	 * @param statusCode the status code
	 * @return the line status
	 */
	public LineStatus statusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	/**
	 * Status of the line LOV - Working, Stopped.
	 *
	 * @return statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 *
	 * @param statusCode the new status code
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Access line status.
	 *
	 * @param accessLineStatus the access line status
	 * @return the line status
	 */
	public LineStatus accessLineStatus(String accessLineStatus) {
		this.accessLineStatus = accessLineStatus;
		return this;
	}

	/**
	 * Status of the line (Access Line) LOV - Working, Stopped.
	 *
	 * @return accessLineStatus
	 */
	public String getAccessLineStatus() {
		return accessLineStatus;
	}

	/**
	 * Sets the access line status.
	 *
	 * @param accessLineStatus the new access line status
	 */
	public void setAccessLineStatus(String accessLineStatus) {
		this.accessLineStatus = accessLineStatus;
	}

	/**
	 * Gnp status.
	 *
	 * @param gnpStatus the gnp status
	 * @return the line status
	 */
	public LineStatus gnpStatus(String gnpStatus) {
		this.gnpStatus = gnpStatus;
		return this;
	}

	/**
	 * The status of the Geographic Number Portability of the number.
	 *
	 * @return gNPStatus
	 */
	public String getGnpStatus() {
		return gnpStatus;
	}

	/**
	 * Sets the gnp status.
	 *
	 * @param gnpStatus the new gnp status
	 */
	public void setGnpStatus(String gnpStatus) {
		this.gnpStatus = gnpStatus;
	}

	/**
	 * Line option.
	 *
	 * @param lineOption the line option
	 * @return the line status
	 */
	public LineStatus lineOption(String lineOption) {
		this.lineOption = lineOption;
		return this;
	}

	/**
	 * Identifies whether existing line can be transferred or a new line is
	 * required LOV - New, Transfer.
	 *
	 * @return lineOption
	 */
	public String getLineOption() {
		return lineOption;
	}

	/**
	 * Sets the line option.
	 *
	 * @param lineOption the new line option
	 */
	public void setLineOption(String lineOption) {
		this.lineOption = lineOption;
	}

	/**
	 * Technology.
	 *
	 * @param technology the technology
	 * @return the line status
	 */
	public LineStatus technology(String technology) {
		this.technology = technology;
		return this;
	}

	/**
	 * Identifies a technology associated with the installation.
	 *
	 * @return technology
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * Sets the technology.
	 *
	 * @param technology the new technology
	 */
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	/**
	 * Line type.
	 *
	 * @param lineType the line type
	 * @return the line status
	 */
	public LineStatus lineType(String lineType) {
		this.lineType = lineType;
		return this;
	}

	/**
	 * Type of line that is already available LOV - MPF, SMPF, LLU SFI, LLU
	 * SFIM, NTEShiftMPF.
	 *
	 * @return lineType
	 */
	public String getLineType() {
		return lineType;
	}

	/**
	 * Sets the line type.
	 *
	 * @param lineType the new line type
	 */
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	/**
	 * Temp structure.
	 *
	 * @param tempStructure the temp structure
	 * @return the line status
	 */
	public LineStatus tempStructure(String tempStructure) {
		this.tempStructure = tempStructure;
		return this;
	}

	/**
	 * Is the line requested a temporary structure?.
	 *
	 * @return tempStructure
	 */
	public String getTempStructure() {
		return tempStructure;
	}

	/**
	 * Sets the temp structure.
	 *
	 * @param tempStructure the new temp structure
	 */
	public void setTempStructure(String tempStructure) {
		this.tempStructure = tempStructure;
	}

	/**
	 * Standby power required.
	 *
	 * @param standbyPowerRequired the standby power required
	 * @return the line status
	 */
	public LineStatus standbyPowerRequired(String standbyPowerRequired) {
		this.standbyPowerRequired = standbyPowerRequired;
		return this;
	}

	/**
	 * Is a standby power required for the line or not?.
	 *
	 * @return standbyPowerRequired
	 */
	public String getStandbyPowerRequired() {
		return standbyPowerRequired;
	}

	/**
	 * Sets the standby power required.
	 *
	 * @param standbyPowerRequired the new standby power required
	 */
	public void setStandbyPowerRequired(String standbyPowerRequired) {
		this.standbyPowerRequired = standbyPowerRequired;
	}

	/**
	 * Narrow band services available.
	 *
	 * @param narrowBandServicesAvailable the narrow band services available
	 * @return the line status
	 */
	public LineStatus narrowBandServicesAvailable(String narrowBandServicesAvailable) {
		this.narrowBandServicesAvailable = narrowBandServicesAvailable;
		return this;
	}

	/**
	 * An indicator that specifies whether any Narrow Band Services are
	 * available on the line or not.
	 *
	 * @return narrowBandServicesAvailable
	 */
	public String getNarrowBandServicesAvailable() {
		return narrowBandServicesAvailable;
	}

	/**
	 * Sets the narrow band services available.
	 *
	 * @param narrowBandServicesAvailable the new narrow band services available
	 */
	public void setNarrowBandServicesAvailable(String narrowBandServicesAvailable) {
		this.narrowBandServicesAvailable = narrowBandServicesAvailable;
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
		LineStatus lineStatus = (LineStatus) o;
		return Objects.equals(this.statusCode, lineStatus.statusCode)
				&& Objects.equals(this.accessLineStatus, lineStatus.accessLineStatus)
				&& Objects.equals(this.gnpStatus, lineStatus.gnpStatus)
				&& Objects.equals(this.lineOption, lineStatus.lineOption)
				&& Objects.equals(this.technology, lineStatus.technology)
				&& Objects.equals(this.lineType, lineStatus.lineType)
				&& Objects.equals(this.tempStructure, lineStatus.tempStructure)
				&& Objects.equals(this.standbyPowerRequired, lineStatus.standbyPowerRequired)
				&& Objects.equals(this.narrowBandServicesAvailable, lineStatus.narrowBandServicesAvailable);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(statusCode, accessLineStatus, gnpStatus, lineOption, technology, lineType, tempStructure,
				standbyPowerRequired, narrowBandServicesAvailable);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineStatus {\n");

		sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
		sb.append("    accessLineStatus: ").append(toIndentedString(accessLineStatus)).append("\n");
		sb.append("    gNPStatus: ").append(toIndentedString(gnpStatus)).append("\n");
		sb.append("    lineOption: ").append(toIndentedString(lineOption)).append("\n");
		sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
		sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
		sb.append("    tempStructure: ").append(toIndentedString(tempStructure)).append("\n");
		sb.append("    standbyPowerRequired: ").append(toIndentedString(standbyPowerRequired)).append("\n");
		sb.append("    narrowBandServicesAvailable: ").append(toIndentedString(narrowBandServicesAvailable))
				.append("\n");
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
