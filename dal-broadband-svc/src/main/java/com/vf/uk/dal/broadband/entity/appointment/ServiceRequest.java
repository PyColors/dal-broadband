package com.vf.uk.dal.broadband.entity.appointment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-18T17:50:50.794Z")

public class ServiceRequest {
	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("SubClassificationCode")
	private String subClassificationCode = null;

	@JsonProperty("priorityCode")
	private String priorityCode = null;

	@JsonProperty("categoryCode")
	private String categoryCode = null;

	@JsonProperty("customerPartyReference")
	private CustomerPartyReference customerPartyReference = null;

	@JsonProperty("itemReference")
	private ItemReference itemReference = null;

	public ServiceRequest typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * Identifies the type of appointment that is being booked LOV - INSTALL OR
	 * REPAIR. REPAIR is not supported, for future use only.
	 * 
	 * @return typeCode
	 **/

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public ServiceRequest classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * This is the service classification for which the appointment is requested
	 * LOV - LINE OR BROADBAND.
	 * 
	 * @return classificationCode
	 **/

	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public ServiceRequest subClassificationCode(String subClassificationCode) {
		this.subClassificationCode = subClassificationCode;
		return this;
	}

	/**
	 * Low level classification of the service for which appointment is
	 * requested. For Fixed Line, this field determines the type of voice or
	 * data related service When ClassificationCode is ‘LINE’, select
	 * ‘WLR_SINGLE_LINE’ When ClassificationCode is ‘BROADBAND’ and FTTC is
	 * Basic Provide (i.e. WLR Line is already present and only FTTC Broadband
	 * is requested on that WLR Line), select ‘Generic Ethernet Access’. When
	 * ClassificationCode is ‘BROADBAND’ and for FTTC Sim2 Provide, select ‘FTTC
	 * Sim2’. When ClassificationCode is ‘BROADBAND’ and for FTTP, select
	 * ‘Generic Ethernet Access - FTTP’ (broadband only). Line and FTTP (Sim2
	 * FTTP) is not supported. MPF’, ‘SMPF’ - Apllicable when ClassificationCode
	 * is ‘BROADBAND’, but not supported. For future use only. LOV -
	 * WLR_SINGLE_LINE, MPF, SMPF, Generic Ethernet Access, Generic Ethernet
	 * Access, FTTC Sim2.
	 * 
	 * @return subClassificationCode
	 **/

	public String getSubClassificationCode() {
		return subClassificationCode;
	}

	public void setSubClassificationCode(String subClassificationCode) {
		this.subClassificationCode = subClassificationCode;
	}

	public ServiceRequest priorityCode(String priorityCode) {
		this.priorityCode = priorityCode;
		return this;
	}

	/**
	 * The level of care applicable to a customer while fetching an appointment.
	 * LOV - STANDARD OR ENHANCED OR PREMIUM.
	 * 
	 * @return priorityCode
	 **/

	public String getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode;
	}

	public ServiceRequest categoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
		return this;
	}

	/**
	 * Feature categorization of the services for which appointments are being
	 * requested. LOV - BASIC OR PREMIUM.
	 * 
	 * @return categoryCode
	 **/

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public ServiceRequest customerPartyReference(CustomerPartyReference customerPartyReference) {
		this.customerPartyReference = customerPartyReference;
		return this;
	}

	/**
	 * Get customerPartyReference
	 * 
	 * @return customerPartyReference
	 **/

	@Valid

	public CustomerPartyReference getCustomerPartyReference() {
		return customerPartyReference;
	}

	public void setCustomerPartyReference(CustomerPartyReference customerPartyReference) {
		this.customerPartyReference = customerPartyReference;
	}

	public ServiceRequest itemReference(ItemReference itemReference) {
		this.itemReference = itemReference;
		return this;
	}

	/**
	 * Get itemReference
	 * 
	 * @return itemReference
	 **/

	@Valid

	public ItemReference getItemReference() {
		return itemReference;
	}

	public void setItemReference(ItemReference itemReference) {
		this.itemReference = itemReference;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceRequest serviceRequest = (ServiceRequest) o;
		return Objects.equals(this.typeCode, serviceRequest.typeCode)
				&& Objects.equals(this.classificationCode, serviceRequest.classificationCode)
				&& Objects.equals(this.subClassificationCode, serviceRequest.subClassificationCode)
				&& Objects.equals(this.priorityCode, serviceRequest.priorityCode)
				&& Objects.equals(this.categoryCode, serviceRequest.categoryCode)
				&& Objects.equals(this.customerPartyReference, serviceRequest.customerPartyReference)
				&& Objects.equals(this.itemReference, serviceRequest.itemReference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(typeCode, classificationCode, subClassificationCode, priorityCode, categoryCode,
				customerPartyReference, itemReference);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceRequest {\n");

		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    subClassificationCode: ").append(toIndentedString(subClassificationCode)).append("\n");
		sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
		sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
		sb.append("    customerPartyReference: ").append(toIndentedString(customerPartyReference)).append("\n");
		sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
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
