package com.vf.uk.dal.broadband.cache.redis.config;

import java.time.Duration;
import java.util.Collections;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisStaticMasterReplicaConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.convert.KeyspaceConfiguration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.vf.uk.dal.broadband.cache.redis.config.RedisCacheConfiguration.BroadbandKeyspaceConfiguration;
import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;

import io.lettuce.core.resource.ClientResources;
import io.lettuce.core.resource.DefaultClientResources;
import io.lettuce.core.resource.DnsResolvers;

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
	        LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
	                .useSsl().disablePeerVerification().and().clientResources(clientResources())
	                .commandTimeout(Duration.ofSeconds(3))
	                .shutdownTimeout(Duration.ZERO)
	                .build();
	        if (clusterProperties.isEnabled() && CollectionUtils.isNotEmpty(clusterProperties.getNodes())) {
	            RedisClusterConfiguration clusterConfig = new RedisClusterConfiguration();
	            clusterProperties.getNodes().forEach(a -> {
	                String[] nodeDetails = a.split(":");
	                RedisNode redisNode = new RedisNode(nodeDetails[0], Integer.valueOf(nodeDetails[1]));
	                clusterConfig.addClusterNode(redisNode);
	            });
	            clusterConfig.setMaxRedirects(clusterProperties.getMaxRedirects());
	            connectionFactory = new LettuceConnectionFactory(clusterConfig);
	        } else {
	            RedisStaticMasterReplicaConfiguration redisStaticMasterReplicaConfiguration =
	                    new RedisStaticMasterReplicaConfiguration(redisCacheProperties.getHost(), Integer.valueOf(redisCacheProperties.getPort()));
	            redisStaticMasterReplicaConfiguration.setPassword(redisCacheProperties.getPassword());
	            connectionFactory = new LettuceConnectionFactory(redisStaticMasterReplicaConfiguration, clientConfig);
	        }
	        connectionFactory.afterPropertiesSet();
	        return connectionFactory;
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
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer(Jackson2ObjectMapperBuilder.json().featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) // ISODate
				.build()));
		
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
