<%@ page import="java.util.Date" %><%--
This is very easy to get current date and time in JSP program.
You can use a simple Date object with toString() method to print current date
and time as follows:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Current Date & Time</title>
</head>
<body>
<center>
    <h1>Display Current Date & Time</h1>
</center>
<%
    Date date = new Date();
    out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");
%>
<a href="format_date.jsp">SimpleDateFormat</a>
</body>
</html>
