package com.vf.uk.dal.broadband.svc.impl.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.EnhanceCompatibleExtraResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.SelectedAvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.customer.Account;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.svc.impl.BroadbandServiceImpl;
import com.vf.uk.dal.broadband.tests.util.FileUtility;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
@ActiveProfiles("local")
public class BroadbandServiceImplTest {

	@Autowired
	BroadbandServiceImpl serviceImpl;

	@MockBean
	BroadbandDao broadbandDao;
	
	@MockBean
	BroadbandRepoProvider broadBandRepoProvider;

	@Before
	public void setupMockBehaviour() throws Exception {
		
		String getBroadbandCacheResponse = new String(FileUtility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadbandCacheResponse = new ObjectMapper().readValue(getBroadbandCacheResponse, Broadband.class);
		Mockito.when(broadbandDao.getBroadbandFromCache(Mockito.anyString())).thenReturn(broadbandCacheResponse);

		
		String getCurrentJourneyResponse = new String(FileUtility.readFile("\\rest-mock\\GetCurrentJourneyResponse.json"));
		CurrentJourney currentJourney = new ObjectMapper().readValue(getCurrentJourneyResponse, CurrentJourney.class);
		Mockito.when(broadbandDao.getJourney(Mockito.anyString())).thenReturn(currentJourney);
		
		String getBasketJsonResponse = new String(FileUtility.readFile("\\rest-mock\\GetBasket.json"));
		Basket basketResponse = new ObjectMapper().readValue(getBasketJsonResponse, Basket.class);
		Mockito.when(broadbandDao.getBasket(Mockito.anyString())).thenReturn(basketResponse);
		
		String createBasketJsonRequest = new String(FileUtility.readFile("\\rest-mock\\CreateBasketRequest.json"));
		CreateBasketRequest createBasketRequest = new ObjectMapper().readValue(createBasketJsonRequest,
				CreateBasketRequest.class);
		Mockito.when(broadbandDao.createBasket(createBasketRequest)).thenReturn(basketResponse);
		
		String createAppointmentJsonResponse = new String(
				FileUtility.readFile("\\rest-mock\\CreateAppointment_Response.json"));
		CreateAppointment createApptResponse = new ObjectMapper().readValue(createAppointmentJsonResponse,
				CreateAppointment.class);
		
		Mockito.when(broadbandDao.createAppointment(Mockito.any(com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest.class))).thenReturn(createApptResponse);
	}

	@Test
	public void testCheckAvailabilityForBroadband() throws Exception {
		String checkAvailabilityRequestString = new String(FileUtility.readFile("\\rest-mock\\REQUEST.json"));
		AvailabilityCheckRequest checkAvailabilityRequest = new ObjectMapper().readValue(checkAvailabilityRequestString,
				AvailabilityCheckRequest.class);
		String gsaResponse = new String(FileUtility.readFile("\\rest-mock\\GSAResponse.json"));
		GetServiceAvailibilityResponse responseGsa = new ObjectMapper().readValue(gsaResponse,
				GetServiceAvailibilityResponse.class);
		String getProductsResponse = new String(FileUtility.readFile("\\rest-mock\\GetProducts.json"));
		CommercialProduct[] productDetails = new ObjectMapper().readValue(getProductsResponse,
				CommercialProduct[].class);
		Mockito.when(
				broadbandDao.getServiceAvailability(Mockito.any(AvailabilityCheckRequest.class), Mockito.anyString()))
				.thenReturn(responseGsa);
		Mockito.when(broadbandDao.getEngineeringVisitFee(Mockito.anyString(), Mockito.anyBoolean(), Mockito.anyString(),
				Mockito.anyBoolean())).thenReturn(Arrays.asList(productDetails));
		AvailabilityCheckResponse respActual = serviceImpl.checkAvailabilityForBroadband(checkAvailabilityRequest,
				"123456789078", null, "CONSUMER");
		assertEquals("LS29 0JJ", respActual.getInstallationAddress().getPostCode());
		assertEquals("A90000121249", respActual.getInstallationAddress().getIdentification().getId());
		assertEquals("60", respActual.getEngineeringVisitCharge().getGross());
	}

	
	@Test
	public void testGetCompatibleDevicesForBundle() throws Exception {
		String jsonString = new String(FileUtility.readFile("\\rest-mock\\GetCompatibleDeviceResponse.json"));
		RouterProductDetails[] productDetails = new ObjectMapper().readValue(jsonString, RouterProductDetails[].class);
		Mockito.when(broadbandDao.getCompatibleDevicesForBundle(Mockito.anyString()))
				.thenReturn(Arrays.asList(productDetails));
		List<RouterDetails> respActual = serviceImpl.getCompatibleDevicesForBundle("12345678907888", "110510");
		assertEquals("Vodafone Broadband router white" , respActual.get(0).getDisplayName());
		assertEquals("Vodafone Broadband router" , respActual.get(1).getDisplayName());
		assertEquals("49", respActual.get(0).getPriceInfo().getOneOffPrice().getGross());
	}

	@Test
	public void testGetSelectedLineOptions() throws Exception {
		String getBroadbandCacheResponse = new String(FileUtility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadbandCacheResponse = new ObjectMapper().readValue(getBroadbandCacheResponse, Broadband.class);
		Mockito.when(broadbandDao.getBroadbandFromCache(Mockito.anyString())).thenReturn(broadbandCacheResponse);
		SelectedAvailabilityCheckResponse respActual = serviceImpl.getSelectedLineOptions("12345678907888");
		assertEquals("LS29 0JJ", respActual.getInstallationAddress().getPostCode());
		assertEquals("A90000221048", respActual.getInstallationAddress().getIdentification().getId());
		assertEquals("Gold", respActual.getInstallationAddress().getIdentification().getContextId());
	}

	@Test
	public void testGetCompatibleExtras() throws Exception {
		String jsonString = new String(FileUtility.readFile("\\rest-mock\\BUNDLES-V1.json"));
		EnhanceCompatibleExtraResponse respExpected = new ObjectMapper().readValue(jsonString,
				EnhanceCompatibleExtraResponse.class);
		Mockito.when(broadbandDao.getCompatibleExtras(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(respExpected);
		EnhanceCompatibleExtraResponse respActual = serviceImpl.getCompatibleExtras("110510", "productGroupType");
		assertEquals(respExpected.getMessage(), respActual.getMessage());
		assertEquals(respExpected.getExtrasGroups().get(0).getGroupName(),
				respActual.getExtrasGroups().get(0).getGroupName());
		assertEquals(respExpected.getExtrasGroups().get(0).getGroupPriority(),
				respActual.getExtrasGroups().get(0).getGroupPriority());
	}
	
	@Test
	public void testGetFlbList() throws Exception {
		String getBundleListSearchCriteriaString = new String(FileUtility.readFile("\\rest-mock\\getBundleListSearchCriteriaRequest.json"));
		GetBundleListSearchCriteria getBundleListSearchCriteria = new ObjectMapper().readValue(getBundleListSearchCriteriaString,
				GetBundleListSearchCriteria.class); 
		
		String bundleDetailsResponseString = new String(FileUtility.readFile("\\rest-mock\\GetFLBBListResponse.json"));
		BundleDetails bundleDetailsResponse = new ObjectMapper().readValue(bundleDetailsResponseString,
				BundleDetails.class);
		
		Mockito.when(broadbandDao.getBundleDetailsFromGetBundleListAPI(Mockito.anyString())).thenReturn(bundleDetailsResponse);

		List<FlbBundle> flbBundleList = serviceImpl.getFlbList(getBundleListSearchCriteria);
		
		assertEquals( "Home Broadband - Unlimited Fibre 38 and Phone - FTR4 -18 m" , flbBundleList.get(0).getBundleName());
		assertEquals( "Line and ADSL" , flbBundleList.get(0).getClassificationCode());
		assertEquals( true, flbBundleList.get(0).getIsSelected());
		
	}
	
	@Test
	public void testGetAddressInfoByPostcodeFromPremise() throws Exception {
		String getAddressListJsonResponse = new String(
				FileUtility.readFile("\\rest-mock\\GetAddressByPostCode_Response.json"));
		AddressInfo galResponse = new ObjectMapper().readValue(getAddressListJsonResponse, AddressInfo.class);
		Mockito.when(broadbandDao.getAddressInfoByPostcodeFromPremise(Mockito.any(), Mockito.any())).thenReturn(galResponse);
		AddressInfo addressInfo = serviceImpl.getAddressInfoByPostcodeFromPremise("LS290JJ", "FTTH", "Consumer");
		
		assertEquals( "LS29 0JJ" , addressInfo.getAddresses().get(0).getPostCode());
		assertEquals( "A90000221048" , addressInfo.getAddresses().get(0).getId());
		assertEquals( "Gold" , addressInfo.getAddresses().get(0).getContextId());	
		
	}
	
	@Test
	public void testCreateOrUpdatePackage() throws Exception {
		String BasketJsonRequest = new String(FileUtility.readFile("\\rest-mock\\BasketRequest.json"));
		BasketRequest basketRequest = new ObjectMapper().readValue(BasketJsonRequest,
				BasketRequest.class);
		
		String broadbandJson = new String(FileUtility.readFile("\\rest-mock\\Broadband.json"));
		Broadband broadband = new ObjectMapper().readValue(broadbandJson,
				Broadband.class);
		
		Basket basket = serviceImpl.createOrUpdatePackage(basketRequest, broadband, "123456789078");

		assertEquals( "2017-10-01T09:45:00.000+00:00" , basket.getCustomerRequestedDate());
		assertEquals( "11" , basket.getAffiliateId());
		assertEquals( "25" , basket.getPriceDetails().getMonthlyPrice().getGross());
	}
	
	@Test
	public void testCreateAppointment() throws Exception {
		
		String createApointmentRequest = new String(FileUtility.readFile("\\rest-mock\\CreateAppointmentRequest2.json"));
		com.vf.uk.dal.broadband.entity.CreateAppointmentRequest createApptRequest = new ObjectMapper()
				.readValue(createApointmentRequest,
						com.vf.uk.dal.broadband.entity.CreateAppointmentRequest.class);
		
		CreateAppointmentResponse response = serviceImpl.createAppointment(createApptRequest, "12345678907888");
		assertEquals("DX12345", response.getApplicationId());
		
	}
	
	@Test
	public void testGetAppointmentForFLBB() throws Exception {

		String jsonStringGAResponse = new String(FileUtility.readFile("\\rest-mock\\GetAppointment_Response.json"));
		GetAppointment getAppointmentResponse = new ObjectMapper().readValue(jsonStringGAResponse,
				GetAppointment.class);
		
		Mockito.when(broadbandDao.getAppointmentList(Mockito.any(com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest.class))).thenReturn(getAppointmentResponse);

		GetAppointmentResponse response = serviceImpl.getAppointmentForFLBB("12345678907888");
		
		assertEquals("2018-05-22 11:00:00", response.getAppointmentWindowList().get(0).getStartDate());
		assertEquals("2018-05-24 11:00:00", response.getAppointmentWindowList().get(4).getStartDate());
		assertEquals("2018-05-29 11:00:00", response.getAppointmentWindowList().get(9).getStartDate());
		
	}
	
	@Test
	public void testOptimizePackageForFLBB() throws Exception {
		String getAccountResponseUsingAccountIdJson = new String(
				FileUtility.readFile("\\rest-mock\\GetCustomerUsingAccountId.json"));
		Account[] getAccountResponseUsingAccountId = new ObjectMapper().readValue(getAccountResponseUsingAccountIdJson,
				Account[].class);
		Mockito.when(broadbandDao.getAccountDetailsByAccountId(Mockito.anyString())).thenReturn(Arrays.asList(getAccountResponseUsingAccountId));
		
		String promotionResponse = new String(FileUtility.readFile("\\rest-mock\\GetPromotionForBundle.json"));
		BundlePromotion[] bundlePromotion = new ObjectMapper().readValue(promotionResponse, BundlePromotion[].class);
		Mockito.when(broadbandDao.getPromotionForBundleList(Mockito.any(com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest.class))).thenReturn(Arrays.asList(bundlePromotion));
	
		OptimizePackageRequest optimizePackageRequest = new OptimizePackageRequest();
		optimizePackageRequest.setJourneyId("2290f3b1-1ed5-4513-9f86-110531c5fbfb");
		
		OptimizePackageResponse response = serviceImpl.optimizePackageForFLBB(optimizePackageRequest, "12345678907888");
		
		assertEquals(true, response.getHasPackageOptimized());
		
	}
	
}
