package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.print("====calculation===<br>");
		String whichCalculation=request.getParameter("calculation");
		if(whichCalculation.equalsIgnoreCase("+"))
		{
			String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		int add=num1+num2;
		pw.println("sum is "+add);
		}
		else if(whichCalculation.equalsIgnoreCase("-"))
		{
			String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		int sub=num1-num2;
		pw.println("difference is "+sub);
		}
		else if(whichCalculation.equalsIgnoreCase("/"))
		{
			String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		int div=num1/num2;
		pw.println("quotient is "+div);
		}
		else if(whichCalculation.equalsIgnoreCase("*"))
		{
			String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		int mul=num1*num2;
		pw.println("product is "+mul);
		}
		else if(whichCalculation.equalsIgnoreCase("Largest num"))
		{
			String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		if(num1>num2)
			pw.println("largest is "+num1);
		else
			pw.println("largest is "+num2);


		}
	}

}
