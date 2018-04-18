package com.vf.uk.dal.broadband.entity.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-17T20:40:09.952Z")

public class ProductDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("isServicesProduct")
  private String isServicesProduct = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("discount")
  private String discount = null;

  @JsonProperty("warranty")
  private String warranty = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("categories")
  @Valid
  private List<Category> categories = null;

  @JsonProperty("productLines")
  @Valid
  private List<ProductLines> productLines = null;

  @JsonProperty("priceDetail")
  private Object priceDetail = null;

  @JsonProperty("productAllowance")
  private String productAllowance = null;

  @JsonProperty("boxPrice")
  private Object boxPrice = null;

  @JsonProperty("productAvailability")
  private Object productAvailability = null;

  @JsonProperty("productRelationshipList")
  private String productRelationshipList = null;

  @JsonProperty("isDeviceProduct")
  private String isDeviceProduct = null;

  @JsonProperty("inclusiveEligibility")
  private String inclusiveEligibility = null;

  @JsonProperty("omniChannelDiscountEligible")
  private String omniChannelDiscountEligible = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("seoCanonical")
  private String seoCanonical = null;

  @JsonProperty("seoDescription")
  private String seoDescription = null;

  @JsonProperty("seoKeywords")
  private String seoKeywords = null;

  @JsonProperty("seoIndex")
  private String seoIndex = null;

  @JsonProperty("seoRobots")
  private String seoRobots = null;

  @JsonProperty("productSubClass")
  private String productSubClass = null;

  @JsonProperty("equipment")
  private Object equipment = null;

  @JsonProperty("eligibilitySubflow")
  private String eligibilitySubflow = null;

  @JsonProperty("allowanceDisplay")
  private String allowanceDisplay = null;

  @JsonProperty("delivery")
  private Object delivery = null;

  @JsonProperty("metadataVersion")
  private String metadataVersion = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("preDesc")
  private String preDesc = null;

  @JsonProperty("postDesc")
  private String postDesc = null;

  @JsonProperty("preDescMobile")
  private String preDescMobile = null;

  @JsonProperty("postDescMobile")
  private String postDescMobile = null;

  @JsonProperty("listOfimageURLs")
  private String listOfimageURLs = null;

  @JsonProperty("listOfmediaURLs")
  private String listOfmediaURLs = null;

  @JsonProperty("listOfhelpURLs")
  private String listOfhelpURLs = null;

  @JsonProperty("specificationGroups")
  private String specificationGroups = null;

  @JsonProperty("inTheBox")
  private String inTheBox = null;

  @JsonProperty("contentVersion")
  private String contentVersion = null;

  @JsonProperty("productControl")
  private Object productControl = null;

  @JsonProperty("productGroups")
  private String productGroups = null;

  @JsonProperty("misc")
  private String misc = null;

  @JsonProperty("productPriceOverride")
  private String productPriceOverride = null;

  @JsonProperty("promoteAs")
  private String promoteAs = null;

  @JsonProperty("leadPlanId")
  private String leadPlanId = null;

  @JsonProperty("recommendataions")
  private String recommendataions = null;

  @JsonProperty("fastMoving")
  private String fastMoving = null;

  @JsonProperty("stockThresholdLimit")
  private String stockThresholdLimit = null;

  @JsonProperty("listOfEligibleChannels")
  private String listOfEligibleChannels = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("battery")
  private String battery = null;

  @JsonProperty("merchandisingVersion")
  private String merchandisingVersion = null;

  @JsonProperty("listOfCompatibleBundles")
  private String listOfCompatibleBundles = null;

  public ProductDetails id(String id) {
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

  public ProductDetails order(String order) {
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

  public ProductDetails name(String name) {
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

  public ProductDetails productClass(String productClass) {
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

  public ProductDetails isServicesProduct(String isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * Boolean attribute service product
   * @return isServicesProduct
  **/
  @ApiModelProperty(value = "Boolean attribute service product")


  public String getIsServicesProduct() {
    return isServicesProduct;
  }

  public void setIsServicesProduct(String isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  public ProductDetails duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the product
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of the product")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public ProductDetails discount(String discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount on product
   * @return discount
  **/
  @ApiModelProperty(value = "Discount on product")


  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }

  public ProductDetails warranty(String warranty) {
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

  public ProductDetails condition(String condition) {
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

  public ProductDetails categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public ProductDetails addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Category>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories
   * @return categories
  **/
  @ApiModelProperty(value = "categories")

  @Valid

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  public ProductDetails productLines(List<ProductLines> productLines) {
    this.productLines = productLines;
    return this;
  }

  public ProductDetails addProductLinesItem(ProductLines productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<ProductLines>();
    }
    this.productLines.add(productLinesItem);
    return this;
  }

  /**
   * productlines
   * @return productLines
  **/
  @ApiModelProperty(value = "productlines")

  @Valid

  public List<ProductLines> getProductLines() {
    return productLines;
  }

  public void setProductLines(List<ProductLines> productLines) {
    this.productLines = productLines;
  }

  public ProductDetails priceDetail(Object priceDetail) {
    this.priceDetail = priceDetail;
    return this;
  }

  /**
   * pricedetails
   * @return priceDetail
  **/
  @ApiModelProperty(value = "pricedetails")


  public Object getPriceDetail() {
    return priceDetail;
  }

  public void setPriceDetail(Object priceDetail) {
    this.priceDetail = priceDetail;
  }

  public ProductDetails productAllowance(String productAllowance) {
    this.productAllowance = productAllowance;
    return this;
  }

  /**
   * product allowance
   * @return productAllowance
  **/
  @ApiModelProperty(value = "product allowance")


  public String getProductAllowance() {
    return productAllowance;
  }

  public void setProductAllowance(String productAllowance) {
    this.productAllowance = productAllowance;
  }

  public ProductDetails boxPrice(Object boxPrice) {
    this.boxPrice = boxPrice;
    return this;
  }

  /**
   * box price
   * @return boxPrice
  **/
  @ApiModelProperty(value = "box price")


  public Object getBoxPrice() {
    return boxPrice;
  }

  public void setBoxPrice(Object boxPrice) {
    this.boxPrice = boxPrice;
  }

  public ProductDetails productAvailability(Object productAvailability) {
    this.productAvailability = productAvailability;
    return this;
  }

  /**
   * product availability
   * @return productAvailability
  **/
  @ApiModelProperty(value = "product availability")


  public Object getProductAvailability() {
    return productAvailability;
  }

  public void setProductAvailability(Object productAvailability) {
    this.productAvailability = productAvailability;
  }

  public ProductDetails productRelationshipList(String productRelationshipList) {
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

  public ProductDetails isDeviceProduct(String isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Boolean attribute to identify all device products
   * @return isDeviceProduct
  **/
  @ApiModelProperty(value = "Boolean attribute to identify all device products")


  public String getIsDeviceProduct() {
    return isDeviceProduct;
  }

  public void setIsDeviceProduct(String isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  public ProductDetails inclusiveEligibility(String inclusiveEligibility) {
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

  public ProductDetails omniChannelDiscountEligible(String omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
    return this;
  }

  /**
   * boolean value for omni channel discount eligibility
   * @return omniChannelDiscountEligible
  **/
  @ApiModelProperty(value = "boolean value for omni channel discount eligibility")


  public String getOmniChannelDiscountEligible() {
    return omniChannelDiscountEligible;
  }

  public void setOmniChannelDiscountEligible(String omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
  }

  public ProductDetails version(String version) {
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

  public ProductDetails seoCanonical(String seoCanonical) {
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

  public ProductDetails seoDescription(String seoDescription) {
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

  public ProductDetails seoKeywords(String seoKeywords) {
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

  public ProductDetails seoIndex(String seoIndex) {
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

  public ProductDetails seoRobots(String seoRobots) {
    this.seoRobots = seoRobots;
    return this;
  }

  /**
   * seo robots
   * @return seoRobots
  **/
  @ApiModelProperty(value = "seo robots")


  public String getSeoRobots() {
    return seoRobots;
  }

  public void setSeoRobots(String seoRobots) {
    this.seoRobots = seoRobots;
  }

  public ProductDetails productSubClass(String productSubClass) {
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

  public ProductDetails equipment(Object equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * equipment details
   * @return equipment
  **/
  @ApiModelProperty(value = "equipment details")


  public Object getEquipment() {
    return equipment;
  }

  public void setEquipment(Object equipment) {
    this.equipment = equipment;
  }

  public ProductDetails eligibilitySubflow(String eligibilitySubflow) {
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

  public ProductDetails allowanceDisplay(String allowanceDisplay) {
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

  public ProductDetails delivery(Object delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")


  public Object getDelivery() {
    return delivery;
  }

  public void setDelivery(Object delivery) {
    this.delivery = delivery;
  }

  public ProductDetails metadataVersion(String metadataVersion) {
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

  public ProductDetails displayName(String displayName) {
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

  public ProductDetails preDesc(String preDesc) {
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

  public ProductDetails postDesc(String postDesc) {
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

  public ProductDetails preDescMobile(String preDescMobile) {
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

  public ProductDetails postDescMobile(String postDescMobile) {
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

  public ProductDetails listOfimageURLs(String listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
    return this;
  }

  /**
   * Get listOfimageURLs
   * @return listOfimageURLs
  **/
  @ApiModelProperty(value = "")


  public String getListOfimageURLs() {
    return listOfimageURLs;
  }

  public void setListOfimageURLs(String listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
  }

  public ProductDetails listOfmediaURLs(String listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
    return this;
  }

  /**
   * Get listOfmediaURLs
   * @return listOfmediaURLs
  **/
  @ApiModelProperty(value = "")


  public String getListOfmediaURLs() {
    return listOfmediaURLs;
  }

  public void setListOfmediaURLs(String listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
  }

  public ProductDetails listOfhelpURLs(String listOfhelpURLs) {
    this.listOfhelpURLs = listOfhelpURLs;
    return this;
  }

  /**
   * Get listOfhelpURLs
   * @return listOfhelpURLs
  **/
  @ApiModelProperty(value = "")


  public String getListOfhelpURLs() {
    return listOfhelpURLs;
  }

  public void setListOfhelpURLs(String listOfhelpURLs) {
    this.listOfhelpURLs = listOfhelpURLs;
  }

  public ProductDetails specificationGroups(String specificationGroups) {
    this.specificationGroups = specificationGroups;
    return this;
  }

  /**
   * Get specificationGroups
   * @return specificationGroups
  **/
  @ApiModelProperty(value = "")


  public String getSpecificationGroups() {
    return specificationGroups;
  }

  public void setSpecificationGroups(String specificationGroups) {
    this.specificationGroups = specificationGroups;
  }

  public ProductDetails inTheBox(String inTheBox) {
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

  public ProductDetails contentVersion(String contentVersion) {
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

  public ProductDetails productControl(Object productControl) {
    this.productControl = productControl;
    return this;
  }

  /**
   * Get productControl
   * @return productControl
  **/
  @ApiModelProperty(value = "")


  public Object getProductControl() {
    return productControl;
  }

  public void setProductControl(Object productControl) {
    this.productControl = productControl;
  }

  public ProductDetails productGroups(String productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  /**
   * Get productGroups
   * @return productGroups
  **/
  @ApiModelProperty(value = "")


  public String getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(String productGroups) {
    this.productGroups = productGroups;
  }

  public ProductDetails misc(String misc) {
    this.misc = misc;
    return this;
  }

  /**
   * Get misc
   * @return misc
  **/
  @ApiModelProperty(value = "")


  public String getMisc() {
    return misc;
  }

  public void setMisc(String misc) {
    this.misc = misc;
  }

  public ProductDetails productPriceOverride(String productPriceOverride) {
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

  public ProductDetails promoteAs(String promoteAs) {
    this.promoteAs = promoteAs;
    return this;
  }

  /**
   * Get promoteAs
   * @return promoteAs
  **/
  @ApiModelProperty(value = "")


  public String getPromoteAs() {
    return promoteAs;
  }

  public void setPromoteAs(String promoteAs) {
    this.promoteAs = promoteAs;
  }

  public ProductDetails leadPlanId(String leadPlanId) {
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

  public ProductDetails recommendataions(String recommendataions) {
    this.recommendataions = recommendataions;
    return this;
  }

  /**
   * Get recommendataions
   * @return recommendataions
  **/
  @ApiModelProperty(value = "")


  public String getRecommendataions() {
    return recommendataions;
  }

  public void setRecommendataions(String recommendataions) {
    this.recommendataions = recommendataions;
  }

  public ProductDetails fastMoving(String fastMoving) {
    this.fastMoving = fastMoving;
    return this;
  }

  /**
   * Get fastMoving
   * @return fastMoving
  **/
  @ApiModelProperty(value = "")


  public String getFastMoving() {
    return fastMoving;
  }

  public void setFastMoving(String fastMoving) {
    this.fastMoving = fastMoving;
  }

  public ProductDetails stockThresholdLimit(String stockThresholdLimit) {
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

  public ProductDetails listOfEligibleChannels(String listOfEligibleChannels) {
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

  public ProductDetails paymentType(String paymentType) {
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

  public ProductDetails battery(String battery) {
    this.battery = battery;
    return this;
  }

  /**
   * Get battery
   * @return battery
  **/
  @ApiModelProperty(value = "")


  public String getBattery() {
    return battery;
  }

  public void setBattery(String battery) {
    this.battery = battery;
  }

  public ProductDetails merchandisingVersion(String merchandisingVersion) {
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

  public ProductDetails listOfCompatibleBundles(String listOfCompatibleBundles) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetails productDetails = (ProductDetails) o;
    return Objects.equals(this.id, productDetails.id) &&
        Objects.equals(this.order, productDetails.order) &&
        Objects.equals(this.name, productDetails.name) &&
        Objects.equals(this.productClass, productDetails.productClass) &&
        Objects.equals(this.isServicesProduct, productDetails.isServicesProduct) &&
        Objects.equals(this.duration, productDetails.duration) &&
        Objects.equals(this.discount, productDetails.discount) &&
        Objects.equals(this.warranty, productDetails.warranty) &&
        Objects.equals(this.condition, productDetails.condition) &&
        Objects.equals(this.categories, productDetails.categories) &&
        Objects.equals(this.productLines, productDetails.productLines) &&
        Objects.equals(this.priceDetail, productDetails.priceDetail) &&
        Objects.equals(this.productAllowance, productDetails.productAllowance) &&
        Objects.equals(this.boxPrice, productDetails.boxPrice) &&
        Objects.equals(this.productAvailability, productDetails.productAvailability) &&
        Objects.equals(this.productRelationshipList, productDetails.productRelationshipList) &&
        Objects.equals(this.isDeviceProduct, productDetails.isDeviceProduct) &&
        Objects.equals(this.inclusiveEligibility, productDetails.inclusiveEligibility) &&
        Objects.equals(this.omniChannelDiscountEligible, productDetails.omniChannelDiscountEligible) &&
        Objects.equals(this.version, productDetails.version) &&
        Objects.equals(this.seoCanonical, productDetails.seoCanonical) &&
        Objects.equals(this.seoDescription, productDetails.seoDescription) &&
        Objects.equals(this.seoKeywords, productDetails.seoKeywords) &&
        Objects.equals(this.seoIndex, productDetails.seoIndex) &&
        Objects.equals(this.seoRobots, productDetails.seoRobots) &&
        Objects.equals(this.productSubClass, productDetails.productSubClass) &&
        Objects.equals(this.equipment, productDetails.equipment) &&
        Objects.equals(this.eligibilitySubflow, productDetails.eligibilitySubflow) &&
        Objects.equals(this.allowanceDisplay, productDetails.allowanceDisplay) &&
        Objects.equals(this.delivery, productDetails.delivery) &&
        Objects.equals(this.metadataVersion, productDetails.metadataVersion) &&
        Objects.equals(this.displayName, productDetails.displayName) &&
        Objects.equals(this.preDesc, productDetails.preDesc) &&
        Objects.equals(this.postDesc, productDetails.postDesc) &&
        Objects.equals(this.preDescMobile, productDetails.preDescMobile) &&
        Objects.equals(this.postDescMobile, productDetails.postDescMobile) &&
        Objects.equals(this.listOfimageURLs, productDetails.listOfimageURLs) &&
        Objects.equals(this.listOfmediaURLs, productDetails.listOfmediaURLs) &&
        Objects.equals(this.listOfhelpURLs, productDetails.listOfhelpURLs) &&
        Objects.equals(this.specificationGroups, productDetails.specificationGroups) &&
        Objects.equals(this.inTheBox, productDetails.inTheBox) &&
        Objects.equals(this.contentVersion, productDetails.contentVersion) &&
        Objects.equals(this.productControl, productDetails.productControl) &&
        Objects.equals(this.productGroups, productDetails.productGroups) &&
        Objects.equals(this.misc, productDetails.misc) &&
        Objects.equals(this.productPriceOverride, productDetails.productPriceOverride) &&
        Objects.equals(this.promoteAs, productDetails.promoteAs) &&
        Objects.equals(this.leadPlanId, productDetails.leadPlanId) &&
        Objects.equals(this.recommendataions, productDetails.recommendataions) &&
        Objects.equals(this.fastMoving, productDetails.fastMoving) &&
        Objects.equals(this.stockThresholdLimit, productDetails.stockThresholdLimit) &&
        Objects.equals(this.listOfEligibleChannels, productDetails.listOfEligibleChannels) &&
        Objects.equals(this.paymentType, productDetails.paymentType) &&
        Objects.equals(this.battery, productDetails.battery) &&
        Objects.equals(this.merchandisingVersion, productDetails.merchandisingVersion) &&
        Objects.equals(this.listOfCompatibleBundles, productDetails.listOfCompatibleBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, name, productClass, isServicesProduct, duration, discount, warranty, condition, categories, productLines, priceDetail, productAllowance, boxPrice, productAvailability, productRelationshipList, isDeviceProduct, inclusiveEligibility, omniChannelDiscountEligible, version, seoCanonical, seoDescription, seoKeywords, seoIndex, seoRobots, productSubClass, equipment, eligibilitySubflow, allowanceDisplay, delivery, metadataVersion, displayName, preDesc, postDesc, preDescMobile, postDescMobile, listOfimageURLs, listOfmediaURLs, listOfhelpURLs, specificationGroups, inTheBox, contentVersion, productControl, productGroups, misc, productPriceOverride, promoteAs, leadPlanId, recommendataions, fastMoving, stockThresholdLimit, listOfEligibleChannels, paymentType, battery, merchandisingVersion, listOfCompatibleBundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    isServicesProduct: ").append(toIndentedString(isServicesProduct)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    productLines: ").append(toIndentedString(productLines)).append("\n");
    sb.append("    priceDetail: ").append(toIndentedString(priceDetail)).append("\n");
    sb.append("    productAllowance: ").append(toIndentedString(productAllowance)).append("\n");
    sb.append("    boxPrice: ").append(toIndentedString(boxPrice)).append("\n");
    sb.append("    productAvailability: ").append(toIndentedString(productAvailability)).append("\n");
    sb.append("    productRelationshipList: ").append(toIndentedString(productRelationshipList)).append("\n");
    sb.append("    isDeviceProduct: ").append(toIndentedString(isDeviceProduct)).append("\n");
    sb.append("    inclusiveEligibility: ").append(toIndentedString(inclusiveEligibility)).append("\n");
    sb.append("    omniChannelDiscountEligible: ").append(toIndentedString(omniChannelDiscountEligible)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    seoCanonical: ").append(toIndentedString(seoCanonical)).append("\n");
    sb.append("    seoDescription: ").append(toIndentedString(seoDescription)).append("\n");
    sb.append("    seoKeywords: ").append(toIndentedString(seoKeywords)).append("\n");
    sb.append("    seoIndex: ").append(toIndentedString(seoIndex)).append("\n");
    sb.append("    seoRobots: ").append(toIndentedString(seoRobots)).append("\n");
    sb.append("    productSubClass: ").append(toIndentedString(productSubClass)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    eligibilitySubflow: ").append(toIndentedString(eligibilitySubflow)).append("\n");
    sb.append("    allowanceDisplay: ").append(toIndentedString(allowanceDisplay)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    metadataVersion: ").append(toIndentedString(metadataVersion)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    preDesc: ").append(toIndentedString(preDesc)).append("\n");
    sb.append("    postDesc: ").append(toIndentedString(postDesc)).append("\n");
    sb.append("    preDescMobile: ").append(toIndentedString(preDescMobile)).append("\n");
    sb.append("    postDescMobile: ").append(toIndentedString(postDescMobile)).append("\n");
    sb.append("    listOfimageURLs: ").append(toIndentedString(listOfimageURLs)).append("\n");
    sb.append("    listOfmediaURLs: ").append(toIndentedString(listOfmediaURLs)).append("\n");
    sb.append("    listOfhelpURLs: ").append(toIndentedString(listOfhelpURLs)).append("\n");
    sb.append("    specificationGroups: ").append(toIndentedString(specificationGroups)).append("\n");
    sb.append("    inTheBox: ").append(toIndentedString(inTheBox)).append("\n");
    sb.append("    contentVersion: ").append(toIndentedString(contentVersion)).append("\n");
    sb.append("    productControl: ").append(toIndentedString(productControl)).append("\n");
    sb.append("    productGroups: ").append(toIndentedString(productGroups)).append("\n");
    sb.append("    misc: ").append(toIndentedString(misc)).append("\n");
    sb.append("    productPriceOverride: ").append(toIndentedString(productPriceOverride)).append("\n");
    sb.append("    promoteAs: ").append(toIndentedString(promoteAs)).append("\n");
    sb.append("    leadPlanId: ").append(toIndentedString(leadPlanId)).append("\n");
    sb.append("    recommendataions: ").append(toIndentedString(recommendataions)).append("\n");
    sb.append("    fastMoving: ").append(toIndentedString(fastMoving)).append("\n");
    sb.append("    stockThresholdLimit: ").append(toIndentedString(stockThresholdLimit)).append("\n");
    sb.append("    listOfEligibleChannels: ").append(toIndentedString(listOfEligibleChannels)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    battery: ").append(toIndentedString(battery)).append("\n");
    sb.append("    merchandisingVersion: ").append(toIndentedString(merchandisingVersion)).append("\n");
    sb.append("    listOfCompatibleBundles: ").append(toIndentedString(listOfCompatibleBundles)).append("\n");
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

