package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CheckOutBasket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CheckOutBasket   {
  @JsonProperty("affiliateId")
  private String affiliateId = null;

  @JsonProperty("basketId")
  private String basketId = null;

  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  @JsonProperty("hashvalue")
  private String hashvalue = null;

  @JsonProperty("journey")
  private Journey journey = null;

  @JsonProperty("packages")
  @Valid
  private List<CheckOutPackage> packages = null;

  @JsonProperty("priceDetails")
  private PriceDetails priceDetails = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("validated")
  private Boolean validated = null;

  @JsonProperty("vetOutcome")
  private VetOutcome vetOutcome = null;

  @JsonProperty("voucherCode")
  private String voucherCode = null;

  @JsonProperty("voucherDescription")
  private String voucherDescription = null;

  public CheckOutBasket affiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

  /**
   * Get affiliateId
   * @return affiliateId
  **/
  @ApiModelProperty(value = "")


  public String getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
  }

  public CheckOutBasket basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  /**
   * Get basketId
   * @return basketId
  **/
  @ApiModelProperty(value = "")


  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  public CheckOutBasket customerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
    return this;
  }

  /**
   * Get customerRequestedDate
   * @return customerRequestedDate
  **/
  @ApiModelProperty(value = "")


  public String getCustomerRequestedDate() {
    return customerRequestedDate;
  }

  public void setCustomerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
  }

  public CheckOutBasket deliveryInfo(DeliveryInfo deliveryInfo) {
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

  public CheckOutBasket hashvalue(String hashvalue) {
    this.hashvalue = hashvalue;
    return this;
  }

  /**
   * Get hashvalue
   * @return hashvalue
  **/
  @ApiModelProperty(value = "")


  public String getHashvalue() {
    return hashvalue;
  }

  public void setHashvalue(String hashvalue) {
    this.hashvalue = hashvalue;
  }

  public CheckOutBasket journey(Journey journey) {
    this.journey = journey;
    return this;
  }

  /**
   * Get journey
   * @return journey
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Journey getJourney() {
    return journey;
  }

  public void setJourney(Journey journey) {
    this.journey = journey;
  }

  public CheckOutBasket packages(List<CheckOutPackage> packages) {
    this.packages = packages;
    return this;
  }

  public CheckOutBasket addPackagesItem(CheckOutPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CheckOutPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<CheckOutPackage> packages) {
    this.packages = packages;
  }

  public CheckOutBasket priceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }

  public CheckOutBasket source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CheckOutBasket validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

  /**
   * Get validated
   * @return validated
  **/
  @ApiModelProperty(value = "")


  public Boolean isValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public CheckOutBasket vetOutcome(VetOutcome vetOutcome) {
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

  public CheckOutBasket voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

  /**
   * Get voucherCode
   * @return voucherCode
  **/
  @ApiModelProperty(value = "")


  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

  public CheckOutBasket voucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
    return this;
  }

  /**
   * Get voucherDescription
   * @return voucherDescription
  **/
  @ApiModelProperty(value = "")


  public String getVoucherDescription() {
    return voucherDescription;
  }

  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckOutBasket checkOutBasket = (CheckOutBasket) o;
    return Objects.equals(this.affiliateId, checkOutBasket.affiliateId) &&
        Objects.equals(this.basketId, checkOutBasket.basketId) &&
        Objects.equals(this.customerRequestedDate, checkOutBasket.customerRequestedDate) &&
        Objects.equals(this.deliveryInfo, checkOutBasket.deliveryInfo) &&
        Objects.equals(this.hashvalue, checkOutBasket.hashvalue) &&
        Objects.equals(this.journey, checkOutBasket.journey) &&
        Objects.equals(this.packages, checkOutBasket.packages) &&
        Objects.equals(this.priceDetails, checkOutBasket.priceDetails) &&
        Objects.equals(this.source, checkOutBasket.source) &&
        Objects.equals(this.validated, checkOutBasket.validated) &&
        Objects.equals(this.vetOutcome, checkOutBasket.vetOutcome) &&
        Objects.equals(this.voucherCode, checkOutBasket.voucherCode) &&
        Objects.equals(this.voucherDescription, checkOutBasket.voucherDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateId, basketId, customerRequestedDate, deliveryInfo, hashvalue, journey, packages, priceDetails, source, validated, vetOutcome, voucherCode, voucherDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOutBasket {\n");
    
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    customerRequestedDate: ").append(toIndentedString(customerRequestedDate)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    hashvalue: ").append(toIndentedString(hashvalue)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    vetOutcome: ").append(toIndentedString(vetOutcome)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    voucherDescription: ").append(toIndentedString(voucherDescription)).append("\n");
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

