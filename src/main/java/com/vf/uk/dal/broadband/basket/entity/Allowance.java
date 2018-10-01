package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Allowance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Allowance   {
  @JsonProperty("displayUom")
  private String displayUom = null;

  @JsonProperty("tilUom")
  private String tilUom = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("value")
  private String value = null;

  
}

