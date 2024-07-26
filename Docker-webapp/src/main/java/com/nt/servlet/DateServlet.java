package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


 @WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//get PrintWriter	
	PrintWriter pw=res.getWriter();
	//set response content type
	res.setContentType("text/html");
	//write b.logic
	Date d=new Date();
	pw.println("<h1 style='color:red'>Date and Time::"+d+"</h1>");
	//add home hyperlink
	pw.println("<br><a href='index.jsp'>home</a>");
	pw.close();
	}
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
