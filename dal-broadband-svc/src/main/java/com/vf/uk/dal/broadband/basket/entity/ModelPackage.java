package com.vf.uk.dal.broadband.basket.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

/**
 * ModelPackage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T10:34:26.484Z")
public class ModelPackage {
  private String packageId = null;

  private String accountCategory = null;

  private Integer sequence = null;

  private String packageType = null;

  private Boolean removable = null;

  private List<String> dependentOn = null;

  private String voucherCode = null;

  private Bundle bundle = null;

  private List<Hardware> hardwares = null;

  private List<Service> services = null;

  private List<Discount> discounts = null;

  private PriceDetails priceDetails = null;

  private boolean isChanged;

  private InstallationAddress installationAddress = null;

  private AppointmentWindow appointmentWindow = null;

  private ServicePoint servicePoint = null;
  
 private String serviceStartDate = null;
  
  private String phoneNumber = null;

  @JsonIgnore
	private boolean isVoucherApplicable = false;
	@JsonIgnore
	public boolean isVoucherApplicable() {
		return isVoucherApplicable;
	}

	public void setVoucherApplicable(boolean isVoucherApplicable) {
		this.isVoucherApplicable = isVoucherApplicable;
	}
  
  
  
  public ModelPackage packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Unique ID for the package
   * @return packageId
  **/
  @ApiModelProperty(value = "Unique ID for the package")
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public ModelPackage accountCategory(String accountCategory) {
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

  public ModelPackage sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Display sequence.  Make this the order the package was added to the basket (i.e. lowest number &#x3D; highest display order)
   * @return sequence
  **/
  @ApiModelProperty(value = "Display sequence.  Make this the order the package was added to the basket (i.e. lowest number = highest display order)")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public ModelPackage packageType(String packageType) {
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

  public ModelPackage removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

   /**
   * Flag to indicate if this package can be removed without affecting the integrity of the basket
   * @return removable
  **/
  @ApiModelProperty(value = "Flag to indicate if this package can be removed without affecting the integrity of the basket")
  public Boolean getRemovable() {
    return removable;
  }

  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }

  public ModelPackage dependentOn(List<String> dependentOn) {
    this.dependentOn = dependentOn;
    return this;
  }

  public ModelPackage addDependentOnItem(String dependentOnItem) {
    if (this.dependentOn == null) {
      this.dependentOn = new ArrayList<String>();
    }
    this.dependentOn.add(dependentOnItem);
    return this;
  }

   /**
   * List of package Ids on which this package is dependent on
   * @return dependentOn
  **/
  @ApiModelProperty(value = "List of package Ids on which this package is dependent on")
  public List<String> getDependentOn() {
    return dependentOn;
  }

  public void setDependentOn(List<String> dependentOn) {
    this.dependentOn = dependentOn;
  }

  public ModelPackage voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Vouchercode which is added to the package
   * @return voucherCode
  **/
  @ApiModelProperty(value = "Vouchercode which is added to the package")
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

  public ModelPackage bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")
  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public ModelPackage hardwares(List<Hardware> hardwares) {
    this.hardwares = hardwares;
    return this;
  }

  public ModelPackage addHardwaresItem(Hardware hardwaresItem) {
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
  public List<Hardware> getHardwares() {
    return hardwares;
  }

  public void setHardwares(List<Hardware> hardwares) {
    this.hardwares = hardwares;
  }

  public ModelPackage services(List<Service> services) {
    this.services = services;
    return this;
  }

  public ModelPackage addServicesItem(Service servicesItem) {
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
  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }

  public ModelPackage discounts(List<Discount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public ModelPackage addDiscountsItem(Discount discountsItem) {
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
  public List<Discount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<Discount> discounts) {
    this.discounts = discounts;
  }

  public ModelPackage priceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")
  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }

  public ModelPackage isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

   /**
   * value true/false. This will identify if there are any changes to the basket (at basket level and package level)
   * @return isChanged
  **/
  @ApiModelProperty(value = "value true/false. This will identify if there are any changes to the basket (at basket level and package level)")
  public Boolean getIsChanged() {
    return isChanged;
  }

  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  public ModelPackage installationAddress(InstallationAddress installationAddress) {
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

  public ModelPackage appointmentWindow(AppointmentWindow appointmentWindow) {
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

  public ModelPackage servicePoint(ServicePoint servicePoint) {
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


  public ModelPackage serviceStartDate(String serviceStartDate) {
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

public ModelPackage phoneNumber(String phoneNumber) {
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
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.packageId, _package.packageId) &&
        Objects.equals(this.accountCategory, _package.accountCategory) &&
        Objects.equals(this.sequence, _package.sequence) &&
        Objects.equals(this.packageType, _package.packageType) &&
        Objects.equals(this.removable, _package.removable) &&
        Objects.equals(this.dependentOn, _package.dependentOn) &&
        Objects.equals(this.voucherCode, _package.voucherCode) &&
        Objects.equals(this.bundle, _package.bundle) &&
        Objects.equals(this.hardwares, _package.hardwares) &&
        Objects.equals(this.services, _package.services) &&
        Objects.equals(this.discounts, _package.discounts) &&
        Objects.equals(this.priceDetails, _package.priceDetails) &&
        Objects.equals(this.isChanged, _package.isChanged) &&
        Objects.equals(this.installationAddress, _package.installationAddress) &&
        Objects.equals(this.appointmentWindow, _package.appointmentWindow) &&
        Objects.equals(this.servicePoint, _package.servicePoint)&&
        Objects.equals(this.serviceStartDate, _package.serviceStartDate) &&
        Objects.equals(this.phoneNumber, _package.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, accountCategory, sequence, packageType, removable, dependentOn, voucherCode, bundle, hardwares, services, discounts, priceDetails, isChanged, installationAddress, appointmentWindow, servicePoint,serviceStartDate,phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
    sb.append("    dependentOn: ").append(toIndentedString(dependentOn)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
    sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
    sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
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

