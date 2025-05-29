package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.zone.ZoneRulesException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");//MIME Type
		PrintWriter pw = response.getWriter();
		
		/**String uname = request.getParameter("txtUserName");
		String pwd = request.getParameter("txtPAssword");
		
		if((uname.equals("admin"))&& (pwd.equals("admin123")))
		{
			pw.write("<h1>Login Sucessfull</h1>"+uname);
		}
		else
		{
			pw.write("<h1> Invalid Username and password </h1>");
		}*/
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String name = request.getParameter("maths");
		int res=0;
		
		if(name.equals("add"))
		{
			res = num1+num2;
			pw.print(res);
		}
		else if(name.equals("sub"))
		{
			res = num1-num2;
			pw.print(res);
		}
		else if(name.equals("mul"))
		{
			res = num1*num2;
			pw.print(res);
		}
		else if(name.equals("div"))
		{
			if(num2==0) {
				pw.write("<br>cannot divide by zero......<br>");
			}
			else
			{
				res = num1/num2;
				pw.print(res);
			}
		}
		
		/**int res = num1+num2;
		res = num1-num2;
		res = num1*num2;
		
		if(num2 == 0)
		{
			pw.write("Cannot Divide by zero");
		}
		else
			res = num1/num2;
		
		pw.println(res);*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
