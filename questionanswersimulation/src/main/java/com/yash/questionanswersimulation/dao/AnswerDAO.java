package com.yash.questionanswersimulation.dao;

import java.util.List;

import com.yash.questionanswersimulation.model.Answer;

public interface AnswerDAO {
	
	public boolean addAnswer(Answer answer);
	
	public List<Answer> listAnswers();
}
