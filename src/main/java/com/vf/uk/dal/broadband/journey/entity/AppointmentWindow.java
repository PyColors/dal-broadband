/*
 * Journey APIs
 * Journey APIs for Authenticated Journeys
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vf.uk.dal.broadband.journey.entity;

import lombok.Data;

/**
 * AppointmentWindow.
 */
@Data
public class AppointmentWindow {

	/** The identification id. */
	private String identificationId = null;

	/** The start date time. */
	private String startDateTime = null;

	/** The operational preference code. */
	private String operationalPreferenceCode = null;

	/** The time slot. */
	private String timeSlot = null;

}
