package com.capstone.mmmdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MmMdiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmMdiscoveryserverApplication.class, args);
	}

}
