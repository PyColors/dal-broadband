package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineTreatment.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T12:15:55.201Z")

public class LineTreatment   {
  
  /** The appointment needed. */
  @JsonProperty("appointmentNeeded")
  private Boolean appointmentNeeded = null;

  /**
   * Gets or Sets connectionCharge.
   */
  public enum ConnectionChargeEnum {
    
    /** The line. */
    LINE("Line"),
    
    /** The broadband. */
    BROADBAND("Broadband"),
    
    /** The line broadband. */
    LINE_BROADBAND("Line + Broadband"),
    
    /** The no charge. */
    NO_CHARGE("No Charge");

    /** The value. */
    private String value;

    /**
     * Instantiates a new connection charge enum.
     *
     * @param value the value
     */
    ConnectionChargeEnum(String value) {
      this.value = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * From value.
     *
     * @param text the text
     * @return the connection charge enum
     */
    @JsonCreator
    public static ConnectionChargeEnum fromValue(String text) {
      for (ConnectionChargeEnum b : ConnectionChargeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /** The connection charge. */
  @JsonProperty("connectionCharge")
  private ConnectionChargeEnum connectionCharge = null;

  /** The earliest availability date. */
  @JsonProperty("earliestAvailabilityDate")
  private String earliestAvailabilityDate = null;

  /** The install process. */
  @JsonProperty("installProcess")
  private String installProcess = null;

  /**
   * Gets or Sets lineTreatmentType.
   */
  public enum LineTreatmentTypeEnum {
    
    /** The new. */
    NEW("NEW"),
    
    /** The existing. */
    EXISTING("EXISTING");

    /** The value. */
    private String value;

    /**
     * Instantiates a new line treatment type enum.
     *
     * @param value the value
     */
    LineTreatmentTypeEnum(String value) {
      this.value = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * From value.
     *
     * @param text the text
     * @return the line treatment type enum
     */
    @JsonCreator
    public static LineTreatmentTypeEnum fromValue(String text) {
      for (LineTreatmentTypeEnum b : LineTreatmentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /** The line treatment type. */
  @JsonProperty("lineTreatmentType")
  private LineTreatmentTypeEnum lineTreatmentType = null;

  /** The pre order. */
  @JsonProperty("preOrder")
  private Boolean preOrder = null;

  /** The register of interest. */
  @JsonProperty("registerOfInterest")
  private Boolean registerOfInterest = null;

  /**
   * Appointment needed.
   *
   * @param appointmentNeeded the appointment needed
   * @return the line treatment
   */
  public LineTreatment appointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
    return this;
  }

  /**
   * Get appointmentNeeded.
   *
   * @return appointmentNeeded
   */

  public Boolean isAppointmentNeeded() {
    return appointmentNeeded;
  }

  /**
   * Sets the appointment needed.
   *
   * @param appointmentNeeded the new appointment needed
   */
  public void setAppointmentNeeded(Boolean appointmentNeeded) {
    this.appointmentNeeded = appointmentNeeded;
  }

  /**
   * Connection charge.
   *
   * @param connectionCharge the connection charge
   * @return the line treatment
   */
  public LineTreatment connectionCharge(ConnectionChargeEnum connectionCharge) {
    this.connectionCharge = connectionCharge;
    return this;
  }

  /**
   * Get connectionCharge.
   *
   * @return connectionCharge
   */
  @ApiModelProperty(value = "")


  public ConnectionChargeEnum getConnectionCharge() {
    return connectionCharge;
  }

  /**
   * Sets the connection charge.
   *
   * @param connectionCharge the new connection charge
   */
  public void setConnectionCharge(ConnectionChargeEnum connectionCharge) {
    this.connectionCharge = connectionCharge;
  }

  /**
   * Earliest availability date.
   *
   * @param earliestAvailabilityDate the earliest availability date
   * @return the line treatment
   */
  public LineTreatment earliestAvailabilityDate(String earliestAvailabilityDate) {
    this.earliestAvailabilityDate = earliestAvailabilityDate;
    return this;
  }

  /**
   * Get earliestAvailabilityDate.
   *
   * @return earliestAvailabilityDate
   */
  @ApiModelProperty(value = "")


  public String getEarliestAvailabilityDate() {
    return earliestAvailabilityDate;
  }

  /**
   * Sets the earliest availability date.
   *
   * @param earliestAvailabilityDate the new earliest availability date
   */
  public void setEarliestAvailabilityDate(String earliestAvailabilityDate) {
    this.earliestAvailabilityDate = earliestAvailabilityDate;
  }

  /**
   * Install process.
   *
   * @param installProcess the install process
   * @return the line treatment
   */
  public LineTreatment installProcess(String installProcess) {
    this.installProcess = installProcess;
    return this;
  }

  /**
   * Get installProcess.
   *
   * @return installProcess
   */
  @ApiModelProperty(value = "")


  public String getInstallProcess() {
    return installProcess;
  }

  /**
   * Sets the install process.
   *
   * @param installProcess the new install process
   */
  public void setInstallProcess(String installProcess) {
    this.installProcess = installProcess;
  }

  /**
   * Line treatment type.
   *
   * @param lineTreatmentType the line treatment type
   * @return the line treatment
   */
  public LineTreatment lineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
    return this;
  }

  /**
   * Get lineTreatmentType.
   *
   * @return lineTreatmentType
   */
  @ApiModelProperty(value = "")


  public LineTreatmentTypeEnum getLineTreatmentType() {
    return lineTreatmentType;
  }

  /**
   * Sets the line treatment type.
   *
   * @param lineTreatmentType the new line treatment type
   */
  public void setLineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
  }

  /**
   * Pre order.
   *
   * @param preOrder the pre order
   * @return the line treatment
   */
  public LineTreatment preOrder(Boolean preOrder) {
    this.preOrder = preOrder;
    return this;
  }

  /**
   * Get preOrder.
   *
   * @return preOrder
   */

  public Boolean isPreOrder() {
    return preOrder;
  }

  /**
   * Sets the pre order.
   *
   * @param preOrder the new pre order
   */
  public void setPreOrder(Boolean preOrder) {
    this.preOrder = preOrder;
  }

  /**
   * Register of interest.
   *
   * @param registerOfInterest the register of interest
   * @return the line treatment
   */
  public LineTreatment registerOfInterest(Boolean registerOfInterest) {
    this.registerOfInterest = registerOfInterest;
    return this;
  }

  /**
   * Get registerOfInterest.
   *
   * @return registerOfInterest
   */

  public Boolean isRegisterOfInterest() {
    return registerOfInterest;
  }

  /**
   * Sets the register of interest.
   *
   * @param registerOfInterest the new register of interest
   */
  public void setRegisterOfInterest(Boolean registerOfInterest) {
    this.registerOfInterest = registerOfInterest;
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
    LineTreatment lineTreatment = (LineTreatment) o;
    return Objects.equals(this.appointmentNeeded, lineTreatment.appointmentNeeded) &&
        Objects.equals(this.connectionCharge, lineTreatment.connectionCharge) &&
        Objects.equals(this.earliestAvailabilityDate, lineTreatment.earliestAvailabilityDate) &&
        Objects.equals(this.installProcess, lineTreatment.installProcess) &&
        Objects.equals(this.lineTreatmentType, lineTreatment.lineTreatmentType) &&
        Objects.equals(this.preOrder, lineTreatment.preOrder) &&
        Objects.equals(this.registerOfInterest, lineTreatment.registerOfInterest);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(appointmentNeeded, connectionCharge, earliestAvailabilityDate, installProcess, lineTreatmentType, preOrder, registerOfInterest);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineTreatment {\n");
    
    sb.append("    appointmentNeeded: ").append(toIndentedString(appointmentNeeded)).append("\n");
    sb.append("    connectionCharge: ").append(toIndentedString(connectionCharge)).append("\n");
    sb.append("    earliestAvailabilityDate: ").append(toIndentedString(earliestAvailabilityDate)).append("\n");
    sb.append("    installProcess: ").append(toIndentedString(installProcess)).append("\n");
    sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
    sb.append("    preOrder: ").append(toIndentedString(preOrder)).append("\n");
    sb.append("    registerOfInterest: ").append(toIndentedString(registerOfInterest)).append("\n");
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

