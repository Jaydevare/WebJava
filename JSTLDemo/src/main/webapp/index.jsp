<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="100"/>
NUM = <c:out value="${num }"/>
<%-- <h1>Time on server : ${date() }</h1> --%>
<c:set var="A" value="69"/>
<c:set var="B" value="69"/>
<c:set var="Result" value="0"/>
Result = <c:out value="${A + B }"></c:out>
</body>
</html>