package com.vf.uk.dal.broadband.dao;

import java.util.List;

import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.basket.entity.PremiseAndServicePoint;
import com.vf.uk.dal.broadband.basket.entity.UpdatePackage;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.ProductDetails;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

/**
 * @author Infosys limited
 *
 */
public interface BroadbandDao {

	
	/**
	 * get the service availablity of the bb.
	 * @param availabilityCheckRequest
	 * @return GetServiceAvailibilityResponse
	 */
	
	GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest);

	/**
	 *  Update FLBB Journey
	 * @param journeyId
	 * @param flbbRequestForJourney
	 */
	

	/**
	 *  create FLBB Journey
	 * @param flbbRequestForJourney
	 * @return createJourneyWithFLBBDetails
	 */
	

	/**
	 * Get the bundle details from Bundle List
	 * @param url
	 * @return BundleDetails
	 */
	BundleDetails getBundleDetailsFromGetBundleListAPI(String url);

	/**
	 *  Get the list of Product
	 * @param productIdList
	 * @return List<ProductModel>
	 */
	
	//List<ProductModel> getListOfProductModelsBasedOnProductIdList(List<String> productIdList);

	/**
	 * Solr Connection
	 */
	

	/**
	 * get the holiday list
	 * @param startDate
	 * @param endDate
	 * @return List<LocalDate>
	 * @throws ParseException
	 */
	

	/**
	 * Get the journey
	 * @param journeyId
	 * @return Journey
	 */
	

	/**
	 * Creates the appointment
	 * @param createAppointmentReq
	 * @return CreateAppointment
	 */
	
	/*CreateAppointment createAppointment(
			com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createAppointmentReq);*/

	/**
	 * Update the journey
	 * @param journeyId
	 * @param appointmentRequest
	 */
	

	/**
	 * 
	 * @return List<ProductModel>
	 */
	

	AddressInfo getAddressInfoByPostcodeFromPremise(String postCode);

	void setBroadBandInCache(Broadband broadBand);

	Broadband getBroadbandFromCache(String broadBandSessionId);

	CurrentJourney getJourney(String journeyId);

	Basket createBasket(CreateBasketRequest createBasketRequest);

	void updatePackage(UpdatePackage updatePackageRequest, String packageId, String basketId);

	Basket getBasket(String basketId);

	void updateBasketWithPremiseAndServicePoint(PremiseAndServicePoint premiseAndServicePointRequest, String packageId, String basketId);

	List<ProductDetails> getEngineeringVisitFee(String acceptVersion);

	/*void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest);*/
	
	List<DeliveryMethods> getDeliveryMethods(String productId, boolean useCache);
}
