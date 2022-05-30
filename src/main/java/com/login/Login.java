package com.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.login.Dao.LoginDao;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		
		
		
		LoginDao dao= new LoginDao();
		
		try {
			if(dao.check(uname, pass)) {
				
				HttpSession session=request.getSession();
				session.setAttribute("username", uname);
				
				response.sendRedirect("welcome.jsp");
				
			}
			else {
				response.sendRedirect("login.jsp");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
