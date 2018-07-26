package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncompatibleServices
 */

public class IncompatibleServices {
	@JsonProperty("service")
	private List<String> service = new ArrayList<>();

	public IncompatibleServices service(List<String> service) {
		this.service = service;
		return this;
	}

	public IncompatibleServices addServiceItem(String serviceItem) {
		this.service.add(serviceItem);
		return this;
	}

	/**
	 * Services that are incompatible with the current line.
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
		IncompatibleServices incompatibleServices = (IncompatibleServices) o;
		return Objects.equals(this.service, incompatibleServices.service);
	}

	@Override
	public int hashCode() {
		return Objects.hash(service);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IncompatibleServices {\n");

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
