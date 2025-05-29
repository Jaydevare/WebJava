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
int i = StudentDAO.updateStudent(stud);
if(i>0)
{
	response.sendRedirect("viewStudents.jsp");
}
else
{
	out.write("Failed");
}

%>
</body>
</html>