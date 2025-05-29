<%@page import="com.app.dao.StudentDAO"%>
<%@page import="com.app.entity.Student"%>
<%@page import="java.util.List"%>
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
List<Student> list = StudentDAO.getAllStudents();
request.setAttribute("list", list);
%>

<table border="3px">
<tr>
<th>ID</th>
<th>Email</th>
<th>FirstName</th>
<th>LastName</th>
</tr>
<%
for(Student s:list)
{
%>
<tr>
<td><%= s.getId() %></td>
<td><%= s.getEmail() %></td>
<td><%= s.getFirstname() %></td>
<td><%= s.getLastname() %></td>
<td ><a href="editStudent.jsp?id=<%= s.getId()%>">EDIT</a></td>
<td ><a href="deleteStudent.jsp?id=<%= s.getId()%>">DELETE</a></td>
</tr>
<%
}
%>
</table>
</body>
</html>