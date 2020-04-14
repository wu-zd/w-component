package com.wu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptPriver8001_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptPriver8001_App.class, args);
	}
}
