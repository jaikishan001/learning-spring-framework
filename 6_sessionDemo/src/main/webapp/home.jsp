<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="profile.jsp">profile</a>
	<a href="aboutus.jsp">about-us</a>
	<a href="logout">logout</a>
	
	<%
	String myname=(String) session.getAttribute("name_key");
	
	%>
	<h3>welcome:<%=myname %> to your profile</h3>
</body>
</html>