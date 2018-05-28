package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreatePackageResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CreatePackageResponse   {
  @JsonProperty("accountCategory")
  private String accountCategory = null;

  @JsonProperty("bundle")
  private Bundle bundle = null;

  @JsonProperty("dependentOn")
  @Valid
  private List<String> dependentOn = null;

  @JsonProperty("discounts")
  @Valid
  private List<Discount> discounts = null;

  @JsonProperty("hardwares")
  @Valid
  private List<Hardware> hardwares = null;

  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  @JsonProperty("packageId")
  private String packageId = null;

  @JsonProperty("packageType")
  private String packageType = null;

  @JsonProperty("priceDetails")
  private PriceDetails priceDetails = null;

  @JsonProperty("removable")
  private Boolean removable = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("services")
  @Valid
  private List<Service> services = null;

  @JsonProperty("voucherCode")
  private String voucherCode = null;

  public CreatePackageResponse accountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

  /**
   * Get accountCategory
   * @return accountCategory
  **/
  @ApiModelProperty(value = "")


  public String getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
  }

  public CreatePackageResponse bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public CreatePackageResponse dependentOn(List<String> dependentOn) {
    this.dependentOn = dependentOn;
    return this;
  }

  public CreatePackageResponse addDependentOnItem(String dependentOnItem) {
    if (this.dependentOn == null) {
      this.dependentOn = new ArrayList<String>();
    }
    this.dependentOn.add(dependentOnItem);
    return this;
  }

  /**
   * Get dependentOn
   * @return dependentOn
  **/
  @ApiModelProperty(value = "")


  public List<String> getDependentOn() {
    return dependentOn;
  }

  public void setDependentOn(List<String> dependentOn) {
    this.dependentOn = dependentOn;
  }

  public CreatePackageResponse discounts(List<Discount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CreatePackageResponse addDiscountsItem(Discount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<Discount>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * @return discounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Discount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<Discount> discounts) {
    this.discounts = discounts;
  }

  public CreatePackageResponse hardwares(List<Hardware> hardwares) {
    this.hardwares = hardwares;
    return this;
  }

  public CreatePackageResponse addHardwaresItem(Hardware hardwaresItem) {
    if (this.hardwares == null) {
      this.hardwares = new ArrayList<Hardware>();
    }
    this.hardwares.add(hardwaresItem);
    return this;
  }

  /**
   * Get hardwares
   * @return hardwares
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Hardware> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<Hardware> hardwares) {
    this.hardwares = hardwares;
  }

  public CreatePackageResponse isChanged(Boolean isChanged) {
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

  public CreatePackageResponse packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")


  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public CreatePackageResponse packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Get packageType
   * @return packageType
  **/
  @ApiModelProperty(value = "")


  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public CreatePackageResponse priceDetails(PriceDetails priceDetails) {
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

  public CreatePackageResponse removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

  /**
   * Get removable
   * @return removable
  **/
  @ApiModelProperty(value = "")


  public Boolean isRemovable() {
    return removable;
  }

  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }

  public CreatePackageResponse sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")


  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public CreatePackageResponse services(List<Service> services) {
    this.services = services;
    return this;
  }

  public CreatePackageResponse addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }

  public CreatePackageResponse voucherCode(String voucherCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePackageResponse createPackageResponse = (CreatePackageResponse) o;
    return Objects.equals(this.accountCategory, createPackageResponse.accountCategory) &&
        Objects.equals(this.bundle, createPackageResponse.bundle) &&
        Objects.equals(this.dependentOn, createPackageResponse.dependentOn) &&
        Objects.equals(this.discounts, createPackageResponse.discounts) &&
        Objects.equals(this.hardwares, createPackageResponse.hardwares) &&
        Objects.equals(this.isChanged, createPackageResponse.isChanged) &&
        Objects.equals(this.packageId, createPackageResponse.packageId) &&
        Objects.equals(this.packageType, createPackageResponse.packageType) &&
        Objects.equals(this.priceDetails, createPackageResponse.priceDetails) &&
        Objects.equals(this.removable, createPackageResponse.removable) &&
        Objects.equals(this.sequence, createPackageResponse.sequence) &&
        Objects.equals(this.services, createPackageResponse.services) &&
        Objects.equals(this.voucherCode, createPackageResponse.voucherCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategory, bundle, dependentOn, discounts, hardwares, isChanged, packageId, packageType, priceDetails, removable, sequence, services, voucherCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePackageResponse {\n");
    
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    dependentOn: ").append(toIndentedString(dependentOn)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

