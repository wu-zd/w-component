package com.wu.service;

import java.util.List;

import com.wu.pojo.Users;

public interface UsersService {
	List<Users> selectAll();
	int addUsers(Users users);
	int updateUsers(Users users);
	int delUsers(int id);
	int denglu(String username);
}

