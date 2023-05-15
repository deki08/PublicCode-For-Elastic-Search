package com.elasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checking {
	
	@GetMapping("/docheck")
	public String checking()
	{
		System.out.println("gg");
		return "Checking is working or not";
	}

}
