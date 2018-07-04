package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineSpeeds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")

public class LineSpeeds {

	@JsonProperty("packageName")
	private String packageName = null;

	@JsonProperty("maxDownSpeed")
	private Double maxDownSpeed = null;

	@JsonProperty("minDownSpeed")
	private Double minDownSpeed = null;

	@JsonProperty("avgDownSpeed")
	private Double avgDownSpeed = null;

	@JsonProperty("minGuaranteedDownSpeed")
	private Double minGuaranteedDownSpeed = null;

	@JsonProperty("maxUpSpeed")
	private Double maxUpSpeed = null;

	@JsonProperty("minUpSpeed")
	private Double minUpSpeed = null;

	@JsonProperty("bandwidthMeasure")
	private String bandwidthMeasure = null;

	/**
	 * 
	 * @param maxDownSpeed
	 * @return
	 */
	public LineSpeeds maxDownSpeed(Double maxDownSpeed) {
		this.maxDownSpeed = maxDownSpeed;
		return this;
	}

	/**
	 * The maximum download speed offered (in kilobits per second [kbps])
	 * 
	 * @return maxDownSpeed
	 **/
	@ApiModelProperty(value = "The maximum download speed offered (in kilobits per second [kbps])")

	public Double getMaxDownSpeed() {
		return maxDownSpeed;
	}

	public void setMaxDownSpeed(Double maxDownSpeed) {
		this.maxDownSpeed = maxDownSpeed;
	}

	/**
	 * 
	 * @param minDownSpeed
	 * @return
	 */
	public LineSpeeds minDownSpeed(Double minDownSpeed) {
		this.minDownSpeed = minDownSpeed;
		return this;
	}

	/**
	 * The minimum download speed offered (in kilobits per second [kbps])
	 * 
	 * @return minDownSpeed
	 **/
	@ApiModelProperty(value = "The minimum download speed offered (in kilobits per second [kbps])")

	public Double getMinDownSpeed() {
		return minDownSpeed;
	}

	public void setMinDownSpeed(Double minDownSpeed) {
		this.minDownSpeed = minDownSpeed;
	}

	/**
	 * 
	 * @param avgDownSpeed
	 * @return
	 */
	public LineSpeeds avgDownSpeed(Double avgDownSpeed) {
		this.avgDownSpeed = avgDownSpeed;
		return this;
	}

	/**
	 * The average download speed offered (in kilobits per second [kbps])
	 * 
	 * @return avgDownSpeed
	 **/
	@ApiModelProperty(value = "The average download speed offered (in kilobits per second [kbps])")

	public Double getAvgDownSpeed() {
		return avgDownSpeed;
	}

	public void setAvgDownSpeed(Double avgDownSpeed) {
		this.avgDownSpeed = avgDownSpeed;
	}

	/**
	 * 
	 * @param minGuaranteedDownSpeed
	 * @return
	 */
	public LineSpeeds minGuaranteedDownSpeed(Double minGuaranteedDownSpeed) {
		this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
		return this;
	}

	/**
	 * The minimum guaranteed download speed offered (in kilobits per second
	 * [kbps])
	 * 
	 * @return minGuaranteedDownSpeed
	 **/
	@ApiModelProperty(value = "The minimum guaranteed download speed offered (in kilobits per second [kbps])")

	public Double getMinGuaranteedDownSpeed() {
		return minGuaranteedDownSpeed;
	}

	public void setMinGuaranteedDownSpeed(Double minGuaranteedDownSpeed) {
		this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
	}

	/**
	 * 
	 * @param maxUpSpeed
	 * @return
	 */
	public LineSpeeds maxUpSpeed(Double maxUpSpeed) {
		this.maxUpSpeed = maxUpSpeed;
		return this;
	}

	/**
	 * The max upload speed offered (in kilobits per second [kbps])
	 * 
	 * @return maxUpSpeed
	 **/
	@ApiModelProperty(value = "The max  upload speed offered (in kilobits per second [kbps])")

	public Double getMaxUpSpeed() {
		return maxUpSpeed;
	}

	public void setMaxUpSpeed(Double maxUpSpeed) {
		this.maxUpSpeed = maxUpSpeed;
	}

	/**
	 * @param minUpSpeed
	 * @return
	 */
	public LineSpeeds minUpSpeed(Double minUpSpeed) {
		this.minUpSpeed = minUpSpeed;
		return this;
	}

	/**
	 * The min upload speed offered (in kilobits per second [kbps])
	 * 
	 * @return minUpSpeed
	 **/
	@ApiModelProperty(value = "The min upload speed offered (in kilobits per second [kbps])")

	public Double getMinUpSpeed() {
		return minUpSpeed;
	}

	public void setMinUpSpeed(Double minUpSpeed) {
		this.minUpSpeed = minUpSpeed;
	}

	/**
	 * @param bandwidthMeasure
	 * @return
	 */
	public LineSpeeds bandwidthMeasure(String bandwidthMeasure) {
		this.bandwidthMeasure = bandwidthMeasure;
		return this;
	}

	/**
	 * Indicates whether the best speed is predicted or actual
	 * 
	 * @return bandwidthMeasure
	 **/
	@ApiModelProperty(value = "Indicates whether the best speed is predicted or actual")

	public String getBandwidthMeasure() {
		return bandwidthMeasure;
	}

	public void setBandwidthMeasure(String bandwidthMeasure) {
		this.bandwidthMeasure = bandwidthMeasure;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

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
				&& Objects.equals(this.avgDownSpeed, lineSpeeds.avgDownSpeed)
				&& Objects.equals(this.minGuaranteedDownSpeed, lineSpeeds.minGuaranteedDownSpeed)
				&& Objects.equals(this.maxUpSpeed, lineSpeeds.maxUpSpeed)
				&& Objects.equals(this.minUpSpeed, lineSpeeds.minUpSpeed)
				&& Objects.equals(this.bandwidthMeasure, lineSpeeds.bandwidthMeasure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maxDownSpeed, minDownSpeed, avgDownSpeed, minGuaranteedDownSpeed, maxUpSpeed, minUpSpeed,
				bandwidthMeasure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineSpeeds {\n");

		sb.append("    maxDownSpeed: ").append(toIndentedString(maxDownSpeed)).append("\n");
		sb.append("    minDownSpeed: ").append(toIndentedString(minDownSpeed)).append("\n");
		sb.append("    avgDownSpeed: ").append(toIndentedString(avgDownSpeed)).append("\n");
		sb.append("    minGuaranteedDownSpeed: ").append(toIndentedString(minGuaranteedDownSpeed)).append("\n");
		sb.append("    maxUpSpeed: ").append(toIndentedString(maxUpSpeed)).append("\n");
		sb.append("    minUpSpeed: ").append(toIndentedString(minUpSpeed)).append("\n");
		sb.append("    bandwidthMeasure: ").append(toIndentedString(bandwidthMeasure)).append("\n");
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
