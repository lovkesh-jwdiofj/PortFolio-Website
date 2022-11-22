package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Delete;


public class DeleteEducation extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String year = request.getParameter("year");
		
		//dao
		Delete d = new Delete();
		int i = d.deleteEducation(year);
		
		if(i==1)
		{
			response.sendRedirect("viewedu.jsp");
		}
		else
		{
			response.sendRedirect("viewedu.jsp");
		}
	}

}
