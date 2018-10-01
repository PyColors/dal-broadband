package com.vf.uk.dal.broadband.entity;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * PriceForEnhanceExtra
 */
@Data
@NoArgsConstructor
@ToString
public class PriceForEnhanceExtra extends ResourceSupport {
  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  @JsonProperty("oneOffDiscountPrice")
  private Price oneOffDiscountPrice = null;

  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  @JsonProperty("monthlyDiscountPrice")
  private Price monthlyDiscountPrice = null;

  @JsonProperty("merchandisingPromotions")
  private MerchandisingPromotion merchandisingPromotions = null;

 
}