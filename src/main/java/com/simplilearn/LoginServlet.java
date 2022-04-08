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


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pswd =request.getParameter("password");	
		
        //Hardcoded the Username and Password
		if(user.equals("shiva") && pswd.equals("123")) {
			RequestDispatcher rd=request.getRequestDispatcher("dashboard");
			request.setAttribute("user", user);
	        rd.forward(request, response); 
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("error");
		    rd.forward(request, response); 
		}
	}

}
