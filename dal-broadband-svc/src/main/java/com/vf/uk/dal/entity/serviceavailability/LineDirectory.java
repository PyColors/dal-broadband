package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineDirectory.
 */

public class LineDirectory {
	
	/** The feature code. */
	@JsonProperty("featureCode")
	private String featureCode = null;

	/** The directory code. */
	@JsonProperty("directoryCode")
	private String directoryCode = null;

	/** The location code. */
	@JsonProperty("locationCode")
	private String locationCode = null;

	/**
	 * Feature code.
	 *
	 * @param featureCode the feature code
	 * @return the line directory
	 */
	public LineDirectory featureCode(String featureCode) {
		this.featureCode = featureCode;
		return this;
	}

	/**
	 * Indicates that the information presented in this set belongs to a
	 * specific Feature.
	 *
	 * @return featureCode
	 */
	public String getFeatureCode() {
		return featureCode;
	}

	/**
	 * Sets the feature code.
	 *
	 * @param featureCode the new feature code
	 */
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	/**
	 * Directory code.
	 *
	 * @param directoryCode the directory code
	 * @return the line directory
	 */
	public LineDirectory directoryCode(String directoryCode) {
		this.directoryCode = directoryCode;
		return this;
	}

	/**
	 * Type of the directory entry.
	 *
	 * @return directoryCode
	 */
	public String getDirectoryCode() {
		return directoryCode;
	}

	/**
	 * Sets the directory code.
	 *
	 * @param directoryCode the new directory code
	 */
	public void setDirectoryCode(String directoryCode) {
		this.directoryCode = directoryCode;
	}

	/**
	 * Location code.
	 *
	 * @param locationCode the location code
	 * @return the line directory
	 */
	public LineDirectory locationCode(String locationCode) {
		this.locationCode = locationCode;
		return this;
	}

	/**
	 * Directory Location Option.
	 *
	 * @return locationCode
	 */
	public String getLocationCode() {
		return locationCode;
	}

	/**
	 * Sets the location code.
	 *
	 * @param locationCode the new location code
	 */
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
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
		LineDirectory lineDirectory = (LineDirectory) o;
		return Objects.equals(this.featureCode, lineDirectory.featureCode)
				&& Objects.equals(this.directoryCode, lineDirectory.directoryCode)
				&& Objects.equals(this.locationCode, lineDirectory.locationCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(featureCode, directoryCode, locationCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
