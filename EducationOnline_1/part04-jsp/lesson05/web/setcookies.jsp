<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String login = request.getParameter("login");
    Cookie cookie = new Cookie("login", login);
    cookie.setMaxAge(365 * 24 * 60 * 60);
    response.addCookie(cookie);
%>
<html>
<head>
    <title>Set Cookies Page</title>
</head>
<body>
<a href="showcookies.jsp">show cookie</a>
</body>
</html>
