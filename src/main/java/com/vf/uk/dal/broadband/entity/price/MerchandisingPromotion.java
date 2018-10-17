package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MerchandisingPromotion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class MerchandisingPromotion {
	@JsonProperty("confirmRequired")
	private Boolean confirmRequired = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("discountId")
	private String discountId = null;

	@JsonProperty("footNotes")
	@Valid
	private List<String> footNotes = null;

	@JsonProperty("label")
	private String label = null;

	@JsonProperty("mpType")
	private String mpType = null;

	@JsonProperty("offerGroup")
	private String offerGroup = null;

	@JsonProperty("packageType")
	@Valid
	private List<String> packageType = null;

	@JsonProperty("priceEstablishedLabel")
	private String priceEstablishedLabel = null;

	@JsonProperty("priority")
	private String priority = null;

	@JsonProperty("promotionMedia")
	private String promotionMedia = null;

	@JsonProperty("qualifier")
	private Qualifier qualifier = null;

	@JsonProperty("tag")
	private String tag = null;

}
