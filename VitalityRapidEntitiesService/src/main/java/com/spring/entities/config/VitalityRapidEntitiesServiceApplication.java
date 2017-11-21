package com.spring.entities.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.entities")
@EnableEurekaClient
public class VitalityRapidEntitiesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VitalityRapidEntitiesServiceApplication.class, args);
	}
}
