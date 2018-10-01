package com.vf.uk.dal.broadband.cache.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * The Class RedisCacheProperties.
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisCacheProperties {
	
	/** The host. */
	String host;
	
	/** The port. */
	int port;

	/** The password. */
	String password;

	/** The timeout. */
	Long timeout;

	/** The ssl. */
	Boolean ssl;

	/** The ttl. */
	Long ttl;

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the timeout.
	 *
	 * @return the timeout
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Sets the timeout.
	 *
	 * @param timeout the new timeout
	 */
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Gets the ssl.
	 *
	 * @return the ssl
	 */
	public Boolean getSsl() {
		return ssl;
	}

	/**
	 * Sets the ssl.
	 *
	 * @param ssl the new ssl
	 */
	public void setSsl(Boolean ssl) {
		this.ssl = ssl;
	}

	/**
	 * Gets the ttl.
	 *
	 * @return the ttl
	 */
	public Long getTtl() {
		return ttl;
	}

	/**
	 * Sets the ttl.
	 *
	 * @param ttl the new ttl
	 */
	public void setTtl(Long ttl) {
		this.ttl = ttl;
	}

	

	/**
	 * Gets the port.
	 *
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Sets the port.
	 *
	 * @param port the new port
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * Gets the host.
	 *
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Sets the host.
	 *
	 * @param host the new host
	 */
	public void setHost(String host) {
		this.host = host;
	}
}
