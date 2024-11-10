<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font size = "6" color = "#330099">Method in JSP</font>
<br>
<%! int a = 5; %>

<%
out.println("Demo Program");
int k = 0; k = k+3;
System.out.println("Scriptlet");
session.setAttribute("usr","sera");
session.setMaxInactiveInterval(15);
%>

<%! int addNum(int n, int m)
{a = a+10; return m+n;}%>

Method return value <%= addNum (6,2) %>
<br>
a value <%= a %>
<br>
k value <%= k %>
<a herf = "helloworld.jsp"> >Click here </a>
</body>
</html>