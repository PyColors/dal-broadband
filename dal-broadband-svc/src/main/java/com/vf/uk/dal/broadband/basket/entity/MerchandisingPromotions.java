package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MerchandisingPromotion.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class MerchandisingPromotions {

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The discount id. */
	@JsonProperty("discountId")
	private String discountId = null;

	/** The label. */
	@JsonProperty("label")
	private String label = null;

	/** The mp type. */
	@JsonProperty("mpType")
	private String mpType = null;

	/** The package type. */
	@JsonProperty("packageType")
	@Valid
	private List<String> packageType = null;

	/** The price established label. */
	@JsonProperty("priceEstablishedLabel")
	private String priceEstablishedLabel = null;

	/** The priority. */
	@JsonProperty("priority")
	private String priority = null;

	/** The tag. */
	@JsonProperty("tag")
	private String tag = null;

}
