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
import com.vf.uk.dal.broadband.exception.BroadbandJourneyCustomException;
import com.vf.uk.dal.broadband.exception.ExceptionMessages;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class BroadbandValidator.
 */
@Slf4j
public class BroadbandValidator {

	/**
	 * Instantiates a new broadband validator.
	 */
	private BroadbandValidator() {

	}

	/**
	 * Checks if is basket create or update request valid.
	 *
	 * @param basketRequest
	 *            the basket request
	 * @param broadband
	 *            the broadband
	 */
	public static void isBasketCreateOrUpdateRequestValid(BasketRequest basketRequest, Broadband broadband) {

		if (org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getSource())) {
			log.error("Source cannot be null while creating or updating package");
			throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_SOURCE_CODE,
					ExceptionMessages.EMPTY_SOURCE, "400");
		}

		if (org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getCustomerRequestedDate())) {
			log.error("Customer Requested date cannot be null while creating or updating package");
			throw new BroadbandJourneyCustomException(ExceptionMessages.CUSTOMER_REQUESTED_DATE,
					ExceptionMessages.EMPTY_CUSTOMER_REQUESTED_DATE, "400");
		}

		if (broadband != null && org.apache.commons.lang.StringUtils.isNotEmpty(broadband.getBasketId()) && broadband.getBasketInfo()!=null) {
			if (org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getPackageId())) {
				log.error("Package Id cannot be empty while updating");
				throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_PACKAGE_ID,
						ExceptionMessages.PACKAGE_ID_EMPTY, "400");
			}
			if (basketRequest.getAddBundle() != null && (org.apache.commons.lang.StringUtils
					.isEmpty(basketRequest.getAddBundle().getPackageLineId())
					|| org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getAddBundle().getBundleId()))) {
				log.error("Bundle Id and Package line id of bundle cannot be null while updating");
				throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_BUNDLE_ID_CODE,
						ExceptionMessages.BUNDLE_ID_EMPTY, "400");
			}
			if (basketRequest.getAddHardware() != null && (org.apache.commons.lang.StringUtils
					.isEmpty(basketRequest.getAddHardware().getPackageLineId())
					|| org.apache.commons.lang.StringUtils.isEmpty(basketRequest.getAddHardware().getHardwareId()))) {
				log.error("hardware Id and Package line id of bundle cannot be null while updating");
				throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_HARDWARE_ID_CODE,
						ExceptionMessages.HARDWARE_ID_EMPTY, "400");
			}
		}

	}

	/**
	 * Checks if is update line treatment request valid.
	 *
	 * @param updateLineRequest
	 *            the update line request
	 */
	public static void isUpdateLineTreatmentRequestValid(UpdateLineRequest updateLineRequest) {
		if (StringUtils.isEmpty(updateLineRequest.getLineTreatmentType())) {
			log.error("Line Treatment Type cannot be null whule updating the basket for line treatment type");
			throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_LINE_TREATMENT_TYPE,
					ExceptionMessages.LINE_TREATEMENT_TYPE_EMPTY, "400");
		}

	}

	/**
	 * Checks if is create appointment request valid.
	 *
	 * @param createAppointmentRequest
	 *            the create appointment request
	 */
	public static void isCreateAppointmentRequestValid(CreateAppointmentRequest createAppointmentRequest) {
		if (StringUtils.isEmpty(createAppointmentRequest.getStartTimePeriod())
				|| StringUtils.isEmpty(createAppointmentRequest.getTimeSlot())) {
			log.error("Start time date cannot be empty");
			throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_START_DATE,
					ExceptionMessages.START_DATE_EMPTY, "400");
		}
	}

	/**
	 * Validate start date.
	 *
	 * @param serviceStartDateRequest
	 *            the service start date request
	 * @return true, if successful
	 */
	public static boolean validateStartDate(ServiceStartDateRequest serviceStartDateRequest) {
		boolean isValidStartDate;
		if (serviceStartDateRequest != null && StringUtils.isNotEmpty(serviceStartDateRequest.getStartDateTime())) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			formatter.setLenient(false);
			try {
				formatter.parse(serviceStartDateRequest.getStartDateTime());
				isValidStartDate = true;
			} catch (ParseException exception) {
				log.error(exception.getMessage());
				throw new BroadbandJourneyCustomException(ExceptionMessages.INVALID_DATE_FORMAT,
						ExceptionMessages.INVALID_INPUT_INCORRECT_DATE_FORMAT, "400");
			}
		} else {
			log.error("Start time date cannot be empty");
			throw new BroadbandJourneyCustomException(ExceptionMessages.EMPTY_START_TIME,
					ExceptionMessages.START_DATE_EMPTY, "400");
		}
		return isValidStartDate;
	}

	/**
	 * Convert date to time stamp.
	 *
	 * @param serviceStartDate
	 *            the service start date
	 * @return the string
	 */
	public static String convertDateToTimeStamp(String serviceStartDate) {
		Date date;
		String formattedDate = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(serviceStartDate);
			Timestamp ts = new Timestamp(date.getTime());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
			formattedDate = formatter.format(ts);
		} catch (ParseException e) {
			log.error(e.getMessage());
			throw new BroadbandJourneyCustomException(ExceptionMessages.INVALID_DATE_FORMAT,
					ExceptionMessages.INVALID_INPUT_INCORRECT_DATE_FORMAT, "400");
		}
		return formattedDate;

	}

	/*
	 * public static void
	 * isCreateAppointmentRequestValid(CreateAppointmentRequest
	 * createAppointment) {
	 * 
	 * if (StringUtils.isEmpty(createAppointment.getStartTimePeriod())) {
	 * LogHelper.error(BroadbandValidator.class,
	 * "Start time date cannot be empty"); throw new
	 * ApplicationException(ExceptionMessages.START_DATE_EMPTY); } else if
	 * (StringUtils.isEmpty(createAppointment.getTimeSlot())) {
	 * LogHelper.error(BroadbandValidator.class, "Time Slot cannot be empty");
	 * throw new ApplicationException(ExceptionMessages.TIME_SLOT_EMPTY); } else
	 * if (StringUtils.isEmpty(createAppointment.getBasketId())) {
	 * LogHelper.error(BroadbandValidator.class, "Basket id cannot be empty");
	 * throw new ApplicationException(ExceptionMessages.BASKET_ID_EMPTY); }
	 * 
	 * }
	 */

}
