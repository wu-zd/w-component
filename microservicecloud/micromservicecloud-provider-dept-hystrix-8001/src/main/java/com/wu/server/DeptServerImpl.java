package com.xz.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xz.mapper.DeptMapper;
import com.xz.pojo.Dept;

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
