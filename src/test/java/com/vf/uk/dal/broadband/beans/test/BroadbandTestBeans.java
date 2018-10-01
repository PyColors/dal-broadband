package com.vf.uk.dal.broadband.beans.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vf.uk.dal.authorization.filter.util.AuthorizationJWTUtility;
import com.vf.uk.dal.broadband.assembler.BroadbandJourneyServiceAssembler;
import com.vf.uk.dal.broadband.authorizer.BroadbandAuthorizationHelper;
import com.vf.uk.dal.broadband.controller.BroadbandController;
import com.vf.uk.dal.broadband.dao.BroadbandDao;
import com.vf.uk.dal.broadband.dao.impl.BroadbandDaoImpl;
import com.vf.uk.dal.broadband.mapper.BroadbandMapper;
import com.vf.uk.dal.broadband.svc.BroadbandService;
import com.vf.uk.dal.broadband.svc.impl.BroadbandServiceImpl;

@Configuration
public class BroadbandTestBeans {

	
	
	@Bean
	public BroadbandController getBroadbandController() {
		return new BroadbandController();
	}

	@Bean
    public AuthorizationJWTUtility getAuthorizationJWTUtility() {
        return new AuthorizationJWTUtility("src/test/resources/dal-keystore.jck", "V0d4F0n3", "jceksaes", "V0d4F0n3");

    }

	@Bean
	public BroadbandAuthorizationHelper getBroadBandAuthorizationController() {
		return new BroadbandAuthorizationHelper();
	}

	@Bean
	public BroadbandService getBroadBandServiceImpl() {
		return new BroadbandServiceImpl();
	}

	@Bean
	public BroadbandDao getBroadbandDaoImpl() {
		return new BroadbandDaoImpl();
	}

	@Bean
	public BroadbandJourneyServiceAssembler getBroadbandJourneyServiceAssembler() {
		return new BroadbandJourneyServiceAssembler();
	}

	@Bean
	  public BroadbandMapper getBroadbandMapperImpl() {
	    return new com.vf.uk.dal.broadband.mapper.BroadbandMapperImpl();
	  }
	
	
	

	/*
	 * @Bean public RedisTemplate<String, Object> redisTemplate() { return new
	 * RedisTemplate<String, Object>(); }
	 * 
	 * @Bean public RedisConnectionFactory redisConnectionFactory() { return new
	 * LettuceConnectionFactory(); }
	 */

	/*
	 * @Bean public RestTemplateConfiguration config() { return new
	 * RestTemplateConfiguration(); }
	 * 
	 * @Bean public AsyncRestTemplateConfiguration asynConfig() { return new
	 * AsyncRestTemplateConfiguration(); }
	 */
}
