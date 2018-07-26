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
 * Product.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")

public class Product   {
  
  /** The image UR ls full front. */
  @JsonProperty("ImageURLsFullFront")
  private String imageURLsFullFront = null;

  /** The seo description. */
  @JsonProperty("SeoDescription")
  private String seoDescription = null;

  /** The affiliate export. */
  @JsonProperty("affiliateExport")
  private String affiliateExport = null;

  /** The allowance UOM. */
  @JsonProperty("allowanceUOM")
  private String allowanceUOM = null;

  /** The amount. */
  @JsonProperty("amount")
  private String amount = null;

  /** The available from. */
  @JsonProperty("availableFrom")
  private String availableFrom = null;

  /** The back orderable. */
  @JsonProperty("backOrderable")
  private String backOrderable = null;

  /** The compare with. */
  @JsonProperty("compareWith")
  private String compareWith = null;

  /** The compatible entertainment. */
  @JsonProperty("compatibleEntertainment")
  private String compatibleEntertainment = null;

  /** The condition. */
  @JsonProperty("condition")
  private String condition = null;

  /** The control order. */
  @JsonProperty("controlOrder")
  private String controlOrder = null;

  /** The conversion factor. */
  @JsonProperty("conversionFactor")
  private String conversionFactor = null;

  /** The data UOM. */
  @JsonProperty("dataUOM")
  private String dataUOM = null;

  /** The data value. */
  @JsonProperty("dataValue")
  private String dataValue = null;

  /** The delivery classification. */
  @JsonProperty("deliveryClassification")
  private String deliveryClassification = null;

  /** The delivery method. */
  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  /** The delivery on weekend. */
  @JsonProperty("deliveryOnWeekend")
  private String deliveryOnWeekend = null;

  /** The delivery partner. */
  @JsonProperty("deliveryPartner")
  private String deliveryPartner = null;

  /** The discount amount. */
  @JsonProperty("discountAmount")
  private BigDecimal discountAmount = null;

  /** The discount type. */
  @JsonProperty("discountType")
  private String discountType = null;

  /** The display name. */
  @JsonProperty("displayName")
  private String displayName = null;

  /** The display UOM. */
  @JsonProperty("displayUOM")
  private String displayUOM = null;

  /** The duration. */
  @JsonProperty("duration")
  private Integer duration = null;

  /** The duration UOM. */
  @JsonProperty("durationUOM")
  private String durationUOM = null;

  /** The eligibiltiy subflow. */
  @JsonProperty("eligibiltiySubflow")
  private String eligibiltiySubflow = null;

  /** The equipment make. */
  @JsonProperty("equipmentMake")
  private String equipmentMake = null;

  /** The equipment model. */
  @JsonProperty("equipmentModel")
  private String equipmentModel = null;

  /** The est delivery date. */
  @JsonProperty("estDeliveryDate")
  private String estDeliveryDate = null;

  /** The etdata UOM. */
  @JsonProperty("etdataUOM")
  private String etdataUOM = null;

  /** The etdata value. */
  @JsonProperty("etdataValue")
  private String etdataValue = null;

  /** The european roaming data UOM. */
  @JsonProperty("europeanRoamingDataUOM")
  private String europeanRoamingDataUOM = null;

  /** The european roaming data value. */
  @JsonProperty("europeanRoamingDataValue")
  private String europeanRoamingDataValue = null;

  /** The european roaming minutes UOM. */
  @JsonProperty("europeanRoamingMinutesUOM")
  private String europeanRoamingMinutesUOM = null;

  /** The european roaming minutes value. */
  @JsonProperty("europeanRoamingMinutesValue")
  private String europeanRoamingMinutesValue = null;

  /** The european roaming picture messages UOM. */
  @JsonProperty("europeanRoamingPictureMessagesUOM")
  private String europeanRoamingPictureMessagesUOM = null;

  /** The european roaming picture messages value. */
  @JsonProperty("europeanRoamingPictureMessagesValue")
  private String europeanRoamingPictureMessagesValue = null;

  /** The european roaming texts UOM. */
  @JsonProperty("europeanRoamingTextsUOM")
  private String europeanRoamingTextsUOM = null;

  /** The european roaming texts value. */
  @JsonProperty("europeanRoamingTextsValue")
  private String europeanRoamingTextsValue = null;

  /** The extraimeuandrow UOM. */
  @JsonProperty("extraimeuandrowUOM")
  private String extraimeuandrowUOM = null;

  /** The extraimeuandrow value. */
  @JsonProperty("extraimeuandrowValue")
  private String extraimeuandrowValue = null;

  /** The extraimeuandus UOM. */
  @JsonProperty("extraimeuandusUOM")
  private String extraimeuandusUOM = null;

  /** The extraimeuandus value. */
  @JsonProperty("extraimeuandusValue")
  private String extraimeuandusValue = null;

  /** The global roaming data UOM. */
  @JsonProperty("globalRoamingDataUOM")
  private String globalRoamingDataUOM = null;

  /** The global roaming data value. */
  @JsonProperty("globalRoamingDataValue")
  private String globalRoamingDataValue = null;

  /** The global roaming minutes UOM. */
  @JsonProperty("globalRoamingMinutesUOM")
  private String globalRoamingMinutesUOM = null;

  /** The global roaming minutes value. */
  @JsonProperty("globalRoamingMinutesValue")
  private String globalRoamingMinutesValue = null;

  /** The global roaming texts UOM. */
  @JsonProperty("globalRoamingTextsUOM")
  private String globalRoamingTextsUOM = null;

  /** The global roaming texts value. */
  @JsonProperty("globalRoamingTextsValue")
  private String globalRoamingTextsValue = null;

  /** The helptext. */
  @JsonProperty("helptext")
  private String helptext = null;

  /** The helpurl. */
  @JsonProperty("helpurl")
  private String helpurl = null;

  /** The image UR ls full back. */
  @JsonProperty("imageURLsFullBack")
  private String imageURLsFullBack = null;

  /** The image UR ls full hero. */
  @JsonProperty("imageURLsFullHero")
  private String imageURLsFullHero = null;

  /** The image UR ls full left. */
  @JsonProperty("imageURLsFullLeft")
  private String imageURLsFullLeft = null;

  /** The image UR ls full right. */
  @JsonProperty("imageURLsFullRight:")
  private String imageURLsFullRight = null;

  /** The image UR ls full side. */
  @JsonProperty("imageURLsFullSide")
  private String imageURLsFullSide = null;

  /** The image UR ls grid. */
  @JsonProperty("imageURLsGrid")
  private String imageURLsGrid = null;

  /** The image UR ls icon. */
  @JsonProperty("imageURLsIcon")
  private String imageURLsIcon = null;

  /** The image UR ls small. */
  @JsonProperty("imageURLsSmall")
  private String imageURLsSmall = null;

  /** The image UR ls sticker. */
  @JsonProperty("imageURLsSticker")
  private String imageURLsSticker = null;

  /** The image UR ls thumbs front. */
  @JsonProperty("imageURLsThumbsFront")
  private String imageURLsThumbsFront = null;

  /** The image UR ls thumbs left. */
  @JsonProperty("imageURLsThumbsLeft")
  private String imageURLsThumbsLeft = null;

  /** The image UR ls thumbs right. */
  @JsonProperty("imageURLsThumbsRight")
  private String imageURLsThumbsRight = null;

  /** The image UR ls thumbs side. */
  @JsonProperty("imageURLsThumbsSide")
  private String imageURLsThumbsSide = null;

  /** The in the box. */
  @JsonProperty("inTheBox")
  private String inTheBox = null;

  /** The international minutes UOM. */
  @JsonProperty("internationalMinutesUOM")
  private String internationalMinutesUOM = null;

  /** The international minutes value. */
  @JsonProperty("internationalMinutesValue")
  private String internationalMinutesValue = null;

  /** The international texts UOM. */
  @JsonProperty("internationalTextsUOM")
  private String internationalTextsUOM = null;

  /** The international texts value. */
  @JsonProperty("internationalTextsValue")
  private String internationalTextsValue = null;

  /** The is battery. */
  @JsonProperty("isBattery")
  private String isBattery = null;

  /** The is device product. */
  @JsonProperty("isDeviceProduct")
  private String isDeviceProduct = null;

  /** The is displayable acq. */
  @JsonProperty("isDisplayableAcq")
  private String isDisplayableAcq = null;

  /** The is displayable ecare. */
  @JsonProperty("isDisplayableEcare")
  private String isDisplayableEcare = null;

  /** The is displayable ret. */
  @JsonProperty("isDisplayableRet")
  private String isDisplayableRet = null;

  /** The is displaybale saved basket. */
  @JsonProperty("isDisplaybaleSavedBasket")
  private String isDisplaybaleSavedBasket = null;

  /** The is sellable acq. */
  @JsonProperty("isSellableAcq")
  private String isSellableAcq = null;

  /** The is sellable E care. */
  @JsonProperty("isSellableECare")
  private String isSellableECare = null;

  /** The is sellable ret. */
  @JsonProperty("isSellableRet")
  private String isSellableRet = null;

  /** The is services product. */
  @JsonProperty("isServicesProduct")
  private String isServicesProduct = null;

  /** The landline minutes UOM. */
  @JsonProperty("landlineMinutesUOM")
  private String landlineMinutesUOM = null;

  /** The landline minutes value. */
  @JsonProperty("landlineMinutesValue")
  private String landlineMinutesValue = null;

  /** The lead plan id. */
  @JsonProperty("leadPlanId")
  private String leadPlanId = null;

  /** The list of compatible bundles. */
  @JsonProperty("listOfCompatibleBundles")
  @Valid
  private List<String> listOfCompatibleBundles = null;

  /** The mef product name. */
  @JsonProperty("mefProductName")
  private String mefProductName = null;

  /** The num reviews. */
  @JsonProperty("numReviews")
  private String numReviews = null;

  /** The order. */
  @JsonProperty("order")
  private String order = null;

  /** The parent product id. */
  @JsonProperty("parentProductId")
  private String parentProductId = null;

  /** The pd grp cmp acc. */
  @JsonProperty("pdGrpCmpAcc")
  private String pdGrpCmpAcc = null;

  /** The pd grp rec acc. */
  @JsonProperty("pdGrpRecAcc")
  private String pdGrpRecAcc = null;

  /** The pd grp rec extr. */
  @JsonProperty("pdGrpRecExtr")
  private String pdGrpRecExtr = null;

  /** The pd grpvariant. */
  @JsonProperty("pdGrpvariant")
  private String pdGrpvariant = null;

  /** The picture messages UOM. */
  @JsonProperty("pictureMessagesUOM")
  private String pictureMessagesUOM = null;

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

  /** The pre orderable. */
  @JsonProperty("preOrderable")
  private String preOrderable = null;

  /** The price gross OVR. */
  @JsonProperty("priceGrossOVR")
  private String priceGrossOVR = null;

  /** The price net OVR. */
  @JsonProperty("priceNetOVR")
  private String priceNetOVR = null;

  /** The price type. */
  @JsonProperty("priceType")
  private String priceType = null;

  /** The price vat OVR. */
  @JsonProperty("priceVatOVR")
  private String priceVatOVR = null;

  /** The product class. */
  @JsonProperty("productClass")
  private String productClass = null;

  /** The product end date. */
  @JsonProperty("productEndDate")
  private String productEndDate = null;

  /** The product id. */
  @JsonProperty("productId")
  private String productId = null;

  /** The product name. */
  @JsonProperty("productName")
  private String productName = null;

  /** The product start date. */
  @JsonProperty("productStartDate")
  private String productStartDate = null;

  /** The product sub class. */
  @JsonProperty("productSubClass")
  private String productSubClass = null;

  /** The product type. */
  @JsonProperty("productType")
  private String productType = null;

  /** The rating. */
  @JsonProperty("rating")
  private String rating = null;

  /** The roaming data UOM. */
  @JsonProperty("roamingDataUOM")
  private String roamingDataUOM = null;

  /** The roaming data value. */
  @JsonProperty("roamingDataValue")
  private String roamingDataValue = null;

  /** The sales expired. */
  @JsonProperty("salesExpired")
  private String salesExpired = null;

  /** The seo canonical. */
  @JsonProperty("seoCanonical")
  private String seoCanonical = null;

  /** The seo index. */
  @JsonProperty("seoIndex")
  private String seoIndex = null;

  /** The seo keywords. */
  @JsonProperty("seoKeywords")
  private String seoKeywords = null;

  /** The support. */
  @JsonProperty("support")
  private String support = null;

  /** The three D spin. */
  @JsonProperty("threeDSpin")
  private String threeDSpin = null;

  /** The til UOM. */
  @JsonProperty("tilUOM")
  private String tilUOM = null;

  /** The type. */
  @JsonProperty("type")
  private String type = null;

  /** The u KAND international credit UOM. */
  @JsonProperty("uKANDInternationalCreditUOM")
  private String uKANDInternationalCreditUOM = null;

  /** The u KAND international credit value. */
  @JsonProperty("uKANDInternationalCreditValue")
  private String uKANDInternationalCreditValue = null;

  /** The u kmobile minutes UOM. */
  @JsonProperty("uKmobileMinutesUOM")
  private String uKmobileMinutesUOM = null;

  /** The u kmobile minutes value. */
  @JsonProperty("uKmobileMinutesValue")
  private String uKmobileMinutesValue = null;

  /** The uk data UOM. */
  @JsonProperty("ukDataUOM")
  private String ukDataUOM = null;

  /** The uk data value. */
  @JsonProperty("ukDataValue")
  private String ukDataValue = null;

  /** The uk minutes UOM. */
  @JsonProperty("ukMinutesUOM")
  private String ukMinutesUOM = null;

  /** The uk minutes value. */
  @JsonProperty("ukMinutesValue")
  private String ukMinutesValue = null;

  /** The uk texts UOM. */
  @JsonProperty("ukTextsUOM")
  private String ukTextsUOM = null;

  /** The uk texts value. */
  @JsonProperty("ukTextsValue")
  private String ukTextsValue = null;

  /** The ukandinternational credit UOM. */
  @JsonProperty("ukandinternationalCreditUOM")
  private String ukandinternationalCreditUOM = null;

  /** The ukandinternational credit value. */
  @JsonProperty("ukandinternationalCreditValue")
  private String ukandinternationalCreditValue = null;

  /** The ukmobile minutes UOM. */
  @JsonProperty("ukmobileMinutesUOM")
  private String ukmobileMinutesUOM = null;

  /** The ukmobile minutes value. */
  @JsonProperty("ukmobileMinutesValue")
  private String ukmobileMinutesValue = null;

  /** The video. */
  @JsonProperty("video")
  private String video = null;

  /** The vodafone vodafone minutes UOM. */
  @JsonProperty("vodafoneVodafoneMinutesUOM")
  private String vodafoneVodafoneMinutesUOM = null;

  /** The vodafone vodafone minutes value. */
  @JsonProperty("vodafoneVodafoneMinutesValue")
  private String vodafoneVodafoneMinutesValue = null;

  /** The vodafone vodafone UOM. */
  @JsonProperty("vodafoneVodafoneUOM")
  private String vodafoneVodafoneUOM = null;

  /** The vodafone vodafone value. */
  @JsonProperty("vodafoneVodafoneValue")
  private String vodafoneVodafoneValue = null;

  /** The vodafone vodafonetexts UOM. */
  @JsonProperty("vodafoneVodafonetextsUOM")
  private String vodafoneVodafonetextsUOM = null;

  /** The vodafone vodafonetexts value. */
  @JsonProperty("vodafoneVodafonetextsValue")
  private String vodafoneVodafonetextsValue = null;

  /** The warranty. */
  @JsonProperty("warranty")
  private String warranty = null;

  /** The week end. */
  @JsonProperty("weekEnd")
  private String weekEnd = null;

  /** The wifi UOM. */
  @JsonProperty("wifiUOM")
  private String wifiUOM = null;

  /** The wifi value. */
  @JsonProperty("wifiValue")
  private String wifiValue = null;

  /** The zereightnumberminutes UOM. */
  @JsonProperty("zereightnumberminutesUOM")
  private String zereightnumberminutesUOM = null;

  /** The zereightnumberminutes value. */
  @JsonProperty("zereightnumberminutesValue")
  private String zereightnumberminutesValue = null;

  /**
   * Image UR ls full front.
   *
   * @param imageURLsFullFront the image UR ls full front
   * @return the product
   */
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

  /**
   * Sets the image UR ls full front.
   *
   * @param imageURLsFullFront the new image UR ls full front
   */
  public void setImageURLsFullFront(String imageURLsFullFront) {
    this.imageURLsFullFront = imageURLsFullFront;
  }

  /**
   * Seo description.
   *
   * @param seoDescription the seo description
   * @return the product
   */
  public Product seoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
    return this;
  }

  /**
   * Product short description as defined catalogue.
   *
   * @return seoDescription
   */
  @ApiModelProperty(value = "Product short description as defined catalogue")


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
   * Affiliate export.
   *
   * @param affiliateExport the affiliate export
   * @return the product
   */
  public Product affiliateExport(String affiliateExport) {
    this.affiliateExport = affiliateExport;
    return this;
  }

  /**
   * Get affiliateExport.
   *
   * @return affiliateExport
   */
  @ApiModelProperty(value = "")


  public String getAffiliateExport() {
    return affiliateExport;
  }

  /**
   * Sets the affiliate export.
   *
   * @param affiliateExport the new affiliate export
   */
  public void setAffiliateExport(String affiliateExport) {
    this.affiliateExport = affiliateExport;
  }

  /**
   * Allowance UOM.
   *
   * @param allowanceUOM the allowance UOM
   * @return the product
   */
  public Product allowanceUOM(String allowanceUOM) {
    this.allowanceUOM = allowanceUOM;
    return this;
  }

  /**
   * Get allowanceUOM.
   *
   * @return allowanceUOM
   */
  @ApiModelProperty(value = "")


  public String getAllowanceUOM() {
    return allowanceUOM;
  }

  /**
   * Sets the allowance UOM.
   *
   * @param allowanceUOM the new allowance UOM
   */
  public void setAllowanceUOM(String allowanceUOM) {
    this.allowanceUOM = allowanceUOM;
  }

  /**
   * Amount.
   *
   * @param amount the amount
   * @return the product
   */
  public Product amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount.
   *
   * @return amount
   */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount.
   *
   * @param amount the new amount
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Available from.
   *
   * @param availableFrom the available from
   * @return the product
   */
  public Product availableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

  /**
   * Get availableFrom.
   *
   * @return availableFrom
   */
  @ApiModelProperty(value = "")


  public String getAvailableFrom() {
    return availableFrom;
  }

  /**
   * Sets the available from.
   *
   * @param availableFrom the new available from
   */
  public void setAvailableFrom(String availableFrom) {
    this.availableFrom = availableFrom;
  }

  /**
   * Back orderable.
   *
   * @param backOrderable the back orderable
   * @return the product
   */
  public Product backOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
    return this;
  }

  /**
   * Get backOrderable.
   *
   * @return backOrderable
   */
  @ApiModelProperty(value = "")


  public String getBackOrderable() {
    return backOrderable;
  }

  /**
   * Sets the back orderable.
   *
   * @param backOrderable the new back orderable
   */
  public void setBackOrderable(String backOrderable) {
    this.backOrderable = backOrderable;
  }

  /**
   * Compare with.
   *
   * @param compareWith the compare with
   * @return the product
   */
  public Product compareWith(String compareWith) {
    this.compareWith = compareWith;
    return this;
  }

  /**
   * Get compareWith.
   *
   * @return compareWith
   */
  @ApiModelProperty(value = "")


  public String getCompareWith() {
    return compareWith;
  }

  /**
   * Sets the compare with.
   *
   * @param compareWith the new compare with
   */
  public void setCompareWith(String compareWith) {
    this.compareWith = compareWith;
  }

  /**
   * Compatible entertainment.
   *
   * @param compatibleEntertainment the compatible entertainment
   * @return the product
   */
  public Product compatibleEntertainment(String compatibleEntertainment) {
    this.compatibleEntertainment = compatibleEntertainment;
    return this;
  }

  /**
   * Get compatibleEntertainment.
   *
   * @return compatibleEntertainment
   */
  @ApiModelProperty(value = "")


  public String getCompatibleEntertainment() {
    return compatibleEntertainment;
  }

  /**
   * Sets the compatible entertainment.
   *
   * @param compatibleEntertainment the new compatible entertainment
   */
  public void setCompatibleEntertainment(String compatibleEntertainment) {
    this.compatibleEntertainment = compatibleEntertainment;
  }

  /**
   * Condition.
   *
   * @param condition the condition
   * @return the product
   */
  public Product condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition.
   *
   * @return condition
   */
  @ApiModelProperty(value = "")


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
   * Control order.
   *
   * @param controlOrder the control order
   * @return the product
   */
  public Product controlOrder(String controlOrder) {
    this.controlOrder = controlOrder;
    return this;
  }

  /**
   * Get controlOrder.
   *
   * @return controlOrder
   */
  @ApiModelProperty(value = "")


  public String getControlOrder() {
    return controlOrder;
  }

  /**
   * Sets the control order.
   *
   * @param controlOrder the new control order
   */
  public void setControlOrder(String controlOrder) {
    this.controlOrder = controlOrder;
  }

  /**
   * Conversion factor.
   *
   * @param conversionFactor the conversion factor
   * @return the product
   */
  public Product conversionFactor(String conversionFactor) {
    this.conversionFactor = conversionFactor;
    return this;
  }

  /**
   * Get conversionFactor.
   *
   * @return conversionFactor
   */
  @ApiModelProperty(value = "")


  public String getConversionFactor() {
    return conversionFactor;
  }

  /**
   * Sets the conversion factor.
   *
   * @param conversionFactor the new conversion factor
   */
  public void setConversionFactor(String conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  /**
   * Data UOM.
   *
   * @param dataUOM the data UOM
   * @return the product
   */
  public Product dataUOM(String dataUOM) {
    this.dataUOM = dataUOM;
    return this;
  }

  /**
   * Get dataUOM.
   *
   * @return dataUOM
   */
  @ApiModelProperty(value = "")


  public String getDataUOM() {
    return dataUOM;
  }

  /**
   * Sets the data UOM.
   *
   * @param dataUOM the new data UOM
   */
  public void setDataUOM(String dataUOM) {
    this.dataUOM = dataUOM;
  }

  /**
   * Data value.
   *
   * @param dataValue the data value
   * @return the product
   */
  public Product dataValue(String dataValue) {
    this.dataValue = dataValue;
    return this;
  }

  /**
   * Get dataValue.
   *
   * @return dataValue
   */
  @ApiModelProperty(value = "")


  public String getDataValue() {
    return dataValue;
  }

  /**
   * Sets the data value.
   *
   * @param dataValue the new data value
   */
  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }

  /**
   * Delivery classification.
   *
   * @param deliveryClassification the delivery classification
   * @return the product
   */
  public Product deliveryClassification(String deliveryClassification) {
    this.deliveryClassification = deliveryClassification;
    return this;
  }

  /**
   * Get deliveryClassification.
   *
   * @return deliveryClassification
   */
  @ApiModelProperty(value = "")


  public String getDeliveryClassification() {
    return deliveryClassification;
  }

  /**
   * Sets the delivery classification.
   *
   * @param deliveryClassification the new delivery classification
   */
  public void setDeliveryClassification(String deliveryClassification) {
    this.deliveryClassification = deliveryClassification;
  }

  /**
   * Delivery method.
   *
   * @param deliveryMethod the delivery method
   * @return the product
   */
  public Product deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Get deliveryMethod.
   *
   * @return deliveryMethod
   */
  @ApiModelProperty(value = "")


  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  /**
   * Sets the delivery method.
   *
   * @param deliveryMethod the new delivery method
   */
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * Delivery on weekend.
   *
   * @param deliveryOnWeekend the delivery on weekend
   * @return the product
   */
  public Product deliveryOnWeekend(String deliveryOnWeekend) {
    this.deliveryOnWeekend = deliveryOnWeekend;
    return this;
  }

  /**
   * Get deliveryOnWeekend.
   *
   * @return deliveryOnWeekend
   */
  @ApiModelProperty(value = "")


  public String getDeliveryOnWeekend() {
    return deliveryOnWeekend;
  }

  /**
   * Sets the delivery on weekend.
   *
   * @param deliveryOnWeekend the new delivery on weekend
   */
  public void setDeliveryOnWeekend(String deliveryOnWeekend) {
    this.deliveryOnWeekend = deliveryOnWeekend;
  }

  /**
   * Delivery partner.
   *
   * @param deliveryPartner the delivery partner
   * @return the product
   */
  public Product deliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
    return this;
  }

  /**
   * Get deliveryPartner.
   *
   * @return deliveryPartner
   */
  @ApiModelProperty(value = "")


  public String getDeliveryPartner() {
    return deliveryPartner;
  }

  /**
   * Sets the delivery partner.
   *
   * @param deliveryPartner the new delivery partner
   */
  public void setDeliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
  }

  /**
   * Discount amount.
   *
   * @param discountAmount the discount amount
   * @return the product
   */
  public Product discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount.
   *
   * @return discountAmount
   */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  /**
   * Sets the discount amount.
   *
   * @param discountAmount the new discount amount
   */
  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  /**
   * Discount type.
   *
   * @param discountType the discount type
   * @return the product
   */
  public Product discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * Get discountType.
   *
   * @return discountType
   */
  @ApiModelProperty(value = "")


  public String getDiscountType() {
    return discountType;
  }

  /**
   * Sets the discount type.
   *
   * @param discountType the new discount type
   */
  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  /**
   * Display name.
   *
   * @param displayName the display name
   * @return the product
   */
  public Product displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Product display name as defined catalogue.
   *
   * @return displayName
   */
  @ApiModelProperty(value = "Product display name as defined catalogue")


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
   * Display UOM.
   *
   * @param displayUOM the display UOM
   * @return the product
   */
  public Product displayUOM(String displayUOM) {
    this.displayUOM = displayUOM;
    return this;
  }

  /**
   * Get displayUOM.
   *
   * @return displayUOM
   */
  @ApiModelProperty(value = "")


  public String getDisplayUOM() {
    return displayUOM;
  }

  /**
   * Sets the display UOM.
   *
   * @param displayUOM the new display UOM
   */
  public void setDisplayUOM(String displayUOM) {
    this.displayUOM = displayUOM;
  }

  /**
   * Duration.
   *
   * @param duration the duration
   * @return the product
   */
  public Product duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * duration of the product.
   *
   * @return duration
   */
  @ApiModelProperty(value = "duration of the product")


  public Integer getDuration() {
    return duration;
  }

  /**
   * Sets the duration.
   *
   * @param duration the new duration
   */
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  /**
   * Duration UOM.
   *
   * @param durationUOM the duration UOM
   * @return the product
   */
  public Product durationUOM(String durationUOM) {
    this.durationUOM = durationUOM;
    return this;
  }

  /**
   * UOM of duration.
   *
   * @return durationUOM
   */
  @ApiModelProperty(value = "UOM of duration")


  public String getDurationUOM() {
    return durationUOM;
  }

  /**
   * Sets the duration UOM.
   *
   * @param durationUOM the new duration UOM
   */
  public void setDurationUOM(String durationUOM) {
    this.durationUOM = durationUOM;
  }

  /**
   * Eligibiltiy subflow.
   *
   * @param eligibiltiySubflow the eligibiltiy subflow
   * @return the product
   */
  public Product eligibiltiySubflow(String eligibiltiySubflow) {
    this.eligibiltiySubflow = eligibiltiySubflow;
    return this;
  }

  /**
   * Get eligibiltiySubflow.
   *
   * @return eligibiltiySubflow
   */
  @ApiModelProperty(value = "")


  public String getEligibiltiySubflow() {
    return eligibiltiySubflow;
  }

  /**
   * Sets the eligibiltiy subflow.
   *
   * @param eligibiltiySubflow the new eligibiltiy subflow
   */
  public void setEligibiltiySubflow(String eligibiltiySubflow) {
    this.eligibiltiySubflow = eligibiltiySubflow;
  }

  /**
   * Equipment make.
   *
   * @param equipmentMake the equipment make
   * @return the product
   */
  public Product equipmentMake(String equipmentMake) {
    this.equipmentMake = equipmentMake;
    return this;
  }

  /**
   * Get equipmentMake.
   *
   * @return equipmentMake
   */
  @ApiModelProperty(value = "")


  public String getEquipmentMake() {
    return equipmentMake;
  }

  /**
   * Sets the equipment make.
   *
   * @param equipmentMake the new equipment make
   */
  public void setEquipmentMake(String equipmentMake) {
    this.equipmentMake = equipmentMake;
  }

  /**
   * Equipment model.
   *
   * @param equipmentModel the equipment model
   * @return the product
   */
  public Product equipmentModel(String equipmentModel) {
    this.equipmentModel = equipmentModel;
    return this;
  }

  /**
   * Get equipmentModel.
   *
   * @return equipmentModel
   */
  @ApiModelProperty(value = "")


  public String getEquipmentModel() {
    return equipmentModel;
  }

  /**
   * Sets the equipment model.
   *
   * @param equipmentModel the new equipment model
   */
  public void setEquipmentModel(String equipmentModel) {
    this.equipmentModel = equipmentModel;
  }

  /**
   * Est delivery date.
   *
   * @param estDeliveryDate the est delivery date
   * @return the product
   */
  public Product estDeliveryDate(String estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * Get estDeliveryDate.
   *
   * @return estDeliveryDate
   */
  @ApiModelProperty(value = "")


  public String getEstDeliveryDate() {
    return estDeliveryDate;
  }

  /**
   * Sets the est delivery date.
   *
   * @param estDeliveryDate the new est delivery date
   */
  public void setEstDeliveryDate(String estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }

  /**
   * Etdata UOM.
   *
   * @param etdataUOM the etdata UOM
   * @return the product
   */
  public Product etdataUOM(String etdataUOM) {
    this.etdataUOM = etdataUOM;
    return this;
  }

  /**
   * Get etdataUOM.
   *
   * @return etdataUOM
   */
  @ApiModelProperty(value = "")


  public String getEtdataUOM() {
    return etdataUOM;
  }

  /**
   * Sets the etdata UOM.
   *
   * @param etdataUOM the new etdata UOM
   */
  public void setEtdataUOM(String etdataUOM) {
    this.etdataUOM = etdataUOM;
  }

  /**
   * Etdata value.
   *
   * @param etdataValue the etdata value
   * @return the product
   */
  public Product etdataValue(String etdataValue) {
    this.etdataValue = etdataValue;
    return this;
  }

  /**
   * Get etdataValue.
   *
   * @return etdataValue
   */
  @ApiModelProperty(value = "")


  public String getEtdataValue() {
    return etdataValue;
  }

  /**
   * Sets the etdata value.
   *
   * @param etdataValue the new etdata value
   */
  public void setEtdataValue(String etdataValue) {
    this.etdataValue = etdataValue;
  }

  /**
   * European roaming data UOM.
   *
   * @param europeanRoamingDataUOM the european roaming data UOM
   * @return the product
   */
  public Product europeanRoamingDataUOM(String europeanRoamingDataUOM) {
    this.europeanRoamingDataUOM = europeanRoamingDataUOM;
    return this;
  }

  /**
   * Get europeanRoamingDataUOM.
   *
   * @return europeanRoamingDataUOM
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingDataUOM() {
    return europeanRoamingDataUOM;
  }

  /**
   * Sets the european roaming data UOM.
   *
   * @param europeanRoamingDataUOM the new european roaming data UOM
   */
  public void setEuropeanRoamingDataUOM(String europeanRoamingDataUOM) {
    this.europeanRoamingDataUOM = europeanRoamingDataUOM;
  }

  /**
   * European roaming data value.
   *
   * @param europeanRoamingDataValue the european roaming data value
   * @return the product
   */
  public Product europeanRoamingDataValue(String europeanRoamingDataValue) {
    this.europeanRoamingDataValue = europeanRoamingDataValue;
    return this;
  }

  /**
   * Get europeanRoamingDataValue.
   *
   * @return europeanRoamingDataValue
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingDataValue() {
    return europeanRoamingDataValue;
  }

  /**
   * Sets the european roaming data value.
   *
   * @param europeanRoamingDataValue the new european roaming data value
   */
  public void setEuropeanRoamingDataValue(String europeanRoamingDataValue) {
    this.europeanRoamingDataValue = europeanRoamingDataValue;
  }

  /**
   * European roaming minutes UOM.
   *
   * @param europeanRoamingMinutesUOM the european roaming minutes UOM
   * @return the product
   */
  public Product europeanRoamingMinutesUOM(String europeanRoamingMinutesUOM) {
    this.europeanRoamingMinutesUOM = europeanRoamingMinutesUOM;
    return this;
  }

  /**
   * Get europeanRoamingMinutesUOM.
   *
   * @return europeanRoamingMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingMinutesUOM() {
    return europeanRoamingMinutesUOM;
  }

  /**
   * Sets the european roaming minutes UOM.
   *
   * @param europeanRoamingMinutesUOM the new european roaming minutes UOM
   */
  public void setEuropeanRoamingMinutesUOM(String europeanRoamingMinutesUOM) {
    this.europeanRoamingMinutesUOM = europeanRoamingMinutesUOM;
  }

  /**
   * European roaming minutes value.
   *
   * @param europeanRoamingMinutesValue the european roaming minutes value
   * @return the product
   */
  public Product europeanRoamingMinutesValue(String europeanRoamingMinutesValue) {
    this.europeanRoamingMinutesValue = europeanRoamingMinutesValue;
    return this;
  }

  /**
   * Get europeanRoamingMinutesValue.
   *
   * @return europeanRoamingMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingMinutesValue() {
    return europeanRoamingMinutesValue;
  }

  /**
   * Sets the european roaming minutes value.
   *
   * @param europeanRoamingMinutesValue the new european roaming minutes value
   */
  public void setEuropeanRoamingMinutesValue(String europeanRoamingMinutesValue) {
    this.europeanRoamingMinutesValue = europeanRoamingMinutesValue;
  }

  /**
   * European roaming picture messages UOM.
   *
   * @param europeanRoamingPictureMessagesUOM the european roaming picture messages UOM
   * @return the product
   */
  public Product europeanRoamingPictureMessagesUOM(String europeanRoamingPictureMessagesUOM) {
    this.europeanRoamingPictureMessagesUOM = europeanRoamingPictureMessagesUOM;
    return this;
  }

  /**
   * Get europeanRoamingPictureMessagesUOM.
   *
   * @return europeanRoamingPictureMessagesUOM
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingPictureMessagesUOM() {
    return europeanRoamingPictureMessagesUOM;
  }

  /**
   * Sets the european roaming picture messages UOM.
   *
   * @param europeanRoamingPictureMessagesUOM the new european roaming picture messages UOM
   */
  public void setEuropeanRoamingPictureMessagesUOM(String europeanRoamingPictureMessagesUOM) {
    this.europeanRoamingPictureMessagesUOM = europeanRoamingPictureMessagesUOM;
  }

  /**
   * European roaming picture messages value.
   *
   * @param europeanRoamingPictureMessagesValue the european roaming picture messages value
   * @return the product
   */
  public Product europeanRoamingPictureMessagesValue(String europeanRoamingPictureMessagesValue) {
    this.europeanRoamingPictureMessagesValue = europeanRoamingPictureMessagesValue;
    return this;
  }

  /**
   * Get europeanRoamingPictureMessagesValue.
   *
   * @return europeanRoamingPictureMessagesValue
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingPictureMessagesValue() {
    return europeanRoamingPictureMessagesValue;
  }

  /**
   * Sets the european roaming picture messages value.
   *
   * @param europeanRoamingPictureMessagesValue the new european roaming picture messages value
   */
  public void setEuropeanRoamingPictureMessagesValue(String europeanRoamingPictureMessagesValue) {
    this.europeanRoamingPictureMessagesValue = europeanRoamingPictureMessagesValue;
  }

  /**
   * European roaming texts UOM.
   *
   * @param europeanRoamingTextsUOM the european roaming texts UOM
   * @return the product
   */
  public Product europeanRoamingTextsUOM(String europeanRoamingTextsUOM) {
    this.europeanRoamingTextsUOM = europeanRoamingTextsUOM;
    return this;
  }

  /**
   * Get europeanRoamingTextsUOM.
   *
   * @return europeanRoamingTextsUOM
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingTextsUOM() {
    return europeanRoamingTextsUOM;
  }

  /**
   * Sets the european roaming texts UOM.
   *
   * @param europeanRoamingTextsUOM the new european roaming texts UOM
   */
  public void setEuropeanRoamingTextsUOM(String europeanRoamingTextsUOM) {
    this.europeanRoamingTextsUOM = europeanRoamingTextsUOM;
  }

  /**
   * European roaming texts value.
   *
   * @param europeanRoamingTextsValue the european roaming texts value
   * @return the product
   */
  public Product europeanRoamingTextsValue(String europeanRoamingTextsValue) {
    this.europeanRoamingTextsValue = europeanRoamingTextsValue;
    return this;
  }

  /**
   * Get europeanRoamingTextsValue.
   *
   * @return europeanRoamingTextsValue
   */
  @ApiModelProperty(value = "")


  public String getEuropeanRoamingTextsValue() {
    return europeanRoamingTextsValue;
  }

  /**
   * Sets the european roaming texts value.
   *
   * @param europeanRoamingTextsValue the new european roaming texts value
   */
  public void setEuropeanRoamingTextsValue(String europeanRoamingTextsValue) {
    this.europeanRoamingTextsValue = europeanRoamingTextsValue;
  }

  /**
   * Extraimeuandrow UOM.
   *
   * @param extraimeuandrowUOM the extraimeuandrow UOM
   * @return the product
   */
  public Product extraimeuandrowUOM(String extraimeuandrowUOM) {
    this.extraimeuandrowUOM = extraimeuandrowUOM;
    return this;
  }

  /**
   * Get extraimeuandrowUOM.
   *
   * @return extraimeuandrowUOM
   */
  @ApiModelProperty(value = "")


  public String getExtraimeuandrowUOM() {
    return extraimeuandrowUOM;
  }

  /**
   * Sets the extraimeuandrow UOM.
   *
   * @param extraimeuandrowUOM the new extraimeuandrow UOM
   */
  public void setExtraimeuandrowUOM(String extraimeuandrowUOM) {
    this.extraimeuandrowUOM = extraimeuandrowUOM;
  }

  /**
   * Extraimeuandrow value.
   *
   * @param extraimeuandrowValue the extraimeuandrow value
   * @return the product
   */
  public Product extraimeuandrowValue(String extraimeuandrowValue) {
    this.extraimeuandrowValue = extraimeuandrowValue;
    return this;
  }

  /**
   * Get extraimeuandrowValue.
   *
   * @return extraimeuandrowValue
   */
  @ApiModelProperty(value = "")


  public String getExtraimeuandrowValue() {
    return extraimeuandrowValue;
  }

  /**
   * Sets the extraimeuandrow value.
   *
   * @param extraimeuandrowValue the new extraimeuandrow value
   */
  public void setExtraimeuandrowValue(String extraimeuandrowValue) {
    this.extraimeuandrowValue = extraimeuandrowValue;
  }

  /**
   * Extraimeuandus UOM.
   *
   * @param extraimeuandusUOM the extraimeuandus UOM
   * @return the product
   */
  public Product extraimeuandusUOM(String extraimeuandusUOM) {
    this.extraimeuandusUOM = extraimeuandusUOM;
    return this;
  }

  /**
   * Get extraimeuandusUOM.
   *
   * @return extraimeuandusUOM
   */
  @ApiModelProperty(value = "")


  public String getExtraimeuandusUOM() {
    return extraimeuandusUOM;
  }

  /**
   * Sets the extraimeuandus UOM.
   *
   * @param extraimeuandusUOM the new extraimeuandus UOM
   */
  public void setExtraimeuandusUOM(String extraimeuandusUOM) {
    this.extraimeuandusUOM = extraimeuandusUOM;
  }

  /**
   * Extraimeuandus value.
   *
   * @param extraimeuandusValue the extraimeuandus value
   * @return the product
   */
  public Product extraimeuandusValue(String extraimeuandusValue) {
    this.extraimeuandusValue = extraimeuandusValue;
    return this;
  }

  /**
   * Get extraimeuandusValue.
   *
   * @return extraimeuandusValue
   */
  @ApiModelProperty(value = "")


  public String getExtraimeuandusValue() {
    return extraimeuandusValue;
  }

  /**
   * Sets the extraimeuandus value.
   *
   * @param extraimeuandusValue the new extraimeuandus value
   */
  public void setExtraimeuandusValue(String extraimeuandusValue) {
    this.extraimeuandusValue = extraimeuandusValue;
  }

  /**
   * Global roaming data UOM.
   *
   * @param globalRoamingDataUOM the global roaming data UOM
   * @return the product
   */
  public Product globalRoamingDataUOM(String globalRoamingDataUOM) {
    this.globalRoamingDataUOM = globalRoamingDataUOM;
    return this;
  }

  /**
   * Get globalRoamingDataUOM.
   *
   * @return globalRoamingDataUOM
   */
  @ApiModelProperty(value = "")


  public String getGlobalRoamingDataUOM() {
    return globalRoamingDataUOM;
  }

  /**
   * Sets the global roaming data UOM.
   *
   * @param globalRoamingDataUOM the new global roaming data UOM
   */
  public void setGlobalRoamingDataUOM(String globalRoamingDataUOM) {
    this.globalRoamingDataUOM = globalRoamingDataUOM;
  }

  /**
   * Global roaming data value.
   *
   * @param globalRoamingDataValue the global roaming data value
   * @return the product
   */
  public Product globalRoamingDataValue(String globalRoamingDataValue) {
    this.globalRoamingDataValue = globalRoamingDataValue;
    return this;
  }

  /**
   * Get globalRoamingDataValue.
   *
   * @return globalRoamingDataValue
   */
  @ApiModelProperty(value = "")


  public String getGlobalRoamingDataValue() {
    return globalRoamingDataValue;
  }

  /**
   * Sets the global roaming data value.
   *
   * @param globalRoamingDataValue the new global roaming data value
   */
  public void setGlobalRoamingDataValue(String globalRoamingDataValue) {
    this.globalRoamingDataValue = globalRoamingDataValue;
  }

  /**
   * Global roaming minutes UOM.
   *
   * @param globalRoamingMinutesUOM the global roaming minutes UOM
   * @return the product
   */
  public Product globalRoamingMinutesUOM(String globalRoamingMinutesUOM) {
    this.globalRoamingMinutesUOM = globalRoamingMinutesUOM;
    return this;
  }

  /**
   * Get globalRoamingMinutesUOM.
   *
   * @return globalRoamingMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getGlobalRoamingMinutesUOM() {
    return globalRoamingMinutesUOM;
  }

  /**
   * Sets the global roaming minutes UOM.
   *
   * @param globalRoamingMinutesUOM the new global roaming minutes UOM
   */
  public void setGlobalRoamingMinutesUOM(String globalRoamingMinutesUOM) {
    this.globalRoamingMinutesUOM = globalRoamingMinutesUOM;
  }

  /**
   * Global roaming minutes value.
   *
   * @param globalRoamingMinutesValue the global roaming minutes value
   * @return the product
   */
  public Product globalRoamingMinutesValue(String globalRoamingMinutesValue) {
    this.globalRoamingMinutesValue = globalRoamingMinutesValue;
    return this;
  }

  /**
   * Get globalRoamingMinutesValue.
   *
   * @return globalRoamingMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getGlobalRoamingMinutesValue() {
    return globalRoamingMinutesValue;
  }

  /**
   * Sets the global roaming minutes value.
   *
   * @param globalRoamingMinutesValue the new global roaming minutes value
   */
  public void setGlobalRoamingMinutesValue(String globalRoamingMinutesValue) {
    this.globalRoamingMinutesValue = globalRoamingMinutesValue;
  }

  /**
   * Global roaming texts UOM.
   *
   * @param globalRoamingTextsUOM the global roaming texts UOM
   * @return the product
   */
  public Product globalRoamingTextsUOM(String globalRoamingTextsUOM) {
    this.globalRoamingTextsUOM = globalRoamingTextsUOM;
    return this;
  }

  /**
   * Get globalRoamingTextsUOM.
   *
   * @return globalRoamingTextsUOM
   */
  @ApiModelProperty(value = "")


  public String getGlobalRoamingTextsUOM() {
    return globalRoamingTextsUOM;
  }

  /**
   * Sets the global roaming texts UOM.
   *
   * @param globalRoamingTextsUOM the new global roaming texts UOM
   */
  public void setGlobalRoamingTextsUOM(String globalRoamingTextsUOM) {
    this.globalRoamingTextsUOM = globalRoamingTextsUOM;
  }

  /**
   * Global roaming texts value.
   *
   * @param globalRoamingTextsValue the global roaming texts value
   * @return the product
   */
  public Product globalRoamingTextsValue(String globalRoamingTextsValue) {
    this.globalRoamingTextsValue = globalRoamingTextsValue;
    return this;
  }

  /**
   * Get globalRoamingTextsValue.
   *
   * @return globalRoamingTextsValue
   */
  @ApiModelProperty(value = "")


  public String getGlobalRoamingTextsValue() {
    return globalRoamingTextsValue;
  }

  /**
   * Sets the global roaming texts value.
   *
   * @param globalRoamingTextsValue the new global roaming texts value
   */
  public void setGlobalRoamingTextsValue(String globalRoamingTextsValue) {
    this.globalRoamingTextsValue = globalRoamingTextsValue;
  }

  /**
   * Helptext.
   *
   * @param helptext the helptext
   * @return the product
   */
  public Product helptext(String helptext) {
    this.helptext = helptext;
    return this;
  }

  /**
   * Get helptext.
   *
   * @return helptext
   */
  @ApiModelProperty(value = "")


  public String getHelptext() {
    return helptext;
  }

  /**
   * Sets the helptext.
   *
   * @param helptext the new helptext
   */
  public void setHelptext(String helptext) {
    this.helptext = helptext;
  }

  /**
   * Helpurl.
   *
   * @param helpurl the helpurl
   * @return the product
   */
  public Product helpurl(String helpurl) {
    this.helpurl = helpurl;
    return this;
  }

  /**
   * Get helpurl.
   *
   * @return helpurl
   */
  @ApiModelProperty(value = "")


  public String getHelpurl() {
    return helpurl;
  }

  /**
   * Sets the helpurl.
   *
   * @param helpurl the new helpurl
   */
  public void setHelpurl(String helpurl) {
    this.helpurl = helpurl;
  }

  /**
   * Image UR ls full back.
   *
   * @param imageURLsFullBack the image UR ls full back
   * @return the product
   */
  public Product imageURLsFullBack(String imageURLsFullBack) {
    this.imageURLsFullBack = imageURLsFullBack;
    return this;
  }

  /**
   * Get imageURLsFullBack.
   *
   * @return imageURLsFullBack
   */
  @ApiModelProperty(value = "")


  public String getImageURLsFullBack() {
    return imageURLsFullBack;
  }

  /**
   * Sets the image UR ls full back.
   *
   * @param imageURLsFullBack the new image UR ls full back
   */
  public void setImageURLsFullBack(String imageURLsFullBack) {
    this.imageURLsFullBack = imageURLsFullBack;
  }

  /**
   * Image UR ls full hero.
   *
   * @param imageURLsFullHero the image UR ls full hero
   * @return the product
   */
  public Product imageURLsFullHero(String imageURLsFullHero) {
    this.imageURLsFullHero = imageURLsFullHero;
    return this;
  }

  /**
   * Get imageURLsFullHero.
   *
   * @return imageURLsFullHero
   */
  @ApiModelProperty(value = "")


  public String getImageURLsFullHero() {
    return imageURLsFullHero;
  }

  /**
   * Sets the image UR ls full hero.
   *
   * @param imageURLsFullHero the new image UR ls full hero
   */
  public void setImageURLsFullHero(String imageURLsFullHero) {
    this.imageURLsFullHero = imageURLsFullHero;
  }

  /**
   * Image UR ls full left.
   *
   * @param imageURLsFullLeft the image UR ls full left
   * @return the product
   */
  public Product imageURLsFullLeft(String imageURLsFullLeft) {
    this.imageURLsFullLeft = imageURLsFullLeft;
    return this;
  }

  /**
   * Get imageURLsFullLeft.
   *
   * @return imageURLsFullLeft
   */
  @ApiModelProperty(value = "")


  public String getImageURLsFullLeft() {
    return imageURLsFullLeft;
  }

  /**
   * Sets the image UR ls full left.
   *
   * @param imageURLsFullLeft the new image UR ls full left
   */
  public void setImageURLsFullLeft(String imageURLsFullLeft) {
    this.imageURLsFullLeft = imageURLsFullLeft;
  }

  /**
   * Image UR ls full right.
   *
   * @param imageURLsFullRight the image UR ls full right
   * @return the product
   */
  public Product imageURLsFullRight(String imageURLsFullRight) {
    this.imageURLsFullRight = imageURLsFullRight;
    return this;
  }

  /**
   * Get imageURLsFullRight.
   *
   * @return imageURLsFullRight
   */
  @ApiModelProperty(value = "")


  public String getImageURLsFullRight() {
    return imageURLsFullRight;
  }

  /**
   * Sets the image UR ls full right.
   *
   * @param imageURLsFullRight the new image UR ls full right
   */
  public void setImageURLsFullRight(String imageURLsFullRight) {
    this.imageURLsFullRight = imageURLsFullRight;
  }

  /**
   * Image UR ls full side.
   *
   * @param imageURLsFullSide the image UR ls full side
   * @return the product
   */
  public Product imageURLsFullSide(String imageURLsFullSide) {
    this.imageURLsFullSide = imageURLsFullSide;
    return this;
  }

  /**
   * Get imageURLsFullSide.
   *
   * @return imageURLsFullSide
   */
  @ApiModelProperty(value = "")


  public String getImageURLsFullSide() {
    return imageURLsFullSide;
  }

  /**
   * Sets the image UR ls full side.
   *
   * @param imageURLsFullSide the new image UR ls full side
   */
  public void setImageURLsFullSide(String imageURLsFullSide) {
    this.imageURLsFullSide = imageURLsFullSide;
  }

  /**
   * Image UR ls grid.
   *
   * @param imageURLsGrid the image UR ls grid
   * @return the product
   */
  public Product imageURLsGrid(String imageURLsGrid) {
    this.imageURLsGrid = imageURLsGrid;
    return this;
  }

  /**
   * Get imageURLsGrid.
   *
   * @return imageURLsGrid
   */
  @ApiModelProperty(value = "")


  public String getImageURLsGrid() {
    return imageURLsGrid;
  }

  /**
   * Sets the image UR ls grid.
   *
   * @param imageURLsGrid the new image UR ls grid
   */
  public void setImageURLsGrid(String imageURLsGrid) {
    this.imageURLsGrid = imageURLsGrid;
  }

  /**
   * Image UR ls icon.
   *
   * @param imageURLsIcon the image UR ls icon
   * @return the product
   */
  public Product imageURLsIcon(String imageURLsIcon) {
    this.imageURLsIcon = imageURLsIcon;
    return this;
  }

  /**
   * Get imageURLsIcon.
   *
   * @return imageURLsIcon
   */
  @ApiModelProperty(value = "")


  public String getImageURLsIcon() {
    return imageURLsIcon;
  }

  /**
   * Sets the image UR ls icon.
   *
   * @param imageURLsIcon the new image UR ls icon
   */
  public void setImageURLsIcon(String imageURLsIcon) {
    this.imageURLsIcon = imageURLsIcon;
  }

  /**
   * Image UR ls small.
   *
   * @param imageURLsSmall the image UR ls small
   * @return the product
   */
  public Product imageURLsSmall(String imageURLsSmall) {
    this.imageURLsSmall = imageURLsSmall;
    return this;
  }

  /**
   * Get imageURLsSmall.
   *
   * @return imageURLsSmall
   */
  @ApiModelProperty(value = "")


  public String getImageURLsSmall() {
    return imageURLsSmall;
  }

  /**
   * Sets the image UR ls small.
   *
   * @param imageURLsSmall the new image UR ls small
   */
  public void setImageURLsSmall(String imageURLsSmall) {
    this.imageURLsSmall = imageURLsSmall;
  }

  /**
   * Image UR ls sticker.
   *
   * @param imageURLsSticker the image UR ls sticker
   * @return the product
   */
  public Product imageURLsSticker(String imageURLsSticker) {
    this.imageURLsSticker = imageURLsSticker;
    return this;
  }

  /**
   * Get imageURLsSticker.
   *
   * @return imageURLsSticker
   */
  @ApiModelProperty(value = "")


  public String getImageURLsSticker() {
    return imageURLsSticker;
  }

  /**
   * Sets the image UR ls sticker.
   *
   * @param imageURLsSticker the new image UR ls sticker
   */
  public void setImageURLsSticker(String imageURLsSticker) {
    this.imageURLsSticker = imageURLsSticker;
  }

  /**
   * Image UR ls thumbs front.
   *
   * @param imageURLsThumbsFront the image UR ls thumbs front
   * @return the product
   */
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

  /**
   * Sets the image UR ls thumbs front.
   *
   * @param imageURLsThumbsFront the new image UR ls thumbs front
   */
  public void setImageURLsThumbsFront(String imageURLsThumbsFront) {
    this.imageURLsThumbsFront = imageURLsThumbsFront;
  }

  /**
   * Image UR ls thumbs left.
   *
   * @param imageURLsThumbsLeft the image UR ls thumbs left
   * @return the product
   */
  public Product imageURLsThumbsLeft(String imageURLsThumbsLeft) {
    this.imageURLsThumbsLeft = imageURLsThumbsLeft;
    return this;
  }

  /**
   * Get imageURLsThumbsLeft.
   *
   * @return imageURLsThumbsLeft
   */
  @ApiModelProperty(value = "")


  public String getImageURLsThumbsLeft() {
    return imageURLsThumbsLeft;
  }

  /**
   * Sets the image UR ls thumbs left.
   *
   * @param imageURLsThumbsLeft the new image UR ls thumbs left
   */
  public void setImageURLsThumbsLeft(String imageURLsThumbsLeft) {
    this.imageURLsThumbsLeft = imageURLsThumbsLeft;
  }

  /**
   * Image UR ls thumbs right.
   *
   * @param imageURLsThumbsRight the image UR ls thumbs right
   * @return the product
   */
  public Product imageURLsThumbsRight(String imageURLsThumbsRight) {
    this.imageURLsThumbsRight = imageURLsThumbsRight;
    return this;
  }

  /**
   * Get imageURLsThumbsRight.
   *
   * @return imageURLsThumbsRight
   */
  @ApiModelProperty(value = "")


  public String getImageURLsThumbsRight() {
    return imageURLsThumbsRight;
  }

  /**
   * Sets the image UR ls thumbs right.
   *
   * @param imageURLsThumbsRight the new image UR ls thumbs right
   */
  public void setImageURLsThumbsRight(String imageURLsThumbsRight) {
    this.imageURLsThumbsRight = imageURLsThumbsRight;
  }

  /**
   * Image UR ls thumbs side.
   *
   * @param imageURLsThumbsSide the image UR ls thumbs side
   * @return the product
   */
  public Product imageURLsThumbsSide(String imageURLsThumbsSide) {
    this.imageURLsThumbsSide = imageURLsThumbsSide;
    return this;
  }

  /**
   * Get imageURLsThumbsSide.
   *
   * @return imageURLsThumbsSide
   */
  @ApiModelProperty(value = "")


  public String getImageURLsThumbsSide() {
    return imageURLsThumbsSide;
  }

  /**
   * Sets the image UR ls thumbs side.
   *
   * @param imageURLsThumbsSide the new image UR ls thumbs side
   */
  public void setImageURLsThumbsSide(String imageURLsThumbsSide) {
    this.imageURLsThumbsSide = imageURLsThumbsSide;
  }

  /**
   * In the box.
   *
   * @param inTheBox the in the box
   * @return the product
   */
  public Product inTheBox(String inTheBox) {
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
   * International minutes UOM.
   *
   * @param internationalMinutesUOM the international minutes UOM
   * @return the product
   */
  public Product internationalMinutesUOM(String internationalMinutesUOM) {
    this.internationalMinutesUOM = internationalMinutesUOM;
    return this;
  }

  /**
   * Get internationalMinutesUOM.
   *
   * @return internationalMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getInternationalMinutesUOM() {
    return internationalMinutesUOM;
  }

  /**
   * Sets the international minutes UOM.
   *
   * @param internationalMinutesUOM the new international minutes UOM
   */
  public void setInternationalMinutesUOM(String internationalMinutesUOM) {
    this.internationalMinutesUOM = internationalMinutesUOM;
  }

  /**
   * International minutes value.
   *
   * @param internationalMinutesValue the international minutes value
   * @return the product
   */
  public Product internationalMinutesValue(String internationalMinutesValue) {
    this.internationalMinutesValue = internationalMinutesValue;
    return this;
  }

  /**
   * Get internationalMinutesValue.
   *
   * @return internationalMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getInternationalMinutesValue() {
    return internationalMinutesValue;
  }

  /**
   * Sets the international minutes value.
   *
   * @param internationalMinutesValue the new international minutes value
   */
  public void setInternationalMinutesValue(String internationalMinutesValue) {
    this.internationalMinutesValue = internationalMinutesValue;
  }

  /**
   * International texts UOM.
   *
   * @param internationalTextsUOM the international texts UOM
   * @return the product
   */
  public Product internationalTextsUOM(String internationalTextsUOM) {
    this.internationalTextsUOM = internationalTextsUOM;
    return this;
  }

  /**
   * Get internationalTextsUOM.
   *
   * @return internationalTextsUOM
   */
  @ApiModelProperty(value = "")


  public String getInternationalTextsUOM() {
    return internationalTextsUOM;
  }

  /**
   * Sets the international texts UOM.
   *
   * @param internationalTextsUOM the new international texts UOM
   */
  public void setInternationalTextsUOM(String internationalTextsUOM) {
    this.internationalTextsUOM = internationalTextsUOM;
  }

  /**
   * International texts value.
   *
   * @param internationalTextsValue the international texts value
   * @return the product
   */
  public Product internationalTextsValue(String internationalTextsValue) {
    this.internationalTextsValue = internationalTextsValue;
    return this;
  }

  /**
   * international tests value.
   *
   * @return internationalTextsValue
   */
  @ApiModelProperty(value = "international tests value")


  public String getInternationalTextsValue() {
    return internationalTextsValue;
  }

  /**
   * Sets the international texts value.
   *
   * @param internationalTextsValue the new international texts value
   */
  public void setInternationalTextsValue(String internationalTextsValue) {
    this.internationalTextsValue = internationalTextsValue;
  }

  /**
   * Checks if is battery.
   *
   * @param isBattery the is battery
   * @return the product
   */
  public Product isBattery(String isBattery) {
    this.isBattery = isBattery;
    return this;
  }

  /**
   * Get isBattery.
   *
   * @return isBattery
   */
  @ApiModelProperty(value = "")


  public String getIsBattery() {
    return isBattery;
  }

  /**
   * Sets the checks if is battery.
   *
   * @param isBattery the new checks if is battery
   */
  public void setIsBattery(String isBattery) {
    this.isBattery = isBattery;
  }

  /**
   * Checks if is device product.
   *
   * @param isDeviceProduct the is device product
   * @return the product
   */
  public Product isDeviceProduct(String isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
    return this;
  }

  /**
   * Get isDeviceProduct.
   *
   * @return isDeviceProduct
   */
  @ApiModelProperty(value = "")


  public String getIsDeviceProduct() {
    return isDeviceProduct;
  }

  /**
   * Sets the checks if is device product.
   *
   * @param isDeviceProduct the new checks if is device product
   */
  public void setIsDeviceProduct(String isDeviceProduct) {
    this.isDeviceProduct = isDeviceProduct;
  }

  /**
   * Checks if is displayable acq.
   *
   * @param isDisplayableAcq the is displayable acq
   * @return the product
   */
  public Product isDisplayableAcq(String isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
    return this;
  }

  /**
   * Get isDisplayableAcq.
   *
   * @return isDisplayableAcq
   */
  @ApiModelProperty(value = "")


  public String getIsDisplayableAcq() {
    return isDisplayableAcq;
  }

  /**
   * Sets the checks if is displayable acq.
   *
   * @param isDisplayableAcq the new checks if is displayable acq
   */
  public void setIsDisplayableAcq(String isDisplayableAcq) {
    this.isDisplayableAcq = isDisplayableAcq;
  }

  /**
   * Checks if is displayable ecare.
   *
   * @param isDisplayableEcare the is displayable ecare
   * @return the product
   */
  public Product isDisplayableEcare(String isDisplayableEcare) {
    this.isDisplayableEcare = isDisplayableEcare;
    return this;
  }

  /**
   * Get isDisplayableEcare.
   *
   * @return isDisplayableEcare
   */
  @ApiModelProperty(value = "")


  public String getIsDisplayableEcare() {
    return isDisplayableEcare;
  }

  /**
   * Sets the checks if is displayable ecare.
   *
   * @param isDisplayableEcare the new checks if is displayable ecare
   */
  public void setIsDisplayableEcare(String isDisplayableEcare) {
    this.isDisplayableEcare = isDisplayableEcare;
  }

  /**
   * Checks if is displayable ret.
   *
   * @param isDisplayableRet the is displayable ret
   * @return the product
   */
  public Product isDisplayableRet(String isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
    return this;
  }

  /**
   * Get isDisplayableRet.
   *
   * @return isDisplayableRet
   */
  @ApiModelProperty(value = "")


  public String getIsDisplayableRet() {
    return isDisplayableRet;
  }

  /**
   * Sets the checks if is displayable ret.
   *
   * @param isDisplayableRet the new checks if is displayable ret
   */
  public void setIsDisplayableRet(String isDisplayableRet) {
    this.isDisplayableRet = isDisplayableRet;
  }

  /**
   * Checks if is displaybale saved basket.
   *
   * @param isDisplaybaleSavedBasket the is displaybale saved basket
   * @return the product
   */
  public Product isDisplaybaleSavedBasket(String isDisplaybaleSavedBasket) {
    this.isDisplaybaleSavedBasket = isDisplaybaleSavedBasket;
    return this;
  }

  /**
   * Get isDisplaybaleSavedBasket.
   *
   * @return isDisplaybaleSavedBasket
   */
  @ApiModelProperty(value = "")


  public String getIsDisplaybaleSavedBasket() {
    return isDisplaybaleSavedBasket;
  }

  /**
   * Sets the checks if is displaybale saved basket.
   *
   * @param isDisplaybaleSavedBasket the new checks if is displaybale saved basket
   */
  public void setIsDisplaybaleSavedBasket(String isDisplaybaleSavedBasket) {
    this.isDisplaybaleSavedBasket = isDisplaybaleSavedBasket;
  }

  /**
   * Checks if is sellable acq.
   *
   * @param isSellableAcq the is sellable acq
   * @return the product
   */
  public Product isSellableAcq(String isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
    return this;
  }

  /**
   * Get isSellableAcq.
   *
   * @return isSellableAcq
   */
  @ApiModelProperty(value = "")


  public String getIsSellableAcq() {
    return isSellableAcq;
  }

  /**
   * Sets the checks if is sellable acq.
   *
   * @param isSellableAcq the new checks if is sellable acq
   */
  public void setIsSellableAcq(String isSellableAcq) {
    this.isSellableAcq = isSellableAcq;
  }

  /**
   * Checks if is sellable E care.
   *
   * @param isSellableECare the is sellable E care
   * @return the product
   */
  public Product isSellableECare(String isSellableECare) {
    this.isSellableECare = isSellableECare;
    return this;
  }

  /**
   * Get isSellableECare.
   *
   * @return isSellableECare
   */
  @ApiModelProperty(value = "")


  public String getIsSellableECare() {
    return isSellableECare;
  }

  /**
   * Sets the checks if is sellable E care.
   *
   * @param isSellableECare the new checks if is sellable E care
   */
  public void setIsSellableECare(String isSellableECare) {
    this.isSellableECare = isSellableECare;
  }

  /**
   * Checks if is sellable ret.
   *
   * @param isSellableRet the is sellable ret
   * @return the product
   */
  public Product isSellableRet(String isSellableRet) {
    this.isSellableRet = isSellableRet;
    return this;
  }

  /**
   * Get isSellableRet.
   *
   * @return isSellableRet
   */
  @ApiModelProperty(value = "")


  public String getIsSellableRet() {
    return isSellableRet;
  }

  /**
   * Sets the checks if is sellable ret.
   *
   * @param isSellableRet the new checks if is sellable ret
   */
  public void setIsSellableRet(String isSellableRet) {
    this.isSellableRet = isSellableRet;
  }

  /**
   * Checks if is services product.
   *
   * @param isServicesProduct the is services product
   * @return the product
   */
  public Product isServicesProduct(String isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
    return this;
  }

  /**
   * boolean value to verify if it is service product.
   *
   * @return isServicesProduct
   */
  @ApiModelProperty(value = "boolean value to verify if it is service product")


  public String getIsServicesProduct() {
    return isServicesProduct;
  }

  /**
   * Sets the checks if is services product.
   *
   * @param isServicesProduct the new checks if is services product
   */
  public void setIsServicesProduct(String isServicesProduct) {
    this.isServicesProduct = isServicesProduct;
  }

  /**
   * Landline minutes UOM.
   *
   * @param landlineMinutesUOM the landline minutes UOM
   * @return the product
   */
  public Product landlineMinutesUOM(String landlineMinutesUOM) {
    this.landlineMinutesUOM = landlineMinutesUOM;
    return this;
  }

  /**
   * Get landlineMinutesUOM.
   *
   * @return landlineMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getLandlineMinutesUOM() {
    return landlineMinutesUOM;
  }

  /**
   * Sets the landline minutes UOM.
   *
   * @param landlineMinutesUOM the new landline minutes UOM
   */
  public void setLandlineMinutesUOM(String landlineMinutesUOM) {
    this.landlineMinutesUOM = landlineMinutesUOM;
  }

  /**
   * Landline minutes value.
   *
   * @param landlineMinutesValue the landline minutes value
   * @return the product
   */
  public Product landlineMinutesValue(String landlineMinutesValue) {
    this.landlineMinutesValue = landlineMinutesValue;
    return this;
  }

  /**
   * Get landlineMinutesValue.
   *
   * @return landlineMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getLandlineMinutesValue() {
    return landlineMinutesValue;
  }

  /**
   * Sets the landline minutes value.
   *
   * @param landlineMinutesValue the new landline minutes value
   */
  public void setLandlineMinutesValue(String landlineMinutesValue) {
    this.landlineMinutesValue = landlineMinutesValue;
  }

  /**
   * Lead plan id.
   *
   * @param leadPlanId the lead plan id
   * @return the product
   */
  public Product leadPlanId(String leadPlanId) {
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
   * @return the product
   */
  public Product listOfCompatibleBundles(List<String> listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
    return this;
  }

  /**
   * Adds the list of compatible bundles item.
   *
   * @param listOfCompatibleBundlesItem the list of compatible bundles item
   * @return the product
   */
  public Product addListOfCompatibleBundlesItem(String listOfCompatibleBundlesItem) {
    if (this.listOfCompatibleBundles == null) {
      this.listOfCompatibleBundles = new ArrayList<>();
    }
    this.listOfCompatibleBundles.add(listOfCompatibleBundlesItem);
    return this;
  }

  /**
   * Get listOfCompatibleBundles.
   *
   * @return listOfCompatibleBundles
   */
  @ApiModelProperty(value = "")


  public List<String> getListOfCompatibleBundles() {
    return listOfCompatibleBundles;
  }

  /**
   * Sets the list of compatible bundles.
   *
   * @param listOfCompatibleBundles the new list of compatible bundles
   */
  public void setListOfCompatibleBundles(List<String> listOfCompatibleBundles) {
    this.listOfCompatibleBundles = listOfCompatibleBundles;
  }

  /**
   * Mef product name.
   *
   * @param mefProductName the mef product name
   * @return the product
   */
  public Product mefProductName(String mefProductName) {
    this.mefProductName = mefProductName;
    return this;
  }

  /**
   * Get mefProductName.
   *
   * @return mefProductName
   */
  @ApiModelProperty(value = "")


  public String getMefProductName() {
    return mefProductName;
  }

  /**
   * Sets the mef product name.
   *
   * @param mefProductName the new mef product name
   */
  public void setMefProductName(String mefProductName) {
    this.mefProductName = mefProductName;
  }

  /**
   * Num reviews.
   *
   * @param numReviews the num reviews
   * @return the product
   */
  public Product numReviews(String numReviews) {
    this.numReviews = numReviews;
    return this;
  }

  /**
   * Get numReviews.
   *
   * @return numReviews
   */
  @ApiModelProperty(value = "")


  public String getNumReviews() {
    return numReviews;
  }

  /**
   * Sets the num reviews.
   *
   * @param numReviews the new num reviews
   */
  public void setNumReviews(String numReviews) {
    this.numReviews = numReviews;
  }

  /**
   * Order.
   *
   * @param order the order
   * @return the product
   */
  public Product order(String order) {
    this.order = order;
    return this;
  }

  /**
   * order id of the product.
   *
   * @return order
   */
  @ApiModelProperty(value = "order id of the product")


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
   * Parent product id.
   *
   * @param parentProductId the parent product id
   * @return the product
   */
  public Product parentProductId(String parentProductId) {
    this.parentProductId = parentProductId;
    return this;
  }

  /**
   * parent product id.
   *
   * @return parentProductId
   */
  @ApiModelProperty(value = "parent product id")


  public String getParentProductId() {
    return parentProductId;
  }

  /**
   * Sets the parent product id.
   *
   * @param parentProductId the new parent product id
   */
  public void setParentProductId(String parentProductId) {
    this.parentProductId = parentProductId;
  }

  /**
   * Pd grp cmp acc.
   *
   * @param pdGrpCmpAcc the pd grp cmp acc
   * @return the product
   */
  public Product pdGrpCmpAcc(String pdGrpCmpAcc) {
    this.pdGrpCmpAcc = pdGrpCmpAcc;
    return this;
  }

  /**
   * Get pdGrpCmpAcc.
   *
   * @return pdGrpCmpAcc
   */
  @ApiModelProperty(value = "")


  public String getPdGrpCmpAcc() {
    return pdGrpCmpAcc;
  }

  /**
   * Sets the pd grp cmp acc.
   *
   * @param pdGrpCmpAcc the new pd grp cmp acc
   */
  public void setPdGrpCmpAcc(String pdGrpCmpAcc) {
    this.pdGrpCmpAcc = pdGrpCmpAcc;
  }

  /**
   * Pd grp rec acc.
   *
   * @param pdGrpRecAcc the pd grp rec acc
   * @return the product
   */
  public Product pdGrpRecAcc(String pdGrpRecAcc) {
    this.pdGrpRecAcc = pdGrpRecAcc;
    return this;
  }

  /**
   * Get pdGrpRecAcc.
   *
   * @return pdGrpRecAcc
   */
  @ApiModelProperty(value = "")


  public String getPdGrpRecAcc() {
    return pdGrpRecAcc;
  }

  /**
   * Sets the pd grp rec acc.
   *
   * @param pdGrpRecAcc the new pd grp rec acc
   */
  public void setPdGrpRecAcc(String pdGrpRecAcc) {
    this.pdGrpRecAcc = pdGrpRecAcc;
  }

  /**
   * Pd grp rec extr.
   *
   * @param pdGrpRecExtr the pd grp rec extr
   * @return the product
   */
  public Product pdGrpRecExtr(String pdGrpRecExtr) {
    this.pdGrpRecExtr = pdGrpRecExtr;
    return this;
  }

  /**
   * Get pdGrpRecExtr.
   *
   * @return pdGrpRecExtr
   */
  @ApiModelProperty(value = "")


  public String getPdGrpRecExtr() {
    return pdGrpRecExtr;
  }

  /**
   * Sets the pd grp rec extr.
   *
   * @param pdGrpRecExtr the new pd grp rec extr
   */
  public void setPdGrpRecExtr(String pdGrpRecExtr) {
    this.pdGrpRecExtr = pdGrpRecExtr;
  }

  /**
   * Pd grpvariant.
   *
   * @param pdGrpvariant the pd grpvariant
   * @return the product
   */
  public Product pdGrpvariant(String pdGrpvariant) {
    this.pdGrpvariant = pdGrpvariant;
    return this;
  }

  /**
   * Get pdGrpvariant.
   *
   * @return pdGrpvariant
   */
  @ApiModelProperty(value = "")


  public String getPdGrpvariant() {
    return pdGrpvariant;
  }

  /**
   * Sets the pd grpvariant.
   *
   * @param pdGrpvariant the new pd grpvariant
   */
  public void setPdGrpvariant(String pdGrpvariant) {
    this.pdGrpvariant = pdGrpvariant;
  }

  /**
   * Picture messages UOM.
   *
   * @param pictureMessagesUOM the picture messages UOM
   * @return the product
   */
  public Product pictureMessagesUOM(String pictureMessagesUOM) {
    this.pictureMessagesUOM = pictureMessagesUOM;
    return this;
  }

  /**
   * Get pictureMessagesUOM.
   *
   * @return pictureMessagesUOM
   */
  @ApiModelProperty(value = "")


  public String getPictureMessagesUOM() {
    return pictureMessagesUOM;
  }

  /**
   * Sets the picture messages UOM.
   *
   * @param pictureMessagesUOM the new picture messages UOM
   */
  public void setPictureMessagesUOM(String pictureMessagesUOM) {
    this.pictureMessagesUOM = pictureMessagesUOM;
  }

  /**
   * Post desc.
   *
   * @param postDesc the post desc
   * @return the product
   */
  public Product postDesc(String postDesc) {
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
   * @return the product
   */
  public Product postDescMobile(String postDescMobile) {
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
   * @return the product
   */
  public Product preDesc(String preDesc) {
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
   * @return the product
   */
  public Product preDescMobile(String preDescMobile) {
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
   * Pre orderable.
   *
   * @param preOrderable the pre orderable
   * @return the product
   */
  public Product preOrderable(String preOrderable) {
    this.preOrderable = preOrderable;
    return this;
  }

  /**
   * Get preOrderable.
   *
   * @return preOrderable
   */
  @ApiModelProperty(value = "")


  public String getPreOrderable() {
    return preOrderable;
  }

  /**
   * Sets the pre orderable.
   *
   * @param preOrderable the new pre orderable
   */
  public void setPreOrderable(String preOrderable) {
    this.preOrderable = preOrderable;
  }

  /**
   * Price gross OVR.
   *
   * @param priceGrossOVR the price gross OVR
   * @return the product
   */
  public Product priceGrossOVR(String priceGrossOVR) {
    this.priceGrossOVR = priceGrossOVR;
    return this;
  }

  /**
   * Get priceGrossOVR.
   *
   * @return priceGrossOVR
   */
  @ApiModelProperty(value = "")


  public String getPriceGrossOVR() {
    return priceGrossOVR;
  }

  /**
   * Sets the price gross OVR.
   *
   * @param priceGrossOVR the new price gross OVR
   */
  public void setPriceGrossOVR(String priceGrossOVR) {
    this.priceGrossOVR = priceGrossOVR;
  }

  /**
   * Price net OVR.
   *
   * @param priceNetOVR the price net OVR
   * @return the product
   */
  public Product priceNetOVR(String priceNetOVR) {
    this.priceNetOVR = priceNetOVR;
    return this;
  }

  /**
   * Get priceNetOVR.
   *
   * @return priceNetOVR
   */
  @ApiModelProperty(value = "")


  public String getPriceNetOVR() {
    return priceNetOVR;
  }

  /**
   * Sets the price net OVR.
   *
   * @param priceNetOVR the new price net OVR
   */
  public void setPriceNetOVR(String priceNetOVR) {
    this.priceNetOVR = priceNetOVR;
  }

  /**
   * Price type.
   *
   * @param priceType the price type
   * @return the product
   */
  public Product priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType.
   *
   * @return priceType
   */
  @ApiModelProperty(value = "")


  public String getPriceType() {
    return priceType;
  }

  /**
   * Sets the price type.
   *
   * @param priceType the new price type
   */
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  /**
   * Price vat OVR.
   *
   * @param priceVatOVR the price vat OVR
   * @return the product
   */
  public Product priceVatOVR(String priceVatOVR) {
    this.priceVatOVR = priceVatOVR;
    return this;
  }

  /**
   * Get priceVatOVR.
   *
   * @return priceVatOVR
   */
  @ApiModelProperty(value = "")


  public String getPriceVatOVR() {
    return priceVatOVR;
  }

  /**
   * Sets the price vat OVR.
   *
   * @param priceVatOVR the new price vat OVR
   */
  public void setPriceVatOVR(String priceVatOVR) {
    this.priceVatOVR = priceVatOVR;
  }

  /**
   * Product class.
   *
   * @param productClass the product class
   * @return the product
   */
  public Product productClass(String productClass) {
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
   * Product end date.
   *
   * @param productEndDate the product end date
   * @return the product
   */
  public Product productEndDate(String productEndDate) {
    this.productEndDate = productEndDate;
    return this;
  }

  /**
   * product end date.
   *
   * @return productEndDate
   */
  @ApiModelProperty(value = "product end date")


  public String getProductEndDate() {
    return productEndDate;
  }

  /**
   * Sets the product end date.
   *
   * @param productEndDate the new product end date
   */
  public void setProductEndDate(String productEndDate) {
    this.productEndDate = productEndDate;
  }

  /**
   * Product id.
   *
   * @param productId the product id
   * @return the product
   */
  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product ID.
   *
   * @return productId
   */
  @ApiModelProperty(value = "Product ID")


  public String getProductId() {
    return productId;
  }

  /**
   * Sets the product id.
   *
   * @param productId the new product id
   */
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Product name.
   *
   * @param productName the product name
   * @return the product
   */
  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Product name as defined catalogue.
   *
   * @return productName
   */
  @ApiModelProperty(value = "Product name as defined catalogue")


  public String getProductName() {
    return productName;
  }

  /**
   * Sets the product name.
   *
   * @param productName the new product name
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Product start date.
   *
   * @param productStartDate the product start date
   * @return the product
   */
  public Product productStartDate(String productStartDate) {
    this.productStartDate = productStartDate;
    return this;
  }

  /**
   * product start date.
   *
   * @return productStartDate
   */
  @ApiModelProperty(value = "product start date")


  public String getProductStartDate() {
    return productStartDate;
  }

  /**
   * Sets the product start date.
   *
   * @param productStartDate the new product start date
   */
  public void setProductStartDate(String productStartDate) {
    this.productStartDate = productStartDate;
  }

  /**
   * Product sub class.
   *
   * @param productSubClass the product sub class
   * @return the product
   */
  public Product productSubClass(String productSubClass) {
    this.productSubClass = productSubClass;
    return this;
  }

  /**
   * Get productSubClass.
   *
   * @return productSubClass
   */
  @ApiModelProperty(value = "")


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
   * Product type.
   *
   * @param productType the product type
   * @return the product
   */
  public Product productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType.
   *
   * @return productType
   */
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  /**
   * Sets the product type.
   *
   * @param productType the new product type
   */
  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * Rating.
   *
   * @param rating the rating
   * @return the product
   */
  public Product rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating.
   *
   * @return rating
   */
  @ApiModelProperty(value = "")


  public String getRating() {
    return rating;
  }

  /**
   * Sets the rating.
   *
   * @param rating the new rating
   */
  public void setRating(String rating) {
    this.rating = rating;
  }

  /**
   * Roaming data UOM.
   *
   * @param roamingDataUOM the roaming data UOM
   * @return the product
   */
  public Product roamingDataUOM(String roamingDataUOM) {
    this.roamingDataUOM = roamingDataUOM;
    return this;
  }

  /**
   * Get roamingDataUOM.
   *
   * @return roamingDataUOM
   */
  @ApiModelProperty(value = "")


  public String getRoamingDataUOM() {
    return roamingDataUOM;
  }

  /**
   * Sets the roaming data UOM.
   *
   * @param roamingDataUOM the new roaming data UOM
   */
  public void setRoamingDataUOM(String roamingDataUOM) {
    this.roamingDataUOM = roamingDataUOM;
  }

  /**
   * Roaming data value.
   *
   * @param roamingDataValue the roaming data value
   * @return the product
   */
  public Product roamingDataValue(String roamingDataValue) {
    this.roamingDataValue = roamingDataValue;
    return this;
  }

  /**
   * Get roamingDataValue.
   *
   * @return roamingDataValue
   */
  @ApiModelProperty(value = "")


  public String getRoamingDataValue() {
    return roamingDataValue;
  }

  /**
   * Sets the roaming data value.
   *
   * @param roamingDataValue the new roaming data value
   */
  public void setRoamingDataValue(String roamingDataValue) {
    this.roamingDataValue = roamingDataValue;
  }

  /**
   * Sales expired.
   *
   * @param salesExpired the sales expired
   * @return the product
   */
  public Product salesExpired(String salesExpired) {
    this.salesExpired = salesExpired;
    return this;
  }

  /**
   * sales expiry details.
   *
   * @return salesExpired
   */
  @ApiModelProperty(value = "sales expiry details")


  public String getSalesExpired() {
    return salesExpired;
  }

  /**
   * Sets the sales expired.
   *
   * @param salesExpired the new sales expired
   */
  public void setSalesExpired(String salesExpired) {
    this.salesExpired = salesExpired;
  }

  /**
   * Seo canonical.
   *
   * @param seoCanonical the seo canonical
   * @return the product
   */
  public Product seoCanonical(String seoCanonical) {
    this.seoCanonical = seoCanonical;
    return this;
  }

  /**
   * Get seoCanonical.
   *
   * @return seoCanonical
   */
  @ApiModelProperty(value = "")


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
   * Seo index.
   *
   * @param seoIndex the seo index
   * @return the product
   */
  public Product seoIndex(String seoIndex) {
    this.seoIndex = seoIndex;
    return this;
  }

  /**
   * Get seoIndex.
   *
   * @return seoIndex
   */
  @ApiModelProperty(value = "")


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
   * @return the product
   */
  public Product seoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
    return this;
  }

  /**
   * Get seoKeywords.
   *
   * @return seoKeywords
   */
  @ApiModelProperty(value = "")


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
   * Support.
   *
   * @param support the support
   * @return the product
   */
  public Product support(String support) {
    this.support = support;
    return this;
  }

  /**
   * Get support.
   *
   * @return support
   */
  @ApiModelProperty(value = "")


  public String getSupport() {
    return support;
  }

  /**
   * Sets the support.
   *
   * @param support the new support
   */
  public void setSupport(String support) {
    this.support = support;
  }

  /**
   * Three D spin.
   *
   * @param threeDSpin the three D spin
   * @return the product
   */
  public Product threeDSpin(String threeDSpin) {
    this.threeDSpin = threeDSpin;
    return this;
  }

  /**
   * Get threeDSpin.
   *
   * @return threeDSpin
   */
  @ApiModelProperty(value = "")


  public String getThreeDSpin() {
    return threeDSpin;
  }

  /**
   * Sets the three D spin.
   *
   * @param threeDSpin the new three D spin
   */
  public void setThreeDSpin(String threeDSpin) {
    this.threeDSpin = threeDSpin;
  }

  /**
   * Til UOM.
   *
   * @param tilUOM the til UOM
   * @return the product
   */
  public Product tilUOM(String tilUOM) {
    this.tilUOM = tilUOM;
    return this;
  }

  /**
   * Get tilUOM.
   *
   * @return tilUOM
   */
  @ApiModelProperty(value = "")


  public String getTilUOM() {
    return tilUOM;
  }

  /**
   * Sets the til UOM.
   *
   * @param tilUOM the new til UOM
   */
  public void setTilUOM(String tilUOM) {
    this.tilUOM = tilUOM;
  }

  /**
   * Type.
   *
   * @param type the type
   * @return the product
   */
  public Product type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * U KAND international credit UOM.
   *
   * @param uKANDInternationalCreditUOM the u KAND international credit UOM
   * @return the product
   */
  public Product uKANDInternationalCreditUOM(String uKANDInternationalCreditUOM) {
    this.uKANDInternationalCreditUOM = uKANDInternationalCreditUOM;
    return this;
  }

  /**
   * Get uKANDInternationalCreditUOM.
   *
   * @return uKANDInternationalCreditUOM
   */
  @ApiModelProperty(value = "")


  public String getUKANDInternationalCreditUOM() {
    return uKANDInternationalCreditUOM;
  }

  /**
   * Sets the UKAND international credit UOM.
   *
   * @param uKANDInternationalCreditUOM the new UKAND international credit UOM
   */
  public void setUKANDInternationalCreditUOM(String uKANDInternationalCreditUOM) {
    this.uKANDInternationalCreditUOM = uKANDInternationalCreditUOM;
  }

  /**
   * U KAND international credit value.
   *
   * @param uKANDInternationalCreditValue the u KAND international credit value
   * @return the product
   */
  public Product uKANDInternationalCreditValue(String uKANDInternationalCreditValue) {
    this.uKANDInternationalCreditValue = uKANDInternationalCreditValue;
    return this;
  }

  /**
   * Get uKANDInternationalCreditValue.
   *
   * @return uKANDInternationalCreditValue
   */
  @ApiModelProperty(value = "")


  public String getUKANDInternationalCreditValue() {
    return uKANDInternationalCreditValue;
  }

  /**
   * Sets the UKAND international credit value.
   *
   * @param uKANDInternationalCreditValue the new UKAND international credit value
   */
  public void setUKANDInternationalCreditValue(String uKANDInternationalCreditValue) {
    this.uKANDInternationalCreditValue = uKANDInternationalCreditValue;
  }

  /**
   * U kmobile minutes UOM.
   *
   * @param uKmobileMinutesUOM the u kmobile minutes UOM
   * @return the product
   */
  public Product uKmobileMinutesUOM(String uKmobileMinutesUOM) {
    this.uKmobileMinutesUOM = uKmobileMinutesUOM;
    return this;
  }

  /**
   * Get uKmobileMinutesUOM.
   *
   * @return uKmobileMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getUKmobileMinutesUOM() {
    return uKmobileMinutesUOM;
  }

  /**
   * Sets the u kmobile minutes UOM.
   *
   * @param uKmobileMinutesUOM the new u kmobile minutes UOM
   */
  public void setUKmobileMinutesUOM(String uKmobileMinutesUOM) {
    this.uKmobileMinutesUOM = uKmobileMinutesUOM;
  }

  /**
   * U kmobile minutes value.
   *
   * @param uKmobileMinutesValue the u kmobile minutes value
   * @return the product
   */
  public Product uKmobileMinutesValue(String uKmobileMinutesValue) {
    this.uKmobileMinutesValue = uKmobileMinutesValue;
    return this;
  }

  /**
   * Get uKmobileMinutesValue.
   *
   * @return uKmobileMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getUKmobileMinutesValue() {
    return uKmobileMinutesValue;
  }

  /**
   * Sets the u kmobile minutes value.
   *
   * @param uKmobileMinutesValue the new u kmobile minutes value
   */
  public void setUKmobileMinutesValue(String uKmobileMinutesValue) {
    this.uKmobileMinutesValue = uKmobileMinutesValue;
  }

  /**
   * Uk data UOM.
   *
   * @param ukDataUOM the uk data UOM
   * @return the product
   */
  public Product ukDataUOM(String ukDataUOM) {
    this.ukDataUOM = ukDataUOM;
    return this;
  }

  /**
   * Get ukDataUOM.
   *
   * @return ukDataUOM
   */
  @ApiModelProperty(value = "")


  public String getUkDataUOM() {
    return ukDataUOM;
  }

  /**
   * Sets the uk data UOM.
   *
   * @param ukDataUOM the new uk data UOM
   */
  public void setUkDataUOM(String ukDataUOM) {
    this.ukDataUOM = ukDataUOM;
  }

  /**
   * Uk data value.
   *
   * @param ukDataValue the uk data value
   * @return the product
   */
  public Product ukDataValue(String ukDataValue) {
    this.ukDataValue = ukDataValue;
    return this;
  }

  /**
   * Get ukDataValue.
   *
   * @return ukDataValue
   */
  @ApiModelProperty(value = "")


  public String getUkDataValue() {
    return ukDataValue;
  }

  /**
   * Sets the uk data value.
   *
   * @param ukDataValue the new uk data value
   */
  public void setUkDataValue(String ukDataValue) {
    this.ukDataValue = ukDataValue;
  }

  /**
   * Uk minutes UOM.
   *
   * @param ukMinutesUOM the uk minutes UOM
   * @return the product
   */
  public Product ukMinutesUOM(String ukMinutesUOM) {
    this.ukMinutesUOM = ukMinutesUOM;
    return this;
  }

  /**
   * Get ukMinutesUOM.
   *
   * @return ukMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getUkMinutesUOM() {
    return ukMinutesUOM;
  }

  /**
   * Sets the uk minutes UOM.
   *
   * @param ukMinutesUOM the new uk minutes UOM
   */
  public void setUkMinutesUOM(String ukMinutesUOM) {
    this.ukMinutesUOM = ukMinutesUOM;
  }

  /**
   * Uk minutes value.
   *
   * @param ukMinutesValue the uk minutes value
   * @return the product
   */
  public Product ukMinutesValue(String ukMinutesValue) {
    this.ukMinutesValue = ukMinutesValue;
    return this;
  }

  /**
   * Get ukMinutesValue.
   *
   * @return ukMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getUkMinutesValue() {
    return ukMinutesValue;
  }

  /**
   * Sets the uk minutes value.
   *
   * @param ukMinutesValue the new uk minutes value
   */
  public void setUkMinutesValue(String ukMinutesValue) {
    this.ukMinutesValue = ukMinutesValue;
  }

  /**
   * Uk texts UOM.
   *
   * @param ukTextsUOM the uk texts UOM
   * @return the product
   */
  public Product ukTextsUOM(String ukTextsUOM) {
    this.ukTextsUOM = ukTextsUOM;
    return this;
  }

  /**
   * Get ukTextsUOM.
   *
   * @return ukTextsUOM
   */
  @ApiModelProperty(value = "")


  public String getUkTextsUOM() {
    return ukTextsUOM;
  }

  /**
   * Sets the uk texts UOM.
   *
   * @param ukTextsUOM the new uk texts UOM
   */
  public void setUkTextsUOM(String ukTextsUOM) {
    this.ukTextsUOM = ukTextsUOM;
  }

  /**
   * Uk texts value.
   *
   * @param ukTextsValue the uk texts value
   * @return the product
   */
  public Product ukTextsValue(String ukTextsValue) {
    this.ukTextsValue = ukTextsValue;
    return this;
  }

  /**
   * Get ukTextsValue.
   *
   * @return ukTextsValue
   */
  @ApiModelProperty(value = "")


  public String getUkTextsValue() {
    return ukTextsValue;
  }

  /**
   * Sets the uk texts value.
   *
   * @param ukTextsValue the new uk texts value
   */
  public void setUkTextsValue(String ukTextsValue) {
    this.ukTextsValue = ukTextsValue;
  }

  /**
   * Ukandinternational credit UOM.
   *
   * @param ukandinternationalCreditUOM the ukandinternational credit UOM
   * @return the product
   */
  public Product ukandinternationalCreditUOM(String ukandinternationalCreditUOM) {
    this.ukandinternationalCreditUOM = ukandinternationalCreditUOM;
    return this;
  }

  /**
   * Get ukandinternationalCreditUOM.
   *
   * @return ukandinternationalCreditUOM
   */
  @ApiModelProperty(value = "")


  public String getUkandinternationalCreditUOM() {
    return ukandinternationalCreditUOM;
  }

  /**
   * Sets the ukandinternational credit UOM.
   *
   * @param ukandinternationalCreditUOM the new ukandinternational credit UOM
   */
  public void setUkandinternationalCreditUOM(String ukandinternationalCreditUOM) {
    this.ukandinternationalCreditUOM = ukandinternationalCreditUOM;
  }

  /**
   * Ukandinternational credit value.
   *
   * @param ukandinternationalCreditValue the ukandinternational credit value
   * @return the product
   */
  public Product ukandinternationalCreditValue(String ukandinternationalCreditValue) {
    this.ukandinternationalCreditValue = ukandinternationalCreditValue;
    return this;
  }

  /**
   * Get ukandinternationalCreditValue.
   *
   * @return ukandinternationalCreditValue
   */
  @ApiModelProperty(value = "")


  public String getUkandinternationalCreditValue() {
    return ukandinternationalCreditValue;
  }

  /**
   * Sets the ukandinternational credit value.
   *
   * @param ukandinternationalCreditValue the new ukandinternational credit value
   */
  public void setUkandinternationalCreditValue(String ukandinternationalCreditValue) {
    this.ukandinternationalCreditValue = ukandinternationalCreditValue;
  }

  /**
   * Ukmobile minutes UOM.
   *
   * @param ukmobileMinutesUOM the ukmobile minutes UOM
   * @return the product
   */
  public Product ukmobileMinutesUOM(String ukmobileMinutesUOM) {
    this.ukmobileMinutesUOM = ukmobileMinutesUOM;
    return this;
  }

  /**
   * Get ukmobileMinutesUOM.
   *
   * @return ukmobileMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getUkmobileMinutesUOM() {
    return ukmobileMinutesUOM;
  }

  /**
   * Sets the ukmobile minutes UOM.
   *
   * @param ukmobileMinutesUOM the new ukmobile minutes UOM
   */
  public void setUkmobileMinutesUOM(String ukmobileMinutesUOM) {
    this.ukmobileMinutesUOM = ukmobileMinutesUOM;
  }

  /**
   * Ukmobile minutes value.
   *
   * @param ukmobileMinutesValue the ukmobile minutes value
   * @return the product
   */
  public Product ukmobileMinutesValue(String ukmobileMinutesValue) {
    this.ukmobileMinutesValue = ukmobileMinutesValue;
    return this;
  }

  /**
   * Get ukmobileMinutesValue.
   *
   * @return ukmobileMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getUkmobileMinutesValue() {
    return ukmobileMinutesValue;
  }

  /**
   * Sets the ukmobile minutes value.
   *
   * @param ukmobileMinutesValue the new ukmobile minutes value
   */
  public void setUkmobileMinutesValue(String ukmobileMinutesValue) {
    this.ukmobileMinutesValue = ukmobileMinutesValue;
  }

  /**
   * Video.
   *
   * @param video the video
   * @return the product
   */
  public Product video(String video) {
    this.video = video;
    return this;
  }

  /**
   * Get video.
   *
   * @return video
   */
  @ApiModelProperty(value = "")


  public String getVideo() {
    return video;
  }

  /**
   * Sets the video.
   *
   * @param video the new video
   */
  public void setVideo(String video) {
    this.video = video;
  }

  /**
   * Vodafone vodafone minutes UOM.
   *
   * @param vodafoneVodafoneMinutesUOM the vodafone vodafone minutes UOM
   * @return the product
   */
  public Product vodafoneVodafoneMinutesUOM(String vodafoneVodafoneMinutesUOM) {
    this.vodafoneVodafoneMinutesUOM = vodafoneVodafoneMinutesUOM;
    return this;
  }

  /**
   * Get vodafoneVodafoneMinutesUOM.
   *
   * @return vodafoneVodafoneMinutesUOM
   */
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneMinutesUOM() {
    return vodafoneVodafoneMinutesUOM;
  }

  /**
   * Sets the vodafone vodafone minutes UOM.
   *
   * @param vodafoneVodafoneMinutesUOM the new vodafone vodafone minutes UOM
   */
  public void setVodafoneVodafoneMinutesUOM(String vodafoneVodafoneMinutesUOM) {
    this.vodafoneVodafoneMinutesUOM = vodafoneVodafoneMinutesUOM;
  }

  /**
   * Vodafone vodafone minutes value.
   *
   * @param vodafoneVodafoneMinutesValue the vodafone vodafone minutes value
   * @return the product
   */
  public Product vodafoneVodafoneMinutesValue(String vodafoneVodafoneMinutesValue) {
    this.vodafoneVodafoneMinutesValue = vodafoneVodafoneMinutesValue;
    return this;
  }

  /**
   * Get vodafoneVodafoneMinutesValue.
   *
   * @return vodafoneVodafoneMinutesValue
   */
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneMinutesValue() {
    return vodafoneVodafoneMinutesValue;
  }

  /**
   * Sets the vodafone vodafone minutes value.
   *
   * @param vodafoneVodafoneMinutesValue the new vodafone vodafone minutes value
   */
  public void setVodafoneVodafoneMinutesValue(String vodafoneVodafoneMinutesValue) {
    this.vodafoneVodafoneMinutesValue = vodafoneVodafoneMinutesValue;
  }

  /**
   * Vodafone vodafone UOM.
   *
   * @param vodafoneVodafoneUOM the vodafone vodafone UOM
   * @return the product
   */
  public Product vodafoneVodafoneUOM(String vodafoneVodafoneUOM) {
    this.vodafoneVodafoneUOM = vodafoneVodafoneUOM;
    return this;
  }

  /**
   * Get vodafoneVodafoneUOM.
   *
   * @return vodafoneVodafoneUOM
   */
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneUOM() {
    return vodafoneVodafoneUOM;
  }

  /**
   * Sets the vodafone vodafone UOM.
   *
   * @param vodafoneVodafoneUOM the new vodafone vodafone UOM
   */
  public void setVodafoneVodafoneUOM(String vodafoneVodafoneUOM) {
    this.vodafoneVodafoneUOM = vodafoneVodafoneUOM;
  }

  /**
   * Vodafone vodafone value.
   *
   * @param vodafoneVodafoneValue the vodafone vodafone value
   * @return the product
   */
  public Product vodafoneVodafoneValue(String vodafoneVodafoneValue) {
    this.vodafoneVodafoneValue = vodafoneVodafoneValue;
    return this;
  }

  /**
   * Get vodafoneVodafoneValue.
   *
   * @return vodafoneVodafoneValue
   */
  @ApiModelProperty(value = "")


  public String getVodafoneVodafoneValue() {
    return vodafoneVodafoneValue;
  }

  /**
   * Sets the vodafone vodafone value.
   *
   * @param vodafoneVodafoneValue the new vodafone vodafone value
   */
  public void setVodafoneVodafoneValue(String vodafoneVodafoneValue) {
    this.vodafoneVodafoneValue = vodafoneVodafoneValue;
  }

  /**
   * Vodafone vodafonetexts UOM.
   *
   * @param vodafoneVodafonetextsUOM the vodafone vodafonetexts UOM
   * @return the product
   */
  public Product vodafoneVodafonetextsUOM(String vodafoneVodafonetextsUOM) {
    this.vodafoneVodafonetextsUOM = vodafoneVodafonetextsUOM;
    return this;
  }

  /**
   * Get vodafoneVodafonetextsUOM.
   *
   * @return vodafoneVodafonetextsUOM
   */
  @ApiModelProperty(value = "")


  public String getVodafoneVodafonetextsUOM() {
    return vodafoneVodafonetextsUOM;
  }

  /**
   * Sets the vodafone vodafonetexts UOM.
   *
   * @param vodafoneVodafonetextsUOM the new vodafone vodafonetexts UOM
   */
  public void setVodafoneVodafonetextsUOM(String vodafoneVodafonetextsUOM) {
    this.vodafoneVodafonetextsUOM = vodafoneVodafonetextsUOM;
  }

  /**
   * Vodafone vodafonetexts value.
   *
   * @param vodafoneVodafonetextsValue the vodafone vodafonetexts value
   * @return the product
   */
  public Product vodafoneVodafonetextsValue(String vodafoneVodafonetextsValue) {
    this.vodafoneVodafonetextsValue = vodafoneVodafonetextsValue;
    return this;
  }

  /**
   * Get vodafoneVodafonetextsValue.
   *
   * @return vodafoneVodafonetextsValue
   */
  @ApiModelProperty(value = "")


  public String getVodafoneVodafonetextsValue() {
    return vodafoneVodafonetextsValue;
  }

  /**
   * Sets the vodafone vodafonetexts value.
   *
   * @param vodafoneVodafonetextsValue the new vodafone vodafonetexts value
   */
  public void setVodafoneVodafonetextsValue(String vodafoneVodafonetextsValue) {
    this.vodafoneVodafonetextsValue = vodafoneVodafonetextsValue;
  }

  /**
   * Warranty.
   *
   * @param warranty the warranty
   * @return the product
   */
  public Product warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Get warranty.
   *
   * @return warranty
   */
  @ApiModelProperty(value = "")


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

  /**
   * Week end.
   *
   * @param weekEnd the week end
   * @return the product
   */
  public Product weekEnd(String weekEnd) {
    this.weekEnd = weekEnd;
    return this;
  }

  /**
   * Get weekEnd.
   *
   * @return weekEnd
   */
  @ApiModelProperty(value = "")


  public String getWeekEnd() {
    return weekEnd;
  }

  /**
   * Sets the week end.
   *
   * @param weekEnd the new week end
   */
  public void setWeekEnd(String weekEnd) {
    this.weekEnd = weekEnd;
  }

  /**
   * Wifi UOM.
   *
   * @param wifiUOM the wifi UOM
   * @return the product
   */
  public Product wifiUOM(String wifiUOM) {
    this.wifiUOM = wifiUOM;
    return this;
  }

  /**
   * Get wifiUOM.
   *
   * @return wifiUOM
   */
  @ApiModelProperty(value = "")


  public String getWifiUOM() {
    return wifiUOM;
  }

  /**
   * Sets the wifi UOM.
   *
   * @param wifiUOM the new wifi UOM
   */
  public void setWifiUOM(String wifiUOM) {
    this.wifiUOM = wifiUOM;
  }

  /**
   * Wifi value.
   *
   * @param wifiValue the wifi value
   * @return the product
   */
  public Product wifiValue(String wifiValue) {
    this.wifiValue = wifiValue;
    return this;
  }

  /**
   * Get wifiValue.
   *
   * @return wifiValue
   */
  @ApiModelProperty(value = "")


  public String getWifiValue() {
    return wifiValue;
  }

  /**
   * Sets the wifi value.
   *
   * @param wifiValue the new wifi value
   */
  public void setWifiValue(String wifiValue) {
    this.wifiValue = wifiValue;
  }

  /**
   * Zereightnumberminutes UOM.
   *
   * @param zereightnumberminutesUOM the zereightnumberminutes UOM
   * @return the product
   */
  public Product zereightnumberminutesUOM(String zereightnumberminutesUOM) {
    this.zereightnumberminutesUOM = zereightnumberminutesUOM;
    return this;
  }

  /**
   * Get zereightnumberminutesUOM.
   *
   * @return zereightnumberminutesUOM
   */
  @ApiModelProperty(value = "")


  public String getZereightnumberminutesUOM() {
    return zereightnumberminutesUOM;
  }

  /**
   * Sets the zereightnumberminutes UOM.
   *
   * @param zereightnumberminutesUOM the new zereightnumberminutes UOM
   */
  public void setZereightnumberminutesUOM(String zereightnumberminutesUOM) {
    this.zereightnumberminutesUOM = zereightnumberminutesUOM;
  }

  /**
   * Zereightnumberminutes value.
   *
   * @param zereightnumberminutesValue the zereightnumberminutes value
   * @return the product
   */
  public Product zereightnumberminutesValue(String zereightnumberminutesValue) {
    this.zereightnumberminutesValue = zereightnumberminutesValue;
    return this;
  }

  /**
   * Get zereightnumberminutesValue.
   *
   * @return zereightnumberminutesValue
   */
  @ApiModelProperty(value = "")


  public String getZereightnumberminutesValue() {
    return zereightnumberminutesValue;
  }

  /**
   * Sets the zereightnumberminutes value.
   *
   * @param zereightnumberminutesValue the new zereightnumberminutes value
   */
  public void setZereightnumberminutesValue(String zereightnumberminutesValue) {
    this.zereightnumberminutesValue = zereightnumberminutesValue;
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

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(imageURLsFullFront, seoDescription, affiliateExport, allowanceUOM, amount, availableFrom, backOrderable, compareWith, compatibleEntertainment, condition, controlOrder, conversionFactor, dataUOM, dataValue, deliveryClassification, deliveryMethod, deliveryOnWeekend, deliveryPartner, discountAmount, discountType, displayName, displayUOM, duration, durationUOM, eligibiltiySubflow, equipmentMake, equipmentModel, estDeliveryDate, etdataUOM, etdataValue, europeanRoamingDataUOM, europeanRoamingDataValue, europeanRoamingMinutesUOM, europeanRoamingMinutesValue, europeanRoamingPictureMessagesUOM, europeanRoamingPictureMessagesValue, europeanRoamingTextsUOM, europeanRoamingTextsValue, extraimeuandrowUOM, extraimeuandrowValue, extraimeuandusUOM, extraimeuandusValue, globalRoamingDataUOM, globalRoamingDataValue, globalRoamingMinutesUOM, globalRoamingMinutesValue, globalRoamingTextsUOM, globalRoamingTextsValue, helptext, helpurl, imageURLsFullBack, imageURLsFullHero, imageURLsFullLeft, imageURLsFullRight, imageURLsFullSide, imageURLsGrid, imageURLsIcon, imageURLsSmall, imageURLsSticker, imageURLsThumbsFront, imageURLsThumbsLeft, imageURLsThumbsRight, imageURLsThumbsSide, inTheBox, internationalMinutesUOM, internationalMinutesValue, internationalTextsUOM, internationalTextsValue, isBattery, isDeviceProduct, isDisplayableAcq, isDisplayableEcare, isDisplayableRet, isDisplaybaleSavedBasket, isSellableAcq, isSellableECare, isSellableRet, isServicesProduct, landlineMinutesUOM, landlineMinutesValue, leadPlanId, listOfCompatibleBundles, mefProductName, numReviews, order, parentProductId, pdGrpCmpAcc, pdGrpRecAcc, pdGrpRecExtr, pdGrpvariant, pictureMessagesUOM, postDesc, postDescMobile, preDesc, preDescMobile, preOrderable, priceGrossOVR, priceNetOVR, priceType, priceVatOVR, productClass, productEndDate, productId, productName, productStartDate, productSubClass, productType, rating, roamingDataUOM, roamingDataValue, salesExpired, seoCanonical, seoIndex, seoKeywords, support, threeDSpin, tilUOM, type, uKANDInternationalCreditUOM, uKANDInternationalCreditValue, uKmobileMinutesUOM, uKmobileMinutesValue, ukDataUOM, ukDataValue, ukMinutesUOM, ukMinutesValue, ukTextsUOM, ukTextsValue, ukandinternationalCreditUOM, ukandinternationalCreditValue, ukmobileMinutesUOM, ukmobileMinutesValue, video, vodafoneVodafoneMinutesUOM, vodafoneVodafoneMinutesValue, vodafoneVodafoneUOM, vodafoneVodafoneValue, vodafoneVodafonetextsUOM, vodafoneVodafonetextsValue, warranty, weekEnd, wifiUOM, wifiValue, zereightnumberminutesUOM, zereightnumberminutesValue);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
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

