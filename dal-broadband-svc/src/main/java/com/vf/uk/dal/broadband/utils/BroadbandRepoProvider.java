package com.vf.uk.dal.broadband.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.helper.SolrHelper;
import com.vodafone.solrmodels.ProductModel;

/**
 * @author Infosys Limited
 *
 */
@Component("broadbandRepoProvider")
public class BroadbandRepoProvider {

	/**
	 * 
	 * @return SolrHelper
	 */
	
	public SolrHelper getSolrHelper(){
		return new SolrHelper();
	}
	
	/**
	 * 
	 * @param solrHelper
	 * @param productIdList
	 * @return List
	 */
	
	public List<ProductModel> getProductModelList(SolrHelper solrHelper, List<String> productIdList){
		return solrHelper.productModelList(productIdList);
	}


	/**
	 * 
	 * @param solrHelper
	 * @param productClassList
	 * @param productNameList
	 * @return List
	 */
	
	public List<ProductModel> getEngineeringVisitProduct(SolrHelper solrHelper, List<String> productClassList,
			List<String> productNameList) {
		return solrHelper.getProductModel (productClassList,productNameList);
	}
	
	
}
