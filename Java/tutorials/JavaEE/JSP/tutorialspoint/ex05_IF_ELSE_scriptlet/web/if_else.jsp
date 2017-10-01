<%--
The if...else block starts out like an ordinary Scriptlet,
but the Scriptlet is closed at each line with HTML text
included between Scriptlet tags.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IF...ELSE</title>
</head>
<body>
<%! int day = 3; %>
<% if (day == 1 | day == 7) { %>
<p> Today is weekend</p>
<% } else { %>
<p> Today is not weekend</p>
<% } %>
</body>
</html>
