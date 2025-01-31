<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<%
	String myname=(String) request.getAttribute("name_key");//it will return object so will store in string variable
	%>
	<h3>hello welcome to your profile: <%=myname %></h3>
</body>
</html>