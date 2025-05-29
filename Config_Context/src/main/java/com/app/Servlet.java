package com.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Servlet
 */

@WebServlet(urlPatterns = {"/serv1"},
	initParams = {
			@WebInitParam(name="UserName",value="Jay"),
			@WebInitParam(name="pwd",value="jay1234"),
			@WebInitParam(name="port",value="3306")
	}
		)
public class Servlet extends HttpServlet {
	private ServletConfig config;
	private String uname , pwd;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		ServletConfig ServletConfig = getServletConfig();
		uname = ServletConfig.getInitParameter("UserName");
		pwd = ServletConfig.getInitParameter(pwd);
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Enumeration<String> en = getInitParameterNames();
		while (en.hasMoreElements()) {
			String str = en.nextElement();
			pw.print(str+" "+getInitParameter(str)+"<br>");
			
		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
