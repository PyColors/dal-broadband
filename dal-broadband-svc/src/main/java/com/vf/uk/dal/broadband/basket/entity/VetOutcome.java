package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * VetOutcome
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class VetOutcome   {
  @JsonProperty("availableNumberOfConnections")
  private String availableNumberOfConnections = null;

  @JsonProperty("availableRecurringChargeLimit")
  private String availableRecurringChargeLimit = null;

  @JsonProperty("creditVetId")
  private String creditVetId = null;

  @JsonProperty("outcomeCode")
  private String outcomeCode = null;

  public VetOutcome availableNumberOfConnections(String availableNumberOfConnections) {
    this.availableNumberOfConnections = availableNumberOfConnections;
    return this;
  }

  /**
   * Get availableNumberOfConnections
   * @return availableNumberOfConnections
  **/
  @ApiModelProperty(value = "")


  public String getAvailableNumberOfConnections() {
    return availableNumberOfConnections;
  }

  public void setAvailableNumberOfConnections(String availableNumberOfConnections) {
    this.availableNumberOfConnections = availableNumberOfConnections;
  }

  public VetOutcome availableRecurringChargeLimit(String availableRecurringChargeLimit) {
    this.availableRecurringChargeLimit = availableRecurringChargeLimit;
    return this;
  }

  /**
   * Get availableRecurringChargeLimit
   * @return availableRecurringChargeLimit
  **/
  @ApiModelProperty(value = "")


  public String getAvailableRecurringChargeLimit() {
    return availableRecurringChargeLimit;
  }

  public void setAvailableRecurringChargeLimit(String availableRecurringChargeLimit) {
    this.availableRecurringChargeLimit = availableRecurringChargeLimit;
  }

  public VetOutcome creditVetId(String creditVetId) {
    this.creditVetId = creditVetId;
    return this;
  }

  /**
   * Get creditVetId
   * @return creditVetId
  **/
  @ApiModelProperty(value = "")


  public String getCreditVetId() {
    return creditVetId;
  }

  public void setCreditVetId(String creditVetId) {
    this.creditVetId = creditVetId;
  }

  public VetOutcome outcomeCode(String outcomeCode) {
    this.outcomeCode = outcomeCode;
    return this;
  }

  /**
   * Get outcomeCode
   * @return outcomeCode
  **/
  @ApiModelProperty(value = "")


  public String getOutcomeCode() {
    return outcomeCode;
  }

  public void setOutcomeCode(String outcomeCode) {
    this.outcomeCode = outcomeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VetOutcome vetOutcome = (VetOutcome) o;
    return Objects.equals(this.availableNumberOfConnections, vetOutcome.availableNumberOfConnections) &&
        Objects.equals(this.availableRecurringChargeLimit, vetOutcome.availableRecurringChargeLimit) &&
        Objects.equals(this.creditVetId, vetOutcome.creditVetId) &&
        Objects.equals(this.outcomeCode, vetOutcome.outcomeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableNumberOfConnections, availableRecurringChargeLimit, creditVetId, outcomeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VetOutcome {\n");
    
    sb.append("    availableNumberOfConnections: ").append(toIndentedString(availableNumberOfConnections)).append("\n");
    sb.append("    availableRecurringChargeLimit: ").append(toIndentedString(availableRecurringChargeLimit)).append("\n");
    sb.append("    creditVetId: ").append(toIndentedString(creditVetId)).append("\n");
    sb.append("    outcomeCode: ").append(toIndentedString(outcomeCode)).append("\n");
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

