package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.Insert;

@MultipartConfig
public class AddResume extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		Part file = request.getPart("file");
		String filename = file.getSubmittedFileName();
		
		Insert i = new Insert();
		String result = i.addResume(name,filename);
		
		if(result.equals("saved"))
		{
		
			InputStream is = file.getInputStream();
			byte[] b =new byte [is.available()];
			String path = "C:\\Users\\Lovekesh\\eclipse-workspace\\My_Portfolio\\WebContent\\resume\\project"+File.separator+filename;
			//String path = request.getRealPath("resume/project")+File.separator+filename;
			FileOutputStream fos = new FileOutputStream(path);
			is.read(b);
			fos.write(b);
			
			response.sendRedirect("admin.jsp");
		}
		else
		{
			response.sendRedirect("addresume.jsp");
		}
		
	}

}
         