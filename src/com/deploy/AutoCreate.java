package com.deploy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dao.ConnectionFactory;


public class AutoCreate implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent sce) 
    { 
       
    }

    public void contextInitialized(ServletContextEvent sce)    
    { 
    	try
    	{
    	Connection con = ConnectionFactory.getConnection();
    	String sql ="create database myportfolio";
    	PreparedStatement pst = con.prepareStatement(sql);
    	int i = pst.executeUpdate();
    	System.out.println(i+" database creation");
    	
    	}
    	catch(Exception e)
    	{
    		System.out.println(e); 
    	}
    	finally
    	{
    		try
    		{
    		Connection con = ConnectionFactory.getConnection();
    		String sql = "create table myportfolio.admin"
    					+ "(username varchar(20), "
    					+ "password varchar(10))";
    		PreparedStatement pst = con.prepareStatement(sql);
    		int i = pst.executeUpdate();
    		System.out.println(i+" table  creation");
    		
    		}
    		catch(Exception e)        
    		{
    			System.out.println(e);
    		}
    		finally
    		{
    			try
    			{
    				
    				Connection con = ConnectionFactory.getConnection();
    				String test = "select * from myportfolio.admin";
    				PreparedStatement st = con.prepareStatement(test);
    				ResultSet rs = st.executeQuery();
    				
    				if(rs.next())
    				{
    					String sql ="update  myportfolio.admin set  username = ? , password=?";
    					PreparedStatement pst = con.prepareStatement(sql);
    					pst.setString(1, "lovekesh");
    					pst.setString(2, "lovekesh10");
    					int i = pst.executeUpdate();
    					
    					
    				}
    				else
    				{
    					String sql = "insert into myportfolio.admin values('lovekesh' , 'lovekesh10')";
    	        		PreparedStatement pst = con.prepareStatement(sql);
    	        		int i = pst.executeUpdate();
    				}
    				
    		
        		
        		
    			}
    			catch(Exception e)
    			{
    				System.out.println(e+" data insertion in admin ");
    			}
    			finally
    			{
    				try
    				{
    				Connection con = ConnectionFactory.getConnection();
    	    		String sql = "create table myportfolio.education"
    	    					+ "(year int, "
    	    					+ "title  varchar(50),"
    	    					+ "subtitle varchar(100),"
    	    					+ "description varchar(200))";
    	    		
    	    		
    	    		
    	    		PreparedStatement pst = con.prepareStatement(sql);
    	    		int i = pst.executeUpdate();
    	    		System.out.println(i+" table  creation");
    	    		
    				}
    				catch(Exception e)
    				{
    					System.out.println(e+" education table created ");
    				}
    				finally
    				{
    					try
    					{
    					Connection con = ConnectionFactory.getConnection();
        	    		String sql = "create table myportfolio.experience"
        	    					+ "(year int, "
        	    					+ "title  varchar(50),"
        	    					+ "subtitle varchar(100),"
        	    					+ "description varchar(200))";
        	    		
        	    		
        	    		
        	    		PreparedStatement pst = con.prepareStatement(sql);
        	    		int i = pst.executeUpdate();
        	    		System.out.println(i+" table  creation");
        	    		
    					}
    					catch(Exception e)
    					{
    						System.out.println(e+" from create  Experience");
    					}
    					finally
    					{
    						try
    						{
    						Connection con = ConnectionFactory.getConnection();
    	    	    		String sql = "create table myportfolio.message"
       	    	    					+ "(name  varchar(50),"
    	    	    					+ "email varchar(50),"
    	    	    					+ "message varchar(200))";
    	    	    		
    	    	    		
    	    	    		
    	    	    		PreparedStatement pst = con.prepareStatement(sql);
    	    	    		int i = pst.executeUpdate();
    	    	    		System.out.println(i+" table  creation");
    	    	    		
    	    	    		
    						}
    						catch(Exception e)
    						{
    							System.out.println(e+" from create message");
    						}
    						finally
    						{
    							
    						}
    					}
    				}
    			}
    		}
    	}
    }
	
}
