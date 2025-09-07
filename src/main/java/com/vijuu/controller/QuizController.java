package com.vijuu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
	
	
	@GetMapping("/hello")
	public String getMsg() {
		return "hey hi";
	}
	
//	gssdgasdgasdgasdsgsagasdd

}
