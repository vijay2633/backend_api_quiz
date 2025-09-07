package com.vijuu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijuu.dto.QuestionDTO;
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

	@Override
	public String addQuestion(QuestionDTO question) {
		
		Question ques = new Question();
		ques.setCategory(question.getCategory());
		ques.setDifficultlyLevel(question.getDifficultlyLevel());
		ques.setQuestionTitle(question.getQuestionTitle());
		ques.setRightAnswer(question.getRightAnswer());
		ques.setOption1(question.getOption1());
		ques.setOption2(question.getOption2());
		ques.setOption3(question.getOption3());
		ques.setOption4(question.getOption4());
		quesRepo.save(ques);
		return "question added successfully";
	}
	
//	dgasdgasdggsdg

}
