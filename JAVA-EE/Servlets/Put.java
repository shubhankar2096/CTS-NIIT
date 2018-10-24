package com.org.MyServ;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.jdbc.ResultSetMetaData;

/**
 * Servlet implementation class Put
 */
@WebServlet("/Put")
public class Put extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @throws ClassNotFoundException 
     * @throws SQLException 
     * @see HttpServlet#HttpServlet()
     */
	int res;
	Connection con;
	Statement st;
	boolean res1;
	boolean connectDB(String fname,String lname,String epasswd,String cpasswd,String email,String gender) throws ClassNotFoundException, SQLException
	{
		/*Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User_DB","root","root");*/
		st=con.createStatement();
			/*if(epasswd!=cpasswd)
			{
				pw.println("Password not matched.");
			}*/
			//else
			//{
				String query="insert into User_Data values('"+fname+"','"+lname+"','"+email+"','"+epasswd+"','"+gender+"')";
				res=st.executeUpdate(query);
				//System.out.println("Data inserted successfully:"+res);
				if(res==1)
				{
					return true;
					//response.sendRedirect("http://localhost:8081/Shubhankar1EE/Home.html");
				}
				else
				{
					return false;
					//response.sendError(response.SC_NOT_ACCEPTABLE,"Something went wrong.");
				}
			//}
	}
    public Put() throws ClassNotFoundException, SQLException  {
        super();
        Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User_DB","root","root");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		RequestDispatcher rsd;
		ResultSet rs;
		int i,ch;
		char ans;
		String query;
		Put p;
		try {
			p = new Put();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String epasswd=request.getParameter("pass");
		String cpasswd=request.getParameter("pass1");
		String email=request.getParameter("email");
		String gender="N/A";
		gender= request.getParameter("gender");
		String[] checkedIds=request.getParameterValues("checkedRows");
		/*String selected_gender=(gender.equals("Male")?"Male":gender.equals("Female")?"Female":gender.equals("Other")?"Other":"N/A");*/
		//System.out.println("Gender is:"+gender);
			res1=p.connectDB(fname, lname, epasswd, cpasswd, email,gender);
			//System.out.println("Data inserted successfully:"+res1);
			if(res1==true)
			{
				response.sendRedirect("http://localhost:8081/Shubhankar1EE/LogIn.html");
			}
			else
			{
				//response.sendError(response.SC_NOT_ACCEPTABLE,"Something went wrong.");
					pw.println("Somwthing Went Wrong. Please Try Again.");
					rsd= request.getRequestDispatcher("SignUp.html");
		            rsd.include(request, response);
			}
			con.close();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
