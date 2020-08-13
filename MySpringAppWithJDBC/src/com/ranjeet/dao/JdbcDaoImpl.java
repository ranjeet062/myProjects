package com.ranjeet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import com.ranjeet.model.Circle;
import com.ranjeet.model.User;

@Component
public class JdbcDaoImpl {

	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	private NamedParameterJdbcTemplate namedParamJdbcTemplate;
	
	private SimpleJdbcTemplate simpleJdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		//this.dataSource = dataSource;
		this.dataSource =dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	public User getUser(int id) {

		Connection conn = null;
		//jdbc related code
		//return executeJdbcRelatedCode(conn,id);
		
		// without jdbc code
		return executeWithoutJdbcRelatedCode(conn,id);

	}

	 public String getUserName(int id ){
		 String sql= "SELECT USER_NAME FROM USER_TABLE WHERE USER_ID= ?";
		// return jdbcTemplate.queryForObject(sql, new Object[] {id},String.class);
		 return (String) jdbcTemplate.queryForObject(sql, new Object[] {id},String.class);
	 }
	 
	 @SuppressWarnings("unchecked")
	public User getUserById(int id ){
		 String sql= "SELECT * FROM USER_TABLE WHERE USER_ID= ?";
		 return (User) jdbcTemplate.queryForObject(sql, new Object[] {id}, new UserMapper());
	 }
	 @SuppressWarnings("unchecked")
	public List<User> getListUser(){
		 String sql= "SELECT * FROM USER_TABLE";
		 return jdbcTemplate.query(sql,new UserMapper());
	 }
	 
	 public void insertUser(User user){
		 String sql = "INSERT INTO USER_TABLE(USER_NAME) VALUES (?)";
		 jdbcTemplate.update(sql, new Object[]{user.getUserName()});
	 }
	 
	 public void createCircleTable(){
		 String sql= "CREATE TABLE CIRCLE(ID INTEGER, NAME VARCHAR(50))";
		 jdbcTemplate.execute(sql);
	 }
	 public void insertToCircleTable(Circle circle){
		 String sql= "INSERT INTO CIRCLE (ID, NAME) VALUES (:id, :name)";
		 SqlParameterSource paramSource = new MapSqlParameterSource("id",circle.getId()).addValue("name", circle.getName());
		 namedParamJdbcTemplate.update(sql, paramSource);
	 }
	 
	 
	 private static final class UserMapper implements RowMapper{

		@Override
		public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			User user = new User();
			user.setId(resultSet.getInt("USER_ID"));
			user.setUserName(resultSet.getString("USER_NAME"));
			return user;
		}
		 
	 }
	private User executeWithoutJdbcRelatedCode (Connection conn, int id) {
		User user = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = null;
			ps = conn.prepareStatement("select * from USER_TABLE where User_id =?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User(id, rs.getString("USER_NAME"));
			}
			rs.close();
			ps.close();
			} catch (Exception e) {
				System.out.println(e);
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return user;
	}
	private User executeJdbcRelatedCode (Connection conn, int id) {

		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		User user = null;
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection("jdbc:sqlserver://in2npdvintmt02:1433;databaseName=MS_TEST_SSL","sa","Jda@1234");

			PreparedStatement ps = null;
			ps = conn.prepareStatement("select * from USER_TABLE where User_id =?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User(id, rs.getString("USER_NAME"));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
}
