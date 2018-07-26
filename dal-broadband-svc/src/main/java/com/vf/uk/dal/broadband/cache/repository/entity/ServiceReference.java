package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ServiceReference.
 */
public class ServiceReference implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 282132187520321378L;
	
	/** The Constant SERVICELINELIST. */
	private static final String SERVICELINELIST = "serviceLinesList";

	/** The service lines list. */
	@JsonProperty(SERVICELINELIST)
	private List<ServiceLines> serviceLinesList = new ArrayList<>();

	/**
	 * Gets the service lines list.
	 *
	 * @return the service lines list
	 */
	public List<ServiceLines> getServiceLinesList() {
		return serviceLinesList;
	}

	/**
	 * Sets the service lines list.
	 *
	 * @param serviceLinesList the new service lines list
	 */
	public void setServiceLinesList(List<ServiceLines> serviceLinesList) {
		this.serviceLinesList = serviceLinesList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serviceLinesList == null) ? 0 : serviceLinesList.hashCode());
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
		ServiceReference other = (ServiceReference) obj;
		if (serviceLinesList == null) {
			if (other.serviceLinesList != null)
				return false;
		} else if (!serviceLinesList.equals(other.serviceLinesList))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceReference [serviceLinesList=" + serviceLinesList + "]";
	}

}
