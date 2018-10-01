package com.vf.uk.dal.broadband.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * MiscellaneousAttributes.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-27T18:08:29.266Z")
@Data
public class MiscellaneousAttributes   {
  
  /**  plan callout. */
  @JsonProperty("planCallOut")
  private String planCallOut = null;
  
  /** The speed. */
  @JsonProperty("speed")
  private String speed = null;

  /** The max cap speed. */
  @JsonProperty("MaxCapSpeed")
  private String maxCapSpeed = null;

  /** The min cap speed. */
  @JsonProperty("MinCapSpeed")
  private String minCapSpeed = null;

  
}

