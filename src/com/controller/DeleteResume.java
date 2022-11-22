package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Delete;

public class DeleteResume extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String filename = request.getParameter("filename");
		
		System.out.println(filename);
		
		//dao
		Delete d = new Delete();
		int i = d.deleteResume(filename);
		
		if(i==1)
		{
			response.sendRedirect("deleteresume.jsp");
		}
		else
		{
			response.sendRedirect("deleteresume.jsp");
		}
	}

}
