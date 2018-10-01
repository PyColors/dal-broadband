package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class LineStatus.
 */
@Data
public class LineStatus implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2905281855467764206L;

	/** The Constant STATUSCODE. */
	private static final String STATUS_CODE = "statusCode";

	/** The Constant ACCESSLINESTATUS. */
	private static final String ACCESSLINE_STATUS = "accessLineStatus";

	/** The Constant GNPSTATUS. */
	private static final String GNP_STATUS = "gnpStatus";

	/** The Constant LINEOPTION. */
	private static final String LINE_OPTION = "lineOption";

	/** The Constant TECHNOLOGY. */
	private static final String TECHNOLOGY = "technology";

	/** The Constant LINETYPE. */
	private static final String LINE_TYPE = "lineType";

	/** The Constant TEMPSTRUCTURE. */
	private static final String TEMP_STRUCTURE = "tempStructure";

	/** The Constant STANDBYPOWERREQUIRED. */
	private static final String STANDBYPOWER_REQUIRED = "standbyPowerRequired";

	/** The Constant NARROWBANDSERVICESAVAILABLE. */
	private static final String NARROWBANDSERVICES_AVAILABLE = "narrowBandServicesAvailable";

	/** The status code. */
	@JsonProperty(STATUS_CODE)
	private String statusCode;

	/** The access line status. */
	@JsonProperty(ACCESSLINE_STATUS)
	private String accessLineStatus;

	/** The g NP status. */
	@JsonProperty(GNP_STATUS)
	private String gnpStatus;

	/** The line option. */
	@JsonProperty(LINE_OPTION)
	private String lineOption;

	/** The technology. */
	@JsonProperty(TECHNOLOGY)
	private String technology;

	/** The line type. */
	@JsonProperty(LINE_TYPE)
	private String lineType;

	/** The temp structure. */
	@JsonProperty(TEMP_STRUCTURE)
	private String tempStructure;

	/** The standby power required. */
	@JsonProperty(STANDBYPOWER_REQUIRED)
	private String standbyPowerRequired;

	/** The narrow band services available. */
	@JsonProperty(NARROWBANDSERVICES_AVAILABLE)
	private String narrowBandServicesAvailable;

}
