package com.vf.uk.dal.broadband.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * The Class CommonUtility.
 *
 * @author Infosys Limited
 */
public class CommonUtility {

	/**
	 * Instantiates a new common utility.
	 */
	private CommonUtility() {

	}

	/**
	 * Gets the bundle details from get bundle list API.
	 *
	 * @param bundleClass            the bundle class
	 * @param userType            the user type
	 * @param journeyType            the journey type
	 * @param offerCode            the offer code
	 * @param classificationCode the classification code
	 * @param duration the duration
	 * @return the bundle details from get bundle list API
	 */
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
