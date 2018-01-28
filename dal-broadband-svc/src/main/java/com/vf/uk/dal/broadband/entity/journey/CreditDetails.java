package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * CreditDetails
 */
public class CreditDetails {
	private String priceLimit = null;

	private String remainingConnections = null;

	/**
	 * @param priceLimit
	 * @return
	 */
	public CreditDetails priceLimit(String priceLimit) {
		this.priceLimit = priceLimit;
		return this;
	}

	/**
	 * Price Limit returned from ProcessCreditVet TIL service for the customer
	 * in conditional accept scenarios.
	 * 
	 * @return priceLimit
	 **/
	public String getPriceLimit() {
		return priceLimit;
	}

	public void setPriceLimit(String priceLimit) {
		this.priceLimit = priceLimit;
	}

	/**
	 * @param remainingConnections
	 * @return
	 */
	public CreditDetails remainingConnections(String remainingConnections) {
		this.remainingConnections = remainingConnections;
		return this;
	}

	/**
	 * Remaining no. of lines of the customer. e.g., 2
	 * 
	 * @return remainingConnections
	 **/
	public String getRemainingConnections() {
		return remainingConnections;
	}

	public void setRemainingConnections(String remainingConnections) {
		this.remainingConnections = remainingConnections;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreditDetails creditDetails = (CreditDetails) o;
		return Objects.equals(this.priceLimit, creditDetails.priceLimit)
				&& Objects.equals(this.remainingConnections, creditDetails.remainingConnections);
	}

	@Override
	public int hashCode() {
		return Objects.hash(priceLimit, remainingConnections);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreditDetails {\n");

		sb.append("    priceLimit: ").append(toIndentedString(priceLimit)).append("\n");
		sb.append("    remainingConnections: ").append(toIndentedString(remainingConnections)).append("\n");
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
