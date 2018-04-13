package com.vf.uk.dal.broadband.basket.price.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PackageInRequest
 */

public class PackageInRequest {
	private String bundleId = null;

	private List<String> hardwareIds = new ArrayList<>();

	private List<String> serviceIds = new ArrayList<>();

	private List<String> voucherMPs = new ArrayList<>();

	private String packageId = null;

	private String offerCode = null;

	private String packageType = null;

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
/**
 * 
 * @param bundleId
 * @return
 */
	public PackageInRequest bundleId(String bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	/**
	 * Bundle sku id added to the basket
	 * 
	 * @return bundleId
	 **/
	public String getBundleId() {
		return bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
/**
 * 
 * @param hardwareIds
 * @return
 */
	public PackageInRequest hardwareIds(List<String> hardwareIds) {
		this.hardwareIds = hardwareIds;
		return this;
	}
/**
 * 
 * @param hardwareIdsItem
 * @return
 */
	public PackageInRequest addHardwareIdsItem(String hardwareIdsItem) {
		this.hardwareIds.add(hardwareIdsItem);
		return this;
	}

	/**
	 * List of hardware sku ids added to the basket
	 * 
	 * @return hardwareIds
	 **/
	public List<String> getHardwareIds() {
		return hardwareIds;
	}

	public void setHardwareIds(List<String> hardwareIds) {
		this.hardwareIds = hardwareIds;
	}
/**
 * 
 * @param serviceIds
 * @return
 */
	public PackageInRequest serviceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
		return this;
	}
/**
 * 
 * @param serviceIdsItem
 * @return
 */
	public PackageInRequest addServiceIdsItem(String serviceIdsItem) {
		this.serviceIds.add(serviceIdsItem);
		return this;
	}

	/**
	 * List of service sku ids added to the basket
	 * 
	 * @return serviceIds
	 **/
	public List<String> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}
/**
 * 
 * @param voucherMPs
 * @return
 */
	public PackageInRequest voucherMPs(List<String> voucherMPs) {
		this.voucherMPs = voucherMPs;
		return this;
	}
/**
 * 
 * @param voucherMPsItem
 * @return
 */
	public PackageInRequest addVoucherMPsItem(String voucherMPsItem) {
		this.voucherMPs.add(voucherMPsItem);
		return this;
	}

	/**
	 * List of MPS added to the Packages
	 * 
	 * @return voucherMPs
	 **/
	public List<String> getVoucherMPs() {
		return voucherMPs;
	}

	public void setVoucherMPs(List<String> voucherMPs) {
		this.voucherMPs = voucherMPs;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PackageInRequest packageInRequest = (PackageInRequest) o;
		return Objects.equals(this.bundleId, packageInRequest.bundleId)
				&& Objects.equals(this.hardwareIds, packageInRequest.hardwareIds)
				&& Objects.equals(this.serviceIds, packageInRequest.serviceIds)
				&& Objects.equals(this.voucherMPs, packageInRequest.voucherMPs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bundleId, hardwareIds, serviceIds, voucherMPs);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PackageInRequest {\n");

		sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
		sb.append("    hardwareIds: ").append(toIndentedString(hardwareIds)).append("\n");
		sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
		sb.append("    voucherMPs: ").append(toIndentedString(voucherMPs)).append("\n");
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
