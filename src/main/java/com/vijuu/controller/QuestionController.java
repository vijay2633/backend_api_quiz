package com.vijuu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijuu.dto.QuestionDTO;
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
	
	@GetMapping("/category/{category}")
	public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable ("category")String category){
		List<Question> allQuestions = service.getQuestionByCategory(category);
		return new ResponseEntity<List<Question>>(allQuestions,HttpStatus.OK);
	}
	
	@PostMapping("/addQuestion")
	public ResponseEntity<String> addQuestion(@RequestBody QuestionDTO dto){
		String addQuestion = service.addQuestion(dto);
		// added this line in UI
		return new ResponseEntity<String>(addQuestion, HttpStatus.CREATED);
	}
	// 654465516166

}
