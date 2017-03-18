<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
Date Formatting using SimpleDateFormat
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Format Date</title>
</head>
<body>
<center>
    <h1>Display Current Date & Time</h1>
</center>
<%
    Date dNow = new Date( );
    SimpleDateFormat ft =
            new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    out.print( "<h2 align=\"center\">" + ft.format(dNow) + "</h2>");
%>
</body>
</html>
