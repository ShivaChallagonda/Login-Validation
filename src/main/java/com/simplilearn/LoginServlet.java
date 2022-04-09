package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pswd =request.getParameter("password");	
		
        //Hardcoded the Username and Password
		if(user.equals("shiva") && pswd.equals("123")) {
			HttpSession session =request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("dashboard.jsp");
		}
		else {
			
			response.sendRedirect("error.jsp");
		    
		}
	}

}
