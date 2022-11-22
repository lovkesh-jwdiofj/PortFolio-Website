package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {

	public int deleteMessage(String email)
	{
		int i=0;
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="delete from myportfolio.message where email=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, email);
		 i = pst.executeUpdate();
		
		System.out.println(i);
		
		
		}
		catch(Exception e )
		{
			System.out.println(e+" from delete message");
		}
		finally
		{
			return i;
		}
	}
	
	
	
	
	
	

	public int deleteProject(String filename) 
	{
		int i=0;
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="delete from myportfolio.project where filename=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, filename);
		 i = pst.executeUpdate();
		
		System.out.println(i);
		
		
		}
		catch(Exception e )
		{
			System.out.println(e+" from delete message");
		}
		finally
		{
			return i;
		}
		
	}







	public int deleteResume(String filename) 
	{
		int i=0;
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="delete from myportfolio.resume where filename=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, filename);
		 i = pst.executeUpdate();
		 
		
		System.out.println(i);
		
		
		}
		catch(Exception e )
		{
			System.out.println(e+" from delete resume");
		}
		finally
		{
			return i;
		}
		
	}







	public int deleteImage(String filename) 
	{
		int i=0;
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="delete from myportfolio.image where filename=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, filename);
		 i = pst.executeUpdate();
		 
		
		System.out.println(i);
		
		
		}
		catch(Exception e )
		{
			System.out.println(e+" from delete image");
		}
		finally
		{
			return i;
		}
		
	}







	public int deleteEducation(String year)
	{
		int i=0;
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="delete from myportfolio.education where year=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, year);
		 i = pst.executeUpdate();
		 
		
		System.out.println(i);
		
		
		}
		catch(Exception e )
		{
			System.out.println(e+" from delete education");
		}
		finally
		{
			return i;
		}
		
	}







	public int deleteExperience(String title)
	{
		
		int i=0;
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql ="delete from myportfolio.experience where title=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, title);
		 i = pst.executeUpdate();
		 
		
		System.out.println(i);
		
		
		}
		catch(Exception e )
		{
			System.out.println(e+" from delete experience");
		}
		finally
		{
			return i;
		}
	}
	
	
	
	

}
