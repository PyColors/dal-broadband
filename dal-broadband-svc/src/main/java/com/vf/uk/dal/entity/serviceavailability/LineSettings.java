package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineSettings
 */
public class LineSettings {
	@JsonProperty("serviceCode")
	private String serviceCode = null;

	@JsonProperty("installationCode")
	private String installationCode = null;

	@JsonProperty("terminationCode")
	private String terminationCode = null;

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

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

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

	public void setInstallationCode(String installationCode) {
		this.installationCode = installationCode;
	}

	public LineSettings terminationCode(String terminationCode) {
		this.terminationCode = terminationCode;
		return this;
	}

	/**
	 * The type of termination technology the line terminates in
	 * 
	 * @return terminationCode
	 **/
	public String getTerminationCode() {
		return terminationCode;
	}

	public void setTerminationCode(String terminationCode) {
		this.terminationCode = terminationCode;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(serviceCode, installationCode, terminationCode);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
