<%--
using while loop
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int fontSize=1; %>
<html>
<head>
    <title>WHILE</title>
</head>
<body>

<% while (fontSize <= 5) { %>
<font color="red" size="<%= fontSize%>">JSP Tutorial</font><br/>
<% fontSize++; %>
<% } %>

</body>
</html>
