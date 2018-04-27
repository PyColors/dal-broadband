package com.vf.uk.dal.broadband.entity.product;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PriceDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-17T20:40:09.952Z")

public class PriceDetail   {
  @JsonProperty("priceType")
  private String priceType = null;

  @JsonProperty("isInvoiceChargeable")
  private String isInvoiceChargeable = null;

  @JsonProperty("priceNet")
  private String priceNet = null;

  @JsonProperty("priceGross")
  private String priceGross = null;

  @JsonProperty("priceVAT")
  private String priceVAT = null;

  @JsonProperty("vatCode")
  private String vatCode = null;

  @JsonProperty("priceStartDate")
  private String priceStartDate = null;

  @JsonProperty("priceEndDate")
  private String priceEndDate = null;

  @JsonProperty("recurrence")
  private String recurrence = null;

  public PriceDetail priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
  **/
  @ApiModelProperty(value = "")


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public PriceDetail isInvoiceChargeable(String isInvoiceChargeable) {
    this.isInvoiceChargeable = isInvoiceChargeable;
    return this;
  }

  /**
   * Get isInvoiceChargeable
   * @return isInvoiceChargeable
  **/
  @ApiModelProperty(value = "")


  public String getIsInvoiceChargeable() {
    return isInvoiceChargeable;
  }

  public void setIsInvoiceChargeable(String isInvoiceChargeable) {
    this.isInvoiceChargeable = isInvoiceChargeable;
  }

  public PriceDetail priceNet(String priceNet) {
    this.priceNet = priceNet;
    return this;
  }

  /**
   * Get priceNet
   * @return priceNet
  **/
  @ApiModelProperty(value = "")


  public String getPriceNet() {
    return priceNet;
  }

  public void setPriceNet(String priceNet) {
    this.priceNet = priceNet;
  }

  public PriceDetail priceGross(String priceGross) {
    this.priceGross = priceGross;
    return this;
  }

  /**
   * Get priceGross
   * @return priceGross
  **/
  @ApiModelProperty(value = "")


  public String getPriceGross() {
    return priceGross;
  }

  public void setPriceGross(String priceGross) {
    this.priceGross = priceGross;
  }

  public PriceDetail priceVAT(String priceVAT) {
    this.priceVAT = priceVAT;
    return this;
  }

  /**
   * Get priceVAT
   * @return priceVAT
  **/
  @ApiModelProperty(value = "")


  public String getPriceVAT() {
    return priceVAT;
  }

  public void setPriceVAT(String priceVAT) {
    this.priceVAT = priceVAT;
  }

  public PriceDetail vatCode(String vatCode) {
    this.vatCode = vatCode;
    return this;
  }

  /**
   * Get vatCode
   * @return vatCode
  **/
  @ApiModelProperty(value = "")


  public String getVatCode() {
    return vatCode;
  }

  public void setVatCode(String vatCode) {
    this.vatCode = vatCode;
  }

  public PriceDetail priceStartDate(String priceStartDate) {
    this.priceStartDate = priceStartDate;
    return this;
  }

  /**
   * Get priceStartDate
   * @return priceStartDate
  **/
  @ApiModelProperty(value = "")


  public String getPriceStartDate() {
    return priceStartDate;
  }

  public void setPriceStartDate(String priceStartDate) {
    this.priceStartDate = priceStartDate;
  }

  public PriceDetail priceEndDate(String priceEndDate) {
    this.priceEndDate = priceEndDate;
    return this;
  }

  /**
   * Get priceEndDate
   * @return priceEndDate
  **/
  @ApiModelProperty(value = "")


  public String getPriceEndDate() {
    return priceEndDate;
  }

  public void setPriceEndDate(String priceEndDate) {
    this.priceEndDate = priceEndDate;
  }

  public PriceDetail recurrence(String recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * @return recurrence
  **/
  @ApiModelProperty(value = "")


  public String getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDetail priceDetail = (PriceDetail) o;
    return Objects.equals(this.priceType, priceDetail.priceType) &&
        Objects.equals(this.isInvoiceChargeable, priceDetail.isInvoiceChargeable) &&
        Objects.equals(this.priceNet, priceDetail.priceNet) &&
        Objects.equals(this.priceGross, priceDetail.priceGross) &&
        Objects.equals(this.priceVAT, priceDetail.priceVAT) &&
        Objects.equals(this.vatCode, priceDetail.vatCode) &&
        Objects.equals(this.priceStartDate, priceDetail.priceStartDate) &&
        Objects.equals(this.priceEndDate, priceDetail.priceEndDate) &&
        Objects.equals(this.recurrence, priceDetail.recurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceType, isInvoiceChargeable, priceNet, priceGross, priceVAT, vatCode, priceStartDate, priceEndDate, recurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDetail {\n");
    
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    isInvoiceChargeable: ").append(toIndentedString(isInvoiceChargeable)).append("\n");
    sb.append("    priceNet: ").append(toIndentedString(priceNet)).append("\n");
    sb.append("    priceGross: ").append(toIndentedString(priceGross)).append("\n");
    sb.append("    priceVAT: ").append(toIndentedString(priceVAT)).append("\n");
    sb.append("    vatCode: ").append(toIndentedString(vatCode)).append("\n");
    sb.append("    priceStartDate: ").append(toIndentedString(priceStartDate)).append("\n");
    sb.append("    priceEndDate: ").append(toIndentedString(priceEndDate)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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

