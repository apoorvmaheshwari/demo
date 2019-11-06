package com.math.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathServlet
 */
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		String sub="";
		String Out="";
		String Out1="";
		String Out2="";
		PrintWriter out=response.getWriter();
		
		
		int Output=0;
		num1=Integer.parseInt(request.getParameter("number1").trim());
		num2=Integer.parseInt(request.getParameter("number2").trim());
		sub=request.getParameter("b1");
		Out1="The NUMBER1 is: "+ num1;
		Out2="The NUMBER2 is: "+num2;
		out.println(Out1);
		out.println( Out2);
		
		
		if("add".contentEquals(sub)) {
			Output=num1+num2;
			 Out="The sum of numbers is: "+Output;
		}
		else if("subtract".contentEquals(sub)) {
			Output=num1-num2;
			 Out="The subraction of numbers is: "+Output;
		}
		else if("multiply".contentEquals(sub)) {
			Output=num1*num2;
			Out="The Multiplication of numbers is: "+Output;
		}else if("divide".contentEquals(sub)) {
			
			Output=num1/num2;
			Out="The division of number is: "+Output;
		}
		
		out.println(Out);
		
	}

}
