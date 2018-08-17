package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ProductGroup.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class ProductGroup {

	/** The group role. */
	@JsonProperty("groupRole")
	private String groupRole = null;

	/** The product group name. */
	@JsonProperty("productGroupName")
	private String productGroupName = null;

	/** The product group role. */
	@JsonProperty("productGroupRole")
	private String productGroupRole = null;

}
