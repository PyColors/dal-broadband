package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Specification.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class Specification {

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The foot note. */
	@JsonProperty("footNote")
	private String footNote = null;

	/** The hide in list. */
	@JsonProperty("hideInList")
	private Boolean hideInList = null;

	/** The is key. */
	@JsonProperty("isKey")
	private Boolean isKey = null;

	/** The key. */
	@JsonProperty("key")
	private Boolean key = null;

	/** The name. */
	@JsonProperty("name")
	private String name = null;

	/** The priority. */
	@JsonProperty("priority")
	private Long priority = null;

	/** The value. */
	@JsonProperty("value")
	private String value = null;

	/** The value type. */
	@JsonProperty("valueType")
	private String valueType = null;

	/** The value UOM. */
	@JsonProperty("valueUOM")
	private String valueUOM = null;

}
