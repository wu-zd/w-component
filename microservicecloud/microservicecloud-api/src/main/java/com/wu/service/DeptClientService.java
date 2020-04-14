package com.wu.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wu.pojo.Dept;

@FeignClient(value = "http://microservicecloud-dept",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@RequestMapping(value="/dept/list",method = RequestMethod.GET)
	List<Dept> list();

	@RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
	Dept get(@PathVariable("id") int id);

	@RequestMapping(value="/dept/add",method = RequestMethod.POST)
	boolean add(Dept dept);
}
