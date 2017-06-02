<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
out.print("Welcome " + request.getParameter("uname"));

    String driver = application.getInitParameter("dname");
    out.print("driver name is " + driver);
%>
</body>
</html>
