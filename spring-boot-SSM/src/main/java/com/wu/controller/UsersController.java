package com.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wu.pojo.Users;
import com.wu.service.UsersService;

@Controller
public class UsersController {
	@Autowired
    UsersService service;
	
	@RequestMapping("{path}")
	public String path(@PathVariable String path) {
		return path;
	}
	
	@RequestMapping("/all")
	public String getUserAll(Model model) {
		//1:获取所有的商品信息
		List<Users> list=service.selectAll();
		//2:存储到数据模型中
		model.addAttribute("list", list);
		return "index";
	}
	

	@RequestMapping("/del")
	public String delUsers(int id) {
		service.delUsers(id);
		return "redirect:/all";
	}
	

	@RequestMapping("/adduers")
	public String addUsers(Users users) {
		int num=service.addUsers(users);
		return "redirect:/all";
	}

	@RequestMapping("/updateusers")
	public String updateGoods(Users users) {
		int num=service.updateUsers(users);
		return "redirect:/all";
	}
	
	@RequestMapping("/denglu")
	public String denglu(String username) {
		int num=service.denglu(username);
		return "redirect:/all";
	}
	
}

