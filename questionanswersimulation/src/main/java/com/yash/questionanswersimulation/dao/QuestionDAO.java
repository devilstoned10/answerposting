package com.yash.questionanswersimulation.dao;

import java.util.List;

import com.yash.questionanswersimulation.model.Question;

public interface QuestionDAO {

	public boolean addQuestion(Question question);
	
	public List<Question> listQuestions();
}
