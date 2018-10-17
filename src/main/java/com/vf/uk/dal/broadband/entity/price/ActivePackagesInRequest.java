package com.vf.uk.dal.broadband.entity.price;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ActivePackagesInRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class ActivePackagesInRequest   {
  @JsonProperty("bundleId")
  private String bundleId = null;

  @JsonProperty("discounts")
  @Valid
  private List<ExistingDiscount> discounts = null;

  @JsonProperty("identifier")
  private Identifier identifier = null;

 
}

