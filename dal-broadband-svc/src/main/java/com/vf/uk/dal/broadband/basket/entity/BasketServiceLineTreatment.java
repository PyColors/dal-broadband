package com.vf.uk.dal.broadband.basket.entity;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceLineTreatment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-13T15:08:00.974Z")
@Data
public class BasketServiceLineTreatment   {
  @JsonProperty("accessLine")
  private BasketAccessLine accessLine = null;

  @JsonProperty("canNumberBeRetained")
  private Boolean canNumberBeRetained = null;

  @JsonProperty("lineInfo")
  private String lineInfo = null;

  @JsonProperty("parentIdentification")
  private String parentIdentification = null;

  @JsonProperty("pendingOrders")
  @Valid
  private List<BasketPendingOrder> pendingOrders = null;

  @JsonProperty("portInFlag")
  private String portInFlag = null;

  @JsonProperty("serviceAction")
  private String serviceAction = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("simValue")
  private String simValue = null;

  @JsonProperty("vicCode")
  private String vicCode = null;

  
}

