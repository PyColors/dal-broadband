package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineSpeeds.
 */
public class LineSpeeds implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3990739801444955407L;
	
	/** The Constant MAXDOWNSPEED. */
	private static final String MAXDOWNSPEED = "maxDownSpeed";
	
	/** The Constant MINDOWNSPEED. */
	private static final String MINDOWNSPEED = "minDownSpeed";
	
	/** The Constant AVGDOWNSPEED. */
	private static final String AVGDOWNSPEED = "avgDownSpeed";
	
	/** The Constant MINGUARANTEEDDOWNSPEED. */
	private static final String MINGUARANTEEDDOWNSPEED = "minGuaranteedDownSpeed";
	
	/** The Constant MAXUPSPEED. */
	private static final String MAXUPSPEED = "maxUpSpeed";
	
	/** The Constant MINUPSPEED. */
	private static final String MINUPSPEED = "minUpSpeed";
	
	/** The Constant BANDWIDTHMEASURE. */
	private static final String BANDWIDTHMEASURE = "bandwidthMeasure";

	/** The max down speed. */
	@JsonProperty(MAXDOWNSPEED)
	private String maxDownSpeed;
	
	/** The min down speed. */
	@JsonProperty(MINDOWNSPEED)
	private String minDownSpeed;
	
	/** The avg down speed. */
	@JsonProperty(AVGDOWNSPEED)
	private String avgDownSpeed;
	
	/** The min guaranteed down speed. */
	@JsonProperty(MINGUARANTEEDDOWNSPEED)
	private String minGuaranteedDownSpeed;
	
	/** The max up speed. */
	@JsonProperty(MAXUPSPEED)
	private String maxUpSpeed;
	
	/** The min up speed. */
	@JsonProperty(MINUPSPEED)
	private String minUpSpeed;
	
	/** The bandwidth measure. */
	@JsonProperty(BANDWIDTHMEASURE)
	private String bandwidthMeasure;

	/**
	 * Gets the max down speed.
	 *
	 * @return the max down speed
	 */
	public String getMaxDownSpeed() {
		return maxDownSpeed;
	}

	/**
	 * Sets the max down speed.
	 *
	 * @param maxDownSpeed the new max down speed
	 */
	public void setMaxDownSpeed(String maxDownSpeed) {
		this.maxDownSpeed = maxDownSpeed;
	}

	/**
	 * Gets the min down speed.
	 *
	 * @return the min down speed
	 */
	public String getMinDownSpeed() {
		return minDownSpeed;
	}

	/**
	 * Sets the min down speed.
	 *
	 * @param minDownSpeed the new min down speed
	 */
	public void setMinDownSpeed(String minDownSpeed) {
		this.minDownSpeed = minDownSpeed;
	}

	/**
	 * Gets the avg down speed.
	 *
	 * @return the avg down speed
	 */
	public String getAvgDownSpeed() {
		return avgDownSpeed;
	}

	/**
	 * Sets the avg down speed.
	 *
	 * @param avgDownSpeed the new avg down speed
	 */
	public void setAvgDownSpeed(String avgDownSpeed) {
		this.avgDownSpeed = avgDownSpeed;
	}

	/**
	 * Gets the min guaranteed down speed.
	 *
	 * @return the min guaranteed down speed
	 */
	public String getMinGuaranteedDownSpeed() {
		return minGuaranteedDownSpeed;
	}

	/**
	 * Sets the min guaranteed down speed.
	 *
	 * @param minGuaranteedDownSpeed the new min guaranteed down speed
	 */
	public void setMinGuaranteedDownSpeed(String minGuaranteedDownSpeed) {
		this.minGuaranteedDownSpeed = minGuaranteedDownSpeed;
	}

	/**
	 * Gets the max up speed.
	 *
	 * @return the max up speed
	 */
	public String getMaxUpSpeed() {
		return maxUpSpeed;
	}

	/**
	 * Sets the max up speed.
	 *
	 * @param maxUpSpeed the new max up speed
	 */
	public void setMaxUpSpeed(String maxUpSpeed) {
		this.maxUpSpeed = maxUpSpeed;
	}

	/**
	 * Gets the min up speed.
	 *
	 * @return the min up speed
	 */
	public String getMinUpSpeed() {
		return minUpSpeed;
	}

	/**
	 * Sets the min up speed.
	 *
	 * @param minUpSpeed the new min up speed
	 */
	public void setMinUpSpeed(String minUpSpeed) {
		this.minUpSpeed = minUpSpeed;
	}

	/**
	 * Gets the bandwidth measure.
	 *
	 * @return the bandwidth measure
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avgDownSpeed == null) ? 0 : avgDownSpeed.hashCode());
		result = prime * result + ((bandwidthMeasure == null) ? 0 : bandwidthMeasure.hashCode());
		result = prime * result + ((maxDownSpeed == null) ? 0 : maxDownSpeed.hashCode());
		result = prime * result + ((maxUpSpeed == null) ? 0 : maxUpSpeed.hashCode());
		result = prime * result + ((minDownSpeed == null) ? 0 : minDownSpeed.hashCode());
		result = prime * result + ((minGuaranteedDownSpeed == null) ? 0 : minGuaranteedDownSpeed.hashCode());
		result = prime * result + ((minUpSpeed == null) ? 0 : minUpSpeed.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineSpeeds other = (LineSpeeds) obj;
		if (avgDownSpeed == null) {
			if (other.avgDownSpeed != null)
				return false;
		} else if (!avgDownSpeed.equals(other.avgDownSpeed))
			return false;
		if (bandwidthMeasure == null) {
			if (other.bandwidthMeasure != null)
				return false;
		} else if (!bandwidthMeasure.equals(other.bandwidthMeasure))
			return false;
		if (maxDownSpeed == null) {
			if (other.maxDownSpeed != null)
				return false;
		} else if (!maxDownSpeed.equals(other.maxDownSpeed))
			return false;
		if (maxUpSpeed == null) {
			if (other.maxUpSpeed != null)
				return false;
		} else if (!maxUpSpeed.equals(other.maxUpSpeed))
			return false;
		if (minDownSpeed == null) {
			if (other.minDownSpeed != null)
				return false;
		} else if (!minDownSpeed.equals(other.minDownSpeed))
			return false;
		if (minGuaranteedDownSpeed == null) {
			if (other.minGuaranteedDownSpeed != null)
				return false;
		} else if (!minGuaranteedDownSpeed.equals(other.minGuaranteedDownSpeed))
			return false;
		if (minUpSpeed == null) {
			if (other.minUpSpeed != null)
				return false;
		} else if (!minUpSpeed.equals(other.minUpSpeed))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineSpeeds [maxDownSpeed=" + maxDownSpeed + ", minDownSpeed=" + minDownSpeed + ", avgDownSpeed="
				+ avgDownSpeed + ", minGuaranteedDownSpeed=" + minGuaranteedDownSpeed + ", maxUpSpeed=" + maxUpSpeed
				+ ", minUpSpeed=" + minUpSpeed + ", bandwidthMeasure=" + bandwidthMeasure + "]";
	}

}
