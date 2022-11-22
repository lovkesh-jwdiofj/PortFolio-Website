package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.dao.*;


public class DeleteMessage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email = request.getParameter("email");
		
		//dao
		Delete d = new Delete();
		int i = d.deleteMessage(email);
		
		if(i>=1)
		{
			response.sendRedirect("allmessage.jsp");
		}
		else
		{
			response.sendRedirect("allmessage.jsp");
		}
	}

}
       