package com.vf.uk.dal.broadband.entity.product;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ProductResponse.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class ProductResponse {

	/** The error code. */
	@JsonProperty("errorCode")
	private String errorCode = null;

	/** The error message. */
	@JsonProperty("errorMessage")
	private String errorMessage = null;

	/** The partial success. */
	@JsonProperty("partialSuccess")
	private Boolean partialSuccess = null;

	/** The product list. */
	@JsonProperty("productList")
	@Valid
	private List<Product> productList = null;

	/** The response object. */
	@JsonProperty("responseObject")
	private JSONObject responseObject = null;

	/** The success. */
	@JsonProperty("success")
	private Boolean success = null;

}
