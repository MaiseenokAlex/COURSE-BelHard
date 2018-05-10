package com.maiseenok.user_base.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maiseenok.user_base.model.User;

public class UserRepositoryImpl implements UserRepository{
	
	public static Connection getConnection(){
		Connection connection=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/final_test?useUnicode=true&characterEncoding=utf-8","root","root");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public List<User> getAllUsers(){
		Connection connection=getConnection();
		final String query="SELECT * FROM USERS";
		List<User> userList=new ArrayList<User>();
		
		try {
			Statement ps=connection.createStatement();
			ResultSet rs=ps.executeQuery(query);
			
			while(rs.next()) {
				User user=new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				userList.add(user);
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	public void updateUser(int id, String name) {
		Connection connection=getConnection();
		final String query="Update USERS set NAME = ?  where ID = ? ";
		
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.executeUpdate();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int id) {
		Connection connection=getConnection();
		final String query="Delete From USERS where id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
