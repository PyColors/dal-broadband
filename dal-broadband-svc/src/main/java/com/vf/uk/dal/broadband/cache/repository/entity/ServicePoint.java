package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ServicePoint.
 */
public class ServicePoint implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1543418061981155540L;

	/** The Constant LINEREFERNCE. */
	private static final String LINE_REFERENCE = "lineReference";

	/** The Constant SERVICEREFERENCE. */
	private static final String SERVICE_REFERENCE = "serviceReference";

	/** The line refernce. */
	@JsonProperty(LINE_REFERENCE)
	private LineReference lineReference;

	public LineReference getLineReference() {
		return lineReference;
	}

	public void setLineReference(LineReference lineReference) {
		this.lineReference = lineReference;
	}

	/** The service reference. */
	@JsonProperty(SERVICE_REFERENCE)
	private ServiceReference serviceReference;

	

	/**
	 * Gets the service reference.
	 *
	 * @return the service reference
	 */
	public ServiceReference getServiceReference() {
		return serviceReference;
	}

	/**
	 * Sets the service reference.
	 *
	 * @param serviceReference
	 *            the new service reference
	 */
	public void setServiceReference(ServiceReference serviceReference) {
		this.serviceReference = serviceReference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineReference == null) ? 0 : lineReference.hashCode());
		result = prime * result + ((serviceReference == null) ? 0 : serviceReference.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		ServicePoint other = (ServicePoint) obj;
		if (lineReference == null) {
			if (other.lineReference != null)
				return false;
		} else if (!lineReference.equals(other.lineReference))
			return false;
		if (serviceReference == null) {
			if (other.serviceReference != null)
				return false;
		} else if (!serviceReference.equals(other.serviceReference))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServicePoint [lineRefernce=" + lineReference + ", serviceReference=" + serviceReference + "]";
	}

}
