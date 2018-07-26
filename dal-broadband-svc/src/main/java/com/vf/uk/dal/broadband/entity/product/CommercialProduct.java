package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CommercialProduct.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class CommercialProduct   {
  
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

  /**
   * Allowance display.
   *
   * @param allowanceDisplay the allowance display
   * @return the commercial product
   */
  public CommercialProduct allowanceDisplay(String allowanceDisplay) {
    this.allowanceDisplay = allowanceDisplay;
    return this;
  }

  /**
   * Get allowanceDisplay.
   *
   * @return allowanceDisplay
   */
  @ApiModelProperty(value = "")


  public String getAllowanceDisplay() {
    return allowanceDisplay;
  }

  /**
   * Sets the allowance display.
   *
   * @param allowanceDisplay the new allowance display
   */
  public void setAllowanceDisplay(String allowanceDisplay) {
    this.allowanceDisplay = allowanceDisplay;
  }

  /**
   * Battery.
   *
   * @param battery the battery
   * @return the commercial product
   */
  public CommercialProduct battery(Boolean battery) {
    this.battery = battery;
    return this;
  }

  /**
   * Get battery.
   *
   * @return battery
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isBattery() {
    return battery;
  }

  /**
   * Sets the battery.
   *
   * @param battery the new battery
   */
  public void setBattery(Boolean battery) {
    this.battery = battery;
  }

  /**
   * Box price.
   *
   * @param boxPrice the box price
   * @return the commercial product
   */
  public CommercialProduct boxPrice(BoxPrice boxPrice) {
    this.boxPrice = boxPrice;
    return this;
  }

  /**
   * box price.
   *
   * @return boxPrice
   */
  @ApiModelProperty(value = "box price")

  @Valid

  public BoxPrice getBoxPrice() {
    return boxPrice;
  }

  /**
   * Sets the box price.
   *
   * @param boxPrice the new box price
   */
  public void setBoxPrice(BoxPrice boxPrice) {
    this.boxPrice = boxPrice;
  }

  /**
   * Categories.
   *
   * @param categories the categories
   * @return the commercial product
   */
  public CommercialProduct categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Adds the categories item.
   *
   * @param categoriesItem the categories item
   * @return the commercial product
   */
  public CommercialProduct addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories.
   *
   * @return categories
   */
  @ApiModelProperty(value = "categories")


  public List<String> getCategories() {
    return categories;
  }

  /**
   * Sets the categories.
   *
   * @param categories the new categories
   */
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  /**
   * Condition.
   *
   * @param condition the condition
   * @return the commercial product
   */
  public CommercialProduct condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Condition.
   *
   * @return condition
   */
  @ApiModelProperty(value = "Condition")


  public String getCondition() {
    return condition;
  }

  /**
   * Sets the condition.
   *
   * @param condition the new condition
   */
  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   * Content version.
   *
   * @param contentVersion the content version
   * @return the commercial product
   */
  public CommercialProduct contentVersion(String contentVersion) {
    this.contentVersion = contentVersion;
    return this;
  }

  /**
   * Get contentVersion.
   *
   * @return contentVersion
   */
  @ApiModelProperty(value = "")


  public String getContentVersion() {
    return contentVersion;
  }

  /**
   * Sets the content version.
   *
   * @param contentVersion the new content version
   */
  public void setContentVersion(String contentVersion) {
    this.contentVersion = contentVersion;
  }

  /**
   * Delivery.
   *
   * @param delivery the delivery
   * @return the commercial product
   */
  public CommercialProduct delivery(Delivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery.
   *
   * @return delivery
   */
  @ApiModelProperty(value = "")

  @Valid

  public Delivery getDelivery() {
    return delivery;
  }

  /**
   * Sets the delivery.
   *
   * @param delivery the new delivery
   */
  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  /**
   * Discount.
   *
   * @param discount the discount
   * @return the commercial product
   */
  public CommercialProduct discount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount on product.
   *
   * @return discount
   */
  @ApiModelProperty(value = "Discount on product")

  @Valid

  public Discount getDiscount() {
    return discount;
  }

  /**
   * Sets the discount.
   *
   * @param discount the new discount
   */
  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  /**
   * Display name.
   *
   * @param displayName the display name
   * @return the commercial product
   */
  public CommercialProduct displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName.
   *
   * @return displayName
   */
  @ApiModelProperty(value = "")


  public String getDisplayName() {
    return displayName;
  }

  /**
   * Sets the display name.
   *
   * @param displayName the new display name
   */
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Duration.
   *
   * @param duration the duration
   * @return the commercial product
   */
  public CommercialProduct duration(Duration duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the product.
   *
   * @return duration
   */
  @ApiModelProperty(value = "Duration of the product")

  @Valid

  public Duration getDuration() {
    return duration;
  }

  /**
   * Sets the duration.
   *
   * @param duration the new duration
   */
  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  /**
   * Eligibility subflow.
   *
   * @param eligibilitySubflow the eligibility subflow
   * @return the commercial product
   */
  public CommercialProduct eligibilitySubflow(String eligibilitySubflow) {
    this.eligibilitySubflow = eligibilitySubflow;
    return this;
  }

  /**
   * Get eligibilitySubflow.
   *
   * @return eligibilitySubflow
   */
  @ApiModelProperty(value = "")


  public String getEligibilitySubflow() {
    return eligibilitySubflow;
  }

  /**
   * Sets the eligibility subflow.
   *
   * @param eligibilitySubflow the new eligibility subflow
   */
  public void setEligibilitySubflow(String eligibilitySubflow) {
    this.eligibilitySubflow = eligibilitySubflow;
  }

  /**
   * Equipment.
   *
   * @param equipment the equipment
   * @return the commercial product
   */
  public CommercialProduct equipment(Equipment equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * equipment details.
   *
   * @return equipment
   */
  @ApiModelProperty(value = "equipment details")

  @Valid

  public Equipment getEquipment() {
    return equipment;
  }

  /**
   * Sets the equipment.
   *
   * @param equipment the new equipment
   */
  public void setEquipment(Equipment equipment) {
    this.equipment = equipment;
  }

  /**
   * Fast moving.
   *
   * @param fastMoving the fast moving
   * @return the commercial product
   */
  public CommercialProduct fastMoving(Boolean fastMoving) {
    this.fastMoving = fastMoving;
    return this;
  }

  /**
   * Get fastMoving.
   *
   * @return fastMoving
   */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isFastMoving() {
    return fastMoving;
  }

  /**
   * Sets the fast moving.
   *
   * @param fastMoving the new fast moving
   */
  public void setFastMoving(Boolean fastMoving) {
    this.fastMoving = fastMoving;
  }

  /**
   * Id.
   *
   * @param id the id
   * @return the commercial product
   */
  public CommercialProduct id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Product ID.
   *
   * @return id
   */
  @ApiModelProperty(value = "Product ID")


  public String getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * In the box.
   *
   * @param inTheBox the in the box
   * @return the commercial product
   */
  public CommercialProduct inTheBox(String inTheBox) {
    this.inTheBox = inTheBox;
    return this;
  }

  /**
   * Get inTheBox.
   *
   * @return inTheBox
   */
  @ApiModelProperty(value = "")


  public String getInTheBox() {
    return inTheBox;
  }

  /**
   * Sets the in the box.
   *
   * @param inTheBox the new in the box
   */
  public void setInTheBox(String inTheBox) {
    this.inTheBox = inTheBox;
  }

  /**
   * Inclusive eligibility.
   *
   * @param inclusiveEligibility the inclusive eligibility
   * @return the commercial product
   */
  public CommercialProduct inclusiveEligibility(String inclusiveEligibility) {
    this.inclusiveEligibility = inclusiveEligibility;
    return this;
  }

  /**
   * Eligibility.
   *
   * @return inclusiveEligibility
   */
  @ApiModelProperty(value = "Eligibility")


  public String getInclusiveEligibility() {
    return inclusiveEligibility;
  }

  /**
   * Sets the inclusive eligibility.
   *
   * @param inclusiveEligibility the new inclusive eligibility
   */
  public void setInclusiveEligibility(String inclusiveEligibility) {
    this.inclusiveEligibility = inclusiveEligibility;
  }

  /**
   * Checks if is device product.
   *
   * @param isDeviceProduct the is device product
   * @return the commercial product
   */
  public CommercialProduct isDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Boolean attribute to identify all device products.
   *
   * @return isDeviceProduct
   */
  @ApiModelProperty(example = "false", value = "Boolean attribute to identify all device products")


  public Boolean isIsDeviceProduct() {
    return isDeviceProduct;
  }

  /**
   * Sets the checks if is device product.
   *
   * @param isDeviceProduct the new checks if is device product
   */
  public void setIsDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  /**
   * Checks if is services product.
   *
   * @param isServicesProduct the is services product
   * @return the commercial product
   */
  public CommercialProduct isServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * Boolean attribute service product.
   *
   * @return isServicesProduct
   */
  @ApiModelProperty(example = "false", value = "Boolean attribute service product")


  public Boolean isIsServicesProduct() {
    return isServicesProduct;
  }

  /**
   * Sets the checks if is services product.
   *
   * @param isServicesProduct the new checks if is services product
   */
  public void setIsServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  /**
   * Lead plan id.
   *
   * @param leadPlanId the lead plan id
   * @return the commercial product
   */
  public CommercialProduct leadPlanId(String leadPlanId) {
    this.leadPlanId = leadPlanId;
    return this;
  }

  /**
   * Get leadPlanId.
   *
   * @return leadPlanId
   */
  @ApiModelProperty(value = "")


  public String getLeadPlanId() {
    return leadPlanId;
  }

  /**
   * Sets the lead plan id.
   *
   * @param leadPlanId the new lead plan id
   */
  public void setLeadPlanId(String leadPlanId) {
    this.leadPlanId = leadPlanId;
  }

  /**
   * List of compatible bundles.
   *
   * @param listOfCompatibleBundles the list of compatible bundles
   * @return the commercial product
   */
  public CommercialProduct listOfCompatibleBundles(String listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
    return this;
  }

  /**
   * Get listOfCompatibleBundles.
   *
   * @return listOfCompatibleBundles
   */
  @ApiModelProperty(value = "")


  public String getListOfCompatibleBundles() {
    return listOfCompatibleBundles;
  }

  /**
   * Sets the list of compatible bundles.
   *
   * @param listOfCompatibleBundles the new list of compatible bundles
   */
  public void setListOfCompatibleBundles(String listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
  }

  /**
   * List of eligible channels.
   *
   * @param listOfEligibleChannels the list of eligible channels
   * @return the commercial product
   */
  public CommercialProduct listOfEligibleChannels(String listOfEligibleChannels) {
    this.listOfEligibleChannels = listOfEligibleChannels;
    return this;
  }

  /**
   * Get listOfEligibleChannels.
   *
   * @return listOfEligibleChannels
   */
  @ApiModelProperty(value = "")


  public String getListOfEligibleChannels() {
    return listOfEligibleChannels;
  }

  /**
   * Sets the list of eligible channels.
   *
   * @param listOfEligibleChannels the new list of eligible channels
   */
  public void setListOfEligibleChannels(String listOfEligibleChannels) {
    this.listOfEligibleChannels = listOfEligibleChannels;
  }

  /**
   * List ofhelp UR ls.
   *
   * @param listOfhelpURLs the list ofhelp UR ls
   * @return the commercial product
   */
  public CommercialProduct listOfhelpURLs(List<HelpURL> listOfhelpURLs) {
    this.listOfhelpURLs = listOfhelpURLs;
    return this;
  }

  /**
   * Adds the list ofhelp UR ls item.
   *
   * @param listOfhelpURLsItem the list ofhelp UR ls item
   * @return the commercial product
   */
  public CommercialProduct addListOfhelpURLsItem(HelpURL listOfhelpURLsItem) {
    if (this.listOfhelpURLs == null) {
      this.listOfhelpURLs = new ArrayList<>();
    }
    this.listOfhelpURLs.add(listOfhelpURLsItem);
    return this;
  }

  /**
   * Get listOfhelpURLs.
   *
   * @return listOfhelpURLs
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<HelpURL> getListOfhelpURLs() {
    return listOfhelpURLs;
  }

  /**
   * Sets the list ofhelp UR ls.
   *
   * @param listOfhelpURLs the new list ofhelp UR ls
   */
  public void setListOfhelpURLs(List<HelpURL> listOfhelpURLs) {
    this.listOfhelpURLs = listOfhelpURLs;
  }

  /**
   * List ofimage UR ls.
   *
   * @param listOfimageURLs the list ofimage UR ls
   * @return the commercial product
   */
  public CommercialProduct listOfimageURLs(List<ImageURL> listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
    return this;
  }

  /**
   * Adds the list ofimage UR ls item.
   *
   * @param listOfimageURLsItem the list ofimage UR ls item
   * @return the commercial product
   */
  public CommercialProduct addListOfimageURLsItem(ImageURL listOfimageURLsItem) {
    if (this.listOfimageURLs == null) {
      this.listOfimageURLs = new ArrayList<>();
    }
    this.listOfimageURLs.add(listOfimageURLsItem);
    return this;
  }

  /**
   * Get listOfimageURLs.
   *
   * @return listOfimageURLs
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<ImageURL> getListOfimageURLs() {
    return listOfimageURLs;
  }

  /**
   * Sets the list ofimage UR ls.
   *
   * @param listOfimageURLs the new list ofimage UR ls
   */
  public void setListOfimageURLs(List<ImageURL> listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
  }

  /**
   * List ofmedia UR ls.
   *
   * @param listOfmediaURLs the list ofmedia UR ls
   * @return the commercial product
   */
  public CommercialProduct listOfmediaURLs(List<MediaURL> listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
    return this;
  }

  /**
   * Adds the list ofmedia UR ls item.
   *
   * @param listOfmediaURLsItem the list ofmedia UR ls item
   * @return the commercial product
   */
  public CommercialProduct addListOfmediaURLsItem(MediaURL listOfmediaURLsItem) {
    if (this.listOfmediaURLs == null) {
      this.listOfmediaURLs = new ArrayList<>();
    }
    this.listOfmediaURLs.add(listOfmediaURLsItem);
    return this;
  }

  /**
   * Get listOfmediaURLs.
   *
   * @return listOfmediaURLs
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<MediaURL> getListOfmediaURLs() {
    return listOfmediaURLs;
  }

  /**
   * Sets the list ofmedia UR ls.
   *
   * @param listOfmediaURLs the new list ofmedia UR ls
   */
  public void setListOfmediaURLs(List<MediaURL> listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
  }

  /**
   * Merchandising version.
   *
   * @param merchandisingVersion the merchandising version
   * @return the commercial product
   */
  public CommercialProduct merchandisingVersion(String merchandisingVersion) {
    this.merchandisingVersion = merchandisingVersion;
    return this;
  }

  /**
   * Get merchandisingVersion.
   *
   * @return merchandisingVersion
   */
  @ApiModelProperty(value = "")


  public String getMerchandisingVersion() {
    return merchandisingVersion;
  }

  /**
   * Sets the merchandising version.
   *
   * @param merchandisingVersion the new merchandising version
   */
  public void setMerchandisingVersion(String merchandisingVersion) {
    this.merchandisingVersion = merchandisingVersion;
  }

  /**
   * Metadata version.
   *
   * @param metadataVersion the metadata version
   * @return the commercial product
   */
  public CommercialProduct metadataVersion(String metadataVersion) {
    this.metadataVersion = metadataVersion;
    return this;
  }

  /**
   * Get metadataVersion.
   *
   * @return metadataVersion
   */
  @ApiModelProperty(value = "")


  public String getMetadataVersion() {
    return metadataVersion;
  }

  /**
   * Sets the metadata version.
   *
   * @param metadataVersion the new metadata version
   */
  public void setMetadataVersion(String metadataVersion) {
    this.metadataVersion = metadataVersion;
  }

  /**
   * Misc.
   *
   * @param misc the misc
   * @return the commercial product
   */
  public CommercialProduct misc(Misc misc) {
    this.misc = misc;
    return this;
  }

  /**
   * Get misc.
   *
   * @return misc
   */
  @ApiModelProperty(value = "")

  @Valid

  public Misc getMisc() {
    return misc;
  }

  /**
   * Sets the misc.
   *
   * @param misc the new misc
   */
  public void setMisc(Misc misc) {
    this.misc = misc;
  }

  /**
   * Name.
   *
   * @param name the name
   * @return the commercial product
   */
  public CommercialProduct name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Product name as defined catalogue.
   *
   * @return name
   */
  @ApiModelProperty(value = "Product name as defined catalogue")


  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Omni channel discount eligible.
   *
   * @param omniChannelDiscountEligible the omni channel discount eligible
   * @return the commercial product
   */
  public CommercialProduct omniChannelDiscountEligible(Boolean omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
    return this;
  }

  /**
   * boolean value for omni channel discount eligibility.
   *
   * @return omniChannelDiscountEligible
   */
  @ApiModelProperty(example = "false", value = "boolean value for omni channel discount eligibility")


  public Boolean isOmniChannelDiscountEligible() {
    return omniChannelDiscountEligible;
  }

  /**
   * Sets the omni channel discount eligible.
   *
   * @param omniChannelDiscountEligible the new omni channel discount eligible
   */
  public void setOmniChannelDiscountEligible(Boolean omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
  }

  /**
   * Order.
   *
   * @param order the order
   * @return the commercial product
   */
  public CommercialProduct order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Order.
   *
   * @return order
   */
  @ApiModelProperty(value = "Order")


  public String getOrder() {
    return order;
  }

  /**
   * Sets the order.
   *
   * @param order the new order
   */
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * Payment type.
   *
   * @param paymentType the payment type
   * @return the commercial product
   */
  public CommercialProduct paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType.
   *
   * @return paymentType
   */
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the payment type.
   *
   * @param paymentType the new payment type
   */
  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * Post desc.
   *
   * @param postDesc the post desc
   * @return the commercial product
   */
  public CommercialProduct postDesc(String postDesc) {
    this.postDesc = postDesc;
    return this;
  }

  /**
   * Get postDesc.
   *
   * @return postDesc
   */
  @ApiModelProperty(value = "")


  public String getPostDesc() {
    return postDesc;
  }

  /**
   * Sets the post desc.
   *
   * @param postDesc the new post desc
   */
  public void setPostDesc(String postDesc) {
    this.postDesc = postDesc;
  }

  /**
   * Post desc mobile.
   *
   * @param postDescMobile the post desc mobile
   * @return the commercial product
   */
  public CommercialProduct postDescMobile(String postDescMobile) {
    this.postDescMobile = postDescMobile;
    return this;
  }

  /**
   * Get postDescMobile.
   *
   * @return postDescMobile
   */
  @ApiModelProperty(value = "")


  public String getPostDescMobile() {
    return postDescMobile;
  }

  /**
   * Sets the post desc mobile.
   *
   * @param postDescMobile the new post desc mobile
   */
  public void setPostDescMobile(String postDescMobile) {
    this.postDescMobile = postDescMobile;
  }

  /**
   * Pre desc.
   *
   * @param preDesc the pre desc
   * @return the commercial product
   */
  public CommercialProduct preDesc(String preDesc) {
    this.preDesc = preDesc;
    return this;
  }

  /**
   * Get preDesc.
   *
   * @return preDesc
   */
  @ApiModelProperty(value = "")


  public String getPreDesc() {
    return preDesc;
  }

  /**
   * Sets the pre desc.
   *
   * @param preDesc the new pre desc
   */
  public void setPreDesc(String preDesc) {
    this.preDesc = preDesc;
  }

  /**
   * Pre desc mobile.
   *
   * @param preDescMobile the pre desc mobile
   * @return the commercial product
   */
  public CommercialProduct preDescMobile(String preDescMobile) {
    this.preDescMobile = preDescMobile;
    return this;
  }

  /**
   * Get preDescMobile.
   *
   * @return preDescMobile
   */
  @ApiModelProperty(value = "")


  public String getPreDescMobile() {
    return preDescMobile;
  }

  /**
   * Sets the pre desc mobile.
   *
   * @param preDescMobile the new pre desc mobile
   */
  public void setPreDescMobile(String preDescMobile) {
    this.preDescMobile = preDescMobile;
  }

  /**
   * Price info.
   *
   * @param priceInfo the price info
   * @return the commercial product
   */
  public CommercialProduct priceInfo(ProductPrice priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  /**
   * Get priceInfo.
   *
   * @return priceInfo
   */
  @ApiModelProperty(value = "")

  @Valid

  public ProductPrice getPriceInfo() {
    return priceInfo;
  }

  /**
   * Sets the price info.
   *
   * @param priceInfo the new price info
   */
  public void setPriceInfo(ProductPrice priceInfo) {
    this.priceInfo = priceInfo;
  }

  /**
   * Product allowance.
   *
   * @param productAllowance the product allowance
   * @return the commercial product
   */
  public CommercialProduct productAllowance(ProductAllowance productAllowance) {
    this.productAllowance = productAllowance;
    return this;
  }

  /**
   * product allowance.
   *
   * @return productAllowance
   */
  @ApiModelProperty(value = "product allowance")

  @Valid

  public ProductAllowance getProductAllowance() {
    return productAllowance;
  }

  /**
   * Sets the product allowance.
   *
   * @param productAllowance the new product allowance
   */
  public void setProductAllowance(ProductAllowance productAllowance) {
    this.productAllowance = productAllowance;
  }

  /**
   * Product availability.
   *
   * @param productAvailability the product availability
   * @return the commercial product
   */
  public CommercialProduct productAvailability(ProductAvailability productAvailability) {
    this.productAvailability = productAvailability;
    return this;
  }

  /**
   * product availability.
   *
   * @return productAvailability
   */
  @ApiModelProperty(value = "product availability")

  @Valid

  public ProductAvailability getProductAvailability() {
    return productAvailability;
  }

  /**
   * Sets the product availability.
   *
   * @param productAvailability the new product availability
   */
  public void setProductAvailability(ProductAvailability productAvailability) {
    this.productAvailability = productAvailability;
  }

  /**
   * Product class.
   *
   * @param productClass the product class
   * @return the commercial product
   */
  public CommercialProduct productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Product class.
   *
   * @return productClass
   */
  @ApiModelProperty(value = "Product class")


  public String getProductClass() {
    return productClass;
  }

  /**
   * Sets the product class.
   *
   * @param productClass the new product class
   */
  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  /**
   * Product control.
   *
   * @param productControl the product control
   * @return the commercial product
   */
  public CommercialProduct productControl(ProductControl productControl) {
    this.productControl = productControl;
    return this;
  }

  /**
   * Get productControl.
   *
   * @return productControl
   */
  @ApiModelProperty(value = "")

  @Valid

  public ProductControl getProductControl() {
    return productControl;
  }

  /**
   * Sets the product control.
   *
   * @param productControl the new product control
   */
  public void setProductControl(ProductControl productControl) {
    this.productControl = productControl;
  }

  /**
   * Product groups.
   *
   * @param productGroups the product groups
   * @return the commercial product
   */
  public CommercialProduct productGroups(ProductGroups productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  /**
   * Get productGroups.
   *
   * @return productGroups
   */
  @ApiModelProperty(value = "")

  @Valid

  public ProductGroups getProductGroups() {
    return productGroups;
  }

  /**
   * Sets the product groups.
   *
   * @param productGroups the new product groups
   */
  public void setProductGroups(ProductGroups productGroups) {
    this.productGroups = productGroups;
  }

  /**
   * Product lines.
   *
   * @param productLines the product lines
   * @return the commercial product
   */
  public CommercialProduct productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  /**
   * Adds the product lines item.
   *
   * @param productLinesItem the product lines item
   * @return the commercial product
   */
  public CommercialProduct addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * productlines.
   *
   * @return productLines
   */
  @ApiModelProperty(value = "productlines")


  public List<String> getProductLines() {
    return productLines;
  }

  /**
   * Sets the product lines.
   *
   * @param productLines the new product lines
   */
  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
  }

  /**
   * Product price override.
   *
   * @param productPriceOverride the product price override
   * @return the commercial product
   */
  public CommercialProduct productPriceOverride(String productPriceOverride) {
    this.productPriceOverride = productPriceOverride;
    return this;
  }

  /**
   * Get productPriceOverride.
   *
   * @return productPriceOverride
   */
  @ApiModelProperty(value = "")


  public String getProductPriceOverride() {
    return productPriceOverride;
  }

  /**
   * Sets the product price override.
   *
   * @param productPriceOverride the new product price override
   */
  public void setProductPriceOverride(String productPriceOverride) {
    this.productPriceOverride = productPriceOverride;
  }

  /**
   * Product relationship list.
   *
   * @param productRelationshipList the product relationship list
   * @return the commercial product
   */
  public CommercialProduct productRelationshipList(String productRelationshipList) {
    this.productRelationshipList = productRelationshipList;
    return this;
  }

  /**
   * product relationship list.
   *
   * @return productRelationshipList
   */
  @ApiModelProperty(value = "product relationship list")


  public String getProductRelationshipList() {
    return productRelationshipList;
  }

  /**
   * Sets the product relationship list.
   *
   * @param productRelationshipList the new product relationship list
   */
  public void setProductRelationshipList(String productRelationshipList) {
    this.productRelationshipList = productRelationshipList;
  }

  /**
   * Product sub class.
   *
   * @param productSubClass the product sub class
   * @return the commercial product
   */
  public CommercialProduct productSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
    return this;
  }

  /**
   * product subclass.
   *
   * @return productSubClass
   */
  @ApiModelProperty(value = "product subclass")


  public String getProductSubClass() {
    return productSubClass;
  }

  /**
   * Sets the product sub class.
   *
   * @param productSubClass the new product sub class
   */
  public void setProductSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
  }

  /**
   * Promote as.
   *
   * @param promoteAs the promote as
   * @return the commercial product
   */
  public CommercialProduct promoteAs(PromoteAs promoteAs) {
    this.promoteAs = promoteAs;
    return this;
  }

  /**
   * Get promoteAs.
   *
   * @return promoteAs
   */
  @ApiModelProperty(value = "")

  @Valid

  public PromoteAs getPromoteAs() {
    return promoteAs;
  }

  /**
   * Sets the promote as.
   *
   * @param promoteAs the new promote as
   */
  public void setPromoteAs(PromoteAs promoteAs) {
    this.promoteAs = promoteAs;
  }

  /**
   * Recommendataions.
   *
   * @param recommendataions the recommendataions
   * @return the commercial product
   */
  public CommercialProduct recommendataions(List<Recommendations> recommendataions) {
    this.recommendataions = recommendataions;
    return this;
  }

  /**
   * Adds the recommendataions item.
   *
   * @param recommendataionsItem the recommendataions item
   * @return the commercial product
   */
  public CommercialProduct addRecommendataionsItem(Recommendations recommendataionsItem) {
    if (this.recommendataions == null) {
      this.recommendataions = new ArrayList<>();
    }
    this.recommendataions.add(recommendataionsItem);
    return this;
  }

  /**
   * Get recommendataions.
   *
   * @return recommendataions
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Recommendations> getRecommendataions() {
    return recommendataions;
  }

  /**
   * Sets the recommendataions.
   *
   * @param recommendataions the new recommendataions
   */
  public void setRecommendataions(List<Recommendations> recommendataions) {
    this.recommendataions = recommendataions;
  }

  /**
   * Seo canonical.
   *
   * @param seoCanonical the seo canonical
   * @return the commercial product
   */
  public CommercialProduct seoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
    return this;
  }

  /**
   * seoCanonical.
   *
   * @return seoCanonical
   */
  @ApiModelProperty(value = "seoCanonical")


  public String getSeoCanonical() {
    return seoCanonical;
  }

  /**
   * Sets the seo canonical.
   *
   * @param seoCanonical the new seo canonical
   */
  public void setSeoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
  }

  /**
   * Seo description.
   *
   * @param seoDescription the seo description
   * @return the commercial product
   */
  public CommercialProduct seoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
    return this;
  }

  /**
   * seo description.
   *
   * @return seoDescription
   */
  @ApiModelProperty(value = "seo description")


  public String getSeoDescription() {
    return seoDescription;
  }

  /**
   * Sets the seo description.
   *
   * @param seoDescription the new seo description
   */
  public void setSeoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
  }

  /**
   * Seo index.
   *
   * @param seoIndex the seo index
   * @return the commercial product
   */
  public CommercialProduct seoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
    return this;
  }

  /**
   * seo index.
   *
   * @return seoIndex
   */
  @ApiModelProperty(value = "seo index")


  public String getSeoIndex() {
    return seoIndex;
  }

  /**
   * Sets the seo index.
   *
   * @param seoIndex the new seo index
   */
  public void setSeoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
  }

  /**
   * Seo keywords.
   *
   * @param seoKeywords the seo keywords
   * @return the commercial product
   */
  public CommercialProduct seoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
    return this;
  }

  /**
   * seo keywords.
   *
   * @return seoKeywords
   */
  @ApiModelProperty(value = "seo keywords")


  public String getSeoKeywords() {
    return seoKeywords;
  }

  /**
   * Sets the seo keywords.
   *
   * @param seoKeywords the new seo keywords
   */
  public void setSeoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
  }

  /**
   * Specification groups.
   *
   * @param specificationGroups the specification groups
   * @return the commercial product
   */
  public CommercialProduct specificationGroups(List<Group> specificationGroups) {
    this.specificationGroups = specificationGroups;
    return this;
  }

  /**
   * Adds the specification groups item.
   *
   * @param specificationGroupsItem the specification groups item
   * @return the commercial product
   */
  public CommercialProduct addSpecificationGroupsItem(Group specificationGroupsItem) {
    if (this.specificationGroups == null) {
      this.specificationGroups = new ArrayList<>();
    }
    this.specificationGroups.add(specificationGroupsItem);
    return this;
  }

  /**
   * Get specificationGroups.
   *
   * @return specificationGroups
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Group> getSpecificationGroups() {
    return specificationGroups;
  }

  /**
   * Sets the specification groups.
   *
   * @param specificationGroups the new specification groups
   */
  public void setSpecificationGroups(List<Group> specificationGroups) {
    this.specificationGroups = specificationGroups;
  }

  /**
   * Stock threshold limit.
   *
   * @param stockThresholdLimit the stock threshold limit
   * @return the commercial product
   */
  public CommercialProduct stockThresholdLimit(String stockThresholdLimit) {
    this.stockThresholdLimit = stockThresholdLimit;
    return this;
  }

  /**
   * Get stockThresholdLimit.
   *
   * @return stockThresholdLimit
   */
  @ApiModelProperty(value = "")


  public String getStockThresholdLimit() {
    return stockThresholdLimit;
  }

  /**
   * Sets the stock threshold limit.
   *
   * @param stockThresholdLimit the new stock threshold limit
   */
  public void setStockThresholdLimit(String stockThresholdLimit) {
    this.stockThresholdLimit = stockThresholdLimit;
  }

  /**
   * Version.
   *
   * @param version the version
   * @return the commercial product
   */
  public CommercialProduct version(String version) {
    this.version = version;
    return this;
  }

  /**
   * version.
   *
   * @return version
   */
  @ApiModelProperty(value = "version")


  public String getVersion() {
    return version;
  }

  /**
   * Sets the version.
   *
   * @param version the new version
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Warranty.
   *
   * @param warranty the warranty
   * @return the commercial product
   */
  public CommercialProduct warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Product Warranty.
   *
   * @return warranty
   */
  @ApiModelProperty(value = "Product Warranty")


  public String getWarranty() {
    return warranty;
  }

  /**
   * Sets the warranty.
   *
   * @param warranty the new warranty
   */
  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommercialProduct commercialProduct = (CommercialProduct) o;
    return Objects.equals(this.allowanceDisplay, commercialProduct.allowanceDisplay) &&
        Objects.equals(this.battery, commercialProduct.battery) &&
        Objects.equals(this.boxPrice, commercialProduct.boxPrice) &&
        Objects.equals(this.categories, commercialProduct.categories) &&
        Objects.equals(this.condition, commercialProduct.condition) &&
        Objects.equals(this.contentVersion, commercialProduct.contentVersion) &&
        Objects.equals(this.delivery, commercialProduct.delivery) &&
        Objects.equals(this.discount, commercialProduct.discount) &&
        Objects.equals(this.displayName, commercialProduct.displayName) &&
        Objects.equals(this.duration, commercialProduct.duration) &&
        Objects.equals(this.eligibilitySubflow, commercialProduct.eligibilitySubflow) &&
        Objects.equals(this.equipment, commercialProduct.equipment) &&
        Objects.equals(this.fastMoving, commercialProduct.fastMoving) &&
        Objects.equals(this.id, commercialProduct.id) &&
        Objects.equals(this.inTheBox, commercialProduct.inTheBox) &&
        Objects.equals(this.inclusiveEligibility, commercialProduct.inclusiveEligibility) &&
        Objects.equals(this.isDeviceProduct, commercialProduct.isDeviceProduct) &&
        Objects.equals(this.isServicesProduct, commercialProduct.isServicesProduct) &&
        Objects.equals(this.leadPlanId, commercialProduct.leadPlanId) &&
        Objects.equals(this.listOfCompatibleBundles, commercialProduct.listOfCompatibleBundles) &&
        Objects.equals(this.listOfEligibleChannels, commercialProduct.listOfEligibleChannels) &&
        Objects.equals(this.listOfhelpURLs, commercialProduct.listOfhelpURLs) &&
        Objects.equals(this.listOfimageURLs, commercialProduct.listOfimageURLs) &&
        Objects.equals(this.listOfmediaURLs, commercialProduct.listOfmediaURLs) &&
        Objects.equals(this.merchandisingVersion, commercialProduct.merchandisingVersion) &&
        Objects.equals(this.metadataVersion, commercialProduct.metadataVersion) &&
        Objects.equals(this.misc, commercialProduct.misc) &&
        Objects.equals(this.name, commercialProduct.name) &&
        Objects.equals(this.omniChannelDiscountEligible, commercialProduct.omniChannelDiscountEligible) &&
        Objects.equals(this.order, commercialProduct.order) &&
        Objects.equals(this.paymentType, commercialProduct.paymentType) &&
        Objects.equals(this.postDesc, commercialProduct.postDesc) &&
        Objects.equals(this.postDescMobile, commercialProduct.postDescMobile) &&
        Objects.equals(this.preDesc, commercialProduct.preDesc) &&
        Objects.equals(this.preDescMobile, commercialProduct.preDescMobile) &&
        Objects.equals(this.priceInfo, commercialProduct.priceInfo) &&
        Objects.equals(this.productAllowance, commercialProduct.productAllowance) &&
        Objects.equals(this.productAvailability, commercialProduct.productAvailability) &&
        Objects.equals(this.productClass, commercialProduct.productClass) &&
        Objects.equals(this.productControl, commercialProduct.productControl) &&
        Objects.equals(this.productGroups, commercialProduct.productGroups) &&
        Objects.equals(this.productLines, commercialProduct.productLines) &&
        Objects.equals(this.productPriceOverride, commercialProduct.productPriceOverride) &&
        Objects.equals(this.productRelationshipList, commercialProduct.productRelationshipList) &&
        Objects.equals(this.productSubClass, commercialProduct.productSubClass) &&
        Objects.equals(this.promoteAs, commercialProduct.promoteAs) &&
        Objects.equals(this.recommendataions, commercialProduct.recommendataions) &&
        Objects.equals(this.seoCanonical, commercialProduct.seoCanonical) &&
        Objects.equals(this.seoDescription, commercialProduct.seoDescription) &&
        Objects.equals(this.seoIndex, commercialProduct.seoIndex) &&
        Objects.equals(this.seoKeywords, commercialProduct.seoKeywords) &&
        Objects.equals(this.specificationGroups, commercialProduct.specificationGroups) &&
        Objects.equals(this.stockThresholdLimit, commercialProduct.stockThresholdLimit) &&
        Objects.equals(this.version, commercialProduct.version) &&
        Objects.equals(this.warranty, commercialProduct.warranty);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowanceDisplay, battery, boxPrice, categories, condition, contentVersion, delivery, discount, displayName, duration, eligibilitySubflow, equipment, fastMoving, id, inTheBox, inclusiveEligibility, isDeviceProduct, isServicesProduct, leadPlanId, listOfCompatibleBundles, listOfEligibleChannels, listOfhelpURLs, listOfimageURLs, listOfmediaURLs, merchandisingVersion, metadataVersion, misc, name, omniChannelDiscountEligible, order, paymentType, postDesc, postDescMobile, preDesc, preDescMobile, priceInfo, productAllowance, productAvailability, productClass, productControl, productGroups, productLines, productPriceOverride, productRelationshipList, productSubClass, promoteAs, recommendataions, seoCanonical, seoDescription, seoIndex, seoKeywords, specificationGroups, stockThresholdLimit, version, warranty);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialProduct {\n");
    
    sb.append("    allowanceDisplay: ").append(toIndentedString(allowanceDisplay)).append("\n");
    sb.append("    battery: ").append(toIndentedString(battery)).append("\n");
    sb.append("    boxPrice: ").append(toIndentedString(boxPrice)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    contentVersion: ").append(toIndentedString(contentVersion)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    eligibilitySubflow: ").append(toIndentedString(eligibilitySubflow)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    fastMoving: ").append(toIndentedString(fastMoving)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inTheBox: ").append(toIndentedString(inTheBox)).append("\n");
    sb.append("    inclusiveEligibility: ").append(toIndentedString(inclusiveEligibility)).append("\n");
    sb.append("    isDeviceProduct: ").append(toIndentedString(isDeviceProduct)).append("\n");
    sb.append("    isServicesProduct: ").append(toIndentedString(isServicesProduct)).append("\n");
    sb.append("    leadPlanId: ").append(toIndentedString(leadPlanId)).append("\n");
    sb.append("    listOfCompatibleBundles: ").append(toIndentedString(listOfCompatibleBundles)).append("\n");
    sb.append("    listOfEligibleChannels: ").append(toIndentedString(listOfEligibleChannels)).append("\n");
    sb.append("    listOfhelpURLs: ").append(toIndentedString(listOfhelpURLs)).append("\n");
    sb.append("    listOfimageURLs: ").append(toIndentedString(listOfimageURLs)).append("\n");
    sb.append("    listOfmediaURLs: ").append(toIndentedString(listOfmediaURLs)).append("\n");
    sb.append("    merchandisingVersion: ").append(toIndentedString(merchandisingVersion)).append("\n");
    sb.append("    metadataVersion: ").append(toIndentedString(metadataVersion)).append("\n");
    sb.append("    misc: ").append(toIndentedString(misc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    omniChannelDiscountEligible: ").append(toIndentedString(omniChannelDiscountEligible)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    postDesc: ").append(toIndentedString(postDesc)).append("\n");
    sb.append("    postDescMobile: ").append(toIndentedString(postDescMobile)).append("\n");
    sb.append("    preDesc: ").append(toIndentedString(preDesc)).append("\n");
    sb.append("    preDescMobile: ").append(toIndentedString(preDescMobile)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    productAllowance: ").append(toIndentedString(productAllowance)).append("\n");
    sb.append("    productAvailability: ").append(toIndentedString(productAvailability)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    productControl: ").append(toIndentedString(productControl)).append("\n");
    sb.append("    productGroups: ").append(toIndentedString(productGroups)).append("\n");
    sb.append("    productLines: ").append(toIndentedString(productLines)).append("\n");
    sb.append("    productPriceOverride: ").append(toIndentedString(productPriceOverride)).append("\n");
    sb.append("    productRelationshipList: ").append(toIndentedString(productRelationshipList)).append("\n");
    sb.append("    productSubClass: ").append(toIndentedString(productSubClass)).append("\n");
    sb.append("    promoteAs: ").append(toIndentedString(promoteAs)).append("\n");
    sb.append("    recommendataions: ").append(toIndentedString(recommendataions)).append("\n");
    sb.append("    seoCanonical: ").append(toIndentedString(seoCanonical)).append("\n");
    sb.append("    seoDescription: ").append(toIndentedString(seoDescription)).append("\n");
    sb.append("    seoIndex: ").append(toIndentedString(seoIndex)).append("\n");
    sb.append("    seoKeywords: ").append(toIndentedString(seoKeywords)).append("\n");
    sb.append("    specificationGroups: ").append(toIndentedString(specificationGroups)).append("\n");
    sb.append("    stockThresholdLimit: ").append(toIndentedString(stockThresholdLimit)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

