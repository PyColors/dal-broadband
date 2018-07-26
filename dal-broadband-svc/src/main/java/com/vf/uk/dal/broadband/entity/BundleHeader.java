package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BundleHeader.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-01T13:21:31.295Z")

public class BundleHeader   {
  
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

  /**
   * Sku id.
   *
   * @param skuId the sku id
   * @return the bundle header
   */
  public BundleHeader skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Unique bundle id as available from the product catalogue.
   *
   * @return skuId
   */
  @ApiModelProperty(value = "Unique bundle id as available from the product catalogue")


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

  /**
   * Name.
   *
   * @param name the name
   * @return the bundle header
   */
  public BundleHeader name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the bundle as provided in the product catalogue. Also, this is a package name for broadband service (ex- superfast1)
   * @return name
  **/
  @ApiModelProperty(value = "Name of the bundle as provided in the product catalogue. Also, this is a package name for broadband service (ex- superfast1)")


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
   * Description.
   *
   * @param description the description
   * @return the bundle header
   */
  public BundleHeader description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the bundle as provided in the product catalogue. This also provide description of package of broadband service
   * @return description
  **/
  @ApiModelProperty(value = "Description of the bundle as provided in the product catalogue. This also provide description of package of broadband service")


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
   * Bundle name.
   *
   * @param bundleName the bundle name
   * @return the bundle header
   */
  public BundleHeader bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  /**
   * Name of the bundle as provided in the merchandising file.
   *
   * @return bundleName
   */
  @ApiModelProperty(value = "Name of the bundle as provided in the merchandising file")


  public String getBundleName() {
    return bundleName;
  }

  /**
   * Sets the bundle name.
   *
   * @param bundleName the new bundle name
   */
  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  /**
   * Bundle description.
   *
   * @param bundleDescription the bundle description
   * @return the bundle header
   */
  public BundleHeader bundleDescription(String bundleDescription) {
    this.bundleDescription = bundleDescription;
    return this;
  }

  /**
   * Description of the bundle as provided in the merchandising file.
   *
   * @return bundleDescription
   */
  @ApiModelProperty(value = "Description of the bundle as provided in the merchandising file")


  public String getBundleDescription() {
    return bundleDescription;
  }

  /**
   * Sets the bundle description.
   *
   * @param bundleDescription the new bundle description
   */
  public void setBundleDescription(String bundleDescription) {
    this.bundleDescription = bundleDescription;
  }

  /**
   * Bundle class.
   *
   * @param bundleClass the bundle class
   * @return the bundle header
   */
  public BundleHeader bundleClass(String bundleClass) {
    this.bundleClass = bundleClass;
    return this;
  }

  /**
   * Catalogue product class identifies products - SIMO, HANDSET etc.
   * @return bundleClass
  **/
  @ApiModelProperty(value = "Catalogue product class identifies products - SIMO, HANDSET etc.")


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
   * Product class.
   *
   * @param productClass the product class
   * @return the bundle header
   */
  public BundleHeader productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Catalogue product class identifies products - SIMO, HANDSET etc.
   * @return productClass
  **/
  @ApiModelProperty(value = "Catalogue product class identifies products - SIMO, HANDSET etc.")


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
   * Payment type.
   *
   * @param paymentType the payment type
   * @return the bundle header
   */
  public BundleHeader paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Payment type of the bundle. For example, \"postpaid\", \"prepaid\" etc.
   * @return paymentType
  **/
  @ApiModelProperty(value = "Payment type of the bundle. For example, \"postpaid\", \"prepaid\" etc.")


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
   * Bundle type.
   *
   * @param bundleType the bundle type
   * @return the bundle header
   */
  public BundleHeader bundleType(String bundleType) {
    this.bundleType = bundleType;
    return this;
  }

  /**
   * Type of the bundle. For example, Standard, Red, RedPlus etc.
   * @return bundleType
  **/
  @ApiModelProperty(value = "Type of the bundle. For example, Standard, Red, RedPlus etc.")


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
   * Speed.
   *
   * @param speed the speed
   * @return the bundle header
   */
  public BundleHeader speed(Speed speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed.
   *
   * @return speed
   */
  @ApiModelProperty(value = "")

  @Valid

  public Speed getSpeed() {
    return speed;
  }

  /**
   * Sets the speed.
   *
   * @param speed the new speed
   */
  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  /**
   * Usage.
   *
   * @param usage the usage
   * @return the bundle header
   */
  public BundleHeader usage(String usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Usage of the Flb bundle as provided in the Product catalogue.
   *
   * @return usage
   */
  @ApiModelProperty(value = "Usage of the Flb bundle as provided in the Product catalogue")


  public String getUsage() {
    return usage;
  }

  /**
   * Sets the usage.
   *
   * @param usage the new usage
   */
  public void setUsage(String usage) {
    this.usage = usage;
  }

  /**
   * Classification code.
   *
   * @param classificationCode the classification code
   * @return the bundle header
   */
  public BundleHeader classificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
    return this;
  }

  /**
   * ClassificationCode of the Flb bundle as provided in the Product catalogue.
   *
   * @return classificationCode
   */
  @ApiModelProperty(value = "ClassificationCode of the Flb bundle as provided in the Product catalogue")


  public String getClassificationCode() {
    return classificationCode;
  }

  /**
   * Sets the classification code.
   *
   * @param classificationCode the new classification code
   */
  public void setClassificationCode(String classificationCode) {
    this.classificationCode = classificationCode;
  }

  /**
   * Misc attributes.
   *
   * @param miscAttributes the misc attributes
   * @return the bundle header
   */
  public BundleHeader miscAttributes(MiscellaneousAttributes miscAttributes) {
    this.miscAttributes = miscAttributes;
    return this;
  }

  /**
   * Get miscAttributes.
   *
   * @return miscAttributes
   */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousAttributes getMiscAttributes() {
    return miscAttributes;
  }

  /**
   * Sets the misc attributes.
   *
   * @param miscAttributes the new misc attributes
   */
  public void setMiscAttributes(MiscellaneousAttributes miscAttributes) {
    this.miscAttributes = miscAttributes;
  }

  /**
   * Commitment period.
   *
   * @param commitmentPeriod the commitment period
   * @return the bundle header
   */
  public BundleHeader commitmentPeriod(String commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
    return this;
  }

  /**
   * Commitment period of the bundle.
   *
   * @return commitmentPeriod
   */
  @ApiModelProperty(value = "Commitment period of the bundle")


  public String getCommitmentPeriod() {
    return commitmentPeriod;
  }

  /**
   * Sets the commitment period.
   *
   * @param commitmentPeriod the new commitment period
   */
  public void setCommitmentPeriod(String commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
  }

  /**
   * Plan couple id.
   *
   * @param planCoupleId the plan couple id
   * @return the bundle header
   */
  public BundleHeader planCoupleId(String planCoupleId) {
    this.planCoupleId = planCoupleId;
    return this;
  }

  /**
   * PlanID of the Couple Plan.
   *
   * @return planCoupleId
   */
  @ApiModelProperty(value = "PlanID of the Couple Plan")


  public String getPlanCoupleId() {
    return planCoupleId;
  }

  /**
   * Sets the plan couple id.
   *
   * @param planCoupleId the new plan couple id
   */
  public void setPlanCoupleId(String planCoupleId) {
    this.planCoupleId = planCoupleId;
  }

  /**
   * Plan couple flag.
   *
   * @param planCoupleFlag the plan couple flag
   * @return the bundle header
   */
  public BundleHeader planCoupleFlag(Boolean planCoupleFlag) {
    this.planCoupleFlag = planCoupleFlag;
    return this;
  }

  /**
   * Indicate whether this plan is to be coupled or not True, False.
   * @return planCoupleFlag
  **/
  @ApiModelProperty(value = "Indicate whether this plan is to be coupled or not True, False.")


  public Boolean isPlanCoupleFlag() {
    return planCoupleFlag;
  }

  /**
   * Sets the plan couple flag.
   *
   * @param planCoupleFlag the new plan couple flag
   */
  public void setPlanCoupleFlag(Boolean planCoupleFlag) {
    this.planCoupleFlag = planCoupleFlag;
  }

  /**
   * Plan couple label.
   *
   * @param planCoupleLabel the plan couple label
   * @return the bundle header
   */
  public BundleHeader planCoupleLabel(String planCoupleLabel) {
    this.planCoupleLabel = planCoupleLabel;
    return this;
  }

  /**
   * Message needs to be build based on data difference and cost logic.
   * @return planCoupleLabel
  **/
  @ApiModelProperty(value = "Message needs to be build based on data difference and cost logic.")


  public String getPlanCoupleLabel() {
    return planCoupleLabel;
  }

  /**
   * Sets the plan couple label.
   *
   * @param planCoupleLabel the new plan couple label
   */
  public void setPlanCoupleLabel(String planCoupleLabel) {
    this.planCoupleLabel = planCoupleLabel;
  }

  /**
   * Global roaming flag.
   *
   * @param globalRoamingFlag the global roaming flag
   * @return the bundle header
   */
  public BundleHeader globalRoamingFlag(Boolean globalRoamingFlag) {
    this.globalRoamingFlag = globalRoamingFlag;
    return this;
  }

  /**
   * Indicate whether this plan having Global Roaming or not .
   *
   * @return globalRoamingFlag
   */
  @ApiModelProperty(value = "Indicate whether this plan having Global Roaming or not ")


  public Boolean isGlobalRoamingFlag() {
    return globalRoamingFlag;
  }

  /**
   * Sets the global roaming flag.
   *
   * @param globalRoamingFlag the new global roaming flag
   */
  public void setGlobalRoamingFlag(Boolean globalRoamingFlag) {
    this.globalRoamingFlag = globalRoamingFlag;
  }

  /**
   * Secure net flag.
   *
   * @param secureNetFlag the secure net flag
   * @return the bundle header
   */
  public BundleHeader secureNetFlag(Boolean secureNetFlag) {
    this.secureNetFlag = secureNetFlag;
    return this;
  }

  /**
   * Indicate whether this plan having Secure net or not .
   *
   * @return secureNetFlag
   */
  @ApiModelProperty(value = "Indicate whether this plan having Secure net or not ")


  public Boolean isSecureNetFlag() {
    return secureNetFlag;
  }

  /**
   * Sets the secure net flag.
   *
   * @param secureNetFlag the new secure net flag
   */
  public void setSecureNetFlag(Boolean secureNetFlag) {
    this.secureNetFlag = secureNetFlag;
  }

  /**
   * Checks if is unlimited usage.
   *
   * @param isUnlimitedUsage the is unlimited usage
   * @return the bundle header
   */
  public BundleHeader isUnlimitedUsage(Boolean isUnlimitedUsage) {
    this.isUnlimitedUsage = isUnlimitedUsage;
    return this;
  }

  /**
   * boolean flag to determine the unlimited usage plan for broadband customer.
   *
   * @return isUnlimitedUsage
   */
  @ApiModelProperty(value = "boolean flag to determine the unlimited usage plan for broadband customer")


  public Boolean isIsUnlimitedUsage() {
    return isUnlimitedUsage;
  }

  /**
   * Sets the checks if is unlimited usage.
   *
   * @param isUnlimitedUsage the new checks if is unlimited usage
   */
  public void setIsUnlimitedUsage(Boolean isUnlimitedUsage) {
    this.isUnlimitedUsage = isUnlimitedUsage;
  }

  /**
   * Mobile line rental id.
   *
   * @param mobileLineRentalId the mobile line rental id
   * @return the bundle header
   */
  public BundleHeader mobileLineRentalId(String mobileLineRentalId) {
    this.mobileLineRentalId = mobileLineRentalId;
    return this;
  }

  /**
   * Line rental id from the service product of the bundle.
   *
   * @return mobileLineRentalId
   */
  @ApiModelProperty(value = "Line rental id from the service product of the bundle")


  public String getMobileLineRentalId() {
    return mobileLineRentalId;
  }

  /**
   * Sets the mobile line rental id.
   *
   * @param mobileLineRentalId the new mobile line rental id
   */
  public void setMobileLineRentalId(String mobileLineRentalId) {
    this.mobileLineRentalId = mobileLineRentalId;
  }

  /**
   * Mobile service id.
   *
   * @param mobileServiceId the mobile service id
   * @return the bundle header
   */
  public BundleHeader mobileServiceId(String mobileServiceId) {
    this.mobileServiceId = mobileServiceId;
    return this;
  }

  /**
   * Line rental id from the service product of the bundle.
   *
   * @return mobileServiceId
   */
  @ApiModelProperty(value = "Line rental id from the service product of the bundle")


  public String getMobileServiceId() {
    return mobileServiceId;
  }

  /**
   * Sets the mobile service id.
   *
   * @param mobileServiceId the new mobile service id
   */
  public void setMobileServiceId(String mobileServiceId) {
    this.mobileServiceId = mobileServiceId;
  }

  /**
   * Allowance.
   *
   * @param allowance the allowance
   * @return the bundle header
   */
  public BundleHeader allowance(List<BundleAllowance> allowance) {
    this.allowance = allowance;
    return this;
  }

  /**
   * Adds the allowance item.
   *
   * @param allowanceItem the allowance item
   * @return the bundle header
   */
  public BundleHeader addAllowanceItem(BundleAllowance allowanceItem) {
    if (this.allowance == null) {
      this.allowance = new ArrayList<>();
    }
    this.allowance.add(allowanceItem);
    return this;
  }

  /**
   * Get allowance.
   *
   * @return allowance
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<BundleAllowance> getAllowance() {
    return allowance;
  }

  /**
   * Sets the allowance.
   *
   * @param allowance the new allowance
   */
  public void setAllowance(List<BundleAllowance> allowance) {
    this.allowance = allowance;
  }

  /**
   * Roaming allowance.
   *
   * @param roamingAllowance the roaming allowance
   * @return the bundle header
   */
  public BundleHeader roamingAllowance(List<BundleAllowance> roamingAllowance) {
    this.roamingAllowance = roamingAllowance;
    return this;
  }

  /**
   * Adds the roaming allowance item.
   *
   * @param roamingAllowanceItem the roaming allowance item
   * @return the bundle header
   */
  public BundleHeader addRoamingAllowanceItem(BundleAllowance roamingAllowanceItem) {
    if (this.roamingAllowance == null) {
      this.roamingAllowance = new ArrayList<>();
    }
    this.roamingAllowance.add(roamingAllowanceItem);
    return this;
  }

  /**
   * Get roamingAllowance.
   *
   * @return roamingAllowance
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<BundleAllowance> getRoamingAllowance() {
    return roamingAllowance;
  }

  /**
   * Sets the roaming allowance.
   *
   * @param roamingAllowance the new roaming allowance
   */
  public void setRoamingAllowance(List<BundleAllowance> roamingAllowance) {
    this.roamingAllowance = roamingAllowance;
  }

  /**
   * Merchandising media.
   *
   * @param merchandisingMedia the merchandising media
   * @return the bundle header
   */
  public BundleHeader merchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }

  /**
   * Adds the merchandising media item.
   *
   * @param merchandisingMediaItem the merchandising media item
   * @return the bundle header
   */
  public BundleHeader addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
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

  public List<MediaLink> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  /**
   * Sets the merchandising media.
   *
   * @param merchandisingMedia the new merchandising media
   */
  public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }

  /**
   * Price info.
   *
   * @param priceInfo the price info
   * @return the bundle header
   */
  public BundleHeader priceInfo(PriceForBundleAndHardware priceInfo) {
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

  public PriceForBundleAndHardware getPriceInfo() {
    return priceInfo;
  }

  /**
   * Sets the price info.
   *
   * @param priceInfo the new price info
   */
  public void setPriceInfo(PriceForBundleAndHardware priceInfo) {
    this.priceInfo = priceInfo;
  }

  /**
   * Line rental.
   *
   * @param lineRental the line rental
   * @return the bundle header
   */
  public BundleHeader lineRental(Price lineRental) {
    this.lineRental = lineRental;
    return this;
  }

  /**
   * Get lineRental.
   *
   * @return lineRental
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getLineRental() {
    return lineRental;
  }

  /**
   * Sets the line rental.
   *
   * @param lineRental the new line rental
   */
  public void setLineRental(Price lineRental) {
    this.lineRental = lineRental;
  }

  /**
   * Line rental discount.
   *
   * @param lineRentalDiscount the line rental discount
   * @return the bundle header
   */
  public BundleHeader lineRentalDiscount(Price lineRentalDiscount) {
    this.lineRentalDiscount = lineRentalDiscount;
    return this;
  }

  /**
   * Get lineRentalDiscount.
   *
   * @return lineRentalDiscount
   */
  @ApiModelProperty(value = "")

  @Valid

  public Price getLineRentalDiscount() {
    return lineRentalDiscount;
  }

  /**
   * Sets the line rental discount.
   *
   * @param lineRentalDiscount the new line rental discount
   */
  public void setLineRentalDiscount(Price lineRentalDiscount) {
    this.lineRentalDiscount = lineRentalDiscount;
  }

  /**
   * Mcs.
   *
   * @param mcs the mcs
   * @return the bundle header
   */
  public BundleHeader mcs(List<MonthlyCostSaver> mcs) {
    this.mcs = mcs;
    return this;
  }

  /**
   * Adds the mcs item.
   *
   * @param mcsItem the mcs item
   * @return the bundle header
   */
  public BundleHeader addMcsItem(MonthlyCostSaver mcsItem) {
    if (this.mcs == null) {
      this.mcs = new ArrayList<>();
    }
    this.mcs.add(mcsItem);
    return this;
  }

  /**
   * Get mcs.
   *
   * @return mcs
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonthlyCostSaver> getMcs() {
    return mcs;
  }

  /**
   * Sets the mcs.
   *
   * @param mcs the new mcs
   */
  public void setMcs(List<MonthlyCostSaver> mcs) {
    this.mcs = mcs;
  }

  /**
   * Promotions package.
   *
   * @param promotionsPackage the promotions package
   * @return the bundle header
   */
  public BundleHeader promotionsPackage(MerchandisingPromotionsPackage promotionsPackage) {
    this.promotionsPackage = promotionsPackage;
    return this;
  }

  /**
   * Get promotionsPackage.
   *
   * @return promotionsPackage
   */
  @ApiModelProperty(value = "")

  @Valid

  public MerchandisingPromotionsPackage getPromotionsPackage() {
    return promotionsPackage;
  }

  /**
   * Sets the promotions package.
   *
   * @param promotionsPackage the new promotions package
   */
  public void setPromotionsPackage(MerchandisingPromotionsPackage promotionsPackage) {
    this.promotionsPackage = promotionsPackage;
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
    BundleHeader bundleHeader = (BundleHeader) o;
    return Objects.equals(this.skuId, bundleHeader.skuId) &&
        Objects.equals(this.name, bundleHeader.name) &&
        Objects.equals(this.description, bundleHeader.description) &&
        Objects.equals(this.bundleName, bundleHeader.bundleName) &&
        Objects.equals(this.bundleDescription, bundleHeader.bundleDescription) &&
        Objects.equals(this.bundleClass, bundleHeader.bundleClass) &&
        Objects.equals(this.productClass, bundleHeader.productClass) &&
        Objects.equals(this.paymentType, bundleHeader.paymentType) &&
        Objects.equals(this.bundleType, bundleHeader.bundleType) &&
        Objects.equals(this.speed, bundleHeader.speed) &&
        Objects.equals(this.usage, bundleHeader.usage) &&
        Objects.equals(this.classificationCode, bundleHeader.classificationCode) &&
        Objects.equals(this.miscAttributes, bundleHeader.miscAttributes) &&
        Objects.equals(this.commitmentPeriod, bundleHeader.commitmentPeriod) &&
        Objects.equals(this.planCoupleId, bundleHeader.planCoupleId) &&
        Objects.equals(this.planCoupleFlag, bundleHeader.planCoupleFlag) &&
        Objects.equals(this.planCoupleLabel, bundleHeader.planCoupleLabel) &&
        Objects.equals(this.globalRoamingFlag, bundleHeader.globalRoamingFlag) &&
        Objects.equals(this.secureNetFlag, bundleHeader.secureNetFlag) &&
        Objects.equals(this.isUnlimitedUsage, bundleHeader.isUnlimitedUsage) &&
        Objects.equals(this.mobileLineRentalId, bundleHeader.mobileLineRentalId) &&
        Objects.equals(this.mobileServiceId, bundleHeader.mobileServiceId) &&
        Objects.equals(this.allowance, bundleHeader.allowance) &&
        Objects.equals(this.roamingAllowance, bundleHeader.roamingAllowance) &&
        Objects.equals(this.merchandisingMedia, bundleHeader.merchandisingMedia) &&
        Objects.equals(this.priceInfo, bundleHeader.priceInfo) &&
        Objects.equals(this.lineRental, bundleHeader.lineRental) &&
        Objects.equals(this.lineRentalDiscount, bundleHeader.lineRentalDiscount) &&
        Objects.equals(this.mcs, bundleHeader.mcs) &&
        Objects.equals(this.promotionsPackage, bundleHeader.promotionsPackage);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(skuId, name, description, bundleName, bundleDescription, bundleClass, productClass, paymentType, bundleType, speed, usage, classificationCode, miscAttributes, commitmentPeriod, planCoupleId, planCoupleFlag, planCoupleLabel, globalRoamingFlag, secureNetFlag, isUnlimitedUsage, mobileLineRentalId, mobileServiceId, allowance, roamingAllowance, merchandisingMedia, priceInfo, lineRental, lineRentalDiscount, mcs, promotionsPackage);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleHeader {\n");
    
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    bundleDescription: ").append(toIndentedString(bundleDescription)).append("\n");
    sb.append("    bundleClass: ").append(toIndentedString(bundleClass)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
    sb.append("    miscAttributes: ").append(toIndentedString(miscAttributes)).append("\n");
    sb.append("    commitmentPeriod: ").append(toIndentedString(commitmentPeriod)).append("\n");
    sb.append("    planCoupleId: ").append(toIndentedString(planCoupleId)).append("\n");
    sb.append("    planCoupleFlag: ").append(toIndentedString(planCoupleFlag)).append("\n");
    sb.append("    planCoupleLabel: ").append(toIndentedString(planCoupleLabel)).append("\n");
    sb.append("    globalRoamingFlag: ").append(toIndentedString(globalRoamingFlag)).append("\n");
    sb.append("    secureNetFlag: ").append(toIndentedString(secureNetFlag)).append("\n");
    sb.append("    isUnlimitedUsage: ").append(toIndentedString(isUnlimitedUsage)).append("\n");
    sb.append("    mobileLineRentalId: ").append(toIndentedString(mobileLineRentalId)).append("\n");
    sb.append("    mobileServiceId: ").append(toIndentedString(mobileServiceId)).append("\n");
    sb.append("    allowance: ").append(toIndentedString(allowance)).append("\n");
    sb.append("    roamingAllowance: ").append(toIndentedString(roamingAllowance)).append("\n");
    sb.append("    merchandisingMedia: ").append(toIndentedString(merchandisingMedia)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    lineRental: ").append(toIndentedString(lineRental)).append("\n");
    sb.append("    lineRentalDiscount: ").append(toIndentedString(lineRentalDiscount)).append("\n");
    sb.append("    mcs: ").append(toIndentedString(mcs)).append("\n");
    sb.append("    promotionsPackage: ").append(toIndentedString(promotionsPackage)).append("\n");
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

