<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: mega
  Date: 01.02.2017
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Handler Page</title>
</head>
<body>
<h2>All request parameters</h2>
<table width="100%" border="1">
    <tr bgcolor="#deb887"><th>Name</th><th>Value</th></tr>
    <%
        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = (String) parameterNames.nextElement();
            out.print("<tr><td>" + name + "</td><td>" + request.getParameter(name) + "</td></tr>");
        }
    %>
</table>
</body>
</html>
