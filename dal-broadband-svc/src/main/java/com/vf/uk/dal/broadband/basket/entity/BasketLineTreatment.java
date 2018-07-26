package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineTreatment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T09:39:43.102Z")

public class BasketLineTreatment   {
  @JsonProperty("appointmentNeeded")
  private Boolean appointmentNeeded = null;

  @JsonProperty("connectionCharge")
  private String connectionCharge = null;

  @JsonProperty("earliestAvailableDate")
  private String earliestAvailableDate = null;

  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("preOrder")
  private Boolean preOrder = null;

  @JsonProperty("registerOfInterest")
  private Boolean registerOfInterest = null;

  /**
   * 
   * @param appointmentNeeded
   * @return
   */
  public BasketLineTreatment appointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
    return this;
  }

  /**
   * Get appointmentNeeded
   * @return appointmentNeeded
  **/

  public Boolean isAppointmentNeeded() {
    return appointmentNeeded;
  }

  public void setAppointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
  }

  /**
   * 
   * @param connectionCharge
   * @return
   */
  public BasketLineTreatment connectionCharge(String connectionCharge) {
    this.connectionCharge = connectionCharge;
    return this;
  }

  /**
   * Get connectionCharge
   * @return connectionCharge
  **/
  @ApiModelProperty(value = "")


  public String getConnectionCharge() {
    return connectionCharge;
  }

  public void setConnectionCharge(String connectionCharge) {
    this.connectionCharge = connectionCharge;
  }

  /**
   * 
   * @param earliestAvailableDate
   * @return
   */
  public BasketLineTreatment earliestAvailableDate(String earliestAvailableDate) {
    this.earliestAvailableDate = earliestAvailableDate;
    return this;
  }

  /**
   * Get earliestAvailableDate
   * @return earliestAvailableDate
  **/
  @ApiModelProperty(value = "")


  public String getEarliestAvailableDate() {
    return earliestAvailableDate;
  }

  public void setEarliestAvailableDate(String earliestAvailableDate) {
    this.earliestAvailableDate = earliestAvailableDate;
  }

  /**
   * 
   * @param identification
   * @return
   */
  public BasketLineTreatment identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")


  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  /**
   * 
   * @param preOrder
   * @return
   */
  public BasketLineTreatment preOrder(Boolean preOrder) {
    this.preOrder = preOrder;
    return this;
  }

  /**
   * Get preOrder
   * @return preOrder
  **/

  public Boolean isPreOrder() {
    return preOrder;
  }

  public void setPreOrder(Boolean preOrder) {
    this.preOrder = preOrder;
  }

  /**
   * 
   * @param registerOfInterest
   * @return
   */
  public BasketLineTreatment registerOfInterest(Boolean registerOfInterest) {
    this.registerOfInterest = registerOfInterest;
    return this;
  }

  /**
   * Get registerOfInterest
   * @return registerOfInterest
  **/

  public Boolean isRegisterOfInterest() {
    return registerOfInterest;
  }

  public void setRegisterOfInterest(Boolean registerOfInterest) {
    this.registerOfInterest = registerOfInterest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketLineTreatment lineTreatment = (BasketLineTreatment) o;
    return Objects.equals(this.appointmentNeeded, lineTreatment.appointmentNeeded) &&
        Objects.equals(this.connectionCharge, lineTreatment.connectionCharge) &&
        Objects.equals(this.earliestAvailableDate, lineTreatment.earliestAvailableDate) &&
        Objects.equals(this.identification, lineTreatment.identification) &&
        Objects.equals(this.preOrder, lineTreatment.preOrder) &&
        Objects.equals(this.registerOfInterest, lineTreatment.registerOfInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentNeeded, connectionCharge, earliestAvailableDate, identification, preOrder, registerOfInterest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineTreatment {\n");
    
    sb.append("    appointmentNeeded: ").append(toIndentedString(appointmentNeeded)).append("\n");
    sb.append("    connectionCharge: ").append(toIndentedString(connectionCharge)).append("\n");
    sb.append("    earliestAvailableDate: ").append(toIndentedString(earliestAvailableDate)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    preOrder: ").append(toIndentedString(preOrder)).append("\n");
    sb.append("    registerOfInterest: ").append(toIndentedString(registerOfInterest)).append("\n");
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

