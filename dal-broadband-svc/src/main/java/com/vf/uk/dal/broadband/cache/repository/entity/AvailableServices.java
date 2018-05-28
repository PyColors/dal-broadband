package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AvailableServices.
 */
public class AvailableServices implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8786941003761030305L;

	/** The Constant SERVICE. */
	private static final String SERVICE = "service";

	/** The service. */
	@JsonProperty(SERVICE)
	private List<String> service = new ArrayList<String>();

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public List<String> getService() {
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(List<String> service) {
		this.service = service;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((service == null) ? 0 : service.hashCode());
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
		AvailableServices other = (AvailableServices) obj;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AvailableServices [service=" + service + "]";
	}

}
