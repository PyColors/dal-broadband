package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineDirectory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketLineDirectory   {
  @JsonProperty("directoryCode")
  private String directoryCode = null;

  @JsonProperty("featureCode")
  private String featureCode = null;

  @JsonProperty("locationCode")
  private String locationCode = null;

 
}

