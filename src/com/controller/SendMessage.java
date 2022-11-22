package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Insert;


public class SendMessage extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		HttpSession session = request.getSession();
		
		
		//dao
		Insert i = new Insert();
		String result = i.saveMessage(name,email,message);
		
		if(result.equals("saved"))
		{
			session.setAttribute("message", "Message sent successfully");
			response.sendRedirect("index.jsp");
		}
		
		
	}

}
