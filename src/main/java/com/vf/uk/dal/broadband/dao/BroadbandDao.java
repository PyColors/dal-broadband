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
import com.vf.uk.dal.broadband.entity.EnhanceCompatibleExtraResponse;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.entity.appointment.CreateAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointment;
import com.vf.uk.dal.broadband.entity.appointment.GetAppointmentRequest;
import com.vf.uk.dal.broadband.entity.customer.Account;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;
import com.vf.uk.dal.broadband.entity.product.CommercialProduct;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotion;
import com.vf.uk.dal.broadband.entity.promotion.BundlePromotionRequest;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryMethods;
import com.vf.uk.dal.broadband.journey.entity.CurrentJourney;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;

/**
 * The Interface BroadbandDao.
 *
 * @author Infosys limited
 */
public interface BroadbandDao {

	
	/**
	 * get the service availablity of the bb.
	 *
	 * @param availabilityCheckRequest the availability check request
	 * @param userType the user type
	 * @return GetServiceAvailibilityResponse
	 */
	
	GetServiceAvailibilityResponse getServiceAvailability(AvailabilityCheckRequest availabilityCheckRequest, String userType);

	/**
	 *  Update FLBB Journey.
	 *
	 * @param url the url
	 * @return the bundle details from get bundle list API
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
	 *  Get the list of Product.
	 *
	 * @param createAppointmentReq the create appointment req
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
	 * Update the journey.
	 *
	 * @param postCode the post code
	 * @param categoryPreference the category preference
	 * @return the address info by postcode from premise
	 */
	

	/**
	 * 
	 * @return List<ProductModel>
	 */
	

	AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreference);

	/**
	 * Sets the broad band in cache.
	 *
	 * @param broadBand the new broad band in cache
	 */
	void setBroadBandInCache(Broadband broadBand);

	/**
	 * Gets the broadband from cache.
	 *
	 * @param broadBandSessionId the broad band session id
	 * @return the broadband from cache
	 */
	Broadband getBroadbandFromCache(String broadBandSessionId);

	/**
	 * Gets the journey.
	 *
	 * @param journeyId the journey id
	 * @return the journey
	 */
	CurrentJourney getJourney(String journeyId);

	/**
	 * Creates the basket.
	 *
	 * @param createBasketRequest the create basket request
	 * @return the basket
	 */
	Basket createBasket(CreateBasketRequest createBasketRequest);

	/**
	 * Update package.
	 *
	 * @param updatePackageRequest the update package request
	 * @param packageId the package id
	 * @param basketId the basket id
	 */
	void updatePackage(UpdatePackage updatePackageRequest, String packageId, String basketId);

	/**
	 * Gets the basket.
	 *
	 * @param basketId the basket id
	 * @return the basket
	 */
	Basket getBasket(String basketId);

	/**
	 * Update basket with premise and service point.
	 *
	 * @param premiseAndServicePointRequest the premise and service point request
	 * @param packageId the package id
	 * @param basketId the basket id
	 */
	void updateBasketWithPremiseAndServicePoint(PremiseAndServicePoint premiseAndServicePointRequest, String packageId, String basketId);

	/**
	 * Gets the engineering visit fee.
	 *
	 * @param productClass the product class
	 * @param isFTTHPlan the is FTTH plan
	 * @param installationType the installation type
	 * @param isPreOrderable the is pre orderable
	 * @return the engineering visit fee
	 */
	List<CommercialProduct> getEngineeringVisitFee(String productClass, boolean isFTTHPlan, String installationType, boolean isPreOrderable);

	/*void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest);*/
	
	/**
	 * Gets the delivery methods.
	 *
	 * @param productId the product id
	 * @param useCache the use cache
	 * @return the delivery methods
	 */
	List<DeliveryMethods> getDeliveryMethods(String productId, boolean useCache);

	/**
	 * Update basket with service id.
	 *
	 * @param addProductRequest the add product request
	 * @param basketId the basket id
	 * @param packageId the package id
	 */
	void updateBasketWithServiceId(AddProductRequest addProductRequest, String basketId, String packageId);

	/**
	 * Update basket with appointment information.
	 *
	 * @param appointmentWindowRequest the appointment window request
	 * @param packageId the package id
	 * @param basketId the basket id
	 */
	void updateBasketWithAppointmentInformation(AppointmentWindow appointmentWindowRequest, String packageId,
			String basketId);

	/**
	 * Gets the appointment list.
	 *
	 * @param request the request
	 * @return the appointment list
	 */
	GetAppointment getAppointmentList(GetAppointmentRequest request);

	/**
	 * Gets the compatible devices for bundle.
	 *
	 * @param planId the plan id
	 * @return the compatible devices for bundle
	 */
	List<RouterProductDetails> getCompatibleDevicesForBundle(String planId);

	/**
	 * Gets the promotion for bundle list.
	 *
	 * @param bundlePromotionRequest the bundle promotion request
	 * @return the promotion for bundle list
	 */
	List<BundlePromotion> getPromotionForBundleList(BundlePromotionRequest bundlePromotionRequest);

	/**
	 * Update basket with service date.
	 *
	 * @param serviceStartDateBaketRequest the service start date baket request
	 * @param basketId the basket id
	 * @param packageId the package id
	 */
	void updateBasketWithServiceDate(
			com.vf.uk.dal.broadband.basket.entity.ServiceStartDateRequest serviceStartDateBaketRequest, String basketId,
			String packageId);

	/**
	 * Return list of compatible extras
	 * @param planId
	 * @param productGroupType
	 * @return
	 */
	EnhanceCompatibleExtraResponse getCompatibleExtras(String planId, String productGroupType);
	
	List<Account> getAccountDetailsByAccountId(String accountId);
}
