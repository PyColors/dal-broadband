package com.vf.uk.dal.broadband.model.test;

import java.beans.IntrospectionException;

import org.junit.Test;

import com.vf.uk.dal.broadband.entity.AvailabilityCheckRequest;
import com.vf.uk.dal.broadband.entity.AvailabilityCheckResponse;
import com.vf.uk.dal.broadband.entity.Identification;
import com.vf.uk.dal.broadband.entity.InstallationAddress;
import com.vf.uk.dal.broadband.entity.LineIdentification;
import com.vf.uk.dal.broadband.entity.LineRef;
import com.vf.uk.dal.broadband.entity.LineSpeeds;
import com.vf.uk.dal.broadband.entity.journey.AccessLine;
import com.vf.uk.dal.broadband.entity.journey.AppointmentWindow;
import com.vf.uk.dal.broadband.entity.journey.AvailableServices;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyDetails;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyRequest;
import com.vf.uk.dal.broadband.entity.journey.FLBBJourneyResponse;
import com.vf.uk.dal.broadband.entity.journey.ItemReference;
import com.vf.uk.dal.broadband.entity.journey.LineDirectory;
import com.vf.uk.dal.broadband.entity.journey.LineLocator;
import com.vf.uk.dal.broadband.entity.journey.LineReference;
import com.vf.uk.dal.broadband.entity.journey.LineSettings;
import com.vf.uk.dal.broadband.entity.journey.LineStatus;
import com.vf.uk.dal.broadband.entity.journey.LineTreatment;
import com.vf.uk.dal.broadband.entity.journey.MiscReference;
import com.vf.uk.dal.broadband.entity.journey.OfferDetails;
import com.vf.uk.dal.broadband.entity.journey.PendingOrder;
import com.vf.uk.dal.broadband.entity.journey.SalesOrderAppointment;
import com.vf.uk.dal.broadband.entity.journey.SalesOrderAppointmentRequest;
import com.vf.uk.dal.broadband.entity.journey.ServiceLine;
import com.vf.uk.dal.broadband.entity.journey.ServiceLineTreatment;
import com.vf.uk.dal.broadband.entity.journey.ServiceLines;
import com.vf.uk.dal.broadband.entity.journey.ServicePoint;
import com.vf.uk.dal.broadband.entity.journey.ServiceReference;
import com.vf.uk.dal.broadband.entity.journey.SiteNote;
import com.vf.uk.dal.broadband.test.BeanTest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityRequest;
import com.vf.uk.dal.entity.serviceavailability.GetServiceAvailibilityResponse;
import com.vf.uk.dal.entity.serviceavailability.IncompatibleServices;
import com.vf.uk.dal.entity.serviceavailability.LinePlant;



public class BroadbandModelTest {

	@Test
 	public void testModelClass() throws NoSuchMethodException, IntrospectionException
 	{
		BeanTest.test(AvailabilityCheckRequest.class);
		BeanTest.test(AvailabilityCheckResponse.class);
		BeanTest.test(com.vf.uk.dal.broadband.entity.Error.class);
		BeanTest.test(Identification.class);
		BeanTest.test(InstallationAddress.class);
		BeanTest.test(LineIdentification.class);
		BeanTest.test(LineRef.class);
		BeanTest.test(LineSpeeds.class);
		BeanTest.test(AccessLine.class);
		BeanTest.test(AppointmentWindow.class);
		BeanTest.test(AvailableServices.class);
		BeanTest.test(FLBBJourneyDetails.class);
		BeanTest.test(FLBBJourneyRequest.class);
		BeanTest.test(FLBBJourneyResponse.class);
		BeanTest.test(com.vf.uk.dal.broadband.entity.journey.Identification.class);
		BeanTest.test(com.vf.uk.dal.broadband.entity.journey.InstallationAddress.class);
		BeanTest.test(ItemReference.class);
		BeanTest.test(LineDirectory.class);
		BeanTest.test(LineDirectory.class);
		BeanTest.test(LineLocator.class);
		BeanTest.test(LineReference.class);
		BeanTest.test(LineSettings.class);
		BeanTest.test(com.vf.uk.dal.broadband.entity.journey.LineSpeeds.class);
		BeanTest.test(LineStatus.class);
		BeanTest.test(LineTreatment.class);
		BeanTest.test(MiscReference.class);
		BeanTest.test(OfferDetails.class);
		BeanTest.test(PendingOrder.class);
		BeanTest.test(SalesOrderAppointment.class);
		BeanTest.test(SalesOrderAppointmentRequest.class);
		BeanTest.test(ServiceLine.class);
		BeanTest.test(ServiceLines.class);
		BeanTest.test(ServiceLineTreatment.class);
		BeanTest.test(ServicePoint.class);
		BeanTest.test(ServiceReference.class);
		BeanTest.test(SiteNote.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.AvailableServices.class);
		BeanTest.test(GetServiceAvailibilityRequest.class);
		BeanTest.test(GetServiceAvailibilityResponse.class);
		BeanTest.test(IncompatibleServices.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.InstallationAddress.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineDirectory.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineLocator.class);
		BeanTest.test(LinePlant.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineReference.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineSettings.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineSpeeds.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineStatus.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.LineTreatment.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.MiscReference.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.UnsupportedServices.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.PendingOrder.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.ServiceAvailabilityLine.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.ServiceLine.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.ServiceLines.class);
		BeanTest.test(com.vf.uk.dal.entity.serviceavailability.ServiceLineTreatment.class);
		
		
 			
 	}
}
