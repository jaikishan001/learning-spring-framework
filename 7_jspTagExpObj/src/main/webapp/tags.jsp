<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! //declaration tag  e.g declare on gobal variable when convert to servlet page --declare on class level

int a=10;
String name="jaikishan";  //variable declare

int square(){  //method declare
	return a*a;
}

%>

<%//embeded java code   declare on service method
out.println("a :"+a); 
out.println(square());
out.println("name: "+name);


int b=20;
if(b<100){
	out.println("b is smaller than 100");
}
else{
	out.println("b is grater");
}

for(int i=1; i<=5;i++){
	
	out.print(i);
}

//String name=request.getParameter("---");
%>


<%=  //instead of out.print we can direct use as -- declare on service method
name
%>
<%=square() %>			
<%=a%>

<%=Math.random() %>


</body>
</html>