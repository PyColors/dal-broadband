package com.vf.uk.dal.broadband.entity.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Product   {
  @JsonProperty("ImageURLsFullFront")
  private String imageURLsFullFront = null;

  @JsonProperty("SeoDescription")
  private String seoDescription = null;

  @JsonProperty("affiliateExport")
  private String affiliateExport = null;

  @JsonProperty("allowanceUOM")
  private String allowanceUOM = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("availableFrom")
  private String availableFrom = null;

  @JsonProperty("backOrderable")
  private String backOrderable = null;

  @JsonProperty("compareWith")
  private String compareWith = null;

  @JsonProperty("compatibleEntertainment")
  private String compatibleEntertainment = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("controlOrder")
  private String controlOrder = null;

  @JsonProperty("conversionFactor")
  private String conversionFactor = null;

  @JsonProperty("dataUOM")
  private String dataUOM = null;

  @JsonProperty("dataValue")
  private String dataValue = null;

  @JsonProperty("deliveryClassification")
  private String deliveryClassification = null;

  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  @JsonProperty("deliveryOnWeekend")
  private String deliveryOnWeekend = null;

  @JsonProperty("deliveryPartner")
  private String deliveryPartner = null;

  @JsonProperty("discountAmount")
  private BigDecimal discountAmount = null;

  @JsonProperty("discountType")
  private String discountType = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("displayUOM")
  private String displayUOM = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("durationUOM")
  private String durationUOM = null;

  @JsonProperty("eligibiltiySubflow")
  private String eligibiltiySubflow = null;

  @JsonProperty("equipmentMake")
  private String equipmentMake = null;

  @JsonProperty("equipmentModel")
  private String equipmentModel = null;

  @JsonProperty("estDeliveryDate")
  private String estDeliveryDate = null;

  @JsonProperty("etdataUOM")
  private String etdataUOM = null;

  @JsonProperty("etdataValue")
  private String etdataValue = null;

  @JsonProperty("europeanRoamingDataUOM")
  private String europeanRoamingDataUOM = null;

  @JsonProperty("europeanRoamingDataValue")
  private String europeanRoamingDataValue = null;

  @JsonProperty("europeanRoamingMinutesUOM")
  private String europeanRoamingMinutesUOM = null;

  @JsonProperty("europeanRoamingMinutesValue")
  private String europeanRoamingMinutesValue = null;

  @JsonProperty("europeanRoamingPictureMessagesUOM")
  private String europeanRoamingPictureMessagesUOM = null;

  @JsonProperty("europeanRoamingPictureMessagesValue")
  private String europeanRoamingPictureMessagesValue = null;

  @JsonProperty("europeanRoamingTextsUOM")
  private String europeanRoamingTextsUOM = null;

  @JsonProperty("europeanRoamingTextsValue")
  private String europeanRoamingTextsValue = null;

  @JsonProperty("extraimeuandrowUOM")
  private String extraimeuandrowUOM = null;

  @JsonProperty("extraimeuandrowValue")
  private String extraimeuandrowValue = null;

  @JsonProperty("extraimeuandusUOM")
  private String extraimeuandusUOM = null;

  @JsonProperty("extraimeuandusValue")
  private String extraimeuandusValue = null;

  @JsonProperty("globalRoamingDataUOM")
  private String globalRoamingDataUOM = null;

  @JsonProperty("globalRoamingDataValue")
  private String globalRoamingDataValue = null;

  @JsonProperty("globalRoamingMinutesUOM")
  private String globalRoamingMinutesUOM = null;

  @JsonProperty("globalRoamingMinutesValue")
  private String globalRoamingMinutesValue = null;

  @JsonProperty("globalRoamingTextsUOM")
  private String globalRoamingTextsUOM = null;

  @JsonProperty("globalRoamingTextsValue")
  private String globalRoamingTextsValue = null;

  @JsonProperty("helptext")
  private String helptext = null;

  @JsonProperty("helpurl")
  private String helpurl = null;

  @JsonProperty("imageURLsFullBack")
  private String imageURLsFullBack = null;

  @JsonProperty("imageURLsFullHero")
  private String imageURLsFullHero = null;

  @JsonProperty("imageURLsFullLeft")
  private String imageURLsFullLeft = null;

  @JsonProperty("imageURLsFullRight:")
  private String imageURLsFullRight = null;

  @JsonProperty("imageURLsFullSide")
  private String imageURLsFullSide = null;

  @JsonProperty("imageURLsGrid")
  private String imageURLsGrid = null;

  @JsonProperty("imageURLsIcon")
  private String imageURLsIcon = null;

  @JsonProperty("imageURLsSmall")
  private String imageURLsSmall = null;

  @JsonProperty("imageURLsSticker")
  private String imageURLsSticker = null;

  @JsonProperty("imageURLsThumbsFront")
  private String imageURLsThumbsFront = null;

  @JsonProperty("imageURLsThumbsLeft")
  private String imageURLsThumbsLeft = null;

  @JsonProperty("imageURLsThumbsRight")
  private String imageURLsThumbsRight = null;

  @JsonProperty("imageURLsThumbsSide")
  private String imageURLsThumbsSide = null;

  @JsonProperty("inTheBox")
  private String inTheBox = null;

  @JsonProperty("internationalMinutesUOM")
  private String internationalMinutesUOM = null;

  @JsonProperty("internationalMinutesValue")
  private String internationalMinutesValue = null;

  @JsonProperty("internationalTextsUOM")
  private String internationalTextsUOM = null;

  @JsonProperty("internationalTextsValue")
  private String internationalTextsValue = null;

  @JsonProperty("isBattery")
  private String isBattery = null;

  @JsonProperty("isDeviceProduct")
  private String isDeviceProduct = null;

  @JsonProperty("isDisplayableAcq")
  private String isDisplayableAcq = null;

  @JsonProperty("isDisplayableEcare")
  private String isDisplayableEcare = null;

  @JsonProperty("isDisplayableRet")
  private String isDisplayableRet = null;

  @JsonProperty("isDisplaybaleSavedBasket")
  private String isDisplaybaleSavedBasket = null;

  @JsonProperty("isSellableAcq")
  private String isSellableAcq = null;

  @JsonProperty("isSellableECare")
  private String isSellableECare = null;

  @JsonProperty("isSellableRet")
  private String isSellableRet = null;

  @JsonProperty("isServicesProduct")
  private String isServicesProduct = null;

  @JsonProperty("landlineMinutesUOM")
  private String landlineMinutesUOM = null;

  @JsonProperty("landlineMinutesValue")
  private String landlineMinutesValue = null;

  @JsonProperty("leadPlanId")
  private String leadPlanId = null;

  @JsonProperty("listOfCompatibleBundles")
  @Valid
  private List<String> listOfCompatibleBundles = null;

  @JsonProperty("mefProductName")
  private String mefProductName = null;

  @JsonProperty("numReviews")
  private String numReviews = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("parentProductId")
  private String parentProductId = null;

  @JsonProperty("pdGrpCmpAcc")
  private String pdGrpCmpAcc = null;

  @JsonProperty("pdGrpRecAcc")
  private String pdGrpRecAcc = null;

  @JsonProperty("pdGrpRecExtr")
  private String pdGrpRecExtr = null;

  @JsonProperty("pdGrpvariant")
  private String pdGrpvariant = null;

  @JsonProperty("pictureMessagesUOM")
  private String pictureMessagesUOM = null;

  @JsonProperty("postDesc")
  private String postDesc = null;

  @JsonProperty("postDescMobile")
  private String postDescMobile = null;

  @JsonProperty("preDesc")
  private String preDesc = null;

  @JsonProperty("preDescMobile")
  private String preDescMobile = null;

  @JsonProperty("preOrderable")
  private String preOrderable = null;

  @JsonProperty("priceGrossOVR")
  private String priceGrossOVR = null;

  @JsonProperty("priceNetOVR")
  private String priceNetOVR = null;

  @JsonProperty("priceType")
  private String priceType = null;

  @JsonProperty("priceVatOVR")
  private String priceVatOVR = null;

  @JsonProperty("productClass")
  private String productClass = null;

  @JsonProperty("productEndDate")
  private String productEndDate = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("productStartDate")
  private String productStartDate = null;

  @JsonProperty("productSubClass")
  private String productSubClass = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("rating")
  private String rating = null;

  @JsonProperty("roamingDataUOM")
  private String roamingDataUOM = null;

  @JsonProperty("roamingDataValue")
  private String roamingDataValue = null;

  @JsonProperty("salesExpired")
  private String salesExpired = null;

  @JsonProperty("seoCanonical")
  private String seoCanonical = null;

  @JsonProperty("seoIndex")
  private String seoIndex = null;

  @JsonProperty("seoKeywords")
  private String seoKeywords = null;

  @JsonProperty("support")
  private String support = null;

  @JsonProperty("threeDSpin")
  private String threeDSpin = null;

  @JsonProperty("tilUOM")
  private String tilUOM = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uKANDInternationalCreditUOM")
  private String uKANDInternationalCreditUOM = null;

  @JsonProperty("uKANDInternationalCreditValue")
  private String uKANDInternationalCreditValue = null;

  @JsonProperty("uKmobileMinutesUOM")
  private String uKmobileMinutesUOM = null;

  @JsonProperty("uKmobileMinutesValue")
  private String uKmobileMinutesValue = null;

  @JsonProperty("ukDataUOM")
  private String ukDataUOM = null;

  @JsonProperty("ukDataValue")
  private String ukDataValue = null;

  @JsonProperty("ukMinutesUOM")
  private String ukMinutesUOM = null;

  @JsonProperty("ukMinutesValue")
  private String ukMinutesValue = null;

  @JsonProperty("ukTextsUOM")
  private String ukTextsUOM = null;

  @JsonProperty("ukTextsValue")
  private String ukTextsValue = null;

  @JsonProperty("ukandinternationalCreditUOM")
  private String ukandinternationalCreditUOM = null;

  @JsonProperty("ukandinternationalCreditValue")
  private String ukandinternationalCreditValue = null;

  @JsonProperty("ukmobileMinutesUOM")
  private String ukmobileMinutesUOM = null;

  @JsonProperty("ukmobileMinutesValue")
  private String ukmobileMinutesValue = null;

  @JsonProperty("video")
  private String video = null;

  @JsonProperty("vodafoneVodafoneMinutesUOM")
  private String vodafoneVodafoneMinutesUOM = null;

  @JsonProperty("vodafoneVodafoneMinutesValue")
  private String vodafoneVodafoneMinutesValue = null;

  @JsonProperty("vodafoneVodafoneUOM")
  private String vodafoneVodafoneUOM = null;

  @JsonProperty("vodafoneVodafoneValue")
  private String vodafoneVodafoneValue = null;

  @JsonProperty("vodafoneVodafonetextsUOM")
  private String vodafoneVodafonetextsUOM = null;

  @JsonProperty("vodafoneVodafonetextsValue")
  private String vodafoneVodafonetextsValue = null;

  @JsonProperty("warranty")
  private String warranty = null;

  @JsonProperty("weekEnd")
  private String weekEnd = null;

  @JsonProperty("wifiUOM")
  private String wifiUOM = null;

  @JsonProperty("wifiValue")
  private String wifiValue = null;

  @JsonProperty("zereightnumberminutesUOM")
  private String zereightnumberminutesUOM = null;

  @JsonProperty("zereightnumberminutesValue")
  private String zereightnumberminutesValue = null;

  public Product imageURLsFullFront(String imageURLsFullFront) {
    this.imageURLsFullFront = imageURLsFullFront;
    return this;
  }

  /**
   * Product image URL imageURLs.full.front
   * @return imageURLsFullFront
  **/
  @ApiModelProperty(value = "Product image URL imageURLs.full.front")


  public String getImageURLsFullFront() {
    return imageURLsFullFront;
  }

  public void setImageURLsFullFront(String imageURLsFullFront) {
    this.imageURLsFullFront = imageURLsFullFront;
  }

  public Product seoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
    return this;
  }

  /**
   * Product short description as defined catalogue
   * @return seoDescription
  **/
  @ApiModelProperty(value = "Product short description as defined catalogue")


  public String getSeoDescription() {
    return seoDescription;
  }

  public void setSeoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
  }

  public Product affiliateExport(String affiliateExport) {
    this.affiliateExport = affiliateExport;
    return this;
  }

  /**
   * Get affiliateExport
   * @return affiliateExport
  **/
  @ApiModelProperty(value = "")


  public String getAffiliateExport() {
    return affiliateExport;
  }

  public void setAffiliateExport(String affiliateExport) {
    this.affiliateExport = affiliateExport;
  }

  public Product allowanceUOM(String allowanceUOM) {
    this.allowanceUOM = allowanceUOM;
    return this;
  }

  /**
   * Get allowanceUOM
   * @return allowanceUOM
  **/
  @ApiModelProperty(value = "")


  public String getAllowanceUOM() {
    return allowanceUOM;
  }

  public void setAllowanceUOM(String allowanceUOM) {
    this.allowanceUOM = allowanceUOM;
  }

  public Product amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Product availableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

  /**
   * Get availableFrom
   * @return availableFrom
  **/
  @ApiModelProperty(value = "")


  public String getAvailableFrom() {
    return availableFrom;
  }

  public void setAvailableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
  }

  public Product backOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
    return this;
  }

  /**
   * Get backOrderable
   * @return backOrderable
  **/
  @ApiModelProperty(value = "")


  public String getBackOrderable() {
    return backOrderable;
  }

  public void setBackOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
  }

  public Product compareWith(String compareWith) {
    this.compareWith = compareWith;
    return this;
  }

  /**
   * Get compareWith
   * @return compareWith
  **/
  @ApiModelProperty(value = "")


  public String getCompareWith() {
    return compareWith;
  }

  public void setCompareWith(String compareWith) {
    this.compareWith = compareWith;
  }

  public Product compatibleEntertainment(String compatibleEntertainment) {
    this.compatibleEntertainment = compatibleEntertainment;
    return this;
  }

  /**
   * Get compatibleEntertainment
   * @return compatibleEntertainment
  **/
  @ApiModelProperty(value = "")


  public String getCompatibleEntertainment() {
    return compatibleEntertainment;
  }

  public void setCompatibleEntertainment(String compatibleEntertainment) {
    this.compatibleEntertainment = compatibleEntertainment;
  }

  public Product condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(value = "")


  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Product controlOrder(String controlOrder) {
    this.controlOrder = controlOrder;
    return this;
  }

  /**
   * Get controlOrder
   * @return controlOrder
  **/
  @ApiModelProperty(value = "")


  public String getControlOrder() {
    return controlOrder;
  }

  public void setControlOrder(String controlOrder) {
    this.controlOrder = controlOrder;
  }

  public Product conversionFactor(String conversionFactor) {
    this.conversionFactor = conversionFactor;
    return this;
  }

  /**
   * Get conversionFactor
   * @return conversionFactor
  **/
  @ApiModelProperty(value = "")


  public String getConversionFactor() {
    return conversionFactor;
  }

  public void setConversionFactor(String conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public Product dataUOM(String dataUOM) {
    this.dataUOM = dataUOM;
    return this;
  }

  /**
   * Get dataUOM
   * @return dataUOM
  **/
  @ApiModelProperty(value = "")


  public String getDataUOM() {
    return dataUOM;
  }

  public void setDataUOM(String dataUOM) {
    this.dataUOM = dataUOM;
  }

  public Product dataValue(String dataValue) {
    this.dataValue = dataValue;
    return this;
  }

  /**
   * Get dataValue
   * @return dataValue
  **/
  @ApiModelProperty(value = "")


  public String getDataValue() {
    return dataValue;
  }

  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }

  public Product deliveryClassification(String deliveryClassification) {
    this.deliveryClassification = deliveryClassification;
    return this;
  }

  /**
   * Get deliveryClassification
   * @return deliveryClassification
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryClassification() {
    return deliveryClassification;
  }

  public void setDeliveryClassification(String deliveryClassification) {
    this.deliveryClassification = deliveryClassification;
  }

  public Product deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public Product deliveryOnWeekend(String deliveryOnWeekend) {
    this.deliveryOnWeekend = deliveryOnWeekend;
    return this;
  }

  /**
   * Get deliveryOnWeekend
   * @return deliveryOnWeekend
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryOnWeekend() {
    return deliveryOnWeekend;
  }

  public void setDeliveryOnWeekend(String deliveryOnWeekend) {
    this.deliveryOnWeekend = deliveryOnWeekend;
  }

  public Product deliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
    return this;
  }

  /**
   * Get deliveryPartner
   * @return deliveryPartner
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryPartner() {
    return deliveryPartner;
  }

  public void setDeliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
  }

  public Product discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Product discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * Get discountType
   * @return discountType
  **/
  @ApiModelProperty(value = "")


  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  public Product displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Product display name as defined catalogue
   * @return displayName
  **/
  @ApiModelProperty(value = "Product display name as defined catalogue")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Product displayUOM(String displayUOM) {
    this.displayUOM = displayUOM;
    return this;
  }

  /**
   * Get displayUOM
   * @return displayUOM
  **/
  @ApiModelProperty(value = "")


  public String getDisplayUOM() {
    return displayUOM;
  }

  public void setDisplayUOM(String displayUOM) {
    this.displayUOM = displayUOM;
  }

  public Product duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * duration of the product
   * @return duration
  **/
  @ApiModelProperty(value = "duration of the product")


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Product durationUOM(String durationUOM) {
    this.durationUOM = durationUOM;
    return this;
  }

  /**
   * UOM of duration
   * @return durationUOM
  **/
  @ApiModelProperty(value = "UOM of duration")


  public String getDurationUOM() {
    return durationUOM;
  }

  public void setDurationUOM(String durationUOM) {
    this.durationUOM = durationUOM;
  }

  public Product eligibiltiySubflow(String eligibiltiySubflow) {
    this.eligibiltiySubflow = eligibiltiySubflow;
    return this;
  }

  /**
   * Get eligibiltiySubflow
   * @return eligibiltiySubflow
  **/
  @ApiModelProperty(value = "")


  public String getEligibiltiySubflow() {
    return eligibiltiySubflow;
  }

  public void setEligibiltiySubflow(String eligibiltiySubflow) {
    this.eligibiltiySubflow = eligibiltiySubflow;
  }

  public Product equipmentMake(String equipmentMake) {
    this.equipmentMake = equipmentMake;
    return this;
  }

  /**
   * Get equipmentMake
   * @return equipmentMake
  **/
  @ApiModelProperty(value = "")


  public String getEquipmentMake() {
    return equipmentMake;
  }

  public void setEquipmentMake(String equipmentMake) {
    this.equipmentMake = equipmentMake;
  }

  public Product equipmentModel(String equipmentModel) {
    this.equipmentModel = equipmentModel;
    return this;
  }

  /**
   * Get equipmentModel
   * @return equipmentModel
  **/
  @ApiModelProperty(value = "")


  public String getEquipmentModel() {
    return equipmentModel;
  }

  public void setEquipmentModel(String equipmentModel) {
    this.equipmentModel = equipmentModel;
  }

  public Product estDeliveryDate(String estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * Get estDeliveryDate
   * @return estDeliveryDate
  **/
  @ApiModelProperty(value = "")


  public String getEstDeliveryDate() {
    return estDeliveryDate;
  }

  public void setEstDeliveryDate(String estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }

  public Product etdataUOM(String etdataUOM) {
    this.etdataUOM = etdataUOM;
    return this;
  }

  /**
   * Get etdataUOM
   * @return etdataUOM
  **/
  @ApiModelProperty(value = "")


  public String getEtdataUOM() {
    return etdataUOM;
  }

  public void setEtdataUOM(String etdataUOM) {
    this.etdataUOM = etdataUOM;
  }

  public Product etdataValue(String etdataValue) {
    this.etdataValue = etdataValue;
    return this;
  }

  /**
   * Get etdataValue
   * @return etdataValue
  **/
  @ApiModelProperty(value = "")


  public String getEtdataValue() {
    return etdataValue;
  }

  public void setEtdataValue(String etdataValue) {
    this.etdataValue = etdataValue;
  }

  public Product europeanRoamingDataUOM(String europeanRoamingDataUOM) {
    this.europeanRoamingDataUOM = europeanRoamingDataUOM;
    return this;
  }

  /**
   * Get europeanRoamingDataUOM
   * @return europeanRoamingDataUOM
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingDataUOM() {
    return europeanRoamingDataUOM;
  }

  public void setEuropeanRoamingDataUOM(String europeanRoamingDataUOM) {
    this.europeanRoamingDataUOM = europeanRoamingDataUOM;
  }

  public Product europeanRoamingDataValue(String europeanRoamingDataValue) {
    this.europeanRoamingDataValue = europeanRoamingDataValue;
    return this;
  }

  /**
   * Get europeanRoamingDataValue
   * @return europeanRoamingDataValue
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingDataValue() {
    return europeanRoamingDataValue;
  }

  public void setEuropeanRoamingDataValue(String europeanRoamingDataValue) {
    this.europeanRoamingDataValue = europeanRoamingDataValue;
  }

  public Product europeanRoamingMinutesUOM(String europeanRoamingMinutesUOM) {
    this.europeanRoamingMinutesUOM = europeanRoamingMinutesUOM;
    return this;
  }

  /**
   * Get europeanRoamingMinutesUOM
   * @return europeanRoamingMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingMinutesUOM() {
    return europeanRoamingMinutesUOM;
  }

  public void setEuropeanRoamingMinutesUOM(String europeanRoamingMinutesUOM) {
    this.europeanRoamingMinutesUOM = europeanRoamingMinutesUOM;
  }

  public Product europeanRoamingMinutesValue(String europeanRoamingMinutesValue) {
    this.europeanRoamingMinutesValue = europeanRoamingMinutesValue;
    return this;
  }

  /**
   * Get europeanRoamingMinutesValue
   * @return europeanRoamingMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingMinutesValue() {
    return europeanRoamingMinutesValue;
  }

  public void setEuropeanRoamingMinutesValue(String europeanRoamingMinutesValue) {
    this.europeanRoamingMinutesValue = europeanRoamingMinutesValue;
  }

  public Product europeanRoamingPictureMessagesUOM(String europeanRoamingPictureMessagesUOM) {
    this.europeanRoamingPictureMessagesUOM = europeanRoamingPictureMessagesUOM;
    return this;
  }

  /**
   * Get europeanRoamingPictureMessagesUOM
   * @return europeanRoamingPictureMessagesUOM
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingPictureMessagesUOM() {
    return europeanRoamingPictureMessagesUOM;
  }

  public void setEuropeanRoamingPictureMessagesUOM(String europeanRoamingPictureMessagesUOM) {
    this.europeanRoamingPictureMessagesUOM = europeanRoamingPictureMessagesUOM;
  }

  public Product europeanRoamingPictureMessagesValue(String europeanRoamingPictureMessagesValue) {
    this.europeanRoamingPictureMessagesValue = europeanRoamingPictureMessagesValue;
    return this;
  }

  /**
   * Get europeanRoamingPictureMessagesValue
   * @return europeanRoamingPictureMessagesValue
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingPictureMessagesValue() {
    return europeanRoamingPictureMessagesValue;
  }

  public void setEuropeanRoamingPictureMessagesValue(String europeanRoamingPictureMessagesValue) {
    this.europeanRoamingPictureMessagesValue = europeanRoamingPictureMessagesValue;
  }

  public Product europeanRoamingTextsUOM(String europeanRoamingTextsUOM) {
    this.europeanRoamingTextsUOM = europeanRoamingTextsUOM;
    return this;
  }

  /**
   * Get europeanRoamingTextsUOM
   * @return europeanRoamingTextsUOM
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingTextsUOM() {
    return europeanRoamingTextsUOM;
  }

  public void setEuropeanRoamingTextsUOM(String europeanRoamingTextsUOM) {
    this.europeanRoamingTextsUOM = europeanRoamingTextsUOM;
  }

  public Product europeanRoamingTextsValue(String europeanRoamingTextsValue) {
    this.europeanRoamingTextsValue = europeanRoamingTextsValue;
    return this;
  }

  /**
   * Get europeanRoamingTextsValue
   * @return europeanRoamingTextsValue
  **/
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingTextsValue() {
    return europeanRoamingTextsValue;
  }

  public void setEuropeanRoamingTextsValue(String europeanRoamingTextsValue) {
    this.europeanRoamingTextsValue = europeanRoamingTextsValue;
  }

  public Product extraimeuandrowUOM(String extraimeuandrowUOM) {
    this.extraimeuandrowUOM = extraimeuandrowUOM;
    return this;
  }

  /**
   * Get extraimeuandrowUOM
   * @return extraimeuandrowUOM
  **/
  @ApiModelProperty(value = "")


  public String getExtraimeuandrowUOM() {
    return extraimeuandrowUOM;
  }

  public void setExtraimeuandrowUOM(String extraimeuandrowUOM) {
    this.extraimeuandrowUOM = extraimeuandrowUOM;
  }

  public Product extraimeuandrowValue(String extraimeuandrowValue) {
    this.extraimeuandrowValue = extraimeuandrowValue;
    return this;
  }

  /**
   * Get extraimeuandrowValue
   * @return extraimeuandrowValue
  **/
  @ApiModelProperty(value = "")


  public String getExtraimeuandrowValue() {
    return extraimeuandrowValue;
  }

  public void setExtraimeuandrowValue(String extraimeuandrowValue) {
    this.extraimeuandrowValue = extraimeuandrowValue;
  }

  public Product extraimeuandusUOM(String extraimeuandusUOM) {
    this.extraimeuandusUOM = extraimeuandusUOM;
    return this;
  }

  /**
   * Get extraimeuandusUOM
   * @return extraimeuandusUOM
  **/
  @ApiModelProperty(value = "")


  public String getExtraimeuandusUOM() {
    return extraimeuandusUOM;
  }

  public void setExtraimeuandusUOM(String extraimeuandusUOM) {
    this.extraimeuandusUOM = extraimeuandusUOM;
  }

  public Product extraimeuandusValue(String extraimeuandusValue) {
    this.extraimeuandusValue = extraimeuandusValue;
    return this;
  }

  /**
   * Get extraimeuandusValue
   * @return extraimeuandusValue
  **/
  @ApiModelProperty(value = "")


  public String getExtraimeuandusValue() {
    return extraimeuandusValue;
  }

  public void setExtraimeuandusValue(String extraimeuandusValue) {
    this.extraimeuandusValue = extraimeuandusValue;
  }

  public Product globalRoamingDataUOM(String globalRoamingDataUOM) {
    this.globalRoamingDataUOM = globalRoamingDataUOM;
    return this;
  }

  /**
   * Get globalRoamingDataUOM
   * @return globalRoamingDataUOM
  **/
  @ApiModelProperty(value = "")


  public String getGlobalRoamingDataUOM() {
    return globalRoamingDataUOM;
  }

  public void setGlobalRoamingDataUOM(String globalRoamingDataUOM) {
    this.globalRoamingDataUOM = globalRoamingDataUOM;
  }

  public Product globalRoamingDataValue(String globalRoamingDataValue) {
    this.globalRoamingDataValue = globalRoamingDataValue;
    return this;
  }

  /**
   * Get globalRoamingDataValue
   * @return globalRoamingDataValue
  **/
  @ApiModelProperty(value = "")


  public String getGlobalRoamingDataValue() {
    return globalRoamingDataValue;
  }

  public void setGlobalRoamingDataValue(String globalRoamingDataValue) {
    this.globalRoamingDataValue = globalRoamingDataValue;
  }

  public Product globalRoamingMinutesUOM(String globalRoamingMinutesUOM) {
    this.globalRoamingMinutesUOM = globalRoamingMinutesUOM;
    return this;
  }

  /**
   * Get globalRoamingMinutesUOM
   * @return globalRoamingMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getGlobalRoamingMinutesUOM() {
    return globalRoamingMinutesUOM;
  }

  public void setGlobalRoamingMinutesUOM(String globalRoamingMinutesUOM) {
    this.globalRoamingMinutesUOM = globalRoamingMinutesUOM;
  }

  public Product globalRoamingMinutesValue(String globalRoamingMinutesValue) {
    this.globalRoamingMinutesValue = globalRoamingMinutesValue;
    return this;
  }

  /**
   * Get globalRoamingMinutesValue
   * @return globalRoamingMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getGlobalRoamingMinutesValue() {
    return globalRoamingMinutesValue;
  }

  public void setGlobalRoamingMinutesValue(String globalRoamingMinutesValue) {
    this.globalRoamingMinutesValue = globalRoamingMinutesValue;
  }

  public Product globalRoamingTextsUOM(String globalRoamingTextsUOM) {
    this.globalRoamingTextsUOM = globalRoamingTextsUOM;
    return this;
  }

  /**
   * Get globalRoamingTextsUOM
   * @return globalRoamingTextsUOM
  **/
  @ApiModelProperty(value = "")


  public String getGlobalRoamingTextsUOM() {
    return globalRoamingTextsUOM;
  }

  public void setGlobalRoamingTextsUOM(String globalRoamingTextsUOM) {
    this.globalRoamingTextsUOM = globalRoamingTextsUOM;
  }

  public Product globalRoamingTextsValue(String globalRoamingTextsValue) {
    this.globalRoamingTextsValue = globalRoamingTextsValue;
    return this;
  }

  /**
   * Get globalRoamingTextsValue
   * @return globalRoamingTextsValue
  **/
  @ApiModelProperty(value = "")


  public String getGlobalRoamingTextsValue() {
    return globalRoamingTextsValue;
  }

  public void setGlobalRoamingTextsValue(String globalRoamingTextsValue) {
    this.globalRoamingTextsValue = globalRoamingTextsValue;
  }

  public Product helptext(String helptext) {
    this.helptext = helptext;
    return this;
  }

  /**
   * Get helptext
   * @return helptext
  **/
  @ApiModelProperty(value = "")


  public String getHelptext() {
    return helptext;
  }

  public void setHelptext(String helptext) {
    this.helptext = helptext;
  }

  public Product helpurl(String helpurl) {
    this.helpurl = helpurl;
    return this;
  }

  /**
   * Get helpurl
   * @return helpurl
  **/
  @ApiModelProperty(value = "")


  public String getHelpurl() {
    return helpurl;
  }

  public void setHelpurl(String helpurl) {
    this.helpurl = helpurl;
  }

  public Product imageURLsFullBack(String imageURLsFullBack) {
    this.imageURLsFullBack = imageURLsFullBack;
    return this;
  }

  /**
   * Get imageURLsFullBack
   * @return imageURLsFullBack
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsFullBack() {
    return imageURLsFullBack;
  }

  public void setImageURLsFullBack(String imageURLsFullBack) {
    this.imageURLsFullBack = imageURLsFullBack;
  }

  public Product imageURLsFullHero(String imageURLsFullHero) {
    this.imageURLsFullHero = imageURLsFullHero;
    return this;
  }

  /**
   * Get imageURLsFullHero
   * @return imageURLsFullHero
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsFullHero() {
    return imageURLsFullHero;
  }

  public void setImageURLsFullHero(String imageURLsFullHero) {
    this.imageURLsFullHero = imageURLsFullHero;
  }

  public Product imageURLsFullLeft(String imageURLsFullLeft) {
    this.imageURLsFullLeft = imageURLsFullLeft;
    return this;
  }

  /**
   * Get imageURLsFullLeft
   * @return imageURLsFullLeft
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsFullLeft() {
    return imageURLsFullLeft;
  }

  public void setImageURLsFullLeft(String imageURLsFullLeft) {
    this.imageURLsFullLeft = imageURLsFullLeft;
  }

  public Product imageURLsFullRight(String imageURLsFullRight) {
    this.imageURLsFullRight = imageURLsFullRight;
    return this;
  }

  /**
   * Get imageURLsFullRight
   * @return imageURLsFullRight
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsFullRight() {
    return imageURLsFullRight;
  }

  public void setImageURLsFullRight(String imageURLsFullRight) {
    this.imageURLsFullRight = imageURLsFullRight;
  }

  public Product imageURLsFullSide(String imageURLsFullSide) {
    this.imageURLsFullSide = imageURLsFullSide;
    return this;
  }

  /**
   * Get imageURLsFullSide
   * @return imageURLsFullSide
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsFullSide() {
    return imageURLsFullSide;
  }

  public void setImageURLsFullSide(String imageURLsFullSide) {
    this.imageURLsFullSide = imageURLsFullSide;
  }

  public Product imageURLsGrid(String imageURLsGrid) {
    this.imageURLsGrid = imageURLsGrid;
    return this;
  }

  /**
   * Get imageURLsGrid
   * @return imageURLsGrid
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsGrid() {
    return imageURLsGrid;
  }

  public void setImageURLsGrid(String imageURLsGrid) {
    this.imageURLsGrid = imageURLsGrid;
  }

  public Product imageURLsIcon(String imageURLsIcon) {
    this.imageURLsIcon = imageURLsIcon;
    return this;
  }

  /**
   * Get imageURLsIcon
   * @return imageURLsIcon
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsIcon() {
    return imageURLsIcon;
  }

  public void setImageURLsIcon(String imageURLsIcon) {
    this.imageURLsIcon = imageURLsIcon;
  }

  public Product imageURLsSmall(String imageURLsSmall) {
    this.imageURLsSmall = imageURLsSmall;
    return this;
  }

  /**
   * Get imageURLsSmall
   * @return imageURLsSmall
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsSmall() {
    return imageURLsSmall;
  }

  public void setImageURLsSmall(String imageURLsSmall) {
    this.imageURLsSmall = imageURLsSmall;
  }

  public Product imageURLsSticker(String imageURLsSticker) {
    this.imageURLsSticker = imageURLsSticker;
    return this;
  }

  /**
   * Get imageURLsSticker
   * @return imageURLsSticker
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsSticker() {
    return imageURLsSticker;
  }

  public void setImageURLsSticker(String imageURLsSticker) {
    this.imageURLsSticker = imageURLsSticker;
  }

  public Product imageURLsThumbsFront(String imageURLsThumbsFront) {
    this.imageURLsThumbsFront = imageURLsThumbsFront;
    return this;
  }

  /**
   * Product thumbnail image URL imageURLs.thumbs.front
   * @return imageURLsThumbsFront
  **/
  @ApiModelProperty(value = "Product thumbnail image URL imageURLs.thumbs.front")


  public String getImageURLsThumbsFront() {
    return imageURLsThumbsFront;
  }

  public void setImageURLsThumbsFront(String imageURLsThumbsFront) {
    this.imageURLsThumbsFront = imageURLsThumbsFront;
  }

  public Product imageURLsThumbsLeft(String imageURLsThumbsLeft) {
    this.imageURLsThumbsLeft = imageURLsThumbsLeft;
    return this;
  }

  /**
   * Get imageURLsThumbsLeft
   * @return imageURLsThumbsLeft
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsThumbsLeft() {
    return imageURLsThumbsLeft;
  }

  public void setImageURLsThumbsLeft(String imageURLsThumbsLeft) {
    this.imageURLsThumbsLeft = imageURLsThumbsLeft;
  }

  public Product imageURLsThumbsRight(String imageURLsThumbsRight) {
    this.imageURLsThumbsRight = imageURLsThumbsRight;
    return this;
  }

  /**
   * Get imageURLsThumbsRight
   * @return imageURLsThumbsRight
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsThumbsRight() {
    return imageURLsThumbsRight;
  }

  public void setImageURLsThumbsRight(String imageURLsThumbsRight) {
    this.imageURLsThumbsRight = imageURLsThumbsRight;
  }

  public Product imageURLsThumbsSide(String imageURLsThumbsSide) {
    this.imageURLsThumbsSide = imageURLsThumbsSide;
    return this;
  }

  /**
   * Get imageURLsThumbsSide
   * @return imageURLsThumbsSide
  **/
  @ApiModelProperty(value = "")


  public String getImageURLsThumbsSide() {
    return imageURLsThumbsSide;
  }

  public void setImageURLsThumbsSide(String imageURLsThumbsSide) {
    this.imageURLsThumbsSide = imageURLsThumbsSide;
  }

  public Product inTheBox(String inTheBox) {
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

  public Product internationalMinutesUOM(String internationalMinutesUOM) {
    this.internationalMinutesUOM = internationalMinutesUOM;
    return this;
  }

  /**
   * Get internationalMinutesUOM
   * @return internationalMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getInternationalMinutesUOM() {
    return internationalMinutesUOM;
  }

  public void setInternationalMinutesUOM(String internationalMinutesUOM) {
    this.internationalMinutesUOM = internationalMinutesUOM;
  }

  public Product internationalMinutesValue(String internationalMinutesValue) {
    this.internationalMinutesValue = internationalMinutesValue;
    return this;
  }

  /**
   * Get internationalMinutesValue
   * @return internationalMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getInternationalMinutesValue() {
    return internationalMinutesValue;
  }

  public void setInternationalMinutesValue(String internationalMinutesValue) {
    this.internationalMinutesValue = internationalMinutesValue;
  }

  public Product internationalTextsUOM(String internationalTextsUOM) {
    this.internationalTextsUOM = internationalTextsUOM;
    return this;
  }

  /**
   * Get internationalTextsUOM
   * @return internationalTextsUOM
  **/
  @ApiModelProperty(value = "")


  public String getInternationalTextsUOM() {
    return internationalTextsUOM;
  }

  public void setInternationalTextsUOM(String internationalTextsUOM) {
    this.internationalTextsUOM = internationalTextsUOM;
  }

  public Product internationalTextsValue(String internationalTextsValue) {
    this.internationalTextsValue = internationalTextsValue;
    return this;
  }

  /**
   * international tests value
   * @return internationalTextsValue
  **/
  @ApiModelProperty(value = "international tests value")


  public String getInternationalTextsValue() {
    return internationalTextsValue;
  }

  public void setInternationalTextsValue(String internationalTextsValue) {
    this.internationalTextsValue = internationalTextsValue;
  }

  public Product isBattery(String isBattery) {
    this.isBattery = isBattery;
    return this;
  }

  /**
   * Get isBattery
   * @return isBattery
  **/
  @ApiModelProperty(value = "")


  public String getIsBattery() {
    return isBattery;
  }

  public void setIsBattery(String isBattery) {
    this.isBattery = isBattery;
  }

  public Product isDeviceProduct(String isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Get isDeviceProduct
   * @return isDeviceProduct
  **/
  @ApiModelProperty(value = "")


  public String getIsDeviceProduct() {
    return isDeviceProduct;
  }

  public void setIsDeviceProduct(String isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  public Product isDisplayableAcq(String isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
    return this;
  }

  /**
   * Get isDisplayableAcq
   * @return isDisplayableAcq
  **/
  @ApiModelProperty(value = "")


  public String getIsDisplayableAcq() {
    return isDisplayableAcq;
  }

  public void setIsDisplayableAcq(String isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
  }

  public Product isDisplayableEcare(String isDisplayableEcare) {
    this.isDisplayableEcare = isDisplayableEcare;
    return this;
  }

  /**
   * Get isDisplayableEcare
   * @return isDisplayableEcare
  **/
  @ApiModelProperty(value = "")


  public String getIsDisplayableEcare() {
    return isDisplayableEcare;
  }

  public void setIsDisplayableEcare(String isDisplayableEcare) {
    this.isDisplayableEcare = isDisplayableEcare;
  }

  public Product isDisplayableRet(String isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
    return this;
  }

  /**
   * Get isDisplayableRet
   * @return isDisplayableRet
  **/
  @ApiModelProperty(value = "")


  public String getIsDisplayableRet() {
    return isDisplayableRet;
  }

  public void setIsDisplayableRet(String isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
  }

  public Product isDisplaybaleSavedBasket(String isDisplaybaleSavedBasket) {
    this.isDisplaybaleSavedBasket = isDisplaybaleSavedBasket;
    return this;
  }

  /**
   * Get isDisplaybaleSavedBasket
   * @return isDisplaybaleSavedBasket
  **/
  @ApiModelProperty(value = "")


  public String getIsDisplaybaleSavedBasket() {
    return isDisplaybaleSavedBasket;
  }

  public void setIsDisplaybaleSavedBasket(String isDisplaybaleSavedBasket) {
    this.isDisplaybaleSavedBasket = isDisplaybaleSavedBasket;
  }

  public Product isSellableAcq(String isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
    return this;
  }

  /**
   * Get isSellableAcq
   * @return isSellableAcq
  **/
  @ApiModelProperty(value = "")


  public String getIsSellableAcq() {
    return isSellableAcq;
  }

  public void setIsSellableAcq(String isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
  }

  public Product isSellableECare(String isSellableECare) {
    this.isSellableECare = isSellableECare;
    return this;
  }

  /**
   * Get isSellableECare
   * @return isSellableECare
  **/
  @ApiModelProperty(value = "")


  public String getIsSellableECare() {
    return isSellableECare;
  }

  public void setIsSellableECare(String isSellableECare) {
    this.isSellableECare = isSellableECare;
  }

  public Product isSellableRet(String isSellableRet) {
    this.isSellableRet = isSellableRet;
    return this;
  }

  /**
   * Get isSellableRet
   * @return isSellableRet
  **/
  @ApiModelProperty(value = "")


  public String getIsSellableRet() {
    return isSellableRet;
  }

  public void setIsSellableRet(String isSellableRet) {
    this.isSellableRet = isSellableRet;
  }

  public Product isServicesProduct(String isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * boolean value to verify if it is service product
   * @return isServicesProduct
  **/
  @ApiModelProperty(value = "boolean value to verify if it is service product")


  public String getIsServicesProduct() {
    return isServicesProduct;
  }

  public void setIsServicesProduct(String isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  public Product landlineMinutesUOM(String landlineMinutesUOM) {
    this.landlineMinutesUOM = landlineMinutesUOM;
    return this;
  }

  /**
   * Get landlineMinutesUOM
   * @return landlineMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getLandlineMinutesUOM() {
    return landlineMinutesUOM;
  }

  public void setLandlineMinutesUOM(String landlineMinutesUOM) {
    this.landlineMinutesUOM = landlineMinutesUOM;
  }

  public Product landlineMinutesValue(String landlineMinutesValue) {
    this.landlineMinutesValue = landlineMinutesValue;
    return this;
  }

  /**
   * Get landlineMinutesValue
   * @return landlineMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getLandlineMinutesValue() {
    return landlineMinutesValue;
  }

  public void setLandlineMinutesValue(String landlineMinutesValue) {
    this.landlineMinutesValue = landlineMinutesValue;
  }

  public Product leadPlanId(String leadPlanId) {
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

  public Product listOfCompatibleBundles(List<String> listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
    return this;
  }

  public Product addListOfCompatibleBundlesItem(String listOfCompatibleBundlesItem) {
    if (this.listOfCompatibleBundles == null) {
      this.listOfCompatibleBundles = new ArrayList<>();
    }
    this.listOfCompatibleBundles.add(listOfCompatibleBundlesItem);
    return this;
  }

  /**
   * Get listOfCompatibleBundles
   * @return listOfCompatibleBundles
  **/
  @ApiModelProperty(value = "")


  public List<String> getListOfCompatibleBundles() {
    return listOfCompatibleBundles;
  }

  public void setListOfCompatibleBundles(List<String> listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
  }

  public Product mefProductName(String mefProductName) {
    this.mefProductName = mefProductName;
    return this;
  }

  /**
   * Get mefProductName
   * @return mefProductName
  **/
  @ApiModelProperty(value = "")


  public String getMefProductName() {
    return mefProductName;
  }

  public void setMefProductName(String mefProductName) {
    this.mefProductName = mefProductName;
  }

  public Product numReviews(String numReviews) {
    this.numReviews = numReviews;
    return this;
  }

  /**
   * Get numReviews
   * @return numReviews
  **/
  @ApiModelProperty(value = "")


  public String getNumReviews() {
    return numReviews;
  }

  public void setNumReviews(String numReviews) {
    this.numReviews = numReviews;
  }

  public Product order(String order) {
    this.order = order;
    return this;
  }

  /**
   * order id of the product
   * @return order
  **/
  @ApiModelProperty(value = "order id of the product")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public Product parentProductId(String parentProductId) {
    this.parentProductId = parentProductId;
    return this;
  }

  /**
   * parent product id
   * @return parentProductId
  **/
  @ApiModelProperty(value = "parent product id")


  public String getParentProductId() {
    return parentProductId;
  }

  public void setParentProductId(String parentProductId) {
    this.parentProductId = parentProductId;
  }

  public Product pdGrpCmpAcc(String pdGrpCmpAcc) {
    this.pdGrpCmpAcc = pdGrpCmpAcc;
    return this;
  }

  /**
   * Get pdGrpCmpAcc
   * @return pdGrpCmpAcc
  **/
  @ApiModelProperty(value = "")


  public String getPdGrpCmpAcc() {
    return pdGrpCmpAcc;
  }

  public void setPdGrpCmpAcc(String pdGrpCmpAcc) {
    this.pdGrpCmpAcc = pdGrpCmpAcc;
  }

  public Product pdGrpRecAcc(String pdGrpRecAcc) {
    this.pdGrpRecAcc = pdGrpRecAcc;
    return this;
  }

  /**
   * Get pdGrpRecAcc
   * @return pdGrpRecAcc
  **/
  @ApiModelProperty(value = "")


  public String getPdGrpRecAcc() {
    return pdGrpRecAcc;
  }

  public void setPdGrpRecAcc(String pdGrpRecAcc) {
    this.pdGrpRecAcc = pdGrpRecAcc;
  }

  public Product pdGrpRecExtr(String pdGrpRecExtr) {
    this.pdGrpRecExtr = pdGrpRecExtr;
    return this;
  }

  /**
   * Get pdGrpRecExtr
   * @return pdGrpRecExtr
  **/
  @ApiModelProperty(value = "")


  public String getPdGrpRecExtr() {
    return pdGrpRecExtr;
  }

  public void setPdGrpRecExtr(String pdGrpRecExtr) {
    this.pdGrpRecExtr = pdGrpRecExtr;
  }

  public Product pdGrpvariant(String pdGrpvariant) {
    this.pdGrpvariant = pdGrpvariant;
    return this;
  }

  /**
   * Get pdGrpvariant
   * @return pdGrpvariant
  **/
  @ApiModelProperty(value = "")


  public String getPdGrpvariant() {
    return pdGrpvariant;
  }

  public void setPdGrpvariant(String pdGrpvariant) {
    this.pdGrpvariant = pdGrpvariant;
  }

  public Product pictureMessagesUOM(String pictureMessagesUOM) {
    this.pictureMessagesUOM = pictureMessagesUOM;
    return this;
  }

  /**
   * Get pictureMessagesUOM
   * @return pictureMessagesUOM
  **/
  @ApiModelProperty(value = "")


  public String getPictureMessagesUOM() {
    return pictureMessagesUOM;
  }

  public void setPictureMessagesUOM(String pictureMessagesUOM) {
    this.pictureMessagesUOM = pictureMessagesUOM;
  }

  public Product postDesc(String postDesc) {
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

  public Product postDescMobile(String postDescMobile) {
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

  public Product preDesc(String preDesc) {
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

  public Product preDescMobile(String preDescMobile) {
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

  public Product preOrderable(String preOrderable) {
    this.preOrderable = preOrderable;
    return this;
  }

  /**
   * Get preOrderable
   * @return preOrderable
  **/
  @ApiModelProperty(value = "")


  public String getPreOrderable() {
    return preOrderable;
  }

  public void setPreOrderable(String preOrderable) {
    this.preOrderable = preOrderable;
  }

  public Product priceGrossOVR(String priceGrossOVR) {
    this.priceGrossOVR = priceGrossOVR;
    return this;
  }

  /**
   * Get priceGrossOVR
   * @return priceGrossOVR
  **/
  @ApiModelProperty(value = "")


  public String getPriceGrossOVR() {
    return priceGrossOVR;
  }

  public void setPriceGrossOVR(String priceGrossOVR) {
    this.priceGrossOVR = priceGrossOVR;
  }

  public Product priceNetOVR(String priceNetOVR) {
    this.priceNetOVR = priceNetOVR;
    return this;
  }

  /**
   * Get priceNetOVR
   * @return priceNetOVR
  **/
  @ApiModelProperty(value = "")


  public String getPriceNetOVR() {
    return priceNetOVR;
  }

  public void setPriceNetOVR(String priceNetOVR) {
    this.priceNetOVR = priceNetOVR;
  }

  public Product priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
  **/
  @ApiModelProperty(value = "")


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public Product priceVatOVR(String priceVatOVR) {
    this.priceVatOVR = priceVatOVR;
    return this;
  }

  /**
   * Get priceVatOVR
   * @return priceVatOVR
  **/
  @ApiModelProperty(value = "")


  public String getPriceVatOVR() {
    return priceVatOVR;
  }

  public void setPriceVatOVR(String priceVatOVR) {
    this.priceVatOVR = priceVatOVR;
  }

  public Product productClass(String productClass) {
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

  public Product productEndDate(String productEndDate) {
    this.productEndDate = productEndDate;
    return this;
  }

  /**
   * product end date
   * @return productEndDate
  **/
  @ApiModelProperty(value = "product end date")


  public String getProductEndDate() {
    return productEndDate;
  }

  public void setProductEndDate(String productEndDate) {
    this.productEndDate = productEndDate;
  }

  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product ID
   * @return productId
  **/
  @ApiModelProperty(value = "Product ID")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Product name as defined catalogue
   * @return productName
  **/
  @ApiModelProperty(value = "Product name as defined catalogue")


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Product productStartDate(String productStartDate) {
    this.productStartDate = productStartDate;
    return this;
  }

  /**
   * product start date
   * @return productStartDate
  **/
  @ApiModelProperty(value = "product start date")


  public String getProductStartDate() {
    return productStartDate;
  }

  public void setProductStartDate(String productStartDate) {
    this.productStartDate = productStartDate;
  }

  public Product productSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
    return this;
  }

  /**
   * Get productSubClass
   * @return productSubClass
  **/
  @ApiModelProperty(value = "")


  public String getProductSubClass() {
    return productSubClass;
  }

  public void setProductSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
  }

  public Product productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Product rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Product roamingDataUOM(String roamingDataUOM) {
    this.roamingDataUOM = roamingDataUOM;
    return this;
  }

  /**
   * Get roamingDataUOM
   * @return roamingDataUOM
  **/
  @ApiModelProperty(value = "")


  public String getRoamingDataUOM() {
    return roamingDataUOM;
  }

  public void setRoamingDataUOM(String roamingDataUOM) {
    this.roamingDataUOM = roamingDataUOM;
  }

  public Product roamingDataValue(String roamingDataValue) {
    this.roamingDataValue = roamingDataValue;
    return this;
  }

  /**
   * Get roamingDataValue
   * @return roamingDataValue
  **/
  @ApiModelProperty(value = "")


  public String getRoamingDataValue() {
    return roamingDataValue;
  }

  public void setRoamingDataValue(String roamingDataValue) {
    this.roamingDataValue = roamingDataValue;
  }

  public Product salesExpired(String salesExpired) {
    this.salesExpired = salesExpired;
    return this;
  }

  /**
   * sales expiry details
   * @return salesExpired
  **/
  @ApiModelProperty(value = "sales expiry details")


  public String getSalesExpired() {
    return salesExpired;
  }

  public void setSalesExpired(String salesExpired) {
    this.salesExpired = salesExpired;
  }

  public Product seoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
    return this;
  }

  /**
   * Get seoCanonical
   * @return seoCanonical
  **/
  @ApiModelProperty(value = "")


  public String getSeoCanonical() {
    return seoCanonical;
  }

  public void setSeoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
  }

  public Product seoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
    return this;
  }

  /**
   * Get seoIndex
   * @return seoIndex
  **/
  @ApiModelProperty(value = "")


  public String getSeoIndex() {
    return seoIndex;
  }

  public void setSeoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
  }

  public Product seoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
    return this;
  }

  /**
   * Get seoKeywords
   * @return seoKeywords
  **/
  @ApiModelProperty(value = "")


  public String getSeoKeywords() {
    return seoKeywords;
  }

  public void setSeoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
  }

  public Product support(String support) {
    this.support = support;
    return this;
  }

  /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")


  public String getSupport() {
    return support;
  }

  public void setSupport(String support) {
    this.support = support;
  }

  public Product threeDSpin(String threeDSpin) {
    this.threeDSpin = threeDSpin;
    return this;
  }

  /**
   * Get threeDSpin
   * @return threeDSpin
  **/
  @ApiModelProperty(value = "")


  public String getThreeDSpin() {
    return threeDSpin;
  }

  public void setThreeDSpin(String threeDSpin) {
    this.threeDSpin = threeDSpin;
  }

  public Product tilUOM(String tilUOM) {
    this.tilUOM = tilUOM;
    return this;
  }

  /**
   * Get tilUOM
   * @return tilUOM
  **/
  @ApiModelProperty(value = "")


  public String getTilUOM() {
    return tilUOM;
  }

  public void setTilUOM(String tilUOM) {
    this.tilUOM = tilUOM;
  }

  public Product type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Product uKANDInternationalCreditUOM(String uKANDInternationalCreditUOM) {
    this.uKANDInternationalCreditUOM = uKANDInternationalCreditUOM;
    return this;
  }

  /**
   * Get uKANDInternationalCreditUOM
   * @return uKANDInternationalCreditUOM
  **/
  @ApiModelProperty(value = "")


  public String getUKANDInternationalCreditUOM() {
    return uKANDInternationalCreditUOM;
  }

  public void setUKANDInternationalCreditUOM(String uKANDInternationalCreditUOM) {
    this.uKANDInternationalCreditUOM = uKANDInternationalCreditUOM;
  }

  public Product uKANDInternationalCreditValue(String uKANDInternationalCreditValue) {
    this.uKANDInternationalCreditValue = uKANDInternationalCreditValue;
    return this;
  }

  /**
   * Get uKANDInternationalCreditValue
   * @return uKANDInternationalCreditValue
  **/
  @ApiModelProperty(value = "")


  public String getUKANDInternationalCreditValue() {
    return uKANDInternationalCreditValue;
  }

  public void setUKANDInternationalCreditValue(String uKANDInternationalCreditValue) {
    this.uKANDInternationalCreditValue = uKANDInternationalCreditValue;
  }

  public Product uKmobileMinutesUOM(String uKmobileMinutesUOM) {
    this.uKmobileMinutesUOM = uKmobileMinutesUOM;
    return this;
  }

  /**
   * Get uKmobileMinutesUOM
   * @return uKmobileMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getUKmobileMinutesUOM() {
    return uKmobileMinutesUOM;
  }

  public void setUKmobileMinutesUOM(String uKmobileMinutesUOM) {
    this.uKmobileMinutesUOM = uKmobileMinutesUOM;
  }

  public Product uKmobileMinutesValue(String uKmobileMinutesValue) {
    this.uKmobileMinutesValue = uKmobileMinutesValue;
    return this;
  }

  /**
   * Get uKmobileMinutesValue
   * @return uKmobileMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getUKmobileMinutesValue() {
    return uKmobileMinutesValue;
  }

  public void setUKmobileMinutesValue(String uKmobileMinutesValue) {
    this.uKmobileMinutesValue = uKmobileMinutesValue;
  }

  public Product ukDataUOM(String ukDataUOM) {
    this.ukDataUOM = ukDataUOM;
    return this;
  }

  /**
   * Get ukDataUOM
   * @return ukDataUOM
  **/
  @ApiModelProperty(value = "")


  public String getUkDataUOM() {
    return ukDataUOM;
  }

  public void setUkDataUOM(String ukDataUOM) {
    this.ukDataUOM = ukDataUOM;
  }

  public Product ukDataValue(String ukDataValue) {
    this.ukDataValue = ukDataValue;
    return this;
  }

  /**
   * Get ukDataValue
   * @return ukDataValue
  **/
  @ApiModelProperty(value = "")


  public String getUkDataValue() {
    return ukDataValue;
  }

  public void setUkDataValue(String ukDataValue) {
    this.ukDataValue = ukDataValue;
  }

  public Product ukMinutesUOM(String ukMinutesUOM) {
    this.ukMinutesUOM = ukMinutesUOM;
    return this;
  }

  /**
   * Get ukMinutesUOM
   * @return ukMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getUkMinutesUOM() {
    return ukMinutesUOM;
  }

  public void setUkMinutesUOM(String ukMinutesUOM) {
    this.ukMinutesUOM = ukMinutesUOM;
  }

  public Product ukMinutesValue(String ukMinutesValue) {
    this.ukMinutesValue = ukMinutesValue;
    return this;
  }

  /**
   * Get ukMinutesValue
   * @return ukMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getUkMinutesValue() {
    return ukMinutesValue;
  }

  public void setUkMinutesValue(String ukMinutesValue) {
    this.ukMinutesValue = ukMinutesValue;
  }

  public Product ukTextsUOM(String ukTextsUOM) {
    this.ukTextsUOM = ukTextsUOM;
    return this;
  }

  /**
   * Get ukTextsUOM
   * @return ukTextsUOM
  **/
  @ApiModelProperty(value = "")


  public String getUkTextsUOM() {
    return ukTextsUOM;
  }

  public void setUkTextsUOM(String ukTextsUOM) {
    this.ukTextsUOM = ukTextsUOM;
  }

  public Product ukTextsValue(String ukTextsValue) {
    this.ukTextsValue = ukTextsValue;
    return this;
  }

  /**
   * Get ukTextsValue
   * @return ukTextsValue
  **/
  @ApiModelProperty(value = "")


  public String getUkTextsValue() {
    return ukTextsValue;
  }

  public void setUkTextsValue(String ukTextsValue) {
    this.ukTextsValue = ukTextsValue;
  }

  public Product ukandinternationalCreditUOM(String ukandinternationalCreditUOM) {
    this.ukandinternationalCreditUOM = ukandinternationalCreditUOM;
    return this;
  }

  /**
   * Get ukandinternationalCreditUOM
   * @return ukandinternationalCreditUOM
  **/
  @ApiModelProperty(value = "")


  public String getUkandinternationalCreditUOM() {
    return ukandinternationalCreditUOM;
  }

  public void setUkandinternationalCreditUOM(String ukandinternationalCreditUOM) {
    this.ukandinternationalCreditUOM = ukandinternationalCreditUOM;
  }

  public Product ukandinternationalCreditValue(String ukandinternationalCreditValue) {
    this.ukandinternationalCreditValue = ukandinternationalCreditValue;
    return this;
  }

  /**
   * Get ukandinternationalCreditValue
   * @return ukandinternationalCreditValue
  **/
  @ApiModelProperty(value = "")


  public String getUkandinternationalCreditValue() {
    return ukandinternationalCreditValue;
  }

  public void setUkandinternationalCreditValue(String ukandinternationalCreditValue) {
    this.ukandinternationalCreditValue = ukandinternationalCreditValue;
  }

  public Product ukmobileMinutesUOM(String ukmobileMinutesUOM) {
    this.ukmobileMinutesUOM = ukmobileMinutesUOM;
    return this;
  }

  /**
   * Get ukmobileMinutesUOM
   * @return ukmobileMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getUkmobileMinutesUOM() {
    return ukmobileMinutesUOM;
  }

  public void setUkmobileMinutesUOM(String ukmobileMinutesUOM) {
    this.ukmobileMinutesUOM = ukmobileMinutesUOM;
  }

  public Product ukmobileMinutesValue(String ukmobileMinutesValue) {
    this.ukmobileMinutesValue = ukmobileMinutesValue;
    return this;
  }

  /**
   * Get ukmobileMinutesValue
   * @return ukmobileMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getUkmobileMinutesValue() {
    return ukmobileMinutesValue;
  }

  public void setUkmobileMinutesValue(String ukmobileMinutesValue) {
    this.ukmobileMinutesValue = ukmobileMinutesValue;
  }

  public Product video(String video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
  **/
  @ApiModelProperty(value = "")


  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public Product vodafoneVodafoneMinutesUOM(String vodafoneVodafoneMinutesUOM) {
    this.vodafoneVodafoneMinutesUOM = vodafoneVodafoneMinutesUOM;
    return this;
  }

  /**
   * Get vodafoneVodafoneMinutesUOM
   * @return vodafoneVodafoneMinutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneMinutesUOM() {
    return vodafoneVodafoneMinutesUOM;
  }

  public void setVodafoneVodafoneMinutesUOM(String vodafoneVodafoneMinutesUOM) {
    this.vodafoneVodafoneMinutesUOM = vodafoneVodafoneMinutesUOM;
  }

  public Product vodafoneVodafoneMinutesValue(String vodafoneVodafoneMinutesValue) {
    this.vodafoneVodafoneMinutesValue = vodafoneVodafoneMinutesValue;
    return this;
  }

  /**
   * Get vodafoneVodafoneMinutesValue
   * @return vodafoneVodafoneMinutesValue
  **/
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneMinutesValue() {
    return vodafoneVodafoneMinutesValue;
  }

  public void setVodafoneVodafoneMinutesValue(String vodafoneVodafoneMinutesValue) {
    this.vodafoneVodafoneMinutesValue = vodafoneVodafoneMinutesValue;
  }

  public Product vodafoneVodafoneUOM(String vodafoneVodafoneUOM) {
    this.vodafoneVodafoneUOM = vodafoneVodafoneUOM;
    return this;
  }

  /**
   * Get vodafoneVodafoneUOM
   * @return vodafoneVodafoneUOM
  **/
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneUOM() {
    return vodafoneVodafoneUOM;
  }

  public void setVodafoneVodafoneUOM(String vodafoneVodafoneUOM) {
    this.vodafoneVodafoneUOM = vodafoneVodafoneUOM;
  }

  public Product vodafoneVodafoneValue(String vodafoneVodafoneValue) {
    this.vodafoneVodafoneValue = vodafoneVodafoneValue;
    return this;
  }

  /**
   * Get vodafoneVodafoneValue
   * @return vodafoneVodafoneValue
  **/
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneValue() {
    return vodafoneVodafoneValue;
  }

  public void setVodafoneVodafoneValue(String vodafoneVodafoneValue) {
    this.vodafoneVodafoneValue = vodafoneVodafoneValue;
  }

  public Product vodafoneVodafonetextsUOM(String vodafoneVodafonetextsUOM) {
    this.vodafoneVodafonetextsUOM = vodafoneVodafonetextsUOM;
    return this;
  }

  /**
   * Get vodafoneVodafonetextsUOM
   * @return vodafoneVodafonetextsUOM
  **/
  @ApiModelProperty(value = "")


  public String getVodafoneVodafonetextsUOM() {
    return vodafoneVodafonetextsUOM;
  }

  public void setVodafoneVodafonetextsUOM(String vodafoneVodafonetextsUOM) {
    this.vodafoneVodafonetextsUOM = vodafoneVodafonetextsUOM;
  }

  public Product vodafoneVodafonetextsValue(String vodafoneVodafonetextsValue) {
    this.vodafoneVodafonetextsValue = vodafoneVodafonetextsValue;
    return this;
  }

  /**
   * Get vodafoneVodafonetextsValue
   * @return vodafoneVodafonetextsValue
  **/
  @ApiModelProperty(value = "")


  public String getVodafoneVodafonetextsValue() {
    return vodafoneVodafonetextsValue;
  }

  public void setVodafoneVodafonetextsValue(String vodafoneVodafonetextsValue) {
    this.vodafoneVodafonetextsValue = vodafoneVodafonetextsValue;
  }

  public Product warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Get warranty
   * @return warranty
  **/
  @ApiModelProperty(value = "")


  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }

  public Product weekEnd(String weekEnd) {
    this.weekEnd = weekEnd;
    return this;
  }

  /**
   * Get weekEnd
   * @return weekEnd
  **/
  @ApiModelProperty(value = "")


  public String getWeekEnd() {
    return weekEnd;
  }

  public void setWeekEnd(String weekEnd) {
    this.weekEnd = weekEnd;
  }

  public Product wifiUOM(String wifiUOM) {
    this.wifiUOM = wifiUOM;
    return this;
  }

  /**
   * Get wifiUOM
   * @return wifiUOM
  **/
  @ApiModelProperty(value = "")


  public String getWifiUOM() {
    return wifiUOM;
  }

  public void setWifiUOM(String wifiUOM) {
    this.wifiUOM = wifiUOM;
  }

  public Product wifiValue(String wifiValue) {
    this.wifiValue = wifiValue;
    return this;
  }

  /**
   * Get wifiValue
   * @return wifiValue
  **/
  @ApiModelProperty(value = "")


  public String getWifiValue() {
    return wifiValue;
  }

  public void setWifiValue(String wifiValue) {
    this.wifiValue = wifiValue;
  }

  public Product zereightnumberminutesUOM(String zereightnumberminutesUOM) {
    this.zereightnumberminutesUOM = zereightnumberminutesUOM;
    return this;
  }

  /**
   * Get zereightnumberminutesUOM
   * @return zereightnumberminutesUOM
  **/
  @ApiModelProperty(value = "")


  public String getZereightnumberminutesUOM() {
    return zereightnumberminutesUOM;
  }

  public void setZereightnumberminutesUOM(String zereightnumberminutesUOM) {
    this.zereightnumberminutesUOM = zereightnumberminutesUOM;
  }

  public Product zereightnumberminutesValue(String zereightnumberminutesValue) {
    this.zereightnumberminutesValue = zereightnumberminutesValue;
    return this;
  }

  /**
   * Get zereightnumberminutesValue
   * @return zereightnumberminutesValue
  **/
  @ApiModelProperty(value = "")


  public String getZereightnumberminutesValue() {
    return zereightnumberminutesValue;
  }

  public void setZereightnumberminutesValue(String zereightnumberminutesValue) {
    this.zereightnumberminutesValue = zereightnumberminutesValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.imageURLsFullFront, product.imageURLsFullFront) &&
        Objects.equals(this.seoDescription, product.seoDescription) &&
        Objects.equals(this.affiliateExport, product.affiliateExport) &&
        Objects.equals(this.allowanceUOM, product.allowanceUOM) &&
        Objects.equals(this.amount, product.amount) &&
        Objects.equals(this.availableFrom, product.availableFrom) &&
        Objects.equals(this.backOrderable, product.backOrderable) &&
        Objects.equals(this.compareWith, product.compareWith) &&
        Objects.equals(this.compatibleEntertainment, product.compatibleEntertainment) &&
        Objects.equals(this.condition, product.condition) &&
        Objects.equals(this.controlOrder, product.controlOrder) &&
        Objects.equals(this.conversionFactor, product.conversionFactor) &&
        Objects.equals(this.dataUOM, product.dataUOM) &&
        Objects.equals(this.dataValue, product.dataValue) &&
        Objects.equals(this.deliveryClassification, product.deliveryClassification) &&
        Objects.equals(this.deliveryMethod, product.deliveryMethod) &&
        Objects.equals(this.deliveryOnWeekend, product.deliveryOnWeekend) &&
        Objects.equals(this.deliveryPartner, product.deliveryPartner) &&
        Objects.equals(this.discountAmount, product.discountAmount) &&
        Objects.equals(this.discountType, product.discountType) &&
        Objects.equals(this.displayName, product.displayName) &&
        Objects.equals(this.displayUOM, product.displayUOM) &&
        Objects.equals(this.duration, product.duration) &&
        Objects.equals(this.durationUOM, product.durationUOM) &&
        Objects.equals(this.eligibiltiySubflow, product.eligibiltiySubflow) &&
        Objects.equals(this.equipmentMake, product.equipmentMake) &&
        Objects.equals(this.equipmentModel, product.equipmentModel) &&
        Objects.equals(this.estDeliveryDate, product.estDeliveryDate) &&
        Objects.equals(this.etdataUOM, product.etdataUOM) &&
        Objects.equals(this.etdataValue, product.etdataValue) &&
        Objects.equals(this.europeanRoamingDataUOM, product.europeanRoamingDataUOM) &&
        Objects.equals(this.europeanRoamingDataValue, product.europeanRoamingDataValue) &&
        Objects.equals(this.europeanRoamingMinutesUOM, product.europeanRoamingMinutesUOM) &&
        Objects.equals(this.europeanRoamingMinutesValue, product.europeanRoamingMinutesValue) &&
        Objects.equals(this.europeanRoamingPictureMessagesUOM, product.europeanRoamingPictureMessagesUOM) &&
        Objects.equals(this.europeanRoamingPictureMessagesValue, product.europeanRoamingPictureMessagesValue) &&
        Objects.equals(this.europeanRoamingTextsUOM, product.europeanRoamingTextsUOM) &&
        Objects.equals(this.europeanRoamingTextsValue, product.europeanRoamingTextsValue) &&
        Objects.equals(this.extraimeuandrowUOM, product.extraimeuandrowUOM) &&
        Objects.equals(this.extraimeuandrowValue, product.extraimeuandrowValue) &&
        Objects.equals(this.extraimeuandusUOM, product.extraimeuandusUOM) &&
        Objects.equals(this.extraimeuandusValue, product.extraimeuandusValue) &&
        Objects.equals(this.globalRoamingDataUOM, product.globalRoamingDataUOM) &&
        Objects.equals(this.globalRoamingDataValue, product.globalRoamingDataValue) &&
        Objects.equals(this.globalRoamingMinutesUOM, product.globalRoamingMinutesUOM) &&
        Objects.equals(this.globalRoamingMinutesValue, product.globalRoamingMinutesValue) &&
        Objects.equals(this.globalRoamingTextsUOM, product.globalRoamingTextsUOM) &&
        Objects.equals(this.globalRoamingTextsValue, product.globalRoamingTextsValue) &&
        Objects.equals(this.helptext, product.helptext) &&
        Objects.equals(this.helpurl, product.helpurl) &&
        Objects.equals(this.imageURLsFullBack, product.imageURLsFullBack) &&
        Objects.equals(this.imageURLsFullHero, product.imageURLsFullHero) &&
        Objects.equals(this.imageURLsFullLeft, product.imageURLsFullLeft) &&
        Objects.equals(this.imageURLsFullRight, product.imageURLsFullRight) &&
        Objects.equals(this.imageURLsFullSide, product.imageURLsFullSide) &&
        Objects.equals(this.imageURLsGrid, product.imageURLsGrid) &&
        Objects.equals(this.imageURLsIcon, product.imageURLsIcon) &&
        Objects.equals(this.imageURLsSmall, product.imageURLsSmall) &&
        Objects.equals(this.imageURLsSticker, product.imageURLsSticker) &&
        Objects.equals(this.imageURLsThumbsFront, product.imageURLsThumbsFront) &&
        Objects.equals(this.imageURLsThumbsLeft, product.imageURLsThumbsLeft) &&
        Objects.equals(this.imageURLsThumbsRight, product.imageURLsThumbsRight) &&
        Objects.equals(this.imageURLsThumbsSide, product.imageURLsThumbsSide) &&
        Objects.equals(this.inTheBox, product.inTheBox) &&
        Objects.equals(this.internationalMinutesUOM, product.internationalMinutesUOM) &&
        Objects.equals(this.internationalMinutesValue, product.internationalMinutesValue) &&
        Objects.equals(this.internationalTextsUOM, product.internationalTextsUOM) &&
        Objects.equals(this.internationalTextsValue, product.internationalTextsValue) &&
        Objects.equals(this.isBattery, product.isBattery) &&
        Objects.equals(this.isDeviceProduct, product.isDeviceProduct) &&
        Objects.equals(this.isDisplayableAcq, product.isDisplayableAcq) &&
        Objects.equals(this.isDisplayableEcare, product.isDisplayableEcare) &&
        Objects.equals(this.isDisplayableRet, product.isDisplayableRet) &&
        Objects.equals(this.isDisplaybaleSavedBasket, product.isDisplaybaleSavedBasket) &&
        Objects.equals(this.isSellableAcq, product.isSellableAcq) &&
        Objects.equals(this.isSellableECare, product.isSellableECare) &&
        Objects.equals(this.isSellableRet, product.isSellableRet) &&
        Objects.equals(this.isServicesProduct, product.isServicesProduct) &&
        Objects.equals(this.landlineMinutesUOM, product.landlineMinutesUOM) &&
        Objects.equals(this.landlineMinutesValue, product.landlineMinutesValue) &&
        Objects.equals(this.leadPlanId, product.leadPlanId) &&
        Objects.equals(this.listOfCompatibleBundles, product.listOfCompatibleBundles) &&
        Objects.equals(this.mefProductName, product.mefProductName) &&
        Objects.equals(this.numReviews, product.numReviews) &&
        Objects.equals(this.order, product.order) &&
        Objects.equals(this.parentProductId, product.parentProductId) &&
        Objects.equals(this.pdGrpCmpAcc, product.pdGrpCmpAcc) &&
        Objects.equals(this.pdGrpRecAcc, product.pdGrpRecAcc) &&
        Objects.equals(this.pdGrpRecExtr, product.pdGrpRecExtr) &&
        Objects.equals(this.pdGrpvariant, product.pdGrpvariant) &&
        Objects.equals(this.pictureMessagesUOM, product.pictureMessagesUOM) &&
        Objects.equals(this.postDesc, product.postDesc) &&
        Objects.equals(this.postDescMobile, product.postDescMobile) &&
        Objects.equals(this.preDesc, product.preDesc) &&
        Objects.equals(this.preDescMobile, product.preDescMobile) &&
        Objects.equals(this.preOrderable, product.preOrderable) &&
        Objects.equals(this.priceGrossOVR, product.priceGrossOVR) &&
        Objects.equals(this.priceNetOVR, product.priceNetOVR) &&
        Objects.equals(this.priceType, product.priceType) &&
        Objects.equals(this.priceVatOVR, product.priceVatOVR) &&
        Objects.equals(this.productClass, product.productClass) &&
        Objects.equals(this.productEndDate, product.productEndDate) &&
        Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productStartDate, product.productStartDate) &&
        Objects.equals(this.productSubClass, product.productSubClass) &&
        Objects.equals(this.productType, product.productType) &&
        Objects.equals(this.rating, product.rating) &&
        Objects.equals(this.roamingDataUOM, product.roamingDataUOM) &&
        Objects.equals(this.roamingDataValue, product.roamingDataValue) &&
        Objects.equals(this.salesExpired, product.salesExpired) &&
        Objects.equals(this.seoCanonical, product.seoCanonical) &&
        Objects.equals(this.seoIndex, product.seoIndex) &&
        Objects.equals(this.seoKeywords, product.seoKeywords) &&
        Objects.equals(this.support, product.support) &&
        Objects.equals(this.threeDSpin, product.threeDSpin) &&
        Objects.equals(this.tilUOM, product.tilUOM) &&
        Objects.equals(this.type, product.type) &&
        Objects.equals(this.uKANDInternationalCreditUOM, product.uKANDInternationalCreditUOM) &&
        Objects.equals(this.uKANDInternationalCreditValue, product.uKANDInternationalCreditValue) &&
        Objects.equals(this.uKmobileMinutesUOM, product.uKmobileMinutesUOM) &&
        Objects.equals(this.uKmobileMinutesValue, product.uKmobileMinutesValue) &&
        Objects.equals(this.ukDataUOM, product.ukDataUOM) &&
        Objects.equals(this.ukDataValue, product.ukDataValue) &&
        Objects.equals(this.ukMinutesUOM, product.ukMinutesUOM) &&
        Objects.equals(this.ukMinutesValue, product.ukMinutesValue) &&
        Objects.equals(this.ukTextsUOM, product.ukTextsUOM) &&
        Objects.equals(this.ukTextsValue, product.ukTextsValue) &&
        Objects.equals(this.ukandinternationalCreditUOM, product.ukandinternationalCreditUOM) &&
        Objects.equals(this.ukandinternationalCreditValue, product.ukandinternationalCreditValue) &&
        Objects.equals(this.ukmobileMinutesUOM, product.ukmobileMinutesUOM) &&
        Objects.equals(this.ukmobileMinutesValue, product.ukmobileMinutesValue) &&
        Objects.equals(this.video, product.video) &&
        Objects.equals(this.vodafoneVodafoneMinutesUOM, product.vodafoneVodafoneMinutesUOM) &&
        Objects.equals(this.vodafoneVodafoneMinutesValue, product.vodafoneVodafoneMinutesValue) &&
        Objects.equals(this.vodafoneVodafoneUOM, product.vodafoneVodafoneUOM) &&
        Objects.equals(this.vodafoneVodafoneValue, product.vodafoneVodafoneValue) &&
        Objects.equals(this.vodafoneVodafonetextsUOM, product.vodafoneVodafonetextsUOM) &&
        Objects.equals(this.vodafoneVodafonetextsValue, product.vodafoneVodafonetextsValue) &&
        Objects.equals(this.warranty, product.warranty) &&
        Objects.equals(this.weekEnd, product.weekEnd) &&
        Objects.equals(this.wifiUOM, product.wifiUOM) &&
        Objects.equals(this.wifiValue, product.wifiValue) &&
        Objects.equals(this.zereightnumberminutesUOM, product.zereightnumberminutesUOM) &&
        Objects.equals(this.zereightnumberminutesValue, product.zereightnumberminutesValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageURLsFullFront, seoDescription, affiliateExport, allowanceUOM, amount, availableFrom, backOrderable, compareWith, compatibleEntertainment, condition, controlOrder, conversionFactor, dataUOM, dataValue, deliveryClassification, deliveryMethod, deliveryOnWeekend, deliveryPartner, discountAmount, discountType, displayName, displayUOM, duration, durationUOM, eligibiltiySubflow, equipmentMake, equipmentModel, estDeliveryDate, etdataUOM, etdataValue, europeanRoamingDataUOM, europeanRoamingDataValue, europeanRoamingMinutesUOM, europeanRoamingMinutesValue, europeanRoamingPictureMessagesUOM, europeanRoamingPictureMessagesValue, europeanRoamingTextsUOM, europeanRoamingTextsValue, extraimeuandrowUOM, extraimeuandrowValue, extraimeuandusUOM, extraimeuandusValue, globalRoamingDataUOM, globalRoamingDataValue, globalRoamingMinutesUOM, globalRoamingMinutesValue, globalRoamingTextsUOM, globalRoamingTextsValue, helptext, helpurl, imageURLsFullBack, imageURLsFullHero, imageURLsFullLeft, imageURLsFullRight, imageURLsFullSide, imageURLsGrid, imageURLsIcon, imageURLsSmall, imageURLsSticker, imageURLsThumbsFront, imageURLsThumbsLeft, imageURLsThumbsRight, imageURLsThumbsSide, inTheBox, internationalMinutesUOM, internationalMinutesValue, internationalTextsUOM, internationalTextsValue, isBattery, isDeviceProduct, isDisplayableAcq, isDisplayableEcare, isDisplayableRet, isDisplaybaleSavedBasket, isSellableAcq, isSellableECare, isSellableRet, isServicesProduct, landlineMinutesUOM, landlineMinutesValue, leadPlanId, listOfCompatibleBundles, mefProductName, numReviews, order, parentProductId, pdGrpCmpAcc, pdGrpRecAcc, pdGrpRecExtr, pdGrpvariant, pictureMessagesUOM, postDesc, postDescMobile, preDesc, preDescMobile, preOrderable, priceGrossOVR, priceNetOVR, priceType, priceVatOVR, productClass, productEndDate, productId, productName, productStartDate, productSubClass, productType, rating, roamingDataUOM, roamingDataValue, salesExpired, seoCanonical, seoIndex, seoKeywords, support, threeDSpin, tilUOM, type, uKANDInternationalCreditUOM, uKANDInternationalCreditValue, uKmobileMinutesUOM, uKmobileMinutesValue, ukDataUOM, ukDataValue, ukMinutesUOM, ukMinutesValue, ukTextsUOM, ukTextsValue, ukandinternationalCreditUOM, ukandinternationalCreditValue, ukmobileMinutesUOM, ukmobileMinutesValue, video, vodafoneVodafoneMinutesUOM, vodafoneVodafoneMinutesValue, vodafoneVodafoneUOM, vodafoneVodafoneValue, vodafoneVodafonetextsUOM, vodafoneVodafonetextsValue, warranty, weekEnd, wifiUOM, wifiValue, zereightnumberminutesUOM, zereightnumberminutesValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    imageURLsFullFront: ").append(toIndentedString(imageURLsFullFront)).append("\n");
    sb.append("    seoDescription: ").append(toIndentedString(seoDescription)).append("\n");
    sb.append("    affiliateExport: ").append(toIndentedString(affiliateExport)).append("\n");
    sb.append("    allowanceUOM: ").append(toIndentedString(allowanceUOM)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    backOrderable: ").append(toIndentedString(backOrderable)).append("\n");
    sb.append("    compareWith: ").append(toIndentedString(compareWith)).append("\n");
    sb.append("    compatibleEntertainment: ").append(toIndentedString(compatibleEntertainment)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    controlOrder: ").append(toIndentedString(controlOrder)).append("\n");
    sb.append("    conversionFactor: ").append(toIndentedString(conversionFactor)).append("\n");
    sb.append("    dataUOM: ").append(toIndentedString(dataUOM)).append("\n");
    sb.append("    dataValue: ").append(toIndentedString(dataValue)).append("\n");
    sb.append("    deliveryClassification: ").append(toIndentedString(deliveryClassification)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryOnWeekend: ").append(toIndentedString(deliveryOnWeekend)).append("\n");
    sb.append("    deliveryPartner: ").append(toIndentedString(deliveryPartner)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayUOM: ").append(toIndentedString(displayUOM)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationUOM: ").append(toIndentedString(durationUOM)).append("\n");
    sb.append("    eligibiltiySubflow: ").append(toIndentedString(eligibiltiySubflow)).append("\n");
    sb.append("    equipmentMake: ").append(toIndentedString(equipmentMake)).append("\n");
    sb.append("    equipmentModel: ").append(toIndentedString(equipmentModel)).append("\n");
    sb.append("    estDeliveryDate: ").append(toIndentedString(estDeliveryDate)).append("\n");
    sb.append("    etdataUOM: ").append(toIndentedString(etdataUOM)).append("\n");
    sb.append("    etdataValue: ").append(toIndentedString(etdataValue)).append("\n");
    sb.append("    europeanRoamingDataUOM: ").append(toIndentedString(europeanRoamingDataUOM)).append("\n");
    sb.append("    europeanRoamingDataValue: ").append(toIndentedString(europeanRoamingDataValue)).append("\n");
    sb.append("    europeanRoamingMinutesUOM: ").append(toIndentedString(europeanRoamingMinutesUOM)).append("\n");
    sb.append("    europeanRoamingMinutesValue: ").append(toIndentedString(europeanRoamingMinutesValue)).append("\n");
    sb.append("    europeanRoamingPictureMessagesUOM: ").append(toIndentedString(europeanRoamingPictureMessagesUOM)).append("\n");
    sb.append("    europeanRoamingPictureMessagesValue: ").append(toIndentedString(europeanRoamingPictureMessagesValue)).append("\n");
    sb.append("    europeanRoamingTextsUOM: ").append(toIndentedString(europeanRoamingTextsUOM)).append("\n");
    sb.append("    europeanRoamingTextsValue: ").append(toIndentedString(europeanRoamingTextsValue)).append("\n");
    sb.append("    extraimeuandrowUOM: ").append(toIndentedString(extraimeuandrowUOM)).append("\n");
    sb.append("    extraimeuandrowValue: ").append(toIndentedString(extraimeuandrowValue)).append("\n");
    sb.append("    extraimeuandusUOM: ").append(toIndentedString(extraimeuandusUOM)).append("\n");
    sb.append("    extraimeuandusValue: ").append(toIndentedString(extraimeuandusValue)).append("\n");
    sb.append("    globalRoamingDataUOM: ").append(toIndentedString(globalRoamingDataUOM)).append("\n");
    sb.append("    globalRoamingDataValue: ").append(toIndentedString(globalRoamingDataValue)).append("\n");
    sb.append("    globalRoamingMinutesUOM: ").append(toIndentedString(globalRoamingMinutesUOM)).append("\n");
    sb.append("    globalRoamingMinutesValue: ").append(toIndentedString(globalRoamingMinutesValue)).append("\n");
    sb.append("    globalRoamingTextsUOM: ").append(toIndentedString(globalRoamingTextsUOM)).append("\n");
    sb.append("    globalRoamingTextsValue: ").append(toIndentedString(globalRoamingTextsValue)).append("\n");
    sb.append("    helptext: ").append(toIndentedString(helptext)).append("\n");
    sb.append("    helpurl: ").append(toIndentedString(helpurl)).append("\n");
    sb.append("    imageURLsFullBack: ").append(toIndentedString(imageURLsFullBack)).append("\n");
    sb.append("    imageURLsFullHero: ").append(toIndentedString(imageURLsFullHero)).append("\n");
    sb.append("    imageURLsFullLeft: ").append(toIndentedString(imageURLsFullLeft)).append("\n");
    sb.append("    imageURLsFullRight: ").append(toIndentedString(imageURLsFullRight)).append("\n");
    sb.append("    imageURLsFullSide: ").append(toIndentedString(imageURLsFullSide)).append("\n");
    sb.append("    imageURLsGrid: ").append(toIndentedString(imageURLsGrid)).append("\n");
    sb.append("    imageURLsIcon: ").append(toIndentedString(imageURLsIcon)).append("\n");
    sb.append("    imageURLsSmall: ").append(toIndentedString(imageURLsSmall)).append("\n");
    sb.append("    imageURLsSticker: ").append(toIndentedString(imageURLsSticker)).append("\n");
    sb.append("    imageURLsThumbsFront: ").append(toIndentedString(imageURLsThumbsFront)).append("\n");
    sb.append("    imageURLsThumbsLeft: ").append(toIndentedString(imageURLsThumbsLeft)).append("\n");
    sb.append("    imageURLsThumbsRight: ").append(toIndentedString(imageURLsThumbsRight)).append("\n");
    sb.append("    imageURLsThumbsSide: ").append(toIndentedString(imageURLsThumbsSide)).append("\n");
    sb.append("    inTheBox: ").append(toIndentedString(inTheBox)).append("\n");
    sb.append("    internationalMinutesUOM: ").append(toIndentedString(internationalMinutesUOM)).append("\n");
    sb.append("    internationalMinutesValue: ").append(toIndentedString(internationalMinutesValue)).append("\n");
    sb.append("    internationalTextsUOM: ").append(toIndentedString(internationalTextsUOM)).append("\n");
    sb.append("    internationalTextsValue: ").append(toIndentedString(internationalTextsValue)).append("\n");
    sb.append("    isBattery: ").append(toIndentedString(isBattery)).append("\n");
    sb.append("    isDeviceProduct: ").append(toIndentedString(isDeviceProduct)).append("\n");
    sb.append("    isDisplayableAcq: ").append(toIndentedString(isDisplayableAcq)).append("\n");
    sb.append("    isDisplayableEcare: ").append(toIndentedString(isDisplayableEcare)).append("\n");
    sb.append("    isDisplayableRet: ").append(toIndentedString(isDisplayableRet)).append("\n");
    sb.append("    isDisplaybaleSavedBasket: ").append(toIndentedString(isDisplaybaleSavedBasket)).append("\n");
    sb.append("    isSellableAcq: ").append(toIndentedString(isSellableAcq)).append("\n");
    sb.append("    isSellableECare: ").append(toIndentedString(isSellableECare)).append("\n");
    sb.append("    isSellableRet: ").append(toIndentedString(isSellableRet)).append("\n");
    sb.append("    isServicesProduct: ").append(toIndentedString(isServicesProduct)).append("\n");
    sb.append("    landlineMinutesUOM: ").append(toIndentedString(landlineMinutesUOM)).append("\n");
    sb.append("    landlineMinutesValue: ").append(toIndentedString(landlineMinutesValue)).append("\n");
    sb.append("    leadPlanId: ").append(toIndentedString(leadPlanId)).append("\n");
    sb.append("    listOfCompatibleBundles: ").append(toIndentedString(listOfCompatibleBundles)).append("\n");
    sb.append("    mefProductName: ").append(toIndentedString(mefProductName)).append("\n");
    sb.append("    numReviews: ").append(toIndentedString(numReviews)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parentProductId: ").append(toIndentedString(parentProductId)).append("\n");
    sb.append("    pdGrpCmpAcc: ").append(toIndentedString(pdGrpCmpAcc)).append("\n");
    sb.append("    pdGrpRecAcc: ").append(toIndentedString(pdGrpRecAcc)).append("\n");
    sb.append("    pdGrpRecExtr: ").append(toIndentedString(pdGrpRecExtr)).append("\n");
    sb.append("    pdGrpvariant: ").append(toIndentedString(pdGrpvariant)).append("\n");
    sb.append("    pictureMessagesUOM: ").append(toIndentedString(pictureMessagesUOM)).append("\n");
    sb.append("    postDesc: ").append(toIndentedString(postDesc)).append("\n");
    sb.append("    postDescMobile: ").append(toIndentedString(postDescMobile)).append("\n");
    sb.append("    preDesc: ").append(toIndentedString(preDesc)).append("\n");
    sb.append("    preDescMobile: ").append(toIndentedString(preDescMobile)).append("\n");
    sb.append("    preOrderable: ").append(toIndentedString(preOrderable)).append("\n");
    sb.append("    priceGrossOVR: ").append(toIndentedString(priceGrossOVR)).append("\n");
    sb.append("    priceNetOVR: ").append(toIndentedString(priceNetOVR)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    priceVatOVR: ").append(toIndentedString(priceVatOVR)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    productEndDate: ").append(toIndentedString(productEndDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productStartDate: ").append(toIndentedString(productStartDate)).append("\n");
    sb.append("    productSubClass: ").append(toIndentedString(productSubClass)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    roamingDataUOM: ").append(toIndentedString(roamingDataUOM)).append("\n");
    sb.append("    roamingDataValue: ").append(toIndentedString(roamingDataValue)).append("\n");
    sb.append("    salesExpired: ").append(toIndentedString(salesExpired)).append("\n");
    sb.append("    seoCanonical: ").append(toIndentedString(seoCanonical)).append("\n");
    sb.append("    seoIndex: ").append(toIndentedString(seoIndex)).append("\n");
    sb.append("    seoKeywords: ").append(toIndentedString(seoKeywords)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    threeDSpin: ").append(toIndentedString(threeDSpin)).append("\n");
    sb.append("    tilUOM: ").append(toIndentedString(tilUOM)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uKANDInternationalCreditUOM: ").append(toIndentedString(uKANDInternationalCreditUOM)).append("\n");
    sb.append("    uKANDInternationalCreditValue: ").append(toIndentedString(uKANDInternationalCreditValue)).append("\n");
    sb.append("    uKmobileMinutesUOM: ").append(toIndentedString(uKmobileMinutesUOM)).append("\n");
    sb.append("    uKmobileMinutesValue: ").append(toIndentedString(uKmobileMinutesValue)).append("\n");
    sb.append("    ukDataUOM: ").append(toIndentedString(ukDataUOM)).append("\n");
    sb.append("    ukDataValue: ").append(toIndentedString(ukDataValue)).append("\n");
    sb.append("    ukMinutesUOM: ").append(toIndentedString(ukMinutesUOM)).append("\n");
    sb.append("    ukMinutesValue: ").append(toIndentedString(ukMinutesValue)).append("\n");
    sb.append("    ukTextsUOM: ").append(toIndentedString(ukTextsUOM)).append("\n");
    sb.append("    ukTextsValue: ").append(toIndentedString(ukTextsValue)).append("\n");
    sb.append("    ukandinternationalCreditUOM: ").append(toIndentedString(ukandinternationalCreditUOM)).append("\n");
    sb.append("    ukandinternationalCreditValue: ").append(toIndentedString(ukandinternationalCreditValue)).append("\n");
    sb.append("    ukmobileMinutesUOM: ").append(toIndentedString(ukmobileMinutesUOM)).append("\n");
    sb.append("    ukmobileMinutesValue: ").append(toIndentedString(ukmobileMinutesValue)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    vodafoneVodafoneMinutesUOM: ").append(toIndentedString(vodafoneVodafoneMinutesUOM)).append("\n");
    sb.append("    vodafoneVodafoneMinutesValue: ").append(toIndentedString(vodafoneVodafoneMinutesValue)).append("\n");
    sb.append("    vodafoneVodafoneUOM: ").append(toIndentedString(vodafoneVodafoneUOM)).append("\n");
    sb.append("    vodafoneVodafoneValue: ").append(toIndentedString(vodafoneVodafoneValue)).append("\n");
    sb.append("    vodafoneVodafonetextsUOM: ").append(toIndentedString(vodafoneVodafonetextsUOM)).append("\n");
    sb.append("    vodafoneVodafonetextsValue: ").append(toIndentedString(vodafoneVodafonetextsValue)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
    sb.append("    weekEnd: ").append(toIndentedString(weekEnd)).append("\n");
    sb.append("    wifiUOM: ").append(toIndentedString(wifiUOM)).append("\n");
    sb.append("    wifiValue: ").append(toIndentedString(wifiValue)).append("\n");
    sb.append("    zereightnumberminutesUOM: ").append(toIndentedString(zereightnumberminutesUOM)).append("\n");
    sb.append("    zereightnumberminutesValue: ").append(toIndentedString(zereightnumberminutesValue)).append("\n");
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

