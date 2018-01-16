package com.vf.uk.dal.broadband.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.helper.SolrHelper;
import com.vodafone.solrmodels.ProductModel;

@Component("broadbandRepoProvider")
public class BroadbandRepoProvider {

	
	public SolrHelper getSolrHelper(){
		return new SolrHelper();
	}
	
	
	public List<ProductModel> getProductModelList(SolrHelper solrHelper, List<String> productIdList){
		return solrHelper.productModelList(productIdList);
	}
	
	
}
