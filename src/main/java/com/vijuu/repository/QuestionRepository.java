package com.vijuu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijuu.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{
	
	public List<Question> findByCategory(String category);
	

}
