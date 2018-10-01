package com.vf.uk.dal.broadband.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(exclude={"mediaExtra"})
public class Extra extends ResourceSupport  {

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