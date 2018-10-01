package com.vf.uk.dal.broadband.entity.product;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Delivery.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class Delivery {

	/** The classification. */
	@JsonProperty("classification")
	private String classification = null;

	/** The partner. */
	@JsonProperty("partner")
	private String partner = null;

	/** The soa delivery method. */
	@JsonProperty("soaDeliveryMethod")
	private String soaDeliveryMethod = null;

	/** The weekend. */
	@JsonProperty("weekend")
	private String weekend = null;

}
