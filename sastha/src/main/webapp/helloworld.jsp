<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>

<%String x = "SREE SASTHA";Date d = new Date();%>
<%= x + "<br> "%><%= d.getMinutes() %>

</body>
</html>