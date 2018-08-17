package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Service.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Service   {
  
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

  /** The data rollover. */
  @JsonProperty("dataRollover")
  private String dataRollover = null;

  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The display description. */
  @JsonProperty("displayDescription")
  private String displayDescription = null;

  /** The display name. */
  @JsonProperty("displayName")
  private String displayName = null;

  /** The free gift. */
  @JsonProperty("freeGift")
  private Boolean freeGift = null;

  /** The is changed. */
  @JsonProperty("isChanged")
  private Boolean isChanged = null;

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

  /** The plan duration. */
  @JsonProperty("planDuration")
  private CommitmentPeriod planDuration = null;

  /** The price details. */
  @JsonProperty("priceDetails")
  private ServicePrice priceDetails = null;

  /** The product class. */
  @JsonProperty("productClass")
  private String productClass = null;

  /** The reward points. */
  @JsonProperty("rewardPoints")
  private String rewardPoints = null;

  /** The sku id. */
  @JsonProperty("skuId")
  private String skuId = null;

  /** The specification group. */
  @JsonProperty("specificationGroup")
  @Valid
  private List<Specifications> specificationGroup = null;

  
}

