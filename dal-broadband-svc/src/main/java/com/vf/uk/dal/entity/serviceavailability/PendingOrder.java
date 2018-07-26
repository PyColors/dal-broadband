package com.vf.uk.dal.entity.serviceavailability;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PendingOrder.
 */

public class PendingOrder {
	
	/** The completion date. */
	@JsonProperty("completionDate")
	private String completionDate = null;

	/** The type code. */
	@JsonProperty("typeCode")
	private String typeCode = null;

	/** The third party flag. */
	@JsonProperty("thirdPartyFlag")
	private Boolean thirdPartyFlag = null;

	/**
	 * Completion date.
	 *
	 * @param completionDate the completion date
	 * @return the pending order
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

	/**
	 * Sets the completion date.
	 *
	 * @param completionDate the new completion date
	 */
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	/**
	 * Type code.
	 *
	 * @param typeCode the type code
	 * @return the pending order
	 */
	public PendingOrder typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * The type of pending order.
	 *
	 * @return typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 *
	 * @param typeCode the new type code
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Third party flag.
	 *
	 * @param thirdPartyFlag the third party flag
	 * @return the pending order
	 */
	public PendingOrder thirdPartyFlag(Boolean thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
		return this;
	}

	/**
	 * Specifies if the pending order on the line is by a third party (a party
	 * other than the line owner Communications Provider).
	 *
	 * @return thirdPartyFlag
	 */
	public Boolean getThirdPartyFlag() {
		return thirdPartyFlag;
	}

	/**
	 * Sets the third party flag.
	 *
	 * @param thirdPartyFlag the new third party flag
	 */
	public void setThirdPartyFlag(Boolean thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
	}

	/* (non-Javadoc)
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
		PendingOrder pendingOrder = (PendingOrder) o;
		return Objects.equals(this.completionDate, pendingOrder.completionDate)
				&& Objects.equals(this.typeCode, pendingOrder.typeCode)
				&& Objects.equals(this.thirdPartyFlag, pendingOrder.thirdPartyFlag);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(completionDate, typeCode, thirdPartyFlag);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
