package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Extra   {

  @JsonProperty("extraId")
  private String extraId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("desc")
  private String desc = null;
  
  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("period")
  private String period = null;

  @JsonProperty("duration")
  private Duration duration = null;

  @JsonProperty("mediaExtra")
  @Valid
  private List<com.vf.uk.dal.broadband.entity.product.MediaLink> mediaExtra = null;
}