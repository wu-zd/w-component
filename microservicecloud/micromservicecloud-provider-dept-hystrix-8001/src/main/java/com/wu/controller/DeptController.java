package com.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wu.server.DeptService;

@RestController
public class DeptController {
	@Autowired
    DeptService service;
	

	@RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
	//@HystrixCommand:当标注的方法一旦出现异常就调用fallback的方法执行返回备选的结果
	@HystrixCommand(fallbackMethod ="hystrix_get")
	public Dept  get(@PathVariable int id) {
		Dept dept=service.selectById(id);
		if(dept==null) {
			throw new RuntimeException(id+":该部门不存在");
		}
		return dept;
	}
	
	//备选方法，只有当get方法出现异常时，才会调用，一般默认返回的是假记录
	public Dept hystrix_get(@PathVariable int id) {
		return new Dept(id,id+"对应的部门为null", "不来自于mysql");
	}
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list() {
		return service.selectAll();
	}
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean addDept(@RequestBody Dept dept) {
		return service.add(dept);
	}

}
