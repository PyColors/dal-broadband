package com.vf.uk.dal.broadband.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MiscellaneousAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-27T18:08:29.266Z")

public class MiscellaneousAttributes {
	@JsonProperty("speed")
	private String speed = null;

	@JsonProperty("MaxCapSpeed")
	private String maxCapSpeed = null;

	@JsonProperty("MinCapSpeed")
	private String minCapSpeed = null;

	/**
	 * @param speed
	 * @return
	 */
	public MiscellaneousAttributes speed(String speed) {
		this.speed = speed;
		return this;
	}

	/**
	 * Speed of the FLBB Plan
	 * 
	 * @return speed
	 **/

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	/**
	 * @param maxCapSpeed
	 * @return
	 */
	public MiscellaneousAttributes maxCapSpeed(String maxCapSpeed) {
		this.maxCapSpeed = maxCapSpeed;
		return this;
	}

	/**
	 * Max Speed of the FLBB Plan
	 * 
	 * @return maxCapSpeed
	 **/

	public String getMaxCapSpeed() {
		return maxCapSpeed;
	}

	public void setMaxCapSpeed(String maxCapSpeed) {
		this.maxCapSpeed = maxCapSpeed;
	}

	/**
	 * @param minCapSpeed
	 * @return
	 */
	public MiscellaneousAttributes minCapSpeed(String minCapSpeed) {
		this.minCapSpeed = minCapSpeed;
		return this;
	}

	/**
	 * Min Speed of the FLBB Plan
	 * 
	 * @return minCapSpeed
	 **/

	public String getMinCapSpeed() {
		return minCapSpeed;
	}

	public void setMinCapSpeed(String minCapSpeed) {
		this.minCapSpeed = minCapSpeed;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MiscellaneousAttributes miscellaneousAttributes = (MiscellaneousAttributes) o;
		return Objects.equals(this.speed, miscellaneousAttributes.speed)
				&& Objects.equals(this.maxCapSpeed, miscellaneousAttributes.maxCapSpeed)
				&& Objects.equals(this.minCapSpeed, miscellaneousAttributes.minCapSpeed);
	}

	@Override
	public int hashCode() {
		return Objects.hash(speed, maxCapSpeed, minCapSpeed);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MiscellaneousAttributes {\n");

		sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
		sb.append("    maxCapSpeed: ").append(toIndentedString(maxCapSpeed)).append("\n");
		sb.append("    minCapSpeed: ").append(toIndentedString(minCapSpeed)).append("\n");
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
