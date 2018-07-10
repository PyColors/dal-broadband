package com.vf.uk.dal.broadband.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
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
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.exception.TILException;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.constant.BroadBandConstant;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

/**
 * @author Infosys Limited
 *
 */
@Component("broadbandDao")
public class BroadbandDaoImpl implements BroadbandDao {

	@Autowired
	private RegistryClient registryClient;

	@Autowired
	private BroadbandRepoProvider broadbandRepoProvider;

	/*
	 * calls the get service availability MS. (non-Javadoc)
	 * 
	 * @see
	 * com.vf.uk.dal.broadband.dao.BroadbandDao#getServiceAvailability(com.vf.uk
	 * .dal.broadband.entity.AvailabilityCheckRequest)
	 */

	@Override
	public GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest, String userType) {

		RestTemplate restTemplate = registryClient.getRestTemplate();
		GetServiceAvailibilityResponse availabilityCheckResponse = null;
		GetServiceAvailibilityRequest request = ConverterUtils
				.createGetServiceAvailibilityRequest(availabilityCheckRequest, userType);
		try {
			ResponseEntity<GetServiceAvailibilityResponse> client = restTemplate.postForEntity(
					BroadBandConstant.SERVICE_AVAILABILITY_URL_CONSTANT, request, GetServiceAvailibilityResponse.class);
			if (client != null)
				availabilityCheckResponse = client.getBody();
		} catch (RestClientResponseException e) {
			Gson gson = new Gson();
			String jsonInString = e.getResponseBodyAsString();
			com.vf.uk.dal.common.exception.ErrorResponse error = gson.fromJson(jsonInString,
					com.vf.uk.dal.common.exception.ErrorResponse.class);
			LogHelper.error(this, "::::::No Data recieved from GSA TIL" + e);
			throw new ApplicationException(error.getErrorMessage());
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
		BundleDetails client = null;
		RestTemplate restTemplate = registryClient.getRestTemplate();
		try {
			client = restTemplate.getForObject(url, BundleDetails.class);
		} catch (HttpClientErrorException e) {
			LogHelper.error(BroadbandDaoImpl.class, "" + e);
			if (e.getStatusCode().value() == 400) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);
				LogHelper.error(BroadbandDaoImpl.class, "" + s);
				throw new ApplicationException(ExceptionMessages.INVALID_API_REQUEST);
			} else if (e.getStatusCode().value() == 404) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);
				LogHelper.error(BroadbandDaoImpl.class, "" + s);
				throw new ApplicationException(ExceptionMessages.NO_DATA_RECIEVED);
			}
		} catch (HttpServerErrorException e) {
			LogHelper.error(BroadbandDaoImpl.class, "" + e);
			if (e.getStatusCode().value() == 500) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);

				LogHelper.error(BroadbandDaoImpl.class, "" + s);
				throw new ApplicationException(ExceptionMessages.HTTP_SERVER_EXP_ERROR);
			}
		} catch (Exception e) {
			LogHelper.error(BroadbandDaoImpl.class,
					"getBundleDetailsFromGetBundleListAPI API Exception---------------" + e);
			// throw new ApplicationException(e.getLocalizedMessage());
			throw new ApplicationException(ExceptionMessages.INTERNAL_API_CALL_EXP);
		}

		LogHelper.info(this, "End --> calling getBundleDetailsFromGetBundleListAPI");
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(client, new TypeReference<BundleDetails>() {
		});
	}

	/**
	 * This method gets the list of Product Modles from Solr based on the list
	 * of Product Ids received as input in parameter.
	 * 
	 * @param productIdList
	 * @return List<ProductModel>
	 */
	/*
	 * @Override public List<ProductModel>
	 * getListOfProductModelsBasedOnProductIdList(List<String> productIdList) {
	 * List<ProductModel> productModels = null; try { final SolrHelper
	 * solrHelper = broadbandRepoProvider.getSolrHelper(); productModels =
	 * broadbandRepoProvider.getProductModelList(solrHelper, productIdList); }
	 * catch (Exception e) { LogHelper.error(this,
	 * "::::::Exception From Solr getProductModel::::::" + e); throw new
	 * ApplicationException(ExceptionMessages.SOLR_GETPRODUCTMODEL_EXCEPTION); }
	 * return productModels;
	 * 
	 * }
	 */

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
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		CreateAppointment createAppointment = null;
		try {
			ResponseEntity<CreateAppointment> client = restTemplate.postForEntity(
					"http://APPOINTMENT-V1/appointment/createAppointment", createAppointmentReq,
					CreateAppointment.class);
			if (client != null)
				createAppointment = client.getBody();
		} catch (RestClientResponseException e) {
			LogHelper.error(this, "::::::ERROR WHILE CALLING CREATE APPOINTMENT" + e);
			Gson gson = new Gson();
			String jsonInString = e.getResponseBodyAsString();
			com.vf.uk.dal.common.exception.ErrorResponse error = gson.fromJson(jsonInString,
					com.vf.uk.dal.common.exception.ErrorResponse.class);
			throw new TILException(null, error.getErrorMessage());
		}
		return createAppointment;
	}

	@Override
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreference) {
		AddressInfo addressInfo = null;
		try {
			RestTemplate restTemplate = registryClient.getRestTemplate();
			String url = "http://PREMISE-V1/premise/address/" + postCode + "?qualified=true";
			if (StringUtils.equals(categoryPreference, "FTTH")) {
				url += "&categoryType=" + categoryPreference;
			}
			ResponseEntity<AddressInfo> client = restTemplate.getForEntity(url, AddressInfo.class);
			if (client != null)
				addressInfo = client.getBody();
		} catch (RestClientResponseException e) {
			Gson gson = new Gson();
			String jsonInString = e.getResponseBodyAsString();
			com.vf.uk.dal.common.exception.ErrorResponse error = gson.fromJson(jsonInString,
					com.vf.uk.dal.common.exception.ErrorResponse.class);
			LogHelper.error(this, "::::::No Data recieved from TIL" + e);
			throw new ApplicationException(error.getErrorMessage());
		}
		return addressInfo;
	}

	@Override
	public void setBroadBandInCache(Broadband broadBand) {
		broadbandRepoProvider.saveBroadbandInCache(broadBand);

	}

	@Override
	public Broadband getBroadbandFromCache(String broadBandSessionId) {
		return broadbandRepoProvider.getBroadbandFromCache(broadBandSessionId);

	}

	@Override
	public CurrentJourney getJourney(String journeyId) {
		CurrentJourney currentJourney = null;
		try {
			RestTemplate restTemplate = registryClient.getRestTemplate();
			ResponseEntity<CurrentJourney> client = restTemplate.getForEntity(
					"http://JOURNEY-V1/journey/" + journeyId + "/queries/currentJourney", CurrentJourney.class);
			if (client != null)
				currentJourney = client.getBody();
		} catch (Exception e) {
			LogHelper.error(this, "::::::No Data recieved from TIL" + e);
			throw new ApplicationException(ExceptionMessages.NO_VALID_DATA_TIL);
		}
		return currentJourney;
	}

	@Override
	public Basket createBasket(CreateBasketRequest createBasketRequest) {
		Basket basket = null;
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			ResponseEntity<Basket> client = restTemplate.postForEntity(BroadBandConstant.BASKET_URL,
					createBasketRequest, Basket.class);
			if (client != null)
				basket = client.getBody();
		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception occured while calling create basket" + e);
			throw new ApplicationException(ExceptionMessages.GEN_EXCP_CREATE_BASKET);
		}

		return basket;
	}

	@Override
	public void updatePackage(UpdatePackage updatePackageRequest, String packageId, String basketId) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {

			final HttpEntity<UpdatePackage> entity = new HttpEntity<>(updatePackageRequest, headers);
			String url = BroadBandConstant.BASKET_URL + basketId + "/package/" + packageId;
			restTemplate.exchange(url, HttpMethod.PUT, entity, ModelPackage.class);
		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception while invoking update package request" + e);
			throw new ApplicationException(ExceptionMessages.GEN_PACKAGE_EXCEPTION);
		}
	}

	@Override
	public Basket getBasket(String basketId) {
		Basket basket = null;
		try {
			RestTemplate restTemplate = registryClient.getRestTemplate();
			ResponseEntity<Basket> client = restTemplate.getForEntity(BroadBandConstant.BASKET_URL + basketId,
					Basket.class);
			if (client != null)
				basket = client.getBody();
		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception while calling get basket" + e);
			throw new ApplicationException(ExceptionMessages.GEN_BASKET_EXCEPTION);
		}
		return basket;
	}

	@Override
	public void updateBasketWithPremiseAndServicePoint(PremiseAndServicePoint premiseAndServicePointRequest,
			String packageId, String basketId) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			final HttpEntity<PremiseAndServicePoint> entity = new HttpEntity<>(premiseAndServicePointRequest, headers);
			String url = BroadBandConstant.BASKET_URL + basketId + "/broadbandPackage/" + packageId
					+ "/premiseAndServicePoint";
			restTemplate.exchange(url, HttpMethod.PUT, entity, ResponseEntity.class);

		} catch (Exception e) {
			LogHelper.error(this,
					"::::::Exception while invoking update package request for premise and Service point" + e);
			throw new ApplicationException(ExceptionMessages.GEN_UPT_SP_EXCEPTION);
		}

	}

	@Override
	public List<CommercialProduct> getEngineeringVisitFee(String productClass, boolean isFTTHPlan,
			String installationType, boolean isPreOrderable) {

		List<CommercialProduct> productDetails = null;
		RestTemplate restTemplate = registryClient.getRestTemplate();
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append("http://PRODUCTS-V1/products/catalogue/products?class:name=" + productClass + "&isFTTH="
				+ isFTTHPlan + "&preorderable=" + isPreOrderable);
		if (StringUtils.isNotBlank(installationType)) {
			urlBuilder.append("&installationType=" + installationType);
		}
		try {
			ResponseEntity<CommercialProduct[]> client = restTemplate.getForEntity(urlBuilder.toString(),
					CommercialProduct[].class);
			if (client != null)
				productDetails = Arrays.asList(client.getBody());
		} catch (Exception e) {
			LogHelper.error(this, "::::::No Data recieved from Product Miscro service" + e);
			throw new ApplicationException(ExceptionMessages.NO_VALID_DATA_PRODUCT_ENGINEERING_FEE);
		}
		return productDetails;

	}

	@Override
	public List<DeliveryMethods> getDeliveryMethods(String productId, boolean useCache) {
		// BundleDetails client = null;
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append(
				"http://INVENTORY-V1/inventory/product/deliveryMethods?skuId=" + productId + "&useCache=" + useCache);
		RestTemplate restTemplate = registryClient.getRestTemplate();
		List<DeliveryMethods> deliveryMethods = null;
		try {
			ResponseEntity<DeliveryMethods[]> response = restTemplate.getForEntity(urlBuilder.toString(),
					DeliveryMethods[].class);
			if (response != null && response.getBody() != null) {
				deliveryMethods = Arrays.asList(response.getBody());
			}
		} catch (Exception e) {
			LogHelper.error(this, "::::::No Data recieved from Inventory Miscro service" + e);
			throw new ApplicationException(ExceptionMessages.NO_VALID_DATA_DELIVERY_METHODS);
		}
		return deliveryMethods;
	}

	@Override
	public void updateBasketWithServiceId(AddProductRequest addProductRequest, String basketId, String packageId) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {

			final HttpEntity<AddProductRequest> entity = new HttpEntity<>(addProductRequest, headers);
			String url = BroadBandConstant.BASKET_URL + basketId + "/package/" + packageId + "/product";
			restTemplate.exchange(url, HttpMethod.POST, entity, CreatePackageResponse.class);

		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception occured while calling add Product " + e);
			throw new ApplicationException(ExceptionMessages.GEN_EXCP_ADD_PRODUCT);
		}

	}

	@Override
	public void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest, String packageId,
			String basketId) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			final HttpEntity<AppointmentWindow> entity = new HttpEntity<>(appointmentWindowRequest, headers);
			String url = BroadBandConstant.BASKET_URL + basketId + "/broadbandPackage/" + packageId + "/appointment";
			restTemplate.exchange(url, HttpMethod.PUT, entity, ResponseEntity.class);

		} catch (Exception e) {
			LogHelper.error(this,
					"::::::Exception occured while calling Update Basket with Appontment Information " + e);
			throw new ApplicationException(ExceptionMessages.GEN_EXCP_UPDATE_APPT);
		}

	}

	@Override
	public GetAppointment getAppointmentList(GetAppointmentRequest request) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		GetAppointment getAppointment = null;
		try {
			ResponseEntity<GetAppointment> client = restTemplate.postForEntity(
					"http://APPOINTMENT-V1/appointment/action/getAppointment", request, GetAppointment.class);
			if (client != null)
				getAppointment = client.getBody();
		} catch (RestClientResponseException e) {
			LogHelper.error(this, "::::::ERROR WHILE CALLING GET APPOINTMENT" + e);
			Gson gson = new Gson();
			String jsonInString = e.getResponseBodyAsString();
			com.vf.uk.dal.common.exception.ErrorResponse error = gson.fromJson(jsonInString,
					com.vf.uk.dal.common.exception.ErrorResponse.class);
			throw new TILException(null, error.getErrorMessage());
		}
		return getAppointment;
	}

	@Override
	public List<RouterProductDetails> getCompatibleDevicesForBundle(String planId) {
		List<RouterProductDetails> productDetails = null;
		RestTemplate restTemplate = registryClient.getRestTemplate();
		try {
			ResponseEntity<RouterProductDetails[]> client = restTemplate.getForEntity(
					"http://BUNDLES-V1/bundles/catalogue/bundle/" + planId + "/compatibleDevices",
					RouterProductDetails[].class);
			if (client != null)
				productDetails = Arrays.asList(client.getBody());
		} catch (Exception e) {
			LogHelper.error(this, "::::::No Data recieved from Product Miscro service" + e);
			throw new ApplicationException(ExceptionMessages.NO_VALID_DATA_PRODUCT_ENGINEERING_FEE);
		}
		return productDetails;
	}

	@Override
	public List<BundlePromotion> getPromotionForBundleList(BundlePromotionRequest bundlePromotionRequest) {

		List<BundlePromotion> bundlePromotions = null;
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			ResponseEntity<BundlePromotion[]> client = restTemplate.postForEntity(
					"http://PROMOTION-V1/promotion/queries/ForBundleList", bundlePromotionRequest,
					BundlePromotion[].class);
			if (client != null)
				bundlePromotions = Arrays.asList(client.getBody());
		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception while calling promotion API" + e);
			throw new ApplicationException(ExceptionMessages.GEN_EXC_PROMOTION_API);
		}
		return bundlePromotions;
	}

	@Override
	public void updateBasketWithServiceDate(ServiceStartDateRequest serviceStartDateRequest, String basketId,
			String packageId) {
		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {

			final HttpEntity<ServiceStartDateRequest> entity = new HttpEntity<>(serviceStartDateRequest, headers);
			String url = BroadBandConstant.BASKET_URL + basketId + "/broadbandPackage/" + packageId
					+ "/serviceStartDate";
			restTemplate.exchange(url, HttpMethod.PUT, entity, Void.class);

		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception occured while calling updateBasketWithServiceDate " + e);
			throw new ApplicationException(ExceptionMessages.GEN_EXCP_ADD_PRODUCT);
		}
	}
}
