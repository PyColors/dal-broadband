package com.vf.uk.dal.broadband.entity.price;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * DeviceFinancingOption
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class DeviceFinancingOption   {
  @JsonProperty("apr")
  private String apr = null;

  @JsonProperty("deviceFinancingId")
  private String deviceFinancingId = null;

  @JsonProperty("financeProvider")
  private String financeProvider = null;

  @JsonProperty("financeTerm")
  private String financeTerm = null;

  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  @JsonProperty("totalPriceWithInterest")
  private Price totalPriceWithInterest = null;

}

