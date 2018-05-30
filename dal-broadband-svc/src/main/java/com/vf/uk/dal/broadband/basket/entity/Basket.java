package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Basket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Basket extends ResourceSupport {
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  @JsonProperty("affiliateId")
  private String affiliateId = null;

  @JsonProperty("basketId")
  private String basketId = null;

  @JsonProperty("changeCode")
  private String changeCode = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  @JsonProperty("hashvalue")
  private String hashvalue = null;

  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  @JsonProperty("journey")
  private Journey journey = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("packages")
  @Valid
  private List<ModelPackage> packages = null;

  @JsonProperty("priceDetails")
  private PriceDetails priceDetails = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("totalMonthlyPriceSaving")
  private String totalMonthlyPriceSaving = null;

  @JsonProperty("totalOneoffPriceSaving")
  private String totalOneoffPriceSaving = null;

  @JsonProperty("validated")
  private Boolean validated = null;

  @JsonProperty("vetOutcome")
  private VetOutcome vetOutcome = null;

  @JsonProperty("voucherCode")
  private String voucherCode = null;

  @JsonProperty("voucherDescription")
  private String voucherDescription = null;

  @JsonProperty("voucherErrorMessage")
  private String voucherErrorMessage = null;

  public Basket affiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
    return this;
  }

  /**
   * Get affiliateFlag
   * @return affiliateFlag
  **/
  @ApiModelProperty(value = "")


  public Boolean isAffiliateFlag() {
    return affiliateFlag;
  }

  public void setAffiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
  }

  public Basket affiliateId(String affiliateId) {
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

  public Basket basketId(String basketId) {
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

  public Basket changeCode(String changeCode) {
    this.changeCode = changeCode;
    return this;
  }

  /**
   * Get changeCode
   * @return changeCode
  **/
  @ApiModelProperty(value = "")


  public String getChangeCode() {
    return changeCode;
  }

  public void setChangeCode(String changeCode) {
    this.changeCode = changeCode;
  }

  public Basket customer(Customer customer) {
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

  public Basket customerRequestedDate(String customerRequestedDate) {
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

  public Basket deliveryInfo(DeliveryInfo deliveryInfo) {
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

  public Basket hashvalue(String hashvalue) {
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

  public Basket isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged
   * @return isChanged
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsChanged() {
    return isChanged;
  }

  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  public Basket journey(Journey journey) {
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

  public Basket metadata(Metadata metadata) {
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

  public Basket packages(List<ModelPackage> packages) {
    this.packages = packages;
    return this;
  }

  public Basket addPackagesItem(ModelPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<ModelPackage>();
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

  public List<ModelPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<ModelPackage> packages) {
    this.packages = packages;
  }

  public Basket priceDetails(PriceDetails priceDetails) {
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

  public Basket source(String source) {
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

  public Basket totalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
    this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
    return this;
  }

  /**
   * Get totalMonthlyPriceSaving
   * @return totalMonthlyPriceSaving
  **/
  @ApiModelProperty(value = "")


  public String getTotalMonthlyPriceSaving() {
    return totalMonthlyPriceSaving;
  }

  public void setTotalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
    this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
  }

  public Basket totalOneoffPriceSaving(String totalOneoffPriceSaving) {
    this.totalOneoffPriceSaving = totalOneoffPriceSaving;
    return this;
  }

  /**
   * Get totalOneoffPriceSaving
   * @return totalOneoffPriceSaving
  **/
  @ApiModelProperty(value = "")


  public String getTotalOneoffPriceSaving() {
    return totalOneoffPriceSaving;
  }

  public void setTotalOneoffPriceSaving(String totalOneoffPriceSaving) {
    this.totalOneoffPriceSaving = totalOneoffPriceSaving;
  }

  public Basket validated(Boolean validated) {
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

  public Basket vetOutcome(VetOutcome vetOutcome) {
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

  public Basket voucherCode(String voucherCode) {
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

  public Basket voucherDescription(String voucherDescription) {
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

  public Basket voucherErrorMessage(String voucherErrorMessage) {
    this.voucherErrorMessage = voucherErrorMessage;
    return this;
  }

  /**
   * Get voucherErrorMessage
   * @return voucherErrorMessage
  **/
  @ApiModelProperty(value = "")


  public String getVoucherErrorMessage() {
    return voucherErrorMessage;
  }

  public void setVoucherErrorMessage(String voucherErrorMessage) {
    this.voucherErrorMessage = voucherErrorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Basket basket = (Basket) o;
    return Objects.equals(this.affiliateFlag, basket.affiliateFlag) &&
        Objects.equals(this.affiliateId, basket.affiliateId) &&
        Objects.equals(this.basketId, basket.basketId) &&
        Objects.equals(this.changeCode, basket.changeCode) &&
        Objects.equals(this.customer, basket.customer) &&
        Objects.equals(this.customerRequestedDate, basket.customerRequestedDate) &&
        Objects.equals(this.deliveryInfo, basket.deliveryInfo) &&
        Objects.equals(this.hashvalue, basket.hashvalue) &&
        Objects.equals(this.isChanged, basket.isChanged) &&
        Objects.equals(this.journey, basket.journey) &&
        Objects.equals(this.metadata, basket.metadata) &&
        Objects.equals(this.packages, basket.packages) &&
        Objects.equals(this.priceDetails, basket.priceDetails) &&
        Objects.equals(this.source, basket.source) &&
        Objects.equals(this.totalMonthlyPriceSaving, basket.totalMonthlyPriceSaving) &&
        Objects.equals(this.totalOneoffPriceSaving, basket.totalOneoffPriceSaving) &&
        Objects.equals(this.validated, basket.validated) &&
        Objects.equals(this.vetOutcome, basket.vetOutcome) &&
        Objects.equals(this.voucherCode, basket.voucherCode) &&
        Objects.equals(this.voucherDescription, basket.voucherDescription) &&
        Objects.equals(this.voucherErrorMessage, basket.voucherErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateFlag, affiliateId, basketId, changeCode, customer, customerRequestedDate, deliveryInfo, hashvalue, isChanged, journey, metadata, packages, priceDetails, source, totalMonthlyPriceSaving, totalOneoffPriceSaving, validated, vetOutcome, voucherCode, voucherDescription, voucherErrorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basket {\n");
    
    sb.append("    affiliateFlag: ").append(toIndentedString(affiliateFlag)).append("\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    changeCode: ").append(toIndentedString(changeCode)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerRequestedDate: ").append(toIndentedString(customerRequestedDate)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    hashvalue: ").append(toIndentedString(hashvalue)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    totalMonthlyPriceSaving: ").append(toIndentedString(totalMonthlyPriceSaving)).append("\n");
    sb.append("    totalOneoffPriceSaving: ").append(toIndentedString(totalOneoffPriceSaving)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    vetOutcome: ").append(toIndentedString(vetOutcome)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    voucherDescription: ").append(toIndentedString(voucherDescription)).append("\n");
    sb.append("    voucherErrorMessage: ").append(toIndentedString(voucherErrorMessage)).append("\n");
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

