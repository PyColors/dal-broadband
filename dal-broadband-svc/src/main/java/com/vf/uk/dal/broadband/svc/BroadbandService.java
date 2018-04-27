package com.vf.uk.dal.broadband.svc;

import com.vf.uk.dal.broadband.basket.entity.Basket;
import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.premise.AddressInfo;

/**
 * @author Infosys limited.
 *
 */
public interface BroadbandService {

	/**
	 * check availability service for broadband
	 * @param availabilityCheckRequest
	 * @param broadbandId 
	 * @param acceptVersion 
	 * @return AvailabilityCheckResponse
	 */
	
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest, String broadbandId, String acceptVersion);

	
	/**
	 * get the FLBB bundle list
	 * @param getBundleListSearchCriteria
	 * @return List<FlbBundle> 
	 */
	//public List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria);

	/**
	 * Service Start date
	 * @param earliestAvailableStartDate
	 * @param range
	 * @return ServiceStartDates
	 * @throws DateTimeParseException
	 * @throws ParseException
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
	public AddressInfo getAddressInfoByPostcodeFromPremise(String postCode);


	public Basket createOrUpdatePackage(BasketRequest basketRequest, Broadband broadband, String broadbandId);


	public Broadband getBroadbandFromCache(String broadbandId);
}
