package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Delete;


public class DeleteExperience extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String title = request.getParameter("title");
		
		
		//dao
		Delete d = new Delete();
		int i = d.deleteExperience(title);
		
		if(i==1)
		{
			response.sendRedirect("viewexp.jsp");
		}
		else
		{
			response.sendRedirect("viewexp.jsp");
		}
	}

}
       