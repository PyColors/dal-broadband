package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineLocator
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketLineLocator   {
  @JsonProperty("cableLinkID")
  private String cableLinkID = null;

  @JsonProperty("distributionPoint")
  private String distributionPoint = null;

  @JsonProperty("districtCode")
  private String districtCode = null;

  @JsonProperty("exchangeCode")
  private String exchangeCode = null;

  @JsonProperty("exchangeName")
  private String exchangeName = null;

  @JsonProperty("l2SID")
  private String l2SID = null;

}

