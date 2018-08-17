package com.vf.uk.dal.broadband.entity.promotion;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")
@Data
public class CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks {

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The foot notes. */
	@JsonProperty("footNotes")
	@Valid
	private List<String> footNotes = null;

	/** The label. */
	@JsonProperty("label")
	private String label = null;

	/** The package type. */
	@JsonProperty("packageType")
	@Valid
	private List<String> packageType = null;

	/** The priority. */
	@JsonProperty("priority")
	private String priority = null;

	/** The promotion media. */
	@JsonProperty("promotionMedia")
	private String promotionMedia = null;

	/** The tag. */
	@JsonProperty("tag")
	private String tag = null;

	/** The type. */
	@JsonProperty("type")
	private String type = null;

}
