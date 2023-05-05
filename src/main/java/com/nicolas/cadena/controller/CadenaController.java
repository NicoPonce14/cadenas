package com.nicolas.cadena.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadenaController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
	
	@RequestMapping("/inicio/{name}")
	public String nombre(@PathVariable("name") String name) {
		return "Hello client! How are you doing?"+name;
	}
}
