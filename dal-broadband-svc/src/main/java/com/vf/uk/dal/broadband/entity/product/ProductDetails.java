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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-27T09:23:23.120Z")

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
  private Boolean isServicesProduct = null;

  @JsonProperty("duration")
  private Duration duration = null;

  @JsonProperty("discount")
  private Discount discount = null;

  @JsonProperty("warranty")
  private String warranty = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  @JsonProperty("priceDetail")
  private PriceDetail priceDetail = null;

  @JsonProperty("productAllowance")
  @Valid
  private List<ProductAllowance> productAllowance = null;

  @JsonProperty("boxPrice")
  private BoxPrice boxPrice = null;

  @JsonProperty("productAvailability")
  private ProductAvailability productAvailability = null;

  @JsonProperty("isDeviceProduct")
  private Boolean isDeviceProduct = null;

  @JsonProperty("inclusiveEligibility")
  private String inclusiveEligibility = null;

  @JsonProperty("omniChannelDiscountEligible")
  private Boolean omniChannelDiscountEligible = null;

  @JsonProperty("productSubClass")
  private String productSubClass = null;

  @JsonProperty("equipment")
  private Equipment equipment = null;

  @JsonProperty("eligibilitySubflow")
  private String eligibilitySubflow = null;

  @JsonProperty("delivery")
  private Delivery delivery = null;

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
  @Valid
  private List<ListOfImageURL> listOfimageURLs = null;

  @JsonProperty("listOfmediaURLs")
  @Valid
  private List<ListOfMediaURL> listOfmediaURLs = null;

  @JsonProperty("specificationGroups")
  @Valid
  private List<SpecificationGroups> specificationGroups = null;

  @JsonProperty("inTheBox")
  private String inTheBox = null;

  @JsonProperty("productControl")
  private ProductControl productControl = null;

  @JsonProperty("productGroups")
  private ProductGroups productGroups = null;

  @JsonProperty("misc")
  private Misc misc = null;

  @JsonProperty("promoteAs")
  private PromoteAs promoteAs = null;

  @JsonProperty("leadPlanId")
  private String leadPlanId = null;

  @JsonProperty("recommendataions")
  @Valid
  private List<Recommendations> recommendataions = null;

  @JsonProperty("fastMoving")
  private Boolean fastMoving = null;

  @JsonProperty("stockThresholdLimit")
  private String stockThresholdLimit = null;

  @JsonProperty("listOfEligibleChannels")
  @Valid
  private List<ListOfEligibleChannel> listOfEligibleChannels = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("battery")
  private Boolean battery = null;

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

  public ProductDetails isServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * Boolean attribute service product
   * @return isServicesProduct
  **/
  @ApiModelProperty(value = "Boolean attribute service product")


  public Boolean isIsServicesProduct() {
    return isServicesProduct;
  }

  public void setIsServicesProduct(Boolean isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  public ProductDetails duration(Duration duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public ProductDetails discount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
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

  public ProductDetails categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public ProductDetails addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
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

  public ProductDetails productLines(List<String> productLines) {
    this.productLines = productLines;
    return this;
  }

  public ProductDetails addProductLinesItem(String productLinesItem) {
    if (this.productLines == null) {
      this.productLines = new ArrayList<String>();
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

  public ProductDetails priceDetail(PriceDetail priceDetail) {
    this.priceDetail = priceDetail;
    return this;
  }

  /**
   * Get priceDetail
   * @return priceDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PriceDetail getPriceDetail() {
    return priceDetail;
  }

  public void setPriceDetail(PriceDetail priceDetail) {
    this.priceDetail = priceDetail;
  }

  public ProductDetails productAllowance(List<ProductAllowance> productAllowance) {
    this.productAllowance = productAllowance;
    return this;
  }

  public ProductDetails addProductAllowanceItem(ProductAllowance productAllowanceItem) {
    if (this.productAllowance == null) {
      this.productAllowance = new ArrayList<ProductAllowance>();
    }
    this.productAllowance.add(productAllowanceItem);
    return this;
  }

  /**
   * Get productAllowance
   * @return productAllowance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductAllowance> getProductAllowance() {
    return productAllowance;
  }

  public void setProductAllowance(List<ProductAllowance> productAllowance) {
    this.productAllowance = productAllowance;
  }

  public ProductDetails boxPrice(BoxPrice boxPrice) {
    this.boxPrice = boxPrice;
    return this;
  }

  /**
   * Get boxPrice
   * @return boxPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BoxPrice getBoxPrice() {
    return boxPrice;
  }

  public void setBoxPrice(BoxPrice boxPrice) {
    this.boxPrice = boxPrice;
  }

  public ProductDetails productAvailability(ProductAvailability productAvailability) {
    this.productAvailability = productAvailability;
    return this;
  }

  /**
   * Get productAvailability
   * @return productAvailability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductAvailability getProductAvailability() {
    return productAvailability;
  }

  public void setProductAvailability(ProductAvailability productAvailability) {
    this.productAvailability = productAvailability;
  }

  public ProductDetails isDeviceProduct(Boolean isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Boolean attribute to identify all device products
   * @return isDeviceProduct
  **/
  @ApiModelProperty(value = "Boolean attribute to identify all device products")


  public Boolean isIsDeviceProduct() {
    return isDeviceProduct;
  }

  public void setIsDeviceProduct(Boolean isDeviceProduct) {
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

  public ProductDetails omniChannelDiscountEligible(Boolean omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
    return this;
  }

  /**
   * boolean value for omni channel discount eligibility
   * @return omniChannelDiscountEligible
  **/
  @ApiModelProperty(value = "boolean value for omni channel discount eligibility")


  public Boolean isOmniChannelDiscountEligible() {
    return omniChannelDiscountEligible;
  }

  public void setOmniChannelDiscountEligible(Boolean omniChannelDiscountEligible) {
    this.omniChannelDiscountEligible = omniChannelDiscountEligible;
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

  public ProductDetails equipment(Equipment equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * Get equipment
   * @return equipment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Equipment getEquipment() {
    return equipment;
  }

  public void setEquipment(Equipment equipment) {
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

  public ProductDetails delivery(Delivery delivery) {
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

  public ProductDetails listOfimageURLs(List<ListOfImageURL> listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
    return this;
  }

  public ProductDetails addListOfimageURLsItem(ListOfImageURL listOfimageURLsItem) {
    if (this.listOfimageURLs == null) {
      this.listOfimageURLs = new ArrayList<ListOfImageURL>();
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

  public List<ListOfImageURL> getListOfimageURLs() {
    return listOfimageURLs;
  }

  public void setListOfimageURLs(List<ListOfImageURL> listOfimageURLs) {
    this.listOfimageURLs = listOfimageURLs;
  }

  public ProductDetails listOfmediaURLs(List<ListOfMediaURL> listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
    return this;
  }

  public ProductDetails addListOfmediaURLsItem(ListOfMediaURL listOfmediaURLsItem) {
    if (this.listOfmediaURLs == null) {
      this.listOfmediaURLs = new ArrayList<ListOfMediaURL>();
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

  public List<ListOfMediaURL> getListOfmediaURLs() {
    return listOfmediaURLs;
  }

  public void setListOfmediaURLs(List<ListOfMediaURL> listOfmediaURLs) {
    this.listOfmediaURLs = listOfmediaURLs;
  }

  public ProductDetails specificationGroups(List<SpecificationGroups> specificationGroups) {
    this.specificationGroups = specificationGroups;
    return this;
  }

  public ProductDetails addSpecificationGroupsItem(SpecificationGroups specificationGroupsItem) {
    if (this.specificationGroups == null) {
      this.specificationGroups = new ArrayList<SpecificationGroups>();
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

  public List<SpecificationGroups> getSpecificationGroups() {
    return specificationGroups;
  }

  public void setSpecificationGroups(List<SpecificationGroups> specificationGroups) {
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

  public ProductDetails productControl(ProductControl productControl) {
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

  public ProductDetails productGroups(ProductGroups productGroups) {
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

  public ProductDetails misc(Misc misc) {
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

  public ProductDetails promoteAs(PromoteAs promoteAs) {
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

  public ProductDetails recommendataions(List<Recommendations> recommendataions) {
    this.recommendataions = recommendataions;
    return this;
  }

  public ProductDetails addRecommendataionsItem(Recommendations recommendataionsItem) {
    if (this.recommendataions == null) {
      this.recommendataions = new ArrayList<Recommendations>();
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

  public ProductDetails fastMoving(Boolean fastMoving) {
    this.fastMoving = fastMoving;
    return this;
  }

  /**
   * Get fastMoving
   * @return fastMoving
  **/
  @ApiModelProperty(value = "")


  public Boolean isFastMoving() {
    return fastMoving;
  }

  public void setFastMoving(Boolean fastMoving) {
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

  public ProductDetails listOfEligibleChannels(List<ListOfEligibleChannel> listOfEligibleChannels) {
    this.listOfEligibleChannels = listOfEligibleChannels;
    return this;
  }

  public ProductDetails addListOfEligibleChannelsItem(ListOfEligibleChannel listOfEligibleChannelsItem) {
    if (this.listOfEligibleChannels == null) {
      this.listOfEligibleChannels = new ArrayList<ListOfEligibleChannel>();
    }
    this.listOfEligibleChannels.add(listOfEligibleChannelsItem);
    return this;
  }

  /**
   * Get listOfEligibleChannels
   * @return listOfEligibleChannels
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ListOfEligibleChannel> getListOfEligibleChannels() {
    return listOfEligibleChannels;
  }

  public void setListOfEligibleChannels(List<ListOfEligibleChannel> listOfEligibleChannels) {
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

  public ProductDetails battery(Boolean battery) {
    this.battery = battery;
    return this;
  }

  /**
   * Get battery
   * @return battery
  **/
  @ApiModelProperty(value = "")


  public Boolean isBattery() {
    return battery;
  }

  public void setBattery(Boolean battery) {
    this.battery = battery;
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
        Objects.equals(this.isDeviceProduct, productDetails.isDeviceProduct) &&
        Objects.equals(this.inclusiveEligibility, productDetails.inclusiveEligibility) &&
        Objects.equals(this.omniChannelDiscountEligible, productDetails.omniChannelDiscountEligible) &&
        Objects.equals(this.productSubClass, productDetails.productSubClass) &&
        Objects.equals(this.equipment, productDetails.equipment) &&
        Objects.equals(this.eligibilitySubflow, productDetails.eligibilitySubflow) &&
        Objects.equals(this.delivery, productDetails.delivery) &&
        Objects.equals(this.displayName, productDetails.displayName) &&
        Objects.equals(this.preDesc, productDetails.preDesc) &&
        Objects.equals(this.postDesc, productDetails.postDesc) &&
        Objects.equals(this.preDescMobile, productDetails.preDescMobile) &&
        Objects.equals(this.postDescMobile, productDetails.postDescMobile) &&
        Objects.equals(this.listOfimageURLs, productDetails.listOfimageURLs) &&
        Objects.equals(this.listOfmediaURLs, productDetails.listOfmediaURLs) &&
        Objects.equals(this.specificationGroups, productDetails.specificationGroups) &&
        Objects.equals(this.inTheBox, productDetails.inTheBox) &&
        Objects.equals(this.productControl, productDetails.productControl) &&
        Objects.equals(this.productGroups, productDetails.productGroups) &&
        Objects.equals(this.misc, productDetails.misc) &&
        Objects.equals(this.promoteAs, productDetails.promoteAs) &&
        Objects.equals(this.leadPlanId, productDetails.leadPlanId) &&
        Objects.equals(this.recommendataions, productDetails.recommendataions) &&
        Objects.equals(this.fastMoving, productDetails.fastMoving) &&
        Objects.equals(this.stockThresholdLimit, productDetails.stockThresholdLimit) &&
        Objects.equals(this.listOfEligibleChannels, productDetails.listOfEligibleChannels) &&
        Objects.equals(this.paymentType, productDetails.paymentType) &&
        Objects.equals(this.battery, productDetails.battery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, name, productClass, isServicesProduct, duration, discount, warranty, condition, categories, productLines, priceDetail, productAllowance, boxPrice, productAvailability, isDeviceProduct, inclusiveEligibility, omniChannelDiscountEligible, productSubClass, equipment, eligibilitySubflow, delivery, displayName, preDesc, postDesc, preDescMobile, postDescMobile, listOfimageURLs, listOfmediaURLs, specificationGroups, inTheBox, productControl, productGroups, misc, promoteAs, leadPlanId, recommendataions, fastMoving, stockThresholdLimit, listOfEligibleChannels, paymentType, battery);
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
    sb.append("    isDeviceProduct: ").append(toIndentedString(isDeviceProduct)).append("\n");
    sb.append("    inclusiveEligibility: ").append(toIndentedString(inclusiveEligibility)).append("\n");
    sb.append("    omniChannelDiscountEligible: ").append(toIndentedString(omniChannelDiscountEligible)).append("\n");
    sb.append("    productSubClass: ").append(toIndentedString(productSubClass)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    eligibilitySubflow: ").append(toIndentedString(eligibilitySubflow)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    preDesc: ").append(toIndentedString(preDesc)).append("\n");
    sb.append("    postDesc: ").append(toIndentedString(postDesc)).append("\n");
    sb.append("    preDescMobile: ").append(toIndentedString(preDescMobile)).append("\n");
    sb.append("    postDescMobile: ").append(toIndentedString(postDescMobile)).append("\n");
    sb.append("    listOfimageURLs: ").append(toIndentedString(listOfimageURLs)).append("\n");
    sb.append("    listOfmediaURLs: ").append(toIndentedString(listOfmediaURLs)).append("\n");
    sb.append("    specificationGroups: ").append(toIndentedString(specificationGroups)).append("\n");
    sb.append("    inTheBox: ").append(toIndentedString(inTheBox)).append("\n");
    sb.append("    productControl: ").append(toIndentedString(productControl)).append("\n");
    sb.append("    productGroups: ").append(toIndentedString(productGroups)).append("\n");
    sb.append("    misc: ").append(toIndentedString(misc)).append("\n");
    sb.append("    promoteAs: ").append(toIndentedString(promoteAs)).append("\n");
    sb.append("    leadPlanId: ").append(toIndentedString(leadPlanId)).append("\n");
    sb.append("    recommendataions: ").append(toIndentedString(recommendataions)).append("\n");
    sb.append("    fastMoving: ").append(toIndentedString(fastMoving)).append("\n");
    sb.append("    stockThresholdLimit: ").append(toIndentedString(stockThresholdLimit)).append("\n");
    sb.append("    listOfEligibleChannels: ").append(toIndentedString(listOfEligibleChannels)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    battery: ").append(toIndentedString(battery)).append("\n");
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

