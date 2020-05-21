package com.util;

import java.sql.Connection;
import java.sql.DriverManager;;



public class DbUtil {
	private String dbUrl = "jdbc:mysql://localhost/db_studentInfo?serverTimezone=UTC&characterEncoding=utf8";
	private String dbUserName = "root";
	private String dbPassWord = "password";
	private String jdbcName = "com.mysql.jdbc.Driver";
	//��ȡ���ݿ�����
	public Connection getCon() throws Exception {
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
		return con;
	}
	//�ر����ݿ�����
	public void closeCon(Connection con) throws Exception{
		if (con!=null) {
			con.close();
		}
	}
}
