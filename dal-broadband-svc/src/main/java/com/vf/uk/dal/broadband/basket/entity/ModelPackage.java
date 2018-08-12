package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ModelPackage.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T16:03:05.626Z")

public class ModelPackage {
	
	/** The account category. */
	@JsonProperty("accountCategory")
	private String accountCategory = null;

	/** The appointment window. */
	@JsonProperty("appointmentWindow")
	private AppointmentWindow appointmentWindow = null;

	/** The bundle. */
	@JsonProperty("bundle")
	private Bundle bundle = null;

	/** The dependent on. */
	@JsonProperty("dependentOn")
	@Valid
	private List<String> dependentOn = null;

	/** The discounts. */
	@JsonProperty("discounts")
	@Valid
	private List<Discount> discounts = null;

	/** The hardwares. */
	@JsonProperty("hardwares")
	@Valid
	private List<Hardware> hardwares = null;

	/** The installation address. */
	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	/** The is changed. */
	@JsonProperty("isChanged")
	private Boolean isChanged = null;

	/** The line package type. */
	@JsonProperty("linePackageType")
	private String linePackageType = null;

	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	/** The package id. */
	@JsonProperty("packageId")
	private String packageId = null;

	/** The package type. */
	@JsonProperty("packageType")
	private String packageType = null;

	/** The phone number. */
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;

	/** The plan type. */
	@JsonProperty("planType")
	private String planType = null;

	/** The price details. */
	@JsonProperty("priceDetails")
	private PriceDetails priceDetails = null;

	/** The removable. */
	@JsonProperty("removable")
	private Boolean removable = null;

	/** The sequence. */
	@JsonProperty("sequence")
	private Integer sequence = null;

	/** The service point. */
	@JsonProperty("servicePoint")
	private BasketServicePoint servicePoint = null;

	/** The service start date. */
	@JsonProperty("serviceStartDate")
	private String serviceStartDate = null;

	/** The services. */
	@JsonProperty("services")
	@Valid
	private List<Service> services = null;

	/** The voucher code. */
	@JsonProperty("voucherCode")
	private String voucherCode = null;

	/**
	 * Account category.
	 *
	 * @param accountCategory the account category
	 * @return the model package
	 */
	public ModelPackage accountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
		return this;
	}

	/**
	 * If the package was constructed in a segment sensitive way, this field
	 * contains the segment (example customer or business).
	 *
	 * @return accountCategory
	 */
	@ApiModelProperty(value = "If the package was constructed in a segment sensitive way, this field contains the segment (example customer or business)")

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
	 * Appointment window.
	 *
	 * @param appointmentWindow the appointment window
	 * @return the model package
	 */
	public ModelPackage appointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
		return this;
	}

	/**
	 * Get appointmentWindow.
	 *
	 * @return appointmentWindow
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AppointmentWindow getAppointmentWindow() {
		return appointmentWindow;
	}

	/**
	 * Sets the appointment window.
	 *
	 * @param appointmentWindow the new appointment window
	 */
	public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
		this.appointmentWindow = appointmentWindow;
	}

	/**
	 * Bundle.
	 *
	 * @param bundle the bundle
	 * @return the model package
	 */
	public ModelPackage bundle(Bundle bundle) {
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

	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * Sets the bundle.
	 *
	 * @param bundle the new bundle
	 */
	public void setBundle(Bundle bundle) {
		this.bundle = bundle;
	}

	/**
	 * Dependent on.
	 *
	 * @param dependentOn the dependent on
	 * @return the model package
	 */
	public ModelPackage dependentOn(List<String> dependentOn) {
		this.dependentOn = dependentOn;
		return this;
	}

	/**
	 * Adds the dependent on item.
	 *
	 * @param dependentOnItem the dependent on item
	 * @return the model package
	 */
	public ModelPackage addDependentOnItem(String dependentOnItem) {
		if (this.dependentOn == null) {
			this.dependentOn = new ArrayList<>();
		}
		this.dependentOn.add(dependentOnItem);
		return this;
	}

	/**
	 * List of package Ids on which this package is dependent on.
	 *
	 * @return dependentOn
	 */
	@ApiModelProperty(value = "List of package Ids on which this package is dependent on")

	public List<String> getDependentOn() {
		return dependentOn;
	}

	/**
	 * Sets the dependent on.
	 *
	 * @param dependentOn the new dependent on
	 */
	public void setDependentOn(List<String> dependentOn) {
		this.dependentOn = dependentOn;
	}

	/**
	 * Discounts.
	 *
	 * @param discounts the discounts
	 * @return the model package
	 */
	public ModelPackage discounts(List<Discount> discounts) {
		this.discounts = discounts;
		return this;
	}

	/**
	 * Adds the discounts item.
	 *
	 * @param discountsItem the discounts item
	 * @return the model package
	 */
	public ModelPackage addDiscountsItem(Discount discountsItem) {
		if (this.discounts == null) {
			this.discounts = new ArrayList<>();
		}
		this.discounts.add(discountsItem);
		return this;
	}

	/**
	 * Get discounts.
	 *
	 * @return discounts
	 */
	@ApiModelProperty(value = "")

	@Valid

	public List<Discount> getDiscounts() {
		return discounts;
	}

	/**
	 * Sets the discounts.
	 *
	 * @param discounts the new discounts
	 */
	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	/**
	 * Hardwares.
	 *
	 * @param hardwares the hardwares
	 * @return the model package
	 */
	public ModelPackage hardwares(List<Hardware> hardwares) {
		this.hardwares = hardwares;
		return this;
	}

	/**
	 * Adds the hardwares item.
	 *
	 * @param hardwaresItem the hardwares item
	 * @return the model package
	 */
	public ModelPackage addHardwaresItem(Hardware hardwaresItem) {
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

	public List<Hardware> getHardwares() {
		return hardwares;
	}

	/**
	 * Sets the hardwares.
	 *
	 * @param hardwares the new hardwares
	 */
	public void setHardwares(List<Hardware> hardwares) {
		this.hardwares = hardwares;
	}

	/**
	 * Installation address.
	 *
	 * @param installationAddress the installation address
	 * @return the model package
	 */
	public ModelPackage installationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
		return this;
	}

	/**
	 * Get installationAddress.
	 *
	 * @return installationAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InstallationAddress getInstallationAddress() {
		return installationAddress;
	}

	/**
	 * Sets the installation address.
	 *
	 * @param installationAddress the new installation address
	 */
	public void setInstallationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
	}

	/**
	 * Checks if is changed.
	 *
	 * @param isChanged the is changed
	 * @return the model package
	 */
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

	/**
	 * Sets the checks if is changed.
	 *
	 * @param isChanged the new checks if is changed
	 */
	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

	/**
	 * Line package type.
	 *
	 * @param linePackageType the line package type
	 * @return the model package
	 */
	public ModelPackage linePackageType(String linePackageType) {
		this.linePackageType = linePackageType;
		return this;
	}

	/**
	 * Get linePackageType.
	 *
	 * @return linePackageType
	 */
	@ApiModelProperty(value = "")

	public String getLinePackageType() {
		return linePackageType;
	}

	/**
	 * Sets the line package type.
	 *
	 * @param linePackageType the new line package type
	 */
	public void setLinePackageType(String linePackageType) {
		this.linePackageType = linePackageType;
	}

	/**
	 * Line treatment type.
	 *
	 * @param lineTreatmentType the line treatment type
	 * @return the model package
	 */
	public ModelPackage lineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
		return this;
	}

	/**
	 * Get lineTreatmentType.
	 *
	 * @return lineTreatmentType
	 */
	@ApiModelProperty(value = "")

	public String getLineTreatmentType() {
		return lineTreatmentType;
	}

	/**
	 * Sets the line treatment type.
	 *
	 * @param lineTreatmentType the new line treatment type
	 */
	public void setLineTreatmentType(String lineTreatmentType) {
		this.lineTreatmentType = lineTreatmentType;
	}

	/**
	 * Package id.
	 *
	 * @param packageId the package id
	 * @return the model package
	 */
	public ModelPackage packageId(String packageId) {
		this.packageId = packageId;
		return this;
	}

	/**
	 * Unique ID for the package.
	 *
	 * @return packageId
	 */
	@ApiModelProperty(value = "Unique ID for the package")

	public String getPackageId() {
		return packageId;
	}

	/**
	 * Sets the package id.
	 *
	 * @param packageId the new package id
	 */
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	/**
	 * Package type.
	 *
	 * @param packageType the package type
	 * @return the model package
	 */
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

	/**
	 * Sets the package type.
	 *
	 * @param packageType the new package type
	 */
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	/**
	 * Phone number.
	 *
	 * @param phoneNumber the phone number
	 * @return the model package
	 */
	public ModelPackage phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	/**
	 * Phone Number for FLBB.
	 *
	 * @return phoneNumber
	 */
	@ApiModelProperty(value = "Phone Number for FLBB")

	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Plan type.
	 *
	 * @param planType the plan type
	 * @return the model package
	 */
	public ModelPackage planType(String planType) {
		this.planType = planType;
		return this;
	}

	/**
	 * Get planType.
	 *
	 * @return planType
	 */
	@ApiModelProperty(value = "")

	public String getPlanType() {
		return planType;
	}

	/**
	 * Sets the plan type.
	 *
	 * @param planType the new plan type
	 */
	public void setPlanType(String planType) {
		this.planType = planType;
	}

	/**
	 * Price details.
	 *
	 * @param priceDetails the price details
	 * @return the model package
	 */
	public ModelPackage priceDetails(PriceDetails priceDetails) {
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
	 * Removable.
	 *
	 * @param removable the removable
	 * @return the model package
	 */
	public ModelPackage removable(Boolean removable) {
		this.removable = removable;
		return this;
	}

	/**
	 * Flag to indicate if this package can be removed without affecting the
	 * integrity of the basket.
	 *
	 * @return removable
	 */

	public Boolean isRemovable() {
		return removable;
	}

	/**
	 * Sets the removable.
	 *
	 * @param removable the new removable
	 */
	public void setRemovable(Boolean removable) {
		this.removable = removable;
	}

	/**
	 * Sequence.
	 *
	 * @param sequence the sequence
	 * @return the model package
	 */
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

	/**
	 * Sets the sequence.
	 *
	 * @param sequence the new sequence
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * Service point.
	 *
	 * @param servicePoint the service point
	 * @return the model package
	 */
	public ModelPackage servicePoint(BasketServicePoint servicePoint) {
		this.servicePoint = servicePoint;
		return this;
	}

	/**
	 * Get servicePoint.
	 *
	 * @return servicePoint
	 */
	@ApiModelProperty(value = "")

	@Valid

	public BasketServicePoint getServicePoint() {
		return servicePoint;
	}

	/**
	 * Sets the service point.
	 *
	 * @param servicePoint the new service point
	 */
	public void setServicePoint(BasketServicePoint servicePoint) {
		this.servicePoint = servicePoint;
	}

	/**
	 * Service start date.
	 *
	 * @param serviceStartDate the service start date
	 * @return the model package
	 */
	public ModelPackage serviceStartDate(String serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
		return this;
	}

	/**
	 * Service Start Date for FLBB.
	 *
	 * @return serviceStartDate
	 */
	@ApiModelProperty(value = "Service Start Date for FLBB - 2017-10-01T09:45:00.000+02:00")

	public String getServiceStartDate() {
		return serviceStartDate;
	}

	/**
	 * Sets the service start date.
	 *
	 * @param serviceStartDate the new service start date
	 */
	public void setServiceStartDate(String serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}

	/**
	 * Services.
	 *
	 * @param services the services
	 * @return the model package
	 */
	public ModelPackage services(List<Service> services) {
		this.services = services;
		return this;
	}

	/**
	 * Adds the services item.
	 *
	 * @param servicesItem the services item
	 * @return the model package
	 */
	public ModelPackage addServicesItem(Service servicesItem) {
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

	public List<Service> getServices() {
		return services;
	}

	/**
	 * Sets the services.
	 *
	 * @param services the new services
	 */
	public void setServices(List<Service> services) {
		this.services = services;
	}

	/**
	 * Voucher code.
	 *
	 * @param voucherCode the voucher code
	 * @return the model package
	 */
	public ModelPackage voucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
		return this;
	}

	/**
	 * Vouchercode which is added to the package.
	 *
	 * @return voucherCode
	 */
	@ApiModelProperty(value = "Vouchercode which is added to the package")

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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(accountCategory, appointmentWindow, bundle, dependentOn, discounts, hardwares,
				installationAddress, isChanged, linePackageType, lineTreatmentType, packageId, packageType, phoneNumber,
				planType, priceDetails, removable, sequence, servicePoint, serviceStartDate, services, voucherCode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
