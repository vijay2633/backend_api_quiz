package com.vijuu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vijuu.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{
	
	public List<Question> findByCategory(String category);

	@Query(value="select * from question q where q.category=?1 order by rand() limit ?2", nativeQuery =  true)
	public List<Question> findRandomQuestionsByCategory(String category, Integer numQ);
	
//	@Query(value = "SELECT * FROM question q WHERE q.category = ?1 ORDER BY RAND() LIMIT ?2", nativeQuery = true)
}
	


