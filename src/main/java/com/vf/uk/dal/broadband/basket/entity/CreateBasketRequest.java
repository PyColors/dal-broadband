package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * CreateBasketRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class CreateBasketRequest   {
  @JsonProperty("affiliateFlag")
  private Boolean affiliateFlag = null;

  @JsonProperty("affiliateId")
  private String affiliateId = null;

  @JsonProperty("customerRequestedDate")
  private String customerRequestedDate = null;

  @JsonProperty("journey")
  private Journey journey = null;

  @JsonProperty("packages")
  @Valid
  private List<AddPackage> packages = null;

  @JsonProperty("returnURL")
  private String returnURL = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("ttl")
  private String ttl = null;

  
}

