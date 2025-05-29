<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="erro.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int n1 = Integer.parseInt(request.getParameter("txtNum1"));
int n2 = Integer.parseInt(request.getParameter("txtNum2"));

int c = n1/n2;

out.write("Division ="+c);

out.write(request.getCharacterEncoding()+"<br>");
out.write(request.getContentLength()+"<br>");
out.write(request.getLocalAddr()+"<br>");
out.write(request.getLocalName()+"<br>");
out.write(request.getLocalPort()+"<br>");
out.write(request.getProtocol()+"<br>");
out.write(request.getRequestURI()+"<br>");
out.write(request.getServerName()+"<br>");
out.print(request.isSecure());
%>
</body>
</html>