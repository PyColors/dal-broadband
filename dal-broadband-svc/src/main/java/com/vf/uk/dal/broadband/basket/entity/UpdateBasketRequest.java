package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateBasketRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class UpdateBasketRequest   {
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("removeVoucherCode")
  private Boolean removeVoucherCode = null;

  @JsonProperty("vetOutcome")
  private VetOutcome vetOutcome = null;

  @JsonProperty("voucherCode")
  private String voucherCode = null;

  public UpdateBasketRequest affiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
    return this;
  }

  /**
   * To Specify Affiliated Journey
   * @return affiliateFlag
  **/
  @ApiModelProperty(example = "false", value = "To Specify Affiliated Journey")


  public Boolean isAffiliateFlag() {
    return affiliateFlag;
  }

  public void setAffiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
  }

  public UpdateBasketRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public UpdateBasketRequest customerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
    return this;
  }

  /**
   * Service request date specified by the customer
   * @return customerRequestedDate
  **/
  @ApiModelProperty(value = "Service request date specified by the customer")


  public String getCustomerRequestedDate() {
    return customerRequestedDate;
  }

  public void setCustomerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
  }

  public UpdateBasketRequest deliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }

  public UpdateBasketRequest metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public UpdateBasketRequest removeVoucherCode(Boolean removeVoucherCode) {
    this.removeVoucherCode = removeVoucherCode;
    return this;
  }

  /**
   *  remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket
   * @return removeVoucherCode
  **/
  @ApiModelProperty(example = "false", value = " remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket")


  public Boolean isRemoveVoucherCode() {
    return removeVoucherCode;
  }

  public void setRemoveVoucherCode(Boolean removeVoucherCode) {
    this.removeVoucherCode = removeVoucherCode;
  }

  public UpdateBasketRequest vetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
    return this;
  }

  /**
   * Get vetOutcome
   * @return vetOutcome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VetOutcome getVetOutcome() {
    return vetOutcome;
  }

  public void setVetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
  }

  public UpdateBasketRequest voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

  /**
   * voucher code  specified by the customer
   * @return voucherCode
  **/
  @ApiModelProperty(value = "voucher code  specified by the customer")


  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBasketRequest updateBasketRequest = (UpdateBasketRequest) o;
    return Objects.equals(this.affiliateFlag, updateBasketRequest.affiliateFlag) &&
        Objects.equals(this.customer, updateBasketRequest.customer) &&
        Objects.equals(this.customerRequestedDate, updateBasketRequest.customerRequestedDate) &&
        Objects.equals(this.deliveryInfo, updateBasketRequest.deliveryInfo) &&
        Objects.equals(this.metadata, updateBasketRequest.metadata) &&
        Objects.equals(this.removeVoucherCode, updateBasketRequest.removeVoucherCode) &&
        Objects.equals(this.vetOutcome, updateBasketRequest.vetOutcome) &&
        Objects.equals(this.voucherCode, updateBasketRequest.voucherCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateFlag, customer, customerRequestedDate, deliveryInfo, metadata, removeVoucherCode, vetOutcome, voucherCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBasketRequest {\n");
    
    sb.append("    affiliateFlag: ").append(toIndentedString(affiliateFlag)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerRequestedDate: ").append(toIndentedString(customerRequestedDate)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    removeVoucherCode: ").append(toIndentedString(removeVoucherCode)).append("\n");
    sb.append("    vetOutcome: ").append(toIndentedString(vetOutcome)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
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

