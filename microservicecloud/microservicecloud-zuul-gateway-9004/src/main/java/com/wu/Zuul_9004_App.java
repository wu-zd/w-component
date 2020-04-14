package com.wu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //路由代理注解
public class Zuul_9004_App {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_9004_App.class,args);
	}
}
