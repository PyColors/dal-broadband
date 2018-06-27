package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineTreatment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T12:15:55.201Z")

public class LineTreatment   {
  @JsonProperty("appointmentNeeded")
  private Boolean appointmentNeeded = null;

  /**
   * Gets or Sets connectionCharge
   */
  public enum ConnectionChargeEnum {
    LINE("Line"),
    
    BROADBAND("Broadband"),
    
    LINE_BROADBAND("Line + Broadband"),
    
    NO_CHARGE("No Charge");

    private String value;

    ConnectionChargeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

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

  @JsonProperty("connectionCharge")
  private ConnectionChargeEnum connectionCharge = null;

  @JsonProperty("earliestAvailabilityDate")
  private String earliestAvailabilityDate = null;

  @JsonProperty("installProcess")
  private String installProcess = null;

  /**
   * Gets or Sets lineTreatmentType
   */
  public enum LineTreatmentTypeEnum {
    NEW("NEW"),
    
    EXISTING("EXISTING");

    private String value;

    LineTreatmentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

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

  @JsonProperty("lineTreatmentType")
  private LineTreatmentTypeEnum lineTreatmentType = null;

  @JsonProperty("preOrder")
  private Boolean preOrder = null;

  @JsonProperty("registerOfInterest")
  private Boolean registerOfInterest = null;

  public LineTreatment appointmentNeeded(Boolean appointmentNeeded) {
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

  public LineTreatment connectionCharge(ConnectionChargeEnum connectionCharge) {
    this.connectionCharge = connectionCharge;
    return this;
  }

  /**
   * Get connectionCharge
   * @return connectionCharge
  **/
  @ApiModelProperty(value = "")


  public ConnectionChargeEnum getConnectionCharge() {
    return connectionCharge;
  }

  public void setConnectionCharge(ConnectionChargeEnum connectionCharge) {
    this.connectionCharge = connectionCharge;
  }

  public LineTreatment earliestAvailabilityDate(String earliestAvailabilityDate) {
    this.earliestAvailabilityDate = earliestAvailabilityDate;
    return this;
  }

  /**
   * Get earliestAvailabilityDate
   * @return earliestAvailabilityDate
  **/
  @ApiModelProperty(value = "")


  public String getEarliestAvailabilityDate() {
    return earliestAvailabilityDate;
  }

  public void setEarliestAvailabilityDate(String earliestAvailabilityDate) {
    this.earliestAvailabilityDate = earliestAvailabilityDate;
  }

  public LineTreatment installProcess(String installProcess) {
    this.installProcess = installProcess;
    return this;
  }

  /**
   * Get installProcess
   * @return installProcess
  **/
  @ApiModelProperty(value = "")


  public String getInstallProcess() {
    return installProcess;
  }

  public void setInstallProcess(String installProcess) {
    this.installProcess = installProcess;
  }

  public LineTreatment lineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
    return this;
  }

  /**
   * Get lineTreatmentType
   * @return lineTreatmentType
  **/
  @ApiModelProperty(value = "")


  public LineTreatmentTypeEnum getLineTreatmentType() {
    return lineTreatmentType;
  }

  public void setLineTreatmentType(LineTreatmentTypeEnum lineTreatmentType) {
    this.lineTreatmentType = lineTreatmentType;
  }

  public LineTreatment preOrder(Boolean preOrder) {
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

  public LineTreatment registerOfInterest(Boolean registerOfInterest) {
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
    LineTreatment lineTreatment = (LineTreatment) o;
    return Objects.equals(this.appointmentNeeded, lineTreatment.appointmentNeeded) &&
        Objects.equals(this.connectionCharge, lineTreatment.connectionCharge) &&
        Objects.equals(this.earliestAvailabilityDate, lineTreatment.earliestAvailabilityDate) &&
        Objects.equals(this.installProcess, lineTreatment.installProcess) &&
        Objects.equals(this.lineTreatmentType, lineTreatment.lineTreatmentType) &&
        Objects.equals(this.preOrder, lineTreatment.preOrder) &&
        Objects.equals(this.registerOfInterest, lineTreatment.registerOfInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentNeeded, connectionCharge, earliestAvailabilityDate, installProcess, lineTreatmentType, preOrder, registerOfInterest);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

