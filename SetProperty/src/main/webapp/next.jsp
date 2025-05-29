<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="com.app.bean.Student">
<!-- Student s = new Student() -->
<jsp:setProperty property="*" name="s"/>
Student Details:<br>
FirstName:<jsp:getProperty property="firstName" name="s"/><br>
LastName:<jsp:getProperty property="lastName" name="s"/><br>
Email:<jsp:getProperty property="email" name="s"/>
</jsp:useBean>
</body>
</html>