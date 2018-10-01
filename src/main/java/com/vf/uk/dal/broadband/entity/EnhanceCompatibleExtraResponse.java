package com.vf.uk.dal.broadband.entity;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * EnhanceCompatibleExtraResponse
 */
@Data
@NoArgsConstructor
@ToString(exclude={"extrasGroups"})
public class EnhanceCompatibleExtraResponse   extends ResourceSupport{
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("extrasGroups")
  private List<ExtrasGroup> extrasGroups = null;

  
}