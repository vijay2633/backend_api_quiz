package com.vijuu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijuu.entity.Question;
import com.vijuu.entity.Quiz;
import com.vijuu.repository.QuestionRepository;
import com.vijuu.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuestionRepository questionRepo;
	
	@Autowired
	private QuizRepository quizRepo;

	@Override
	public String createQuiz(String category, Integer numQ, String title) {
		List<Question> questions = questionRepo.findRandomQuestionsByCategory(category, numQ);
		Quiz quiz = new Quiz();
		quiz.setQuestion(questions);
		quiz.setTitle(title);
// added this line sdsgkgl;dsdgf
		quizRepo.save(quiz);
		return "quiz created successfully";
		// comment from ui sgdasgsdgasdg.
	}

}
