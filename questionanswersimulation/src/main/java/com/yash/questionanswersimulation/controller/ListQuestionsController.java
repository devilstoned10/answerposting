package com.yash.questionanswersimulation.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.questionanswersimulation.service.QuestionService;
import com.yash.questionanswersimulation.serviceimpl.QuestionServiceImpl;


public class ListQuestionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	QuestionService questionService;
	public void init(ServletConfig config) throws ServletException {
		questionService=new QuestionServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("questionList", questionService.listQuestions());
		request.getRequestDispatcher("./listQuestions.jsp").forward(request, response);
	}

}
