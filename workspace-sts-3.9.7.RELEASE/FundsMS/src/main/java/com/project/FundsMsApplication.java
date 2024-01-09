package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FundsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundsMsApplication.class, args);
		System.out.println("Funds microservices is up and running on eureka server....");
	}

}
