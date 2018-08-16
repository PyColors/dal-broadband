package com.vf.uk.dal.broadband.entity.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

@Builder
public class MediaLink   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("type")
  private String type = null;
  
  /** The promo category. */
  @JsonProperty("promoCategory")
  private String promoCategory = null;
  
  /** The offer code. */
  @JsonProperty("offerCode")
  private String offerCode = null;
  
  /** The description. */
  @JsonProperty("description")
  private String description;
	
	/** The discount id. */
  @JsonProperty("discountId")
  private String discountId;

  @JsonProperty("packageType")
  private List<String> packageType = null;
}