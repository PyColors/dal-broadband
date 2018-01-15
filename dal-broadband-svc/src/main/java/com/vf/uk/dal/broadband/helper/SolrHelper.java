package com.vf.uk.dal.broadband.helper;

import java.util.List;

import com.vodafone.business.service.RequestManager;
import com.vodafone.solrmodels.ProductModel;

public class SolrHelper {

	private RequestManager requestManager;

	
	public List<ProductModel> productModelList(List<String> productIdList) {
		return requestManager.getProductModel(productIdList);
		
	}
	
   
	
	
}
