package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LineSpeeds.
 */

public class LineSpeeds {
	
	/** The max down speed. */
	@JsonProperty("maxDownSpeed")
	private Double maxDownSpeed = null;

	/** The min down speed. */
	@JsonProperty("minDownSpeed")
	private Double minDownSpeed = null;

	/** The min guaranteed down speed. */
	@JsonProperty("minGuaranteedDownSpeed")
	private Double minGuaranteedDownSpeed = null;

	/** The max up speed. */
	@JsonProperty("maxUpSpeed")
	private Double maxUpSpeed = null;

	/** The min up speed. */
	@JsonProperty("minUpSpeed")
	private Double minUpSpeed = null;

	/** The avg down speed. */
	@JsonProperty("avgDownSpeed")
	private Double avgDownSpeed = null;

	/** The bandwidth measure. */
	@JsonProperty("bandwidthMeasure")
	private String bandwidthMeasure = null;

	/**
	 * Max down speed.
	 *
	 * @param maxDownSpeed the max down speed
	 * @return the line speeds
	 */
	public LineSpeeds maxDownSpeed(Double maxDownSpeed) {
		this.maxDownSpeed = maxDownSpeed;
		return this;
	}

	/**
	 * The maximum download speed offered in Kbps.
	 *
	 * @return maxDownSpeed
	 */
	public Double getMaxDownSpeed() {
		return maxDownSpeed;
	}

	/**
	 * Sets the max down speed.
	 *
	 * @param maxDownSpeed the new max down speed
	 */
	public void setMaxDownSpeed(Double maxDownSpeed) {
		this.maxDownSpeed = maxDownSpeed;
	}

	/**
	 * Min down speed.
	 *
	 * @param minDownSpeed the min down speed
	 * @return the line speeds
	 */
	public LineSpeeds minDownSpeed(Double minDownSpeed) {
		this.minDownSpeed = minDownSpeed;
		return this;
	}

	/**
	 * The minimum download speed offered in Kbps.
	 *
	 * @return minDownSpeed
	 */
	public Double getMinDownSpeed() {
		return minDownSpeed;
	}

	/**
	 * Sets the min down speed.
	 *
	 * @param minDownSpeed the new min down speed
	 */
	public void setMinDownSpeed(Double minDownSpeed) {
		this.minDownSpeed = minDownSpeed;
	}

	/**
	 * Min guaranteed down speed.
	 *
	 * @param minGuaranteedDownSpeed the min guaranteed down speed
	 * @return the line speeds
	 */
	public LineSpeeds minGuaranteedDownSpeed(Double minGuaranteedDownSpeed) {
		this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
		return this;
	}

	/**
	 * The minimum guaranteed download speed offered in Kbps.
	 *
	 * @return minGuaranteedDownSpeed
	 */
	public Double getMinGuaranteedDownSpeed() {
		return minGuaranteedDownSpeed;
	}

	/**
	 * Sets the min guaranteed down speed.
	 *
	 * @param minGuaranteedDownSpeed the new min guaranteed down speed
	 */
	public void setMinGuaranteedDownSpeed(Double minGuaranteedDownSpeed) {
		this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
	}

	/**
	 * Max up speed.
	 *
	 * @param maxUpSpeed the max up speed
	 * @return the line speeds
	 */
	public LineSpeeds maxUpSpeed(Double maxUpSpeed) {
		this.maxUpSpeed = maxUpSpeed;
		return this;
	}

	/**
	 * The maximum upload speed offered in Kbps.
	 *
	 * @return maxUpSpeed
	 */
	public Double getMaxUpSpeed() {
		return maxUpSpeed;
	}

	/**
	 * Sets the max up speed.
	 *
	 * @param maxUpSpeed the new max up speed
	 */
	public void setMaxUpSpeed(Double maxUpSpeed) {
		this.maxUpSpeed = maxUpSpeed;
	}

	/**
	 * Min up speed.
	 *
	 * @param minUpSpeed the min up speed
	 * @return the line speeds
	 */
	public LineSpeeds minUpSpeed(Double minUpSpeed) {
		this.minUpSpeed = minUpSpeed;
		return this;
	}

	/**
	 * The minimum upload speed offered in Kbps.
	 *
	 * @return minUpSpeed
	 */
	public Double getMinUpSpeed() {
		return minUpSpeed;
	}

	/**
	 * Sets the min up speed.
	 *
	 * @param minUpSpeed the new min up speed
	 */
	public void setMinUpSpeed(Double minUpSpeed) {
		this.minUpSpeed = minUpSpeed;
	}

	/**
	 * Avg down speed.
	 *
	 * @param avgDownSpeed the avg down speed
	 * @return the line speeds
	 */
	public LineSpeeds avgDownSpeed(Double avgDownSpeed) {
		this.avgDownSpeed = avgDownSpeed;
		return this;
	}

	/**
	 * The average download speed offered.
	 *
	 * @return avgDownSpeed
	 */
	public Double getAvgDownSpeed() {
		return avgDownSpeed;
	}

	/**
	 * Sets the avg down speed.
	 *
	 * @param avgDownSpeed the new avg down speed
	 */
	public void setAvgDownSpeed(Double avgDownSpeed) {
		this.avgDownSpeed = avgDownSpeed;
	}

	/**
	 * Bandwidth measure.
	 *
	 * @param bandwidthMeasure the bandwidth measure
	 * @return the line speeds
	 */
	public LineSpeeds bandwidthMeasure(String bandwidthMeasure) {
		this.bandwidthMeasure = bandwidthMeasure;
		return this;
	}

	/**
	 * Indicates whether the best speed is predicted or actual.
	 *
	 * @return bandwidthMeasure
	 */
	public String getBandwidthMeasure() {
		return bandwidthMeasure;
	}

	/**
	 * Sets the bandwidth measure.
	 *
	 * @param bandwidthMeasure the new bandwidth measure
	 */
	public void setBandwidthMeasure(String bandwidthMeasure) {
		this.bandwidthMeasure = bandwidthMeasure;
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
		LineSpeeds lineSpeeds = (LineSpeeds) o;
		return Objects.equals(this.maxDownSpeed, lineSpeeds.maxDownSpeed)
				&& Objects.equals(this.minDownSpeed, lineSpeeds.minDownSpeed)
				&& Objects.equals(this.minGuaranteedDownSpeed, lineSpeeds.minGuaranteedDownSpeed)
				&& Objects.equals(this.maxUpSpeed, lineSpeeds.maxUpSpeed)
				&& Objects.equals(this.minUpSpeed, lineSpeeds.minUpSpeed)
				&& Objects.equals(this.avgDownSpeed, lineSpeeds.avgDownSpeed)
				&& Objects.equals(this.bandwidthMeasure, lineSpeeds.bandwidthMeasure);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(maxDownSpeed, minDownSpeed, minGuaranteedDownSpeed, maxUpSpeed, minUpSpeed, avgDownSpeed,
				bandwidthMeasure);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineSpeeds {\n");

		sb.append("    maxDownSpeed: ").append(toIndentedString(maxDownSpeed)).append("\n");
		sb.append("    minDownSpeed: ").append(toIndentedString(minDownSpeed)).append("\n");
		sb.append("    minGuaranteedDownSpeed: ").append(toIndentedString(minGuaranteedDownSpeed)).append("\n");
		sb.append("    maxUpSpeed: ").append(toIndentedString(maxUpSpeed)).append("\n");
		sb.append("    minUpSpeed: ").append(toIndentedString(minUpSpeed)).append("\n");
		sb.append("    avgDownSpeed: ").append(toIndentedString(avgDownSpeed)).append("\n");
		sb.append("    bandwidthMeasure: ").append(toIndentedString(bandwidthMeasure)).append("\n");
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
