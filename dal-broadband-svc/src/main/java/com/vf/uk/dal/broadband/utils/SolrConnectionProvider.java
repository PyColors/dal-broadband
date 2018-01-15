package com.vf.uk.dal.broadband.utils;

import java.io.IOException;

import com.vf.uk.dal.common.configuration.ConfigHelper;
import com.vf.uk.dal.common.exception.ApplicationException;
import com.vf.uk.dal.common.logger.LogHelper;
import com.vodafone.business.service.RequestManager;
import com.vodafone.business.service.RequestManagerFactory;

/**
 * Solr connection and closing details.
 */
public class SolrConnectionProvider {
	
	/**
	 * Instantiates a new solr connection provider.
	 */
	private SolrConnectionProvider(){}
	
	/** The request manager factory. */
	private static RequestManagerFactory requestManagerFactory = null;
	
	/** The request manager. */
	private static RequestManager requestManager = null;

	/**
	 * Gets the solr connection.
	 *
	 * @return the solr connection
	 */
	public static RequestManager getSolrConnection() {
		requestManagerFactory = new RequestManagerFactory();
		if (requestManager == null) {
			LogHelper.info(SolrConnectionProvider.class, "Solr Connection IP :: "+ConfigHelper
					.getString(Constants.CONFIG_SOLR_CONNECTION_STRING, Constants.CONFIG_SOLR_CONNECTION_STRING));
			requestManager = requestManagerFactory.getRequestManager(ConfigHelper
			.getString(Constants.CONFIG_SOLR_CONNECTION_STRING, Constants.DEFAULT_SOLR_CONNECTION_STRING));
		}
		return requestManager;
	}
	
	/**
	 * closing solr connection.
	 */
	public static void closeSolrConnection() {
		try {
			requestManager = null;
			requestManagerFactory.close();
		} catch (IOException e) {
			LogHelper.error(SolrConnectionProvider.class, "Exception occured while closing solr connection"+e);
			throw new ApplicationException(ExceptionMessages.SOLR_CONNECTION_CLOSE_EXCEPTION);
		}
	}

}
