package com.yash.questionanswersimulation.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.questionanswersimulation.dao.QuestionDAO;
import com.yash.questionanswersimulation.model.Question;
import com.yash.questionanswersimulation.util.DBUtil;

public class QuestionDAOImpl extends DBUtil implements QuestionDAO {

	public boolean addQuestion(Question question) {
		String sql = "INSERT INTO questions(question, user_id) VALUES (?,?)";
		PreparedStatement pstmt = createPreparedStatement(sql);
		try {
			pstmt.setString(1, question.getQuestion());
			pstmt.setInt(2, question.getUser_id());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {

		} finally {
			closeConnection();
		}
		return false;
	}

	public List<Question> listQuestions() {
		String sql = "SELECT * FROM questions";
		List<Question> listAllQuestions = new ArrayList<Question>();
		PreparedStatement pstmt = createPreparedStatement(sql);
		try {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Question question = new Question();
				question.setId(rs.getInt("id"));
				question.setQuestion(rs.getString("question"));
				question.setUser_id(rs.getInt("user_id"));
				listAllQuestions.add(question);
			}
		} catch (SQLException e) {

		} finally {
			closeConnection();
		}
		return listAllQuestions;
	}

}
