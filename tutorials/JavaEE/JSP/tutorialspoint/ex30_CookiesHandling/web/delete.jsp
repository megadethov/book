<%--
Delete cookies
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Page</title>
</head>
<body>
<h2>Delete cookies</h2>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies) {
        if (c.getName().equals("first_name") | c.getName().equals("last_name")) {
            c.setMaxAge(0);
            response.addCookie(c);
        }
    }
%>
<a href="read.jsp">read cookies</a>
</body>
</html>
