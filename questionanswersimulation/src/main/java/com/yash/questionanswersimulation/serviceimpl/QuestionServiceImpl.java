package com.yash.questionanswersimulation.serviceimpl;

import java.util.List;

import com.yash.questionanswersimulation.dao.QuestionDAO;
import com.yash.questionanswersimulation.daoimpl.QuestionDAOImpl;
import com.yash.questionanswersimulation.model.Question;
import com.yash.questionanswersimulation.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

	QuestionDAO questionDAO;
	public QuestionServiceImpl() {
		questionDAO=new QuestionDAOImpl();
	}
	public void addQuestion(Question question) {
		questionDAO.addQuestion(question);

	}

	public List<Question> listQuestions() {
		
		return questionDAO.listQuestions();
	}

}
