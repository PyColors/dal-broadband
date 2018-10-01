package com.vf.uk.dal.broadband.exception;

/**
 * The Class ExceptionMessages.
 *
 * @author Infosys Limited
 */
public class ExceptionMessages {

	/** The Constant HTTP_SERVER_EXP_ERROR. */
	public static final String HTTP_SERVER_EXP_ERROR = "HTTP Server exception error occured";
	
	/** The Constant HTTP_CLIENT_EXP_ERROR. */
	public static final String HTTP_CLIENT_EXP_ERROR = "HTTP Client exception error occured";
	
	/** The Constant INTERNAL_API_CALL_EXP. */
	public static final String INTERNAL_API_CALL_EXP = "Exception in calling internal API";
	
	/** The Constant INVALID_API_REQUEST. */
	public static final String INVALID_API_REQUEST = "Invalid request to the API call";
	/** The Constant SOLR_GETPRODUCTMODEL_EXCEPTION. */
	//public static final String SOLR_GETPRODUCTMODEL_EXCEPTION = "Exception From Solr getProductModel";
	/** The Constant SOLR_CONNECTION_CLOSE_EXCEPTION. */
	//public static final String SOLR_CONNECTION_CLOSE_EXCEPTION = "Exception occured while closing solr connection";
	public static final String NO_DATA_RECIEVED = "No Data Found in solr.";
	
	/** The Constant EMPTY_GSA_RESPONSE. */
	public static final String EMPTY_GSA_RESPONSE = "No Data recieved from TIL";
	
	/** The Constant INVALID_SERVICE_LINE. */
	public static final String INVALID_SERVICE_LINE = "No Service Line recieved from TIL";
	
	/** The Constant NO_VALID_DATA_TIL. */
	public static final String NO_VALID_DATA_TIL = "No data recieved from TIL";
	/*public static final String INVALID_JOURNEY_DETAILS = "Invalid Journey id or details";
	public static final String CREATE_APPOINTMENT_FAILED = "Create Appointment failed";
	public static final String JOURNEY_ID_EMPTY = "Journey Id is empty";*/
	/** The Constant GEN_PACKAGE_EXCEPTION. */
	/*public static final String START_DATE_EMPTY = "Start date is empty";
	public static final String TIME_SLOT_EMPTY = "Time Slot is empty";
	public static final String BASKET_ID_EMPTY = "Basket Id is empty";*/
	public static final String GEN_PACKAGE_EXCEPTION = "General Exception issue while calling update package";
	
	/** The Constant GEN_BASKET_EXCEPTION. */
	public static final String GEN_BASKET_EXCEPTION = "General Exception while calling get basket";
	
	/** The Constant GEN_UPT_SP_EXCEPTION. */
	public static final String GEN_UPT_SP_EXCEPTION = "General Exception while calling update premise and service point in Basket";
	
	/** The Constant GEN_EXP_PRODUCT. */
	public static final String GEN_EXP_PRODUCT = "General Exception occured while invoking product API for Engineering Visit Product";
	
	/** The Constant PACKAGE_ID_EMPTY. */
	public static final String PACKAGE_ID_EMPTY = "Package id is empty. Not a valid request whule updating the basket";
	
	/** The Constant BUNDLE_ID_EMPTY. */
	public static final String BUNDLE_ID_EMPTY = "Bundle Id or Package Id is null. Not a valid request while updating";
	
	/** The Constant HARDWARE_ID_EMPTY. */
	public static final String HARDWARE_ID_EMPTY = "Hardware Id or Package Id is null. Not a valid request while updating";
	
	/** The Constant EMPTY_SOURCE. */
	public static final String EMPTY_SOURCE = "Source cannot be null while creating or updating the basket";
	
	/** The Constant EMPTY_CUSTOMER_REQUESTED_DATE. */
	public static final String EMPTY_CUSTOMER_REQUESTED_DATE = "Customer Requested date cannot be null while creating or updating the basket";
	
	/** The Constant NO_VALID_DATA_PRODUCT_ENGINEERING_FEE. */
	public static final String NO_VALID_DATA_PRODUCT_ENGINEERING_FEE = "No Valid data recieved while calling product MS";
	
	/** The Constant LINE_TREATEMENT_TYPE_EMPTY. */
	public static final String LINE_TREATEMENT_TYPE_EMPTY = "Line treatment type cannot be null.";
	
	/** The Constant GEN_EXCP_CREATE_BASKET. */
	public static final String GEN_EXCP_CREATE_BASKET = "General Exception occured while creating the basket";
	
	/** The Constant NO_VALID_DATA_DELIVERY_METHODS. */
	public static final String NO_VALID_DATA_DELIVERY_METHODS = "No Valid data recieved while calling Inventory MS";
	
	/** The Constant GEN_EXCP_ADD_PRODUCT. */
	public static final String GEN_EXCP_ADD_PRODUCT = "Generic exception while adding product in basket";
	
	/** The Constant START_DATE_EMPTY. */
	public static final String START_DATE_EMPTY = "Start Date time or time slot is null. This cannot be null";
	
	/** The Constant GEN_EXCP_UPDATE_APPT. */
	public static final String GEN_EXCP_UPDATE_APPT = "General Exception occured while updating the basket with the appointment information";
	
	/** The Constant CREATE_APPOINTMENT_FAILED. */
	public static final String CREATE_APPOINTMENT_FAILED = "Create Appointment Failed.";
	
	/** The Constant GEN_EXC_PROMOTION_API. */
	public static final String GEN_EXC_PROMOTION_API = "General Exception while calling promotion API";
	
	/** The Constant INVALID_BROADBAND_ID. */
	public static final String INVALID_BROADBAND_ID = "Invalid BroadBand Id sent in the Request";
	
	/** The Constant INVALID_INPUT_INCORRECT_DATE_FORMAT. */
	public static final String INVALID_INPUT_INCORRECT_DATE_FORMAT = "Invalid input, Incorrect date format. Date format should be yyyy-MM-dd";
	
	/** The Constant BUSINESS_ADDRESS. */
	public static final String BUSINESS_ADDRESS = "Please contact sales representative";

	public static final String EMPTY_SOURCE_CODE = "EMPTY_SOURCE_CODE";


	public static final String CUSTOMER_REQUESTED_DATE = "CUSTOMER_REQUESTED_DATE";

	public static final String EMPTY_PACKAGE_ID = "EMPTY_PACKAGE_ID";

	public static final String EMPTY_BUNDLE_ID_CODE = "EMPTY_BUNDLE_ID_CODE";

	public static final String EMPTY_HARDWARE_ID_CODE = "EMPTY_HARDWARE_ID_CODE";

	public static final String EMPTY_LINE_TREATMENT_TYPE = "EMPTY_LINE_TREATMENT_TYPE";

	public static final String EMPTY_START_DATE = "EMPTY_START_DATE";

	public static final String INVALID_DATE_FORMAT = "INVALID_DATE_FORMAT";

	public static final String EMPTY_START_TIME = "EMPTY_START_TIME";

	public static final String BUSINESS_ADDRESS_CODE = "BUSINESS_ADDRESS_CODE";

	public static final String CREATE_APPOINTMENT_FAILED_CODE = "CREATE_APPOINTMENT_FAILED_CODE";

	public static final String INVALID_BROADBAND_ID_CODE = "INVALID_BROADBAND_ID_CODE";
	
	/** The Constant GEN_EXC_BUNDLE_API. */
	public static final String GET_COMPATIBLE_FAILED = "GetCompatibleExtras Failed.";
	
	public static final String GET_COMPATIBLE_FAILED_CODE = "GET_COMPATIBLE_FAILED_CODE";
	
	/**
	 * Instantiates a new exception messages.
	 */
	private ExceptionMessages() {

	}
}
