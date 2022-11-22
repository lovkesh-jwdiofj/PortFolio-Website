package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.pojo.Education;
import com.pojo.Experience;
import com.pojo.Image;
import com.pojo.Message;
import com.pojo.Project;
import com.pojo.Resume;

public class Read {
	 private String res;
		public String adminAuth(String username, String password) {
			
			try {
				
				Connection con = ConnectionFactory.getConnection();
				String sql="select * from myportfolio.admin where username=? and password=?";
				PreparedStatement p = con.prepareStatement(sql);
				p.setString(1,username);
				p.setString(2, password);
				ResultSet rs = p.executeQuery();
				if(rs.next())
				{
					this.res="exist";
				}
				else
				{
					this.res="notexist";
				}
				
			} catch (Exception e) {
				System.out.println(e+" From Read");
				this.res="exp";
			}
			finally {
				return res;
			}
}
		
		
		
		public String getUsername()
		{
			String username=null;
			try
			{
			Connection con = ConnectionFactory.getConnection();
			String sql = "select * from myportfolio.admin ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
			 username = rs.getString(1);
			}
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
			
			return username;
			
		}
		
		
		
		
		
		public ArrayList<Education> readEdu()
		{
			ArrayList<Education> al = new ArrayList<Education>();
			try
			{
			Connection con = ConnectionFactory.getConnection();
			String sql ="select * from myportfolio.education ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				
				
				Education e = new Education();
				e.setYear(rs.getInt(1));
				e.setTitle(rs.getString(2));
				e.setSubtitle(rs.getString(3));
				e.setDescription(rs.getString(4));
		
				al.add(e);
				
			}
			
			
			}
			catch(Exception e)
			{
			System.out.println(e+" from Read education");	
			}
			finally
			{
				return al;
			}
		}
		
		
		
		
		
		
		public ArrayList<Experience> readExp()
		{
			ArrayList<Experience> al = new ArrayList<Experience>();
			try
			{
			Connection con = ConnectionFactory.getConnection();
			String sql ="select * from myportfolio.experience ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				
				
				Experience e = new Experience();
				e.setYear(rs.getInt(1));
				e.setTitle(rs.getString(2));
				e.setSubtitle(rs.getString(3));
				e.setDescription(rs.getString(4));
		
				al.add(e);
				
			}
			
			
			}
			catch(Exception e)
			{
			System.out.println(e+" from Read education");	
			}
			finally
			{
				return al;
			}
		}
		
		
		
		
		
		
		
		public ArrayList<Message> readMessage()
		{
			ArrayList<Message> al = new ArrayList<Message>();
			
			try
			{
			Connection con = ConnectionFactory.getConnection();
			String sql ="select * from myportfolio.message ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Message m = new Message();
				m.setName(rs.getString(1));
				m.setEmail(rs.getString(2));
				m.setMessage(rs.getString(3));
				
				al.add(m);
				
			}
				
			
			}
			catch(Exception e)
			{
				System.out.println(e+" from Read Message");
			}
			finally
			{
				return al;
			}
			
			
		}
		
		
	public 	ArrayList<Project> readProject()
		{
		ArrayList<Project> al = new ArrayList<Project>();
			
			try
			{
			Connection con = ConnectionFactory.getConnection();
			String sql ="select * from myportfolio.project ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Project p = new Project();
				p.setName(rs.getString("name"));
				p.setFilename(rs.getString("filename"));
				
				al.add(p);
				
			}
				
			
			}
			catch(Exception e)
			{
				System.out.println(e+" from Read Project");
			}
			finally
			{
				return al;
			}
			
			
			
		}
		
		
		
		public ArrayList<Resume> readResume()
		{
			ArrayList<Resume> al = new ArrayList<Resume>();
				
				try
				{
				Connection con = ConnectionFactory.getConnection();
				String sql ="select * from myportfolio.resume ";
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					Resume r = new Resume();
					r.setName(rs.getString("name"));
					r.setFilename(rs.getString("filename"));
					
					al.add(r);
					
				}
					
				
				}
				catch(Exception e)
				{
					System.out.println(e+" from Read Resume");
				}
				finally
				{
					return al;
				}
			}
		
		
		
		
		
		
		public ArrayList<Image> readImage()
		{

			ArrayList<Image> al = new ArrayList<Image>();
				
				try
				{
				Connection con = ConnectionFactory.getConnection();
				String sql ="select * from myportfolio.image ";
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					Image i = new Image();
					i.setName(rs.getString("name"));
					i.setFilename(rs.getString("filename"));
					
					al.add(i);
					
				}
					
				
				}
				catch(Exception e)
				{
					System.out.println(e+" from Read Image");
				}
				finally
				{
					return al;
				}
		}
		
}