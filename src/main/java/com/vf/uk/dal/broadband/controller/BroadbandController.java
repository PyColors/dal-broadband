package com.vf.uk.dal.broadband.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vf.uk.dal.broadband.authorizer.BroadbandAuthorizationHelper;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.EnhanceCompatibleExtraResponse;
import com.vf.uk.dal.broadband.entity.Extra;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.SelectedAvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.exception.TILException;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.validator.BroadbandValidator;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;

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

	@Autowired
	BroadbandAuthorizationHelper broadbandAuthorizationHelper;

	/**
	 * Check availability for broadband.
	 *
	 * @param availabilityCheckerRequest
	 *            the availability checker request
	 * @param broadbandId
	 *            the broadband id
	 * @param userType
	 *            the user type
	 * @return the response entity
	 */
	@ApiOperation(value = "Check the service availability for the broad band service at the given location: post codes like RG14 2PA", notes = "This service accepts address, calls the GSA and creates / update the journey with the service point information.", response = AvailabilityCheckResponse.class, tags = {
			"AvailabilityCheck", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AvailabilityCheckResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })

	@RequestMapping(value = "/{broadbandId}/lineOptions", produces = {
			"application/hal+json" }, method = RequestMethod.POST)
	public ResponseEntity<AvailabilityCheckResponse> checkAvailabilityForBroadband(
			@ApiParam(value = "Sends the availability check request", required = true) @Valid @RequestBody AvailabilityCheckRequest availabilityCheckerRequest,
			@ApiParam(value = "Broad band session id to support broadband cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "user type", required = false) @RequestParam(value = "userType", required = false, defaultValue = "CONSUMER") String userType,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {

		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");
		Broadband broadband = broadbandService.getBroadbandFromCache(broadbandId);
		AvailabilityCheckResponse availabilityCheckResponse = broadbandService
				.checkAvailabilityForBroadband(availabilityCheckerRequest, broadbandId, broadband, userType);
		// Link selfLink =
		// ControllerLinkBuilder.linkTo(BroadbandController.class).metho
		return new ResponseEntity<>(availabilityCheckResponse, HttpStatus.OK);

	}

	/**
	 * Gets the flbb list.
	 *
	 * @param broadbandId
	 *            the broadband id
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
	 * @param categoryPreference
	 *            the category preference
	 * @return the flbb list
	 */
	@ApiOperation(value = "Get the list of bundle(FLBB)  based on the filter criteria.", notes = "The service gets the details of the bundles from solr based on the filter criteria in the response.", response = FlbBundle[].class, tags = {
			"Bundle", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = FlbBundle[].class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/plan", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<FlbBundle>> getFlbbList(
			@ApiParam(value = "Broad band session id to support broadband cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "To identify the User, the possible values are \"consumer\" or \"business\" for get bundle list and consumer , enterprise and soho for compatible plans Accepts Consumer, Enterprose and Soho. If none is passed then by default it takes consumer.") @RequestParam(value = "userType", required = false, defaultValue = "CONSUMER") String userType,
			@ApiParam(value = "Offercode sets the pricing information based on the offercode sent, and gets the data from promotions API.") @RequestParam(value = "offerCode", required = false) String offerCode,
			@ApiParam(value = "Indicates the journeyType of the customer. For eg. upgrade Accepts SecondLine, Upgrade. Upgrade is currently not supported. The provision is there but should not be sent until backend starts supporting. If nothing is passed then we default it to Acquisition or New Customer secondline, etc.") @RequestParam(value = "journeyType", required = false) String journeyType,
			@ApiParam(value = "bundles will be filter based on duration like 18 months or 24 months. Format is 18 Months or 24 Months or 12 Months") @RequestParam(value = "duration", required = false) String duration,
			@ApiParam(value = "Filter based on speed. Accepts single and comma seperated aswell Eg: Line Fibre with Speed 76,Line Fibre with Speed 38. If none is passed then we show all the packages for corresponding journeyType.") @RequestParam(value = "classificationCode", required = false) String classificationCode,
			@ApiParam(value = "Filter based on category preferences. Accepts FTTH or FTTC") @RequestParam(value = "categoryPreference", required = false) String categoryPreference,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");
		List<FlbBundle> listOfFlbBundle;
		GetBundleListSearchCriteria getBundleListSearchCriteria = new GetBundleListSearchCriteria();
		getBundleListSearchCriteria.setBroadbandId(broadbandId);
		getBundleListSearchCriteria.setUserType(userType);
		getBundleListSearchCriteria.setJourneyType(journeyType);
		getBundleListSearchCriteria.setOfferCode(offerCode);
		getBundleListSearchCriteria.setClassificationCode(classificationCode);
		getBundleListSearchCriteria.setDuration(duration);
		getBundleListSearchCriteria.setBundleClass("FTTH");
		if (StringUtils.isNotBlank(categoryPreference)) {
			getBundleListSearchCriteria.setBundleClass(categoryPreference);
		}
		listOfFlbBundle = broadbandService.getFlbList(getBundleListSearchCriteria);
		return new ResponseEntity<>(listOfFlbBundle, HttpStatus.OK);

	}

	/**
	 * Gets the address by postcode.
	 *
	 * @param postCode
	 *            the post code
	 * @param categoryPreference
	 *            the category preference
	 * @param userType
	 *            the user type
	 * @return the address by postcode
	 */
	@ApiOperation(value = "Gets the list of addresses for a given postal code", notes = "Gets the list of addresses for a given postal code", response = AddressInfo.class, tags = {
			"Premise" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AddressInfo.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/premise/{postCode}", produces = { "application/hal+json" }, method = RequestMethod.GET)
	public AddressInfo getAddressByPostcode(
			@ApiParam(value = "Postcode.RG14 5BC or RG145BC. Partial postcode not supported", required = true) @PathVariable("postCode") String postCode,
			@ApiParam(value = "Provides a preference of which Fixed Line Address database the address is to be fetched from. Expected inputs are FTTH,FTTC etc..", required = false) @RequestParam(value = "categoryPreference", required = false) String categoryPreference,
			@ApiParam(value = "Provides Business or Consumer context", required = false) @RequestParam(value = "userType", required = false, defaultValue = "Consumer") String userType,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		try {
			broadbandAuthorizationHelper.authorizeAnonymousRequest("0", "1", "2", "3");
			return broadbandService.getAddressInfoByPostcodeFromPremise(URLDecoder.decode(postCode, "UTF-8"),
					categoryPreference, userType);
		} catch (UnsupportedEncodingException e) {
			throw new ApplicationException("Invalid_Format_PostCode" + e);
		}
	}

	/**
	 * Creates the or update package.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param basketRequest
	 *            the basket request
	 * @return the basket
	 */
	@ApiOperation(value = "Create or updates the basket when the user selects the package", notes = "Create or update the basket when the user selects the the package", response = Basket.class, tags = {
			"Broadband Basket" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Basket.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/package", produces = {
			"application/hal+json" }, method = RequestMethod.POST)
	public Basket createOrUpdatePackage(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "Sends the availability check request", required = true) @Valid @RequestBody BasketRequest basketRequest,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");;
		Broadband broadband = broadbandService.getBroadbandFromCache(broadbandId);
		BroadbandValidator.isBasketCreateOrUpdateRequestValid(basketRequest, broadband);
		return broadbandService.createOrUpdatePackage(basketRequest, broadband, broadbandId);
	}

	/**
	 * Gets the broadband info.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @return the broadband info
	 */
	@ApiOperation(value = "Gives the Broadband cache using broadband id", notes = "Gets the broadband cache using broadband id", response = Broadband.class, tags = {
			"Broadband" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Broadband.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/broadband/{broadbandId}", produces = { "application/json" }, method = RequestMethod.GET)
	public Broadband getBroadbandInfo(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");;
		return broadbandService.getBroadbandFromCache(broadbandId);
	}

	/**
	 * Update line type in basket.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param updateLineRequest
	 *            the update line request
	 * @return the response entity
	 */
	@ApiOperation(value = "Updates the basket and cache with the line option selected and the selected package code of the plan", notes = "Update the basket with the line options and package code, to be used by checkout for creating the Service point info in the CSO", response = HttpStatus.class, tags = {
			"Broadband, Selected Line API" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = HttpStatus.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/lineType", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<HttpStatus> updateLineTypeInBasket(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "Request to update the line treatment type in the basket and cache", required = true) @Valid @RequestBody UpdateLineRequest updateLineRequest,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");
		BroadbandValidator.isUpdateLineTreatmentRequestValid(updateLineRequest);
		broadbandService.updateBasketWithLineTreatmentType(broadbandId, updateLineRequest);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	/**
	 * Creates the appointment for FLBB.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param createAppointmentRequest
	 *            the create appointment request
	 * @return the response entity
	 */
	@ApiOperation(value = "Creates the appointment and updates the broadband cache and basket with the appointmenr information", notes = "This service calls create appointment TIL service and updates the basket with the appointment information", response = CreateAppointmentResponse.class, tags = {
			"Broadband, Appointment" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = CreateAppointmentResponse.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/appointment", produces = {
			"application/hal+json" }, method = RequestMethod.POST)
	public ResponseEntity<?> createAppointmentForFLBB(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "Request to update the broadband with the appointment information ", required = true) @Valid @RequestBody com.vf.uk.dal.broadband.entity.CreateAppointmentRequest createAppointmentRequest,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");
		BroadbandValidator.isCreateAppointmentRequestValid(createAppointmentRequest);
		CreateAppointmentResponse createAppointmentresponse;
		try {
			createAppointmentresponse = broadbandService.createAppointment(createAppointmentRequest, broadbandId);
		} catch (TILException e) {
			LogHelper.error(getClass(), "ERROR WHILE CALLING CREATE APPOINTMENT: " + e);
			com.vf.uk.dal.common.exception.ErrorResponse error = new com.vf.uk.dal.common.exception.ErrorResponse(400,
					"BROADBAND_CREATE_APPOINTMENT_EXCEPTION", e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
		}
		return new ResponseEntity<>(createAppointmentresponse, HttpStatus.OK);
	}

	/**
	 * Service start date.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param serviceStartDateRequest
	 *            the service start date request
	 * @return the response entity
	 */
	@ApiOperation(value = "Updates the basket with service start date and service point info in basket if user selects to remove from directory", notes = "This service calls update basket, based on the earliest available date and also service point with the remove me from phone directory information based on if user has selected", response = HttpStatus.class, tags = {
			"Broadband, Service Start Date" })
	@ApiResponses(value = { @ApiResponse(code = 204, message = "Success", response = HttpStatus.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/startDate", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<HttpStatus> serviceStartDate(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "Request to update the broadband with the service start date information, Date format Should be yyyy-MM-dd ", required = true) @Valid @RequestBody com.vf.uk.dal.broadband.entity.ServiceStartDateRequest serviceStartDateRequest,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");;
		broadbandService.updateBasketWithServiceDate(broadbandId, serviceStartDateRequest);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	/**
	 * Optimize package for FLBB.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param optimizePackageRequest
	 *            the optimize package request
	 * @return the response entity
	 */
	@ApiOperation(value = "Optimize the basket by replacing the package", notes = "This service calls promotion API to get the plan which needs to be replaced and then calls update package", response = com.vf.uk.dal.broadband.entity.OptimizePackageResponse.class, tags = {
			"Broadband, Optimize Basket" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = OptimizePackageResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/optimize/package", produces = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<OptimizePackageResponse> optimizePackageForFLBB(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "Request for optimizing the broadband package", required = true) @Valid @RequestBody OptimizePackageRequest optimizePackageRequest,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");;
		return new ResponseEntity<>(broadbandService.optimizePackageForFLBB(optimizePackageRequest, broadbandId),
				HttpStatus.OK);
	}

	/**
	 * Gets the appointment for FLBB.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @return the appointment for FLBB
	 */
	@ApiOperation(value = "Gets the list of appointment based  ", notes = "This service gets the service start date from the cache and calls getAppointmentList", response = GetAppointmentResponse.class, tags = {
			"Broadband, Appointment" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = GetAppointmentResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/appointment", produces = {
			"application/hal+json" }, method = RequestMethod.GET)
	public ResponseEntity<?> getAppointmentForFLBB(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		try {
			broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");;
			return new ResponseEntity<>(broadbandService.getAppointmentForFLBB(broadbandId), HttpStatus.OK);
		} catch (TILException e) {
			LogHelper.error(getClass(), "ERROR WHILE CALLING GET APPOINTMENT: " + e);
			com.vf.uk.dal.common.exception.ErrorResponse error = new com.vf.uk.dal.common.exception.ErrorResponse(400,
					"BROADBAND_GET_APPOINTMENT_EXCEPTION", e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
		}
	}

	/**
	 * Gets the compatible devices for bundle.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param planId
	 *            the plan id
	 * @return the compatible devices for bundle
	 */
	@ApiOperation(value = "Get the list of the compatible devices based on the plan id sent", notes = "This service is called, get compatible devices and send the response to the client ", response = RouterDetails[].class, tags = {
			"Broadband, Compatible Routers" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = RouterDetails[].class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/plan/{planId}/router", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<RouterDetails>> getCompatibleDevicesForBundle(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@ApiParam(value = "plan id based on which we need to query the compatible devices", required = true) @PathVariable("planId") String planId,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");;
		return new ResponseEntity<>(broadbandService.getCompatibleDevicesForBundle(broadbandId, planId), HttpStatus.OK);
	}

	/**
	 * Gets the compatible devices for bundle.
	 *
	 * @param broadbandId
	 *            the broadband id
	 * @param planId
	 *            the plan id
	 * @return the compatible devices for bundle
	 */
	@ApiOperation(value = "Fetches the line options from the Cache based on the broadband id", notes = "Fetches the line options from the Cache based on the broadband id", response = SelectedAvailabilityCheckResponse.class, tags = {
			"AvailabilityCheck" })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = SelectedAvailabilityCheckResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@RequestMapping(value = "/{broadbandId}/lineOptions/selected", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<SelectedAvailabilityCheckResponse> getSelectedLineOptions(
			@ApiParam(value = "broadband id to query from broad band cache", required = true) @PathVariable("broadbandId") String broadbandId,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeRequest(broadbandId,"0", "1", "2", "3");
		return new ResponseEntity<>(broadbandService.getSelectedLineOptions(broadbandId), HttpStatus.OK);
	}

	@ApiOperation(value = "Get the list of extras associated with plan ", notes = "This service gets the details of extra for a plan along with the necessary information in the response.", response = Extra.class, responseContainer = "List", tags = {
			"Extra", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = EnhanceCompatibleExtraResponse.class, responseContainer = "List"),
			@ApiResponse(code = 400, message = "Bad request", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 405, message = "Method not allowed", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 404, message = "Not found", response = com.vf.uk.dal.broadband.entity.Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = com.vf.uk.dal.broadband.entity.Error.class) })
	@GetMapping(value = "/compatibleExtras/{planId}/productGroupType/{productGroupType}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EnhanceCompatibleExtraResponse> getCompatibleExtras(
			@ApiParam(value = "Returns compatible extras for the specific plan ID", required = true) @PathVariable("planId") String planId,
			@ApiParam(value = "Returns compatible extras for the specific productGroupType", required = true) @PathVariable("productGroupType") String productGroupType,
			@RequestHeader(value = "Authorization", required = false) String authorizationHeader) {
		broadbandAuthorizationHelper.authorizeAnonymousRequest("0", "1", "2", "3");
		return new ResponseEntity<>(broadbandService.getCompatibleExtras(planId, productGroupType), HttpStatus.OK);

	}

}
