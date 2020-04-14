package com.wu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //Eureka server服务端的启动类，接受其它的微服务进行注册。
public class EurekaServer7002_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_App.class, args);
	}

}
