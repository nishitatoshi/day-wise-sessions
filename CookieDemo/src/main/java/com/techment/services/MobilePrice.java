package com.techment.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MobilePrice")
public class MobilePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int price = 40000;
		PrintWriter pw = response.getWriter();
		
		int quantity = Integer.parseInt(request.getParameter("mobile"));
		pw.print("you have selected "+quantity);
		double totalPrice=price*quantity;
		pw.print(" price "+totalPrice);
		String totPrice = String.valueOf(totalPrice);
		Cookie cookie = new Cookie("Mobile price",String.valueOf(totPrice));
		response.addCookie(cookie);
	}

}
