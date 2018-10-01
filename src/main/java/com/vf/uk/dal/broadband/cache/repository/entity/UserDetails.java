package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserDetails implements Serializable {

	private static final long serialVersionUID = 4680180135707943306L;
	
	@JsonProperty("paymentType")
	private String paymentType;

}
