package com.yash.questionanswersimulation.service;

import java.util.List;

import com.yash.questionanswersimulation.model.Answer;

public interface AnswerService {

	public void addAnswer(Answer answer);
	
	public List<Answer> listAnswersRespectToQuestion(int question_id);
}
