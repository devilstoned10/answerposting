package com.yash.questionanswersimulation.serviceimpl;

import java.util.List;

import com.yash.questionanswersimulation.dao.UserDAO;
import com.yash.questionanswersimulation.daoimpl.UserDAOImpl;
import com.yash.questionanswersimulation.model.User;
import com.yash.questionanswersimulation.service.UserService;

public class UserServiceImpl implements UserService {

	UserDAO userDAO;
	
	public UserServiceImpl() {
		userDAO=new UserDAOImpl();
	}
	
	public boolean addUser(User user) {
		return userDAO.addUser(user);
	}

	public boolean authenticateUser(String email, String password) {
		List<User>userList=userDAO.listUsers();
		for (User user : userList) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	

}
