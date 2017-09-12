package com.yc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String index(){
		System.out.println("controller...");
		return null;
	}
	
}
