package com.vf.uk.dal.broadband.validator;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.ServiceStartDateRequest;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.exception.ExceptionMessages;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;

/**
 * The Class BroadbandValidator.
 */
public class BroadbandValidator {

	/**
	 * Instantiates a new broadband validator.
	 */
	private BroadbandValidator() {

	}

	
	
	/**
	 * Checks if is basket create or update request valid.
	 *
	 * @param basketRequest the basket request
	 * @param broadband the broadband
	 */
	public static void isBasketCreateOrUpdateRequestValid(BasketRequest basketRequest, Broadband broadband){
		
		
		if(org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getSource())){
			LogHelper.error(BroadbandValidator.class, "Source cannot be null while creating or updating package");
			throw new ApplicationException(ExceptionMessages.EMPTY_SOURCE);
		}
		
		
		if(org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getCustomerRequestedDate())){
			LogHelper.error(BroadbandValidator.class, "Customer Requested date cannot be null while creating or updating package");
			throw new ApplicationException(ExceptionMessages.EMPTY_CUSTOMER_REQUESTED_DATE);
		}
		
		if(broadband!=null && org.apache.commons.lang.StringUtils.isNotEmpty(broadband.getBasketId())){
			if(org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getPackageId())){
				LogHelper.error(BroadbandValidator.class, "Package Id cannot be empty while updating");
				throw new ApplicationException(ExceptionMessages.PACKAGE_ID_EMPTY);
			}
			if(basketRequest.getAddBundle()!=null && (org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getAddBundle().getPackageLineId())
					|| org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getAddBundle().getBundleId()))){
				LogHelper.error(BroadbandValidator.class, "Bundle Id and Package line id of bundle cannot be null while updating");
				throw new ApplicationException(ExceptionMessages.BUNDLE_ID_EMPTY);
			}
			if(basketRequest.getAddHardware()!=null && (org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getAddHardware().getPackageLineId())
					|| org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getAddHardware().getHardwareId()))){
				LogHelper.error(BroadbandValidator.class, "hardware Id and Package line id of bundle cannot be null while updating");
				throw new ApplicationException(ExceptionMessages.HARDWARE_ID_EMPTY);
			}
		}
		
		
		
	}



	/**
	 * Checks if is update line treatment request valid.
	 *
	 * @param updateLineRequest the update line request
	 */
	public static void isUpdateLineTreatmentRequestValid(UpdateLineRequest updateLineRequest) {
		if(StringUtils.isEmpty(updateLineRequest.getLineTreatmentType())){
			LogHelper.error(BroadbandValidator.class, "Line Treatment Type cannot be null whule updating the basket for line treatment type");
			throw new ApplicationException(ExceptionMessages.LINE_TREATEMENT_TYPE_EMPTY);
		}
		
	}



	/**
	 * Checks if is create appointment request valid.
	 *
	 * @param createAppointmentRequest the create appointment request
	 */
	public static void isCreateAppointmentRequestValid(CreateAppointmentRequest createAppointmentRequest) {
		if(StringUtils.isEmpty(createAppointmentRequest.getStartTimePeriod())
				&& StringUtils.isEmpty(createAppointmentRequest.getTimeSlot())){
			LogHelper.error(BroadbandValidator.class, "Start time date cannot be empty");
			throw new ApplicationException(ExceptionMessages.START_DATE_EMPTY);
		}
	}
	
	/**
	 * Validate start date.
	 *
	 * @param serviceStartDateRequest the service start date request
	 * @return true, if successful
	 */
	public static boolean validateStartDate(ServiceStartDateRequest serviceStartDateRequest) {
		boolean isValidStartDate;
		if(serviceStartDateRequest!=null && StringUtils.isNotEmpty(serviceStartDateRequest.getStartDateTime())){
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			formatter.setLenient(false);
			try {
				formatter.parse(serviceStartDateRequest.getStartDateTime());
				isValidStartDate = true;
			} catch (ParseException exception) {
				LogHelper.error(BroadbandValidator.class, exception.getMessage());
				throw new ApplicationException(ExceptionMessages.INVALID_INPUT_INCORRECT_DATE_FORMAT);
			}
		}else{
			LogHelper.error(BroadbandValidator.class, "Start time date cannot be empty");
			throw new ApplicationException(ExceptionMessages.START_DATE_EMPTY);
		}
		return isValidStartDate;
	}
	
	/**
	 * Convert date to time stamp.
	 *
	 * @param serviceStartDate the service start date
	 * @return the string
	 */
	public static String convertDateToTimeStamp(String serviceStartDate) {
		Date date;
		String formattedDate = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(serviceStartDate);
			Timestamp ts = new Timestamp(date.getTime());  
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");    
	        formattedDate =  formatter.format(ts);
		} catch (ParseException e) {
			LogHelper.error(BroadbandValidator.class, e.getMessage());
			throw new ApplicationException(ExceptionMessages.INVALID_INPUT_INCORRECT_DATE_FORMAT);
		}
		return formattedDate;
		
	}

	
	

	/*public static void isCreateAppointmentRequestValid(CreateAppointmentRequest createAppointment) {

		if (StringUtils.isEmpty(createAppointment.getStartTimePeriod())) {
			LogHelper.error(BroadbandValidator.class, "Start time date cannot be empty");
			throw new ApplicationException(ExceptionMessages.START_DATE_EMPTY);
		} else if (StringUtils.isEmpty(createAppointment.getTimeSlot())) {
			LogHelper.error(BroadbandValidator.class, "Time Slot cannot be empty");
			throw new ApplicationException(ExceptionMessages.TIME_SLOT_EMPTY);
		} else if (StringUtils.isEmpty(createAppointment.getBasketId())) {
			LogHelper.error(BroadbandValidator.class, "Basket id cannot be empty");
			throw new ApplicationException(ExceptionMessages.BASKET_ID_EMPTY);
		}

	}*/

}
