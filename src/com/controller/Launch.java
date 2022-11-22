package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.ConnectionFactory;

public class Launch {

	public static void main(String[] args) 
	{
//		Insert i = new Insert();
//		String result = i.saveImage("lovekesh", "lovekesh");
//		System.out.println(result);
				
		
		try
		{
		Connection con = ConnectionFactory.getConnection();
		String sql = "select * from myportfolio.image";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet
		rs = pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
