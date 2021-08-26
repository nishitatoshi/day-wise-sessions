package com.techment.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import java.sql.*;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("Name");  
String p=request.getParameter("Password");  
String e=request.getParameter("Email");  
String c=request.getParameter("Country");  
          
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userreg?autoReconnect=true&useSSL=false", "root", "123456");  
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into userreg values(?,?,?,?)");  
		  
		ps.setString(1,n);  
		ps.setString(2,p);  
		ps.setString(3,e);  
		ps.setString(4,c);  
		          
	 
		out.print("You are successfully registered...");  
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}


}
