package com.vijuu.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vijuu.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	Logger logger = LoggerFactory.getLogger(QuizController.class);
	
	@Autowired
	private QuizService quizService;

	@PostMapping("createQuiz")
	public ResponseEntity<String> createQuiz(@RequestParam ("category") String category,@RequestParam("numQ") Integer numQ, @RequestParam ("title") String title){
		logger.info("inside createQuiz");
		String createQuiz = quizService.createQuiz(category, numQ, title);
		return new ResponseEntity<>(createQuiz, HttpStatus.CREATED);
	}
	
	@GetMapping("/getMsg")
	public String getMsg() {
		return "sdgsgsgasd";
	}


}
