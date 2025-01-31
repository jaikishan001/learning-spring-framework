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
	//in case of servlet first we have to create the object but we can directly some implicit(predefined) object in jsp
	String name="jaikishan";
	out.print(name);
	
	session.setAttribute("sesssion_name", "hello spring boot");
	%>
	<h2>hello : <%=name %></h2>
	
	
	<form action="output.jsp" method="post">
	<input type="text" name="name1" placeholder="enter name">
	<input type="submit" value="click me">
	
	
	</form>
</body>
</html>