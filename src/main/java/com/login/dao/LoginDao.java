package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/db";
	String username = "hk";
	String password = "1234567890MySQL";
	String query = "Select * from loginForm where uname = ? and pass = ?";
	public boolean check(String uname, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(0, uname);
			st.setString(1, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
