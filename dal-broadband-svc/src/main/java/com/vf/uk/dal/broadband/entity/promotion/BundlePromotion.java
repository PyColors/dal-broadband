package com.vf.uk.dal.broadband.entity.promotion;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundlePromotion.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")
@Data
public class BundlePromotion {

	/** The bundle id. */
	@JsonProperty("bundleId")
	private String bundleId = null;

	/** The data allowances. */
	@JsonProperty("dataAllowances")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwareDataAllowances> dataAllowances = null;

	/** The entertainment packs. */
	@JsonProperty("entertainmentPacks")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwareEntertainmentPacks> entertainmentPacks = null;

	/** The free accessory. */
	@JsonProperty("freeAccessory")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwareAccessory> freeAccessory = null;

	/** The free extras. */
	@JsonProperty("freeExtras")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwareExtras> freeExtras = null;

	/** The plan coupling promotions. */
	@JsonProperty("planCouplingPromotions")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwarePlanCouplingPromotions> planCouplingPromotions = null;

	/** The promotions. */
	@JsonProperty("promotions")
	@Valid
	private List<Cataloguepromotions> promotions = null;

	/** The sash. */
	@JsonProperty("sash")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwareSash> sash = null;

	/** The secure net. */
	@JsonProperty("secureNet")
	@Valid
	private List<CataloguepromotionqueriesForBundleAndHardwareSecureNet> secureNet = null;

}
