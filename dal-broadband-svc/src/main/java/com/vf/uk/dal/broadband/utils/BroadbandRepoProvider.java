package com.vf.uk.dal.broadband.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.cache.repo.IBroadbandRepository;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;

@Component("broadbandRepoProvider")
public class BroadbandRepoProvider {

	@Autowired
	@Qualifier(value = "broadbandRepository")
	private IBroadbandRepository broadbandRepository;

	public void saveBroadbandInCache(Broadband broadBand) {
		broadbandRepository.save(broadBand);
		
	}

	public Broadband getBroadbandFromCache(String broadBandSessionId) {
		return broadbandRepository.findOne(broadBandSessionId);
	}
	
	
	
	
	
	
}
