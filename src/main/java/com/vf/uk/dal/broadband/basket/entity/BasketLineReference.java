package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * LineReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketLineReference   {
  @JsonProperty("availableServices")
  private AvailableServices availableServices = null;

  @JsonProperty("lineDirectory")
  @Valid
  private List<BasketLineDirectory> lineDirectory = null;

  @JsonProperty("lineLocator")
  private BasketLineLocator lineLocator = null;

  @JsonProperty("lineSettings")
  private BasketLineSettings lineSettings = null;

  @JsonProperty("lineStatus")
  private BasketLineStatus lineStatus = null;

  
}

