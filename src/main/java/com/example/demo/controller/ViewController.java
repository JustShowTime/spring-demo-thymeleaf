package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author   czq
 * @Date 2020-10-15 15:35:33    
 */
@Controller
public class ViewController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/")
	public String index1() {
		return "login";
	}
}
