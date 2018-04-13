package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CreateBasketRequest
 */
public class CreateBasketRequest {
	private String affiliateId = null;

	private boolean affiliateFlag;

	private String source = null;

	private Journey journey = null;

	private String customerRequestedDate = null;

	private String returnURL = null;

	private List<AddPackage> packages = null;

	private String ttl = null;

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	/**
	 * 
	 * @param affiliateId
	 * @return
	 */
	public CreateBasketRequest affiliateId(String affiliateId) {
		this.affiliateId = affiliateId;
		return this;
	}

	/**
	 * Id of affiliate from which the basket creation was invoked
	 * 
	 * @return affiliateId
	 **/
	public String getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(String affiliateId) {
		this.affiliateId = affiliateId;
	}

	/**
	 * 
	 * @param source
	 * @return
	 */
	public CreateBasketRequest source(String source) {
		this.source = source;
		return this;
	}

	/**
	 * Source system identifier (OnlineShop, MobileShop etc)
	 * 
	 * @return source
	 **/
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 
	 * @param journey
	 * @return
	 */
	public CreateBasketRequest journey(Journey journey) {
		this.journey = journey;
		return this;
	}

	/**
	 * Get journey
	 * 
	 * @return journey
	 **/
	public Journey getJourney() {
		return journey;
	}

	public void setJourney(Journey journey) {
		this.journey = journey;
	}

	/**
	 * 
	 * @param customerRequestedDate
	 * @return
	 */
	public CreateBasketRequest customerRequestedDate(String customerRequestedDate) {
		this.customerRequestedDate = customerRequestedDate;
		return this;
	}

	/**
	 * Service request date specified by the customer
	 * 
	 * @return customerRequestedDate
	 **/
	public String getCustomerRequestedDate() {
		return customerRequestedDate;
	}

	/**
	 * 
	 * @param customerRequestedDate
	 */
	public void setCustomerRequestedDate(String customerRequestedDate) {
		this.customerRequestedDate = customerRequestedDate;
	}

	/**
	 * 
	 * @param returnURL
	 * @return
	 */
	public CreateBasketRequest returnURL(String returnURL) {
		this.returnURL = returnURL;
		return this;
	}

	/**
	 * WCS URL to be used by checkout to redirect back
	 * 
	 * @return returnURL
	 **/
	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	/**
	 * 
	 * @param packages
	 * @return
	 */
	public CreateBasketRequest packages(List<AddPackage> packages) {
		this.packages = packages;
		return this;
	}

	/**
	 * 
	 * @param packagesItem
	 * @return
	 */
	public CreateBasketRequest addPackagesItem(AddPackage packagesItem) {
		if (this.packages == null) {
			this.packages = new ArrayList<>();
		}
		this.packages.add(packagesItem);
		return this;
	}

	/**
	 * Get packages
	 * 
	 * @return packages
	 **/
	public List<AddPackage> getPackages() {
		return packages;
	}

	public void setPackages(List<AddPackage> packages) {
		this.packages = packages;
	}

	public CreateBasketRequest affiliateFlag(boolean affiliateFlag) {
		this.affiliateFlag = affiliateFlag;
		return this;
	}

	public boolean isAffiliateFlag() {
		return affiliateFlag;
	}

	public void setAffiliateFlag(boolean affiliateFlag) {
		this.affiliateFlag = affiliateFlag;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateBasketRequest createBasketRequest = (CreateBasketRequest) o;
		return Objects.equals(this.affiliateId, createBasketRequest.affiliateId)
				&& Objects.equals(this.affiliateFlag, createBasketRequest.affiliateFlag)
				&& Objects.equals(this.source, createBasketRequest.source)
				&& Objects.equals(this.journey, createBasketRequest.journey)
				&& Objects.equals(this.customerRequestedDate, createBasketRequest.customerRequestedDate)
				&& Objects.equals(this.returnURL, createBasketRequest.returnURL)
				&& Objects.equals(this.packages, createBasketRequest.packages);
	}

	@Override
	public int hashCode() {
		return Objects.hash(affiliateId, affiliateFlag, source, journey, customerRequestedDate, returnURL, packages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateBasketRequest {\n");

		sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
		sb.append("    source: ").append(toIndentedString(source)).append("\n");
		sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
		sb.append("    customerRequestedDate: ").append(toIndentedString(customerRequestedDate)).append("\n");
		sb.append("    returnURL: ").append(toIndentedString(returnURL)).append("\n");
		sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
