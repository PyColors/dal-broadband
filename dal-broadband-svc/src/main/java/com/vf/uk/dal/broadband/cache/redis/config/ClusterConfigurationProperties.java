package com.vf.uk.dal.broadband.cache.redis.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.redis.cluster")
public class ClusterConfigurationProperties {

	/*
	 * spring.redis.cluster.nodes[0] = 127.0.0.1:7379
	 * spring.redis.cluster.nodes[1] = 127.0.0.1:7380 ...
	 */
	List<String> nodes;
	
	boolean enabled;

	Integer maxRedirects;

	public Integer getMaxRedirects() {
		return maxRedirects;
	}

	public void setMaxRedirects(Integer maxRedirects) {
		this.maxRedirects = maxRedirects;
	}

	/**
	 * Get initial collection of known cluster nodes in format
	 * {@code host:port}.
	 *
	 * @return
	 */
	public List<String> getNodes() {
		return nodes;
	}

	public void setNodes(List<String> nodes) {
		this.nodes = nodes;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
