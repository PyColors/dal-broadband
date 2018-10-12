package com.vf.uk.dal.broadband.controller.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vf.uk.dal.broadband.authorizer.BroadbandAuthorizationHelper;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.SelectedAvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.SiteNote;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.exception.BroadbandJourneyCustomException;
import com.vf.uk.dal.broadband.exception.ExceptionMessages;
import com.vf.uk.dal.broadband.exception.TILException;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.tests.util.FileUtility;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.exception.ErrorResponse;
import com.vf.uk.dal.constant.BroadBandConstant;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
@ActiveProfiles("local")
public class BroadbandControllerTest {

	@Autowired
	BroadbandController broadBandController;

	@MockBean
	RestTemplate restTemplate;

	@MockBean
	BroadbandRepoProvider broadBandRepoProvider;

	@MockBean
	BroadbandService broadbandService;

	@MockBean
	BroadbandAuthorizationHelper broadbandAuthorizationHelper;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setupMockBehaviour() throws Exception {

	}

	@Test
	public void testCheckAvailabilityForBroadband1() throws Exception {
		List<String> classificationCodeList = new ArrayList<>();
		classificationCodeList.add("Line and ADSL");
		classificationCodeList.add("Line and Fibre with Speed 76");
		classificationCodeList.add("Line and Fibre with Speed 38");
		AvailabilityCheckResponse expectedResponse = new AvailabilityCheckResponse();
		expectedResponse.setClassificationCode(classificationCodeList);
		Mockito.when(broadbandService.checkAvailabilityForBroadband(Mockito.any(AvailabilityCheckRequest.class),
				Mockito.anyString(), Mockito.any(Broadband.class), Mockito.anyString())).thenReturn(expectedResponse);
		String checkAvailabilityRequest = new String(FileUtility.readFile("\\rest-mock\\REQUEST.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(checkAvailabilityRequest,
				AvailabilityCheckRequest.class);
		ResponseEntity<AvailabilityCheckResponse> response = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER", "JWT aaaa", true);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(classificationCodeList, response.getBody().getClassificationCode());
	}

	@Test
	public void testCheckAvailabilityForBroadbandForFTTH() throws Exception {
		List<String> classificationCodeList = new ArrayList<>();
		classificationCodeList.add("Line and ADSL");
		classificationCodeList.add("Line and Fibre with Speed 76");
		classificationCodeList.add("Line and Fibre with Speed 38");
		AvailabilityCheckResponse expectedResponse = new AvailabilityCheckResponse();
		expectedResponse.setClassificationCode(classificationCodeList);
		Mockito.when(broadbandService.checkAvailabilityForBroadband(Mockito.any(AvailabilityCheckRequest.class),
				Mockito.anyString(), Mockito.any(Broadband.class), Mockito.anyString())).thenReturn(expectedResponse);
		String checkAvailabilityRequest = new String(FileUtility.readFile("\\rest-mock\\REQUESTFORFTTH.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(checkAvailabilityRequest,
				AvailabilityCheckRequest.class);
		ResponseEntity<AvailabilityCheckResponse> response = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER", null, true);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(classificationCodeList, response.getBody().getClassificationCode());
	}

	@Test
	public void testCreateOrUpdateBasket() throws Exception {
		String getBasketJsonResponse = new String(FileUtility.readFile("\\rest-mock\\GetBasket.json"));
		Basket basket = new ObjectMapper().readValue(getBasketJsonResponse, Basket.class);
		Mockito.when(broadbandService.createOrUpdatePackage(Mockito.any(BasketRequest.class),
				Mockito.any(Broadband.class), Mockito.anyString())).thenReturn(basket);
		String jsonString = new String(FileUtility.readFile("\\rest-mock\\CreateBasket.json"));
		BasketRequest basketRequest = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		Basket response = broadBandController.createOrUpdatePackage("12345678907888", basketRequest, null, true);
		assertEquals("2b23e0a1-eefd-409c-a919-e0ca774b9017", response.getBasketId());

	}

	@Test
	public void testCreateOrUpdateBasket_InvalidSource() throws Exception {
		String getBasketJsonResponse = new String(FileUtility.readFile("\\rest-mock\\GetBasket.json"));
		Basket basket = new ObjectMapper().readValue(getBasketJsonResponse, Basket.class);
		Mockito.when(broadbandService.createOrUpdatePackage(Mockito.any(BasketRequest.class),
				Mockito.any(Broadband.class), Mockito.anyString())).thenReturn(basket);
		String jsonString = new String(FileUtility.readFile("\\rest-mock\\CreateBasketInvRequest.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Source cannot be null while creating or updating the basket");
		broadBandController.createOrUpdatePackage("1234907888", request, null, true);
	}

	@Test
	public void testBroadbandFromCache() throws Exception {
		String getBroadbandCacheResponse = new String(FileUtility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadbandCacheResponse = new ObjectMapper().readValue(getBroadbandCacheResponse, Broadband.class);
		Mockito.when(broadbandService.getBroadbandFromCache(Mockito.anyString())).thenReturn(broadbandCacheResponse);
		Broadband response = broadBandController.getBroadbandInfo("12345678907888");
		assertEquals("2b23e0a1-eefd-409c-a919-e0ca774b9017", response.getBasketId());
		assertEquals("12345678907888", response.getBroadBandId());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise() throws Exception {
		String getAddressListJsonResponse = new String(
				FileUtility.readFile("\\rest-mock\\GetAddressByPostCode_Response.json"));
		AddressInfo addressInfoExpected = new ObjectMapper().readValue(getAddressListJsonResponse, AddressInfo.class);
		Mockito.when(broadbandService.getAddressInfoByPostcodeFromPremise(Mockito.anyString(), Mockito.anyString(),
				Mockito.anyString())).thenReturn(addressInfoExpected);

		AddressInfo addressInfoActual = broadBandController.getAddressByPostcode("LS290JJ", "FTTH",
				BroadBandConstant.BROADBAND_CONSUMER, null, true);
		assertEquals(addressInfoActual.getAddresses().size(), 1);
		assertEquals(addressInfoExpected.getCategory(), addressInfoActual.getCategory());
	}

	@Test
	public void testUpdateLineTreatmentType() throws Exception {
		UpdateLineRequest updateLineReq = new UpdateLineRequest();
		updateLineReq.setLineTreatmentType("NEW");
		ResponseEntity<HttpStatus> response = broadBandController.updateLineTypeInBasket("12345678907888",
				updateLineReq, null, false);
		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
	}

	@Test
	public void testUpdateLineTreatmentType_InvalidRequest() {
		UpdateLineRequest updateLineReq = new UpdateLineRequest();
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Line treatment type cannot be null.");
		broadBandController.updateLineTypeInBasket("12345678907888", updateLineReq, null, false);

	}

	@Test
	public void testGetFlbbListForExistingAndNew() throws Exception {
		String getFlbbListRespJson = new String(FileUtility.readFile("\\rest-mock\\FLBBListResponse.json"));
		List<FlbBundle> flbbListExpected = new ObjectMapper().readValue(getFlbbListRespJson,
				new TypeReference<List<FlbBundle>>() {
				});

		Mockito.when(broadbandService.getFlbList(Mockito.any(GetBundleListSearchCriteria.class)))
				.thenReturn(flbbListExpected);
		ResponseEntity<List<FlbBundle>> flbbListActual = broadBandController.getFlbbList("1234567823444", "Consumer",
				null, null, null, null, "category", null, null, false);
		assertEquals(HttpStatus.OK, flbbListActual.getStatusCode());

	}

	@Test
	public void testCreateAppointmentResponse() throws Exception {
		String createApointmentResponse = new String(
				FileUtility.readFile("\\rest-mock\\CreateAppointmentResponse.json"));
		CreateAppointmentResponse createApptResponse = new ObjectMapper().readValue(createApointmentResponse,
				CreateAppointmentResponse.class);
		Mockito.when(
				broadbandService.createAppointment(Mockito.any(CreateAppointmentRequest.class), Mockito.anyString()))
				.thenReturn(createApptResponse);
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		ResponseEntity<?> response = broadBandController.createAppointmentForFLBB("12345678907888", request, null,
				false);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("709cf962-1771-400c", ((CreateAppointmentResponse) response.getBody()).getApplicationId());

	}

	@Test
	public void testCreateAppointmentResponse_InvalidRequest() {
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Start Date time or time slot is null. This cannot be null");
		broadBandController.createAppointmentForFLBB("12345678907888", request, null, false);

	}

	@Test
	public void testGetAppointmentResponse() throws Exception {
		String getApointmentResponse = new String(FileUtility.readFile("\\rest-mock\\GetAppointmentResponse.json"));
		GetAppointmentResponse getApptResponse = new ObjectMapper().readValue(getApointmentResponse,
				GetAppointmentResponse.class);
		Mockito.when(broadbandService.getAppointmentForFLBB(Mockito.anyString())).thenReturn(getApptResponse);

		ResponseEntity<?> response = broadBandController.getAppointmentForFLBB("1234567890788889", null, false);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("2018-05-22 11:00:00",
				((GetAppointmentResponse) response.getBody()).getAppointmentWindowList().get(0).getStartDate());
	}

	@Test
	public void testGetAppointmentResponse_TILException() throws Exception {
		Mockito.when(broadbandService.getAppointmentForFLBB(Mockito.anyString())).thenThrow(TILException.class);
		ResponseEntity<?> response = broadBandController.getAppointmentForFLBB("1234567890788889", null, false);
		ErrorResponse errorResponse = (ErrorResponse) response.getBody();
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
		assertEquals("BROADBAND_GET_APPOINTMENT_EXCEPTION", errorResponse.getErrorCode());
	}

	@Test
	public void testGetCompatibleDevices() throws Exception {

		Mockito.when(broadbandService.getCompatibleDevicesForBundle(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(null);
		String jsonString = new String(FileUtility.readFile("\\rest-mock\\RouterDetailsList.json"));
		List<RouterDetails> responseExpected = new ObjectMapper().readValue(jsonString,
				new TypeReference<List<RouterDetails>>() {
				});
		Mockito.when(broadbandService.getCompatibleDevicesForBundle(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(responseExpected);
		ResponseEntity<List<RouterDetails>> response = broadBandController
				.getCompatibleDevicesForBundle("12345678907888", "110264", null, true);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(responseExpected.get(0).getProductId(), response.getBody().get(0).getProductId());

	}

	@Test
	public void testOptimizeBasket() {
		OptimizePackageResponse responseExpected = new OptimizePackageResponse();
		responseExpected.setHasPackageOptimized(true);
		Mockito.when(
				broadbandService.optimizePackageForFLBB(Mockito.any(OptimizePackageRequest.class), Mockito.anyString()))
				.thenReturn(responseExpected);
		OptimizePackageRequest optimizePackageRequest = new OptimizePackageRequest();
		optimizePackageRequest.setJourneyId("2290f3b1-1ed5-4513-9f86-110531c5fbfb");
		ResponseEntity<OptimizePackageResponse> responseActual = broadBandController
				.optimizePackageForFLBB("12345678907888", optimizePackageRequest, null, true);
		assertEquals(HttpStatus.OK, responseActual.getStatusCode());
		assertEquals(responseExpected.getHasPackageOptimized(), responseActual.getBody().getHasPackageOptimized());

	}

	@Test
	public void testServiceStartDate() {
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		ResponseEntity<HttpStatus> response = broadBandController.serviceStartDate("12345678907888",
				serviceStartDateRequest, null, false);
		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());

	}

	@Test
	public void testGetSelectedLineOptions() throws Exception {
		String getSelectedLineOptionsResponseJson = new String(
				FileUtility.readFile("\\rest-mock\\GetSelectedLineOptionsResponse.json"));
		SelectedAvailabilityCheckResponse responseExpected = new ObjectMapper()
				.readValue(getSelectedLineOptionsResponseJson, SelectedAvailabilityCheckResponse.class);
		Mockito.when(broadbandService.getSelectedLineOptions(Mockito.anyString())).thenReturn(responseExpected);
		ResponseEntity<SelectedAvailabilityCheckResponse> responseActual = broadBandController
				.getSelectedLineOptions("12345678907888", null, false);
		assertEquals(HttpStatus.OK, responseActual.getStatusCode());
		assertEquals(responseExpected.getInstallationAddress().getPostCode(),
				responseActual.getBody().getInstallationAddress().getPostCode());
		assertEquals(responseExpected.getAppointmentAndAvailabilityDetail().getCanNumberBeRetained(),
				responseActual.getBody().getAppointmentAndAvailabilityDetail().getCanNumberBeRetained());
	}

	@Test
	public void testChangeDetails() {
		ResponseEntity<HttpStatus> response = broadBandController.changeDetails("12345678907888", "12345678907", null,
				false);
		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
	}

	@Test
	public void testCreateAppointmentForFLBB_TILException() throws Exception {
		Mockito.when(
				broadbandService.createAppointment(Mockito.any(CreateAppointmentRequest.class), Mockito.anyString()))
				.thenThrow(TILException.class);
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		ResponseEntity<?> response = broadBandController.createAppointmentForFLBB("12345678907888", request, null,
				false);
		ErrorResponse errorResponse = (ErrorResponse) response.getBody();
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
		assertEquals("BROADBAND_CREATE_APPOINTMENT_EXCEPTION", errorResponse.getErrorCode());

	}

	@Test
	public void testServiceStartDate_InvalidBroadbandId() {
		doThrow(new BroadbandJourneyCustomException(ExceptionMessages.INVALID_BROADBAND_ID_CODE,
				ExceptionMessages.INVALID_BROADBAND_ID, "400")).when(broadbandService)
						.updateBasketWithServiceDate(Mockito.anyString(), Mockito.any(ServiceStartDateRequest.class));
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Invalid BroadBand Id sent in the Request");
		broadBandController.serviceStartDate("1234", serviceStartDateRequest,
				null, false);
	}

}
