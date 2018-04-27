package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Metadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Metadata   {
  @JsonProperty("basketStatus")
  private String basketStatus = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("returnURL")
  private String returnURL = null;

  @JsonProperty("salesOrderId")
  private String salesOrderId = null;

  public Metadata basketStatus(String basketStatus) {
    this.basketStatus = basketStatus;
    return this;
  }

  /**
   * Get basketStatus
   * @return basketStatus
  **/
  @ApiModelProperty(value = "")


  public String getBasketStatus() {
    return basketStatus;
  }

  public void setBasketStatus(String basketStatus) {
    this.basketStatus = basketStatus;
  }

  public Metadata reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Metadata returnURL(String returnURL) {
    this.returnURL = returnURL;
    return this;
  }

  /**
   * Get returnURL
   * @return returnURL
  **/
  @ApiModelProperty(value = "")


  public String getReturnURL() {
    return returnURL;
  }

  public void setReturnURL(String returnURL) {
    this.returnURL = returnURL;
  }

  public Metadata salesOrderId(String salesOrderId) {
    this.salesOrderId = salesOrderId;
    return this;
  }

  /**
   * Get salesOrderId
   * @return salesOrderId
  **/
  @ApiModelProperty(value = "")


  public String getSalesOrderId() {
    return salesOrderId;
  }

  public void setSalesOrderId(String salesOrderId) {
    this.salesOrderId = salesOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.basketStatus, metadata.basketStatus) &&
        Objects.equals(this.reason, metadata.reason) &&
        Objects.equals(this.returnURL, metadata.returnURL) &&
        Objects.equals(this.salesOrderId, metadata.salesOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basketStatus, reason, returnURL, salesOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    basketStatus: ").append(toIndentedString(basketStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    returnURL: ").append(toIndentedString(returnURL)).append("\n");
    sb.append("    salesOrderId: ").append(toIndentedString(salesOrderId)).append("\n");
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

