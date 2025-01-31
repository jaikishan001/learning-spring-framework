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
String myname=request.getParameter("name1");
out.println(myname);

//String cname=(String) session.getAttribute("sesssion_name");
out.println(session.getAttribute("sesssion_name"));



//these are 9 implicit objects out,request,response,session,config,application,pageContext,page,exception
%>

</body>
</html>