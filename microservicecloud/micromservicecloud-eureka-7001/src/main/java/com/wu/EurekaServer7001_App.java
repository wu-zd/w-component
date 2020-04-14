package com.wu;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer  //Eureka server服务端的启动类，接受其它的微服务进行注册。
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}

}
