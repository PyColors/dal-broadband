package com.vf.uk.dal.broadband.validator;

import org.apache.commons.lang3.StringUtils;

import com.vf.uk.dal.broadband.basket.entity.BasketRequest;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;
import com.vf.uk.dal.broadband.entity.CreateAppointmentRequest;
import com.vf.uk.dal.broadband.entity.UpdateLineRequest;
import com.vf.uk.dal.broadband.utils.ExceptionMessages;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;

public class BroadbandValidator {

	private BroadbandValidator() {

	}

	
	
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



	public static void isUpdateLineTreatmentRequestValid(UpdateLineRequest updateLineRequest) {
		if(StringUtils.isEmpty(updateLineRequest.getLineTreatmentType())){
			LogHelper.error(BroadbandValidator.class, "Line Treatment Type cannot be null whule updating the basket for line treatment type");
			throw new ApplicationException(ExceptionMessages.LINE_TREATEMENT_TYPE_EMPTY);
		}
		
	}



	public static void isCreateAppointmentRequestValid(CreateAppointmentRequest createAppointmentRequest) {
		if(StringUtils.isEmpty(createAppointmentRequest.getStartTimePeriod())
				|| StringUtils.isEmpty(createAppointmentRequest.getTimeSlot())){
			LogHelper.error(BroadbandValidator.class, "Start time date cannot be empty");
			throw new ApplicationException(ExceptionMessages.START_DATE_EMPTY);
		}
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
