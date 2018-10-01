package com.vf.uk.dal.broadband.cache.redis.config;

import java.util.Collections;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.convert.KeyspaceConfiguration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lambdaworks.redis.resource.ClientResources;
import com.lambdaworks.redis.resource.DefaultClientResources;
import com.lambdaworks.redis.resource.DnsResolvers;
import com.vf.uk.dal.broadband.cache.redis.config.RedisCacheConfiguration.BroadbandKeyspaceConfiguration;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;

/**
 * The Class RedisCacheConfiguration.
 */
@Configuration
@EnableRedisRepositories(basePackages = "com.vf.uk.dal.journey", keyspaceConfiguration = BroadbandKeyspaceConfiguration.class)
public class RedisCacheConfiguration {

	/** The cluster properties. */
	@Autowired
	ClusterConfigurationProperties clusterProperties;

	/** The redis cache properties. */
	@Autowired
	RedisCacheProperties redisCacheProperties;

	/**
	 * Client resources.
	 *
	 * @return the client resources
	 */
	@Bean(destroyMethod = "shutdown")
	public ClientResources clientResources() {
		// ClientResources res = DefaultClientResources.create();
		ClientResources res = (ClientResources) DefaultClientResources.builder().ioThreadPoolSize(3)
				.computationThreadPoolSize(3).dnsResolver(DnsResolvers.JVM_DEFAULT).build();
		return res;
	}

	/**
	 * Redis connection factory.
	 *
	 * @return the redis connection factory
	 */
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		
		LettuceConnectionFactory connectionFactory = null;
		if (clusterProperties.isEnabled() && CollectionUtils.isNotEmpty(clusterProperties.getNodes())) {
			RedisClusterConfiguration clusterConfig = new RedisClusterConfiguration();
			clusterProperties.getNodes().forEach(a -> {
				String[] nodeDetails = a.split(":");
				RedisNode redisNode = new RedisNode(nodeDetails[0], Integer.valueOf(nodeDetails[1]));
				clusterConfig.addClusterNode(redisNode);
			});
			clusterConfig.setMaxRedirects(clusterProperties.getMaxRedirects());
			connectionFactory= new LettuceConnectionFactory(clusterConfig);
		}else {
			connectionFactory= new LettuceConnectionFactory(redisCacheProperties.getHost(),
					redisCacheProperties.getPort());
		}
		
		connectionFactory.setPassword(redisCacheProperties.getPassword());
		connectionFactory.setTimeout(redisCacheProperties.getTimeout());
		connectionFactory.setUseSsl(redisCacheProperties.getSsl());

		connectionFactory.setClientResources(clientResources());

		connectionFactory.afterPropertiesSet();
		return connectionFactory;
	}

	/**
	 * Object mapper.
	 *
	 * @return the object mapper
	 */
	@Bean
	public ObjectMapper objectMapper() {
		return Jackson2ObjectMapperBuilder.json().featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) // ISODate
				.build();
	}

	/**
	 * Redis template.
	 *
	 * @return the redis template
	 */
	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		final RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer(objectMapper()));
		// redisTemplate.setHashValueSerializer(new
		// GenericJackson2JsonRedisSerializer(objectMapper()));
		redisTemplate.afterPropertiesSet();

		return redisTemplate;
	}

	/**
	 * The Class BroadbandKeyspaceConfiguration.
	 */
	public class BroadbandKeyspaceConfiguration extends KeyspaceConfiguration {

		/* (non-Javadoc)
		 * @see org.springframework.data.redis.core.convert.KeyspaceConfiguration#initialConfiguration()
		 */
		@Override
		protected Iterable<KeyspaceSettings> initialConfiguration() {
			KeyspaceSettings journeyCacheKeySpaceSettings = new KeyspaceSettings(Broadband.class,
					Broadband.class.getName());
			journeyCacheKeySpaceSettings.setTimeToLive(redisCacheProperties.getTtl());
			return Collections.singleton(journeyCacheKeySpaceSettings);
		}
	}

}
