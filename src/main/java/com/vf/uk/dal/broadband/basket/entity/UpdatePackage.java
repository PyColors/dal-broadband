package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * UpdatePackage.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class UpdatePackage {

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

}
