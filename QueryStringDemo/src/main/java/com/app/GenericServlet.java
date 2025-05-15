package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GenericServlet
 */
@WebServlet("/serv2")
public class GenericServlet extends jakarta.servlet.GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see jakarta.servlet.GenericServlet#jakarta.servlet.GenericServlet()
     */
    public GenericServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("txtname");
		int age = Integer.parseInt(request.getParameter("txtage"));
		
		if(age>18)
		{
			pw.write("Eligible for voting  " +name);
		}
		else
		{
			pw.write("Not eligible for voting" + age);
		}
	}

}
