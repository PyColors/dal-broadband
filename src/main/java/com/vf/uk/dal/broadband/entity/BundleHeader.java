package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundleHeader.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")
@Data
public class BundleHeader {

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

	/** The bundle class. */
	@JsonProperty("bundleClass")
	private String bundleClass = null;

	/** The product class. */
	@JsonProperty("productClass")
	private String productClass = null;

	/** The payment type. */
	@JsonProperty("paymentType")
	private String paymentType = null;

	/** The bundle type. */
	@JsonProperty("bundleType")
	private String bundleType = null;

	/** The speed. */
	@JsonProperty("speed")
	private Speed speed = null;

	/** The usage. */
	@JsonProperty("usage")
	private String usage = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The misc attributes. */
	@JsonProperty("miscAttributes")
	private MiscellaneousAttributes miscAttributes = null;

	/** The commitment period. */
	@JsonProperty("commitmentPeriod")
	private String commitmentPeriod = null;

	/** The plan couple id. */
	@JsonProperty("planCoupleId")
	private String planCoupleId = null;

	/** The plan couple flag. */
	@JsonProperty("planCoupleFlag")
	private Boolean planCoupleFlag = null;

	/** The plan couple label. */
	@JsonProperty("planCoupleLabel")
	private String planCoupleLabel = null;

	/** The global roaming flag. */
	@JsonProperty("globalRoamingFlag")
	private Boolean globalRoamingFlag = null;

	/** The secure net flag. */
	@JsonProperty("secureNetFlag")
	private Boolean secureNetFlag = null;

	/** The is unlimited usage. */
	@JsonProperty("isUnlimitedUsage")
	private Boolean isUnlimitedUsage = null;

	/** The mobile line rental id. */
	@JsonProperty("mobileLineRentalId")
	private String mobileLineRentalId = null;

	/** The mobile service id. */
	@JsonProperty("mobileServiceId")
	private String mobileServiceId = null;

	/** The allowance. */
	@JsonProperty("allowance")
	@Valid
	private List<BundleAllowance> allowance = null;

	/** The roaming allowance. */
	@JsonProperty("roamingAllowance")
	@Valid
	private List<BundleAllowance> roamingAllowance = null;

	/** The merchandising media. */
	@JsonProperty("merchandisingMedia")
	@Valid
	private List<MediaLink> merchandisingMedia = null;

	/** The price info. */
	@JsonProperty("priceInfo")
	private PriceForBundleAndHardware priceInfo = null;

	/** The line rental. */
	@JsonProperty("lineRental")
	private Price lineRental = null;

	/** The line rental discount. */
	@JsonProperty("lineRentalDiscount")
	private Price lineRentalDiscount = null;

	/** The mcs. */
	@JsonProperty("mcs")
	@Valid
	private List<MonthlyCostSaver> mcs = null;

	/** The promotions package. */
	@JsonProperty("promotionsPackage")
	private MerchandisingPromotionsPackage promotionsPackage = null;
	
	
	/** The isAffiliate flag. */
	@JsonProperty("isAffiliate")
	private Boolean isAffiliate = null;

}
