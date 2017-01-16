<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page</title>
</head>
<body>
<%
    String login = request.getParameter("login");
    String password = request.getParameter("password");
    String enter = request.getParameter("enter");
    String register = request.getParameter("register");
%>

<p><font color="green">Login: <%=login%></font></p>
<p><font color="red">Password: <%=password%></font></p>
<p><font color="green">Button login: <%=enter%></font></p>
<p><font color="red">Batton password: <%=register%></font></p>

</body>
</html>
