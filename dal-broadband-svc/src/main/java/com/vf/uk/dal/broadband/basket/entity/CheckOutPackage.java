package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CheckOutPackage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class CheckOutPackage   {
  @JsonProperty("accountCategory")
  private String accountCategory = null;

  @JsonProperty("bundle")
  private CheckOutBundle bundle = null;

  @JsonProperty("dependentOn")
  @Valid
  private List<String> dependentOn = null;

  @JsonProperty("discounts")
  @Valid
  private List<Discount> discounts = null;

  @JsonProperty("hardwares")
  @Valid
  private List<CheckOutHardware> hardwares = null;

  @JsonProperty("packageId")
  private String packageId = null;

  @JsonProperty("packageType")
  private String packageType = null;

  @JsonProperty("priceDetails")
  private PriceDetails priceDetails = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("services")
  @Valid
  private List<Service> services = null;

  /**
   * 
   * @param accountCategory
   * @return
   */
  public CheckOutPackage accountCategory(String accountCategory) {
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

  /**
   * 
   * @param bundle
   * @return
   */
  public CheckOutPackage bundle(CheckOutBundle bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CheckOutBundle getBundle() {
    return bundle;
  }

  public void setBundle(CheckOutBundle bundle) {
    this.bundle = bundle;
  }

  /**
   * 
   * @param dependentOn
   * @return
   */
  public CheckOutPackage dependentOn(List<String> dependentOn) {
    this.dependentOn = dependentOn;
    return this;
  }

  /**
   * 
   * @param dependentOnItem
   * @return
   */
  public CheckOutPackage addDependentOnItem(String dependentOnItem) {
    if (this.dependentOn == null) {
      this.dependentOn = new ArrayList<>();
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

  /**
   * 
   * @param discounts
   * @return
   */
  public CheckOutPackage discounts(List<Discount> discounts) {
    this.discounts = discounts;
    return this;
  }

  /**
   * 
   * @param discountsItem
   * @return
   */
  public CheckOutPackage addDiscountsItem(Discount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
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

  /**
   * 
   * @param hardwares
   * @return
   */
  public CheckOutPackage hardwares(List<CheckOutHardware> hardwares) {
    this.hardwares = hardwares;
    return this;
  }

  /**
   * 
   * @param hardwaresItem
   * @return
   */
  public CheckOutPackage addHardwaresItem(CheckOutHardware hardwaresItem) {
    if (this.hardwares == null) {
      this.hardwares = new ArrayList<>();
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

  public List<CheckOutHardware> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<CheckOutHardware> hardwares) {
    this.hardwares = hardwares;
  }

  /**
   * 
   * @param packageId
   * @return
   */
  public CheckOutPackage packageId(String packageId) {
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

  /**
   * 
   * @param packageType
   * @return
   */
  public CheckOutPackage packageType(String packageType) {
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

  /**
   * 
   * @param priceDetails
   * @return
   */
  public CheckOutPackage priceDetails(PriceDetails priceDetails) {
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

  /**
   * 
   * @param sequence
   * @return
   */
  public CheckOutPackage sequence(Integer sequence) {
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

  /**
   * 
   * @param services
   * @return
   */
  public CheckOutPackage services(List<Service> services) {
    this.services = services;
    return this;
  }

  /**
   * 
   * @param servicesItem
   * @return
   */
  public CheckOutPackage addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckOutPackage checkOutPackage = (CheckOutPackage) o;
    return Objects.equals(this.accountCategory, checkOutPackage.accountCategory) &&
        Objects.equals(this.bundle, checkOutPackage.bundle) &&
        Objects.equals(this.dependentOn, checkOutPackage.dependentOn) &&
        Objects.equals(this.discounts, checkOutPackage.discounts) &&
        Objects.equals(this.hardwares, checkOutPackage.hardwares) &&
        Objects.equals(this.packageId, checkOutPackage.packageId) &&
        Objects.equals(this.packageType, checkOutPackage.packageType) &&
        Objects.equals(this.priceDetails, checkOutPackage.priceDetails) &&
        Objects.equals(this.sequence, checkOutPackage.sequence) &&
        Objects.equals(this.services, checkOutPackage.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategory, bundle, dependentOn, discounts, hardwares, packageId, packageType, priceDetails, sequence, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOutPackage {\n");
    
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    dependentOn: ").append(toIndentedString(dependentOn)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

