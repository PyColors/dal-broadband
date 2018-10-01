package com.vf.uk.dal.broadband.entity.promotion;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CataloguepromotionqueriesForBundleAndHardwareFreeData.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")
@Data
public class CataloguepromotionqueriesForBundleAndHardwareFreeData {

	/** The uom. */
	@JsonProperty("uom")
	private String uom = null;

	/** The value. */
	@JsonProperty("value")
	private String value = null;

}
