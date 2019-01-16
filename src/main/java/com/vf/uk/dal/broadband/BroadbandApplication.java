package com.vf.uk.dal.broadband;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The BroadBand Application, will start the service as spring boot application
 */
@SpringBootApplication
public class BroadbandApplication {

	/**
	 * Static main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BroadbandApplication.class, args);
	}

}