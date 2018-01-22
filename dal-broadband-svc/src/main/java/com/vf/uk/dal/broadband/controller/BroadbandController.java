package com.vf.uk.dal.broadband.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.ServiceStartDates;
import com.vf.uk.dal.broadband.svc.BroadbandService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/")
public class BroadbandController {

	@Autowired
	BroadbandService broadbandService;

	@ApiOperation(value = "check the availability checker for the braod band journey", notes = "This service accepts address, calls the GSA and creates / update the journey with the service point information.", response = AvailabilityCheckResponse.class, tags = {
			"AvailabilityCheck", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AvailabilityCheckResponse.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })

	@RequestMapping(value = "/availability/check", produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<AvailabilityCheckResponse> checkAvailabilityForBroadband(
			@ApiParam(value = "Sends the availability check request", required = true) @Valid @RequestBody AvailabilityCheckRequest availabilityCheckerRequest) {

		AvailabilityCheckResponse availabilityCheckResponse = broadbandService
				.checkAvailabilityForBroadband(availabilityCheckerRequest);
		return new ResponseEntity<AvailabilityCheckResponse>(availabilityCheckResponse, HttpStatus.OK);

	}

	@ApiOperation(value = "Get the list of bundle(FLBB)  based on the filter criteria.", notes = "The service gets the details of the bundles from solr based on the filter criteria in the response.", response = FlbBundle.class, tags = {
			"Bundle", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = FlbBundle.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	@RequestMapping(value = "/bundle", produces = { "application/json" }, method = RequestMethod.GET)
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
		return new ResponseEntity<List<FlbBundle>>(listOfFlbBundle, HttpStatus.OK);
	}

	@ApiOperation(value = "Utility Service which accepts earliest available service start date returned by GSA service and returns the next possible service start dates (working days - excluding weekends and bank holidays), within the requested date range.", notes = "This service accepts earliest available service start date returned by GSA service and returns the next possible service start dates (working days - excluding weekends and bank holidays), within the requested date range. The ", response = ServiceStartDates.class, tags = {
			"AvailabilityCheck", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = ServiceStartDates.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Void.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	@RequestMapping(value = "/availablity/serviceStartDates", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ServiceStartDates> getAvailableServiceStartDates(
			@NotNull @ApiParam(value = "earliest available service start date returned by GSA service", required = true) @RequestParam(value = "earliestAvailableStartDate", required = true) String earliestAvailableStartDate,
			@NotNull @ApiParam(value = "The range of days , based on which the service will send the available service startDates", required = true) @RequestParam(value = "range", required = true) BigDecimal range) {
		return new ResponseEntity<ServiceStartDates>(
				broadbandService.getAvailableServiceStartDates(earliestAvailableStartDate, range), HttpStatus.OK);
	}

	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public com.vf.uk.dal.common.exception.ErrorResponse handleMissingParams(
			MissingServletRequestParameterException ex) {

		return new com.vf.uk.dal.common.exception.ErrorResponse(400, "BROADBAND_INVALID_INPUT",
				"Missing mandatory parameter " + ex.getParameterName());

	}
}
