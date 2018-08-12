package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Bundle.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Bundle   {
  
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

  /**
   * Action.
   *
   * @param action the action
   * @return the bundle
   */
  public Bundle action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action.
   *
   * @return action
   */
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  /**
   * Sets the action.
   *
   * @param action the new action
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Allowances.
   *
   * @param allowances the allowances
   * @return the bundle
   */
  public Bundle allowances(List<Allowance> allowances) {
    this.allowances = allowances;
    return this;
  }

  /**
   * Adds the allowances item.
   *
   * @param allowancesItem the allowances item
   * @return the bundle
   */
  public Bundle addAllowancesItem(Allowance allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

  /**
   * Get allowances.
   *
   * @return allowances
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Allowance> getAllowances() {
    return allowances;
  }

  /**
   * Sets the allowances.
   *
   * @param allowances the new allowances
   */
  public void setAllowances(List<Allowance> allowances) {
    this.allowances = allowances;
  }

  /**
   * Attributes.
   *
   * @param attributes the attributes
   * @return the bundle
   */
  public Bundle attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Adds the attributes item.
   *
   * @param attributesItem the attributes item
   * @return the bundle
   */
  public Bundle addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes.
   *
   * @return attributes
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<Attribute> getAttributes() {
    return attributes;
  }

  /**
   * Sets the attributes.
   *
   * @param attributes the new attributes
   */
  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  /**
   * Bundle class.
   *
   * @param bundleClass the bundle class
   * @return the bundle
   */
  public Bundle bundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
    return this;
  }

  /**
   * Get bundleClass.
   *
   * @return bundleClass
   */
  @ApiModelProperty(value = "")


  public String getBundleClass() {
    return bundleClass;
  }

  /**
   * Sets the bundle class.
   *
   * @param bundleClass the new bundle class
   */
  public void setBundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
  }

  /**
   * Bundle type.
   *
   * @param bundleType the bundle type
   * @return the bundle
   */
  public Bundle bundleType(String bundleType) {
    this.bundleType = bundleType;
    return this;
  }

  /**
   * Get bundleType.
   *
   * @return bundleType
   */
  @ApiModelProperty(value = "")


  public String getBundleType() {
    return bundleType;
  }

  /**
   * Sets the bundle type.
   *
   * @param bundleType the new bundle type
   */
  public void setBundleType(String bundleType) {
    this.bundleType = bundleType;
  }

  /**
   * Bundled service products.
   *
   * @param bundledServiceProducts the bundled service products
   * @return the bundle
   */
  public Bundle bundledServiceProducts(List<BundledServiceProduct> bundledServiceProducts) {
    this.bundledServiceProducts = bundledServiceProducts;
    return this;
  }

  /**
   * Adds the bundled service products item.
   *
   * @param bundledServiceProductsItem the bundled service products item
   * @return the bundle
   */
  public Bundle addBundledServiceProductsItem(BundledServiceProduct bundledServiceProductsItem) {
    if (this.bundledServiceProducts == null) {
      this.bundledServiceProducts = new ArrayList<>();
    }
    this.bundledServiceProducts.add(bundledServiceProductsItem);
    return this;
  }

  /**
   * Get bundledServiceProducts.
   *
   * @return bundledServiceProducts
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<BundledServiceProduct> getBundledServiceProducts() {
    return bundledServiceProducts;
  }

  /**
   * Sets the bundled service products.
   *
   * @param bundledServiceProducts the new bundled service products
   */
  public void setBundledServiceProducts(List<BundledServiceProduct> bundledServiceProducts) {
    this.bundledServiceProducts = bundledServiceProducts;
  }

  /**
   * Commitment period.
   *
   * @param commitmentPeriod the commitment period
   * @return the bundle
   */
  public Bundle commitmentPeriod(CommitmentPeriod commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
    return this;
  }

  /**
   * Get commitmentPeriod.
   *
   * @return commitmentPeriod
   */
  @ApiModelProperty(value = "")

  @Valid

  public CommitmentPeriod getCommitmentPeriod() {
    return commitmentPeriod;
  }

  /**
   * Sets the commitment period.
   *
   * @param commitmentPeriod the new commitment period
   */
  public void setCommitmentPeriod(CommitmentPeriod commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
  }

  /**
   * Description.
   *
   * @param description the description
   * @return the bundle
   */
  public Bundle description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description.
   *
   * @return description
   */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Display description.
   *
   * @param displayDescription the display description
   * @return the bundle
   */
  public Bundle displayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
    return this;
  }

  /**
   * Get displayDescription.
   *
   * @return displayDescription
   */
  @ApiModelProperty(value = "")


  public String getDisplayDescription() {
    return displayDescription;
  }

  /**
   * Sets the display description.
   *
   * @param displayDescription the new display description
   */
  public void setDisplayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
  }

  /**
   * Display name.
   *
   * @param displayName the display name
   * @return the bundle
   */
  public Bundle displayName(String displayName) {
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
   * Display order.
   *
   * @param displayOrder the display order
   * @return the bundle
   */
  public Bundle displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * Get displayOrder.
   *
   * @return displayOrder
   */
  @ApiModelProperty(value = "")


  public Integer getDisplayOrder() {
    return displayOrder;
  }

  /**
   * Sets the display order.
   *
   * @param displayOrder the new display order
   */
  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * Checks if is changed.
   *
   * @param isChanged the is changed
   * @return the bundle
   */
  public Bundle isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged.
   *
   * @return isChanged
   */

  public Boolean isIsChanged() {
    return isChanged;
  }

  /**
   * Sets the checks if is changed.
   *
   * @param isChanged the new checks if is changed
   */
  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  /**
   * Checks if is vodafone global roaming.
   *
   * @param isVodafoneGlobalRoaming the is vodafone global roaming
   * @return the bundle
   */
  public Bundle isVodafoneGlobalRoaming(Boolean isVodafoneGlobalRoaming) {
    this.isVodafoneGlobalRoaming = isVodafoneGlobalRoaming;
    return this;
  }

  /**
   * Get isVodafoneGlobalRoaming.
   *
   * @return isVodafoneGlobalRoaming
   */

  public Boolean isIsVodafoneGlobalRoaming() {
    return isVodafoneGlobalRoaming;
  }

  /**
   * Sets the checks if is vodafone global roaming.
   *
   * @param isVodafoneGlobalRoaming the new checks if is vodafone global roaming
   */
  public void setIsVodafoneGlobalRoaming(Boolean isVodafoneGlobalRoaming) {
    this.isVodafoneGlobalRoaming = isVodafoneGlobalRoaming;
  }

  /**
   * Merchandising media.
   *
   * @param merchandisingMedia the merchandising media
   * @return the bundle
   */
  public Bundle merchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  /**
   * Adds the merchandising media item.
   *
   * @param merchandisingMediaItem the merchandising media item
   * @return the bundle
   */
  public Bundle addMerchandisingMediaItem(MediaLinks merchandisingMediaItem) {
    if (this.merchandisingMedia == null) {
      this.merchandisingMedia = new ArrayList<>();
    }
    this.merchandisingMedia.add(merchandisingMediaItem);
    return this;
  }

  /**
   * Get merchandisingMedia.
   *
   * @return merchandisingMedia
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<MediaLinks> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  /**
   * Sets the merchandising media.
   *
   * @param merchandisingMedia the new merchandising media
   */
  public void setMerchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  /**
   * Name.
   *
   * @param name the name
   * @return the bundle
   */
  public Bundle name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   *
   * @return name
   */
  @ApiModelProperty(value = "")


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
   * Package line id.
   *
   * @param packageLineId the package line id
   * @return the bundle
   */
  public Bundle packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

  /**
   * Get packageLineId.
   *
   * @return packageLineId
   */
  @ApiModelProperty(value = "")


  public String getPackageLineId() {
    return packageLineId;
  }

  /**
   * Sets the package line id.
   *
   * @param packageLineId the new package line id
   */
  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

  /**
   * Payment type.
   *
   * @param paymentType the payment type
   * @return the bundle
   */
  public Bundle paymentType(String paymentType) {
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
   * Price details.
   *
   * @param priceDetails the price details
   * @return the bundle
   */
  public Bundle priceDetails(BundlePrices priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails.
   *
   * @return priceDetails
   */
  @ApiModelProperty(value = "")

  @Valid

  /**
   * 
   * @return
   */
  public BundlePrices getPriceDetails() {
    return priceDetails;
  }

  /**
   * Sets the price details.
   *
   * @param priceDetails the new price details
   */
  public void setPriceDetails(BundlePrices priceDetails) {
    this.priceDetails = priceDetails;
  }

  /**
   * Product class.
   *
   * @param productClass the product class
   * @return the bundle
   */
  public Bundle productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Get productClass.
   *
   * @return productClass
   */
  @ApiModelProperty(value = "")


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
   * Service id.
   *
   * @param serviceId the service id
   * @return the bundle
   */
  public Bundle serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId.
   *
   * @return serviceId
   */
  @ApiModelProperty(value = "")


  public String getServiceId() {
    return serviceId;
  }

  /**
   * Sets the service id.
   *
   * @param serviceId the new service id
   */
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Show in summary.
   *
   * @param showInSummary the show in summary
   * @return the bundle
   */
  public Bundle showInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
    return this;
  }

  /**
   * Get showInSummary.
   *
   * @return showInSummary
   */

  public Boolean isShowInSummary() {
    return showInSummary;
  }

  /**
   * Sets the show in summary.
   *
   * @param showInSummary the new show in summary
   */
  public void setShowInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
  }

  /**
   * Sku id.
   *
   * @param skuId the sku id
   * @return the bundle
   */
  public Bundle skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId.
   *
   * @return skuId
   */
  @ApiModelProperty(value = "")


  public String getSkuId() {
    return skuId;
  }

  /**
   * Sets the sku id.
   *
   * @param skuId the new sku id
   */
  public void setSkuId(String skuId) {
    this.skuId = skuId;
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
    Bundle bundle = (Bundle) o;
    return Objects.equals(this.action, bundle.action) &&
        Objects.equals(this.allowances, bundle.allowances) &&
        Objects.equals(this.attributes, bundle.attributes) &&
        Objects.equals(this.bundleClass, bundle.bundleClass) &&
        Objects.equals(this.bundleType, bundle.bundleType) &&
        Objects.equals(this.bundledServiceProducts, bundle.bundledServiceProducts) &&
        Objects.equals(this.commitmentPeriod, bundle.commitmentPeriod) &&
        Objects.equals(this.description, bundle.description) &&
        Objects.equals(this.displayDescription, bundle.displayDescription) &&
        Objects.equals(this.displayName, bundle.displayName) &&
        Objects.equals(this.displayOrder, bundle.displayOrder) &&
        Objects.equals(this.isChanged, bundle.isChanged) &&
        Objects.equals(this.isVodafoneGlobalRoaming, bundle.isVodafoneGlobalRoaming) &&
        Objects.equals(this.merchandisingMedia, bundle.merchandisingMedia) &&
        Objects.equals(this.name, bundle.name) &&
        Objects.equals(this.packageLineId, bundle.packageLineId) &&
        Objects.equals(this.paymentType, bundle.paymentType) &&
        Objects.equals(this.priceDetails, bundle.priceDetails) &&
        Objects.equals(this.productClass, bundle.productClass) &&
        Objects.equals(this.serviceId, bundle.serviceId) &&
        Objects.equals(this.showInSummary, bundle.showInSummary) &&
        Objects.equals(this.skuId, bundle.skuId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, allowances, attributes, bundleClass, bundleType, bundledServiceProducts, commitmentPeriod, description, displayDescription, displayName, displayOrder, isChanged, isVodafoneGlobalRoaming, merchandisingMedia, name, packageLineId, paymentType, priceDetails, productClass, serviceId, showInSummary, skuId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bundle {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    allowances: ").append(toIndentedString(allowances)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    bundleClass: ").append(toIndentedString(bundleClass)).append("\n");
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    bundledServiceProducts: ").append(toIndentedString(bundledServiceProducts)).append("\n");
    sb.append("    commitmentPeriod: ").append(toIndentedString(commitmentPeriod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    isVodafoneGlobalRoaming: ").append(toIndentedString(isVodafoneGlobalRoaming)).append("\n");
    sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageLineId: ").append(toIndentedString(packageLineId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    showInSummary: ").append(toIndentedString(showInSummary)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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

