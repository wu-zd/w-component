package com.wu.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wu.mapper.DeptMapper;
import com.wu.pojo.Dept;

@Service
@Transactional
public class DeptServerImpl implements DeptService {
    @Autowired
    DeptMapper mapper;
	
	@Override
	public Dept selectById(int id) {
		return mapper.selectById(id);
	}

	@Override
	public List<Dept> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public boolean add(Dept dept) {
		return mapper.add(dept);
	}

}
