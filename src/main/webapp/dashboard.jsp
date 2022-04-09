<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard</title>
</head>
<body>
<div align="center">

	Welcome <%=" "+session.getAttribute("user")%>
	<br/>
	
	<%= "You have Successfully Logged in" %>
	
	<br/>
	<a href="./LogOutServlet">Logout</a>
</div>
</body>
</html>