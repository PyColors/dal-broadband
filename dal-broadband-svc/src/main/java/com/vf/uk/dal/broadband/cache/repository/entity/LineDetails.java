package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class LineDetails.
 */
public class LineDetails implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2196503233118622640L;
	
	/** The Constant LINETREATMENTTYPE. */
	private static final String LINETREATMENTTYPE = "lineTreatmentType";
	
	/** The Constant FLBBNUMBER. */
	private static final String FLBBNUMBER = "flbbNumber";
	
	/** The Constant CLASSIFICATIONCODE. */
	private static final String CLASSIFICATIONCODE = "classificationCode";
	
	/** The Constant EARLIESTAVAILABLEDATE. */
	private static final String EARLIESTAVAILABLEDATE = "earliestAvailableDate";

	/** The line treatment type. */
	@JsonProperty(LINETREATMENTTYPE)
	private String lineTreatmentType;
	
	/** The flbb number. */
	@JsonProperty(FLBBNUMBER)
	private String flbbNumber;
	
	/** The classification code. */
	@JsonProperty(CLASSIFICATIONCODE)
	private String classificationCode;
	
	/** The earliest available date. */
	@JsonProperty(EARLIESTAVAILABLEDATE)
	private String earliestAvailableDate;

	/**
	 * Gets the line treatment type.
	 *
	 * @return the line treatment type
	 */
	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	/**
	 * Sets the line treatment type.
	 *
	 * @param lineTreatmentType the new line treatment type
	 */
	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	/**
	 * Gets the flbb number.
	 *
	 * @return the flbb number
	 */
	public String getFlbbNumber() {
		return flbbNumber;
	}

	/**
	 * Sets the flbb number.
	 *
	 * @param flbbNumber the new flbb number
	 */
	public void setFlbbNumber(String flbbNumber) {
		this.flbbNumber = flbbNumber;
	}

	/**
	 * Gets the classification code.
	 *
	 * @return the classification code
	 */
	public String getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Gets the earliest available date.
	 *
	 * @return the earliest available date
	 */
	public String getEarliestAvailableDate() {
		return earliestAvailableDate;
	}

	/**
	 * Sets the earliest available date.
	 *
	 * @param earliestAvailableDate the new earliest available date
	 */
	public void setEarliestAvailableDate(String earliestAvailableDate) {
		this.earliestAvailableDate = earliestAvailableDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificationCode == null) ? 0 : classificationCode.hashCode());
		result = prime * result + ((earliestAvailableDate == null) ? 0 : earliestAvailableDate.hashCode());
		result = prime * result + ((flbbNumber == null) ? 0 : flbbNumber.hashCode());
		result = prime * result + ((lineTreatmentType == null) ? 0 : lineTreatmentType.hashCode());
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
		LineDetails other = (LineDetails) obj;
		if (classificationCode == null) {
			if (other.classificationCode != null)
				return false;
		} else if (!classificationCode.equals(other.classificationCode))
			return false;
		if (earliestAvailableDate == null) {
			if (other.earliestAvailableDate != null)
				return false;
		} else if (!earliestAvailableDate.equals(other.earliestAvailableDate))
			return false;
		if (flbbNumber == null) {
			if (other.flbbNumber != null)
				return false;
		} else if (!flbbNumber.equals(other.flbbNumber))
			return false;
		if (lineTreatmentType == null) {
			if (other.lineTreatmentType != null)
				return false;
		} else if (!lineTreatmentType.equals(other.lineTreatmentType))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LineDetails [lineTreatmentType=" + lineTreatmentType + ", flbbNumber=" + flbbNumber
				+ ", classificationCode=" + classificationCode + ", earliestAvailableDate=" + earliestAvailableDate
				+ "]";
	}

}
