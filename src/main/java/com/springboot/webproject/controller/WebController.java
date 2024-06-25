package com.springboot.webproject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@PostMapping("/")
	public void saveWebInfo()
	{
		
		
		System.out.println("Rahul Bhau Umate");

	
		
		
	}
}
