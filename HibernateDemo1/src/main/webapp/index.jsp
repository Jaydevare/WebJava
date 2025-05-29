<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<h1><center>Student Form</center> </h1>
<a href="viewStudents.jsp">View Student</a>
<form action="addStudent.jsp" method="post">
<table border="3px" style="margin: auto; padding: 10px; border-radius: 5px">
<tr>
<td>Enter First Name</td>
<td><input type="text" name="firstname"></td>
</tr>
<tr>
<td>Enter Last Name</td>
<td><input type="text" name="lastname"></td>
</tr>
<tr>
<td>Enter Email-Id</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td></td>
<td><button type="submit">Submit</button></td>
</tr>
</table>
</form>
</body>
</html>