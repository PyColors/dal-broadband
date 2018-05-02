package com.vf.uk.dal.broadband.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
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
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.ProductDetails;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.common.registry.client.Utility;
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

		String jsonString7 = new String(Utility.readFile("\\rest-mock\\GetAddressByPostCode_Response.json"));
		AddressInfo responseGAL = new ObjectMapper().readValue(jsonString7, AddressInfo.class);

		String jsonString8 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadband = new ObjectMapper().readValue(jsonString8, Broadband.class);

		String jsonString10 = new String(Utility.readFile("\\rest-mock\\BroadbandCacheResponse2.json"));
		Broadband newBroadband = new ObjectMapper().readValue(jsonString10, Broadband.class);

		String jsonString9 = new String(Utility.readFile("\\rest-mock\\GetBasket.json"));
		Basket basket = new ObjectMapper().readValue(jsonString9, Basket.class);

		String jsonString12 = new String(Utility.readFile("\\rest-mock\\GetProducts.json"));

		ProductDetails[] productDetails = new ObjectMapper().readValue(jsonString12, ProductDetails[].class);

		String jsonString13 = new String(Utility.readFile("\\rest-mock\\CreateBasketRequest.json"));

		CreateBasketRequest createBasketRequest = new ObjectMapper().readValue(jsonString13, CreateBasketRequest.class);

		given(restTemplate.postForEntity("http://BASKET-V1/basketv2/basket/", createBasketRequest, Basket.class))
				.willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907888")).willReturn(broadband);

		given(broadBandRepoProvider.getBroadbandFromCache("12345678907899")).willReturn(newBroadband);

		given(restTemplate.getForEntity("http://PRODUCTS-V1/products/catalogue/products?class:name=Fee:Engineer Visit",
				ProductDetails[].class))
						.willReturn(new ResponseEntity<ProductDetails[]>(productDetails, HttpStatus.OK));

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				requestGsa, GetServiceAvailibilityResponse.class)).willReturn(null);

		given(restTemplate.postForEntity("http://AVAILABILITY-V1/serviceAvailability/broadbandServiceAvailability",
				request, GetServiceAvailibilityResponse.class))
						.willReturn(new ResponseEntity<GetServiceAvailibilityResponse>(response, HttpStatus.OK));

		given(restTemplate.getForEntity("http://PREMISE-V1/premise/address/LS290JJ?qualified=true", AddressInfo.class))
				.willReturn(new ResponseEntity<AddressInfo>(responseGAL, HttpStatus.OK));

		given(restTemplate.getForEntity("http://BASKET-V1/basket/basket/2b23e0a1-eefd-409c-a919-e0ca774b9017",
				Basket.class)).willReturn(new ResponseEntity<Basket>(basket, HttpStatus.OK));

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
				"123456789078", "cat1");
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
				"123456789078", "cat1");
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
				"12345678907888", "cat1");
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
			broadBandController.checkAvailabilityForBroadband(request, "12345678907888", "cat1");
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
					.checkAvailabilityForBroadband(request, "12345678907888", "cat1");
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
					.checkAvailabilityForBroadband(request, "12345678907888", "cat1");
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
					.checkAvailabilityForBroadband(request, "12345678907888", "cat1");
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
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request, null);
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
			Basket resonse = broadBandController.createOrUpdatePackage("1234907888", request, null);
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
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request, null);
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
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request, null);
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
			Basket resonse = broadBandController.createOrUpdatePackage("12345678907888", request, null);
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
			Basket resonse = broadBandController.createOrUpdatePackage("1234907888", request, null);
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
			Basket resonse = broadBandController.createOrUpdatePackage("178907888", request, null);
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
		AddressInfo addressInfo = broadBandController.getAddressByPostcode("LS290JJ");
		assertEquals("Success", addressInfo.getStatusInfo().getStatus());
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

}
