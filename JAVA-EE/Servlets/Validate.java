package com.org.MyServ;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection con;
	String fname,lname;
	boolean check(String email,String pass)
	{
		boolean st =false;
	    try{
	
		/* //loading drivers for mysql
	       Class.forName("com.mysql.jdbc.Driver");
	
		 //creating connection with the database 
	       Connection con=DriverManager.getConnection
	                      ("jdbc:mysql:/ /localhost:3306/User_DB","root","root");*/
	       PreparedStatement ps =con.prepareStatement
	                           ("select * from User_Data where email=? and password=?");
	       ps.setString(1,email);
	       ps.setString(2,pass);
	       ResultSet rs =ps.executeQuery();
	       /*fname=rs.getString(1);
	       lname=rs.getString(2);
	       System.out.println(fname+" "+lname);*/
	       st = rs.next();
	       fname=rs.getString(1);
	       lname=rs.getString(2);
	       //System.out.println(fname+" "+lname);
	       //con.close();
	    }catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	       return st; 
	}
    public Validate() throws ClassNotFoundException, SQLException {
        super();
        Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User_DB","root","root");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rsd;
		ResultSet rs;
		int i,ch;
		char ans;
		String query;
		boolean res1;
		//Validate v;
		
			//v=new Validate();
			String email=request.getParameter("email");
			String passwd=request.getParameter("pass");
			res1=check(email,passwd);
			if(res1==true)
			{
				pw.println("Welcome "+fname+" "+lname);
				rsd= request.getRequestDispatcher("Home.html");
				//rsd.forward(request,response);
			    rsd.include(request, response);
				//response.sendRedirect("http://localhost:8081/Shubhankar1EE/Home.html");
			}
			else
			{
				//response.sendError(response.SC_NOT_ACCEPTABLE,"Something went wrong.");
					pw.println("Email or password is incorrect.");
					rsd= request.getRequestDispatcher("lg.html");
					//rsd.forward(request,response);
			        rsd.include(request, response);
			}
			//con.close();
		
	}

}
