package com.wu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard  //开启Dashboard实时监控
public class DeshBoard_9001_App {
	public static void main(String[] args) {
		SpringApplication.run(DeshBoard_9001_App.class, args);
	}
}
