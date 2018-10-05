package com.vf.uk.dal.broadband.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.config.ConfigurationManager;
import com.vf.uk.dal.broadband.authorizer.BroadbandAuthorizationHelper;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.Extra;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.SiteNote;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.exception.BroadbandJourneyCustomException;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.common.registry.client.Utility;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

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
	BroadbandAuthorizationHelper broadbandAuthorizationHelper;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setupMockBehaviour() throws Exception {

		String gsaRequest = new String(Utility.readFile("\\rest-mock\\GSAREQUEST1.json"));
		GetServiceAvailibilityRequest requestGsa = new ObjectMapper().readValue(gsaRequest,
				GetServiceAvailibilityRequest.class);
		ConfigurationManager.loadCascadedPropertiesFromResources("DigitalDBMock");
		String jsonString = new String(Utility.readFile("\\rest-mock\\GSAREQUEST.json"));
		GetServiceAvailibilityRequest request = new ObjectMapper().readValue(jsonString,
				GetServiceAvailibilityRequest.class);
		
		String jsonStringForFTTH = new String(Utility.readFile("\\rest-mock\\GSAREQUEST_FTTH.json"));
		GetServiceAvailibilityRequest requestForFTTH = new ObjectMapper().readValue(jsonStringForFTTH,
				GetServiceAvailibilityRequest.class);

		String gsaResponse = new String(Utility.readFile("\\rest-mock\\GSAResponse.json"));
		GetServiceAvailibilityResponse responseGsa = new ObjectMapper().readValue(gsaResponse,
				GetServiceAvailibilityResponse.class);

		String createApointmentRequest = new String(Utility.readFile("\\rest-mock\\CreateAppointmentRequest.json"));
		com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createApptRequest = new ObjectMapper()
				.readValue(createApointmentRequest,
						com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest.class);

		String createAppointmentJsonResponse = new String(
				Utility.readFile("\\rest-mock\\CreateAppointment_Response.json"));
		CreateAppointment createApptResponse = new ObjectMapper().readValue(createAppointmentJsonResponse,
				CreateAppointment.class);

		given(restTemplate.postForEntity("http://APPOINTMENT-V1/appointment/createAppointment", createApptRequest,
				CreateAppointment.class))
						.willReturn(new ResponseEntity<CreateAppointment>(createApptResponse, HttpStatus.OK));

		/////// Get Appointment

		String getAppointmentJsonRequest = new String(Utility.readFile("\\rest-mock\\GetAppointmentRequest.json"));
		com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest getApptRequest = new ObjectMapper().readValue(
				getAppointmentJsonRequest, com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest.class);

		String jsonStringGAResponse = new String(Utility.readFile("\\rest-mock\\GetAppointment_Response.json"));
		GetAppointment getAppointmentResponse = new ObjectMapper().readValue(jsonStringGAResponse,
				GetAppointment.class);

		given(restTemplate.postForEntity("http://APPOINTMENT-V1/appointment/action/getAppointment", getApptRequest,
				GetAppointment.class))
						.willReturn(new ResponseEntity<GetAppointment>(getAppointmentResponse, HttpStatus.OK));

		BundlePromotionRequest requestForPromo = new BundlePromotionRequest();
		List<String> bundleIdList = new ArrayList<>();
		bundleIdList.add("110264");
		requestForPromo.setBundleIdList(bundleIdList);
		requestForPromo.setJourneyType("SecondLine");
		String promotionResponse = new String(Utility.readFile("\\rest-mock\\GetPromotionForBundle.json"));
		BundlePromotion[] bundlePromotion = new ObjectMapper().readValue(promotionResponse, BundlePromotion[].class);
		given(restTemplate.postForEntity("http://PROMOTION-V1/promotion/queries/ForBundleList", requestForPromo,
				BundlePromotion[].class))
						.willReturn(new ResponseEntity<BundlePromotion[]>(bundlePromotion, HttpStatus.OK));
		/////

		//////// Get Current Journey

		String getCurrentJourneyResponse = new String(Utility.readFile("\\rest-mock\\GetCurrentJourneyResponse.json"));
		CurrentJourney currentJourney = new ObjectMapper().readValue(getCurrentJourneyResponse, CurrentJourney.class);

		given(restTemplate.getForEntity(
				"http://JOURNEY-V1/journey/2290f3b1-1ed5-4513-9f86-110531c5fbfb/queries/currentJourney",
				CurrentJourney.class)).willReturn(new ResponseEntity<CurrentJourney>(currentJourney, HttpStatus.OK));

		//////////

		String getAddressListJsonResponse = new String(
				Utility.readFile("\\rest-mock\\GetAddressByPostCode_Response.json"));
		AddressInfo galResponse = new ObjectMapper().readValue(getAddressListJsonResponse, AddressInfo.class);

		String getBroadbandCacheResponse = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadbandCacheResponse = new ObjectMapper().readValue(getBroadbandCacheResponse, Broadband.class);

		String getBroadbandCacheResponseWithoutBasketId = new String(
				Utility.readFile("\\rest-mock\\BroadbandCacheResponseWithNoBasketId.json"));
		Broadband broadbandCacheResWithoutBasketId = new ObjectMapper()
				.readValue(getBroadbandCacheResponseWithoutBasketId, Broadband.class);

		
		String getBroadbandCacheResponseWithOnlyOneLineTreatment = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse3.json"));
		Broadband broadbandCacheResponseWithOnlyOneLineTreatment = new ObjectMapper().readValue(getBroadbandCacheResponseWithOnlyOneLineTreatment, Broadband.class);
		
		
		
		given(broadBandRepoProvider.getBroadbandFromCache("1234567890788889")).willReturn(broadbandCacheResponseWithOnlyOneLineTreatment);
		
		
		String broadbandCacheResp = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse2.json"));
		Broadband broadbandCacheRes = new ObjectMapper().readValue(broadbandCacheResp, Broadband.class);

		String getBasketJsonResponse = new String(Utility.readFile("\\rest-mock\\GetBasket.json"));
		Basket basket = new ObjectMapper().readValue(getBasketJsonResponse, Basket.class);

		String getProductsResponse = new String(Utility.readFile("\\rest-mock\\GetProducts.json"));

		CommercialProduct[] productDetails = new ObjectMapper().readValue(getProductsResponse,
				CommercialProduct[].class);

		String createBasketJsonRequest = new String(Utility.readFile("\\rest-mock\\CreateBasketRequest.json"));

		CreateBasketRequest createBasketRequest = new ObjectMapper().readValue(createBasketJsonRequest,
				CreateBasketRequest.class);
		
		
		String createBasketJsonRequestWithServicePoint = new String(Utility.readFile("\\rest-mock\\CreateBasketRequestWithServicePoint.json"));

		CreateBasketRequest createBasketRequestWithServicePoint = new ObjectMapper().readValue(createBasketJsonRequestWithServicePoint,
				CreateBasketRequest.class);
		
		
		String createBasketJsonRequestWithoutAffiliate = new String(Utility.readFile("\\rest-mock\\CreateBasketRequestWithoutAffiliate.json"));

		CreateBasketRequest createBasketRequestWithoutAffiliate = new ObjectMapper().readValue(createBasketJsonRequestWithoutAffiliate,
				CreateBasketRequest.class);

		String bbCacheResponse = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse1.json"));
		Broadband bbResponse = new ObjectMapper().readValue(bbCacheResponse, Broadband.class);

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907")).willReturn(bbResponse);

		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequest, Basket.class))
				.willReturn(new ResponseEntity<>(basket, HttpStatus.OK));
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequestWithServicePoint, Basket.class))
		.willReturn(new ResponseEntity<>(basket, HttpStatus.OK));
		
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequestWithoutAffiliate, Basket.class))
		.willReturn(new ResponseEntity<>(basket, HttpStatus.OK));
		
		
		String createBasketJsonRequestWithServieId = new String(Utility.readFile("\\rest-mock\\CreateBasketRequestWithServiceId.json"));

		CreateBasketRequest createBasketRequestWithServieId = new ObjectMapper().readValue(createBasketJsonRequestWithServieId,
				CreateBasketRequest.class);
		
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequestWithServieId, Basket.class))
		.willReturn(new ResponseEntity<>(basket, HttpStatus.OK));
		
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandCacheResponse);
		given(broadBandRepoProvider.getBroadbandFromCache("123456789078881"))
				.willReturn(broadbandCacheResWithoutBasketId);

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907899")).willReturn(broadbandCacheRes);

		given(restTemplate.getForEntity("http://PRODUCTS-V1/products/catalogue/products?class:name=Fee:Engineer Visit&isFTTH=false&preorderable=false",
				CommercialProduct[].class))
						.willReturn(new ResponseEntity<CommercialProduct[]>(productDetails, HttpStatus.OK));
		
		given(restTemplate.getForEntity("http://PRODUCTS-V1/products/catalogue/products?class:name=Fixed Fee:Standard Installation Fee&isFTTH=true&preorderable=false",
				CommercialProduct[].class))
						.willReturn(new ResponseEntity<CommercialProduct[]>(productDetails, HttpStatus.OK));

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				requestGsa, GetServiceAvailibilityResponse.class)).willReturn(null);

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				request, GetServiceAvailibilityResponse.class))
						.willReturn(new ResponseEntity<GetServiceAvailibilityResponse>(responseGsa, HttpStatus.OK));
		
		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				requestForFTTH, GetServiceAvailibilityResponse.class))
						.willReturn(new ResponseEntity<GetServiceAvailibilityResponse>(responseGsa, HttpStatus.OK));

		given(restTemplate.getForEntity("http://PREMISE-V1/premise/address/LS290JJ?qualified=true&categoryType=FTTH",
				AddressInfo.class)).willReturn(new ResponseEntity<AddressInfo>(galResponse, HttpStatus.OK));

		given(restTemplate.getForEntity("http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017",
				Basket.class)).willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);
		final HttpEntity<ServiceStartDateRequest> entity1 = new HttpEntity<>(serviceStartDateRequest, headers);
		given(restTemplate.exchange(
				"http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017/broadbandPackage/3b23e0a1-eefd-409c-a919-e0ca774b9018/serviceStartDate",
				HttpMethod.PUT, entity1, Void.class)).willReturn(new ResponseEntity<Void>(HttpStatus.NO_CONTENT));
	}

	@Test
	public void testCheckAvailabilityForBroadband() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(checkAvailabilityRequest,
				AvailabilityCheckRequest.class);
		
		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER", "JWT aaaa",true);
		assertEquals(HttpStatus.OK, resonse.getStatusCode());
		List<String> classificationCodeList = new ArrayList<>();
		classificationCodeList.add("Line and ADSL");
		classificationCodeList.add("Line and Fibre with Speed 76");
		classificationCodeList.add("Line and Fibre with Speed 38");
		Assert.assertEquals(classificationCodeList, resonse.getBody().getClassificationCode());
		Assert.assertEquals("LS29 0JJ", resonse.getBody().getInstallationAddress().getPostCode());
		Assert.assertEquals(1, resonse.getBody().getAppointmentAndAvailabilityDetail().size());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForFTTH()
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUESTFORFTTH.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(checkAvailabilityRequest,
				AvailabilityCheckRequest.class);

		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER", null,true);
		assertEquals(HttpStatus.OK, resonse.getStatusCode());
		List<String> classificationCodeList = new ArrayList<>();
		classificationCodeList.add("Line and ADSL");
		classificationCodeList.add("Line and Fibre with Speed 76");
		classificationCodeList.add("Line and Fibre with Speed 38");
		Assert.assertEquals(classificationCodeList, resonse.getBody().getClassificationCode());
		Assert.assertEquals("LS29 0JJ", resonse.getBody().getInstallationAddress().getPostCode());
		Assert.assertEquals(1, resonse.getBody().getAppointmentAndAvailabilityDetail().size());

	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee()
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);

		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER", null,true);
		assertEquals(HttpStatus.OK, resonse.getStatusCode());
	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache()
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);

		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"12345678907888", "CONSUMER", null, true);
		assertEquals(HttpStatus.OK, resonse.getStatusCode());
	}

	@Test
	public void testCheckAvailabilityForBroadbandForValidClassificationCode()
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"12345678907888", "CONSUMER", null, true);
		assertEquals(HttpStatus.OK, resonse.getStatusCode());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket()
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		AvailabilityCheckRequest request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);

		try {
			ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController
					.checkAvailabilityForBroadband(request, "12345678907888", "CONSUMER", null,true);
			assertEquals(HttpStatus.OK, resonse.getStatusCode());
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCreateOrUpdateBasket() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);

		try {
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request, null,true);
			assertEquals("2b23e0a1-eefd-409c-a919-e0ca774b9017", resonse.getBasketId());
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWithNoBasketId() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);

		try {
			Basket resonse = broadBandController.createOrUpdatePackage("123456789078881", request, null,true);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWithInvalidRequest()
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Source cannot be null while creating or updating the basket");
		broadBandController.createOrUpdatePackage("1234907888", request, null,true);
	}

	@Test
	public void testCreateOrUpdateBasketWIthInvalidRequest() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest3.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Hardware Id or Package Id is null. Not a valid request while updating");
		broadBandController.createOrUpdatePackage("12345678907888", request, null,true);
	}

	@Test
	public void testCreateOrUpdateBasketInvalidRequest() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest4.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);

		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Bundle Id or Package Id is null. Not a valid request while updating");
		broadBandController.createOrUpdatePackage("12345678907888", request, null,true);
	}

	@Test
	public void testCreateOrUpdateBasketInvRequest() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest5.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Package id is empty. Not a valid request whule updating the basket");
		broadBandController.createOrUpdatePackage("12345678907888", request, null,true);
	}

	@Test
	public void testCreateOrUpdateBasketWIthInvalidReq() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest2.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Customer Requested date cannot be null while creating or updating the basket");
		broadBandController.createOrUpdatePackage("1234907888", request, null,true);
	}

	@Test
	public void testCreateOrUpdateBasketWithValidReq() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketWithoutPackage.json"));
		BasketRequest request = new ObjectMapper().readValue(jsonString, BasketRequest.class);

		try {
			Basket resonse = broadBandController.createOrUpdatePackage("178907888", request, null,true);
			assertEquals("2b23e0a1-eefd-409c-a919-e0ca774b9017", resonse.getBasketId());
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testBroadbandFromCache() {
		Broadband resonse = broadBandController.getBroadbandInfo("12345678907888");
		assertEquals("2b23e0a1-eefd-409c-a919-e0ca774b9017", resonse.getBasketId());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise() {
		AddressInfo addressInfo = broadBandController.getAddressByPostcode("LS290JJ", "FTTH",
				BroadBandConstant.BROADBAND_CONSUMER, null,true);
		assertEquals(addressInfo.getAddresses().size(), 1);
	}

	@Test
	public void testUpdateLineTreatmentType() {
		try {
			UpdateLineRequest updateLineReq = new UpdateLineRequest();
			updateLineReq.setLineTreatmentType("NEW");
			broadBandController.updateLineTypeInBasket("12345678907888", updateLineReq, null,true);
			assertEquals(
					broadBandController.updateLineTypeInBasket("12345678907888", updateLineReq, null,true).getStatusCode(),
					HttpStatus.NO_CONTENT);
			// assertNotNull(object);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testUpdateLineTreatmentTypeWithInvalidRequest() {
		UpdateLineRequest updateLineReq = new UpdateLineRequest();
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Line treatment type cannot be null.");
		broadBandController.updateLineTypeInBasket("12345678907888", updateLineReq, null,true);

	}

	@Test
	public void testGetFlbbListForExistingAndNew() {
		try {
			String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
			Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
			given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
			String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
			BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
			given(restTemplate.getForObject(
					"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer",
					BundleDetails.class)).willReturn(bundleDetails);

			String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
			DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
			given(restTemplate.getForEntity(
					"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
					DeliveryMethods[].class))
							.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

			ResponseEntity<List<FlbBundle>> flbbList = broadBandController.getFlbbList("1234567823444", "Consumer",
					null, null, null, null, null, null, null,true);
			assertNotNull(flbbList);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testGetFlbbListForExistingAndNewForSelectionNew() {
		try {
			String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV6.json"));
			Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
			given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
			String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
			BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
			given(restTemplate.getForObject(
					"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer",
					BundleDetails.class)).willReturn(bundleDetails);

			String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
			DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
			given(restTemplate.getForEntity(
					"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
					DeliveryMethods[].class))
							.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

			ResponseEntity<List<FlbBundle>> flbbList = broadBandController.getFlbbList("1234567823444", "Consumer",
					null, null, null, null, null, null,null,true);
			assertNotNull(flbbList);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testGetFlbbListForExistingLine() {
		try {
			String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV4.json"));
			Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
			given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
			String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
			BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
			given(restTemplate.getForObject(
					"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer",
					BundleDetails.class)).willReturn(bundleDetails);

			String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
			DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
			given(restTemplate.getForEntity(
					"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
					DeliveryMethods[].class))
							.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

			ResponseEntity<List<FlbBundle>> flbbList = broadBandController.getFlbbList("1234567823444", "Consumer",
					null, null, null, null, null, null,null,true);
			assertNotNull(flbbList);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testGetFlbbListForNew() {
		try {
			String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV5.json"));
			Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
			given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
			String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
			BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
			given(restTemplate.getForObject(
					"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer",
					BundleDetails.class)).willReturn(bundleDetails);

			String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
			DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
			given(restTemplate.getForEntity(
					"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
					DeliveryMethods[].class))
							.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

			ResponseEntity<List<FlbBundle>> flbbList = broadBandController.getFlbbList("1234567823444", "Consumer",
					null, null, null, null, null, null,null,true);
			assertNotNull(flbbList);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCreateAppointmentResponse() {
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		ResponseEntity<?> resonse = broadBandController.createAppointmentForFLBB("12345678907888", request, null,true);
		assertEquals(resonse.getStatusCode(), HttpStatus.OK);

	}

	@Test
	public void testCreateAppointmentResponseNegativeScenario() {
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Start Date time or time slot is null. This cannot be null");
		broadBandController.createAppointmentForFLBB("12345678907888", request, null,true);

	}

	@Test
	public void testGetAppointmentResponse() {
		ResponseEntity<?> resonse = broadBandController.getAppointmentForFLBB("1234567890788889", null,true);
		assertEquals(resonse.getStatusCode(), HttpStatus.OK);

	}

	@Test
	public void testGetCompatibleDevices() {
		try {
			String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
			RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString2,
					RouterProductDetails[].class);
			given(restTemplate.getForEntity("http://BUNDLES-V1/bundles/catalogue/bundle/110264/compatibleDevices",
					RouterProductDetails[].class))
							.willReturn(new ResponseEntity<RouterProductDetails[]>(productDetails, HttpStatus.OK));
			ResponseEntity<List<RouterDetails>> resonse = broadBandController
					.getCompatibleDevicesForBundle("12345678907888", "110264", null,true);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testOptimizeBasket() {
		try {
			OptimizePackageRequest optimizePackageRequest = new OptimizePackageRequest();
			optimizePackageRequest.setJourneyId("2290f3b1-1ed5-4513-9f86-110531c5fbfb");
			ResponseEntity<OptimizePackageResponse> resonse = broadBandController
					.optimizePackageForFLBB("12345678907888", optimizePackageRequest, null,true);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void updateServiceDateinBasketWithInvalidBroadBandId() {
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Invalid BroadBand Id sent in the Request");
		broadBandController.serviceStartDate("1234", serviceStartDateRequest, null,true);
	}

	@Test
	public void updateServiceDateinBasketWithEmptySatrtDate() {
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		thrown.expect(BroadbandJourneyCustomException.class);
		thrown.expectMessage("Start Date time or time slot is null. This cannot be null");
		broadBandController.serviceStartDate("12345678907888", serviceStartDateRequest, null,true);

	}

	@Test
	public void updateServiceDateinBasketWithOutRemoveFromPhoneDirectory() {
		try {
			ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
			serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
			serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
			ResponseEntity<HttpStatus> response = broadBandController.serviceStartDate("12345678907",
					serviceStartDateRequest, null,true);
			Assert.assertEquals(204, response.getStatusCodeValue());
		} catch (Exception e) {
			LogHelper.error(this, "Start Date time or time slot is null. This cannot be null!!" + e);
		}
	}

	@Test
	public void updateServiceDateinBasketWithRemoveFromPhoneDirectory() {
		try {
			ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
			serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
			serviceStartDateRequest.setRemoveFromPhoneDirectory(true);
			ResponseEntity<HttpStatus> response = broadBandController.serviceStartDate("12345678907",
					serviceStartDateRequest, null,true);
			Assert.assertEquals(204, response.getStatusCodeValue());
		} catch (Exception e) {
			LogHelper.error(this, "Start Date time or time slot is null. This cannot be null!!" + e);
		}
	}

}
