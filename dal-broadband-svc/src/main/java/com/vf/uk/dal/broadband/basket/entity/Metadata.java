package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Metadata.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Metadata   {
  
  /** The basket status. */
  @JsonProperty("basketStatus")
  private String basketStatus = null;

  /** The reason. */
  @JsonProperty("reason")
  private String reason = null;

  /** The return URL. */
  @JsonProperty("returnURL")
  private String returnURL = null;

  /** The sales order id. */
  @JsonProperty("salesOrderId")
  private String salesOrderId = null;

  /**
   * Basket status.
   *
   * @param basketStatus the basket status
   * @return the metadata
   */
  public Metadata basketStatus(String basketStatus) {
    this.basketStatus = basketStatus;
    return this;
  }

  /**
   * Get basketStatus.
   *
   * @return basketStatus
   */
  @ApiModelProperty(value = "")


  public String getBasketStatus() {
    return basketStatus;
  }

  /**
   * Sets the basket status.
   *
   * @param basketStatus the new basket status
   */
  public void setBasketStatus(String basketStatus) {
    this.basketStatus = basketStatus;
  }

  /**
   * Reason.
   *
   * @param reason the reason
   * @return the metadata
   */
  public Metadata reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason.
   *
   * @return reason
   */
  @ApiModelProperty(value = "")


  public String getReason() {
    return reason;
  }

  /**
   * Sets the reason.
   *
   * @param reason the new reason
   */
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Return URL.
   *
   * @param returnURL the return URL
   * @return the metadata
   */
  public Metadata returnURL(String returnURL) {
    this.returnURL = returnURL;
    return this;
  }

  /**
   * Get returnURL.
   *
   * @return returnURL
   */
  @ApiModelProperty(value = "")


  public String getReturnURL() {
    return returnURL;
  }

  /**
   * Sets the return URL.
   *
   * @param returnURL the new return URL
   */
  public void setReturnURL(String returnURL) {
    this.returnURL = returnURL;
  }

  /**
   * Sales order id.
   *
   * @param salesOrderId the sales order id
   * @return the metadata
   */
  public Metadata salesOrderId(String salesOrderId) {
    this.salesOrderId = salesOrderId;
    return this;
  }

  /**
   * Get salesOrderId.
   *
   * @return salesOrderId
   */
  @ApiModelProperty(value = "")


  public String getSalesOrderId() {
    return salesOrderId;
  }

  /**
   * Sets the sales order id.
   *
   * @param salesOrderId the new sales order id
   */
  public void setSalesOrderId(String salesOrderId) {
    this.salesOrderId = salesOrderId;
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
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.basketStatus, metadata.basketStatus) &&
        Objects.equals(this.reason, metadata.reason) &&
        Objects.equals(this.returnURL, metadata.returnURL) &&
        Objects.equals(this.salesOrderId, metadata.salesOrderId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(basketStatus, reason, returnURL, salesOrderId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

