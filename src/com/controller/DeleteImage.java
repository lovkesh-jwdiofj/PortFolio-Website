package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Delete;


public class DeleteImage extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String filename = request.getParameter("filename");
		
		//dao
		Delete d = new Delete();
		int i = d.deleteImage(filename);
		
		if(i>=1)
		{
			response.sendRedirect("deleteimage.jsp");
			
		}else
		{
			response.sendRedirect("deleteimage.jsp");
		}
	}

}
