package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Bundle.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data

public class Bundle {

	/** The action. */
	@JsonProperty("action")
	private String action = null;

	/** The allowances. */
	@JsonProperty("allowances")
	@Valid
	private List<Allowance> allowances = null;

	/** The attributes. */
	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = null;

	/** The bundle class. */
	@JsonProperty("bundleClass")
	private String bundleClass = null;

	/** The bundle type. */
	@JsonProperty("bundleType")
	private String bundleType = null;

	/** The bundled service products. */
	@JsonProperty("bundledServiceProducts")
	@Valid
	private List<BundledServiceProduct> bundledServiceProducts = null;

	/** The commitment period. */
	@JsonProperty("commitmentPeriod")
	private CommitmentPeriod commitmentPeriod = null;

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The display description. */
	@JsonProperty("displayDescription")
	private String displayDescription = null;

	/** The display name. */
	@JsonProperty("displayName")
	private String displayName = null;

	/** The display order. */
	@JsonProperty("displayOrder")
	private Integer displayOrder = null;

	/** The is changed. */
	@JsonProperty("isChanged")
	private Boolean isChanged = null;

	/** The is vodafone global roaming. */
	@JsonProperty("isVodafoneGlobalRoaming")
	private Boolean isVodafoneGlobalRoaming = null;

	/** The merchandising media. */
	@JsonProperty("merchandisingMedia")
	@Valid
	private List<MediaLinks> merchandisingMedia = null;

	/** The name. */
	@JsonProperty("name")
	private String name = null;

	/** The package line id. */
	@JsonProperty("packageLineId")
	private String packageLineId = null;

	/** The payment type. */
	@JsonProperty("paymentType")
	private String paymentType = null;

	/** The price details. */
	@JsonProperty("priceDetails")
	private BundlePrices priceDetails = null;

	/** The product class. */
	@JsonProperty("productClass")
	private String productClass = null;

	/** The service id. */
	@JsonProperty("serviceId")
	private String serviceId = null;

	/** The show in summary. */
	@JsonProperty("showInSummary")
	private Boolean showInSummary = null;

	/** The sku id. */
	@JsonProperty("skuId")
	private String skuId = null;

}
