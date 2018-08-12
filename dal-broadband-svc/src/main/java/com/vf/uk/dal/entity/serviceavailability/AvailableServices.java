package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailableServices.
 */

public class AvailableServices {
	
	/** The service. */
	@JsonProperty("service")
	private List<String> service = new ArrayList<>();

	/**
	 * Service.
	 *
	 * @param service the service
	 * @return the available services
	 */
	public AvailableServices service(List<String> service) {
		this.service = service;
		return this;
	}

	/**
	 * Adds the service item.
	 *
	 * @param serviceItem the service item
	 * @return the available services
	 */
	public AvailableServices addServiceItem(String serviceItem) {
		this.service.add(serviceItem);
		return this;
	}

	/**
	 * An identifier defining the Broadband system’s services available at this
	 * exchange.
	 *
	 * @return service
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
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AvailableServices availableServices = (AvailableServices) o;
		return Objects.equals(this.service, availableServices.service);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(service);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvailableServices {\n");

		sb.append("    service: ").append(toIndentedString(service)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
