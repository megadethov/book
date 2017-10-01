<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = (String) pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
    out.println("Hello " + name);
%>
</body>
</html>
