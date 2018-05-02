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

package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FLBBJourneyRequest
 */

@RedisHash
public class Broadband implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1511608100037673295L;
	@JsonProperty("servicePoint")
	private ServicePoint servicePoint = null;

	/** The sales order appointment. */
	@JsonProperty("salesOrderAppointment")
	private SalesOrderAppointment salesOrderAppointment;

	/** The line details. */
	@JsonProperty("lineDetails")
	private LineDetails lineDetails;
	
	
	@JsonProperty("engineeringVisitCharge")
	private PriceForHardware engineeringVisitCharge = null;;
	

	@JsonProperty("broadBandId")
	@Id
	private String broadBandId = null;
	@JsonProperty("journeyId")
	private String journeyId = null;
	
	@JsonProperty("basketId")
	private String basketId = null;
	
	@JsonProperty("accountCategory")
	private String accountCategory = null;
	
	@JsonProperty("packageId")
	private String packageId = null;
	
	
	

	public Broadband servicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
		return this;
	}

	/**
	 * Get servicePoint
	 * 
	 * @return servicePoint
	 **/
	public ServicePoint getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	public SalesOrderAppointment getSalesOrderAppointment() {
		return salesOrderAppointment;
	}

	public void setSalesOrderAppointment(SalesOrderAppointment salesOrderAppointment) {
		this.salesOrderAppointment = salesOrderAppointment;
	}

	public String getBroadBandId() {
		return broadBandId;
	}

	public void setBroadBandId(String broadBandId) {
		this.broadBandId = broadBandId;
	}

	public LineDetails getLineDetails() {
		return lineDetails;
	}

	public void setLineDetails(LineDetails lineDetails) {
		this.lineDetails = lineDetails;
	}

	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public PriceForHardware getEngineeringVisitCharge() {
		return engineeringVisitCharge;
	}

	public void setEngineeringVisitCharge(PriceForHardware engineeringVisitCharge) {
		this.engineeringVisitCharge = engineeringVisitCharge;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Broadband flBBJourneyDetails = (Broadband) o;
		return Objects.equals(this.servicePoint, flBBJourneyDetails.servicePoint);
	}

	@Override
	public int hashCode() {
		return Objects.hash(servicePoint);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FLBBJourneyDetails {\n");

		sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
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
