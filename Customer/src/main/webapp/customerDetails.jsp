<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>FirstName</th><th>LastName</th><th>EMAIL</th><th>Status</th>
</tr>
<c:forEach var ="temp" items="${list }">
<c:if test="${temp.status }">
<tr>
<td>${temp.firstName }</td>
<td>${temp.lastName }</td>
<td>${temp.email }</td>
<td>${temp.status }</td>
</tr>
</c:if>
</c:forEach>
</table>
</body>
</html>