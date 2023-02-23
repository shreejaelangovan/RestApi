package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
	private String yourFavColor="Black";
	@RequestMapping("/colorgame")
	public String getMyFav() {
		return "Your favorite color is "+yourFavColor+"!!!";
	}
}
