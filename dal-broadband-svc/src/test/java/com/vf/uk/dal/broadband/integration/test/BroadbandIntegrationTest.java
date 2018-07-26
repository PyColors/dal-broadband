package com.vf.uk.dal.broadband.integration.test;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
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
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.netflix.config.ConfigurationManager;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.SiteNote;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.common.registry.client.Utility;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
public class BroadbandIntegrationTest {

	@Autowired
	BroadbandController broadBandController;

	private MockMvc mockMvc;

	@MockBean
	RegistryClient registryClient;

	@MockBean
	RestTemplate restTemplate;
	@MockBean
	BroadbandRepoProvider broadBandRepoProvider;

	@Before
	public void setupMockBehaviour() throws Exception {

		given(registryClient.getRestTemplate()).willReturn(restTemplate);
		this.mockMvc = MockMvcBuilders.standaloneSetup(broadBandController).build();
		ConfigurationManager.loadCascadedPropertiesFromResources("DigitalDBMock");
		String gsaRequest = new String(Utility.readFile("\\rest-mock\\GSAREQUEST1.json"));
		GetServiceAvailibilityRequest requestGsa = new ObjectMapper().readValue(gsaRequest,
				GetServiceAvailibilityRequest.class);

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

		
		
		String getBroadbandCacheBusResponse = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseForBusiness.json"));
		Broadband broadbandCacheBusResponse = new ObjectMapper().readValue(getBroadbandCacheBusResponse, Broadband.class);
		
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
	public void testCheckAvailabilityForBroadband() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String checkAvailabilityRequest = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(
						MockMvcRequestBuilders.post("/123456789078/lineOptions").contentType(MediaType.APPLICATION_JSON)
								.content(checkAvailabilityRequest.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/123456789078/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).content(jsonString.getBytes(Charset.defaultCharset())))
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
	public void testCheckAvailabilityForBroadbandForValidClassificationCode() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCheckAvailabilityForBroadbandForEmptyGSAResponse(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST5.json"));
			this.mockMvc
					.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
							.contentType(MediaType.APPLICATION_JSON).content(jsonString.getBytes(Charset.defaultCharset())))
					.andExpect(MockMvcResultMatchers.status().isInternalServerError())
					.andExpect(jsonPath("referenceId").isNotEmpty())
					.andExpect(jsonPath("errorMessage").value("No Data recieved from TIL"))
					.andExpect(jsonPath("errorCode").value("BROADBAND_NO_TIL_RESPONSE"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/lineOptions")
						.contentType(MediaType.APPLICATION_JSON).content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testCreateOrUpdateBasket() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/package").contentType(MediaType.APPLICATION_JSON)
						.content(jsonString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testBroadbandFromCache() throws Exception {
		this.mockMvc
				.perform(
						MockMvcRequestBuilders.get("/broadband/12345678907888").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetAddressByPostCodeFromPremise() throws Exception {

		this.mockMvc.perform(MockMvcRequestBuilders.get("/premise/LS290JJ").contentType(MediaType.APPLICATION_JSON)
				.param("categoryPreference", "FTTH")).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testUpdateLineTreatmentType() throws Exception {
		final String request = "{\"lineTreatmentType\":\"" + "NEW" + "\"}";
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907888/lineType").contentType(MediaType.APPLICATION_JSON)
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void testGetFlbbListForExistingAndNew() throws Exception {
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV3.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
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

		this.mockMvc.perform(MockMvcRequestBuilders.get("/1234567823444/plan").contentType(MediaType.APPLICATION_JSON)
				.param("userType", "Consumer")).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingAndNewForSelectionNew() throws Exception {
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV6.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
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

		this.mockMvc.perform(MockMvcRequestBuilders.get("/1234567823444/plan").contentType(MediaType.APPLICATION_JSON)
				.param("userType", "Consumer")).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetFlbbListForExistingLine() throws Exception {
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV4.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
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

		this.mockMvc.perform(MockMvcRequestBuilders.get("/1234567823444/plan").contentType(MediaType.APPLICATION_JSON)
				.param("userType", "Consumer")).andExpect(MockMvcResultMatchers.status().isOk());

	}
	
	@Test
	public void testGetFlbbListWithEmptyBBCache() throws Exception {
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

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12090/plan").contentType(MediaType.APPLICATION_JSON)
				.param("userType", "Consumer")).andExpect(MockMvcResultMatchers.status().isOk());

	}
	
	
	@Test
	public void testGetFlbbListForBusinessUser() throws Exception {
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

		this.mockMvc.perform(MockMvcRequestBuilders.get("/businessBBCache/plan").contentType(MediaType.APPLICATION_JSON)
				.param("userType", "Business")).andExpect(MockMvcResultMatchers.status().isOk());

	}
	
	
	

	@Test
	public void testGetFlbbListForNew() throws Exception {
		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseV5.json"));
		Broadband broadbandV3 = new ObjectMapper().readValue(jsonString8, Broadband.class);
		given(broadBandRepoProvider.getBroadbandFromCache("1234567823444")).willReturn(broadbandV3);
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

		this.mockMvc.perform(MockMvcRequestBuilders.get("/1234567823444/plan").contentType(MediaType.APPLICATION_JSON)
				.param("userType", "Consumer")).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testCreateAppointmentResponse() throws Exception {
		CreateAppointmentRequest request = new CreateAppointmentRequest();
		request.setRemoveFromPhoneDirectory(true);
		request.setStartTimePeriod("2015-10-07+01:00");
		request.setTimeSlot("AM");
		SiteNote siteNote = new SiteNote();
		siteNote.setNotes("Hello");
		request.setSiteNote(siteNote);
		Gson gson = new Gson();
		String requestString = gson.toJson(request);

		this.mockMvc.perform(MockMvcRequestBuilders.post("/12345678907888/appointment")
				.contentType(MediaType.APPLICATION_JSON).content(requestString.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testGetAppointmentResponse() throws Exception {

		this.mockMvc.perform(
				MockMvcRequestBuilders.get("/12345678907888/appointment").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetCompatibleDevices() throws Exception {
		String jsonString2 = new String(Utility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
		RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString2, RouterProductDetails[].class);
		given(restTemplate.getForEntity("http://BUNDLES-V1/bundles/catalogue/bundle/110264/compatibleDevices",
				RouterProductDetails[].class))
						.willReturn(new ResponseEntity<RouterProductDetails[]>(productDetails, HttpStatus.OK));

		this.mockMvc.perform(MockMvcRequestBuilders.get("/12345678907888/plan/110264/router")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void testOptimizeBasket() throws Exception {
		final String request = "{\"journeyId\":\"" + "2290f3b1-1ed5-4513-9f86-110531c5fbfb" + "\"}";

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/12345678907888/optimize/package")
						.contentType(MediaType.APPLICATION_JSON).content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

	@Test
	public void updateServiceDateinBasketWithOutRemoveFromPhoneDirectory() throws Exception {
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907/startDate").contentType(MediaType.APPLICATION_JSON)
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}

	@Test
	public void updateServiceDateinBasketWithRemoveFromPhoneDirectory() throws Exception {
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);

		Gson gson = new Gson();
		String request = gson.toJson(serviceStartDateRequest);
		this.mockMvc
				.perform(MockMvcRequestBuilders.put("/12345678907/startDate").contentType(MediaType.APPLICATION_JSON)
						.content(request.getBytes(Charset.defaultCharset())))
				.andExpect(MockMvcResultMatchers.status().isNoContent());
	}

}
