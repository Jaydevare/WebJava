<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css"> .error {color: red;}</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><em>Fill the Form "*" means Compulsory</em></h1>
<br><br>
<form:form action="processForm" modelAttribute="customer">
Enter First Name: <form:input path="firstName"/>
<br><br>
Enter last Name: <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
Enter Email: <form:input path="email"/>
<br><br>
<input type="submit" value="REGISTER">
</form:form>
</body>
</html>