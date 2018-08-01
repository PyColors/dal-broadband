package com.vf.uk.dal.broadband.svc;

import java.util.List;

import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetAppointmentResponse;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.OptimizePackageRequest;
import com.vf.uk.dal.broadband.entity.OptimizePackageResponse;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.SelectedAvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;

/**
 * The Interface BroadbandService.
 *
 * @author Infosys limited.
 */
public interface BroadbandService {

	/**
	 * check availability service for broadband.
	 *
	 * @param availabilityCheckRequest the availability check request
	 * @param broadbandId the broadband id
	 * @param broadband the broadband
	 * @param userType the user type
	 * @return AvailabilityCheckResponse
	 */
	
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest, String broadbandId, Broadband broadband, String userType);

	
	/**
	 * get the FLBB bundle list.
	 *
	 * @param getBundleListSearchCriteria the get bundle list search criteria
	 * @return List<FlbBundle>
	 */
	public List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria);

	/**
	 * Service Start date.
	 *
	 * @param postCode the post code
	 * @param categoryPreferences the category preferences
	 * @param userType the user type
	 * @return ServiceStartDates
	 */
	
	/*public ServiceStartDates getAvailableServiceStartDates(String earliestAvailableStartDate, BigDecimal range)
			throws DateTimeParseException, ParseException;*/
	
	/**
	 * Create the appointment.
	 * @param createAppointmentRequest
	 * @param journeyId 
	 * @return CreateAppointmentResponse
	 */
	/*CreateAppointmentResponse createAppointmentForFLBB(CreateAppointmentRequest createAppointmentRequest, String journeyId);*/

	/**
	 * Get address list by post code from Premise
	 * @param postCode
	 * @return AddressInfo
	 */
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode, String categoryPreferences,String userType);


	/**
	 * Creates the or update package.
	 *
	 * @param basketRequest the basket request
	 * @param broadband the broadband
	 * @param broadbandId the broadband id
	 * @return the basket
	 */
	public Basket createOrUpdatePackage(BasketRequest basketRequest, Broadband broadband, String broadbandId);


	/**
	 * Gets the broadband from cache.
	 *
	 * @param broadbandId the broadband id
	 * @return the broadband from cache
	 */
	public Broadband getBroadbandFromCache(String broadbandId);


	/**
	 * Update basket with line treatment type.
	 *
	 * @param broadbandId the broadband id
	 * @param updateLineRequest the update line request
	 */
	public void updateBasketWithLineTreatmentType(String broadbandId, UpdateLineRequest updateLineRequest);


	/**
	 * Creates the appointment.
	 *
	 * @param createAppointmentRequest the create appointment request
	 * @param broadbandId the broadband id
	 * @return the creates the appointment response
	 */
	public CreateAppointmentResponse createAppointment(CreateAppointmentRequest createAppointmentRequest,
			String broadbandId);


	/**
	 * Gets the appointment for FLBB.
	 *
	 * @param broadbandId the broadband id
	 * @return the appointment for FLBB
	 */
	public GetAppointmentResponse getAppointmentForFLBB(String broadbandId);


	/**
	 * Optimize package for FLBB.
	 *
	 * @param optimizePackageRequest the optimize package request
	 * @param broadbandId the broadband id
	 * @return the optimize package response
	 */
	public OptimizePackageResponse optimizePackageForFLBB(OptimizePackageRequest optimizePackageRequest, String broadbandId);


	/**
	 * Gets the compatible devices for bundle.
	 *
	 * @param broadbandId the broadband id
	 * @param planId the plan id
	 * @return the compatible devices for bundle
	 */
	public List<RouterDetails> getCompatibleDevicesForBundle(String broadbandId, String planId);


	/**
	 * Update basket with service date.
	 *
	 * @param broadbandId the broadband id
	 * @param serviceStartDateRequest the service start date request
	 */
	public void updateBasketWithServiceDate(String broadbandId, ServiceStartDateRequest serviceStartDateRequest);


	public SelectedAvailabilityCheckResponse getSelectedLineOptions(String broadbandId);
}
