/*package com.vf.uk.dal.broadband.utils;

import org.apache.commons.lang3.StringUtils;

*//**
 * @author Infosys Limited
 *
 *//*
public class CommonUtility {

	private CommonUtility() {

	}

	*//**
	 * Gets the bundle details from get bundle list API.
	 *
	 * @param bundleClass
	 *            the bundle class
	 * @param userType
	 *            the user type
	 * @param sortCriteria
	 *            the sort criteria
	 * @param journeyType
	 *            the journey type
	 * @param creditLimit
	 *            the credit limit
	 * @param offerCode
	 *            the offer code
	 * @param customerIdentificationNumber
	 *            the customer identification number
	 * @param skipChordiant
	 *            the skip chordiant
	 * @param registryClient
	 *            the registry client
	 * @return the bundle details from get bundle list API
	 *//*
	public static String getRequestUrlForFlbb(String bundleClass, String userType, String journeyType, String offerCode,
			String classificationCode, String duration) {
		// RestTemplate restTemplate = registryClient.getRestTemplate();
		// BundleDetails client = null;
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append("http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=" + bundleClass);

		if (userType != null) {
			urlBuilder.append("&userType=" + userType);
		}
		if (StringUtils.isNotBlank(journeyType)) {
			urlBuilder.append("&journeyType=" + journeyType);
		}
		if (StringUtils.isNotBlank(offerCode)) {
			urlBuilder.append("&offerCode=" + offerCode);
		}
		if (StringUtils.isNotBlank(classificationCode)) {
			urlBuilder.append("&classificationCode=" + classificationCode);
		}
		if (StringUtils.isNotBlank(duration)) {
			urlBuilder.append("&duration=" + duration);
		}
		return urlBuilder.toString();
	}

}
*/