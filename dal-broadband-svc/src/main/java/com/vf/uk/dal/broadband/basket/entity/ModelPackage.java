package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ModelPackage.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T16:03:05.626Z")
@Data
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

}
