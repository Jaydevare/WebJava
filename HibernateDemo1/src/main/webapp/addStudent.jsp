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
<jsp:useBean id="stud" class="com.app.entity.Student"></jsp:useBean>
<jsp:setProperty property="*" name="stud"/>

<%
 int id = StudentDAO.saveStudent(stud);

if(id>0)
{
	out.write("Student Entered Succesfully");
	request.getRequestDispatcher("index.jsp").include(request, response);
}
else
{
	out.write("Student Entery unsuccesfull");
	request.getRequestDispatcher("index.jsp").include(request, response);
}

%>
</body>
</html>