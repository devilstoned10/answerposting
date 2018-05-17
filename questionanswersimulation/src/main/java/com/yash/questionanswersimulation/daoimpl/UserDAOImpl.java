package com.yash.questionanswersimulation.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.questionanswersimulation.dao.UserDAO;
import com.yash.questionanswersimulation.model.User;
import com.yash.questionanswersimulation.util.DBUtil;

public class UserDAOImpl extends DBUtil implements UserDAO {

	public boolean addUser(User user) {
		String sql = "INSERT INTO users(name, email, password) VALUES (?,?,?)";
		PreparedStatement pstmt = createPreparedStatement(sql);
		try {
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {

		} finally {
			closeConnection();
		}
		return false;
	}

	public List<User> listUsers() {
		String sql = "SELECT * FROM users";
		List<User> listOfAllUsers = new ArrayList<User>();
		PreparedStatement pstmt = createPreparedStatement(sql);
		try {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setEmail(rs.getString("email"));
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				listOfAllUsers.add(user);
			}

		} catch (SQLException e) {

		} finally {
			closeConnection();
		}
		return listOfAllUsers;
	}

}
