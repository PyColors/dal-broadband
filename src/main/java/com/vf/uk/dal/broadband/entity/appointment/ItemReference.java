package com.vf.uk.dal.broadband.entity.appointment;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ItemReference.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T11:02:21.569Z")
@Data
public class ItemReference {

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The type code. */
	@JsonProperty("typeCode")
	private String typeCode = null;

}
