package com.vf.uk.dal.broadband.entity;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ExtraMember
 */
@Data
@NoArgsConstructor
@ToString(exclude={"mediaExtra"})
public class ExtraMember  extends ResourceSupport {
  @JsonProperty("extraId")
  private String extraId = null;

  @JsonProperty("postDescMobile")
  private String postDescMobile = null;

  @JsonProperty("preDescMobile")
  private String preDescMobile = null;

  @JsonProperty("postDesc")
  private String postDesc = null;

  @JsonProperty("preDes")
  private String preDes = null;

  @JsonProperty("displayname")
  private String displayname = null;

  @JsonProperty("extrasPriority")
  private Integer extrasPriority = null;

  @JsonProperty("price")
  private PriceForEnhanceExtra price = null;

  @JsonProperty("period")
  private String period = null;

  @JsonProperty("duration")
  private Duration duration = null;

  @JsonProperty("mediaExtra")
  private List<MediaLink> mediaExtra = null;


}