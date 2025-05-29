<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.*,com.app.entity.*"%>
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
<form action="delStuds.jsp" method="post">
<input type="hidden" name="id" value="<%= s.getId() %>">
<table border="3px">
<tr>
<td>EMAIL</td>
<td><input type="email" name="email" value="<%= s.getEmail() %>" readonly="readonly"></td>
</tr>
<tr>
<td>FIRSTNAME</td>
<td><input type="text" name="firstname" value="<%= s.getFirstname() %>" readonly="readonly"></td>
</tr>
<tr>
<td>LASTNAME</td>
<td><input type="text" name="lastname" value="<%= s.getLastname() %>" readonly="readonly"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="DELETE"></td>
</tr>
</table>
</form>
</body>
</html>