package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ProductDetails.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T16:12:08.903Z")
@Data
public class RouterProductDetails {

	/** The condition. */
	@JsonProperty("condition")
	private String condition = null;

	/** The delivery. */
	@JsonProperty("delivery")
	private Delivery delivery = null;

	/** The description. */
	@JsonProperty("description")
	private String description = null;

	/** The display name. */
	@JsonProperty("displayName")
	private String displayName = null;

	/** The is default device. */
	@JsonProperty("isDefaultDevice")
	private Boolean isDefaultDevice = null;

	/** The is device product. */
	@JsonProperty("isDeviceProduct")
	private Boolean isDeviceProduct = null;

	/** The is services product. */
	@JsonProperty("isServicesProduct")
	private Boolean isServicesProduct = null;

	/** The list of image UR ls. */
	@JsonProperty("listOfImageURLs")
	@Valid
	private List<ImageURL> listOfImageURLs = null;

	/** The order. */
	@JsonProperty("order")
	private String order = null;

	/** The payment type. */
	@JsonProperty("paymentType")
	private String paymentType = null;

	/** The price info. */
	@JsonProperty("priceInfo")
	private PriceForBundleAndHardware priceInfo = null;

	/** The product class. */
	@JsonProperty("productClass")
	private String productClass = null;

	/** The product id. */
	@JsonProperty("productId")
	private String productId = null;

	/** The product lines. */
	@JsonProperty("productLines")
	@Valid
	private List<String> productLines = null;

	/** The product name. */
	@JsonProperty("productName")
	private String productName = null;

	/** The promotion packages. */
	@JsonProperty("promotionPackages")
	private MerchandisingPromotionsPackage promotionPackages = null;

}
