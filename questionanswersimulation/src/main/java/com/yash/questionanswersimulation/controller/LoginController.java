package com.yash.questionanswersimulation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.questionanswersimulation.service.UserService;
import com.yash.questionanswersimulation.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService;
	
	public void init(ServletConfig config) throws ServletException {
		userService=new UserServiceImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");		
		boolean result=userService.authenticateUser(email, password);
		if(result) {
			HttpSession session= request.getSession();
			session.setAttribute("email", email);
			RequestDispatcher dispatch=request.getRequestDispatcher("dashboard.jsp");
			dispatch.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("home.jsp");
			dispatch.forward(request, response);
		}
		
	}

}
