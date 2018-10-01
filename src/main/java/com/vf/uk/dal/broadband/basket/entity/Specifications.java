package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Specifications.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class Specifications   {
  
  /** The comparable. */
  @JsonProperty("comparable")
  private String comparable = null;

  /** The description. */
  @JsonProperty("description")
  private String description = null;

  /** The footnote. */
  @JsonProperty("footnote")
  private String footnote = null;

  /** The iskey. */
  @JsonProperty("iskey")
  private String iskey = null;

  /** The name. */
  @JsonProperty("name")
  private String name = null;

  /** The spec priority. */
  @JsonProperty("specPriority")
  private String specPriority = null;

  /** The value. */
  @JsonProperty("value")
  private String value = null;

  /** The value type. */
  @JsonProperty("valueType")
  private String valueType = null;

  /** The value UOM. */
  @JsonProperty("valueUOM")
  private String valueUOM = null;

  
}

