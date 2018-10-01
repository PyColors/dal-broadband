package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceLine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketServiceLine   {
  @JsonProperty("itemReference")
  private BasketItemReference itemReference = null;

  @JsonProperty("lineSpeeds")
  private BasketLineSpeeds lineSpeeds = null;

  @JsonProperty("miscRefernce")
  private BasketMiscReference miscRefernce = null;

  @JsonProperty("serviceLineTreatments")
  @Valid
  private List<BasketServiceLineTreatment> serviceLineTreatments = null;

  
}

