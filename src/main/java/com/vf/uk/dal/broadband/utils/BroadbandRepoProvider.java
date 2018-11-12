package com.vf.uk.dal.broadband.utils;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.cache.repo.IBroadbandRepository;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;

/**
 * The Class BroadbandRepoProvider.
 */
@Component("broadbandRepoProvider")
public class BroadbandRepoProvider {

	/** The broadband repository. */
	@Autowired
	@Qualifier(value = "broadbandRepository")
	private IBroadbandRepository broadbandRepository;

	/**
	 * Save broadband in cache.
	 *
	 * @param broadBand the broad band
	 */
	public void saveBroadbandInCache(Broadband broadBand) {
		broadbandRepository.save(broadBand);
		
	}

	/**
	 * Gets the broadband from cache.
	 *
	 * @param broadBandSessionId the broad band session id
	 * @return the broadband from cache
	 */
	public Broadband getBroadbandFromCache(String broadBandSessionId) {
		
		Optional<Broadband> optionalBroadbandJourney = broadbandRepository.findById(broadBandSessionId);
		return optionalBroadbandJourney.isPresent() ? optionalBroadbandJourney.get() : null;
	}
	
	
	
	
	
	
}
