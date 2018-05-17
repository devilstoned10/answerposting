package com.yash.questionanswersimulation.dao;

import java.util.List;

import com.yash.questionanswersimulation.model.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	
	public List<User> listUsers();

}
