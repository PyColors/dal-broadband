package com.vf.uk.dal.broadband.common.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vf.uk.dal.broadband.entity.BundleDetails;
import com.vf.uk.dal.broadband.utils.Constants;
import com.vf.uk.dal.common.registry.client.Utility;
import com.vodafone.solrmodels.ProductModel;

public class CommonMethods {
	
	public static Map<String, String> getQueryParamsMapForCoupleBundleListForFLB(String... arguments) {
		Map<String, String> queryparams = new HashMap<String, String>();
		if (arguments == null)
			return queryparams;
		queryparams.put(Constants.USER_TYPE, arguments[0]);
		queryparams.put(Constants.BUNDLE_CLASS, arguments[1]);
		queryparams.put(Constants.BUNDLE_ID, arguments[2]);
		queryparams.put(Constants.DEVICE_ID, arguments[3]);
		queryparams.put(Constants.SORT, arguments[4]);
		queryparams.put(Constants.JOURNEY_TYPE, arguments[5]);
		queryparams.put(Constants.OFFER_CODE, arguments[6]);
		queryparams.put(Constants.CUSTOMER_IDENTIFICATIONNUMBER, arguments[7]);
		queryparams.put(Constants.CUSTOMERPARTYID, arguments[8]);
		queryparams.put(Constants.SKIP_CHORDIANT, arguments[9]);
		queryparams.put(Constants.CREDIT_LIMIT, arguments[10]);
		queryparams.put(Constants.CLASSIFICATION_CODE, arguments[11]);
		queryparams.put(Constants.DURATION, arguments[12]);
		return queryparams;
	}
	
	public static BundleDetails getFlbList() {

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			mapper.enable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			String jsonString = new String(Utility.readFile("\\rest-mock\\FlbList.json"));
			BundleDetails obj = mapper.readValue(jsonString, BundleDetails.class);

			return mapper.convertValue(obj, new TypeReference<BundleDetails>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<ProductModel> getProductModelsListFromDeviceIdList() {

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			// mapper = new
			// ObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
			// true);
			String productModel = new String(Utility.readFile("\\rest-mock\\SOLR_ProductModelList_Flbb.json"));
			ProductModel[] productModelList = mapper.readValue(productModel, ProductModel[].class);

			return mapper.convertValue(productModelList, new TypeReference<List<ProductModel>>() {
			});
		} catch (JsonParseException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

}
