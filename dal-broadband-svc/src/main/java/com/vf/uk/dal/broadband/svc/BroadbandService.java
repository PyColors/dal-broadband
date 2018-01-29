package com.vf.uk.dal.broadband.svc;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.CreateAppointmentResponse;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.GetBundleListSearchCriteria;
import com.vf.uk.dal.broadband.entity.ServiceStartDates;

/**
 * @author Infosys limited.
 *
 */
public interface BroadbandService {

	/**
	 * check availability service for broadband
	 * @param availabilityCheckRequest
	 * @return AvailabilityCheckResponse
	 */
	
	public AvailabilityCheckResponse checkAvailabilityForBroadband(AvailabilityCheckRequest availabilityCheckRequest);

	
	/**
	 * get the FLBB bundle list
	 * @param getBundleListSearchCriteria
	 * @return List<FlbBundle> 
	 */
	public List<FlbBundle> getFlbList(GetBundleListSearchCriteria getBundleListSearchCriteria);

	/**
	 * Service Start date
	 * @param earliestAvailableStartDate
	 * @param range
	 * @return ServiceStartDates
	 * @throws DateTimeParseException
	 * @throws ParseException
	 */
	
	public ServiceStartDates getAvailableServiceStartDates(String earliestAvailableStartDate, BigDecimal range)
			throws DateTimeParseException, ParseException;
	
	/**
	 * Create the appointment.
	 * @param createAppointmentRequest
	 * @return CreateAppointmentResponse
	 */
	CreateAppointmentResponse createAppointmentForFLBB(CreateAppointmentRequest createAppointmentRequest);
}
