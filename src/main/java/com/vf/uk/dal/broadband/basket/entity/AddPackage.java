package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * AddPackage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class AddPackage {
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

	@JsonProperty("linePackageType")
	private String linePackageType = null;

	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

}
