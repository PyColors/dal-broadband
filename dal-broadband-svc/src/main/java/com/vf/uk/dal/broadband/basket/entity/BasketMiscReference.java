package com.vf.uk.dal.broadband.basket.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BasketMiscReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T09:39:43.102Z")

public class BasketMiscReference {
	@JsonProperty("anfp")
	private String anfp = null;

	@JsonProperty("classificationCode")
	private String classificationCode = null;

	@JsonProperty("customerAgreedDate")
	private String customerAgreedDate = null;

	@JsonProperty("installationType")
	private String installationType = null;

	@JsonProperty("lineLength")
	private String lineLength = null;

	@JsonProperty("readyForServiceDate")
	private String readyForServiceDate = null;

	@JsonProperty("serviceProviderName")
	private String serviceProviderName = null;

	public BasketMiscReference anfp(String anfp) {
		this.anfp = anfp;
		return this;
	}

	/**
	 * Get anfp
	 * 
	 * @return anfp
	 **/
	@ApiModelProperty(value = "")

	public String getAnfp() {
		return anfp;
	}

	public void setAnfp(String anfp) {
		this.anfp = anfp;
	}

	public BasketMiscReference classificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		return this;
	}

	/**
	 * Get classificationCode
	 * 
	 * @return classificationCode
	 **/
	@ApiModelProperty(value = "")

	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public BasketMiscReference customerAgreedDate(String customerAgreedDate) {
		this.customerAgreedDate = customerAgreedDate;
		return this;
	}

	/**
	 * Get customerAgreedDate
	 * 
	 * @return customerAgreedDate
	 **/
	@ApiModelProperty(value = "")

	public String getCustomerAgreedDate() {
		return customerAgreedDate;
	}

	public void setCustomerAgreedDate(String customerAgreedDate) {
		this.customerAgreedDate = customerAgreedDate;
	}

	public BasketMiscReference installationType(String installationType) {
		this.installationType = installationType;
		return this;
	}

	/**
	 * Get installationType
	 * 
	 * @return installationType
	 **/
	@ApiModelProperty(value = "")

	public String getInstallationType() {
		return installationType;
	}

	public void setInstallationType(String installationType) {
		this.installationType = installationType;
	}

	public BasketMiscReference lineLength(String lineLength) {
		this.lineLength = lineLength;
		return this;
	}

	/**
	 * Get lineLength
	 * 
	 * @return lineLength
	 **/
	@ApiModelProperty(value = "")

	public String getLineLength() {
		return lineLength;
	}

	public void setLineLength(String lineLength) {
		this.lineLength = lineLength;
	}

	public BasketMiscReference readyForServiceDate(String readyForServiceDate) {
		this.readyForServiceDate = readyForServiceDate;
		return this;
	}

	/**
	 * Get readyForServiceDate
	 * 
	 * @return readyForServiceDate
	 **/
	@ApiModelProperty(value = "")

	public String getReadyForServiceDate() {
		return readyForServiceDate;
	}

	public void setReadyForServiceDate(String readyForServiceDate) {
		this.readyForServiceDate = readyForServiceDate;
	}

	public BasketMiscReference serviceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
		return this;
	}

	/**
	 * Get serviceProviderName
	 * 
	 * @return serviceProviderName
	 **/
	@ApiModelProperty(value = "")

	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BasketMiscReference miscReference = (BasketMiscReference) o;
		return Objects.equals(this.anfp, miscReference.anfp)
				&& Objects.equals(this.classificationCode, miscReference.classificationCode)
				&& Objects.equals(this.customerAgreedDate, miscReference.customerAgreedDate)
				&& Objects.equals(this.installationType, miscReference.installationType)
				&& Objects.equals(this.lineLength, miscReference.lineLength)
				&& Objects.equals(this.readyForServiceDate, miscReference.readyForServiceDate)
				&& Objects.equals(this.serviceProviderName, miscReference.serviceProviderName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(anfp, classificationCode, customerAgreedDate, installationType, lineLength,
				readyForServiceDate, serviceProviderName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BasketMiscReference {\n");

		sb.append("    anfp: ").append(toIndentedString(anfp)).append("\n");
		sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
		sb.append("    customerAgreedDate: ").append(toIndentedString(customerAgreedDate)).append("\n");
		sb.append("    installationType: ").append(toIndentedString(installationType)).append("\n");
		sb.append("    lineLength: ").append(toIndentedString(lineLength)).append("\n");
		sb.append("    readyForServiceDate: ").append(toIndentedString(readyForServiceDate)).append("\n");
		sb.append("    serviceProviderName: ").append(toIndentedString(serviceProviderName)).append("\n");
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
