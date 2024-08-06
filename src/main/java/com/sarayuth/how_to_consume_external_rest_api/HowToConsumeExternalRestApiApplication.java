package com.sarayuth.how_to_consume_external_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HowToConsumeExternalRestApiApplication {

	// http://localhost:8081/api/devices

	public static void main(String[] args) {
		SpringApplication.run(HowToConsumeExternalRestApiApplication.class, args);
	}

	// Define a RestTemplate bean to be used for making HTTP calls
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
