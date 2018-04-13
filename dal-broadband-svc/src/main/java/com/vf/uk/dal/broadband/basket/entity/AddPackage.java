package com.vf.uk.dal.broadband.basket.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddPackage
 */
public class AddPackage {
  private String packageType = null;

  private String accountCategory = null;

  private AddProduct bundle = null;

  private List<AddProduct> hardwares = null;

  private List<AddProduct> services = null;

  private InstallationAddress installationAddress = null;

  private AppointmentWindow appointmentWindow = null;

  private ServicePoint servicePoint = null;

  private String serviceStartDate = null;
  
  private String phoneNumber = null;

  public AddPackage packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

   /**
   * Type of the package. Possible list is \&quot;Acquisition\&quot;, \&quot;Retention\&quot;, \&quot;TariffMigration\&quot;, \&quot;PreToPost\&quot;, \&quot;Modify\&quot;
   * @return packageType
  **/
  @ApiModelProperty(value = "Type of the package. Possible list is \"Acquisition\", \"Retention\", \"TariffMigration\", \"PreToPost\", \"Modify\"")
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

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

  public AddPackage bundle(AddProduct bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")
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
      this.hardwares = new ArrayList<AddProduct>();
    }
    this.hardwares.add(hardwaresItem);
    return this;
  }

   /**
   * Get hardwares
   * @return hardwares
  **/
  @ApiModelProperty(value = "")
  public List<AddProduct> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<AddProduct> hardwares) {
    this.hardwares = hardwares;
  }

  public AddPackage services(List<AddProduct> services) {
    this.services = services;
    return this;
  }

  public AddPackage addServicesItem(AddProduct servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<AddProduct>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(value = "")
  public List<AddProduct> getServices() {
    return services;
  }

  public void setServices(List<AddProduct> services) {
    this.services = services;
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
  public InstallationAddress getInstallationAddress() {
    return installationAddress;
  }

  public void setInstallationAddress(InstallationAddress installationAddress) {
    this.installationAddress = installationAddress;
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
  public AppointmentWindow getAppointmentWindow() {
    return appointmentWindow;
  }

  public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
    this.appointmentWindow = appointmentWindow;
  }

  public AddPackage servicePoint(ServicePoint servicePoint) {
    this.servicePoint = servicePoint;
    return this;
  }

   /**
   * Get servicePoint
   * @return servicePoint
  **/
  @ApiModelProperty(value = "")
  public ServicePoint getServicePoint() {
    return servicePoint;
  }

  public void setServicePoint(ServicePoint servicePoint) {
    this.servicePoint = servicePoint;
  }

  public AddPackage serviceStartDate(String serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
    return this;
  }
  /**
   * PhoneNumber for FLBB
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone Number for FLBB")
   public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public AddPackage phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
/**
   * Service Start Date for FLBB
   * @return serviceStartDate
  **/
  @ApiModelProperty(value = "Service Start Date for FLBB" ,example="2017-10-01T09:45:00.000+02:00")
  public String getServiceStartDate() {
    return serviceStartDate;
  }

  public void setServiceStartDate(String serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPackage addPackage = (AddPackage) o;
    return Objects.equals(this.packageType, addPackage.packageType) &&
        Objects.equals(this.accountCategory, addPackage.accountCategory) &&
        Objects.equals(this.bundle, addPackage.bundle) &&
        Objects.equals(this.hardwares, addPackage.hardwares) &&
        Objects.equals(this.services, addPackage.services) &&
        Objects.equals(this.installationAddress, addPackage.installationAddress) &&
        Objects.equals(this.appointmentWindow, addPackage.appointmentWindow) &&
        Objects.equals(this.servicePoint, addPackage.servicePoint) &&
        Objects.equals(this.phoneNumber, addPackage.phoneNumber) &&
        Objects.equals(this.serviceStartDate, addPackage.serviceStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageType, accountCategory, bundle, hardwares, services, installationAddress, appointmentWindow, servicePoint,phoneNumber, serviceStartDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPackage {\n");
    
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
    sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
    sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
    sb.append("    serviceStartDate: ").append(toIndentedString(serviceStartDate)).append("\n");
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

