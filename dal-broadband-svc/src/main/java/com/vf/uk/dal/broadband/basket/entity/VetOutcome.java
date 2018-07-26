package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * VetOutcome.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class VetOutcome   {
  
  /** The available number of connections. */
  @JsonProperty("availableNumberOfConnections")
  private String availableNumberOfConnections = null;

  /** The available recurring charge limit. */
  @JsonProperty("availableRecurringChargeLimit")
  private String availableRecurringChargeLimit = null;

  /** The credit vet id. */
  @JsonProperty("creditVetId")
  private String creditVetId = null;

  /** The outcome code. */
  @JsonProperty("outcomeCode")
  private String outcomeCode = null;

  /**
   * Available number of connections.
   *
   * @param availableNumberOfConnections the available number of connections
   * @return the vet outcome
   */
  public VetOutcome availableNumberOfConnections(String availableNumberOfConnections) {
    this.availableNumberOfConnections = availableNumberOfConnections;
    return this;
  }

  /**
   * Get availableNumberOfConnections.
   *
   * @return availableNumberOfConnections
   */
  @ApiModelProperty(value = "")


  public String getAvailableNumberOfConnections() {
    return availableNumberOfConnections;
  }

  /**
   * Sets the available number of connections.
   *
   * @param availableNumberOfConnections the new available number of connections
   */
  public void setAvailableNumberOfConnections(String availableNumberOfConnections) {
    this.availableNumberOfConnections = availableNumberOfConnections;
  }

  /**
   * Available recurring charge limit.
   *
   * @param availableRecurringChargeLimit the available recurring charge limit
   * @return the vet outcome
   */
  public VetOutcome availableRecurringChargeLimit(String availableRecurringChargeLimit) {
    this.availableRecurringChargeLimit = availableRecurringChargeLimit;
    return this;
  }

  /**
   * Get availableRecurringChargeLimit.
   *
   * @return availableRecurringChargeLimit
   */
  @ApiModelProperty(value = "")


  public String getAvailableRecurringChargeLimit() {
    return availableRecurringChargeLimit;
  }

  /**
   * Sets the available recurring charge limit.
   *
   * @param availableRecurringChargeLimit the new available recurring charge limit
   */
  public void setAvailableRecurringChargeLimit(String availableRecurringChargeLimit) {
    this.availableRecurringChargeLimit = availableRecurringChargeLimit;
  }

  /**
   * Credit vet id.
   *
   * @param creditVetId the credit vet id
   * @return the vet outcome
   */
  public VetOutcome creditVetId(String creditVetId) {
    this.creditVetId = creditVetId;
    return this;
  }

  /**
   * Get creditVetId.
   *
   * @return creditVetId
   */
  @ApiModelProperty(value = "")


  public String getCreditVetId() {
    return creditVetId;
  }

  /**
   * Sets the credit vet id.
   *
   * @param creditVetId the new credit vet id
   */
  public void setCreditVetId(String creditVetId) {
    this.creditVetId = creditVetId;
  }

  /**
   * Outcome code.
   *
   * @param outcomeCode the outcome code
   * @return the vet outcome
   */
  public VetOutcome outcomeCode(String outcomeCode) {
    this.outcomeCode = outcomeCode;
    return this;
  }

  /**
   * Get outcomeCode.
   *
   * @return outcomeCode
   */
  @ApiModelProperty(value = "")


  public String getOutcomeCode() {
    return outcomeCode;
  }

  /**
   * Sets the outcome code.
   *
   * @param outcomeCode the new outcome code
   */
  public void setOutcomeCode(String outcomeCode) {
    this.outcomeCode = outcomeCode;
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
    VetOutcome vetOutcome = (VetOutcome) o;
    return Objects.equals(this.availableNumberOfConnections, vetOutcome.availableNumberOfConnections) &&
        Objects.equals(this.availableRecurringChargeLimit, vetOutcome.availableRecurringChargeLimit) &&
        Objects.equals(this.creditVetId, vetOutcome.creditVetId) &&
        Objects.equals(this.outcomeCode, vetOutcome.outcomeCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(availableNumberOfConnections, availableRecurringChargeLimit, creditVetId, outcomeCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

