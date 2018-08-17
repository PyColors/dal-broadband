package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * RequiresIncompatibility.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class RequiresIncompatibility   {
  
  /** The product classes. */
  @JsonProperty("productClasses")
  @Valid
  private List<String> productClasses = null;

  /** The product ids. */
  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = null;

  /** The product lines. */
  @JsonProperty("productLines")
  @Valid
  private List<String> productLines = null;

  
}

