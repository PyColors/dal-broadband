package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ServieLine.
 */
@Data
public class ServieLine implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6648662229394980645L;

	/** The Constant ITEMREFERENCE. */
	private static final String ITEM_REFERENCE = "itemReference";

	/** The Constant LINESPEEDS. */
	private static final String LINE_SPEEDS = "lineSpeeds";

	/** The Constant SERVICELINETREATMENTLIST. */
	private static final String SERVICELINETREATMENT_LIST = "serviceLineTreatments";

	/** The Constant MISCREFERNCE. */
	private static final String MISC_REFERNCE = "miscRefernce";

	/** The item reference. */
	@JsonProperty(ITEM_REFERENCE)
	private ItemReference itemReference;

	@JsonProperty("classificationCode")
	private String classificationCode;

	/** The line speeds. */
	@JsonProperty(LINE_SPEEDS)
	private LineSpeeds lineSpeeds;

	/** The service line treatment list. */
	@JsonProperty(SERVICELINETREATMENT_LIST)
	private List<ServiceLineTreatment> serviceLineTreatments = new ArrayList<>();

	/** The misc refernce. */
	@JsonProperty(MISC_REFERNCE)
	private MiscReference miscRefernce;

}
