package com.vf.uk.dal.broadband;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import com.vf.uk.dal.common.annotation.Service;

/**
 * The BroadBand Application, will start the service as spring boot application
 */
@Service
public class BroadbandApplication {

	/**
	 * Static main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BroadbandApplication.class, args);
	}

	/**
	 * Dozer bean mapper
	 * 
	 * @return
	 */
	@Bean
	public DozerBeanMapper dozerBean() {
		List<String> mappingFiles = Arrays.asList("dozer-config-mapping.xml");
		DozerBeanMapper dozerBean = new DozerBeanMapper();
		dozerBean.setMappingFiles(mappingFiles);
		return dozerBean;
	}
}