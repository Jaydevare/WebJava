<%@page import="com.app.dao.StudentDAO"%>
<%@page import="com.app.entity.Student"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello
<%
int id = Integer.parseInt(request.getParameter("id"));
Student s = StudentDAO.getStudentById(id);
%>

<form action="editStuds.jsp" method="post">
<input type="hidden" name="id" value="<%= s.getId() %>">
<table border="3px">
<tr>
<td>EMAIL</td>
<td><input type="email" name="email" value="<%= s.getEmail() %>"></td>
</tr>
<tr>
<td>FIRSTNAME</td>
<td><input type="text" name="firstname" value="<%= s.getFirstname() %>"></td>
</tr>
<tr>
<td>LASTNAME</td>
<td><input type="text" name="lastname" value="<%= s.getLastname() %>"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="EDIT"></td>
</tr>
</table>
</form>
</body>
</html>