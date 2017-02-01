<%--
read cookies
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read cookies</title>
</head>
<body>
<h2>Read cookies: </h2>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies) {
        if (c.getName().equals("first_name") | c.getName().equals("last_name")) {
            out.println(c.getName() + " = " + c.getValue() + "<br/>");
        }
    }

%>
</body>
</html>
