package com.vijuu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vijuu.entity.Question;

@Service
public interface QuestionService {
	
	public List<Question> getAllQuestions();

}
