<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP demo</title>
</head>
<body>
<h1>The first 5 square:</h1>
<%
    for (int i = 1; i <= 5; i++) {
        out.print(i * i);
    }
%>
</body>
</html>
