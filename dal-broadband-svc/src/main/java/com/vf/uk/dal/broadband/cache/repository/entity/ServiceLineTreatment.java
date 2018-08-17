package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class ServiceLineTreatment.
 */
@Data
public class ServiceLineTreatment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2146581389765169469L;

	/** The Constant PARENTIDENTIFICATION. */
	private static final String PARENT_IDENTIFICATION = "parentIdentification";

	/** The Constant ACCESSLINE. */
	private static final String ACCESS_LINE = "accessLine";

	/** The Constant SERVICETYPE. */
	private static final String SERVICE_TYPE = "serviceType";

	/** The Constant SERVICEACTION. */
	private static final String SERVICE_ACTION = "serviceAction";

	/** The Constant SIM2VALUE. */
	private static final String SIM2_VALUE = "sIM2Value";

	/** The Constant LINEINFO. */
	private static final String LINE_INFO = "lineInfo";

	/** The Constant CANNUMBERBERETAINED. */
	private static final String CANNUMBERBE_RETAINED = "canNumberBeRetained";

	/** The Constant PORTINFLAG. */
	private static final String PORTIN_FLAG = "portInFlag";

	/** The Constant VICCODE. */
	private static final String VIC_CODE = "vicCode";

	/** The Constant PENDINGORDERS. */
	private static final String PENDING_ORDERS = "pendingOrders";

	/** The parent identification. */
	@JsonProperty(PARENT_IDENTIFICATION)
	private String parentIdentification;

	/** The access line. */
	@JsonProperty(ACCESS_LINE)
	private AccessLine accessLine;

	/** The service type. */
	@JsonProperty(SERVICE_TYPE)
	private String serviceType;

	/** The service action. */
	@JsonProperty(SERVICE_ACTION)
	private String serviceAction;

	/** The s IM 2 value. */
	@JsonProperty(SIM2_VALUE)
	private String sIM2Value;

	/** The line info. */
	@JsonProperty(LINE_INFO)
	private String lineInfo;

	/** The can number be retained. */
	@JsonProperty(CANNUMBERBE_RETAINED)
	private boolean canNumberBeRetained;

	/** The Port in flag. */
	@JsonProperty(PORTIN_FLAG)
	private String portInFlag;

	/** The v IC code. */
	@JsonProperty(VIC_CODE)
	private String vicCode;

	/** The pending orders. */
	@JsonProperty(PENDING_ORDERS)
	private List<PendingOrder> pendingOrders = new ArrayList<>();

}
