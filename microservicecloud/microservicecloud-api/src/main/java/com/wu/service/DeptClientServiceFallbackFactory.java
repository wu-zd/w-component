package com.wu.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wu.pojo.Dept;

import feign.hystrix.FallbackFactory;

//FallbackFactory<DeptClientService>:代表针对DeptClientService接口的方法来进行降级处理
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			@Override
			public List<Dept> list() {
				return null;
			}
			@Override
			public Dept get(int id) {
				return new Dept(id,"null", "不来自于mysql");
			}
			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};

	}

}
