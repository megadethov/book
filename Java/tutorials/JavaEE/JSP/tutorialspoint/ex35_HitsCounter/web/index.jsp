<%--
Hits Count
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<%
    Integer hitsCount = (Integer) application.getAttribute("hitCounter");
    if (hitsCount == null || hitsCount == 0) {
        out.println("Welcome to my website!");
        hitsCount = 1;
    } else {
        /* return visit */
        out.println("Welcome back to my website!");
        hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
%>
<center>
    <p>Total number of visits: <%= hitsCount%></p>
</center>
</body>
</html>
