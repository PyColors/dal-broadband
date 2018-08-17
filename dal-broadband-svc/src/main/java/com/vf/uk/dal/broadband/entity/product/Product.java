package com.vf.uk.dal.broadband.entity.product;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Product.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-14T16:30:22.947Z")
@Data
public class Product {

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

}
