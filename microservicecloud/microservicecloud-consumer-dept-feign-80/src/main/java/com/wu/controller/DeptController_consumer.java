package com.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController_consumer {

	//注入客户端service接口
	@Autowired
	DeptClientService service;

	@RequestMapping("/consumer/dept/list")
	public List<Dept> list(){
		return service.list();
	}
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable int id){
		return service.get(id);
	}
	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept){
		return service.add(dept);
	}

}
