package com.vf.uk.dal.broadband.helper;

import java.util.List;

import com.vf.uk.dal.broadband.utils.SolrConnectionProvider;
import com.vodafone.business.service.RequestManager;
import com.vodafone.solrmodels.ProductModel;

/**
 * @author Infosys Limited
 *
 */
public class SolrHelper {

	private RequestManager requestManager = null;
	
	/**
	 * 
	 * @param productIdList
	 * @return List
	 */
	
	public List<ProductModel> productModelList(List<String> productIdList) {
		
		if (requestManager == null) {
			getSolrConnection();
		}
		return requestManager.getProductModel(productIdList);
	}
	
	/**
	 * getSolrConnection
	 */
	
	public void getSolrConnection() {
		requestManager = SolrConnectionProvider.getSolrConnection();
	}

	/**
	 * 
	 * @param productClassList
	 * @param productNameList
	 * @return List<ProductModel>
	 */
	
	public List<ProductModel> getProductModel(List<String> productClassList, List<String> productNameList) {
		if (requestManager == null) {
			getSolrConnection();
		}
		return requestManager.getProductModel(productClassList,productNameList);
	}
	
}
