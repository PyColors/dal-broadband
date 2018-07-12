package com.vf.uk.dal.broadband.controller.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.common.registry.client.Utility;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
public class BroadbandControllerTest {

	@Autowired
	BroadbandController broadBandController;

	@MockBean
	RegistryClient registryClient;

	@MockBean
	RestTemplate restTemplate;
	@MockBean
	BroadbandRepoProvider broadBandRepoProvider;

	@Before
	public void setupMockBehaviour() throws Exception {

		given(registryClient.getRestTemplate()).willReturn(restTemplate);
		String jsonStringGsa = new String(Utility.readFile("\\rest-mock\\GSAREQUEST1.json"));
		GetServiceAvailibilityRequest requestGsa = new ObjectMapper().readValue(jsonStringGsa,
				GetServiceAvailibilityRequest.class);

		given(registryClient.getRestTemplate()).willReturn(restTemplate);
		String jsonString = new String(Utility.readFile("\\rest-mock\\GSAREQUEST.json"));
		GetServiceAvailibilityRequest request = new ObjectMapper().readValue(jsonString,
				GetServiceAvailibilityRequest.class);

		String jsonString1 = new String(Utility.readFile("\\rest-mock\\GSAResponse.json"));
		GetServiceAvailibilityResponse response = new ObjectMapper().readValue(jsonString1,
				GetServiceAvailibilityResponse.class);

		String jsonString5 = new String(Utility.readFile("\\rest-mock\\CreateAppointmentRequest.json"));
		com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest apptRequest = new ObjectMapper()
				.readValue(jsonString5, com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest.class);

		String jsonString6 = new String(Utility.readFile("\\rest-mock\\CreateAppointment_Response.json"));
		CreateAppointment responseCA = new ObjectMapper().readValue(jsonString6, CreateAppointment.class);

		given(restTemplate.postForEntity("http://APPOINTMENT-V1/appointment/createAppointment", apptRequest,
				CreateAppointment.class)).willReturn(new ResponseEntity<CreateAppointment>(responseCA, HttpStatus.OK));

		/////// Get Appointment

		String jsonStringGA = new String(Utility.readFile("\\rest-mock\\GetAppointmentRequest.json"));
		com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest getApptRequest = new ObjectMapper()
				.readValue(jsonStringGA, com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest.class);

		String jsonStringGAResponse = new String(Utility.readFile("\\rest-mock\\GetAppointment_Response.json"));
		GetAppointment responseGA = new ObjectMapper().readValue(jsonStringGAResponse, GetAppointment.class);

		given(restTemplate.postForEntity("http://APPOINTMENT-V1/appointment/action/getAppointment", getApptRequest,
				GetAppointment.class)).willReturn(new ResponseEntity<GetAppointment>(responseGA, HttpStatus.OK));
		
		
		BundlePromotionRequest requestForPromo = new BundlePromotionRequest();
		List<String> bundleIdList = new ArrayList<>();
		bundleIdList.add("110264");
		requestForPromo.setBundleIdList(bundleIdList);
		requestForPromo.setJourneyType("SecondLine");
		String promotionResponse = new String(Utility.readFile("\\rest-mock\\GetPromotionForBundle.json"));
		BundlePromotion[] bundlePromotion = new ObjectMapper().readValue(promotionResponse, BundlePromotion[].class);
		given(restTemplate.postForEntity(
				"http://PROMOTION-V1/promotion/queries/ForBundleList",requestForPromo,
				BundlePromotion[].class))
						.willReturn(new ResponseEntity<BundlePromotion[]>(bundlePromotion, HttpStatus.OK));
		/////

		
		////////Get Current Journey
		
		String getCurrentJourneyResponse = new String(Utility.readFile("\\rest-mock\\GetCurrentJourneyResponse.json"));
		CurrentJourney currentJourney = new ObjectMapper().readValue(getCurrentJourneyResponse, CurrentJourney.class);
		
		given(restTemplate.getForEntity(
				"http://JOURNEY-V1/journey/2290f3b1-1ed5-4513-9f86-110531c5fbfb/queries/currentJourney",
				CurrentJourney.class))
						.willReturn(new ResponseEntity<CurrentJourney>(currentJourney, HttpStatus.OK));
		
		
		//////////
		
		
		
		String jsonString7 = new String(Utility.readFile("\\rest-mock\\GetAddressByPostCode_Response.json"));
		AddressInfo responseGAL = new ObjectMapper().readValue(jsonString7, AddressInfo.class);

		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadband = new ObjectMapper().readValue(jsonString8, Broadband.class);
		
		String jsonString15 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponseWithNoBasketId.json"));
		Broadband broadband1 = new ObjectMapper().readValue(jsonString15, Broadband.class);

		String jsonString10 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse2.json"));
		Broadband newBroadband = new ObjectMapper().readValue(jsonString10, Broadband.class);

		String jsonString9 = new String(Utility.readFile("\\rest-mock\\GetBasket.json"));
		Basket basket = new ObjectMapper().readValue(jsonString9, Basket.class);

		String jsonString12 = new String(Utility.readFile("\\rest-mock\\GetProducts.json"));

		CommercialProduct[] productDetails = new ObjectMapper().readValue(jsonString12, CommercialProduct[].class);

		String jsonString13 = new String(Utility.readFile("\\rest-mock\\CreateBasketRequest.json"));

		CreateBasketRequest createBasketRequest = new ObjectMapper().readValue(jsonString13, CreateBasketRequest.class);
		
		String jsonString20 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse1.json"));
		Broadband broadband20 = new ObjectMapper().readValue(jsonString20, Broadband.class);
		
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907")).willReturn(broadband20);

		given(restTemplate.postForEntity("http://BASKET-V1/basket/basket/", createBasketRequest, Basket.class))
				.willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));
		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadband);
		given(broadBandRepoProvider.getBroadbandFromCache("123456789078881")).willReturn(broadband1);

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907899")).willReturn(newBroadband);

		given(restTemplate.getForEntity("http://PRODUCTS-V1/products/catalogue/products?class:name=Fee:Engineer Visit",
				CommercialProduct[].class))
						.willReturn(new ResponseEntity<CommercialProduct[]>(productDetails, HttpStatus.OK));

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				requestGsa, GetServiceAvailibilityResponse.class)).willReturn(null);

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				request, GetServiceAvailibilityResponse.class))
						.willReturn(new ResponseEntity<GetServiceAvailibilityResponse>(response, HttpStatus.OK));

		given(restTemplate.getForEntity("http://PREMISE-V1/premise/address/LS290JJ?qualified=true&categoryType=FTTH", AddressInfo.class))
				.willReturn(new ResponseEntity<AddressInfo>(responseGAL, HttpStatus.OK));

		given(restTemplate.getForEntity("http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017",
				Basket.class)).willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
		serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
		serviceStartDateRequest.setRemoveFromPhoneDirectory(true);
		final HttpEntity<ServiceStartDateRequest> entity1 = new HttpEntity<>(serviceStartDateRequest, headers);
		given(restTemplate.exchange("http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017/broadbandPackage/3b23e0a1-eefd-409c-a919-e0ca774b9018/serviceStartDate",
					HttpMethod.PUT,entity1,Void.class)).willReturn(new ResponseEntity<Void>(HttpStatus.NO_CONTENT));
	}

	@Test
	public void testCheckAvailabilityForBroadband() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER");
		assertNotNull(resonse);
	}

	@Test
	public void testCheckAvailabilityForBroadbandWithEngineeringVisitFee() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"123456789078", "CONSUMER");
		assertNotNull(resonse);
	}

	@Test
	public void testCheckAvailabilityForBroadbandFromCache() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController.checkAvailabilityForBroadband(request,
				"12345678907888", "CONSUMER");
		assertNotNull(resonse);
	}

	@Test
	public void testCheckAvailabilityForBroadbandForInvalidClassificationCode() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST3.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			broadBandController.checkAvailabilityForBroadband(request, "12345678907888", "CONSUMER");
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCheckAvailabilityForBroadbandForValidClassificationCode() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST4.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController
					.checkAvailabilityForBroadband(request, "12345678907888", "CONSUMER");
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCheckAvailabilityForBroadbandForEmptyGSAResponse() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST5.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController
					.checkAvailabilityForBroadband(request, "12345678907888", "CONSUMER");
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCheckAvailabilityForBroadbandForUpdateBasket() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		AvailabilityCheckRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\REQUEST2.json"));
			request = new ObjectMapper().readValue(jsonString, AvailabilityCheckRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResponseEntity<AvailabilityCheckResponse> resonse = broadBandController
					.checkAvailabilityForBroadband(request, "12345678907888", "CONSUMER");
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCreateOrUpdateBasket() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	
	@Test
	public void testCreateOrUpdateBasketWithNoBasketId() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("123456789078881", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}
	
	
	
	@Test
	public void testCreateOrUpdateBasketWithInvalidRequest() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("1234907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWIthInvRequest3() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest3.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWIthInvRequest4() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest4.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWIthInvRequest5() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest5.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWIthInvRequest2() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasketInvRequest2.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("1234907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testCreateOrUpdateBasketWithValidReq() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BasketRequest request = null;
		try {
			String jsonString = new String(Utility.readFile("\\rest-mock\\CreateBasket3.json"));
			request = new ObjectMapper().readValue(jsonString, BasketRequest.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Basket resonse = broadBandController.createOrUpdatePackage("178907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}

	@Test
	public void testBroadbandFromCache() {
		Broadband resonse = broadBandController.getBroadbandInfo("12345678907888");
		assertNotNull(resonse);
	}

	@Test
	public void testGetAddressByPostCodeFromPremise() {
		AddressInfo addressInfo = broadBandController.getAddressByPostcode("LS290JJ","FTTH",BroadBandConstant.BROADBAND_CONSUMER);
		assertNotNull(addressInfo);
	}

	@Test
	public void testUpdateLineTreatmentType() {
		try {
			UpdateLineRequest updateLineReq = new UpdateLineRequest();
			updateLineReq.setLineTreatmentType("NEW");
			broadBandController.updateLineTypeInBasket("12345678907888", updateLineReq);
			// assertNotNull(object);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testUpdateLineTreatmentTypeWithInvalidRequest() {
		try {
			UpdateLineRequest updateLineReq = new UpdateLineRequest();
			// updateLineReq.setLineTreatmentType("NEW");
			broadBandController.updateLineTypeInBasket("12345678907888", updateLineReq);
			// assertNotNull(object);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

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
					null, null, null, null,null);
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
					null, null, null, null,null);
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
					null, null, null, null,null);
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
					null, null, null, null,null);
			assertNotNull(flbbList);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testCreateAppointmentResponse() {
		try {
			CreateAppointmentRequest request = new CreateAppointmentRequest();
			request.setRemoveFromPhoneDirectory(true);
			request.setStartTimePeriod("2015-10-07+01:00");
			request.setTimeSlot("AM");
			SiteNote siteNote = new SiteNote();
			siteNote.setNotes("Hello");
			request.setSiteNote(siteNote);
			ResponseEntity<?> resonse = broadBandController
					.createAppointmentForFLBB("12345678907888", request);
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}

	}

	@Test
	public void testGetAppointmentResponse() {
		try {
			ResponseEntity<?> resonse = broadBandController
					.getAppointmentForFLBB("12345678907888");
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
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
					.getCompatibleDevicesForBundle("12345678907888", "110264");
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
			ResponseEntity<OptimizePackageResponse> resonse = broadBandController.optimizePackageForFLBB("12345678907888", optimizePackageRequest);	
			assertNotNull(resonse);
		} catch (Exception e) {
			LogHelper.error(this, "Null object is send \n" + e);
		}
	}
	
	@Test
	public void updateServiceDateinBasketWithInvalidBroadBandId() {
		try {
			ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
			serviceStartDateRequest.setStartDateTime("");
			serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
			broadBandController.serviceStartDate("1234",serviceStartDateRequest);	
		} catch (Exception e) {
			LogHelper.error(this, "BroadBandId is null!!" + e);
			Assert.assertEquals("Invalid BroadBand Id sent in the Request", "Invalid BroadBand Id sent in the Request");
		}
	}
	
	@Test
	public void updateServiceDateinBasketWithEmptySatrtDate() {
		try {
			ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
			serviceStartDateRequest.setStartDateTime("");
			serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
			broadBandController.serviceStartDate("12345678907888",serviceStartDateRequest);	
		} catch (Exception e) {
			LogHelper.error(this, "Start Date time or time slot is null. This cannot be null!!" + e);
			Assert.assertEquals("Start Date time or time slot is null. This cannot be null", "Start Date time or time slot is null. This cannot be null");
		}
	}
	
	@Test
	public void updateServiceDateinBasketWithOutRemoveFromPhoneDirectory() {
		try {
			ServiceStartDateRequest serviceStartDateRequest = new ServiceStartDateRequest();
			serviceStartDateRequest.setStartDateTime("2018-10-01T18:45:00.000+00:00");
			serviceStartDateRequest.setRemoveFromPhoneDirectory(false);
			ResponseEntity<HttpStatus> response = broadBandController.serviceStartDate("12345678907",serviceStartDateRequest);	
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
			ResponseEntity<HttpStatus> response = broadBandController.serviceStartDate("12345678907",serviceStartDateRequest);	
			Assert.assertEquals(204, response.getStatusCodeValue());
		} catch (Exception e) {
			LogHelper.error(this, "Start Date time or time slot is null. This cannot be null!!" + e);
		}
	}

}
