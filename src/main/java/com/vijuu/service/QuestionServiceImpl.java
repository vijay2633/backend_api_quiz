package com.vijuu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijuu.entity.Question;
import com.vijuu.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository quesRepo;

	@Override
	public List<Question> getAllQuestions() {
		List<Question> findAll = quesRepo.findAll();
		return findAll;
	}

	@Override
	public List<Question> getQuestionByCategory(String category) {
		List<Question> findByCategory = quesRepo.findByCategory(category);
		return findByCategory;
	}

}
