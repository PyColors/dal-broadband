package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ServieLine.
 */
public class ServieLine implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6648662229394980645L;
	
	/** The Constant ITEMREFERENCE. */
	private static final String ITEMREFERENCE = "itemReference";
	
	/** The Constant LINESPEEDS. */
	private static final String LINESPEEDS = "lineSpeeds";
	
	/** The Constant SERVICELINETREATMENTLIST. */
	private static final String SERVICELINETREATMENTLIST = "serviceLineTreatmentList";
	
	/** The Constant MISCREFERNCE. */
	private static final String MISCREFERNCE = "miscRefernce";

	/** The item reference. */
	@JsonProperty(ITEMREFERENCE)
	private ItemReference itemReference;
	
	@JsonProperty("classificationCode")
	private String classificationCode;
	
	/** The line speeds. */
	@JsonProperty(LINESPEEDS)
	private LineSpeeds lineSpeeds;
	
	/** The service line treatment list. */
	@JsonProperty(SERVICELINETREATMENTLIST)
	private List<ServiceLineTreatment> serviceLineTreatmentList = new ArrayList<ServiceLineTreatment>();
	
	/** The misc refernce. */
	@JsonProperty(MISCREFERNCE)
	private MiscReference miscRefernce;

	/**
	 * Gets the item reference.
	 *
	 * @return the item reference
	 */
	public ItemReference getItemReference() {
		return itemReference;
	}

	/**
	 * Sets the item reference.
	 *
	 * @param itemReference the new item reference
	 */
	public void setItemReference(ItemReference itemReference) {
		this.itemReference = itemReference;
	}

	/**
	 * Gets the line speeds.
	 *
	 * @return the line speeds
	 */
	public LineSpeeds getLineSpeeds() {
		return lineSpeeds;
	}

	/**
	 * Sets the line speeds.
	 *
	 * @param lineSpeeds the new line speeds
	 */
	public void setLineSpeeds(LineSpeeds lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
	}

	/**
	 * Gets the service line treatment list.
	 *
	 * @return the service line treatment list
	 */
	public List<ServiceLineTreatment> getServiceLineTreatmentList() {
		return serviceLineTreatmentList;
	}

	/**
	 * Sets the service line treatment list.
	 *
	 * @param serviceLineTreatmentList the new service line treatment list
	 */
	public void setServiceLineTreatmentList(List<ServiceLineTreatment> serviceLineTreatmentList) {
		this.serviceLineTreatmentList = serviceLineTreatmentList;
	}

	/**
	 * Gets the misc refernce.
	 *
	 * @return the misc refernce
	 */
	public MiscReference getMiscRefernce() {
		return miscRefernce;
	}

	/**
	 * Sets the misc refernce.
	 *
	 * @param miscRefernce the new misc refernce
	 */
	public void setMiscRefernce(MiscReference miscRefernce) {
		this.miscRefernce = miscRefernce;
	}

	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemReference == null) ? 0 : itemReference.hashCode());
		result = prime * result + ((lineSpeeds == null) ? 0 : lineSpeeds.hashCode());
		result = prime * result + ((miscRefernce == null) ? 0 : miscRefernce.hashCode());
		result = prime * result + ((serviceLineTreatmentList == null) ? 0 : serviceLineTreatmentList.hashCode());
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
		ServieLine other = (ServieLine) obj;
		if (itemReference == null) {
			if (other.itemReference != null)
				return false;
		} else if (!itemReference.equals(other.itemReference))
			return false;
		if (lineSpeeds == null) {
			if (other.lineSpeeds != null)
				return false;
		} else if (!lineSpeeds.equals(other.lineSpeeds))
			return false;
		if (miscRefernce == null) {
			if (other.miscRefernce != null)
				return false;
		} else if (!miscRefernce.equals(other.miscRefernce))
			return false;
		if (serviceLineTreatmentList == null) {
			if (other.serviceLineTreatmentList != null)
				return false;
		} else if (!serviceLineTreatmentList.equals(other.serviceLineTreatmentList))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServieLine [itemReference=" + itemReference + ", lineSpeeds=" + lineSpeeds
				+ ", serviceLineTreatmentList=" + serviceLineTreatmentList + ", miscRefernce=" + miscRefernce + "]";
	}

}
