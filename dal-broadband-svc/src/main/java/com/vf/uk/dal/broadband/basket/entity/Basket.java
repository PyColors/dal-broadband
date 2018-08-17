package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Basket.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Basket extends ResourceSupport {
  
  /** The affiliate flag. */
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  /** The affiliate id. */
  @JsonProperty("affiliateId")
  private String affiliateId = null;

  /** The basket id. */
  @JsonProperty("basketId")
  private String basketId = null;

  /** The change code. */
  @JsonProperty("changeCode")
  private String changeCode = null;

  /** The customer. */
  @JsonProperty("customer")
  private Customer customer = null;

  /** The customer requested date. */
  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  /** The delivery info. */
  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  /** The hashvalue. */
  @JsonProperty("hashvalue")
  private String hashvalue = null;

  /** The is changed. */
  @JsonProperty("isChanged")
  private Boolean isChanged = null;

  /** The journey. */
  @JsonProperty("journey")
  private Journey journey = null;

  /** The metadata. */
  @JsonProperty("metadata")
  private Metadata metadata = null;

  /** The packages. */
  @JsonProperty("packages")
  @Valid
  private List<ModelPackage> packages = null;

  /** The price details. */
  @JsonProperty("priceDetails")
  private PriceDetails priceDetails = null;

  /** The source. */
  @JsonProperty("source")
  private String source = null;

  /** The total monthly price saving. */
  @JsonProperty("totalMonthlyPriceSaving")
  private String totalMonthlyPriceSaving = null;

  /** The total oneoff price saving. */
  @JsonProperty("totalOneoffPriceSaving")
  private String totalOneoffPriceSaving = null;

  /** The validated. */
  @JsonProperty("validated")
  private Boolean validated = null;

  /** The vet outcome. */
  @JsonProperty("vetOutcome")
  private VetOutcome vetOutcome = null;

  /** The voucher code. */
  @JsonProperty("voucherCode")
  private String voucherCode = null;

  /** The voucher description. */
  @JsonProperty("voucherDescription")
  private String voucherDescription = null;

  /** The voucher error message. */
  @JsonProperty("voucherErrorMessage")
  private String voucherErrorMessage = null;

 
}

