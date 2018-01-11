package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineDirectory
 */

public class LineDirectory {
	@JsonProperty("featureCode")
	private String featureCode = null;

	@JsonProperty("directoryCode")
	private String directoryCode = null;

	@JsonProperty("locationCode")
	private String locationCode = null;

	public LineDirectory featureCode(String featureCode) {
		this.featureCode = featureCode;
		return this;
	}

	/**
	 * Indicates that the information presented in this set belongs to a
	 * specific Feature
	 * 
	 * @return featureCode
	 **/
	public String getFeatureCode() {
		return featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public LineDirectory directoryCode(String directoryCode) {
		this.directoryCode = directoryCode;
		return this;
	}

	/**
	 * Type of the directory entry
	 * 
	 * @return directoryCode
	 **/
	public String getDirectoryCode() {
		return directoryCode;
	}

	public void setDirectoryCode(String directoryCode) {
		this.directoryCode = directoryCode;
	}

	public LineDirectory locationCode(String locationCode) {
		this.locationCode = locationCode;
		return this;
	}

	/**
	 * Directory Location Option
	 * 
	 * @return locationCode
	 **/
	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineDirectory lineDirectory = (LineDirectory) o;
		return Objects.equals(this.featureCode, lineDirectory.featureCode)
				&& Objects.equals(this.directoryCode, lineDirectory.directoryCode)
				&& Objects.equals(this.locationCode, lineDirectory.locationCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(featureCode, directoryCode, locationCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineDirectory {\n");

		sb.append("    featureCode: ").append(toIndentedString(featureCode)).append("\n");
		sb.append("    directoryCode: ").append(toIndentedString(directoryCode)).append("\n");
		sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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
