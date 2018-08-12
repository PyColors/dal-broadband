package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdatePackage.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class UpdatePackage   {
  
  /** The account category. */
  @JsonProperty("accountCategory")
  private String accountCategory = null;

  /** The bundle. */
  @JsonProperty("bundle")
  private UpdateBundle bundle = null;

  /** The hardwares. */
  @JsonProperty("hardwares")
  @Valid
  private List<UpdateDevice> hardwares = null;

  /** The package type. */
  @JsonProperty("packageType")
  private String packageType = null;

  /** The services. */
  @JsonProperty("services")
  @Valid
  private List<UpdateService> services = null;

  /**
   * Account category.
   *
   * @param accountCategory the account category
   * @return the update package
   */
  public UpdatePackage accountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

  /**
   * Get accountCategory.
   *
   * @return accountCategory
   */
  @ApiModelProperty(value = "")


  public String getAccountCategory() {
    return accountCategory;
  }

  /**
   * Sets the account category.
   *
   * @param accountCategory the new account category
   */
  public void setAccountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
  }

  /**
   * Bundle.
   *
   * @param bundle the bundle
   * @return the update package
   */
  public UpdatePackage bundle(UpdateBundle bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle.
   *
   * @return bundle
   */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateBundle getBundle() {
    return bundle;
  }

  /**
   * Sets the bundle.
   *
   * @param bundle the new bundle
   */
  public void setBundle(UpdateBundle bundle) {
    this.bundle = bundle;
  }

  /**
   * Hardwares.
   *
   * @param hardwares the hardwares
   * @return the update package
   */
  public UpdatePackage hardwares(List<UpdateDevice> hardwares) {
    this.hardwares = hardwares;
    return this;
  }

  /**
   * Adds the hardwares item.
   *
   * @param hardwaresItem the hardwares item
   * @return the update package
   */
  public UpdatePackage addHardwaresItem(UpdateDevice hardwaresItem) {
    if (this.hardwares == null) {
      this.hardwares = new ArrayList<>();
    }
    this.hardwares.add(hardwaresItem);
    return this;
  }

  /**
   * Get hardwares.
   *
   * @return hardwares
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<UpdateDevice> getHardwares() {
    return hardwares;
  }

  /**
   * Sets the hardwares.
   *
   * @param hardwares the new hardwares
   */
  public void setHardwares(List<UpdateDevice> hardwares) {
    this.hardwares = hardwares;
  }

  /**
   * Package type.
   *
   * @param packageType the package type
   * @return the update package
   */
  public UpdatePackage packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Get packageType.
   *
   * @return packageType
   */
  @ApiModelProperty(value = "")


  public String getPackageType() {
    return packageType;
  }

  /**
   * Sets the package type.
   *
   * @param packageType the new package type
   */
  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  /**
   * Services.
   *
   * @param services the services
   * @return the update package
   */
  public UpdatePackage services(List<UpdateService> services) {
    this.services = services;
    return this;
  }

  /**
   * Adds the services item.
   *
   * @param servicesItem the services item
   * @return the update package
   */
  public UpdatePackage addServicesItem(UpdateService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services.
   *
   * @return services
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<UpdateService> getServices() {
    return services;
  }

  /**
   * Sets the services.
   *
   * @param services the new services
   */
  public void setServices(List<UpdateService> services) {
    this.services = services;
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
    UpdatePackage updatePackage = (UpdatePackage) o;
    return Objects.equals(this.accountCategory, updatePackage.accountCategory) &&
        Objects.equals(this.bundle, updatePackage.bundle) &&
        Objects.equals(this.hardwares, updatePackage.hardwares) &&
        Objects.equals(this.packageType, updatePackage.packageType) &&
        Objects.equals(this.services, updatePackage.services);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountCategory, bundle, hardwares, packageType, services);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

