package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AvailabilityCheckResponse.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-26T12:06:28.563Z")

public class AvailabilityCheckResponse extends ResourceSupport {
	
	/** The journey id. */
	@JsonProperty("journeyId")
	private String journeyId = null;

	/** The installation address. */
	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	/** The appointment and availability detail. */
	@JsonProperty("appointmentAndAvailabilityDetail")
	private List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail = null;

	/** The line speeds. */
	@JsonProperty("lineSpeeds")
	private List<LineSpeeds> lineSpeeds = null;

	/** The classification code. */
	@JsonProperty("classificationCode")
	private List<String> classificationCode = null;

	/** The engineering visit charge. */
	@JsonProperty("engineeringVisitCharge")
	private Price engineeringVisitCharge = null;

	/** The warning error list. */
	@JsonProperty("warningErrorList")
	private List<ErrorInfo> warningErrorList = null;

	/**
	 * Journey id.
	 *
	 * @param journeyId the journey id
	 * @return the availability check response
	 */
	public AvailabilityCheckResponse journeyId(String journeyId) {
		this.journeyId = journeyId;
		return this;
	}

	/**
	 * Journey id of the broadband - Unique.
	 *
	 * @return journeyId
	 */
	@ApiModelProperty(value = "Journey id of the broadband - Unique")

	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the journey id.
	 *
	 * @param journeyId the new journey id
	 */
	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	/**
	 * Installation address.
	 *
	 * @param installationAddress the installation address
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse installationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
		return this;
	}

	/**
	 * Get installationAddress.
	 *
	 * @return installationAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InstallationAddress getInstallationAddress() {
		return installationAddress;
	}

	/**
	 * Sets the installation address.
	 *
	 * @param installationAddress the new installation address
	 */
	public void setInstallationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
	}

	/**
	 * Appointment and availability detail.
	 *
	 * @param appointmentAndAvailabilityDetail the appointment and availability detail
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse appointmentAndAvailabilityDetail(
			List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail) {
		this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
		return this;
	}

	/**
	 * Adds the appointment and availability detail item.
	 *
	 * @param appointmentAndAvailabilityDetailItem the appointment and availability detail item
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse addAppointmentAndAvailabilityDetailItem(
			AppointmentAndAvailabilityDetail appointmentAndAvailabilityDetailItem) {
		if (this.appointmentAndAvailabilityDetail == null) {
			this.appointmentAndAvailabilityDetail = new ArrayList<>();
		}
		this.appointmentAndAvailabilityDetail.add(appointmentAndAvailabilityDetailItem);
		return this;
	}

	/**
	 * Get appointmentAndAvailabilityDetail.
	 *
	 * @return appointmentAndAvailabilityDetail
	 */
	@ApiModelProperty(value = "")

	@Valid

	public List<AppointmentAndAvailabilityDetail> getAppointmentAndAvailabilityDetail() {
		return appointmentAndAvailabilityDetail;
	}

	/**
	 * Sets the appointment and availability detail.
	 *
	 * @param appointmentAndAvailabilityDetail the new appointment and availability detail
	 */
	public void setAppointmentAndAvailabilityDetail(
			List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail) {
		this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
	}

	/**
	 * Classification code.
	 *
	 * @param classificationCode the classification code
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse classificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Adds the classification code item.
	 *
	 * @param classificationCodeItem the classification code item
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse addClassificationCodeItem(String classificationCodeItem) {
		if (this.classificationCode == null) {
			this.classificationCode = new ArrayList<>();
		}
		this.classificationCode.add(classificationCodeItem);
		return this;
	}

	/**
	 * Get classificationCode.
	 *
	 * @return classificationCode
	 */
	@ApiModelProperty(value = "")

	public List<String> getClassificationCode() {
		return classificationCode;
	}

	/**
	 * Sets the classification code.
	 *
	 * @param classificationCode the new classification code
	 */
	public void setClassificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * Gets the line speeds.
	 *
	 * @return the line speeds
	 */
	public List<LineSpeeds> getLineSpeeds() {
		return lineSpeeds;
	}

	/**
	 * Sets the line speeds.
	 *
	 * @param lineSpeeds the new line speeds
	 */
	public void setLineSpeeds(List<LineSpeeds> lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
	}

	/**
	 * Gets the engineering visit charge.
	 *
	 * @return the engineering visit charge
	 */
	public Price getEngineeringVisitCharge() {
		return engineeringVisitCharge;
	}

	/**
	 * Sets the engineering visit charge.
	 *
	 * @param engineeringVisitCharge the new engineering visit charge
	 */
	public void setEngineeringVisitCharge(Price engineeringVisitCharge) {
		this.engineeringVisitCharge = engineeringVisitCharge;
	}

	/**
	 * Warning error list.
	 *
	 * @param warningErrorList the warning error list
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse warningErrorList(List<ErrorInfo> warningErrorList) {
		this.warningErrorList = warningErrorList;
		return this;
	}

	/**
	 * Adds the warning error list item.
	 *
	 * @param warningError the warning error
	 * @return the availability check response
	 */

	public AvailabilityCheckResponse addWarningErrorListItem(ErrorInfo warningError) {
		if (this.warningErrorList == null) {
			this.warningErrorList = new ArrayList<>();
		}
		this.warningErrorList.add(warningError);
		return this;
	}

	/**
	 * Gets the warning error list.
	 *
	 * @return the warningErrorList
	 */
	public List<ErrorInfo> getWarningErrorList() {
		return warningErrorList;
	}

	/**
	 * Sets the warning error list.
	 *
	 * @param warningErrorList            the warningErrorList to set
	 */
	public void setWarningErrorList(List<ErrorInfo> warningErrorList) {
		this.warningErrorList = warningErrorList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AvailabilityCheckResponse availabilityCheckResponse = (AvailabilityCheckResponse) o;
		return Objects.equals(this.journeyId, availabilityCheckResponse.journeyId)
				&& Objects.equals(this.installationAddress, availabilityCheckResponse.installationAddress)
				&& Objects.equals(this.appointmentAndAvailabilityDetail,
						availabilityCheckResponse.appointmentAndAvailabilityDetail)
				&& Objects.equals(this.lineSpeeds, availabilityCheckResponse.lineSpeeds)
				&& Objects.equals(this.classificationCode, availabilityCheckResponse.classificationCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((appointmentAndAvailabilityDetail == null) ? 0 : appointmentAndAvailabilityDetail.hashCode());
		result = prime * result + ((classificationCode == null) ? 0 : classificationCode.hashCode());
		result = prime * result + ((engineeringVisitCharge == null) ? 0 : engineeringVisitCharge.hashCode());
		result = prime * result + ((installationAddress == null) ? 0 : installationAddress.hashCode());
		result = prime * result + ((journeyId == null) ? 0 : journeyId.hashCode());
		result = prime * result + ((lineSpeeds == null) ? 0 : lineSpeeds.hashCode());
		result = prime * result + ((warningErrorList == null) ? 0 : warningErrorList.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see org.springframework.hateoas.ResourceSupport#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvailabilityCheckResponse {\n");

		sb.append("    journeyId: ").append(toIndentedString(journeyId)).append("\n");
		sb.append("    installationAddress: ").append(toIndentedString(installationAddress)).append("\n");
		sb.append("    appointmentAndAvailabilityDetail: ").append(toIndentedString(appointmentAndAvailabilityDetail))
				.append("\n");
		sb.append("    lineSpeeds: ").append(toIndentedString(lineSpeeds)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    engineeringVisitCharge: ").append(toIndentedString(engineeringVisitCharge)).append("\n");
		sb.append("    warningErrorList: ").append(toIndentedString(warningErrorList)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 *
	 * @param o the o
	 * @return the string
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
