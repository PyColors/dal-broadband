package com.vf.uk.dal.broadband.utils;

/**
 * @author Infosys Limited
 *
 */
public class ExceptionMessages {

	public static final String HTTP_SERVER_EXP_ERROR = "HTTP Server exception error occured";
	public static final String HTTP_CLIENT_EXP_ERROR = "HTTP Client exception error occured";
	public static final String INTERNAL_API_CALL_EXP = "Exception in calling internal API";
	public static final String INVALID_API_REQUEST = "Invalid request to the API call";
	/** The Constant SOLR_GETPRODUCTMODEL_EXCEPTION. */
	public static final String SOLR_GETPRODUCTMODEL_EXCEPTION = "Exception From Solr getProductModel";
	/** The Constant SOLR_CONNECTION_CLOSE_EXCEPTION. */
	public static final String SOLR_CONNECTION_CLOSE_EXCEPTION = "Exception occured while closing solr connection";
	public static final String NO_DATA_RECIEVED = "No Data Found in solr.";
	public static final String EMPTY_GSA_RESPONSE = "No Data recieved from TIL";
	public static final String INVALID_SERVICE_LINE = "No Service Line recieved from TIL";
	public static final String NO_VALID_DATA_TIL = "No data recieved from TIL";
	public static final String INVALID_JOURNEY_DETAILS = "Invalid Journey id or details";
	public static final String CREATE_APPOINTMENT_FAILED = "Create Appointment failed";
	public static final String JOURNEY_ID_EMPTY = "Journey Id is empty";
	public static final String START_DATE_EMPTY = "Start date is empty";
	public static final String TIME_SLOT_EMPTY = "Time Slot is empty";
	public static final String BASKET_ID_EMPTY = "Basket Id is empty";

	private ExceptionMessages() {

	}
}
