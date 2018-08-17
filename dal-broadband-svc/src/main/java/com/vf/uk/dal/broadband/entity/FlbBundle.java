package com.vf.uk.dal.broadband.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * FlbBundle.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T12:29:43.835Z")
@Data
public class FlbBundle {

	/** The sku id. */
	@JsonProperty("skuId")
	private String skuId = null;

	/** The name. */
	@JsonProperty("name")
	private String name = null;

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The bundle name. */
	@JsonProperty("bundleName")
	private String bundleName = null;

	/** The bundle description. */
	@JsonProperty("bundleDescription")
	private String bundleDescription = null;

	/** The bundle features. */
	@JsonProperty("bundleFeatures")
	private String bundleFeatures = null;

	/** The speed. */
	@JsonProperty("speed")
	private Speed speed = null;

	/** The usage. */
	@JsonProperty("usage")
	private String usage = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The commitment period. */
	@JsonProperty("commitmentPeriod")
	private String commitmentPeriod = null;

	/** The product name. */
	@JsonProperty("productName")
	private String productName = null;

	/** The product description. */
	@JsonProperty("productDescription")
	private String productDescription = null;

	/** The merchandising media. */
	@JsonProperty("merchandisingMedia")
	private List<MediaLink> merchandisingMedia = null;

	/** The price info. */
	@JsonProperty("priceInfo")
	private PriceForBBBundleAndHardware priceInfo = null;

	/** The is speed less. */
	@JsonProperty("isSpeedLess")
	private Boolean isSpeedLess = null;

	/** The is selected. */
	@JsonProperty("isSelected")
	private Boolean isSelected = null;

	/** The pre orderable. */
	@JsonProperty("preOrderable")
	private Boolean preOrderable = null;

	/** The earliest available date. */
	@JsonProperty("earliestAvailableDate")
	private String earliestAvailableDate = null;

	/** The line rental price. */
	@JsonProperty("lineRentalPrice")
	private Price lineRentalPrice = null;

}
