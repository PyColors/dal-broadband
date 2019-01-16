package com.vf.uk.dal.broadband.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.StringUtils;
import org.springframework.hateoas.Link;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class CommonUtility.
 *
 * @author Infosys Limited
 */
@Slf4j
public class CommonUtility {

	/**
	 * Instantiates a new common utility.
	 */
	private CommonUtility() {

	}

	/**
	 * Gets the bundle details from get bundle list API.
	 *
	 * @param bundleClass
	 *            the bundle class
	 * @param userType
	 *            the user type
	 * @param journeyType
	 *            the journey type
	 * @param offerCode
	 *            the offer code
	 * @param classificationCode
	 *            the classification code
	 * @param duration
	 *            the duration
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

	/**
	 * Gets the formatted date.
	 *
	 * @param dateInString
	 *            the date in string
	 * @param pattern
	 *            the pattern
	 * @param desiredPattern
	 *            the desired pattern
	 * @return the formatted date
	 */
	public static String getFormattedDate(String dateInString, String pattern, String desiredPattern) {
		String dateString = null;
		if (dateInString != null) {
			try {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				java.util.Date date = simpleDateFormat.parse(dateInString);
				if (desiredPattern != null) {
					SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(desiredPattern);
					dateString = simpleDateFormat1.format(date);
				}
			} catch (ParseException e) {
				log.error(dateInString + "is not in pattern " + pattern + " and desired pattern is " + desiredPattern);
			}
		}
		return dateString;
	}

	/**
	 * Format link.
	 *
	 * @param link
	 *            the link
	 * @return the link
	 */
	public static Link formatLink(Link link) {
		Link newLink = link;
		if (newLink != null && newLink.getHref().indexOf("/broadband") != -1) {
			newLink = newLink.withHref(
					newLink.getHref().substring(newLink.getHref().indexOf("/broadband"), newLink.getHref().length()));
		}
		return newLink;
	}

	public static String dataFormatforDouble(Double data) {
		String formatedData = null;
		String decimalFormat = "#0.00";
		if (data != null) {
			DecimalFormat deciFormat = new DecimalFormat(decimalFormat);
			Double tmpData = data - Math.floor(data);
			if ("0.0".equals(tmpData.toString())) {
				formatedData = String.valueOf(data.intValue());
			} else {
				formatedData = deciFormat.format(data);
			}
		}
		return formatedData;
	}

}
