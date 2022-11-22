package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static  Connection  getConnection()
	{
		Connection con = null;
		try
		{
			/////// MySQL ////////////
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lovekesh","root","");
		 
//		 /////// Oracle  ////////////
//		 Class.forName("oracle.jdbc.driver.OracleDriver");  
//		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  

	
		}
		catch(Exception e)
		{
			System.out.println(e+" From Connection");
		}
		finally
		{
			return con;
		}
	}
	
	
	}



