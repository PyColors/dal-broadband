package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddPackage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class AddPackage   {
  @JsonProperty("accountCategory")
  private String accountCategory = null;

  @JsonProperty("appointmentWindow")
  private AppointmentWindow appointmentWindow = null;

  @JsonProperty("bundle")
  private AddProduct bundle = null;

  @JsonProperty("hardwares")
  @Valid
  private List<AddProduct> hardwares = null;

  @JsonProperty("installationAddress")
  private InstallationAddress installationAddress = null;

  @JsonProperty("packageType")
  private String packageType = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("servicePoint")
  private BasketServicePoint servicePoint = null;

  @JsonProperty("serviceStartDate")
  private String serviceStartDate = null;

  @JsonProperty("services")
  @Valid
  private List<AddProduct> services = null;

  public AddPackage accountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

  /**
   * If the package was constructed in a segment sensitive way, this field contains the segment (example customer or business)
   * @return accountCategory
  **/
  @ApiModelProperty(value = "If the package was constructed in a segment sensitive way, this field contains the segment (example customer or business)")


  public String getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(String accountCategory) {
    this.accountCategory = accountCategory;
  }

  public AddPackage appointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
    return this;
  }

  /**
   * Get appointmentWindow
   * @return appointmentWindow
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentWindow getAppointmentWindow() {
    return appointmentWindow;
  }

  public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
  }

  public AddPackage bundle(AddProduct bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AddProduct getBundle() {
    return bundle;
  }

  public void setBundle(AddProduct bundle) {
    this.bundle = bundle;
  }

  public AddPackage hardwares(List<AddProduct> hardwares) {
    this.hardwares = hardwares;
    return this;
  }

  public AddPackage addHardwaresItem(AddProduct hardwaresItem) {
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

  public List<AddProduct> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<AddProduct> hardwares) {
    this.hardwares = hardwares;
  }

  public AddPackage installationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
    return this;
  }

  /**
   * Get installationAddress
   * @return installationAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
  }

  public AddPackage packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Type of the package. Possible list is \"Acquisition\", \"Retention\", \"TariffMigration\", \"PreToPost\", \"Modify\"
   * @return packageType
  **/
  @ApiModelProperty(value = "Type of the package. Possible list is \"Acquisition\", \"Retention\", \"TariffMigration\", \"PreToPost\", \"Modify\"")


  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public AddPackage phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone Number for FLBB
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone Number for FLBB")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AddPackage servicePoint(BasketServicePoint servicePoint) {
    this.servicePoint = servicePoint;
    return this;
  }

  /**
   * Get servicePoint
   * @return servicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasketServicePoint getServicePoint() {
    return servicePoint;
  }

  public void setServicePoint(BasketServicePoint servicePoint) {
    this.servicePoint = servicePoint;
  }

  public AddPackage serviceStartDate(String serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
    return this;
  }

  /**
   * Service Start Date for FLBB
   * @return serviceStartDate
  **/
  @ApiModelProperty(value = "Service Start Date for FLBB - 2017-10-01T09:45:00.000+02:00")


  public String getServiceStartDate() {
    return serviceStartDate;
  }

  public void setServiceStartDate(String serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
  }

  public AddPackage services(List<AddProduct> services) {
    this.services = services;
    return this;
  }

  public AddPackage addServicesItem(AddProduct servicesItem) {
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

  public List<AddProduct> getServices() {
    return services;
  }

  public void setServices(List<AddProduct> services) {
    this.services = services;
  }


  

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPackage {\n");
    
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
    sb.append("    serviceStartDate: ").append(toIndentedString(serviceStartDate)).append("\n");
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

