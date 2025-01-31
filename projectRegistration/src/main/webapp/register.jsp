<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>



<body>
<form action="regform" method="post">
Name:<input type="text" name="name1" required><br/><br/>
Email:<input type="text" name="email1"><br/><br/>
Password:<input type="password" name="pass1"><br/><br/>
Gender:<input type="radio" name="gender1" value="male">male<input type="radio" name="gender1" value="female">female<br/><br/>
City:<select name="city1">
<option>Select city</option>
<option>mumbai</option>
<option>banglore</option>
<option>hydrabad</option>
<option>delhi</option>
</select><br/><br/>   

<input type="submit" value="register"><br><br>
<!--  ><button type="button" name="login">already registered ? login here</button> -->



</form>
</body>
</html>