package com.vf.uk.dal.broadband.utils;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import com.vf.uk.dal.common.configuration.ConfigHelper;
import com.vf.uk.dal.common.logger.LogHelper;

/**
 * The CoherenceAddressProvider is responsible to handle the coherence
 * connections
 * 
 */
public class CoherenceAddressProvider implements com.tangosol.net.AddressProvider {

	private ArrayList<InetSocketAddress> addressList = null;

	private int index = 0;

	/**
	 * CoherenceAddressProvider
	 * 
	 */
	public CoherenceAddressProvider() {

		LogHelper.info(this, "Check me --> CoherenceAddressProvider() --> Entered");
		addressList = new ArrayList<>(5);
		String coherenceIP = ConfigHelper.getString(Constants.COHERENCE_IP, Constants.DEFAULT_COHERENCE_IP);
		int coherencePort = ConfigHelper.getInt(Constants.COHERENCE_PORT, Constants.DEFAULT_COHERENCE_PORT);
		addressList.add(new InetSocketAddress(coherenceIP, coherencePort));
	}

	/**
	 * Accept method is overridden method from SocketAddressProvider
	 */
	public void accept() {
		LogHelper.info(this, "Check me --> connection accepted");
	}

	
	/**
	 * reject method
	 * @param throwable 
	 */
	public void reject(Throwable throwable) {
		LogHelper.info(this, "Check me --> connection rejected --> " + throwable.getMessage());
	}

	/**
	 * getNextAddress returns InetSocketAddress which is pair of hostName and
	 * portNumber
	 */
	public InetSocketAddress getNextAddress() {
		LogHelper.info(this, "Check me --> getNextAddress() --> Entered");
		if (index >= addressList.size()) {
			index = 0;
			// IMPORTANT: null should be returned to avoid infinite loop
			return null;
		}

		InetSocketAddress addr = addressList.get(index);
		LogHelper.info(this, "Check me --> getNextAddress() --> " + addr.toString());
		index++;

		return addr;
	}
}