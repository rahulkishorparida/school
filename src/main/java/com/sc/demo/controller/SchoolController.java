package com.sc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SchoolController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/")
	public String index() {
		return "home";
	}
	@GetMapping("/")
	public String hh() {
		return "home";
	}

}
