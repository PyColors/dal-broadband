package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineTreatment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class BasketLineTreatment   {
  @JsonProperty("appointmentNeeded")
  private Boolean appointmentNeeded = null;

  @JsonProperty("connectionCharge")
  private String connectionCharge = null;

  @JsonProperty("earliestAvailableDate")
  private String earliestAvailableDate = null;

  @JsonProperty("identification")
  private String identification = null;

  public BasketLineTreatment appointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
    return this;
  }

  /**
   * Get appointmentNeeded
   * @return appointmentNeeded
  **/
  @ApiModelProperty(value = "")


  public Boolean isAppointmentNeeded() {
    return appointmentNeeded;
  }

  public void setAppointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
  }

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
        Objects.equals(this.identification, lineTreatment.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentNeeded, connectionCharge, earliestAvailableDate, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineTreatment {\n");
    
    sb.append("    appointmentNeeded: ").append(toIndentedString(appointmentNeeded)).append("\n");
    sb.append("    connectionCharge: ").append(toIndentedString(connectionCharge)).append("\n");
    sb.append("    earliestAvailableDate: ").append(toIndentedString(earliestAvailableDate)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

