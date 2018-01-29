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

package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * PendingOrder
 */
public class PendingOrder {
	private String completionDate = null;

	private String typeCode = null;

	private String thirdPartyFlag = null;

	/**
	 * @param completionDate
	 * @return
	 */
	public PendingOrder completionDate(String completionDate) {
		this.completionDate = completionDate;
		return this;
	}

	/**
	 * The date by which the pending order would be completed.
	 * 
	 * @return completionDate
	 **/
	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	/**
	 * @param typeCode
	 * @return
	 */
	public PendingOrder typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * The type of pending order
	 * 
	 * @return typeCode
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * @param thirdPartyFlag
	 * @return
	 */
	public PendingOrder thirdPartyFlag(String thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
		return this;
	}

	/**
	 * Specifies if the pending order on the line is by a third party (a party
	 * other than the line owner Communications Provider)
	 * 
	 * @return thirdPartyFlag
	 **/
	public String getThirdPartyFlag() {
		return thirdPartyFlag;
	}

	public void setThirdPartyFlag(String thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PendingOrder pendingOrder = (PendingOrder) o;
		return Objects.equals(this.completionDate, pendingOrder.completionDate)
				&& Objects.equals(this.typeCode, pendingOrder.typeCode)
				&& Objects.equals(this.thirdPartyFlag, pendingOrder.thirdPartyFlag);
	}

	@Override
	public int hashCode() {
		return Objects.hash(completionDate, typeCode, thirdPartyFlag);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PendingOrder {\n");

		sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    thirdPartyFlag: ").append(toIndentedString(thirdPartyFlag)).append("\n");
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
