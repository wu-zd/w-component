package com.wu.server;

import java.util.List;

import com.wu.pojo.Dept;

public interface DeptService {

	Dept selectById(int id);

	List<Dept> selectAll();

	boolean add(Dept dept);

}
