package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.User;
import com.util.DbUtil;

public class UserDao {
	public User userlogin(User user) {
		DbUtil dbUtil=new DbUtil();
		Connection connection;
		User daoUser = new User();
		try {
			connection = dbUtil.getCon();
			PreparedStatement ps=connection.prepareStatement("select * from t_user where userName="+user.getUserName());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				daoUser.setId(rs.getInt("id"));				
				daoUser.setUserName(rs.getString("userName"));
				daoUser.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return daoUser;
		
	}
}
