package com.vf.uk.dal.broadband.entity.journey;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Journey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T14:15:49.915Z")

public class Journey {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("contextMSISDN")
	private String contextMSISDN = null;

	@JsonProperty("basketId")
	private String basketId = null;

	@JsonProperty("journeyData")
	private List<JourneyData> journeyData = null;

	@JsonProperty("servicePoint")
	private ServicePoint servicePoint = null;

	@JsonProperty("salesOrderAppointment")
	private SalesOrderAppointment salesOrderAppointment = null;

	@JsonProperty("lineDetailsRequest")
	private LineDetailsRequest lineDetailsRequest = null;

	/**
	 * @param id
	 * @return
	 */
	public Journey id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique journeyId created to track
	 * 
	 * @return id
	 **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param username
	 * @return
	 */
	public Journey username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * IDM Username.
	 * 
	 * @return username
	 **/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param contextMSISDN
	 * @return
	 */
	public Journey contextMSISDN(String contextMSISDN) {
		this.contextMSISDN = contextMSISDN;
		return this;
	}

	/**
	 * The in-context Service Identifier according to eCare
	 * 
	 * @return contextMSISDN
	 **/

	public String getContextMSISDN() {
		return contextMSISDN;
	}

	public void setContextMSISDN(String contextMSISDN) {
		this.contextMSISDN = contextMSISDN;
	}

	/**
	 * @param basketId
	 * @return
	 */
	public Journey basketId(String basketId) {
		this.basketId = basketId;
		return this;
	}

	/**
	 * Any associated basket Id created for this user
	 * 
	 * @return basketId
	 **/

	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	/**
	 * @param journeyData
	 * @return
	 */
	public Journey journeyData(List<JourneyData> journeyData) {
		this.journeyData = journeyData;
		return this;
	}

	/**
	 * @param journeyDataItem
	 * @return
	 */
	public Journey addJourneyDataItem(JourneyData journeyDataItem) {
		if (this.journeyData == null) {
			this.journeyData = new ArrayList<JourneyData>();
		}
		this.journeyData.add(journeyDataItem);
		return this;
	}

	/**
	 * Get journeyData
	 * 
	 * @return journeyData
	 **/

	@Valid

	public List<JourneyData> getJourneyData() {
		return journeyData;
	}

	public void setJourneyData(List<JourneyData> journeyData) {
		this.journeyData = journeyData;
	}

	/**
	 * @param servicePoint
	 * @return
	 */
	public Journey servicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
		return this;
	}

	/**
	 * Get servicePoint
	 * 
	 * @return servicePoint
	 **/

	@Valid

	public ServicePoint getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(ServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	/**
	 * @param salesOrderAppointment
	 * @return
	 */
	public Journey salesOrderAppointment(SalesOrderAppointment salesOrderAppointment) {
		this.salesOrderAppointment = salesOrderAppointment;
		return this;
	}

	/**
	 * Get salesOrderAppointment
	 * 
	 * @return salesOrderAppointment
	 **/

	@Valid

	public SalesOrderAppointment getSalesOrderAppointment() {
		return salesOrderAppointment;
	}

	public void setSalesOrderAppointment(SalesOrderAppointment salesOrderAppointment) {
		this.salesOrderAppointment = salesOrderAppointment;
	}

	/**
	 * @param lineDetailsRequest
	 * @return
	 */
	public Journey lineDetailsRequest(LineDetailsRequest lineDetailsRequest) {
		this.lineDetailsRequest = lineDetailsRequest;
		return this;
	}

	/**
	 * Get lineDetailsRequest
	 * 
	 * @return lineDetailsRequest
	 **/

	@Valid

	public LineDetailsRequest getLineDetailsRequest() {
		return lineDetailsRequest;
	}

	public void setLineDetailsRequest(LineDetailsRequest lineDetailsRequest) {
		this.lineDetailsRequest = lineDetailsRequest;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Journey journey = (Journey) o;
		return Objects.equals(this.id, journey.id) && Objects.equals(this.username, journey.username)
				&& Objects.equals(this.contextMSISDN, journey.contextMSISDN)
				&& Objects.equals(this.basketId, journey.basketId)
				&& Objects.equals(this.journeyData, journey.journeyData)
				&& Objects.equals(this.servicePoint, journey.servicePoint)
				&& Objects.equals(this.salesOrderAppointment, journey.salesOrderAppointment)
				&& Objects.equals(this.lineDetailsRequest, journey.lineDetailsRequest);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, contextMSISDN, basketId, journeyData, servicePoint, salesOrderAppointment,
				lineDetailsRequest);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Journey {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    contextMSISDN: ").append(toIndentedString(contextMSISDN)).append("\n");
		sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
		sb.append("    journeyData: ").append(toIndentedString(journeyData)).append("\n");
		sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
		sb.append("    salesOrderAppointment: ").append(toIndentedString(salesOrderAppointment)).append("\n");
		sb.append("    lineDetailsRequest: ").append(toIndentedString(lineDetailsRequest)).append("\n");
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
