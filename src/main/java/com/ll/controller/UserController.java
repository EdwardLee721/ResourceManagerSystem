package com.ll.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ll.entity.User;
import com.ll.service.UserService;

@Controller
public class UserController {
	@Resource
	UserService userService;
	@RequestMapping("/")
	public String toLogin(){
		return "login/loginPage";
	}
	@RequestMapping("/login")
	public String login(User user){
		if(userService.login(user.getUserName(), user.getPassword())){
			return "redirect:index";
		}else{
			return "login/loginPage";
		}
	}
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
}
