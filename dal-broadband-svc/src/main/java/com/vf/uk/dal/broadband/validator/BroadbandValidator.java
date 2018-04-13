/*package com.vf.uk.dal.broadband.validator;

import org.apache.commons.lang.StringUtils;

import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;

*//**
 * @author Infosys Limited
 *
 *//*
public class BroadbandValidator {

	private BroadbandValidator() {

	}

	*//**
	 * checks if the request is valid or not.
	 * @param createAppointment
	 *//*

	public static void isCreateAppointmentRequestValid(CreateAppointmentRequest createAppointment) {

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

	}

}
*/