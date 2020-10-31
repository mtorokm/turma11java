package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")

public class HelloControlle2 {

	
	@GetMapping
	public String hello2() {
		return "Meus objetivos de aprendizagem?\n Simplemente estudar o fim de semana inteiro para eu entender o máximo possivel de API Rest, de Spring e do STS ";
	}
	
	
}
