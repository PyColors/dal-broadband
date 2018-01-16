package com.vf.uk.dal.broadband.utils;

import org.apache.commons.lang3.StringUtils;

import com.vf.uk.dal.common.registry.client.RegistryClient;

public class CommonUtility {
	
	/**
	 * Gets the bundle details from get bundle list API.
	 *
	 * @param bundleClass            the bundle class
	 * @param userType            the user type
	 * @param sortCriteria the sort criteria
	 * @param journeyType the journey type
	 * @param creditLimit the credit limit
	 * @param offerCode the offer code
	 * @param customerIdentificationNumber the customer identification number
	 * @param skipChordiant the skip chordiant
	 * @param registryClient            the registry client
	 * @return the bundle details from get bundle list API
	 */
	public static String getRequestUrlForFlbb(String bundleClass, String userType,
			String journeyType,String offerCode,String classificationCode,String duration) {
		//RestTemplate restTemplate = registryClient.getRestTemplate();
		//BundleDetails client = null;
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append("http://BUNDLES-V1/bundles/catalogue/bundle/?bundleClass=" + bundleClass);
		
		if (userType != null) {
			urlBuilder.append("&userType=" + userType);
		}
		if(StringUtils.isNotBlank(journeyType))
		{
			urlBuilder.append("&journeyType=" + journeyType);
		}
		if(StringUtils.isNotBlank(offerCode))
		{
			urlBuilder.append("&offerCode=" + offerCode);
		}
		if(StringUtils.isNotBlank(classificationCode))
		{
			urlBuilder.append("&classificationCode=" + classificationCode);
		}
		if(StringUtils.isNotBlank(duration))
		{
			urlBuilder.append("&duration=" + duration);
		}
		/*try{
			client = restTemplate.getForObject(urlBuilder.toString(), BundleDetails.class);
		}
		catch (HttpClientErrorException e) 
		{
		    LogHelper.error(CommonUtility.class, "" + e);
			if (e.getStatusCode().value() == 400) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);
				LogHelper.error(CommonUtility.class, "" + s);
				throw new ApplicationException(ExceptionMessages.INVALID_API_REQUEST);
			}
		}
		catch (HttpServerErrorException e) {
			LogHelper.error(CommonUtility.class, "" + e);
			if (e.getStatusCode().value() == 500) {
				String s = e.getResponseBodyAsString().split(",")[1].split(":")[1];
				s = s.substring(1, s.length() - 1);

				LogHelper.error(CommonUtility.class, "" + s);
				throw new ApplicationException(ExceptionMessages.HTTP_SERVER_EXP_ERROR);
			}
		}
		catch(Exception e){
			LogHelper.error(CommonUtility.class, "getBundleDetailsFromGetBundleListAPI API Exception---------------"+e);
			//throw new ApplicationException(e.getLocalizedMessage());
			throw new ApplicationException(ExceptionMessages.INTERNAL_API_CALL_EXP);
	}
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(client, new TypeReference<BundleDetails>() {
		});*/
		return urlBuilder.toString();
	}

}
