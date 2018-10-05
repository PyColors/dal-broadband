package com.vf.uk.dal.broadband.integration.test;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.netflix.config.ConfigurationManager;
import com.vf.uk.dal.authorization.filter.util.AuthorizationJWTUtility;
import com.vf.uk.dal.authorization.filter.util.context.SecurityContext;
import com.vf.uk.dal.authorization.filter.util.entity.AuthorizationContext;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.EnhanceCompatibleExtraResponse;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.SiteNote;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.customer.Account;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.common.registry.client.Utility;
import com.vf.uk.dal.customer.auth.utility.utils.KeystoreUtil;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
@TestPropertySource(properties = { "dal.jwt.keystore = src/test/resources/dal-keystore.jck",
		"dal.jwt.authorization.expiry = 3600000000000000", "dal.jwt.auth.expiry = 3600000000000000",
		"dal.jwt.unAuth.expiry = 3600000000000000", "dal.authorization.enabled = true" })
public class BroadbandIntegrationTest {

	@Autowired
	BroadbandController broadBandController;

	@Autowired
	AuthorizationJWTUtility authorizationJWTUtility;

	private MockMvc mockMvc;

	@MockBean
	RegistryClient registryClient;

	@MockBean
	RestTemplate restTemplate;
	@MockBean
	BroadbandRepoProvider broadBandRepoProvider;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setupMockBehaviour() throws Exception {

		given(registryClient.getRestTemplate()).willReturn(restTemplate);
		this.mockMvc = MockMvcBuilders.standaloneSetup(broadBandController).build();
		ConfigurationManager.loadCascadedPropertiesFromResources("DigitalDBMock");
		String gsaRequest = new String(Utility.readFile("\\rest-mock\\GSAREQUEST1.json"));
		GetServiceAvailibilityRequest requestGsa = new ObjectMapper().readValue(gsaRequest,
				GetServiceAvailibilityRequest.class);

		String getAccountResponseUsingAccountIdJson = new String(
				Utility.readFile("\\rest-mock\\GetCustomerUsingAccountId.json"));

		Account[] getAccountResponseUsingAccountId = new ObjectMapper().readValue(getAccountResponseUsingAccountIdJson,
				Account[].class);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<Account[]> entity2 = new HttpEntity<>(headers);
		given(restTemplate.exchange("http://CUSTOMER-V1/customer/contact/accounts?accountId=7000350635", HttpMethod.GET,
				entity2, Account[].class))
						.willReturn(new ResponseEntity<Account[]>(getAccountResponseUsingAccountId, HttpStatus.OK));
		given(registryClient.getRestTemplate()).willReturn(restTemplate);
		String jsonString = new String(Utility.readFile("\\rest-mock\\GSAREQUEST.json"));
		GetServiceAvailibilityRequest request = new ObjectMapper().readValue(jsonString,
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

		String getBroadbandCacheBusResponse = new String(
				Utility.readFile("\\rest-mock\\BroadbandCacheResponseForBusiness.json"));
		Broadband broadbandCacheBusResponse = new ObjectMapper().readValue(getBroadbandCacheBusResponse,
				Broadband.class);

		given(broadBandRepoProvider.getBroadbandFromCache("businessBBCache")).willReturn(broadbandCacheBusResponse);

		String getBroadbandCacheResponseWithoutBasketId = new String(
				Utility.readFile("\\rest-mock\\BroadbandCacheResponseWithNoBasketId.json"));
		Broadband broadbandCacheResWithoutBasketId = new ObjectMapper()
				.readValue(getBroadbandCacheResponseWithoutBasketId, Broadband.class);

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

		String bbCacheResponse = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse1.json"));
		Broadband bbResponse = new ObjectMapper().readValue(bbCacheResponse, Broadband.class);

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907")).willReturn(bbResponse);

		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequest, Basket.class))
				.willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));
		
		String createBasketJsonRequestWithServicePoint = new String(Utility.readFile("\\rest-mock\\CreateBasketRequestWithServicePoint.json"));

		CreateBasketRequest createBasketRequestWithServicePoint = new ObjectMapper().readValue(createBasketJsonRequestWithServicePoint,
				CreateBasketRequest.class);
		
		
		String createBasketJsonRequestWithoutAffiliate = new String(Utility.readFile("\\rest-mock\\CreateBasketRequestWithoutAffiliate.json"));

		CreateBasketRequest createBasketRequestWithoutAffiliate = new ObjectMapper().readValue(createBasketJsonRequestWithoutAffiliate,
				CreateBasketRequest.class);
		
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequestWithServicePoint, Basket.class))
		.willReturn(new ResponseEntity<>(basket, HttpStatus.OK));
		
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequestWithoutAffiliate, Basket.class))
		.willReturn(new ResponseEntity<>(basket, HttpStatus.OK));

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandCacheResponse);
		given(broadBandRepoProvider.getBroadbandFromCache("123456789078881"))
				.willReturn(broadbandCacheResWithoutBasketId);

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907899")).willReturn(broadbandCacheRes);

		given(restTemplate.getForEntity("http://PRODUCTS-V1/products/catalogue/products?class:name=Fee:Engineer Visit",
				CommercialProduct[].class))
						.willReturn(new ResponseEntity<CommercialProduct[]>(productDetails, HttpStatus.OK));

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				requestGsa, GetServiceAvailibilityResponse.class)).willReturn(null);

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				request, GetServiceAvailibilityResponse.class))
						.willReturn(new ResponseEntity<GetServiceAvailibilityResponse>(responseGsa, HttpStatus.OK));

		given(restTemplate.getForEntity("http://PREMISE-V1/premise/address/LS290JJ?qualified=true&categoryType=FTTH",
				AddressInfo.class)).willReturn(new ResponseEntity<AddressInfo>(galResponse, HttpStatus.OK));

		given(restTemplate.getForEntity("http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017",
				Basket.class)).willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));

		headers.setContentType(MediaType.APPLICATION_JSON);
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);
		final HttpEntity<ServiceStartDateRequest> entity1 = new HttpEntity<>(serviceStartDateRequest, headers);
		given(restTemplate.exchange(
				"http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017/broadbandPackage/3b23e0a1-eefd-409c-a919-e0ca774b9018/serviceStartDate",
				HttpMethod.PUT, entity1, Void.class)).willReturn(new ResponseEntity<Void>(HttpStatus.NO_CONTENT));

		String createBasketJsonRequest6 = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest6.json"));
		CreateBasketRequest createBasketRequest6 = new ObjectMapper().readValue(createBasketJsonRequest6,
				CreateBasketRequest.class);
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequest6, Basket.class))
				.willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));
		String createBasketJsonRequest4 = new String(Utility.readFile("\\rest-mock\\CreateBasket4.json"));
		CreateBasketRequest createBasketRequest4 = new ObjectMapper().readValue(createBasketJsonRequest4,
				CreateBasketRequest.class);
		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequest4, Basket.class))
				.willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));

	}

	@Test
	public void testCheckAvailabilityForBroadband_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		ObjectMapper mapper = new ObjectMapper();
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(checkAvailabilityRequest.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadband_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		ObjectMapper mapper = new ObjectMapper();
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(checkAvailabilityRequest.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadband_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		ObjectMapper mapper = new ObjectMapper();
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(checkAvailabilityRequest.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadband_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		ObjectMapper mapper = new ObjectMapper();
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(checkAvailabilityRequest.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	/*
	 * @Test public void
	 * testCheckAvailabilityForBroadbandForInvalidClassificationCode() {
	 * ObjectMapper mapper = new ObjectMapper();
	 * mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	 * mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
	 * false); AvailabilityCheckRequest request = null; try { String jsonString
	 * = new String(Utility.readFile("\\rest-mock\\REQUEST3.json"));
	 * this.mockMvc
	 * .perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
	 * .contentType(MediaType.APPLICATION_JSON)
	 * .content(jsonString.getBytes(Charset.defaultCharset())))
	 * .andExpect(MockMvcResultMatchers.status().isBadRequest()()); } catch
	 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */

	@Test
	public void testCheckAvailabilityForBroadbandForValidClassificationCode_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForValidClassificationCode_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForValidClassificationCode_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForValidClassificationCode_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForEmptyGSAResponse_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST5.json"));
		thrown.expectMessage("No Data recieved from TIL");
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
				.contentType(MediaType.APPLICATION_JSON).headers(header)
				.content(jsonString.getBytes(Charset.defaultCharset())))
		.andExpect(MockMvcResultMatchers.status().isBadRequest());
		

	}

	@Test
	public void testCheckAvailabilityForBroadbandForEmptyGSAResponse_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST5.json"));
		thrown.expectMessage("No Data recieved from TIL");
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
				.contentType(MediaType.APPLICATION_JSON).headers(header)
				.content(jsonString.getBytes(Charset.defaultCharset())))
		.andExpect(MockMvcResultMatchers.status().isBadRequest());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForEmptyGSAResponse_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST5.json"));
		thrown.expectMessage("No Data recieved from TIL");
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
				.contentType(MediaType.APPLICATION_JSON).headers(header)
				.content(jsonString.getBytes(Charset.defaultCharset())))
		.andExpect(MockMvcResultMatchers.status().isBadRequest());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForEmptyGSAResponse_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST5.json"));
		thrown.expectMessage("No Data recieved from TIL");
		this.mockMvc
		.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
				.contentType(MediaType.APPLICATION_JSON).headers(header)
				.content(jsonString.getBytes(Charset.defaultCharset())))
		.andExpect(MockMvcResultMatchers.status().isBadRequest());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testCreateOrUpdateBasket_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("useAuthorization", "true").param("useAuthorization", "true")
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateOrUpdateBasket_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateOrUpdateBasket_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateOrUpdateBasket_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testBroadbandFromCache_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		this.mockMvc.perform(MockMvcRequestBuilders.get("/broadband/12345678907888")
				.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testBroadbandFromCache_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		this.mockMvc.perform(MockMvcRequestBuilders.get("/broadband/12345678907888")
				.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testBroadbandFromCache_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		this.mockMvc.perform(MockMvcRequestBuilders.get("/broadband/12345678907888")
				.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetFlbbListForExistingAndNewWithEmptyCache_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/tokenForEmptyCache.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("07888")).willReturn(null);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/07888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer").param("useAuthorization", "true"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testBroadbandFromCache_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		this.mockMvc.perform(MockMvcRequestBuilders.get("/broadband/12345678907888")
				.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/premise/LS290JJ").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("categoryPreference", "FTTH").param("useAuthorization", "true"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/premise/LS290JJ").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("categoryPreference", "FTTH"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/premise/LS290JJ").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("categoryPreference", "FTTH"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/premise/LS290JJ").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("categoryPreference", "FTTH"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testUpdateLineTreatmentType_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"lineTreatmentType\":\"" + "NEW" + "\"}";
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/lineType").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("useAuthorization", "true").content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateLineTreatmentType_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"lineTreatmentType\":\"" + "NEW" + "\"}";
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/lineType").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateLineTreatmentType_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"lineTreatmentType\":\"" + "NEW" + "\"}";
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/lineType").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateLineTreatmentType_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"lineTreatmentType\":\"" + "NEW" + "\"}";
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/lineType").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testGetFlbbListForExistingAndNew_WithAffiliate() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer").param("affiliateId", "12345678"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNew_WithoutAffiliate() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNew_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNew_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNew_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNew_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=true",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNewForSelectionNew_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV6.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNewForSelectionNew_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV6.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNewForSelectionNew_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV6.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNewForSelectionNew_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV6.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingLine_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV4.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingLine_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV4.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingLine_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV4.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingLine_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV4.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListWithEmptyBBCache_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListWithEmptyBBCache_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListWithEmptyBBCache_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListWithEmptyBBCache_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForBusinessUser_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Business", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=true",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Business"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForBusinessUser_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Business", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=true",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Business"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForBusinessUser_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Business", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=true",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Business"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForBusinessUser_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTH&userType=Business", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=true",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Business"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForNew_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV5.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForNew_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV5.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForNew_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV5.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForNew_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV5.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadbandV3);
		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetails = new ObjectMapper().readValue(jsonString1, BundleDetails.class);
		given(restTemplate.getForObject(
				"http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=FTTC&userType=Consumer", BundleDetails.class))
						.willReturn(bundleDetails);

		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetDeliveryMethodsResponseV1.json"));
		DeliveryMethods[] deliveryMethods = new ObjectMapper().readValue(jsonString2, DeliveryMethods[].class);
		given(restTemplate.getForEntity(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=085897&useCache=false",
				DeliveryMethods[].class))
						.willReturn(new ResponseEntity<DeliveryMethods[]>(deliveryMethods, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("userType", "Consumer"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateAppointmentResponse_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		Gson gson = new Gson();
		String requestString = gson.toJson(request);

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(requestString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateAppointmentResponse_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		Gson gson = new Gson();
		String requestString = gson.toJson(request);

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(requestString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateAppointmentResponse_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		Gson gson = new Gson();
		String requestString = gson.toJson(request);

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(requestString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateAppointmentResponse_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		Gson gson = new Gson();
		String requestString = gson.toJson(request);

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(requestString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetAppointmentResponse_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAppointmentResponse_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAppointmentResponse_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAppointmentResponse_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetCompatibleDevices_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
		RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString2, RouterProductDetails[].class);
		given(restTemplate.getForEntity("http://BUNDLES-V1/bundles/catalogue/bundle/110264/compatibleDevices",
				RouterProductDetails[].class))
						.willReturn(new ResponseEntity<RouterProductDetails[]>(productDetails, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/plan/110264/router")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetCompatibleDevices_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
		RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString2, RouterProductDetails[].class);
		given(restTemplate.getForEntity("http://BUNDLES-V1/bundles/catalogue/bundle/110264/compatibleDevices",
				RouterProductDetails[].class))
						.willReturn(new ResponseEntity<RouterProductDetails[]>(productDetails, HttpStatus.OK));

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/plan/110264/router").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetCompatibleDevices_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
		RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString2, RouterProductDetails[].class);
		given(restTemplate.getForEntity("http://BUNDLES-V1/bundles/catalogue/bundle/110264/compatibleDevices",
				RouterProductDetails[].class))
						.willReturn(new ResponseEntity<RouterProductDetails[]>(productDetails, HttpStatus.OK));

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/plan/110264/router").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetCompatibleDevices_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
		RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString2, RouterProductDetails[].class);
		given(restTemplate.getForEntity("http://BUNDLES-V1/bundles/catalogue/bundle/110264/compatibleDevices",
				RouterProductDetails[].class))
						.willReturn(new ResponseEntity<RouterProductDetails[]>(productDetails, HttpStatus.OK));

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/plan/110264/router").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testOptimizeBasket_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"journeyId\":\"" + "2290f3b1-1ed5-4513-9f86-110531c5fbfb" + "\"}";

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/optimize/package")
						.contentType(MediaType.APPLICATION_JSON).headers(header).param("useAuthorization", "true")
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testOptimizeBasket_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"journeyId\":\"" + "2290f3b1-1ed5-4513-9f86-110531c5fbfb" + "\"}";

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/optimize/package")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testOptimizeBasket_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"journeyId\":\"" + "2290f3b1-1ed5-4513-9f86-110531c5fbfb" + "\"}";

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/optimize/package")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testOptimizeBasket_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"journeyId\":\"" + "2290f3b1-1ed5-4513-9f86-110531c5fbfb" + "\"}";

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/optimize/package")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testUpdateServiceDateinBasketWithOutRemoveFromPhoneDirectory_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("useAuthorization", "true").content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateServiceDateinBasketWithOutRemoveFromPhoneDirectory_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateServiceDateinBasketWithOutRemoveFromPhoneDirectory_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateServiceDateinBasketWithOutRemoveFromPhoneDirectory_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testUpdateServiceDateinBasketWithRemoveFromPhoneDirectory_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);

		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());
	}

	@Test
	public void testUpdateServiceDateinBasketWithRemoveFromPhoneDirectory_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);

		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());
	}

	@Test
	public void testUpdateServiceDateinBasketWithRemoveFromPhoneDirectory_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);

		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());
	}

	@Test
	public void testUpdateServiceDateinBasketWithRemoveFromPhoneDirectory_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);

		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());
	}

	@Test
	public void testAvailabilityCheckReturnScenario_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/lineOptions/selected").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testAvailabilityCheckReturnScenarioWithAuth_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/12345678907888/lineOptions/selected?useAuthorization=true")
						.headers(header).contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testAvailabilityCheckReturnScenario_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/lineOptions/selected").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testAvailabilityCheckReturnScenario_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/lineOptions/selected").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testAvailabilityCheckReturnScenario_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/lineOptions/selected").headers(header)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetCompatabileExtras_AssuranceLevelZero() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		String jsonString = new String(Utility.readFile("\\rest-mock\\BUNDLES-V1.json"));
		EnhanceCompatibleExtraResponse extraArray = new ObjectMapper().readValue(jsonString,
				EnhanceCompatibleExtraResponse.class);

		given(restTemplate.getForEntity(
				"http://BUNDLES-V1/bundles/catalogue/bundle/110510/Compatible Business Extras/extras",
				EnhanceCompatibleExtraResponse.class))
						.willReturn(new ResponseEntity<EnhanceCompatibleExtraResponse>(extraArray, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders
						.get("/compatibleExtras/110510/productGroupType/Compatible Business Extras")
						.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetCompatabileExtras_AssuranceLevelOne() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token1.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		String jsonString = new String(Utility.readFile("\\rest-mock\\BUNDLES-V1.json"));
		EnhanceCompatibleExtraResponse extraArray = new ObjectMapper().readValue(jsonString,
				EnhanceCompatibleExtraResponse.class);

		given(restTemplate.getForEntity(
				"http://BUNDLES-V1/bundles/catalogue/bundle/110510/Compatible Business Extras/extras",
				EnhanceCompatibleExtraResponse.class))
						.willReturn(new ResponseEntity<EnhanceCompatibleExtraResponse>(extraArray, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders
						.get("/compatibleExtras/110510/productGroupType/Compatible Business Extras")
						.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetCompatabileExtras_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		String jsonString = new String(Utility.readFile("\\rest-mock\\BUNDLES-V1.json"));
		EnhanceCompatibleExtraResponse extraArray = new ObjectMapper().readValue(jsonString,
				EnhanceCompatibleExtraResponse.class);

		given(restTemplate.getForEntity(
				"http://BUNDLES-V1/bundles/catalogue/bundle/110510/Compatible Business Extras/extras",
				EnhanceCompatibleExtraResponse.class))
						.willReturn(new ResponseEntity<EnhanceCompatibleExtraResponse>(extraArray, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders
						.get("/compatibleExtras/110510/productGroupType/Compatible Business Extras")
						.contentType(MediaType.APPLICATION_JSON).headers(header))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetCompatabileExtras_AssuranceLevelThree() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token3.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");

		String jsonString = new String(Utility.readFile("\\rest-mock\\BUNDLES-V1.json"));
		EnhanceCompatibleExtraResponse extraArray = new ObjectMapper().readValue(jsonString,
				EnhanceCompatibleExtraResponse.class);

		given(restTemplate.getForEntity(
				"http://BUNDLES-V1/bundles/catalogue/bundle/110510/Compatible Business Extras/extras",
				EnhanceCompatibleExtraResponse.class))
						.willReturn(new ResponseEntity<EnhanceCompatibleExtraResponse>(extraArray, HttpStatus.OK));

		this.mockMvc
				.perform(MockMvcRequestBuilders
						.get("/compatibleExtras/110510/productGroupType/Compatible Business Extras").headers(header)
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	/**
	 * @throws IOException
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws FileNotFoundException
	 */
	private void setAuthorizationTokenToContext(String filePath)
			throws IOException, JsonParseException, JsonMappingException, FileNotFoundException {

		Key key = KeystoreUtil.getKeyFromKeyStore("src/test/resources/dal-keystore.jck", "V0d4F0n3", "jceksaes",
				"V0d4F0n3");
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		AuthorizationContext authContext = new ObjectMapper().readValue(new FileInputStream(filePath),
				AuthorizationContext.class);
		JwtBuilder builder = Jwts.builder()
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.PLATFORM_SESSION_ID,
						authContext.getPlatform_session_id())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.ASSURANCE_LEVEL,
						authContext.getAssurance_level())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.CONTACT_ID,
						authContext.getContact_id())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.USERNAME,
						authContext.getUsername())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.NO_OF_ACCOUNTS,
						authContext.getNumber_of_accounts())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.PLATFORM_SESSION_ID,
						authContext.getPlatform_session_id())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.ACCOUNT,
						authContext.getAccount())
				.claim(com.vf.uk.dal.authorization.filter.util.entity.AuthorizationConstants.SUBSCRIPTION,
						authContext.getSubscription())
				.setId("").setIssuedAt(now).setSubject("").setIssuer("").signWith(SignatureAlgorithm.HS256, key);
		long expMillis = nowMillis + 10000000;
		Date exp = new Date(expMillis);
		builder.setExpiration(exp);
		authorizationJWTUtility.validateAuthContextFromJWT(builder.compact());
	}

	@Test
	public void testClearBasketCacheTest_AssuranceLevelTwo() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token2.json");
		String basketId = "2b23e0a1-eefd-409c-a919-e0ca774b9017";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("BasketId", basketId);
		final HttpEntity<HttpStatus> entity = new HttpEntity<>(headers);

		given(restTemplate.exchange("http://Basket-V1/basket/basket/" + basketId, HttpMethod.DELETE, entity,
				Void.class)).willReturn(new ResponseEntity<>(HttpStatus.OK));

		this.mockMvc
				.perform(
						MockMvcRequestBuilders.delete("/12345678907888/package?useAuthorization=true").headers(headers))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testCreateOrUpdateBasket_InvalidRequest_EmptySourceCode() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest.json"));
		thrown.expectMessage("Source cannot be null while creating or updating the basket");

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).param("useAuthorization", "true").content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest()).andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void testCreateOrUpdateBasket_InvalidRequest_EmptyHardwarId() throws Exception {

		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest3.json"));
		thrown.expectMessage("Hardware Id or Package Id is null. Not a valid request while updating");
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest()).andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void testCreateOrUpdateBasket_InvalidRequest_EmptyBundleId() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest4.json"));
		thrown.expectMessage("Bundle Id or Package Id is null. Not a valid request while updating");
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest()).andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void testCreateOrUpdateBasket_InvalidRequest_EmptyPackageId() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest5.json"));
		thrown.expectMessage("Package id is empty. Not a valid request whule updating the basket");
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest()).andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void testCreateOrUpdateBasket_InvalidRequest_CustomerDate() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest2.json"));
		thrown.expectMessage("Customer Requested date cannot be null while creating or updating the basket");
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest()).andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void testCreateAppointmentResponse_NegativeScenario() throws Exception {

		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("");
		request.setTimeSlot("");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		Gson gson = new Gson();
		String requestString = gson.toJson(request);
		thrown.expectMessage("Start Date time or time slot is null. This cannot be null");
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/appointment")
						.contentType(MediaType.APPLICATION_JSON).headers(header)
						.content(requestString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	public void testUpdateServiceDateinBasket_InvalidBroadBandId() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		thrown.expectMessage("Invalid BroadBand Id sent in the Request");
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/1234/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	public void testUpdateServiceDateinBasket_EmptySatrtDate() throws Exception {

		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		thrown.expectMessage("Start Date time or time slot is null. This cannot be null");
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/startDate").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	public void testUpdateLineTreatmentType_InvalidRequest() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		final String request = "{\"lineTreatmentType\":\"\"}";
		thrown.expectMessage("Line treatment type cannot be null.");
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/lineType").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	public void testCreateOrUpdateBasket_InvalidBroadbandId() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/178907888/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());

	}

	@Test
	public void testCreateOrUpdateBasket_EmptyBaskedId() throws Exception {
		SecurityContext.unsetContext();
		setAuthorizationTokenToContext("src/test/resources/rest-mock/token0.json");
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "JWT adasdf");
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/123456789078881/package").contentType(MediaType.APPLICATION_JSON)
						.headers(header).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());

	}

	@After
	public void tearDown() {
		SecurityContext.unsetContext();
	}
}
