package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CommercialProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class CommercialProduct   {
  @JsonProperty("allowanceDisplay")
  private String allowanceDisplay = null;

  @JsonProperty("battery")
  private Boolean battery = null;

  @JsonProperty("boxPrice")
  private BoxPrice boxPrice = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("contentVersion")
  private String contentVersion = null;

  @JsonProperty("delivery")
  private Delivery delivery = null;

  @JsonProperty("discount")
  private Discount discount = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("duration")
  private Duration duration = null;

  @JsonProperty("eligibilitySubflow")
  private String eligibilitySubflow = null;

  @JsonProperty("equipment")
  private Equipment equipment = null;

  @JsonProperty("fastMoving")
  private Boolean fastMoving = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("inTheBox")
  private String inTheBox = null;

  @JsonProperty("inclusiveEligibility")
  private String inclusiveEligibility = null;

  @JsonProperty("isDeviceProduct")
  private Boolean isDeviceProduct = null;

  @JsonProperty("isServicesProduct")
  private Boolean isServicesProduct = null;

  @JsonProperty("leadPlanId")
  private String leadPlanId = null;

  @JsonProperty("listOfCompatibleBundles")
  private String listOfCompatibleBundles = null;

  @JsonProperty("listOfEligibleChannels")
  private String listOfEligibleChannels = null;

  @JsonProperty("listOfhelpURLs")
  @Valid
  private List<HelpURL> listOfhelpURLs = null;

  @JsonProperty("listOfimageURLs")
  @Valid
  private List<ImageURL> listOfimageURLs = null;

  @JsonProperty("listOfmediaURLs")
  @Valid
  private List<MediaURL> listOfmediaURLs = null;

  @JsonProperty("merchandisingVersion")
  private String merchandisingVersion = null;

  @JsonProperty("metadataVersion")
  private String metadataVersion = null;

  @JsonProperty("misc")
  private Misc misc = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("omniChannelDiscountEligible")
  private Boolean omniChannelDiscountEligible = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("postDesc")
  private String postDesc = null;

  @JsonProperty("postDescMobile")
  private String postDescMobile = null;

  @JsonProperty("preDesc")
  private String preDesc = null;

  @JsonProperty("preDescMobile")
  private String preDescMobile = null;

  @JsonProperty("priceInfo")
  private ProductPrice priceInfo = null;

  @JsonProperty("productAllowance")
  private ProductAllowance productAllowance = null;

  @JsonProperty("productAvailability")
  private ProductAvailability productAvailability = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("productControl")
  private ProductControl productControl = null;

  @JsonProperty("productGroups")
  private ProductGroups productGroups = null;

  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  @JsonProperty("productPriceOverride")
  private String productPriceOverride = null;

  @JsonProperty("productRelationshipList")
  private String productRelationshipList = null;

  @JsonProperty("productSubClass")
  private String productSubClass = null;

  @JsonProperty("promoteAs")
  private PromoteAs promoteAs = null;

  @JsonProperty("recommendataions")
  @Valid
  private List<Recommendations> recommendataions = null;

  @JsonProperty("seoCanonical")
  private String seoCanonical = null;

  @JsonProperty("seoDescription")
  private String seoDescription = null;

  @JsonProperty("seoIndex")
  private String seoIndex = null;

  @JsonProperty("seoKeywords")
  private String seoKeywords = null;

  @JsonProperty("specificationGroups")
  @Valid
  private List<Group> specificationGroups = null;

  @JsonProperty("stockThresholdLimit")
  private String stockThresholdLimit = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("warranty")
  private String warranty = null;

  public CommercialProduct allowanceDisplay(String allowanceDisplay) {
    this.allowanceDisplay = allowanceDisplay;
    return this;
  }

  /**
   * Get allowanceDisplay
   * @return allowanceDisplay
  **/
  @ApiModelProperty(value = "")


  public String getAllowanceDisplay() {
    return allowanceDisplay;
  }

  public void setAllowanceDisplay(String allowanceDisplay) {
    this.allowanceDisplay = allowanceDisplay;
  }

  public CommercialProduct battery(Boolean battery) {
    this.battery = battery;
    return this;
  }

  /**
   * Get battery
   * @return battery
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isBattery() {
    return battery;
  }

  public void setBattery(Boolean battery) {
    this.battery = battery;
  }

  public CommercialProduct boxPrice(BoxPrice boxPrice) {
    this.boxPrice = boxPrice;
    return this;
  }

  /**
   * box price
   * @return boxPrice
  **/
  @ApiModelProperty(value = "box price")

  @Valid

  public BoxPrice getBoxPrice() {
    return boxPrice;
  }

  public void setBoxPrice(BoxPrice boxPrice) {
    this.boxPrice = boxPrice;
  }

  public CommercialProduct categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public CommercialProduct addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories
   * @return categories
  **/
  @ApiModelProperty(value = "categories")


  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public CommercialProduct condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Condition
   * @return condition
  **/
  @ApiModelProperty(value = "Condition")


  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public CommercialProduct contentVersion(String contentVersion) {
    this.contentVersion = contentVersion;
    return this;
  }

  /**
   * Get contentVersion
   * @return contentVersion
  **/
  @ApiModelProperty(value = "")


  public String getContentVersion() {
    return contentVersion;
  }

  public void setContentVersion(String contentVersion) {
    this.contentVersion = contentVersion;
  }

  public CommercialProduct delivery(Delivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Delivery getDelivery() {
    return delivery;
  }

  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  public CommercialProduct discount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount on product
   * @return discount
  **/
  @ApiModelProperty(value = "Discount on product")

  @Valid

  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public CommercialProduct displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CommercialProduct duration(Duration duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the product
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of the product")

  @Valid

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public CommercialProduct eligibilitySubflow(String eligibilitySubflow) {
    this.eligibilitySubflow = eligibilitySubflow;
    return this;
  }

  /**
   * Get eligibilitySubflow
   * @return eligibilitySubflow
  **/
  @ApiModelProperty(value = "")


  public String getEligibilitySubflow() {
    return eligibilitySubflow;
  }

  public void setEligibilitySubflow(String eligibilitySubflow) {
    this.eligibilitySubflow = eligibilitySubflow;
  }

  public CommercialProduct equipment(Equipment equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * equipment details
   * @return equipment
  **/
  @ApiModelProperty(value = "equipment details")

  @Valid

  public Equipment getEquipment() {
    return equipment;
  }

  public void setEquipment(Equipment equipment) {
    this.equipment = equipment;
  }

  public CommercialProduct fastMoving(Boolean fastMoving) {
    this.fastMoving = fastMoving;
    return this;
  }

  /**
   * Get fastMoving
   * @return fastMoving
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isFastMoving() {
    return fastMoving;
  }

  public void setFastMoving(Boolean fastMoving) {
    this.fastMoving = fastMoving;
  }

  public CommercialProduct id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Product ID
   * @return id
  **/
  @ApiModelProperty(value = "Product ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommercialProduct inTheBox(String inTheBox) {
    this.inTheBox = inTheBox;
    return this;
  }

  /**
   * Get inTheBox
   * @return inTheBox
  **/
  @ApiModelProperty(value = "")


  public String getInTheBox() {
    return inTheBox;
  }

  public void setInTheBox(String inTheBox) {
    this.inTheBox = inTheBox;
  }

  public CommercialProduct inclusiveEligibility(String inclusiveEligibility) {
    this.inclusiveEligibility = inclusiveEligibility;
    return this;
  }

  /**
   * Eligibility
   * @return inclusiveEligibility
  **/
  @ApiModelProperty(value = "Eligibility")


  public String getInclusiveEligibility() {
    return inclusiveEligibility;
  }

  public void setInclusiveEligibility(String inclusiveEligibility) {
    this.inclusiveEligibility = inclusiveEligibility;
  }

  public CommercialProduct isDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Boolean attribute to identify all device products
   * @return isDeviceProduct
  **/
  @ApiModelProperty(example = "false", value = "Boolean attribute to identify all device products")


  public Boolean isIsDeviceProduct() {
    return isDeviceProduct;
  }

  public void setIsDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  public CommercialProduct isServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * Boolean attribute service product
   * @return isServicesProduct
  **/
  @ApiModelProperty(example = "false", value = "Boolean attribute service product")


  public Boolean isIsServicesProduct() {
    return isServicesProduct;
  }

  public void setIsServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  public CommercialProduct leadPlanId(String leadPlanId) {
    this.leadPlanId = leadPlanId;
    return this;
  }

  /**
   * Get leadPlanId
   * @return leadPlanId
  **/
  @ApiModelProperty(value = "")


  public String getLeadPlanId() {
    return leadPlanId;
  }

  public void setLeadPlanId(String leadPlanId) {
    this.leadPlanId = leadPlanId;
  }

  public CommercialProduct listOfCompatibleBundles(String listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
    return this;
  }

  /**
   * Get listOfCompatibleBundles
   * @return listOfCompatibleBundles
  **/
  @ApiModelProperty(value = "")


  public String getListOfCompatibleBundles() {
    return listOfCompatibleBundles;
  }

  public void setListOfCompatibleBundles(String listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
  }

  public CommercialProduct listOfEligibleChannels(String listOfEligibleChannels) {
    this.listOfEligibleChannels = listOfEligibleChannels;
    return this;
  }

  /**
   * Get listOfEligibleChannels
   * @return listOfEligibleChannels
  **/
  @ApiModelProperty(value = "")


  public String getListOfEligibleChannels() {
    return listOfEligibleChannels;
  }

  public void setListOfEligibleChannels(String listOfEligibleChannels) {
    this.listOfEligibleChannels = listOfEligibleChannels;
  }

  public CommercialProduct listOfhelpURLs(List<HelpURL> listOfhelpURLs) {
    this.listOfhelpURLs = listOfhelpURLs;
    return this;
  }

  public CommercialProduct addListOfhelpURLsItem(HelpURL listOfhelpURLsItem) {
    if (this.listOfhelpURLs == null) {
      this.listOfhelpURLs = new ArrayList<>();
    }
    this.listOfhelpURLs.add(listOfhelpURLsItem);
    return this;
  }

  /**
   * Get listOfhelpURLs
   * @return listOfhelpURLs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HelpURL> getListOfhelpURLs() {
    return listOfhelpURLs;
  }

  public void setListOfhelpURLs(List<HelpURL> listOfhelpURLs) {
    this.listOfhelpURLs = listOfhelpURLs;
  }

  public CommercialProduct listOfimageURLs(List<ImageURL> listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
    return this;
  }

  public CommercialProduct addListOfimageURLsItem(ImageURL listOfimageURLsItem) {
    if (this.listOfimageURLs == null) {
      this.listOfimageURLs = new ArrayList<>();
    }
    this.listOfimageURLs.add(listOfimageURLsItem);
    return this;
  }

  /**
   * Get listOfimageURLs
   * @return listOfimageURLs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ImageURL> getListOfimageURLs() {
    return listOfimageURLs;
  }

  public void setListOfimageURLs(List<ImageURL> listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
  }

  public CommercialProduct listOfmediaURLs(List<MediaURL> listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
    return this;
  }

  public CommercialProduct addListOfmediaURLsItem(MediaURL listOfmediaURLsItem) {
    if (this.listOfmediaURLs == null) {
      this.listOfmediaURLs = new ArrayList<>();
    }
    this.listOfmediaURLs.add(listOfmediaURLsItem);
    return this;
  }

  /**
   * Get listOfmediaURLs
   * @return listOfmediaURLs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MediaURL> getListOfmediaURLs() {
    return listOfmediaURLs;
  }

  public void setListOfmediaURLs(List<MediaURL> listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
  }

  public CommercialProduct merchandisingVersion(String merchandisingVersion) {
    this.merchandisingVersion = merchandisingVersion;
    return this;
  }

  /**
   * Get merchandisingVersion
   * @return merchandisingVersion
  **/
  @ApiModelProperty(value = "")


  public String getMerchandisingVersion() {
    return merchandisingVersion;
  }

  public void setMerchandisingVersion(String merchandisingVersion) {
    this.merchandisingVersion = merchandisingVersion;
  }

  public CommercialProduct metadataVersion(String metadataVersion) {
    this.metadataVersion = metadataVersion;
    return this;
  }

  /**
   * Get metadataVersion
   * @return metadataVersion
  **/
  @ApiModelProperty(value = "")


  public String getMetadataVersion() {
    return metadataVersion;
  }

  public void setMetadataVersion(String metadataVersion) {
    this.metadataVersion = metadataVersion;
  }

  public CommercialProduct misc(Misc misc) {
    this.misc = misc;
    return this;
  }

  /**
   * Get misc
   * @return misc
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Misc getMisc() {
    return misc;
  }

  public void setMisc(Misc misc) {
    this.misc = misc;
  }

  public CommercialProduct name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Product name as defined catalogue
   * @return name
  **/
  @ApiModelProperty(value = "Product name as defined catalogue")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommercialProduct omniChannelDiscountEligible(Boolean omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
    return this;
  }

  /**
   * boolean value for omni channel discount eligibility
   * @return omniChannelDiscountEligible
  **/
  @ApiModelProperty(example = "false", value = "boolean value for omni channel discount eligibility")


  public Boolean isOmniChannelDiscountEligible() {
    return omniChannelDiscountEligible;
  }

  public void setOmniChannelDiscountEligible(Boolean omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
  }

  public CommercialProduct order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Order
   * @return order
  **/
  @ApiModelProperty(value = "Order")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public CommercialProduct paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public CommercialProduct postDesc(String postDesc) {
    this.postDesc = postDesc;
    return this;
  }

  /**
   * Get postDesc
   * @return postDesc
  **/
  @ApiModelProperty(value = "")


  public String getPostDesc() {
    return postDesc;
  }

  public void setPostDesc(String postDesc) {
    this.postDesc = postDesc;
  }

  public CommercialProduct postDescMobile(String postDescMobile) {
    this.postDescMobile = postDescMobile;
    return this;
  }

  /**
   * Get postDescMobile
   * @return postDescMobile
  **/
  @ApiModelProperty(value = "")


  public String getPostDescMobile() {
    return postDescMobile;
  }

  public void setPostDescMobile(String postDescMobile) {
    this.postDescMobile = postDescMobile;
  }

  public CommercialProduct preDesc(String preDesc) {
    this.preDesc = preDesc;
    return this;
  }

  /**
   * Get preDesc
   * @return preDesc
  **/
  @ApiModelProperty(value = "")


  public String getPreDesc() {
    return preDesc;
  }

  public void setPreDesc(String preDesc) {
    this.preDesc = preDesc;
  }

  public CommercialProduct preDescMobile(String preDescMobile) {
    this.preDescMobile = preDescMobile;
    return this;
  }

  /**
   * Get preDescMobile
   * @return preDescMobile
  **/
  @ApiModelProperty(value = "")


  public String getPreDescMobile() {
    return preDescMobile;
  }

  public void setPreDescMobile(String preDescMobile) {
    this.preDescMobile = preDescMobile;
  }

  public CommercialProduct priceInfo(ProductPrice priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  /**
   * Get priceInfo
   * @return priceInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductPrice getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(ProductPrice priceInfo) {
    this.priceInfo = priceInfo;
  }

  public CommercialProduct productAllowance(ProductAllowance productAllowance) {
    this.productAllowance = productAllowance;
    return this;
  }

  /**
   * product allowance
   * @return productAllowance
  **/
  @ApiModelProperty(value = "product allowance")

  @Valid

  public ProductAllowance getProductAllowance() {
    return productAllowance;
  }

  public void setProductAllowance(ProductAllowance productAllowance) {
    this.productAllowance = productAllowance;
  }

  public CommercialProduct productAvailability(ProductAvailability productAvailability) {
    this.productAvailability = productAvailability;
    return this;
  }

  /**
   * product availability
   * @return productAvailability
  **/
  @ApiModelProperty(value = "product availability")

  @Valid

  public ProductAvailability getProductAvailability() {
    return productAvailability;
  }

  public void setProductAvailability(ProductAvailability productAvailability) {
    this.productAvailability = productAvailability;
  }

  public CommercialProduct productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Product class
   * @return productClass
  **/
  @ApiModelProperty(value = "Product class")


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public CommercialProduct productControl(ProductControl productControl) {
    this.productControl = productControl;
    return this;
  }

  /**
   * Get productControl
   * @return productControl
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductControl getProductControl() {
    return productControl;
  }

  public void setProductControl(ProductControl productControl) {
    this.productControl = productControl;
  }

  public CommercialProduct productGroups(ProductGroups productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  /**
   * Get productGroups
   * @return productGroups
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductGroups getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(ProductGroups productGroups) {
    this.productGroups = productGroups;
  }

  public CommercialProduct productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  public CommercialProduct addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * productlines
   * @return productLines
  **/
  @ApiModelProperty(value = "productlines")


  public List<String> getProductLines() {
    return productLines;
  }

  public void setProductLines(List<String> productLines) {
    this.productLines = productLines;
  }

  public CommercialProduct productPriceOverride(String productPriceOverride) {
    this.productPriceOverride = productPriceOverride;
    return this;
  }

  /**
   * Get productPriceOverride
   * @return productPriceOverride
  **/
  @ApiModelProperty(value = "")


  public String getProductPriceOverride() {
    return productPriceOverride;
  }

  public void setProductPriceOverride(String productPriceOverride) {
    this.productPriceOverride = productPriceOverride;
  }

  public CommercialProduct productRelationshipList(String productRelationshipList) {
    this.productRelationshipList = productRelationshipList;
    return this;
  }

  /**
   * product relationship list
   * @return productRelationshipList
  **/
  @ApiModelProperty(value = "product relationship list")


  public String getProductRelationshipList() {
    return productRelationshipList;
  }

  public void setProductRelationshipList(String productRelationshipList) {
    this.productRelationshipList = productRelationshipList;
  }

  public CommercialProduct productSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
    return this;
  }

  /**
   * product subclass
   * @return productSubClass
  **/
  @ApiModelProperty(value = "product subclass")


  public String getProductSubClass() {
    return productSubClass;
  }

  public void setProductSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
  }

  public CommercialProduct promoteAs(PromoteAs promoteAs) {
    this.promoteAs = promoteAs;
    return this;
  }

  /**
   * Get promoteAs
   * @return promoteAs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PromoteAs getPromoteAs() {
    return promoteAs;
  }

  public void setPromoteAs(PromoteAs promoteAs) {
    this.promoteAs = promoteAs;
  }

  public CommercialProduct recommendataions(List<Recommendations> recommendataions) {
    this.recommendataions = recommendataions;
    return this;
  }

  public CommercialProduct addRecommendataionsItem(Recommendations recommendataionsItem) {
    if (this.recommendataions == null) {
      this.recommendataions = new ArrayList<>();
    }
    this.recommendataions.add(recommendataionsItem);
    return this;
  }

  /**
   * Get recommendataions
   * @return recommendataions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Recommendations> getRecommendataions() {
    return recommendataions;
  }

  public void setRecommendataions(List<Recommendations> recommendataions) {
    this.recommendataions = recommendataions;
  }

  public CommercialProduct seoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
    return this;
  }

  /**
   * seoCanonical
   * @return seoCanonical
  **/
  @ApiModelProperty(value = "seoCanonical")


  public String getSeoCanonical() {
    return seoCanonical;
  }

  public void setSeoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
  }

  public CommercialProduct seoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
    return this;
  }

  /**
   * seo description
   * @return seoDescription
  **/
  @ApiModelProperty(value = "seo description")


  public String getSeoDescription() {
    return seoDescription;
  }

  public void setSeoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
  }

  public CommercialProduct seoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
    return this;
  }

  /**
   * seo index
   * @return seoIndex
  **/
  @ApiModelProperty(value = "seo index")


  public String getSeoIndex() {
    return seoIndex;
  }

  public void setSeoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
  }

  public CommercialProduct seoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
    return this;
  }

  /**
   * seo keywords
   * @return seoKeywords
  **/
  @ApiModelProperty(value = "seo keywords")


  public String getSeoKeywords() {
    return seoKeywords;
  }

  public void setSeoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
  }

  public CommercialProduct specificationGroups(List<Group> specificationGroups) {
    this.specificationGroups = specificationGroups;
    return this;
  }

  public CommercialProduct addSpecificationGroupsItem(Group specificationGroupsItem) {
    if (this.specificationGroups == null) {
      this.specificationGroups = new ArrayList<>();
    }
    this.specificationGroups.add(specificationGroupsItem);
    return this;
  }

  /**
   * Get specificationGroups
   * @return specificationGroups
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Group> getSpecificationGroups() {
    return specificationGroups;
  }

  public void setSpecificationGroups(List<Group> specificationGroups) {
    this.specificationGroups = specificationGroups;
  }

  public CommercialProduct stockThresholdLimit(String stockThresholdLimit) {
    this.stockThresholdLimit = stockThresholdLimit;
    return this;
  }

  /**
   * Get stockThresholdLimit
   * @return stockThresholdLimit
  **/
  @ApiModelProperty(value = "")


  public String getStockThresholdLimit() {
    return stockThresholdLimit;
  }

  public void setStockThresholdLimit(String stockThresholdLimit) {
    this.stockThresholdLimit = stockThresholdLimit;
  }

  public CommercialProduct version(String version) {
    this.version = version;
    return this;
  }

  /**
   * version
   * @return version
  **/
  @ApiModelProperty(value = "version")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CommercialProduct warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Product Warranty
   * @return warranty
  **/
  @ApiModelProperty(value = "Product Warranty")


  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(allowanceDisplay, battery, boxPrice, categories, condition, contentVersion, delivery, discount, displayName, duration, eligibilitySubflow, equipment, fastMoving, id, inTheBox, inclusiveEligibility, isDeviceProduct, isServicesProduct, leadPlanId, listOfCompatibleBundles, listOfEligibleChannels, listOfhelpURLs, listOfimageURLs, listOfmediaURLs, merchandisingVersion, metadataVersion, misc, name, omniChannelDiscountEligible, order, paymentType, postDesc, postDescMobile, preDesc, preDescMobile, priceInfo, productAllowance, productAvailability, productClass, productControl, productGroups, productLines, productPriceOverride, productRelationshipList, productSubClass, promoteAs, recommendataions, seoCanonical, seoDescription, seoIndex, seoKeywords, specificationGroups, stockThresholdLimit, version, warranty);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

