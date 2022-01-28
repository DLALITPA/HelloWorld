package com.dipali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello()
	{
		System.out.println("HELLO WORLD DIPALI!");
		return "HELLO WORLD DIPALI !!";
	}
}

