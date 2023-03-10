/*******
* Copyright (C) 2023 Claims Application-Miracle Software Systems Inc
* All Rights Reserved.
*******/
package com.miracle.customer.micrometer;

import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class MicrometerConfiguration {
	@Bean
	MeterRegistryCustomizer<?> meterRegistryCustomizer(MeterRegistry meterRegistry) {
		return meterRegistry1 -> {
			meterRegistry.config()
			.commonTags("application", "Claims-micrometer");
		};
	}
}
