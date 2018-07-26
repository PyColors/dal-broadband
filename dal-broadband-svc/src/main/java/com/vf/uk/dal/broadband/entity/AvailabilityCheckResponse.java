package com.vf.uk.dal.broadband.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AvailabilityCheckResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-26T12:06:28.563Z")

public class AvailabilityCheckResponse extends ResourceSupport {
	@JsonProperty("journeyId")
	private String journeyId = null;

	@JsonProperty("installationAddress")
	private InstallationAddress installationAddress = null;

	@JsonProperty("appointmentAndAvailabilityDetail")
	private List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail = null;

	@JsonProperty("lineSpeeds")
	private List<LineSpeeds> lineSpeeds = null;

	@JsonProperty("classificationCode")
	private List<String> classificationCode = null;

	@JsonProperty("engineeringVisitCharge")
	private Price engineeringVisitCharge = null;

	@JsonProperty("warningErrorList")
	private List<ErrorInfo> warningErrorList = null;

	public AvailabilityCheckResponse journeyId(String journeyId) {
		this.journeyId = journeyId;
		return this;
	}

	/**
	 * Journey id of the broadband - Unique
	 * 
	 * @return journeyId
	 **/
	@ApiModelProperty(value = "Journey id of the broadband - Unique")

	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	/**
	 * 
	 * @param installationAddress
	 * @return
	 */

	public AvailabilityCheckResponse installationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
		return this;
	}

	/**
	 * Get installationAddress
	 * 
	 * @return installationAddress
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public InstallationAddress getInstallationAddress() {
		return installationAddress;
	}

	public void setInstallationAddress(InstallationAddress installationAddress) {
		this.installationAddress = installationAddress;
	}

	/**
	 * 
	 * @param appointmentAndAvailabilityDetail
	 * @return
	 */

	public AvailabilityCheckResponse appointmentAndAvailabilityDetail(
			List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail) {
		this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
		return this;
	}

	/**
	 * 
	 * @param appointmentAndAvailabilityDetailItem
	 * @return
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
	 * Get appointmentAndAvailabilityDetail
	 * 
	 * @return appointmentAndAvailabilityDetail
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<AppointmentAndAvailabilityDetail> getAppointmentAndAvailabilityDetail() {
		return appointmentAndAvailabilityDetail;
	}

	public void setAppointmentAndAvailabilityDetail(
			List<AppointmentAndAvailabilityDetail> appointmentAndAvailabilityDetail) {
		this.appointmentAndAvailabilityDetail = appointmentAndAvailabilityDetail;
	}

	/**
	 * 
	 * @param classificationCode
	 * @return
	 */

	public AvailabilityCheckResponse classificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * 
	 * @param classificationCodeItem
	 * @return
	 */

	public AvailabilityCheckResponse addClassificationCodeItem(String classificationCodeItem) {
		if (this.classificationCode == null) {
			this.classificationCode = new ArrayList<>();
		}
		this.classificationCode.add(classificationCodeItem);
		return this;
	}

	/**
	 * Get classificationCode
	 * 
	 * @return classificationCode
	 **/
	@ApiModelProperty(value = "")

	public List<String> getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(List<String> classificationCode) {
		this.classificationCode = classificationCode;
	}

	public List<LineSpeeds> getLineSpeeds() {
		return lineSpeeds;
	}

	public void setLineSpeeds(List<LineSpeeds> lineSpeeds) {
		this.lineSpeeds = lineSpeeds;
	}

	public Price getEngineeringVisitCharge() {
		return engineeringVisitCharge;
	}

	public void setEngineeringVisitCharge(Price engineeringVisitCharge) {
		this.engineeringVisitCharge = engineeringVisitCharge;
	}

	/**
	 * 
	 * @param classificationCode
	 * @return
	 */

	public AvailabilityCheckResponse warningErrorList(List<ErrorInfo> warningErrorList) {
		this.warningErrorList = warningErrorList;
		return this;
	}

	/**
	 * 
	 * @param classificationCodeItem
	 * @return
	 */

	public AvailabilityCheckResponse addWarningErrorListItem(ErrorInfo warningError) {
		if (this.warningErrorList == null) {
			this.warningErrorList = new ArrayList<>();
		}
		this.warningErrorList.add(warningError);
		return this;
	}

	/**
	 * @return the warningErrorList
	 */
	public List<ErrorInfo> getWarningErrorList() {
		return warningErrorList;
	}

	/**
	 * @param warningErrorList
	 *            the warningErrorList to set
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
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
