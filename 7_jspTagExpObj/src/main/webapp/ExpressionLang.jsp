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
	request.setAttribute("request_name","kishan yadav"); //direct use implicit object no need to initialize
	//out.print(request.getAttribute("request_name")); //instead we can use EL ${--}
	
	session.setAttribute("name_key","kishan");  //session me direct key value fetch krneka
	%>
	
	<h3>hello: ${requestScope.request_name }</h3>
	<h4>from session : ${name_key}</h4>
	<p>${5+66 }</p>
</body>
</html>