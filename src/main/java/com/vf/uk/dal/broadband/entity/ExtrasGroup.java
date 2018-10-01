package com.vf.uk.dal.broadband.entity;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ExtrasGroup
 */
@Data
@NoArgsConstructor
@ToString(exclude={"extraMembers"})
public class ExtrasGroup   extends ResourceSupport{
  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupPriority")
  private Integer groupPriority = null;

  @JsonProperty("extraMembers")
  private List<ExtraMember> extraMembers = null;

 
}