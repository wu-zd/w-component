package com.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wu.pojo.Dept;

@RestController
public class DeptController_consumer {
	//private static final String REST_URL_PRIFIX="http://localhost:8001";
	//修改成根据名称去访问 部门微服务名称：microservicecloud-dept
	private static final String REST_URL_PRIFIX="http://microservicecloud-dept";
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/consumer/dept/list")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PRIFIX+"/dept/list",List.class);
	}
	
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable int id){
		return restTemplate.postForObject(REST_URL_PRIFIX+"/dept/list",id,Dept.class);
	}
	
	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept d){
		return restTemplate.postForObject(REST_URL_PRIFIX+"/dept/add",d,Boolean.class);
	}
}
