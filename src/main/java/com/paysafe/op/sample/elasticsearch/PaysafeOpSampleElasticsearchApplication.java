package com.paysafe.op.sample.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@EnableEurekaClient

@SpringBootApplication
public class PaysafeOpSampleElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaysafeOpSampleElasticsearchApplication.class, args);
	}
}
