package com.vf.uk.dal.broadband.entity.product;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CommercialProduct.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class CommercialProduct {

	/** The allowance display. */
	@JsonProperty("allowanceDisplay")
	private String allowanceDisplay = null;

	/** The battery. */
	@JsonProperty("battery")
	private Boolean battery = null;

	/** The box price. */
	@JsonProperty("boxPrice")
	private BoxPrice boxPrice = null;

	/** The categories. */
	@JsonProperty("categories")
	@Valid
	private List<String> categories = null;

	/** The condition. */
	@JsonProperty("condition")
	private String condition = null;

	/** The content version. */
	@JsonProperty("contentVersion")
	private String contentVersion = null;

	/** The delivery. */
	@JsonProperty("delivery")
	private Delivery delivery = null;

	/** The discount. */
	@JsonProperty("discount")
	private Discount discount = null;

	/** The display name. */
	@JsonProperty("displayName")
	private String displayName = null;

	/** The duration. */
	@JsonProperty("duration")
	private Duration duration = null;

	/** The eligibility subflow. */
	@JsonProperty("eligibilitySubflow")
	private String eligibilitySubflow = null;

	/** The equipment. */
	@JsonProperty("equipment")
	private Equipment equipment = null;

	/** The fast moving. */
	@JsonProperty("fastMoving")
	private Boolean fastMoving = null;

	/** The id. */
	@JsonProperty("id")
	private String id = null;

	/** The in the box. */
	@JsonProperty("inTheBox")
	private String inTheBox = null;

	/** The inclusive eligibility. */
	@JsonProperty("inclusiveEligibility")
	private String inclusiveEligibility = null;

	/** The is device product. */
	@JsonProperty("isDeviceProduct")
	private Boolean isDeviceProduct = null;

	/** The is services product. */
	@JsonProperty("isServicesProduct")
	private Boolean isServicesProduct = null;

	/** The lead plan id. */
	@JsonProperty("leadPlanId")
	private String leadPlanId = null;

	/** The list of compatible bundles. */
	@JsonProperty("listOfCompatibleBundles")
	private String listOfCompatibleBundles = null;

	/** The list of eligible channels. */
	@JsonProperty("listOfEligibleChannels")
	private String listOfEligibleChannels = null;

	/** The list ofhelp UR ls. */
	@JsonProperty("listOfhelpURLs")
	@Valid
	private List<HelpURL> listOfhelpURLs = null;

	/** The list ofimage UR ls. */
	@JsonProperty("listOfimageURLs")
	@Valid
	private List<ImageURL> listOfimageURLs = null;

	/** The list ofmedia UR ls. */
	@JsonProperty("listOfmediaURLs")
	@Valid
	private List<MediaURL> listOfmediaURLs = null;

	/** The merchandising version. */
	@JsonProperty("merchandisingVersion")
	private String merchandisingVersion = null;

	/** The metadata version. */
	@JsonProperty("metadataVersion")
	private String metadataVersion = null;

	/** The misc. */
	@JsonProperty("misc")
	private Misc misc = null;

	/** The name. */
	@JsonProperty("name")
	private String name = null;

	/** The omni channel discount eligible. */
	@JsonProperty("omniChannelDiscountEligible")
	private Boolean omniChannelDiscountEligible = null;

	/** The order. */
	@JsonProperty("order")
	private String order = null;

	/** The payment type. */
	@JsonProperty("paymentType")
	private String paymentType = null;

	/** The post desc. */
	@JsonProperty("postDesc")
	private String postDesc = null;

	/** The post desc mobile. */
	@JsonProperty("postDescMobile")
	private String postDescMobile = null;

	/** The pre desc. */
	@JsonProperty("preDesc")
	private String preDesc = null;

	/** The pre desc mobile. */
	@JsonProperty("preDescMobile")
	private String preDescMobile = null;

	/** The price info. */
	@JsonProperty("priceInfo")
	private ProductPrice priceInfo = null;

	/** The product allowance. */
	@JsonProperty("productAllowance")
	private ProductAllowance productAllowance = null;

	/** The product availability. */
	@JsonProperty("productAvailability")
	private ProductAvailability productAvailability = null;

	/** The product class. */
	@JsonProperty("productClass")
	private String productClass = null;

	/** The product control. */
	@JsonProperty("productControl")
	private ProductControl productControl = null;

	/** The product groups. */
	@JsonProperty("productGroups")
	private ProductGroups productGroups = null;

	/** The product lines. */
	@JsonProperty("productLines")
	@Valid
	private List<String> productLines = null;

	/** The product price override. */
	@JsonProperty("productPriceOverride")
	private String productPriceOverride = null;

	/** The product relationship list. */
	@JsonProperty("productRelationshipList")
	private String productRelationshipList = null;

	/** The product sub class. */
	@JsonProperty("productSubClass")
	private String productSubClass = null;

	/** The promote as. */
	@JsonProperty("promoteAs")
	private PromoteAs promoteAs = null;

	/** The recommendataions. */
	@JsonProperty("recommendataions")
	@Valid
	private List<Recommendations> recommendataions = null;

	/** The seo canonical. */
	@JsonProperty("seoCanonical")
	private String seoCanonical = null;

	/** The seo description. */
	@JsonProperty("seoDescription")
	private String seoDescription = null;

	/** The seo index. */
	@JsonProperty("seoIndex")
	private String seoIndex = null;

	/** The seo keywords. */
	@JsonProperty("seoKeywords")
	private String seoKeywords = null;

	/** The specification groups. */
	@JsonProperty("specificationGroups")
	@Valid
	private List<Group> specificationGroups = null;

	/** The stock threshold limit. */
	@JsonProperty("stockThresholdLimit")
	private String stockThresholdLimit = null;

	/** The version. */
	@JsonProperty("version")
	private String version = null;

	/** The warranty. */
	@JsonProperty("warranty")
	private String warranty = null;

}
