package com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Insert 
{
	private String result;
	public String  addEducation(int year, String title, String subtitle, String description)
	{
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="insert into myportfolio.education values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, year);
		pst.setString(2, title);
		pst.setString(3, subtitle);
		pst.setString(4, description);
		int i = pst.executeUpdate();
		
		if(i==1)
		{
			this.result="saved";
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e+" from the insert of educastion");
			this.result="exception";
		}
		finally
		{
			return result;
		}
		
		
		
		
	}
	public String addExperience(int year, String title, String subtitle, String description)
	{
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="insert into myportfolio.experience values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, year);
		pst.setString(2, title);
		pst.setString(3, subtitle);
		pst.setString(4, description);
		int i = pst.executeUpdate();
		
		if(i==1)
		{
			this.result="saved";
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e+" from the insert of educastion");
			this.result="exception";
		}
		finally
		{
			return result;
		}
		
		
		
		
		
		
	}
	public String saveMessage(String name, String email, String message) 
	{
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="insert into myportfolio.message values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, message);
		int i = pst.executeUpdate();
		
		if(i==1)
		{
			this.result="saved";
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e+" from the insert of message");
			this.result="exception";
		}
		finally
		{
			return result;
		}
		
		
	}
	
	
	
	public String addProject(String name, String filename)
	{
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="insert into myportfolio.project values (?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setString(2, filename);
		int i = pst.executeUpdate();
		
		if(i==1)
		{
			this.result="saved";
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e+" from the insert of project");
			this.result="exception";
		}
		finally
		{
			return result;
		}
	}
	
	
	
	
	
	
	public String addResume(String name, String filename) 
	{
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String test = "select * from myportfolio.resume";
		PreparedStatement st = con.prepareStatement(test);
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
		{
			String sql ="update  myportfolio.resume set  name = ? , filename=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, filename);
			int i = pst.executeUpdate();
			
			if(i>=1)
			{
				this.result="saved";
			}
		}
		else
		{
			String sql ="insert into myportfolio.resume values (?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, filename);
			int i = pst.executeUpdate();
			
			if(i>=1)
			{
				this.result="saved";
			}
		}
		
		

		}
		catch(Exception e)
		{
			System.out.println(e+" from the insert of resume");
			this.result="exception";
		}
		finally
		{
			return result;
		}
		
	
		
	}
	
	
	
	
	
	public String saveImage(String name, String filename) 
	{
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String test = "select * from myportfolio.image";
		PreparedStatement st = con.prepareStatement(test);
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
		{
			String sql ="update  myportfolio.image set  name = ? , filename=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, filename);
			int i = pst.executeUpdate();
			
			if(i>=1)
			{
				this.result="updated";
			}
		}
		else
		{
			String sql ="insert into myportfolio.image values (?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, filename);
			int i = pst.executeUpdate();
			
			if(i>=1)
			{
				this.result="saved";
			}
		}
		
		

		}
		catch(Exception e)
		{
			System.out.println(e+" from the insert of image");
			this.result="exception";
		}
		finally
		{
			return result;
		}
		
	}
}
