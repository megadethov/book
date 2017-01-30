<%--
for loop example
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FOR</title>
</head>
<body>
<%! int fontSize; %>
<% for (fontSize = 1; fontSize <= 5; fontSize++) { %>
<font color="red" size="<%= fontSize%>">JSP Tutorial</font><br/>
<% } %>
</body>
</html>
