package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailableServices
 */

public class AvailableServices {
	@JsonProperty("service")
	private List<String> service = new ArrayList<String>();

	public AvailableServices service(List<String> service) {
		this.service = service;
		return this;
	}

	public AvailableServices addServiceItem(String serviceItem) {
		this.service.add(serviceItem);
		return this;
	}

	/**
	 * An identifier defining the Broadband system’s services available at this
	 * exchange
	 * 
	 * @return service
	 **/
	public List<String> getService() {
		return service;
	}

	public void setService(List<String> service) {
		this.service = service;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(service);
	}

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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
