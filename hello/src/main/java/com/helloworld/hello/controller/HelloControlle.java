package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloControlle {
	
	@GetMapping
	public String hello() {
		return "Hello World,\n Eu usei as mentalidades de persistência, orientação ao futuro e atenção aos detalhes ";
		
	}
	

	
	
	
	
	
	
	
	
}
