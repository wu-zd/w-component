package com.xz.server;

import java.util.List;

import com.xz.pojo.Dept;

public interface DeptService {

	Dept selectById(int id);

	List<Dept> selectAll();

	boolean add(Dept dept);

}
