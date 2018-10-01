package com.vf.uk.dal.broadband.entity.product;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Misc.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class Misc {

	/** The item attribute. */
	@JsonProperty("itemAttribute")
	@Valid
	private List<ItemAttribute> itemAttribute = null;

}
