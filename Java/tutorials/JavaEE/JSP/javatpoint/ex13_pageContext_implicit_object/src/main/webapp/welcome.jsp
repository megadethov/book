<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    out.println("Welcome " + name);

    pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);
%>
<br/>
<a href="second.jsp">second jsp page</a>
</body>
</html>
