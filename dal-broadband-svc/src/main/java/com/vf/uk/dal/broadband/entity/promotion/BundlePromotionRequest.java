package com.vf.uk.dal.broadband.entity.promotion;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * BundlePromotionRequest.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-17T22:32:14.737Z")
@Data
public class BundlePromotionRequest {

	/** The bundle id list. */
	@JsonProperty("bundleIdList")
	@Valid
	private List<String> bundleIdList = null;

	/** The journey type. */
	@JsonProperty("journeyType")
	private String journeyType = null;

}
