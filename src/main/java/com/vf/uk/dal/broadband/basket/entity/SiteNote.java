package com.vf.uk.dal.broadband.basket.entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * SiteNote.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class SiteNote   {
  
  /** The notes. */
  @JsonProperty("notes")
  private String notes = null;

  /** The type code. */
  @JsonProperty("typeCode")
  private String typeCode = null;

  
}

