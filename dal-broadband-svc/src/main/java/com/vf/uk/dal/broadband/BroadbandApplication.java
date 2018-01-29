package com.vf.uk.dal.broadband;

import org.springframework.boot.SpringApplication;

import com.vf.uk.dal.common.annotation.Service;


/**
 * The BroadBand Application, will start the service as spring boot application
 */
@Service
public class BroadbandApplication
{
	public static void main(String[] args)
    {
        SpringApplication.run(BroadbandApplication.class, args);
    }
}