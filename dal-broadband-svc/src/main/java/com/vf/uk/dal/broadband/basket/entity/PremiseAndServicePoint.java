package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * PremiseAndServicePoint.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-24T11:14:47.535Z")
@Data
public class PremiseAndServicePoint {

	/** The installation address. */
	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	/** The line package type. */
	@JsonProperty("linePackageType")
	private String linePackageType = null;

	/** The line treatment type. */
	@JsonProperty("lineTreatmentType")
	private String lineTreatmentType = null;

	/** The phone number. */
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;

	/** The service point. */
	@JsonProperty("servicePoint")
	private BasketServicePoint servicePoint = null;

}
