package com.vf.uk.dal.broadband.helper;

import java.util.List;

import com.vf.uk.dal.broadband.utils.SolrConnectionProvider;
import com.vodafone.business.service.RequestManager;
import com.vodafone.solrmodels.ProductModel;

public class SolrHelper {

	private RequestManager requestManager = null;
	public List<ProductModel> productModelList(List<String> productIdList) {
		
		if (requestManager == null) {
			getSolrConnection();
		}
		return requestManager.getProductModel(productIdList);
	}
	
	public void getSolrConnection() {
		requestManager = SolrConnectionProvider.getSolrConnection();
	}
	
}
