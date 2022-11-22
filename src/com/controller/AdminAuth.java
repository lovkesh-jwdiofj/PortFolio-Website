package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Read;


public class AdminAuth extends HttpServlet {
	
	static int count=0;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 HttpSession session = request.getSession(); 
		 
		
		
		//dao
		Read r = new Read();
		String result = r.adminAuth(username,password);   
		if(result.equals("exist"))
		{
			session.setAttribute("key","login");
			count=0;
			response.sendRedirect("admin.jsp");
			
		}
		else
		{
			count++;
			System.out.println(count);
			if(count>=3)
			 {
				count=0;
				response.sendRedirect("OverAttempt.jsp"); 
			 }
			else
			{
			response.sendRedirect("adminauth.jsp");
			}
		}
	}
	

}
