<%
    String str = request.getParameter("textinput");
    session.setAttribute("textin", str);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setsession Page</title>
</head>
<body>
<a href="showsession.jsp">Show session parameter</a>
</body>
</html>
