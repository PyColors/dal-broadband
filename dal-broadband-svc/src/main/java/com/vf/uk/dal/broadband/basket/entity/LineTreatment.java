package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;


/**
 * LineTreatment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-25T06:31:48.127Z")

public class LineTreatment   {
  private String identification = null;

  private String earliestAvailableDate = null;

  private Boolean appointmentNeeded = null;

  private String connectionCharge = null;

  public LineTreatment identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * The Identification number for the treatment 1 -> Existing Line Treatment 2 -> New (additional) Line Treatment
   * @return identification
  **/


  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public LineTreatment earliestAvailableDate(String earliestAvailableDate) {
    this.earliestAvailableDate = earliestAvailableDate;
    return this;
  }

   /**
   * The earliest date by which the services offered can be made available to the prospective customer
   * @return earliestAvailableDate
  **/


  public String getEarliestAvailableDate() {
    return earliestAvailableDate;
  }

  public void setEarliestAvailableDate(String earliestAvailableDate) {
    this.earliestAvailableDate = earliestAvailableDate;
  }

  public LineTreatment appointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
    return this;
  }

   /**
   * Flag specifying if an appointment is needed or not
   * @return appointmentNeeded
  **/


  public Boolean getAppointmentNeeded() {
    return appointmentNeeded;
  }

  public void setAppointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
  }

  public LineTreatment connectionCharge(String connectionCharge) {
    this.connectionCharge = connectionCharge;
    return this;
  }

   /**
   * The connection charge flag
   * @return connectionCharge
  **/


  public String getConnectionCharge() {
    return connectionCharge;
  }

  public void setConnectionCharge(String connectionCharge) {
    this.connectionCharge = connectionCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineTreatment lineTreatment = (LineTreatment) o;
    return Objects.equals(this.identification, lineTreatment.identification) &&
        Objects.equals(this.earliestAvailableDate, lineTreatment.earliestAvailableDate) &&
        Objects.equals(this.appointmentNeeded, lineTreatment.appointmentNeeded) &&
        Objects.equals(this.connectionCharge, lineTreatment.connectionCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, earliestAvailableDate, appointmentNeeded, connectionCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineTreatment {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    earliestAvailableDate: ").append(toIndentedString(earliestAvailableDate)).append("\n");
    sb.append("    appointmentNeeded: ").append(toIndentedString(appointmentNeeded)).append("\n");
    sb.append("    connectionCharge: ").append(toIndentedString(connectionCharge)).append("\n");
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

