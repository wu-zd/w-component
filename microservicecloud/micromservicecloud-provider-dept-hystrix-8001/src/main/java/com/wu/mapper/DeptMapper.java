package com.wu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.xz.pojo.Dept;

@Mapper
public interface DeptMapper {

	@Select("select * from dept where id=#{id}")
	Dept selectById(int id);

	@Select("select * from dept")
	List<Dept> selectAll();

	@Insert("insert into dept(name,db_source) values(#{name}),#{db_source}")
	boolean add(Dept dept);

}
