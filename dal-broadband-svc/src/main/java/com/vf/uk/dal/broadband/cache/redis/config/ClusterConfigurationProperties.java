package com.vf.uk.dal.broadband.cache.redis.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * The Class ClusterConfigurationProperties.
 */
@Component
@ConfigurationProperties(prefix = "spring.redis.cluster")
public class ClusterConfigurationProperties {

	/** The nodes. */
	/*
	 * spring.redis.cluster.nodes[0] = 127.0.0.1:7379
	 * spring.redis.cluster.nodes[1] = 127.0.0.1:7380 ...
	 */
	List<String> nodes;
	
	/** The enabled. */
	boolean enabled;

	/** The max redirects. */
	Integer maxRedirects;

	/**
	 * Gets the max redirects.
	 *
	 * @return the max redirects
	 */
	public Integer getMaxRedirects() {
		return maxRedirects;
	}

	/**
	 * Sets the max redirects.
	 *
	 * @param maxRedirects the new max redirects
	 */
	public void setMaxRedirects(Integer maxRedirects) {
		this.maxRedirects = maxRedirects;
	}

	/**
	 * Get initial collection of known cluster nodes in format
	 * {@code host:port}.
	 *
	 * @return the nodes
	 */
	public List<String> getNodes() {
		return nodes;
	}

	/**
	 * Sets the nodes.
	 *
	 * @param nodes the new nodes
	 */
	public void setNodes(List<String> nodes) {
		this.nodes = nodes;
	}

	/**
	 * Checks if is enabled.
	 *
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled.
	 *
	 * @param enabled the new enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
