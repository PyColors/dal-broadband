package com.vf.uk.dal.broadband.dao.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vf.uk.dal.broadband.assembler.BroadbandJourneyServiceAssembler;
import com.vf.uk.dal.broadband.basket.entity.AddPackage;
import com.vf.uk.dal.broadband.basket.entity.AddProductRequest;
import com.vf.uk.dal.broadband.basket.entity.AppointmentWindow;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.basket.entity.CreatePackageResponse;
import com.vf.uk.dal.broadband.basket.entity.ModelPackage;
import com.vf.uk.dal.broadband.basket.entity.PremiseAndServicePoint;
import com.vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.basket.entity.UpdatePackage;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.EnhanceCompatibleExtraResponse;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest;
import com.vf.uk.dal.broadband.entity.customer.Account;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.price.RequestForBundleAndHardware;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

/**
 * The Class BroadbandDaoImpl.
 *
 * @author Infosys Limited
 */
@Component("broadbandDao")
public class BroadbandDaoImpl implements BroadbandDao {

	/** The broadband repo provider. */
	@Autowired
	private BroadbandRepoProvider broadbandRepoProvider;
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	BroadbandJourneyServiceAssembler broadbandJourneyServiceAssembler;

	/*
	 * calls the get service availability MS. (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getServiceAvailability(com.vf.uk
	 * .dal.broadband.entity.AvailabilityCheckRequest)
	 */

	@Override
	public GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest,
			String userType) {

		GetServiceAvailibilityResponse availabilityCheckResponse = null;
		GetServiceAvailibilityRequest request = broadbandJourneyServiceAssembler
				.createGetServiceAvailibilityRequest(availabilityCheckRequest, userType);

		ResponseEntity<GetServiceAvailibilityResponse> client = restTemplate.postForEntity(
				BroadBandConstant.SERVICE_AVAILABILITY_URL_CONSTANT, request, GetServiceAvailibilityResponse.class);
		if (client != null) {
			availabilityCheckResponse = client.getBody();
		}
		return availabilityCheckResponse;
	}

	/*
	 * This calls the Get Bundle List API which sites in Bundle MS to get the
	 * package details of BB. (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#
	 * getBundleDetailsFromGetBundleListAPI(java.lang.String)
	 */
	@Override
	public BundleDetails getBundleDetailsFromGetBundleListAPI(String url) {
		LogHelper.info(this, "Start -->  calling  getBundleDetailsFromGetBundleListAPI");
		BundleDetails client = restTemplate.getForObject(url, BundleDetails.class);
		LogHelper.info(this, "End --> calling getBundleDetailsFromGetBundleListAPI");
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(client, new TypeReference<BundleDetails>() {
		});
	}

	/*
	 * Calls create Appointment MS to create the appointment selected by the
	 * user. (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#createAppointment(com.vf.uk.dal.
	 * broadband.entity.appointment.CreateAppointmentRequest)
	 */

	@Override
	public CreateAppointment createAppointment(CreateAppointmentRequest createAppointmentReq) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		CreateAppointment createAppointment = null;
		ResponseEntity<CreateAppointment> client = restTemplate.postForEntity(
				"http://APPOINTMENT-V1/appointment/createAppointment", createAppointmentReq, CreateAppointment.class);
		if (client != null) {
			createAppointment = client.getBody();
		}
		return createAppointment;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#
	 * getAddressInfoByPostcodeFromPremise(java.lang.String, java.lang.String)
	 */
	@Override
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreference) {
		AddressInfo addressInfo = null;
		String url = "http://PREMISE-V1/premise/address/" + postCode + "?qualified=true";
		if (StringUtils.equals(categoryPreference, "FTTH")) {
			url += "&categoryType=" + categoryPreference;
		}
		ResponseEntity<AddressInfo> client = restTemplate.getForEntity(url, AddressInfo.class);
		if (client != null) {
			addressInfo = client.getBody();
		}
		return addressInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#setBroadBandInCache(com.vf.uk.
	 * dal.broadband.cache.repository.entity.Broadband)
	 */
	@Override
	public void setBroadBandInCache(Broadband broadBand) {
		broadbandRepoProvider.saveBroadbandInCache(broadBand);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getBroadbandFromCache(java.lang.
	 * String)
	 */
	@Override
	public Broadband getBroadbandFromCache(String broadBandSessionId) {
		return broadbandRepoProvider.getBroadbandFromCache(broadBandSessionId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getJourney(java.lang.String)
	 */
	@Override
	public CurrentJourney getJourney(String journeyId) {
		CurrentJourney currentJourney = null;
		ResponseEntity<CurrentJourney> client = restTemplate.getForEntity(
				"http://JOURNEY-V1/journey/" + journeyId + "/queries/currentJourney", CurrentJourney.class);
		if (client != null)
			currentJourney = client.getBody();

		return currentJourney;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#createBasket(com.vf.uk.dal.
	 * broadband.basket.entity.CreateBasketRequest)
	 */
	@Override
	public Basket createBasket(CreateBasketRequest createBasketRequest) {
		Basket basket = null;

		ResponseEntity<Basket> client = restTemplate.postForEntity(BroadBandConstant.BASKET_URL, createBasketRequest,
				Basket.class);
		if (client != null)
			basket = client.getBody();
		return basket;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#updatePackage(com.vf.uk.dal.
	 * broadband.basket.entity.UpdatePackage, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void updatePackage(UpdatePackage updatePackageRequest, String packageId, String basketId) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<UpdatePackage> entity = new HttpEntity<>(updatePackageRequest, headers);
		String url = BroadBandConstant.BASKET_URL + basketId + "/package/" + packageId;
		restTemplate.exchange(url, HttpMethod.PUT, entity, ModelPackage.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getBasket(java.lang.String)
	 */
	@Override
	public Basket getBasket(String basketId) {
		Basket basket = null;

		ResponseEntity<Basket> client = restTemplate.getForEntity(BroadBandConstant.BASKET_URL + basketId,
				Basket.class);
		if (client != null)
			basket = client.getBody();

		return basket;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#
	 * updateBasketWithPremiseAndServicePoint(com.vf.uk.dal.broadband.basket.
	 * entity.PremiseAndServicePoint, java.lang.String, java.lang.String)
	 */
	@Override
	public void updateBasketWithPremiseAndServicePoint(PremiseAndServicePoint premiseAndServicePointRequest,
			String packageId, String basketId) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<PremiseAndServicePoint> entity = new HttpEntity<>(premiseAndServicePointRequest, headers);
		String url = BroadBandConstant.BASKET_URL + basketId + "/broadbandPackage/" + packageId
				+ "/premiseAndServicePoint";
		restTemplate.exchange(url, HttpMethod.PUT, entity, ResponseEntity.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getEngineeringVisitFee(java.lang
	 * .String, boolean, java.lang.String, boolean)
	 */
	@Override
	public List<CommercialProduct> getEngineeringVisitFee(String productClass, boolean isFTTHPlan,
			String installationType, boolean isPreOrderable) {

		List<CommercialProduct> productDetails = null;

		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append("http://PRODUCTS-V1/products/catalogue/products?class:name=" + productClass + "&isFTTH="
				+ isFTTHPlan + "&preorderable=" + isPreOrderable);
		if (StringUtils.isNotBlank(installationType)) {
			urlBuilder.append("&installationType=" + installationType);
		}
		ResponseEntity<CommercialProduct[]> client = restTemplate.getForEntity(urlBuilder.toString(),
				CommercialProduct[].class);
		if (client != null)
			productDetails = Arrays.asList(client.getBody());
		return productDetails;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getDeliveryMethods(java.lang.
	 * String, boolean)
	 */
	@Override
	public List<DeliveryMethods> getDeliveryMethods(String productId, boolean useCache) {
		// BundleDetails client = null;
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=" + productId + "&useCache=" + useCache);

		List<DeliveryMethods> deliveryMethods = null;
		ResponseEntity<DeliveryMethods[]> response = restTemplate.getForEntity(urlBuilder.toString(),
				DeliveryMethods[].class);
		if (response != null && response.getBody() != null) {
			deliveryMethods = Arrays.asList(response.getBody());
		}

		return deliveryMethods;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#updateBasketWithServiceId(com.vf
	 * .uk.dal.broadband.basket.entity.AddProductRequest, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void updateBasketWithServiceId(AddProductRequest addProductRequest, String basketId, String packageId) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<AddProductRequest> entity = new HttpEntity<>(addProductRequest, headers);
		String url = BroadBandConstant.BASKET_URL + basketId + "/package/" + packageId + "/product";
		restTemplate.exchange(url, HttpMethod.POST, entity, CreatePackageResponse.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#
	 * updateBasketWithAppointmentInformation(com.vf.uk.dal.broadband.basket.
	 * entity.AppointmentWindow, java.lang.String, java.lang.String)
	 */
	@Override
	public void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest, String packageId,
			String basketId) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<AppointmentWindow> entity = new HttpEntity<>(appointmentWindowRequest, headers);
		String url = BroadBandConstant.BASKET_URL + basketId + "/broadbandPackage/" + packageId + "/appointment";
		restTemplate.exchange(url, HttpMethod.PUT, entity, ResponseEntity.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getAppointmentList(com.vf.uk.dal
	 * .broadband.entity.appointment.GetAppointmentRequest)
	 */
	@Override
	public GetAppointment getAppointmentList(GetAppointmentRequest request) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		GetAppointment getAppointment = null;
		ResponseEntity<GetAppointment> client = restTemplate.postForEntity(
				"http://APPOINTMENT-V1/appointment/action/getAppointment", request, GetAppointment.class);
		if (client != null)
			getAppointment = client.getBody();
		return getAppointment;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getCompatibleDevicesForBundle(
	 * java.lang.String)
	 */
	@Override
	public List<RouterProductDetails> getCompatibleDevicesForBundle(String planId) {
		List<RouterProductDetails> productDetails = null;

		ResponseEntity<RouterProductDetails[]> client = restTemplate.getForEntity(
				"http://BUNDLES-V1/bundles/catalogue/bundle/" + planId + "/compatibleDevices",
				RouterProductDetails[].class);
		if (client != null)
			productDetails = Arrays.asList(client.getBody());

		return productDetails;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getPromotionForBundleList(com.vf
	 * .uk.dal.broadband.entity.promotion.BundlePromotionRequest)
	 */
	@Override
	public List<BundlePromotion> getPromotionForBundleList(BundlePromotionRequest bundlePromotionRequest) {

		List<BundlePromotion> bundlePromotions = null;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<BundlePromotion[]> client = restTemplate.postForEntity(
				"http://PROMOTION-V1/promotion/queries/ForBundleList", bundlePromotionRequest, BundlePromotion[].class);
		if (client != null)
			bundlePromotions = Arrays.asList(client.getBody());

		return bundlePromotions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#updateBasketWithServiceDate(com.
	 * vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void updateBasketWithServiceDate(ServiceStartDateRequest serviceStartDateRequest, String basketId,
			String packageId) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<ServiceStartDateRequest> entity = new HttpEntity<>(serviceStartDateRequest, headers);
		String url = BroadBandConstant.BASKET_URL + basketId + "/broadbandPackage/" + packageId + "/serviceStartDate";
		restTemplate.exchange(url, HttpMethod.PUT, entity, Void.class);

	}

	@Override
	public EnhanceCompatibleExtraResponse getCompatibleExtras(String planId, String productGroupType) {
		// bundles/catalogue/bundle/110510/Compatible%20Business%20Extras/extras
		String url = "http://BUNDLES-V1/bundles/catalogue/bundle/%s/%s/extras";
		return restTemplate
				.getForEntity(String.format(url, planId, productGroupType), EnhanceCompatibleExtraResponse.class)
				.getBody();

	}

	@Override
	public List<Account> getAccountDetailsByAccountId(String accountId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<Account[]> entity = new HttpEntity<>(headers);
		String accountUri = "http://CUSTOMER-V1/customer/contact/accounts?accountId=" + accountId;

		ResponseEntity<Account[]> client = restTemplate.exchange(accountUri, HttpMethod.GET, entity, Account[].class);
		if (client != null)
			return Arrays.asList(client.getBody());

		return Collections.emptyList();
	}

	@Override
	public void deleteProductFromBasket(String basketId, String packageId, String engVisitProductLine) {
		restTemplate.delete("http://BASKET-V1/basket/" + basketId + "/package/" + packageId + "/productLine/"
				+ engVisitProductLine);

	}

	@Override
	public void deletePackage(String basketId, String packageId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<HttpStatus> entity = new HttpEntity<>(headers);
		String url = BroadBandConstant.BASKET_URL + basketId+"/package/"+packageId;
		restTemplate.exchange(url, HttpMethod.DELETE, entity, Void.class);
	}

	@Override
	public void addPackage(AddPackage createAddPackageRequest, String basketId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<AddPackage> entity = new HttpEntity<>(createAddPackageRequest, headers);
		String url = BroadBandConstant.BASKET_URL + basketId + "/package";
		restTemplate.exchange(url, HttpMethod.POST, entity, CreatePackageResponse.class);
		
	}
	
	@Override
	public List<com.vf.uk.dal.broadband.entity.price.PriceForBundleAndHardware> getBundleAndHardwarePrice(
			RequestForBundleAndHardware bundleAndHardwarePriceRequest) {
		List<com.vf.uk.dal.broadband.entity.price.PriceForBundleAndHardware> priceForBundleAndHardwareList = null;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<com.vf.uk.dal.broadband.entity.price.PriceForBundleAndHardware[]> client = restTemplate.postForEntity(
				BroadBandConstant.PRICE_URL + "calculateForBundleAndHardware", bundleAndHardwarePriceRequest, com.vf.uk.dal.broadband.entity.price.PriceForBundleAndHardware[].class);
		if (client != null)
			priceForBundleAndHardwareList = Arrays.asList(client.getBody());

		return priceForBundleAndHardwareList;
		
	}
}
