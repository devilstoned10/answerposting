package com.yash.questionanswersimulation.serviceimpl;

import java.util.List;

import com.yash.questionanswersimulation.dao.AnswerDAO;
import com.yash.questionanswersimulation.daoimpl.AnswerDAOImpl;
import com.yash.questionanswersimulation.model.Answer;
import com.yash.questionanswersimulation.service.AnswerService;

public class AnswerServiceImpl implements AnswerService {

	AnswerDAO answerDAO;
	public AnswerServiceImpl() {
		answerDAO=new AnswerDAOImpl();
	}
	public void addAnswer(Answer answer) {
		answerDAO.addAnswer(answer);

	}

	public List<Answer> listAnswersRespectToQuestion(int question_id) {
		List<Answer> listAnswersRespectToQuestion=answerDAO.listAnswers();
		for (Answer answer : listAnswersRespectToQuestion) {
			if (answer.getQuestion_id() != question_id) {
				listAnswersRespectToQuestion.remove(answer);
			}
		}
				
		return listAnswersRespectToQuestion;
	}

}
