package com.vf.uk.dal.broadband.utils;

/**
 * @author Infosys Limited
 *
 */
public class ExceptionMessages {

	/*public static final String HTTP_SERVER_EXP_ERROR = "HTTP Server exception error occured";
	public static final String HTTP_CLIENT_EXP_ERROR = "HTTP Client exception error occured";
	public static final String INTERNAL_API_CALL_EXP = "Exception in calling internal API";
	public static final String INVALID_API_REQUEST = "Invalid request to the API call";*/
	/** The Constant SOLR_GETPRODUCTMODEL_EXCEPTION. */
	//public static final String SOLR_GETPRODUCTMODEL_EXCEPTION = "Exception From Solr getProductModel";
	/** The Constant SOLR_CONNECTION_CLOSE_EXCEPTION. */
	//public static final String SOLR_CONNECTION_CLOSE_EXCEPTION = "Exception occured while closing solr connection";
	public static final String NO_DATA_RECIEVED = "No Data Found in solr.";
	public static final String EMPTY_GSA_RESPONSE = "No Data recieved from TIL";
	public static final String INVALID_SERVICE_LINE = "No Service Line recieved from TIL";
	public static final String NO_VALID_DATA_TIL = "No data recieved from TIL";
	/*public static final String INVALID_JOURNEY_DETAILS = "Invalid Journey id or details";
	public static final String CREATE_APPOINTMENT_FAILED = "Create Appointment failed";
	public static final String JOURNEY_ID_EMPTY = "Journey Id is empty";*/
	/*public static final String START_DATE_EMPTY = "Start date is empty";
	public static final String TIME_SLOT_EMPTY = "Time Slot is empty";
	public static final String BASKET_ID_EMPTY = "Basket Id is empty";*/
	public static final String GEN_PACKAGE_EXCEPTION = "General Exception issue while calling update package";
	public static final String GEN_BASKET_EXCEPTION = "General Exception while calling get basket";
	public static final String GEN_UPT_SP_EXCEPTION = "General Exception while calling update premise and service point in Basket";
	public static final String GEN_EXP_PRODUCT = "General Exception occured while invoking product API for Engineering Visit Product";
	public static final String PACKAGE_ID_EMPTY = "Package id is empty. Not a valid request whule updating the basket";
	public static final String BUNDLE_ID_EMPTY = "Bundle Id or Package Id is null. Not a valid request while updating";
	public static final String HARDWARE_ID_EMPTY = "Hardware Id or Package Id is null. Not a valid request while updating";
	public static final String EMPTY_SOURCE = "Source cannot be null while creating or updating the basket";
	public static final String EMPTY_CUSTOMER_REQUESTED_DATE = "Customer Requested date cannot be null while creating or updating the basket";
	public static final String NO_VALID_DATA_PRODUCT_ENGINEERING_FEE = "No Valid data recieved while calling product MS";
	public static final String LINE_TREATEMENT_TYPE_EMPTY = "Line treatment type cannot be null.";
	public static final String GEN_EXCP_CREATE_BASKET = "General Exception occured while creating the basket";

	private ExceptionMessages() {

	}
}
