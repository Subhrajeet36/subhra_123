package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String getValue()
	{
		return "Get root url";
	}
	
	
	@GetMapping("/new")
	public String getValue2()
	{
		return "Get new root url";
	}
	
	
}
