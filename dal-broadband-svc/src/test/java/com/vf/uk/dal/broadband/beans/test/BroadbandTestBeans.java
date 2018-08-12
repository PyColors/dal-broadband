package com.vf.uk.dal.broadband.beans.test;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
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
	
	
	@Bean
	public DozerBeanMapper getDozerBeanMapper() {

		List<String> mappingFiles = Arrays.asList("dozer-config-mapping.xml");
		DozerBeanMapper dozerBean = new DozerBeanMapper();
		dozerBean.setMappingFiles(mappingFiles);
		return dozerBean;
	}
	
	/*@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		return new RedisTemplate<String, Object>();
	}
	
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory();
	}*/
	
	/*@Bean
	public  RestTemplateConfiguration config() {
		return new  RestTemplateConfiguration();
	}
	
	@Bean
	public  AsyncRestTemplateConfiguration asynConfig() {
		return new  AsyncRestTemplateConfiguration();
	}*/
}
