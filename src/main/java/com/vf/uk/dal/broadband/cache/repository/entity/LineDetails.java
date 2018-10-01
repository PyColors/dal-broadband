package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineDetails.
 */
@Data
public class LineDetails implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2196503233118622640L;

	/** The Constant LINETREATMENTTYPE. */
	private static final String LINETREATMENT_TYPE = "lineTreatmentType";

	/** The Constant FLBBNUMBER. */
	private static final String FLBB_NUMBER = "flbbNumber";

	/** The Constant CLASSIFICATIONCODE. */
	private static final String CLASSIFICATION_CODE = "classificationCode";

	/** The Constant EARLIESTAVAILABLEDATE. */
	private static final String EARLIESTAVAILABLE_DATE = "earliestAvailableDate";

	/** The line treatment type. */
	@JsonProperty(LINETREATMENT_TYPE)
	private String lineTreatmentType;

	/** The flbb number. */
	@JsonProperty(FLBB_NUMBER)
	private String flbbNumber;

	/** The classification code. */
	@JsonProperty(CLASSIFICATION_CODE)
	private String classificationCode;

	/** The earliest available date. */
	@JsonProperty(EARLIESTAVAILABLE_DATE)
	private String earliestAvailableDate;

}
