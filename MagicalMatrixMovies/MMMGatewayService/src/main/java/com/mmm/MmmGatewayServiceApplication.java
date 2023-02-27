package com.mmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MmmGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmmGatewayServiceApplication.class, args);
	}

}
