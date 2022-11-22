package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Insert;


public class AddExp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int    year = Integer.parseInt(request.getParameter("year"));
		String title = request.getParameter("title");
		String subtitle = request.getParameter("subtitle");
		String description = request.getParameter("description");
		

		//dao
		Insert i = new Insert();
		String result = i.addExperience(year,title,subtitle,description); 
	    HttpSession session = request.getSession();	
	    
	    if(result.equals("saved")) 
	    {
	    	System.out.println("Experience added successfully");
	    	session.setAttribute("message","Experience added successfully");
	    	response.sendRedirect("admin.jsp");
	    }
	    else
	    {
	    	session.setAttribute("message","Something went wrong");
	    	response.sendRedirect("addedu.jsp");
	    }
		
		
	}

}
