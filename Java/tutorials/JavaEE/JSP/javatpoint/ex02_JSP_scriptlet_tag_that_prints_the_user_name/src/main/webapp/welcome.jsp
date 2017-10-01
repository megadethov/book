<%--
  Created by IntelliJ IDEA.
  User: mega
  Date: 24.04.2017
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    out.print("Welcome " + name);
%>
</body>
</html>
