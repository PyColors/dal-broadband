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
 * LineSettings.
 */
public class LineSettings {
	
	/** The service code. */
	private String serviceCode = null;

	/** The installation code. */
	private String installationCode = null;

	/** The termination code. */
	private String terminationCode = null;

	/**
	 * Service code.
	 *
	 * @param serviceCode the service code
	 * @return the line settings
	 */
	public LineSettings serviceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		return this;
	}

	/**
	 * The type of service this is. LOV - PSTN_SINGLE_LINE, PSTN_MULTI_LINE_AUX
	 * 
	 * @return serviceCode
	 **/
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * Sets the service code.
	 *
	 * @param serviceCode the new service code
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	/**
	 * Installation code.
	 *
	 * @param installationCode the installation code
	 * @return the line settings
	 */
	public LineSettings installationCode(String installationCode) {
		this.installationCode = installationCode;
		return this;
	}

	/**
	 * The type of installation. LOV - STANDARD, NSP, SITE, COMPLEX,
	 * COMPLEX_HOTSITE, COMPLEX_SHIP, COMPLEX_SITE, STANDARD_NEWHOUSE
	 * 
	 * @return installationCode
	 **/
	public String getInstallationCode() {
		return installationCode;
	}

	/**
	 * Sets the installation code.
	 *
	 * @param installationCode the new installation code
	 */
	public void setInstallationCode(String installationCode) {
		this.installationCode = installationCode;
	}

	/**
	 * Termination code.
	 *
	 * @param terminationCode the termination code
	 * @return the line settings
	 */
	public LineSettings terminationCode(String terminationCode) {
		this.terminationCode = terminationCode;
		return this;
	}

	/**
	 * The type of termination technology the line terminates in LOV - NTTP,
	 * LINE_BOX, NTE, SECURE_NTE, TYPE_NINE.
	 *
	 * @return terminationCode
	 */
	public String getTerminationCode() {
		return terminationCode;
	}

	/**
	 * Sets the termination code.
	 *
	 * @param terminationCode the new termination code
	 */
	public void setTerminationCode(String terminationCode) {
		this.terminationCode = terminationCode;
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
		LineSettings lineSettings = (LineSettings) o;
		return Objects.equals(this.serviceCode, lineSettings.serviceCode)
				&& Objects.equals(this.installationCode, lineSettings.installationCode)
				&& Objects.equals(this.terminationCode, lineSettings.terminationCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(serviceCode, installationCode, terminationCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineSettings {\n");

		sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
		sb.append("    installationCode: ").append(toIndentedString(installationCode)).append("\n");
		sb.append("    terminationCode: ").append(toIndentedString(terminationCode)).append("\n");
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
