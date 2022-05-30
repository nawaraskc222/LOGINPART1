package com.login.Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class LoginDao {
	
	public String sql="select *from login where uname=? and pass=?;";
	
	public boolean check(String uname,String pass) {
		
		
		
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/naw","root","rootpassword");
			
//	    	Statement st= c1.createStatement();
			PreparedStatement st=c1.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
		 
			ResultSet rs= st.executeQuery();
			
			if(!rs.next()) {
				return false;
			}
			
			
			
			
			
			
		}catch(Exception e) {
			
		}
		return true;
	
			
		
	}
	}


