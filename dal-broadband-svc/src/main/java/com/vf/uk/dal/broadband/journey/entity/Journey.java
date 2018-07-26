package com.vf.uk.dal.broadband.journey.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Journey.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-23T14:15:49.915Z")

public class Journey   {
  
  /** The id. */
  @JsonProperty("id")
  private String id = null;

  /** The username. */
  @JsonProperty("username")
  private String username = null;

  /** The context MSISDN. */
  @JsonProperty("contextMSISDN")
  private String contextMSISDN = null;

  /** The basket id. */
  @JsonProperty("basketId")
  private String basketId = null;

  /** The journey data. */
  @JsonProperty("journeyData")
  private List<JourneyData> journeyData = null;

  /** The service point. */
  @JsonProperty("servicePoint")
  private ServicePoint servicePoint = null;

  /** The sales order appointment. */
  @JsonProperty("salesOrderAppointment")
  private SalesOrderAppointment salesOrderAppointment = null;

  /** The line details request. */
  @JsonProperty("lineDetailsRequest")
  private LineDetailsRequest lineDetailsRequest = null;

  /**
   * Id.
   *
   * @param id the id
   * @return the journey
   */
  public Journey id(String id) {
    this.id = id;
    return this;
  }

   /**
    * Unique journeyId created to track.
    *
    * @return id
    */


  public String getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Username.
   *
   * @param username the username
   * @return the journey
   */
  public Journey username(String username) {
    this.username = username;
    return this;
  }

   /**
   * IDM Username.
   * @return username
  **/


  public String getUsername() {
    return username;
  }

  /**
   * Sets the username.
   *
   * @param username the new username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Context MSISDN.
   *
   * @param contextMSISDN the context MSISDN
   * @return the journey
   */
  public Journey contextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
    return this;
  }

   /**
    * The in-context Service Identifier according to eCare.
    *
    * @return contextMSISDN
    */


  public String getContextMSISDN() {
    return contextMSISDN;
  }

  /**
   * Sets the context MSISDN.
   *
   * @param contextMSISDN the new context MSISDN
   */
  public void setContextMSISDN(String contextMSISDN) {
    this.contextMSISDN = contextMSISDN;
  }

  /**
   * Basket id.
   *
   * @param basketId the basket id
   * @return the journey
   */
  public Journey basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

   /**
    * Any associated basket Id created for this user.
    *
    * @return basketId
    */


  public String getBasketId() {
    return basketId;
  }

  /**
   * Sets the basket id.
   *
   * @param basketId the new basket id
   */
  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  /**
   * Journey data.
   *
   * @param journeyData the journey data
   * @return the journey
   */
  public Journey journeyData(List<JourneyData> journeyData) {
    this.journeyData = journeyData;
    return this;
  }

  /**
   * Adds the journey data item.
   *
   * @param journeyDataItem the journey data item
   * @return the journey
   */
  public Journey addJourneyDataItem(JourneyData journeyDataItem) {
    if (this.journeyData == null) {
      this.journeyData = new ArrayList<>();
    }
    this.journeyData.add(journeyDataItem);
    return this;
  }

   /**
    * Get journeyData.
    *
    * @return journeyData
    */

  @Valid

  public List<JourneyData> getJourneyData() {
    return journeyData;
  }

  /**
   * Sets the journey data.
   *
   * @param journeyData the new journey data
   */
  public void setJourneyData(List<JourneyData> journeyData) {
    this.journeyData = journeyData;
  }

  /**
   * Service point.
   *
   * @param servicePoint the service point
   * @return the journey
   */
  public Journey servicePoint(ServicePoint servicePoint) {
    this.servicePoint = servicePoint;
    return this;
  }

   /**
    * Get servicePoint.
    *
    * @return servicePoint
    */

  @Valid

  public ServicePoint getServicePoint() {
    return servicePoint;
  }

  /**
   * Sets the service point.
   *
   * @param servicePoint the new service point
   */
  public void setServicePoint(ServicePoint servicePoint) {
    this.servicePoint = servicePoint;
  }

  /**
   * Sales order appointment.
   *
   * @param salesOrderAppointment the sales order appointment
   * @return the journey
   */
  public Journey salesOrderAppointment(SalesOrderAppointment salesOrderAppointment) {
    this.salesOrderAppointment = salesOrderAppointment;
    return this;
  }

   /**
    * Get salesOrderAppointment.
    *
    * @return salesOrderAppointment
    */

  @Valid

  public SalesOrderAppointment getSalesOrderAppointment() {
    return salesOrderAppointment;
  }

  /**
   * Sets the sales order appointment.
   *
   * @param salesOrderAppointment the new sales order appointment
   */
  public void setSalesOrderAppointment(SalesOrderAppointment salesOrderAppointment) {
    this.salesOrderAppointment = salesOrderAppointment;
  }

  /**
   * Line details request.
   *
   * @param lineDetailsRequest the line details request
   * @return the journey
   */
  public Journey lineDetailsRequest(LineDetailsRequest lineDetailsRequest) {
    this.lineDetailsRequest = lineDetailsRequest;
    return this;
  }

   /**
    * Get lineDetailsRequest.
    *
    * @return lineDetailsRequest
    */

  @Valid

  public LineDetailsRequest getLineDetailsRequest() {
    return lineDetailsRequest;
  }

  /**
   * Sets the line details request.
   *
   * @param lineDetailsRequest the new line details request
   */
  public void setLineDetailsRequest(LineDetailsRequest lineDetailsRequest) {
    this.lineDetailsRequest = lineDetailsRequest;
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
    Journey journey = (Journey) o;
    return Objects.equals(this.id, journey.id) &&
        Objects.equals(this.username, journey.username) &&
        Objects.equals(this.contextMSISDN, journey.contextMSISDN) &&
        Objects.equals(this.basketId, journey.basketId) &&
        Objects.equals(this.journeyData, journey.journeyData) &&
        Objects.equals(this.servicePoint, journey.servicePoint) &&
        Objects.equals(this.salesOrderAppointment, journey.salesOrderAppointment) &&
        Objects.equals(this.lineDetailsRequest, journey.lineDetailsRequest);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, username, contextMSISDN, basketId, journeyData, servicePoint, salesOrderAppointment, lineDetailsRequest);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

