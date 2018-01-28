package com.vf.uk.dal.broadband.dao.impl;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyResponse;
import com.vf.uk.dal.broadband.entity.journey.Journey;
import com.vf.uk.dal.broadband.entity.journey.SalesOrderAppointmentRequest;
import com.vf.uk.dal.broadband.helper.SolrHelper;
import com.vf.uk.dal.broadband.utils.BroadbandCoherenceRepoProvider;
import com.vf.uk.dal.broadband.utils.BroadbandRepoProvider;
import com.vf.uk.dal.broadband.utils.CommonUtility;
import com.vf.uk.dal.broadband.utils.ConverterUtils;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.broadband.utils.SolrConnectionProvider;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vf.uk.dal.common.registry.client.RegistryClient;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vodafone.bankHolidays.pojo.BankHolidays;
import com.vodafone.business.service.RequestManager;
import com.vodafone.dal.domain.repository.BankHolidaysRepository;
import com.vodafone.solrmodels.ProductModel;

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

	@Autowired
	private BroadbandCoherenceRepoProvider cohRepoProvider;

	private RequestManager requestManager = null;

	
	
	/*
	 *  calls the get service availability MS.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getServiceAvailability(com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest)
	 */
	
	@Override
	public GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest) {

		RestTemplate restTemplate = registryClient.getRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		GetServiceAvailibilityResponse availabilityCheckResponse = null;
		GetServiceAvailibilityRequest request = ConverterUtils
				.createGetServiceAvailibilityRequest(availabilityCheckRequest);
		try {
			ResponseEntity<GetServiceAvailibilityResponse> client = restTemplate.postForEntity(
					"http://UTILITY-V1/utility/broadbandServiceAvailability", request,
					GetServiceAvailibilityResponse.class);
			if (client != null)
				availabilityCheckResponse = client.getBody();
		} catch (Exception e) {
			LogHelper.error(this, "::::::No Data recieved from TIL" + e);
			throw new ApplicationException(ExceptionMessages.NO_VALID_DATA_TIL);
		}

		return availabilityCheckResponse;
	}

	/*
	 * Update the journey with the FLBB service point information. This will be invoked for logged in customer only.
	 * 
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#updateJourneyWithFLBBDetails(java.lang.String, com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest)
	 */
	
	@Override
	public void updateJourneyWithFLBBDetails(String journeyId, FLBBJourneyRequest flbbRequestForJourney) {
		try {
			RestTemplate restTemplate = registryClient.getRestTemplate();
			restTemplate.put("http://JOURNEY-V1/journey/" + journeyId + "/flbb", flbbRequestForJourney);
		} catch (Exception e) {
			LogHelper.error(this, "::::::Invalid Journey Id or details" + e);
			throw new ApplicationException(ExceptionMessages.INVALID_JOURNEY_DETAILS);
		}

	}

	/* 
	 * Creates the FLBB journey with service point information. This will be invoked for anonymous customer only.
	 * 
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#createJourneyWithFLBBDetails(com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest)
	 */
	@Override
	public String createJourneyWithFLBBDetails(FLBBJourneyRequest flbbRequestForJourney) {
		ResponseEntity<FLBBJourneyResponse> client = null;
		try {
			RestTemplate restTemplate = registryClient.getRestTemplate();
			client = restTemplate.postForEntity("http://JOURNEY-V1/journey/flbb", flbbRequestForJourney,
					FLBBJourneyResponse.class);

		} catch (Exception e) {
			LogHelper.error(this, "::::::Invalid Journey Id or details" + e);
			throw new ApplicationException(ExceptionMessages.INVALID_JOURNEY_DETAILS);
		}

		if (client != null) {
			FLBBJourneyResponse flbbResponse = client.getBody();
			if (flbbResponse != null) {
				return flbbResponse.getJourneyId();
			}
			return null;
		}
		return null;
	}

	/* 
	 * This calls the Get Bundle List API which sites in Bundle MS to get the package details of BB.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getBundleDetailsFromGetBundleListAPI(java.lang.String)
	 */
	@Override
	public BundleDetails getBundleDetailsFromGetBundleListAPI(String url) {
		LogHelper.info(this, "Start -->  calling  getBundleDetailsFromGetBundleListAPI");
		BundleDetails client = null;
		RestTemplate restTemplate = registryClient.getRestTemplate();
		try {
			client = restTemplate.getForObject(url, BundleDetails.class);
		} catch (HttpClientErrorException e) {
			LogHelper.error(CommonUtility.class, "" + e);
			if (e.getStatusCode().value() == 400) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);
				LogHelper.error(CommonUtility.class, "" + s);
				throw new ApplicationException(ExceptionMessages.INVALID_API_REQUEST);
			} else if (e.getStatusCode().value() == 404) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);
				LogHelper.error(CommonUtility.class, "" + s);
				throw new ApplicationException(ExceptionMessages.NO_DATA_RECIEVED);
			}
		} catch (HttpServerErrorException e) {
			LogHelper.error(CommonUtility.class, "" + e);
			if (e.getStatusCode().value() == 500) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);

				LogHelper.error(CommonUtility.class, "" + s);
				throw new ApplicationException(ExceptionMessages.HTTP_SERVER_EXP_ERROR);
			}
		} catch (Exception e) {
			LogHelper.error(CommonUtility.class,
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
	@Override
	public List<ProductModel> getListOfProductModelsBasedOnProductIdList(List<String> productIdList) {
		List<ProductModel> productModels = null;
		try {
			final SolrHelper solrHelper = broadbandRepoProvider.getSolrHelper();
			productModels = broadbandRepoProvider.getProductModelList(solrHelper, productIdList);
		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception From Solr getProductModel::::::" + e);
			throw new ApplicationException(ExceptionMessages.SOLR_GETPRODUCTMODEL_EXCEPTION);
		}
		return productModels;

	}

	/*
	 * Get the Solr connections
	 * 
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getSolrConnection()
	 */
	
	@Override
	public void getSolrConnection() {
		requestManager = SolrConnectionProvider.getSolrConnection();
	}
	
	/*
	 * Get the holiday list in order to remove from the service availability dates.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getHolidayList(java.time.LocalDate, java.time.LocalDate)
	 */

	@Override
	public List<LocalDate> getHolidayList(LocalDate startDate, LocalDate endDate) throws ParseException {
		final BankHolidaysRepository repo = cohRepoProvider.getBankHolidayRepository();

		java.sql.Date startDateSQ = java.sql.Date.valueOf(startDate);
		java.sql.Date endDateSQ = java.sql.Date.valueOf(endDate);
		List<BankHolidays> bankHolidays = cohRepoProvider.getBankHolidayList(repo, startDateSQ, endDateSQ);
		List<LocalDate> dateList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(bankHolidays)) {
			bankHolidays.forEach(a -> dateList.add(a.getDateOfHoliday().toLocalDate()));
		}
		return dateList;

	}

	/*
	 * Get the journey details based on the journey id provided.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getJourney(java.lang.String)
	 */
	
	@Override
	public Journey getJourney(String journeyId) {
		try{
			final String jounreyUrl = "http://JOURNEY-V1/journey/" + journeyId;
			RestTemplate restTemplate = registryClient.getRestTemplate();
			ResponseEntity<Journey> response = restTemplate.getForEntity(jounreyUrl, Journey.class);
			return response.getBody();
		} catch (Exception e) {
			LogHelper.error(this, "::::::Invalid Journey Id or details" + e);
			throw new ApplicationException(ExceptionMessages.INVALID_JOURNEY_DETAILS);
		}
	}

	/*
	 * Calls create Appointment MS to create the appointment selected by the user.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#createAppointment(com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest)
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
			Gson gson = new Gson(); 
			String jsonInString = e.getResponseBodyAsString();
			com.vf.uk.dal.common.exception.ErrorResponse error = gson.fromJson(jsonInString, com.vf.uk.dal.common.exception.ErrorResponse.class);
			LogHelper.error(this, "::::::No Data recieved from TIL" + e);
			throw new ApplicationException(error.getErrorMessage());
		}
		return createAppointment;
	}

	/*
	 * Update the journey state with the appointment and site note information.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#updateJourneyStateForAppointment(java.lang.String, com.vf.uk.dal.broadband.entity.journey.SalesOrderAppointmentRequest)
	 */
	
	@Override
	public void updateJourneyStateForAppointment(String journeyId, SalesOrderAppointmentRequest appointmentRequest) {
		try {
			RestTemplate restTemplate = registryClient.getRestTemplate();
			restTemplate.put("http://JOURNEY-V1/journey/" + journeyId + "/flbb/appointmentDetails", appointmentRequest);
		} catch (Exception e) {
			LogHelper.error(this, "::::::Invalid Journey Id or details" + e);
			throw new ApplicationException(ExceptionMessages.INVALID_JOURNEY_DETAILS);
		}
		
	}

	/*
	 * Get the Engineering Vist Product from the Solr.
	 * (non-Javadoc)
	 * @see com.vf.uk.dal.broadband.dao.BroadbandDao#getEngineeringVisitProduct()
	 */
	
	@Override
	public List<ProductModel> getEngineeringVisitProduct() {
		
		List<ProductModel> productModels = null;
		List<String> productClassList = new ArrayList<>();
		List<String> productNameList = new ArrayList<>();
		
		try {
			productClassList.add("Fee");
			productNameList.add("Engineer Visit");
			final SolrHelper solrHelper = broadbandRepoProvider.getSolrHelper();
			productModels = broadbandRepoProvider.getEngineeringVisitProduct(solrHelper,productNameList, productClassList);
		} catch (Exception e) {
			LogHelper.error(this, "::::::Exception From Solr getProductModel::::::" + e);
			throw new ApplicationException(ExceptionMessages.SOLR_GETPRODUCTMODEL_EXCEPTION);
		} 
		return productModels;
	}
}
