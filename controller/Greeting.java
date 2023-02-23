package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class Greeting {
	@GetMapping("/name")
	
	public String Welcome (){
		return "Welcome String Boot!";
	}

}