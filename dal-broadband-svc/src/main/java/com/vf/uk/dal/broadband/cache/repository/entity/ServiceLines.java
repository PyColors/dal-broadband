package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ServiceLines.
 */
public class ServiceLines implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3798948156147335358L;
	
	/** The Constant CLASSIFICATIONCODE. */
	private static final String CLASSIFICATION_CODE = "classificationCode";
	
	/** The Constant NETWORKTYPE. */
	private static final String NETWORK_TYPE = "networkType";
	
	/** The Constant LINETREATMENTLIST. */
	private static final String LINETREATMENT_LIST = "lineTreatmentList";
	
	/** The Constant SERVICELINELIST. */
	private static final String SERVICELINE_LIST = "serviceLineList";
	
	/** The classification code. */
	@JsonProperty(CLASSIFICATION_CODE)
	private String classificationCode;
	
	/** The network type. */
	@JsonProperty(NETWORK_TYPE)
	private String networkType;
	
	/** The line treatment list. */
	@JsonProperty(LINETREATMENT_LIST)
	private List<LineTreatment> lineTreatmentList = new ArrayList<>();
	
	/** The service line list. */
	@JsonProperty(SERVICELINE_LIST)
	private List<ServieLine> serviceLineList = new ArrayList<>();
	
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
	 * Gets the network type.
	 *
	 * @return the network type
	 */
	public String getNetworkType() {
		return networkType;
	}
	
	/**
	 * Sets the network type.
	 *
	 * @param networkType the new network type
	 */
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	
	/**
	 * Gets the line treatment list.
	 *
	 * @return the line treatment list
	 */
	public List<LineTreatment> getLineTreatmentList() {
		return lineTreatmentList;
	}
	
	/**
	 * Sets the line treatment list.
	 *
	 * @param lineTreatmentList the new line treatment list
	 */
	public void setLineTreatmentList(List<LineTreatment> lineTreatmentList) {
		this.lineTreatmentList = lineTreatmentList;
	}
	
	/**
	 * Gets the service line list.
	 *
	 * @return the service line list
	 */
	public List<ServieLine> getServiceLineList() {
		return serviceLineList;
	}
	
	/**
	 * Sets the service line list.
	 *
	 * @param serviceLineList the new service line list
	 */
	public void setServiceLineList(List<ServieLine> serviceLineList) {
		this.serviceLineList = serviceLineList;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificationCode == null) ? 0 : classificationCode.hashCode());
		result = prime * result + ((lineTreatmentList == null) ? 0 : lineTreatmentList.hashCode());
		result = prime * result + ((networkType == null) ? 0 : networkType.hashCode());
		result = prime * result + ((serviceLineList == null) ? 0 : serviceLineList.hashCode());
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
		ServiceLines other = (ServiceLines) obj;
		if (classificationCode == null) {
			if (other.classificationCode != null)
				return false;
		} else if (!classificationCode.equals(other.classificationCode))
			return false;
		if (lineTreatmentList == null) {
			if (other.lineTreatmentList != null)
				return false;
		} else if (!lineTreatmentList.equals(other.lineTreatmentList))
			return false;
		if (networkType == null) {
			if (other.networkType != null)
				return false;
		} else if (!networkType.equals(other.networkType))
			return false;
		if (serviceLineList == null) {
			if (other.serviceLineList != null)
				return false;
		} else if (!serviceLineList.equals(other.serviceLineList))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceLines [classificationCode=" + classificationCode + ", networkType=" + networkType
				+ ", lineTreatmentList=" + lineTreatmentList + ", serviceLineList=" + serviceLineList + "]";
	}
	
	
}
