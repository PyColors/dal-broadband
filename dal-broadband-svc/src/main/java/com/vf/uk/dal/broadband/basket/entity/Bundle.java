package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Bundle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")

public class Bundle   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("allowances")
  @Valid
  private List<Allowance> allowances = null;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("bundleClass")
  private String bundleClass = null;

  @JsonProperty("bundleType")
  private String bundleType = null;

  @JsonProperty("bundledServiceProducts")
  @Valid
  private List<BundledServiceProduct> bundledServiceProducts = null;

  @JsonProperty("commitmentPeriod")
  private CommitmentPeriod commitmentPeriod = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayDescription")
  private String displayDescription = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("displayOrder")
  private Integer displayOrder = null;

  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  @JsonProperty("isVodafoneGlobalRoaming")
  private Boolean isVodafoneGlobalRoaming = null;

  @JsonProperty("merchandisingMedia")
  @Valid
  private List<MediaLinks> merchandisingMedia = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packageLineId")
  private String packageLineId = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("priceDetails")
  private BundlePrices priceDetails = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("showInSummary")
  private Boolean showInSummary = null;

  @JsonProperty("skuId")
  private String skuId = null;

  public Bundle action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Bundle allowances(List<Allowance> allowances) {
    this.allowances = allowances;
    return this;
  }

  public Bundle addAllowancesItem(Allowance allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<Allowance>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

  /**
   * Get allowances
   * @return allowances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Allowance> getAllowances() {
    return allowances;
  }

  public void setAllowances(List<Allowance> allowances) {
    this.allowances = allowances;
  }

  public Bundle attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Bundle addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<Attribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public Bundle bundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
    return this;
  }

  /**
   * Get bundleClass
   * @return bundleClass
  **/
  @ApiModelProperty(value = "")


  public String getBundleClass() {
    return bundleClass;
  }

  public void setBundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
  }

  public Bundle bundleType(String bundleType) {
    this.bundleType = bundleType;
    return this;
  }

  /**
   * Get bundleType
   * @return bundleType
  **/
  @ApiModelProperty(value = "")


  public String getBundleType() {
    return bundleType;
  }

  public void setBundleType(String bundleType) {
    this.bundleType = bundleType;
  }

  public Bundle bundledServiceProducts(List<BundledServiceProduct> bundledServiceProducts) {
    this.bundledServiceProducts = bundledServiceProducts;
    return this;
  }

  public Bundle addBundledServiceProductsItem(BundledServiceProduct bundledServiceProductsItem) {
    if (this.bundledServiceProducts == null) {
      this.bundledServiceProducts = new ArrayList<BundledServiceProduct>();
    }
    this.bundledServiceProducts.add(bundledServiceProductsItem);
    return this;
  }

  /**
   * Get bundledServiceProducts
   * @return bundledServiceProducts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BundledServiceProduct> getBundledServiceProducts() {
    return bundledServiceProducts;
  }

  public void setBundledServiceProducts(List<BundledServiceProduct> bundledServiceProducts) {
    this.bundledServiceProducts = bundledServiceProducts;
  }

  public Bundle commitmentPeriod(CommitmentPeriod commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
    return this;
  }

  /**
   * Get commitmentPeriod
   * @return commitmentPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CommitmentPeriod getCommitmentPeriod() {
    return commitmentPeriod;
  }

  public void setCommitmentPeriod(CommitmentPeriod commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
  }

  public Bundle description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bundle displayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
    return this;
  }

  /**
   * Get displayDescription
   * @return displayDescription
  **/
  @ApiModelProperty(value = "")


  public String getDisplayDescription() {
    return displayDescription;
  }

  public void setDisplayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
  }

  public Bundle displayName(String displayName) {
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

  public Bundle displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * Get displayOrder
   * @return displayOrder
  **/
  @ApiModelProperty(value = "")


  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public Bundle isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

  /**
   * Get isChanged
   * @return isChanged
  **/

  public Boolean isIsChanged() {
    return isChanged;
  }

  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  public Bundle isVodafoneGlobalRoaming(Boolean isVodafoneGlobalRoaming) {
    this.isVodafoneGlobalRoaming = isVodafoneGlobalRoaming;
    return this;
  }

  /**
   * Get isVodafoneGlobalRoaming
   * @return isVodafoneGlobalRoaming
  **/

  public Boolean isIsVodafoneGlobalRoaming() {
    return isVodafoneGlobalRoaming;
  }

  public void setIsVodafoneGlobalRoaming(Boolean isVodafoneGlobalRoaming) {
    this.isVodafoneGlobalRoaming = isVodafoneGlobalRoaming;
  }

  public Bundle merchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  public Bundle addMerchandisingMediaItem(MediaLinks merchandisingMediaItem) {
    if (this.merchandisingMedia == null) {
      this.merchandisingMedia = new ArrayList<MediaLinks>();
    }
    this.merchandisingMedia.add(merchandisingMediaItem);
    return this;
  }

  /**
   * Get merchandisingMedia
   * @return merchandisingMedia
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MediaLinks> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLinks> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  public Bundle name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bundle packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

  /**
   * Get packageLineId
   * @return packageLineId
  **/
  @ApiModelProperty(value = "")


  public String getPackageLineId() {
    return packageLineId;
  }

  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

  public Bundle paymentType(String paymentType) {
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

  public Bundle priceDetails(BundlePrices priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BundlePrices getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(BundlePrices priceDetails) {
    this.priceDetails = priceDetails;
  }

  public Bundle productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Get productClass
   * @return productClass
  **/
  @ApiModelProperty(value = "")


  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public Bundle serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public Bundle showInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
    return this;
  }

  /**
   * Get showInSummary
   * @return showInSummary
  **/

  public Boolean isShowInSummary() {
    return showInSummary;
  }

  public void setShowInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
  }

  public Bundle skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId
   * @return skuId
  **/
  @ApiModelProperty(value = "")


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(action, allowances, attributes, bundleClass, bundleType, bundledServiceProducts, commitmentPeriod, description, displayDescription, displayName, displayOrder, isChanged, isVodafoneGlobalRoaming, merchandisingMedia, name, packageLineId, paymentType, priceDetails, productClass, serviceId, showInSummary, skuId);
  }

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
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

