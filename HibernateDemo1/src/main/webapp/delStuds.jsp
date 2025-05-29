<%@page import="com.app.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 	int id  = Integer.parseInt(request.getParameter("id"));
	int i = StudentDAO.deleteStudent(id);
	if(i>0)
	{
		out.write("Student Deleted Succesfully");
		request.getRequestDispatcher("viewStudents.jsp").include(request, response);
	}
	else
	{
		out.write("Kya kar raha hai bhai!!!!");
	}
%>
</body>
</html>