package com.yash.questionanswersimulation.service;

import java.util.List;

import com.yash.questionanswersimulation.model.Question;

public interface QuestionService {

	public void addQuestion(Question question);
	
	public List<Question> listQuestions();
}
