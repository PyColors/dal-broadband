package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineDirectory.
 */
public class LineDirectory implements Serializable{

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1780612777649837824L;
	
	/** The Constant FEATURECODE. */
	private static final String FEATURECODE = "featureCode";
	
	/** The Constant DIRECTORYCODE. */
	private static final String DIRECTORYCODE = "directoryCode";
	
	/** The Constant LOCALTIONCODE. */
	private static final String LOCALTIONCODE = "localtionCode";

	/** The feature code. */
	@JsonProperty(FEATURECODE)
	private String featureCode;
	
	/** The directory code. */
	@JsonProperty(DIRECTORYCODE)
	private String directoryCode;
	
	/** The localtion code. */
	@JsonProperty(LOCALTIONCODE)
	private String localtionCode;
	
	/**
	 * Gets the feature code.
	 *
	 * @return the feature code
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
	 * Gets the directory code.
	 *
	 * @return the directory code
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
	 * Gets the localtion code.
	 *
	 * @return the localtion code
	 */
	public String getLocaltionCode() {
		return localtionCode;
	}
	
	/**
	 * Sets the localtion code.
	 *
	 * @param localtionCode the new localtion code
	 */
	public void setLocaltionCode(String localtionCode) {
		this.localtionCode = localtionCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directoryCode == null) ? 0 : directoryCode.hashCode());
		result = prime * result + ((featureCode == null) ? 0 : featureCode.hashCode());
		result = prime * result + ((localtionCode == null) ? 0 : localtionCode.hashCode());
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
		LineDirectory other = (LineDirectory) obj;
		if (directoryCode == null) {
			if (other.directoryCode != null)
				return false;
		} else if (!directoryCode.equals(other.directoryCode))
			return false;
		if (featureCode == null) {
			if (other.featureCode != null)
				return false;
		} else if (!featureCode.equals(other.featureCode))
			return false;
		if (localtionCode == null) {
			if (other.localtionCode != null)
				return false;
		} else if (!localtionCode.equals(other.localtionCode))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineDirectory [featureCode=" + featureCode + ", directoryCode=" + directoryCode + ", localtionCode="
				+ localtionCode + "]";
	}
	
}
