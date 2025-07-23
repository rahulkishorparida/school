package com.sc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sc.demo.model.School;
import com.sc.demo.service.SchoolSercice;
@RestController
public class SchoolController {
	@Autowired
	private SchoolSercice sercice;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	  @PostMapping
	    public String saveSchool(@RequestBody School school) {
		  boolean saveschool = sercice.saveschool(school);
	        return saveschool ? "School saved successfully" : "Failed to save school";
	    }

}
