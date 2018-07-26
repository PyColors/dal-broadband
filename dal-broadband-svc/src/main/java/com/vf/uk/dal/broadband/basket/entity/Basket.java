package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Basket.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Basket extends ResourceSupport {
  
  /** The affiliate flag. */
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  /** The affiliate id. */
  @JsonProperty("affiliateId")
  private String affiliateId = null;

  /** The basket id. */
  @JsonProperty("basketId")
  private String basketId = null;

  /** The change code. */
  @JsonProperty("changeCode")
  private String changeCode = null;

  /** The customer. */
  @JsonProperty("customer")
  private Customer customer = null;

  /** The customer requested date. */
  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  /** The delivery info. */
  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  /** The hashvalue. */
  @JsonProperty("hashvalue")
  private String hashvalue = null;

  /** The is changed. */
  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  /** The journey. */
  @JsonProperty("journey")
  private Journey journey = null;

  /** The metadata. */
  @JsonProperty("metadata")
  private Metadata metadata = null;

  /** The packages. */
  @JsonProperty("packages")
  @Valid
  private List<ModelPackage> packages = null;

  /** The price details. */
  @JsonProperty("priceDetails")
  private PriceDetails priceDetails = null;

  /** The source. */
  @JsonProperty("source")
  private String source = null;

  /** The total monthly price saving. */
  @JsonProperty("totalMonthlyPriceSaving")
  private String totalMonthlyPriceSaving = null;

  /** The total oneoff price saving. */
  @JsonProperty("totalOneoffPriceSaving")
  private String totalOneoffPriceSaving = null;

  /** The validated. */
  @JsonProperty("validated")
  private Boolean validated = null;

  /** The vet outcome. */
  @JsonProperty("vetOutcome")
  private VetOutcome vetOutcome = null;

  /** The voucher code. */
  @JsonProperty("voucherCode")
  private String voucherCode = null;

  /** The voucher description. */
  @JsonProperty("voucherDescription")
  private String voucherDescription = null;

  /** The voucher error message. */
  @JsonProperty("voucherErrorMessage")
  private String voucherErrorMessage = null;

  /**
   * Affiliate flag.
   *
   * @param affiliateFlag the affiliate flag
   * @return the basket
   */
  public Basket affiliateFlag(Boolean affiliateFlag) {
    this.affiliateFlag = affiliateFlag;
    return this;
  }

  /**
   * Get affiliateFlag.
   *
   * @return affiliateFlag
   */

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
   * Affiliate id.
   *
   * @param affiliateId the affiliate id
   * @return the basket
   */
  public Basket affiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

  /**
   * Get affiliateId.
   *
   * @return affiliateId
   */
  @ApiModelProperty(value = "")


  public String getAffiliateId() {
    return affiliateId;
  }

  /**
   * Sets the affiliate id.
   *
   * @param affiliateId the new affiliate id
   */
  public void setAffiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
  }

  /**
   * Basket id.
   *
   * @param basketId the basket id
   * @return the basket
   */
  public Basket basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  /**
   * Get basketId.
   *
   * @return basketId
   */
  @ApiModelProperty(value = "")


  public String getBasketId() {
    return basketId;
  }

  /**
   * Sets the basket id.
   *
   * @param basketId the new basket id
   */
  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  /**
   * Change code.
   *
   * @param changeCode the change code
   * @return the basket
   */
  public Basket changeCode(String changeCode) {
    this.changeCode = changeCode;
    return this;
  }

  /**
   * Get changeCode.
   *
   * @return changeCode
   */
  @ApiModelProperty(value = "")


  public String getChangeCode() {
    return changeCode;
  }

  /**
   * Sets the change code.
   *
   * @param changeCode the new change code
   */
  public void setChangeCode(String changeCode) {
    this.changeCode = changeCode;
  }

  /**
   * Customer.
   *
   * @param customer the customer
   * @return the basket
   */
  public Basket customer(Customer customer) {
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
   * @return the basket
   */
  public Basket customerRequestedDate(String customerRequestedDate) {
    this.customerRequestedDate = customerRequestedDate;
    return this;
  }

  /**
   * Get customerRequestedDate.
   *
   * @return customerRequestedDate
   */
  @ApiModelProperty(value = "")


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
   * @return the basket
   */
  public Basket deliveryInfo(DeliveryInfo deliveryInfo) {
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
   * Hashvalue.
   *
   * @param hashvalue the hashvalue
   * @return the basket
   */
  public Basket hashvalue(String hashvalue) {
    this.hashvalue = hashvalue;
    return this;
  }

  /**
   * Get hashvalue.
   *
   * @return hashvalue
   */
  @ApiModelProperty(value = "")


  public String getHashvalue() {
    return hashvalue;
  }

  /**
   * Sets the hashvalue.
   *
   * @param hashvalue the new hashvalue
   */
  public void setHashvalue(String hashvalue) {
    this.hashvalue = hashvalue;
  }

  /**
   * Checks if is changed.
   *
   * @param isChanged the is changed
   * @return the basket
   */
  public Basket isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged.
   *
   * @return isChanged
   */

  public Boolean isIsChanged() {
    return isChanged;
  }

  /**
   * Sets the checks if is changed.
   *
   * @param isChanged the new checks if is changed
   */
  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  /**
   * Journey.
   *
   * @param journey the journey
   * @return the basket
   */
  public Basket journey(Journey journey) {
    this.journey = journey;
    return this;
  }

  /**
   * Get journey.
   *
   * @return journey
   */
  @ApiModelProperty(value = "")

  @Valid

  public Journey getJourney() {
    return journey;
  }

  /**
   * Sets the journey.
   *
   * @param journey the new journey
   */
  public void setJourney(Journey journey) {
    this.journey = journey;
  }

  /**
   * Metadata.
   *
   * @param metadata the metadata
   * @return the basket
   */
  public Basket metadata(Metadata metadata) {
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
   * Packages.
   *
   * @param packages the packages
   * @return the basket
   */
  public Basket packages(List<ModelPackage> packages) {
    this.packages = packages;
    return this;
  }

  /**
   * Adds the packages item.
   *
   * @param packagesItem the packages item
   * @return the basket
   */
  public Basket addPackagesItem(ModelPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages.
   *
   * @return packages
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<ModelPackage> getPackages() {
    return packages;
  }

  /**
   * Sets the packages.
   *
   * @param packages the new packages
   */
  public void setPackages(List<ModelPackage> packages) {
    this.packages = packages;
  }

  /**
   * Price details.
   *
   * @param priceDetails the price details
   * @return the basket
   */
  public Basket priceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails.
   *
   * @return priceDetails
   */
  @ApiModelProperty(value = "")

  @Valid

  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  /**
   * Sets the price details.
   *
   * @param priceDetails the new price details
   */
  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }

  /**
   * Source.
   *
   * @param source the source
   * @return the basket
   */
  public Basket source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source.
   *
   * @return source
   */
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  /**
   * Sets the source.
   *
   * @param source the new source
   */
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Total monthly price saving.
   *
   * @param totalMonthlyPriceSaving the total monthly price saving
   * @return the basket
   */
  public Basket totalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
    this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
    return this;
  }

  /**
   * Get totalMonthlyPriceSaving.
   *
   * @return totalMonthlyPriceSaving
   */
  @ApiModelProperty(value = "")


  public String getTotalMonthlyPriceSaving() {
    return totalMonthlyPriceSaving;
  }

  /**
   * Sets the total monthly price saving.
   *
   * @param totalMonthlyPriceSaving the new total monthly price saving
   */
  public void setTotalMonthlyPriceSaving(String totalMonthlyPriceSaving) {
    this.totalMonthlyPriceSaving = totalMonthlyPriceSaving;
  }

  /**
   * Total oneoff price saving.
   *
   * @param totalOneoffPriceSaving the total oneoff price saving
   * @return the basket
   */
  public Basket totalOneoffPriceSaving(String totalOneoffPriceSaving) {
    this.totalOneoffPriceSaving = totalOneoffPriceSaving;
    return this;
  }

  /**
   * Get totalOneoffPriceSaving.
   *
   * @return totalOneoffPriceSaving
   */
  @ApiModelProperty(value = "")


  public String getTotalOneoffPriceSaving() {
    return totalOneoffPriceSaving;
  }

  /**
   * Sets the total oneoff price saving.
   *
   * @param totalOneoffPriceSaving the new total oneoff price saving
   */
  public void setTotalOneoffPriceSaving(String totalOneoffPriceSaving) {
    this.totalOneoffPriceSaving = totalOneoffPriceSaving;
  }

  /**
   * Validated.
   *
   * @param validated the validated
   * @return the basket
   */
  public Basket validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

  /**
   * Get validated.
   *
   * @return validated
   */

  public Boolean isValidated() {
    return validated;
  }

  /**
   * Sets the validated.
   *
   * @param validated the new validated
   */
  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  /**
   * Vet outcome.
   *
   * @param vetOutcome the vet outcome
   * @return the basket
   */
  public Basket vetOutcome(VetOutcome vetOutcome) {
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
   * @return the basket
   */
  public Basket voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

  /**
   * Get voucherCode.
   *
   * @return voucherCode
   */
  @ApiModelProperty(value = "")


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

  /**
   * Voucher description.
   *
   * @param voucherDescription the voucher description
   * @return the basket
   */
  public Basket voucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
    return this;
  }

  /**
   * Get voucherDescription.
   *
   * @return voucherDescription
   */
  @ApiModelProperty(value = "")


  public String getVoucherDescription() {
    return voucherDescription;
  }

  /**
   * Sets the voucher description.
   *
   * @param voucherDescription the new voucher description
   */
  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }

  /**
   * Voucher error message.
   *
   * @param voucherErrorMessage the voucher error message
   * @return the basket
   */
  public Basket voucherErrorMessage(String voucherErrorMessage) {
    this.voucherErrorMessage = voucherErrorMessage;
    return this;
  }

  /**
   * Get voucherErrorMessage.
   *
   * @return voucherErrorMessage
   */
  @ApiModelProperty(value = "")


  public String getVoucherErrorMessage() {
    return voucherErrorMessage;
  }

  /**
   * Sets the voucher error message.
   *
   * @param voucherErrorMessage the new voucher error message
   */
  public void setVoucherErrorMessage(String voucherErrorMessage) {
    this.voucherErrorMessage = voucherErrorMessage;
  }



  

  /* (non-Javadoc)
   * @see org.springframework.hateoas.ResourceSupport#toString()
   */
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

