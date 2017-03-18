<%--
  Created by IntelliJ IDEA.
  User: mega
  Date: 18.01.2017
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result page</title>
</head>
<body>
Result page <br>
<%
   String str = (String) request.getSession().getAttribute("attribute1");
   out.println("session value from scriptlet: " + str);
%>
<br>
<h2>session value from EL:  ${sessionScope.get("attribute1")}</h2>
</body>
</html>
