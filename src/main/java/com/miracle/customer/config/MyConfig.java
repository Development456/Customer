/*******
* Copyright (C) 2023 Claims Application-Miracle Software Systems Inc
* All Rights Reserved.
*******/
package com.miracle.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
