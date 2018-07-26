package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineStatus.
 */
public class LineStatus {
	
	/** The status code. */
	@JsonProperty("statusCode")
	private String statusCode = null;

	/** The access line status. */
	@JsonProperty("accessLineStatus")
	private String accessLineStatus = null;

	/** The gn P status. */
	@JsonProperty("GNPStatus")
	private String gnPStatus = null;

	/** The line option. */
	@JsonProperty("lineOption")
	private String lineOption = null;

	/** The technology. */
	@JsonProperty("technology")
	private String technology = null;

	/** The line type. */
	@JsonProperty("lineType")
	private String lineType = null;

	/** The temp structure. */
	@JsonProperty("tempStructure")
	private Boolean tempStructure = null;

	/** The standby power required. */
	@JsonProperty("standbyPowerRequired")
	private Boolean standbyPowerRequired = null;

	/** The narrow band services available. */
	@JsonProperty("narrowBandServicesAvailable")
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
	 * Status of the line.
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
	 * Status of the line (Access Line).
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
	 * Gn P status.
	 *
	 * @param gnPStatus the gn P status
	 * @return the line status
	 */
	public LineStatus gnPStatus(String gnPStatus) {
		this.gnPStatus = gnPStatus;
		return this;
	}

	/**
	 * The status of the Geographic Number Portability of the number.
	 *
	 * @return gnPStatus
	 */
	public String getGnPStatus() {
		return gnPStatus;
	}

	/**
	 * Sets the gn P status.
	 *
	 * @param gnPStatus the new gn P status
	 */
	public void setGnPStatus(String gnPStatus) {
		this.gnPStatus = gnPStatus;
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
	 * required.
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
	 * Type of line that is already available.
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
	public LineStatus tempStructure(Boolean tempStructure) {
		this.tempStructure = tempStructure;
		return this;
	}

	/**
	 * Is the line requested a temporary structure?.
	 *
	 * @return tempStructure
	 */
	public Boolean getTempStructure() {
		return tempStructure;
	}

	/**
	 * Sets the temp structure.
	 *
	 * @param tempStructure the new temp structure
	 */
	public void setTempStructure(Boolean tempStructure) {
		this.tempStructure = tempStructure;
	}

	/**
	 * Standby power required.
	 *
	 * @param standbyPowerRequired the standby power required
	 * @return the line status
	 */
	public LineStatus standbyPowerRequired(Boolean standbyPowerRequired) {
		this.standbyPowerRequired = standbyPowerRequired;
		return this;
	}

	/**
	 * Is a standby power required for the line or not?.
	 *
	 * @return standbyPowerRequired
	 */
	public Boolean getStandbyPowerRequired() {
		return standbyPowerRequired;
	}

	/**
	 * Sets the standby power required.
	 *
	 * @param standbyPowerRequired the new standby power required
	 */
	public void setStandbyPowerRequired(Boolean standbyPowerRequired) {
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
				&& Objects.equals(this.gnPStatus, lineStatus.gnPStatus)
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
		return Objects.hash(statusCode, accessLineStatus, gnPStatus, lineOption, technology, lineType, tempStructure,
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
		sb.append("    gnPStatus: ").append(toIndentedString(gnPStatus)).append("\n");
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
