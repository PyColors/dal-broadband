package com.vf.uk.dal.broadband.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfiguration.
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
	
	/** The version number. */
	@Value("${info.build.version}")
	private String versionNumber;
	
	/** The project name. */
	@Value("${info.build.projectName}")
	private String projectName;

	/**
	 * Generates documentation for all the services under com.vf.uk.dal.device.controller
	 *
	 * @return the docket
	 */
	@Bean
	public Docket broadbandApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.vf.uk.dal.broadband.controller")).paths(PathSelectors.any())
				.build();
	}

	/**
	 * Api info.
	 *
	 * @return the api info
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(projectName).description("Broadband API service operations")
				.version(versionNumber).build();
	}
}

