<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"/>

<!-- param.thelocale - Read the Locale Param sent by link 
pageContent.request.locale - Read the locale sent by browser HTTP request -->
<fmt:setLocale value="${theLocale }"/>
<fmt:setBundle basename="com.app.tagdemo.i18n.resources.mylabels"/>
</head>

<body>
<a href="inter.jsp?theLocale=en_US">English(US)</a>
|
<a href="inter.jsp?theLocale=es_ES">Spanish(ES)</a>
|
<a href="inter.jsp?theLocale=de_DE">German(DE)</a>
|
<a href="inter.jsp?theLocale=mr_IN">Marathi(IN)</a>

<hr>
<c:set var="name" value="${param.txtName }" />
<c:set var="lname" value="${param.txtLName }" />

<fmt:message key = "label.greeting"/><br>
<fmt:message key = "label.firstname"/> <i>${name }</i> <br>
<fmt:message key = "label.lastname"/> <i>${lname } </i> <br>
<fmt:message key = "label.welcome"/>

<hr>

Selected Locale : ${theLocale }
</body>
</html>