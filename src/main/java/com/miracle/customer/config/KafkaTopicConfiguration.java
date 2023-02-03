package com.miracle.customer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
	
	
	@Value("${spring.kafka.topic.name}")
	private String topicName;
	
	@Bean
    @ConfigurationProperties(prefix = "topic")
	public NewTopic topic() {
		System.out.println(topicName);
		return TopicBuilder.name(topicName)
				.build();
	}
}
