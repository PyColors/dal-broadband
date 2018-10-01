package com.vf.uk.dal.entity.serviceavailability;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ServiceLine.
 */
@Data
public class ServiceLine {

	/** The product code. */
	@JsonProperty("productCode")
	private String productCode = null;

	/** The product name. */
	@JsonProperty("productName")
	private String productName = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private String classificationCode = null;

	/** The line speeds. */
	@JsonProperty("lineSpeeds")
	private LineSpeeds lineSpeeds = null;

	/** The line treatment. */
	@JsonProperty("lineTreatment")
	private List<ServiceLineTreatment> lineTreatment = new ArrayList<>();

	/** The misc reference. */
	@JsonProperty("miscReference")
	private MiscReference miscReference = null;

}
