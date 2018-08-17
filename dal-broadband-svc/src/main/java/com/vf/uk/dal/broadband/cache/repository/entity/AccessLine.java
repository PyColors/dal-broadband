package com.vf.uk.dal.broadband.cache.repository.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * The Class AccessLine.
 */
@Data
public class AccessLine implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7888301576209391612L;

	/** The Constant ID. */
	private static final String ID = "id";

	/** The Constant CHANNELID. */
	private static final String CHANNEL_ID = "channelId";

	/** The id. */
	@JsonProperty(ID)
	private String id;

	/** The channel id. */
	@JsonProperty(CHANNEL_ID)
	private String channelId;

}
