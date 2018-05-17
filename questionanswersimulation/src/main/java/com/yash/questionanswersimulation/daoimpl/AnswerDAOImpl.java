package com.yash.questionanswersimulation.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.questionanswersimulation.dao.AnswerDAO;
import com.yash.questionanswersimulation.model.Answer;
import com.yash.questionanswersimulation.util.DBUtil;

public class AnswerDAOImpl extends DBUtil implements AnswerDAO {

	public boolean addAnswer(Answer answer) {
		String sql = "INSERT INTO answers(answer, question_id, user_id) VALUES (?,?,?)";
		PreparedStatement pstmt = createPreparedStatement(sql);
		try {
			pstmt.setString(1, answer.getAnswer());
			pstmt.setInt(2, answer.getQuestion_id());
			pstmt.setInt(3, answer.getUser_id());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
		} finally {
			closeConnection();
		}
		return false;
	}

	public List<Answer> listAnswers() {
		String sql = "SELECT * FROM answers";
		PreparedStatement pstmt = createPreparedStatement(sql);
		List<Answer> listAllAnswer = new ArrayList<Answer>();
		try {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Answer answer = new Answer();
				answer.setId(rs.getInt("id"));
				answer.setAnswer(rs.getString("answer"));
				answer.setQuestion_id(rs.getInt("question_id"));
				answer.setUser_id(rs.getInt("user_id"));
				listAllAnswer.add(answer);
			}
		} catch (SQLException e) {

		} finally {
			closeConnection();
		}
		return listAllAnswer;
	}

}
