package com.tushar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tushar.dao.UserDao;
import com.tushar.service.UserService;

@Controller
public class Mycontroller {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/indexpage")
	public String indexpage(Model m) {

		return "index";
	}
	@RequestMapping(value = "/")
	public String getuserTest(Model m) {
//		UserDaoImpl userDaoImpl= new UserDaoImpl();
//		List<Loginuser> list= userDaoImpl.getuserTest();

		return "index";
	}

}
