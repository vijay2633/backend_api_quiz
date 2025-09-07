package com.vijuu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijuu.entity.Question;
import com.vijuu.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	
	@GetMapping("/allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions(){
		List<Question> allQuestions = service.getAllQuestions();
		return new ResponseEntity<List<Question>>(allQuestions,HttpStatus.OK);
	}
	

}
