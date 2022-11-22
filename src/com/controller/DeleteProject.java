package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Delete;
import com.mysql.cj.result.Field;


public class DeleteProject extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String filename = request.getParameter("filename");
		
		Delete d = new Delete();
		int i = d.deleteProject(filename);
		
		if(i>=i)
		{
			response.sendRedirect("allproject.jsp");
		}
		else
		{
			response.sendRedirect("allproject.jsp");
		}
	}

}
      