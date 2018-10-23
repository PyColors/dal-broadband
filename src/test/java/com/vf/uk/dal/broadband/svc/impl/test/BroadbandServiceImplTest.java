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
import com.vf.uk.dal.broadband.beans.test.BroadbandTestBeans;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.EnhanceCompatibleExtraResponse;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.SelectedAvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.svc.impl.BroadbandServiceImpl;
import com.vf.uk.dal.broadband.tests.util.FileUtility;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BroadbandTestBeans.class)
@ActiveProfiles("local")
public class BroadbandServiceImplTest {

	@Autowired
	BroadbandServiceImpl serviceImpl;

	@MockBean
	BroadbandDao broadbandDao;

	@Before
	public void setupMockBehaviour() throws Exception {
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
		assertEquals("string", respActual.getPhoneNumber());
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
	public void testClearPackageAndBasketCache() throws Exception {
		String getBroadbandCacheResponse = new String(FileUtility.readFile("\\rest-mock\\BroadbandCacheResponse.json"));
		Broadband broadbandCacheResponse = new ObjectMapper().readValue(getBroadbandCacheResponse, Broadband.class);
		Mockito.when(broadbandDao.getBroadbandFromCache(Mockito.anyString())).thenReturn(broadbandCacheResponse);
		serviceImpl.clearPackageAndBasketCache("12345678907888", "123456789078");
	}
}
