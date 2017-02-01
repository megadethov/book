<%--
Handler Page
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Page</title>
</head>
<body>
<h2>Hello page</h2>
<p><b>Hello: </b><%=request.getParameter("first_name")%> <%=request.getParameter("last_name")%></p>
</body>
</html>
