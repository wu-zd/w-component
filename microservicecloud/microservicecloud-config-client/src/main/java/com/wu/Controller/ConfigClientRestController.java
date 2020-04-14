package com.wu.Controller;

@RestController
public class ConfigClientRestController {
	
	@Value("${spring.application.name}")
	String applicationName;
	
	@Value("${server.port}")
	String port;
	
	@Value("${eureka.client.service-url.defaultZone}")
	String eurekaServers;
	
	
	@RequestMapping("/config")
	public String getConfig() {
		//获取项目名称，端口号，注册中心地址
		return "applicationName:"+applicationName+"  port:"+port+"  eurekaServers:"+eurekaServers;
	}
}

