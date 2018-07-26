package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineSettings.
 */
public class LineSettings {
	
	/** The service code. */
	@JsonProperty("serviceCode")
	private String serviceCode = null;

	/** The installation code. */
	@JsonProperty("installationCode")
	private String installationCode = null;

	/** The termination code. */
	@JsonProperty("terminationCode")
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
	 * The type of service this is.
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
	 * The type of installation.
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
	 * The type of termination technology the line terminates in.
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
