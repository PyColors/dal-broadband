/*
 * Journey APIs
 * Journey APIs for Authenticated Journeys
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vf.uk.dal.broadband.journey.entity;

import java.util.Objects;

/**
 * ServicePoint
 */
public class ServicePoint {
	private LineReference lineRefernece = null;

	private ServiceReference serviceReference = null;

	public ServicePoint lineRefernece(LineReference lineRefernece) {
		this.lineRefernece = lineRefernece;
		return this;
	}

	/**
	 * Get lineRefernece
	 * 
	 * @return lineRefernece
	 **/
	public LineReference getLineRefernece() {
		return lineRefernece;
	}

	public void setLineRefernece(LineReference lineRefernece) {
		this.lineRefernece = lineRefernece;
	}

	public ServicePoint serviceReference(ServiceReference serviceReference) {
		this.serviceReference = serviceReference;
		return this;
	}

	/**
	 * Get serviceReference
	 * 
	 * @return serviceReference
	 **/
	public ServiceReference getServiceReference() {
		return serviceReference;
	}

	public void setServiceReference(ServiceReference serviceReference) {
		this.serviceReference = serviceReference;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServicePoint servicePoint = (ServicePoint) o;
		return Objects.equals(this.lineRefernece, servicePoint.lineRefernece)
				&& Objects.equals(this.serviceReference, servicePoint.serviceReference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineRefernece, serviceReference);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServicePoint {\n");

		sb.append("    lineRefernece: ").append(toIndentedString(lineRefernece)).append("\n");
		sb.append("    serviceReference: ").append(toIndentedString(serviceReference)).append("\n");
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
