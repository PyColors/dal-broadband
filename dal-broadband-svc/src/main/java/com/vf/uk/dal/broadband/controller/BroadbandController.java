package com.vf.uk.dal.broadband.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.svc.BroadbandService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Class BroadbandController.
 */
@RestController
@RequestMapping("/")
public class BroadbandController {

	/** The broadband service. */
	@Autowired
	BroadbandService broadbandService;
	/**
	 * Check availability for broadband.
	 *
	 * @param availabilityCheckerRequest
	 *            the availability checker request
	 * @return the response entity
	 */
	@ApiOperation(value = "Check the service availability for the broad band service at the given location: post codes like RG14 2PA", notes = "This service accepts address, calls the GSA and creates / update the journey with the service point information.", response = AvailabilityCheckResponse.class, tags = {
			"AvailabilityCheck", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AvailabilityCheckResponse.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })

	@RequestMapping(value = "/{broadbandId}/lineOptions", produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<AvailabilityCheckResponse> checkAvailabilityForBroadband(
			@ApiParam(value = "Sends the availability check request", required = true) @Valid @RequestBody AvailabilityCheckRequest availabilityCheckerRequest,
			@ApiParam(value = "Broad band session id to support broadband cache", required = true) @PathVariable("broadbandId") String broadbandId) {

		AvailabilityCheckResponse availabilityCheckResponse = broadbandService
				.checkAvailabilityForBroadband(availabilityCheckerRequest,broadbandId);
		return new ResponseEntity<>(availabilityCheckResponse, HttpStatus.OK);

	}

	/**
	 * Gets the flbb list.
	 *
	 * @param userType
	 *            the user type
	 * @param offerCode
	 *            the offer code
	 * @param journeyType
	 *            the journey type
	 * @param duration
	 *            the duration
	 * @param classificationCode
	 *            the classification code
	 * @return the flbb list
	 */
	/*@ApiOperation(value = "Get the list of bundle(FLBB)  based on the filter criteria.", notes = "The service gets the details of the bundles from solr based on the filter criteria in the response.", response = FlbBundle.class, tags = {
			"Bundle", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = FlbBundle.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	@RequestMapping(value = "/plan", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<FlbBundle>> getFlbbList(
			@ApiParam(value = "To identify the User, the possible values are \"consumer\" or \"business\" for get bundle list and consumer , enterprise and soho for compatible plans Accepts Consumer, Enterprose and Soho. If none is passed then by default it takes consumer.") @RequestParam(value = "userType", required = false) String userType,
			@ApiParam(value = "Offercode sets the pricing information based on the offercode sent, and gets the data from promotions API.") @RequestParam(value = "offerCode", required = false) String offerCode,
			@ApiParam(value = "Indicates the journeyType of the customer. For eg. upgrade Accepts SecondLine, Upgrade. Upgrade is currently not supported. The provision is there but should not be sent until backend starts supporting. If nothing is passed then we default it to Acquisition or New Customer secondline, etc.") @RequestParam(value = "journeyType", required = false) String journeyType,
			@ApiParam(value = "bundles will be filter based on duration like 18 months or 24 months. Format is 18 Months or 24 Months or 12 Months") @RequestParam(value = "duration", required = false) String duration,
			@ApiParam(value = "Filter based on speed. Accepts single and comma seperated aswell Eg: Line Fibre with Speed 76,Line Fibre with Speed 38. If none is passed then we show all the packages for corresponding journeyType.") @RequestParam(value = "classificationCode", required = false) String classificationCode) {
		List<FlbBundle> listOfFlbBundle;
		GetBundleListSearchCriteria getBundleListSearchCriteria = new GetBundleListSearchCriteria();
		getBundleListSearchCriteria.setUserType(userType);
		getBundleListSearchCriteria.setJourneyType(journeyType);
		getBundleListSearchCriteria.setOfferCode(offerCode);
		getBundleListSearchCriteria.setClassificationCode(classificationCode);
		getBundleListSearchCriteria.setDuration(duration);
		getBundleListSearchCriteria.setBundleClass("FLBALL");
		listOfFlbBundle = broadbandService.getFlbList(getBundleListSearchCriteria);
		return new ResponseEntity<>(listOfFlbBundle, HttpStatus.OK);
	}*/

	/**
	 * Gets the available service start dates.
	 *
	 * @param earliestAvailableStartDate
	 *            the earliest available start date
	 * @param range
	 *            the range
	 * @return the available service start dates
	 */
/*	@ApiOperation(value = "Utility Service which accepts earliest available service start date returned by GSA service and returns the next possible service start dates (working days - excluding weekends and bank holidays), within the requested date range.", notes = "This service accepts earliest available service start date returned by GSA service and returns the next possible service start dates (working days - excluding weekends and bank holidays), within the requested date range. The ", response = ServiceStartDates.class, tags = {
			"AvailabilityCheck", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = ServiceStartDates.class),
			@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = ErrorResponse.class) })
	@RequestMapping(value = "/availableServiceStartDates", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> getAvailableServiceStartDates(
			@NotNull @ApiParam(value = "Earliest available service start date returned by GSA service in dd-MMM-yyyy", required = true) @RequestParam(value = "earliestAvailableStartDate", required = true) String earliestAvailableStartDate,
			@NotNull @ApiParam(value = "The range of days , based on which the service will send the available service startDates", required = true) @RequestParam(value = "range", required = true) BigDecimal range) {
		try {
			return ResponseEntity.status(HttpStatus.OK)
					.body(broadbandService.getAvailableServiceStartDates(earliestAvailableStartDate, range));
		} catch (DateTimeParseException | ParseException e) {
			LogHelper.error(getClass(), "ParseException occurred: " + e);
			com.vf.uk.dal.common.exception.ErrorResponse error = new com.vf.uk.dal.common.exception.ErrorResponse(400,
					"BROADBAND_INVALID_INPUT", "Invalid parameter value :  " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);

		} catch (Exception e) {
			LogHelper.error(getClass(), "Broadband Exception occurred: " + e);
			com.vf.uk.dal.common.exception.ErrorResponse error = new com.vf.uk.dal.common.exception.ErrorResponse(500,
					"BROADBAND_COHERENCE_EXCEPTION", "RECORD NOT FOUND :  " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);

		}
	}

	@ApiOperation(value = "Creates the appointment, updates the journey and basket", notes = "This service calls the Create Appointment TIL wrapper, update the journey with the appointment and site note information and update the basket with the appointment date", response = CreateAppointmentResponse.class, tags = {
			"Appointment", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = CreateAppointmentResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Void.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })

	@RequestMapping(value = "/{journeyId}/appointment", produces = { "application/json" }, method = RequestMethod.POST)

	public ResponseEntity<CreateAppointmentResponse> createAppointmentForFLBB(
			@ApiParam(value = "Journey id of the broadband - Unique", required = true) @Valid @PathVariable(value = "journeyId") String journeyId,
			@ApiParam(value = "Sends the availability check request", required = true) @Valid @RequestBody CreateAppointmentRequest createAppointmentRequest) {
		
		BroadbandValidator.isCreateAppointmentRequestValid(createAppointmentRequest);
		CreateAppointmentResponse createAppointmentResponse = broadbandService
				.createAppointmentForFLBB(createAppointmentRequest,journeyId);
		if (StringUtils.isNotBlank(createAppointmentResponse.getApplicationId())) {
			return new ResponseEntity<>(createAppointmentResponse, HttpStatus.OK);
		} else {
			LogHelper.error(this, "Create Appointment failed!!!");
			throw new ApplicationException(ExceptionMessages.CREATE_APPOINTMENT_FAILED);
		}

	}*/
	
	
	@ApiOperation(value = "Gets the list of addresses for a given postal code", notes = "Gets the list of addresses for a given postal code", response = AddressInfo.class, tags = { "Premise"})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AddressInfo.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class)})
	@RequestMapping(value = "/premise/{postCode}", produces = { "application/json" }, method = RequestMethod.GET)
	public AddressInfo getAddressByPostcode(
			@ApiParam(value = "Postcode.RG14 5BC or RG145BC. Partial postcode not supported", required = true) @PathVariable("postCode") String postCode) {
			return broadbandService.getAddressInfoByPostcodeFromPremise(postCode);
	}	
	
}
