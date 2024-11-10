<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Bean :)</title>
</head>
<body>

<jsp:useBean id="MB" class="com.mybean.Login">
<jsp:setProperty name="MB" property="*"/>
</jsp:useBean>
<jsp:getProperty name="MB" property="user"/>
<jsp:getProperty name="MB" property="pass"/>
</body>
</html>