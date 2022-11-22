package com.deploy;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dao.ConnectionFactory;


public class AutoCreate2 implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce) 
    { 

		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql = "create table myportfolio.project"
					+ "(name varchar(50), "
					+ "filename  varchar(50))";
					
		
		
		
		PreparedStatement pst = con.prepareStatement(sql);
		int i = pst.executeUpdate();
		System.out.println(i+" table  creation");
		
		}
		catch(Exception e)
		{
			System.out.println(e+" from create  project");
		}
		finally
		{
			try
			{
			Connection con = ConnectionFactory.getConnection();
			String sql = "create table myportfolio.resume"
						+ "(name varchar(50), "
						+ "filename  varchar(50))";
						
			
			
			
			PreparedStatement pst = con.prepareStatement(sql);
			int i = pst.executeUpdate();
			System.out.println(i+" table  creation");
			
			}
			catch(Exception e)
			{
				System.out.println(e+" from create  resume");
			}
			finally
			{

				try
				{
				Connection con = ConnectionFactory.getConnection();
				String sql = "create table myportfolio.image"
							+ "(name varchar(50), "
							+ "filename  varchar(50))";
							
				
				
				
				PreparedStatement pst = con.prepareStatement(sql);
				int i = pst.executeUpdate();
				System.out.println(i+" table  creation");
				
				}
				catch(Exception e)
				{
					System.out.println(e+" from create  image");
				}
			}
		}
    }
	
}
