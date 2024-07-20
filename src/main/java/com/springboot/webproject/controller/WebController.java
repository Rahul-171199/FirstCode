	package com.springboot.webproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/name")
	public String getName() {
		return"Rahul";
	}
		
	
}
