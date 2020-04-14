package com.wu.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
	
	//创建RestTemplate对象的方法
	@Bean
	@LoadBalanced  //开启Ribbon客户端负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
