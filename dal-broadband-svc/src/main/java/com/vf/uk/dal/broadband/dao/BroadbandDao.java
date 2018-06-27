package com.vf.uk.dal.broadband.dao;

import java.util.List;

import com.vf.uk.dal.broadband.basket.entity.AddProductRequest;
import com.vf.uk.dal.broadband.basket.entity.AppointmentWindow;
import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.CreateBasketRequest;
import com.vf.uk.dal.broadband.basket.entity.PremiseAndServicePoint;
import com.vf.uk.dal.broadband.basket.entity.UpdatePackage;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
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
	
	CreateAppointment createAppointment(
			com.vf.uk.dal.broadband.entity.appointment.CreateAppointmentRequest createAppointmentReq);

	/**
	 * Update the journey
	 * @param journeyId
	 * @param appointmentRequest
	 */
	

	/**
	 * 
	 * @return List<ProductModel>
	 */
	

	AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreference);

	void setBroadBandInCache(Broadband broadBand);

	Broadband getBroadbandFromCache(String broadBandSessionId);

	CurrentJourney getJourney(String journeyId);

	Basket createBasket(CreateBasketRequest createBasketRequest);

	void updatePackage(UpdatePackage updatePackageRequest, String packageId, String basketId);

	Basket getBasket(String basketId);

	void updateBasketWithPremiseAndServicePoint(PremiseAndServicePoint premiseAndServicePointRequest, String packageId, String basketId);

	List<CommercialProduct> getEngineeringVisitFee(String productClass, boolean isFTTHPlan, String installationType, boolean isPreOrderable);

	/*void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest);*/
	
	List<DeliveryMethods> getDeliveryMethods(String productId, boolean useCache);

	void updateBasketWithServiceId(AddProductRequest addProductRequest, String basketId, String packageId);

	void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest, String packageId,
			String basketId);

	GetAppointment getAppointmentList(GetAppointmentRequest request);

	List<RouterProductDetails> getCompatibleDevicesForBundle(String planId);

	List<BundlePromotion> getPromotionForBundleList(BundlePromotionRequest bundlePromotionRequest);

	void updateBasketWithServiceDate(
			com.vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest serviceStartDateBaketRequest, String basketId,
			String packageId);
}
