package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdatePackage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class UpdatePackage   {
  @JsonProperty("accountCategory")
  private String accountCategory = null;

  @JsonProperty("bundle")
  private UpdateBundle bundle = null;

  @JsonProperty("hardwares")
  @Valid
  private List<UpdateDevice> hardwares = null;

  @JsonProperty("packageType")
  private String packageType = null;

  @JsonProperty("services")
  @Valid
  private List<UpdateService> services = null;

  public UpdatePackage accountCategory(String accountCategory) {
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

  public UpdatePackage bundle(UpdateBundle bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UpdateBundle getBundle() {
    return bundle;
  }

  public void setBundle(UpdateBundle bundle) {
    this.bundle = bundle;
  }

  public UpdatePackage hardwares(List<UpdateDevice> hardwares) {
    this.hardwares = hardwares;
    return this;
  }

  public UpdatePackage addHardwaresItem(UpdateDevice hardwaresItem) {
    if (this.hardwares == null) {
      this.hardwares = new ArrayList<UpdateDevice>();
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

  public List<UpdateDevice> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<UpdateDevice> hardwares) {
    this.hardwares = hardwares;
  }

  public UpdatePackage packageType(String packageType) {
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

  public UpdatePackage services(List<UpdateService> services) {
    this.services = services;
    return this;
  }

  public UpdatePackage addServicesItem(UpdateService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<UpdateService>();
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

  public List<UpdateService> getServices() {
    return services;
  }

  public void setServices(List<UpdateService> services) {
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
    UpdatePackage updatePackage = (UpdatePackage) o;
    return Objects.equals(this.accountCategory, updatePackage.accountCategory) &&
        Objects.equals(this.bundle, updatePackage.bundle) &&
        Objects.equals(this.hardwares, updatePackage.hardwares) &&
        Objects.equals(this.packageType, updatePackage.packageType) &&
        Objects.equals(this.services, updatePackage.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategory, bundle, hardwares, packageType, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePackage {\n");
    
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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

