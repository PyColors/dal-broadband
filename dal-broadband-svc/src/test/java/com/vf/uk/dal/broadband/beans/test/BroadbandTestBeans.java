package com.vf.uk.dal.broadband.beans.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.dao.impl.BroadbandDaoImpl;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.svc.impl.BroadbandServiceImpl;

@Configuration
public class BroadbandTestBeans {

	
	@Bean
	public BroadbandController getBroadbandController(){
		return new BroadbandController();
	}
	
	
	@Bean
	public BroadbandService getBroadBandServiceImpl(){
		return new BroadbandServiceImpl();
	}
	@Bean
	public BroadbandDao getBroadbandDaoImpl(){
		return new BroadbandDaoImpl();
	}
	
}
