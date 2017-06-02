<%--
Methods to Set HTTP Status Code
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Http Status Codes</title>
</head>
<body>
<%
    // Set error code and reason.
    response.sendError(407, "Need authentication!!!");
%>
</body>
</html>
