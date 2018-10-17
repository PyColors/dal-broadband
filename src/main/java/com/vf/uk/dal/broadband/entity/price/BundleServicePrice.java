package com.vf.uk.dal.broadband.entity.price;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundleServicePrice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class BundleServicePrice   {
  @JsonProperty("monthlyPrice")
  private Price monthlyPrice = null;

  @JsonProperty("oneOffPrice")
  private Price oneOffPrice = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  
}

