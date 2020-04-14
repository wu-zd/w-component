package com.wu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wu.mapper.UsersMapper;
import com.wu.pojo.Users;

@Service
@Transactional  //事务控制注解
public class UsersServiceimpl implements UsersService {
		@Autowired
		UsersMapper mapper;

	    @Cacheable(value = "usersCache")
		@Override
		public List<Users> selectAll() {
			return mapper.selectAll();
		}

		@Override
		public int addUsers(Users users) {
			return mapper.addUsers(users);
		}

		@Override
		public int updateUsers(Users users) {
			return mapper.updateUsers(users);
		}

		@Override
		public int delUsers(int id) {
			return mapper.delUsers(id);
		}

		@Override
		public int denglu(String username) {
			return mapper.denglu(username);
		}
		
}
