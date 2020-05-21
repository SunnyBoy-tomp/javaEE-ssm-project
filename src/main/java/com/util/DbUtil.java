package com.util;

import java.sql.Connection;
import java.sql.DriverManager;;



public class DbUtil {
	private String dbUrl = "jdbc:mysql://localhost/db_studentInfo?serverTimezone=UTC&characterEncoding=utf8";
	private String dbUserName = "root";
	private String dbPassWord = "password";
	private String jdbcName = "com.mysql.jdbc.Driver";
	//获取数据库连接
	public Connection getCon() throws Exception {
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
		return con;
	}
	//关闭数据库连接
	public void closeCon(Connection con) throws Exception{
		if (con!=null) {
			con.close();
		}
	}
}
