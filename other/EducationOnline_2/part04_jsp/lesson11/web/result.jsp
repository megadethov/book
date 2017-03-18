<%--
  Created by IntelliJ IDEA.
  User: mega
  Date: 18.01.2017
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
<h1>Status filter: ${sessionScope.get("status")}</h1>
<h1>Status filter: <%=session.getAttribute("status")%></h1>
</body>
</html>
