<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="todo.jsp">
Add New Work : <input type="text" name="theItem">
<input type="submit" value="ADD">
</form>

<% 
List<String> item = (List<String>)session.getAttribute("mytolist");
if(item == null)
{
	item = new ArrayList<String>();
	session.setAttribute("mytolist", item);
}

String theItem = request.getParameter("theItem");
if(theItem!="" && theItem!=null)
{
	item.add(theItem);
}
%>

<hr>

<b>To Do List</b>
<ol>
<%
for(String temp : item)
{
	out.print("<li>"+temp+"</li>");
}
%>
</ol>
</body>
</html>