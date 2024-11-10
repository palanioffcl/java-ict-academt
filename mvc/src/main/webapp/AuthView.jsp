<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form method="post" action="authController">
UserName:<input type=text required name=username>
<br>
Password:<input type=password required name=password>
<br>
<br>
<input type=Submit value=Submit >
<input type=reset value=Clear>
</form>
<a href="ViewData.jsp">View Data</a>
</body>
</html>