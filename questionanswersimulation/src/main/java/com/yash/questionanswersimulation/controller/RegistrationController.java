package com.yash.questionanswersimulation.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.questionanswersimulation.model.User;
import com.yash.questionanswersimulation.service.UserService;
import com.yash.questionanswersimulation.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class RegistrationController
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService userService;
	
	public void init(ServletConfig config) throws ServletException {
		userService=new UserServiceImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		boolean result=userService.addUser(user);
		if(result) {
		response.sendRedirect("home.jsp?success");
		}
		else {
			response.sendRedirect("home.jsp?err");
		}
		
	}

}
