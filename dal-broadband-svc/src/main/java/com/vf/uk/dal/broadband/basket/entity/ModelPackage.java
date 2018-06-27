package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ModelPackage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T16:03:05.626Z")

public class ModelPackage {
	@JsonProperty("accountCategory")
	private String accountCategory = null;

	@JsonProperty("appointmentWindow")
	private AppointmentWindow appointmentWindow = null;

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

	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	@JsonProperty("isChanged")
	private Boolean isChanged = null;

	@JsonProperty("linePackageType")
	private String linePackageType = null;

	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	@JsonProperty("packageId")
	private String packageId = null;

	@JsonProperty("packageType")
	private String packageType = null;

	@JsonProperty("phoneNumber")
	private String phoneNumber = null;

	@JsonProperty("planType")
	private String planType = null;

	@JsonProperty("priceDetails")
	private PriceDetails priceDetails = null;

	@JsonProperty("removable")
	private Boolean removable = null;

	@JsonProperty("sequence")
	private Integer sequence = null;

	@JsonProperty("servicePoint")
	private BasketServicePoint servicePoint = null;

	@JsonProperty("serviceStartDate")
	private String serviceStartDate = null;

	@JsonProperty("services")
	@Valid
	private List<Service> services = null;

	@JsonProperty("voucherCode")
	private String voucherCode = null;

	public ModelPackage accountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
		return this;
	}

	/**
	 * If the package was constructed in a segment sensitive way, this field
	 * contains the segment (example customer or business)
	 * 
	 * @return accountCategory
	 **/
	@ApiModelProperty(value = "If the package was constructed in a segment sensitive way, this field contains the segment (example customer or business)")

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public ModelPackage appointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
		return this;
	}

	/**
	 * Get appointmentWindow
	 * 
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

	public ModelPackage bundle(Bundle bundle) {
		this.bundle = bundle;
		return this;
	}

	/**
	 * Get bundle
	 * 
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
	 * 
	 * @return dependentOn
	 **/
	@ApiModelProperty(value = "List of package Ids on which this package is dependent on")

	public List<String> getDependentOn() {
		return dependentOn;
	}

	public void setDependentOn(List<String> dependentOn) {
		this.dependentOn = dependentOn;
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
	 * 
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
	 * 
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

	public ModelPackage installationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
		return this;
	}

	/**
	 * Get installationAddress
	 * 
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

	public ModelPackage isChanged(Boolean isChanged) {
		this.isChanged = isChanged;
		return this;
	}

	/**
	 * value true/false. This will identify if there are any changes to the
	 * basket (at basket level and package level)
	 * 
	 * @return isChanged
	 **/

	public Boolean isIsChanged() {
		return isChanged;
	}

	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

	public ModelPackage linePackageType(String linePackageType) {
		this.linePackageType = linePackageType;
		return this;
	}

	/**
	 * Get linePackageType
	 * 
	 * @return linePackageType
	 **/
	@ApiModelProperty(value = "")

	public String getLinePackageType() {
		return linePackageType;
	}

	public void setLinePackageType(String linePackageType) {
		this.linePackageType = linePackageType;
	}

	public ModelPackage lineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * Get lineTreatmentType
	 * 
	 * @return lineTreatmentType
	 **/
	@ApiModelProperty(value = "")

	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	public ModelPackage packageId(String packageId) {
		this.packageId = packageId;
		return this;
	}

	/**
	 * Unique ID for the package
	 * 
	 * @return packageId
	 **/
	@ApiModelProperty(value = "Unique ID for the package")

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public ModelPackage packageType(String packageType) {
		this.packageType = packageType;
		return this;
	}

	/**
	 * Type of the package. Possible list is \"Acquisition\", \"Retention\",
	 * \"TariffMigration\", \"PreToPost\", \"Modify\"
	 * 
	 * @return packageType
	 **/
	@ApiModelProperty(value = "Type of the package. Possible list is \"Acquisition\", \"Retention\", \"TariffMigration\", \"PreToPost\", \"Modify\"")

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public ModelPackage phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	/**
	 * Phone Number for FLBB
	 * 
	 * @return phoneNumber
	 **/
	@ApiModelProperty(value = "Phone Number for FLBB")

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ModelPackage planType(String planType) {
		this.planType = planType;
		return this;
	}

	/**
	 * Get planType
	 * 
	 * @return planType
	 **/
	@ApiModelProperty(value = "")

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public ModelPackage priceDetails(PriceDetails priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	/**
	 * Get priceDetails
	 * 
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

	public ModelPackage removable(Boolean removable) {
		this.removable = removable;
		return this;
	}

	/**
	 * Flag to indicate if this package can be removed without affecting the
	 * integrity of the basket
	 * 
	 * @return removable
	 **/

	public Boolean isRemovable() {
		return removable;
	}

	public void setRemovable(Boolean removable) {
		this.removable = removable;
	}

	public ModelPackage sequence(Integer sequence) {
		this.sequence = sequence;
		return this;
	}

	/**
	 * Display sequence. Make this the order the package was added to the basket
	 * (i.e. lowest number = highest display order)
	 * 
	 * @return sequence
	 **/
	@ApiModelProperty(value = "Display sequence.  Make this the order the package was added to the basket (i.e. lowest number = highest display order)")

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public ModelPackage servicePoint(BasketServicePoint servicePoint) {
		this.servicePoint = servicePoint;
		return this;
	}

	/**
	 * Get servicePoint
	 * 
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

	public ModelPackage serviceStartDate(String serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
		return this;
	}

	/**
	 * Service Start Date for FLBB
	 * 
	 * @return serviceStartDate
	 **/
	@ApiModelProperty(example = "2017-10-01T09:45:00.000+02:00", value = "Service Start Date for FLBB")

	public String getServiceStartDate() {
		return serviceStartDate;
	}

	public void setServiceStartDate(String serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
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
	 * 
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

	public ModelPackage voucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
		return this;
	}

	/**
	 * Vouchercode which is added to the package
	 * 
	 * @return voucherCode
	 **/
	@ApiModelProperty(value = "Vouchercode which is added to the package")

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
		ModelPackage modelPackage = (ModelPackage) o;
		return Objects.equals(this.accountCategory, modelPackage.accountCategory)
				&& Objects.equals(this.appointmentWindow, modelPackage.appointmentWindow)
				&& Objects.equals(this.bundle, modelPackage.bundle)
				&& Objects.equals(this.dependentOn, modelPackage.dependentOn)
				&& Objects.equals(this.discounts, modelPackage.discounts)
				&& Objects.equals(this.hardwares, modelPackage.hardwares)
				&& Objects.equals(this.installationAddress, modelPackage.installationAddress)
				&& Objects.equals(this.isChanged, modelPackage.isChanged)
				&& Objects.equals(this.linePackageType, modelPackage.linePackageType)
				&& Objects.equals(this.lineTreatmentType, modelPackage.lineTreatmentType)
				&& Objects.equals(this.packageId, modelPackage.packageId)
				&& Objects.equals(this.packageType, modelPackage.packageType)
				&& Objects.equals(this.phoneNumber, modelPackage.phoneNumber)
				&& Objects.equals(this.planType, modelPackage.planType)
				&& Objects.equals(this.priceDetails, modelPackage.priceDetails)
				&& Objects.equals(this.removable, modelPackage.removable)
				&& Objects.equals(this.sequence, modelPackage.sequence)
				&& Objects.equals(this.servicePoint, modelPackage.servicePoint)
				&& Objects.equals(this.serviceStartDate, modelPackage.serviceStartDate)
				&& Objects.equals(this.services, modelPackage.services)
				&& Objects.equals(this.voucherCode, modelPackage.voucherCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountCategory, appointmentWindow, bundle, dependentOn, discounts, hardwares,
				installationAddress, isChanged, linePackageType, lineTreatmentType, packageId, packageType, phoneNumber,
				planType, priceDetails, removable, sequence, servicePoint, serviceStartDate, services, voucherCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelPackage {\n");

		sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
		sb.append("    appointmentWindow: ").append(toIndentedString(appointmentWindow)).append("\n");
		sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
		sb.append("    dependentOn: ").append(toIndentedString(dependentOn)).append("\n");
		sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
		sb.append("    hardwares: ").append(toIndentedString(hardwares)).append("\n");
		sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
		sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
		sb.append("    linePackageType: ").append(toIndentedString(linePackageType)).append("\n");
		sb.append("    lineTreatmentType: ").append(toIndentedString(lineTreatmentType)).append("\n");
		sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
		sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
		sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
		sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
		sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
		sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
		sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
		sb.append("    servicePoint: ").append(toIndentedString(servicePoint)).append("\n");
		sb.append("    serviceStartDate: ").append(toIndentedString(serviceStartDate)).append("\n");
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
