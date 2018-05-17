package com.yash.questionanswersimulation.service;

import com.yash.questionanswersimulation.model.User;

public interface UserService {

	public boolean addUser(User user);
	public boolean authenticateUser(String email, String password);
}
