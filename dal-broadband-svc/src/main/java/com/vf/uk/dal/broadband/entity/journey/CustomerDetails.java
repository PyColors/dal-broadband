package com.vf.uk.dal.broadband.entity.journey;

import java.util.Objects;

/**
 * CustomerDetails
 */
public class CustomerDetails {
	private String username = null;

	private String journeyType = null;

	private String basketId = null;

	private CreditDetails creditDetails = null;

	/**
	 * @param username
	 * @return
	 */
	public CustomerDetails username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * username of the customer
	 * 
	 * @return username
	 **/
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param journeyType
	 * @return
	 */
	public CustomerDetails journeyType(String journeyType) {
		this.journeyType = journeyType;
		return this;
	}

	/**
	 * type of the customers journey
	 * 
	 * @return journeyType
	 **/
	public String getJourneyType() {
		return journeyType;
	}

	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

	/**
	 * @param basketId
	 * @return
	 */
	public CustomerDetails basketId(String basketId) {
		this.basketId = basketId;
		return this;
	}

	/**
	 * Basket Id
	 * 
	 * @return basketId
	 **/
	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	/**
	 * @param creditDetails
	 * @return
	 */
	public CustomerDetails creditDetails(CreditDetails creditDetails) {
		this.creditDetails = creditDetails;
		return this;
	}

	/**
	 * CustomerDetails of the customer
	 * 
	 * @return creditDetails
	 **/
	public CreditDetails getCreditDetails() {
		return creditDetails;
	}

	public void setCreditDetails(CreditDetails creditDetails) {
		this.creditDetails = creditDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerDetails customerDetails = (CustomerDetails) o;
		return Objects.equals(this.username, customerDetails.username)
				&& Objects.equals(this.journeyType, customerDetails.journeyType)
				&& Objects.equals(this.basketId, customerDetails.basketId)
				&& Objects.equals(this.creditDetails, customerDetails.creditDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, journeyType, basketId, creditDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerDetails {\n");

		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
		sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
		sb.append("    creditDetails: ").append(toIndentedString(creditDetails)).append("\n");
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
