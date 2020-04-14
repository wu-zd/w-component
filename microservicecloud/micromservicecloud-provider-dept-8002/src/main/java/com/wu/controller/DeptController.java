package com.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wu.pojo.Dept;
import com.wu.server.DeptService;

@RestController
public class DeptController {
	@Autowired
    DeptService service;
	
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable int id) {
		return service.selectById(id);
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
