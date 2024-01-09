package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InvestorMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestorMsApplication.class, args);
		System.out.println("Investor microservices is up and running on eureka server....");
	}

}
