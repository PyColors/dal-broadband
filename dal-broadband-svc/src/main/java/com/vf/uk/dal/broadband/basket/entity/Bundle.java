package com.vf.uk.dal.broadband.basket.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * Bundle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-30T05:15:37.757Z")

public class Bundle   {
  private String packageLineId = null;

  private String action = null;

  private String skuId = null;

  private String name = null;

  private String description = null;

  private String displayName = null;

  private String displayDescription = null;

  private String bundleClass = null;

  private String productClass = null;

  private String serviceId = null;

  private String paymentType = null;

  private String bundleType = null;

  private CommitmentPeriod commitmentPeriod = null;

  private Integer displayOrder = null;

  private Boolean showInSummary = null;

  private List<Allowance> allowances = null;

  private List<MediaLink> merchandisingMedia = null;

  private List<Attribute> attributes = null;

  private BundlePrice priceDetails = null;

  private boolean isChanged;

  private Boolean isVodafoneGlobalRoaming = null;

  private List<BundledServiceProduct> bundledServiceProducts = null;
  
  @JsonIgnore
	private BigDecimal bundlePrice = null;
	
	public BigDecimal getBundlePrice() {
	return bundlePrice;
}

public void setBundlePrice(BigDecimal bundlePrice) {
	this.bundlePrice = bundlePrice;
}

public String getCoherenceSavedPrice() {
	return coherenceSavedPrice;
}

public void setCoherenceSavedPrice(String coherenceSavedPrice) {
	this.coherenceSavedPrice = coherenceSavedPrice;
}

	@JsonIgnore
	private String coherenceSavedPrice = null;

  public Bundle packageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
    return this;
  }

   /**
   * unique id for this line item of the package
   * @return packageLineId
  **/


  public String getPackageLineId() {
    return packageLineId;
  }

  public void setPackageLineId(String packageLineId) {
    this.packageLineId = packageLineId;
  }

  public Bundle action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action to indicate the operation requested by the use on this particular bundle. Expected values are ADD/REMOVE/MODIFY
   * @return action
  **/


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Bundle skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

   /**
   * Bundle id from the product catalogue
   * @return skuId
  **/


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public Bundle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the bundle as provided in the product catalogue
   * @return name
  **/


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bundle description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the bundle as provided in the product catalogue 
   * @return description
  **/


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bundle displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the bundle as provided in the merchandising data
   * @return displayName
  **/


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Bundle displayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
    return this;
  }

   /**
   * Description of the bundle as provided in the merchandising data
   * @return displayDescription
  **/


  public String getDisplayDescription() {
    return displayDescription;
  }

  public void setDisplayDescription(String displayDescription) {
    this.displayDescription = displayDescription;
  }

  public Bundle bundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
    return this;
  }

   /**
   * Catalogue product class identifies products - SIMO, HANDSET etc.
   * @return bundleClass
  **/


  public String getBundleClass() {
    return bundleClass;
  }

  public void setBundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
  }

  public Bundle productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

   /**
   * Catalogue product class identifies products
   * @return productClass
  **/


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
   * Service ID  for the Bundle
   * @return serviceId
  **/


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public Bundle paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type of the bundle. For example, \"postpaid\", \"prepaid\" etc.
   * @return paymentType
  **/


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Bundle bundleType(String bundleType) {
    this.bundleType = bundleType;
    return this;
  }

   /**
   * Type of the bundle. For example, Standard, Red, RedPlus etc.
   * @return bundleType
  **/


  public String getBundleType() {
    return bundleType;
  }

  public void setBundleType(String bundleType) {
    this.bundleType = bundleType;
  }

  public Bundle commitmentPeriod(CommitmentPeriod commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
    return this;
  }

   /**
   * Get commitmentPeriod
   * @return commitmentPeriod
  **/


  public CommitmentPeriod getCommitmentPeriod() {
    return commitmentPeriod;
  }

  public void setCommitmentPeriod(CommitmentPeriod commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
  }

  public Bundle displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Will be the \"order\" priority of the product from the catalogue
   * @return displayOrder
  **/


  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public Bundle showInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
    return this;
  }

   /**
   * Flag to indicate whether the product should be shown in basket summary
   * @return showInSummary
  **/


  public Boolean getShowInSummary() {
    return showInSummary;
  }

  public void setShowInSummary(Boolean showInSummary) {
    this.showInSummary = showInSummary;
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


  public List<Allowance> getAllowances() {
    return allowances;
  }

  public void setAllowances(List<Allowance> allowances) {
    this.allowances = allowances;
  }

  public Bundle merchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  public Bundle addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
    if (this.merchandisingMedia == null) {
      this.merchandisingMedia = new ArrayList<MediaLink>();
    }
    this.merchandisingMedia.add(merchandisingMediaItem);
    return this;
  }

   /**
   * Get merchandisingMedia
   * @return merchandisingMedia
  **/


  public List<MediaLink> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
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


  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public Bundle priceDetails(BundlePrice priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/


  public BundlePrice getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(BundlePrice priceDetails) {
    this.priceDetails = priceDetails;
  }

  public Bundle isChanged(Boolean isChanged) {
    this.isChanged = isChanged;
    return this;
  }

   /**
   * value true/false. This will identify if there are any changes to the basket (at basket level and package level)
   * @return isChanged
  **/


  public Boolean getIsChanged() {
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
   * value true/false. This will identify if the Bundle has Global Roaming
   * @return isVodafoneGlobalRoaming
  **/


  public Boolean getIsVodafoneGlobalRoaming() {
    return isVodafoneGlobalRoaming;
  }

  public void setIsVodafoneGlobalRoaming(Boolean isVodafoneGlobalRoaming) {
    this.isVodafoneGlobalRoaming = isVodafoneGlobalRoaming;
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
   * Bundled Service Product Details for FLBB
   * @return bundledServiceProducts
  **/


  public List<BundledServiceProduct> getBundledServiceProducts() {
    return bundledServiceProducts;
  }

  public void setBundledServiceProducts(List<BundledServiceProduct> bundledServiceProducts) {
    this.bundledServiceProducts = bundledServiceProducts;
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
    return Objects.equals(this.packageLineId, bundle.packageLineId) &&
        Objects.equals(this.action, bundle.action) &&
        Objects.equals(this.skuId, bundle.skuId) &&
        Objects.equals(this.name, bundle.name) &&
        Objects.equals(this.description, bundle.description) &&
        Objects.equals(this.displayName, bundle.displayName) &&
        Objects.equals(this.displayDescription, bundle.displayDescription) &&
        Objects.equals(this.bundleClass, bundle.bundleClass) &&
        Objects.equals(this.productClass, bundle.productClass) &&
        Objects.equals(this.serviceId, bundle.serviceId) &&
        Objects.equals(this.paymentType, bundle.paymentType) &&
        Objects.equals(this.bundleType, bundle.bundleType) &&
        Objects.equals(this.commitmentPeriod, bundle.commitmentPeriod) &&
        Objects.equals(this.displayOrder, bundle.displayOrder) &&
        Objects.equals(this.showInSummary, bundle.showInSummary) &&
        Objects.equals(this.allowances, bundle.allowances) &&
        Objects.equals(this.merchandisingMedia, bundle.merchandisingMedia) &&
        Objects.equals(this.attributes, bundle.attributes) &&
        Objects.equals(this.priceDetails, bundle.priceDetails) &&
        Objects.equals(this.isChanged, bundle.isChanged) &&
        Objects.equals(this.isVodafoneGlobalRoaming, bundle.isVodafoneGlobalRoaming) &&
        Objects.equals(this.bundledServiceProducts, bundle.bundledServiceProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageLineId, action, skuId, name, description, displayName, displayDescription, bundleClass, productClass, serviceId, paymentType, bundleType, commitmentPeriod, displayOrder, showInSummary, allowances, merchandisingMedia, attributes, priceDetails, isChanged, isVodafoneGlobalRoaming, bundledServiceProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bundle {\n");
    
    sb.append("    packageLineId: ").append(toIndentedString(packageLineId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    bundleClass: ").append(toIndentedString(bundleClass)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    commitmentPeriod: ").append(toIndentedString(commitmentPeriod)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    showInSummary: ").append(toIndentedString(showInSummary)).append("\n");
    sb.append("    allowances: ").append(toIndentedString(allowances)).append("\n");
    sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    isVodafoneGlobalRoaming: ").append(toIndentedString(isVodafoneGlobalRoaming)).append("\n");
    sb.append("    bundledServiceProducts: ").append(toIndentedString(bundledServiceProducts)).append("\n");
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

