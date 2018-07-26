package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateBasketRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class UpdateBasketRequest   {
  
  /** The affiliate flag. */
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  /** The customer. */
  @JsonProperty("customer")
  private Customer customer = null;

  /** The customer requested date. */
  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  /** The delivery info. */
  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  /** The metadata. */
  @JsonProperty("metadata")
  private Metadata metadata = null;

  /** The remove voucher code. */
  @JsonProperty("removeVoucherCode")
  private Boolean removeVoucherCode = null;

  /** The vet outcome. */
  @JsonProperty("vetOutcome")
  private VetOutcome vetOutcome = null;

  /** The voucher code. */
  @JsonProperty("voucherCode")
  private String voucherCode = null;

  /**
   * Affiliate flag.
   *
   * @param affiliateFlag the affiliate flag
   * @return the update basket request
   */
  public UpdateBasketRequest affiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
    return this;
  }

  /**
   * To Specify Affiliated Journey.
   *
   * @return affiliateFlag
   */
  @ApiModelProperty(example = "false", value = "To Specify Affiliated Journey")


  public Boolean isAffiliateFlag() {
    return affiliateFlag;
  }

  /**
   * Sets the affiliate flag.
   *
   * @param affiliateFlag the new affiliate flag
   */
  public void setAffiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
  }

  /**
   * Customer.
   *
   * @param customer the customer
   * @return the update basket request
   */
  public UpdateBasketRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer.
   *
   * @return customer
   */
  @ApiModelProperty(value = "")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  /**
   * Sets the customer.
   *
   * @param customer the new customer
   */
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Customer requested date.
   *
   * @param customerRequestedDate the customer requested date
   * @return the update basket request
   */
  public UpdateBasketRequest customerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
    return this;
  }

  /**
   * Service request date specified by the customer.
   *
   * @return customerRequestedDate
   */
  @ApiModelProperty(value = "Service request date specified by the customer")


  public String getCustomerRequestedDate() {
    return customerRequestedDate;
  }

  /**
   * Sets the customer requested date.
   *
   * @param customerRequestedDate the new customer requested date
   */
  public void setCustomerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
  }

  /**
   * Delivery info.
   *
   * @param deliveryInfo the delivery info
   * @return the update basket request
   */
  public UpdateBasketRequest deliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * Get deliveryInfo.
   *
   * @return deliveryInfo
   */
  @ApiModelProperty(value = "")

  @Valid

  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  /**
   * Sets the delivery info.
   *
   * @param deliveryInfo the new delivery info
   */
  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }

  /**
   * Metadata.
   *
   * @param metadata the metadata
   * @return the update basket request
   */
  public UpdateBasketRequest metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata.
   *
   * @return metadata
   */
  @ApiModelProperty(value = "")

  @Valid

  public Metadata getMetadata() {
    return metadata;
  }

  /**
   * Sets the metadata.
   *
   * @param metadata the new metadata
   */
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  /**
   * Removes the voucher code.
   *
   * @param removeVoucherCode the remove voucher code
   * @return the update basket request
   */
  public UpdateBasketRequest removeVoucherCode(Boolean removeVoucherCode) {
    this.removeVoucherCode = removeVoucherCode;
    return this;
  }

  /**
   *  remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket.
   *
   * @return removeVoucherCode
   */
  @ApiModelProperty(example = "false", value = " remove the voucher code  specified by the customer if you pass true we will remove the voucher from basket")


  public Boolean isRemoveVoucherCode() {
    return removeVoucherCode;
  }

  /**
   * Sets the removes the voucher code.
   *
   * @param removeVoucherCode the new removes the voucher code
   */
  public void setRemoveVoucherCode(Boolean removeVoucherCode) {
    this.removeVoucherCode = removeVoucherCode;
  }

  /**
   * Vet outcome.
   *
   * @param vetOutcome the vet outcome
   * @return the update basket request
   */
  public UpdateBasketRequest vetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
    return this;
  }

  /**
   * Get vetOutcome.
   *
   * @return vetOutcome
   */
  @ApiModelProperty(value = "")

  @Valid

  public VetOutcome getVetOutcome() {
    return vetOutcome;
  }

  /**
   * Sets the vet outcome.
   *
   * @param vetOutcome the new vet outcome
   */
  public void setVetOutcome(VetOutcome vetOutcome) {
    this.vetOutcome = vetOutcome;
  }

  /**
   * Voucher code.
   *
   * @param voucherCode the voucher code
   * @return the update basket request
   */
  public UpdateBasketRequest voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

  /**
   * voucher code  specified by the customer.
   *
   * @return voucherCode
   */
  @ApiModelProperty(value = "voucher code  specified by the customer")


  public String getVoucherCode() {
    return voucherCode;
  }

  /**
   * Sets the voucher code.
   *
   * @param voucherCode the new voucher code
   */
  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(affiliateFlag, customer, customerRequestedDate, deliveryInfo, metadata, removeVoucherCode, vetOutcome, voucherCode);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

