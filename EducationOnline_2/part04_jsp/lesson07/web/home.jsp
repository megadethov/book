<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
HOME PAGE </br>
<%
    out.println("status: " + request.getAttribute("status"));
    out.println("attribute A: " + request.getAttribute("atrA"));
//    out.println("attribute B: " + request.getAttribute("atrB"));
%>
attribute B: <%= request.getAttribute("atrB")%>
</body>
</html>
