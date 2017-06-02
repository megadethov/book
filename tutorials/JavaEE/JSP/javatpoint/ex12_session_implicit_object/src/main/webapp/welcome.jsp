<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    out.println("Welcome " + name);

    session.setAttribute("user", name);
%>
<a href="second.jsp">second jsp page</a>
</body>
</html>
